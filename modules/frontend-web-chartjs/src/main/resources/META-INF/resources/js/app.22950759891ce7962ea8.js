webpackJsonp([5],{174:function(t,e,n){"use strict";n.d(e,"a",function(){return l});var o=n(205),i=n.n(o),a=n(60),r=n.n(a),u=n(450),c=n(183),s=n.n(c),d=n(452),p=n.n(d);r.a.use(u.a);var l=new u.a.Store({state:{initData:null,agencyGroups:null,loading:!1,index:0},actions:{loadInitResource:function(t){var e=t.commit,n=t.state;return null==n.initData?new i.a(function(t,n){var o={},i=window.location.href,a=window.location.href.lastIndexOf("#/");a>0&&(i=window.location.href.substr(0,a)),s.a.get(i+p.a.renderURLInit,o).then(function(n){var o=n.data;e("setInitData",o),t(o)}).catch(function(t){console.log(t),n(t)})}):new i.a(function(t,e){t(n.initData)})},getAgencyReportLists:function(t,e){var n=(t.commit,t.state);return new i.a(function(t,o){l.dispatch("loadInitResource").then(function(i){var a={headers:{groupId:n.initData.groupId,Accept:"application/json"},params:{year:e.year,month:e.month,group:e.group,reporting:!1,domain:"total",agency:e.agency}};s.a.get("/o/rest/statistics",a).then(function(e){var n=e.data;if(n.data){var o=n.data;t(o)}else t(null)}).catch(function(t){console.log(t),o(t)})})})},getAgencyGroups:function(t,e){var n=t.commit,o=t.state;return null==o.agencyGroups?new i.a(function(t,e){l.dispatch("loadInitResource").then(function(i){var a={headers:{groupId:o.initData.groupId}};s.a.get("/o/rest/v2/dictcollections/GOVERNMENT_AGENCY/dictgroups",a).then(function(e){var o=e.data;if(o.data){var i=o.data;n("setAgencyGroups",i),t(i)}else t(null)}).catch(function(t){console.log(t),e(t)})})}):new i.a(function(t,e){t(o.agencyGroups)})}},mutations:{setLoading:function(t,e){t.loading=e},setMenuConfigToDo:function(t,e){t.trangThaiHoSoList=e},setIndex:function(t,e){t.index=e},setInitData:function(t,e){t.initData=e},setAgencyGroups:function(t,e){t.agencyGroups=e}},getters:{loading:function(t){return t.loading},index:function(t){return t.index},loadingMenuConfigToDo:function(t){return p.a.trangThaiHoSoList}}})},176:function(t,e){},177:function(t,e){},178:function(t,e){},180:function(t,e,n){var o=n(182)(n(202),n(447),null,null);t.exports=o.exports},201:function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var o=n(177),i=(n.n(o),n(176)),a=(n.n(i),n(178)),r=(n.n(a),n(60)),u=n.n(r),c=n(180),s=n.n(c),d=n(80),p=n(181),l=n.n(p),f=n(174),g=n(179),v=n(175);n.n(v);u.a.use(g.default),u.a.use(l.a),u.a.config.productionTip=!1,new u.a({el:"#app",router:d.a,store:f.a,render:function(t){return t(s.a)}})},202:function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var o=n(80);e.default={data:function(){return{isCallBack:!0}},computed:{currentIndex:function(){return this.$store.getters.index}},created:function(){this.$nextTick(function(){})},updated:function(){var t=this;t.$nextTick(function(){var e=t.$router.history.current.params,n=t.$router.history.current.query;if(t.isCallBack){t.isCallBack=!1;var i=0;e.hasOwnProperty("index")&&(i=e.index),o.a.push({path:"/bao-cao/"+i,query:n})}})},watch:{$route:function(t,e){t.params,t.query}},methods:{toTableIndexing:function(t,e){this.$store.commit("setIndex",e),o.a.push({path:"/bao-cao/"+e,query:{renew:Math.floor(100*Math.random())+1,q:t.queryParams}})},filterSteps:function(t){}}}},443:function(t,e){},447:function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("v-app",[n("v-content",[n("router-view")],1)],1)},staticRenderFns:[]}},451:function(t,e,n){function o(t){var e=i[t];return e?n.e(e[1]).then(function(){return n(e[0])}):Promise.reject(new Error("Cannot find module '"+t+"'."))}var i={"./BarChartReport.vue":[453,2],"./Landing.vue":[455,0],"./NotFound.vue":[456,3],"./PieChartReport.vue":[454,1]};o.keys=function(){return Object.keys(i)},t.exports=o,o.id=451},452:function(t,e){t.exports={renderURLInit:"?p_p_id=FrontendWebChartjs&p_p_lifecycle=2&p_p_state=exclusive&p_p_mode=view&p_p_resource_id=renderURLInit",trangThaiHoSoList:[{code:"0",active:!1,type:"thong_ke",title:"TÌNH HÌNH GIẢI QUYẾT TTHC"},{code:"1",active:!1,type:"dossier",title:"TỔNG HỢP TIẾP NHẬN HỒ SƠ"},{code:"2",active:!1,type:"dossier",title:"CHI TIẾT TIẾP NHẬN HỒ SƠ"},{code:"3",active:!1,type:"dossier",title:"TỔNG HỢP TRẢ KẾT QUẢ"},{code:"4",active:!1,type:"dossier",title:"CHI TIẾT TRẢ KẾT QUẢ"},{code:"5",active:!1,type:"thong_ke",title:"TỔNG HỢP HỒ SƠ DVC MỨC ĐỘ 3"},{code:"6",active:!1,type:"tai_chinh",title:"TỔNG HỢP PHÍ, LỆ PHÍ"},{code:"7",active:!1,type:"tai_chinh",title:"TỔNG HỢP PHÍ, LỆ PHÍ THEO TTHC"},{code:"8",active:!1,type:"dossier",title:"CHI TIẾT HỒ SƠ ĐÃ GIẢI QUYẾT"},{code:"9",active:!1,type:"dossier",title:"CHI TIẾT HỒ SƠ ĐANG XỬ LÝ"}],fakeReport:[{betimesCount:22,cancelledCount:10,deniedCount:50,domainCode:"YTE ",domainName:"Y Tế ",doneCount:40,govAgencyCode:"TPT",govAgencyName:"UBND Tỉnh Phú Thọ",interoperatingCount:0,month:1,onlineCount:30,ontimeCount:10,ontimePercentage:85,overdueCount:5,overtimeCount:5,overtimeInside:0,overtimeOutside:0,processCount:30,processingCount:0,receivedCount:40,releaseCount:10,releasingCount:11,remainingCount:10,reporting:!0,totalCount:100,undueCount:5,unresolvedCount:11,waitingCount:21,year:2018,onegateCount:12},{betimesCount:22,cancelledCount:11,deniedCount:51,domainCode:"YTE ",domainName:"Y Tế ",doneCount:41,govAgencyCode:"TPT2",govAgencyName:"UBND Tỉnh Phú Thọ 2",interoperatingCount:0,month:2,onlineCount:31,ontimeCount:15,ontimePercentage:80,overdueCount:5,overtimeCount:6,overtimeInside:0,overtimeOutside:0,processCount:31,processingCount:0,receivedCount:41,releaseCount:11,releasingCount:12,remainingCount:11,reporting:!0,totalCount:150,undueCount:5,unresolvedCount:15,waitingCount:12,year:2018,onegateCount:12}]}},80:function(t,e,n){"use strict";var o=n(206),i=n.n(o),a=n(60),r=n.n(a),u=n(448),c=[{path:"/bao-cao/:index",component:"Landing",props:!0},{path:"*",component:"NotFound"}],s=c.map(function(t){return i()({},t,{component:function(){return n(451)("./"+t.component+".vue")}})});r.a.use(u.a);var d=new u.a({routes:s});e.a=d}},[201]);
//# sourceMappingURL=app.22950759891ce7962ea8.js.map