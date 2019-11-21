package org.opencps.cache.actions.impl;

import com.liferay.portal.kernel.cache.MultiVMPoolUtil;
import com.liferay.portal.kernel.cache.PortalCache;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import java.io.Serializable;

import org.opencps.cache.actions.CacheActions;

public class CacheActionsImpl implements CacheActions{

	private static final Log _log = LogFactoryUtil.getLog(CacheActionsImpl.class);

	@Override
	public void clearCache(String cacheName) throws PortalException {
		_log.debug("START Liferay Cache: Clearing cache. CacheName = " + cacheName);
		//CacheLocalServiceUtil.clearCache(cacheName);
		if (Validator.isNotNull(cacheName)) {
			try {
				//System.out.println("Liferay Cache: Clearing cache. CacheName = " + cacheName);
				PortalCache<Serializable, Serializable> cache = MultiVMPoolUtil.getPortalCache(cacheName);
				cache.removeAll();
			} catch (Exception ex) {
				_log.debug(ex);
				_log.error("CacheName = " + cacheName + " : Error clearing the cache. Error = " + ex.getMessage());
			}
		} else {
			_log.debug("CacheName = " + cacheName + " : Error clearing the cache. = ");
		}

	}

	@Override
	public Serializable getFromCache(String cacheName, Serializable key) throws PortalException {
		_log.debug("START Liferay Cache: Fetching from cache. CacheName = " + cacheName + ", Key = " + key);

		PortalCache<Serializable, Serializable> cache = MultiVMPoolUtil.getPortalCache(cacheName);

		return cache.get(key);
	}

	@Override
	public void addToCache(String cacheName, Serializable key, Serializable value, int ttl) {
		PortalCache<Serializable, Serializable> cache = MultiVMPoolUtil.getPortalCache(cacheName);
		cache.put(key, value, ttl);
	}

}
