package org.opencps.communication.action.impl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.List;

import org.opencps.communication.action.NotificationQueueInterface;
import org.opencps.communication.constants.SendSMSTerm;
import org.opencps.communication.model.NotificationQueue;
import org.opencps.communication.service.NotificationQueueLocalServiceUtil;

public class NotificationQueueActions implements NotificationQueueInterface {

	@Override
	public JSONObject getNotificationQueues(ServiceContext serviceContext) {
		JSONObject result = JSONFactoryUtil.createJSONObject();

		List<NotificationQueue> listQueue = NotificationQueueLocalServiceUtil.getNotificationQueues(QueryUtil.ALL_POS,
				QueryUtil.ALL_POS);

		result.put(SendSMSTerm.DATA, listQueue);

		result.put(SendSMSTerm.TOTAL, listQueue.size());

		return result;
	}

	@Override
	public NotificationQueue read(long notificationQueueId, ServiceContext serviceContext) {
		NotificationQueue notificationQueue = NotificationQueueLocalServiceUtil
				.fetchNotificationQueue(notificationQueueId);

		return notificationQueue;
	}

}
