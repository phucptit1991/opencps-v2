webpackJsonp([28],{483:function(t,e,a){var i=a(195)(a(558),a(573),null,null);t.exports=i.exports},558:function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.default={data:function(){return{thongTinChiTietHoSo:{dossierIdCTN:"182CB683",receiveDate:1529409276e3,applicantName:"Lê việt Đức",dossierId:"67501",address:"Phường Tân Hồng, Thị xã Từ Sơn, Tỉnh Bắc Ninh",releaseDate:1529409276e3,dossierStatusText:"Đang xử lý",durationDate:3,delegateName:"Lê việt Đức",applicantIdNo:"123456778",fee:"1.000.000.000"}}},computed:{loading:function(){return this.$store.getters.loading}},components:{},created:function(){},watch:{},methods:{initData:function(t){var e=this;e.$store.dispatch("getDetailDossier",t).then(function(t){e.thongTinChiTietHoSo=t})},goBack:function(){window.history.back()},daTra:function(){console.log("Đã tra")}},filters:{dateTimeView:function(t){if(t){var e=new Date(t);return e.getDate().toString().padStart(2,"0")+"/"+(e.getMonth()+1).toString().padStart(2,"0")+"/"+e.getFullYear()+" | "+e.getHours().toString().padStart(2,"0")+":"+e.getMinutes().toString().padStart(2,"0")}}}}},573:function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[t.loading?a("content-placeholders",{staticClass:"mt-3"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("div",{staticClass:"row-header",staticStyle:{"margin-top":"6px"}},[a("div",{staticClass:"background-triangle-big"},[t._v(" CHUYỂN PHÁT KẾT QUẢ ")]),t._v(" "),a("div",{staticClass:"layout row wrap header_tools row-blue"},[a("div",{staticClass:"flex solo text-ellipsis"}),t._v(" "),a("div",{staticClass:"flex text-right",staticStyle:{"margin-left":"auto"}},[a("v-btn",{staticClass:"my-0 mx-0 btn-border-left",attrs:{flat:"","active-class":"temp_active"},on:{click:t.goBack}},[t._v("\n            Quay lại  \n            "),a("v-icon",{attrs:{size:"16"}},[t._v("undo")])],1)],1)])]),t._v(" "),a("v-card",[a("v-card-title",{attrs:{"primary-title":""}},[a("v-chip",{attrs:{label:"",outline:"",color:"blue"}},[t._v("Mẫu biên bản bàn giao")])],1)],1)],1)},staticRenderFns:[]}}});
//# sourceMappingURL=28.b2b478f80e159517de92.js.map