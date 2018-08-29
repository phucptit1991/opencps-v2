<#include "init.ftl">

<div class="row">


	<div class="col-md-3 panel P0">

		
		<div class="panel-body">
	
			<span id="_holiday_editLabel" class="btn btn-active btn-block"> 
				<i class="fa fa-calendar" aria-hidden="true"></i>
				<span class="p-xxs" >Tổng số</span> 
				<span id="_holiday_CounterList">0</span>
				<span class="p-xxs" >ngày nghỉ</span> 
				<i class="fa fa-plus-circle"></i> 
			</span>

			<div class="input-group MT15">
				
				<input type="text" class="form-control" id="_holiday_keySearch"
					oninput="_holiday_autocompleteSearch(this.value)" 
					placeholder="Tìm kiếm theo ngày nghỉ">
	
				<div class="input-group-addon btn-active" id="_holiday_btnSearch">
					
					<i class="fa fa-search" aria-hidden="true"></i>
	
				</div>
	
			</div>
			
		</div>
				
			
		<ul class="ul-with-border ul-default mh-head-2" id="_holiday_listView"></ul>
		
		<script type="text/x-kendo-tmpl" id="_holiday_template">
		
			<li class="clearfix PT10 PR0 PB10 PL10">
	
				<div class="col-sm-2 clearfix PL0 PR0">
					
					<a href="javascript:;" >
						
						<i class="fa fa-calendar fs26 P5" aria-hidden="true"></i>
							
					</a>
						
				</div>
					
				<div class="col-sm-9 PL0">
				
					<strong class="btn-block">
						#
						 var date = parseDateTime(id);
						#
						#=date#
					</strong>
					<span class="btn-block">
						#=description#
					</span>
				
				</div>
					
				<span class="col-sm-1 PL0 PR0"></span>
					
				<div class="product-view">
				
					<div class="edit-buttons">
				
						<a class="k-delete-button k-delete-icon-listview" href="\\#">
							<i class="fa fa-times" aria-hidden="true"></i>
						</a>
			
					</div>
				
				</div>
					
			 </li>
	
		</script>

	</div>
	

	
	<div class="col-md-9 " id="_holiday_right-page">
		<#include "holiday_detail.ftl">
	</div>

</div>

<input type="hidden" value="" id="_holiday_hidden_new_id"/>

<script type="text/javascript">
	
	function _holiday_autocompleteSearch() {
	
		$("#_holiday_listView").getKendoListView().dataSource.filter({
			 field: "holidayDate", operator: "contains", 	value: $("#_holiday_keySearch").val().trim() 
		});
		
		$('#_holiday_CounterList').html($("#_holiday_listView").getKendoListView().dataSource.total());
	}

	function parseStringToDate (data) {
		var dateString = data;

		var dateParts = dateString.split("/");

		var dateObject = new Date(dateParts[2], dateParts[1] - 1, dateParts[0]);
		return dateObject.getTime();
	}

	function parseDateTime(data) {
		var current_date = new Date(data);
		var timestamp = current_date.getTime();
		var formatted_date = current_date.getDate() + "/" + (current_date.getMonth() + 1) + "/" + current_date.getFullYear()
		console.log(formatted_date);
		return formatted_date;
	}
	
	(function($) {
	
		var _holiday_BaseUrl = "/o/rest/v2/holidays";
		
		var _holiday_dataSource = new kendo.data.DataSource({

			transport: {
	
				read: function(options) {
					
					$.ajax({
					
						url: _holiday_BaseUrl,
						dataType: "json",
						type: 'GET',
						headers: {
							"groupId": ${groupId}
						},
						data: {
						},
						success: function(result) {
						
							$('#_holiday_CounterList').html(result.total);
							result["data"] = result.total==0 ? []: result["data"];
							options.success(result);
							
						},
						error: function(xhr, textStatus, errorThrown) {
							
							showMessageByAPICode(xhr.status);
						
						}
					
					});
				},
				destroy: function(options) {
					var cf = confirm('Bạn có chắc muốn xóa bản ghi này?');
					
					if(cf){
						
						$.ajax({
							url: _holiday_BaseUrl + "/" + options.data.holidayDate,
							headers: {
								"groupId": ${groupId}
							},
							type: 'DELETE',
							success: function(result) {
								
								$("#_holiday_hidden_new_id").val("");
								options.success();
								$('#_holidaybpos_CounterList').html($("#_holiday_listView").getKendoListView().dataSource.total());
								showMessageToastr("success", 'Yêu cầu của bạn được xử lý thành công!');
								
							},
							error: function(xhr, textStatus, errorThrown) {
								
								$("#_holiday_listView").getKendoListView().dataSource.error();
								showMessageByAPICode(xhr.status);
								
							}
							
						});
						
					} else{
						
						options.error();
					}
					
				},
				parameterMap: function(options, operation) {
					
					if (operation !== "read" && options.models) {
						return {
							models: kendo.stringify(options.models)
						};
					}
				}
			},
			schema: {
			
				data: "data",
				total: "total",
				model: {
					id:"holidayDate"
				}
			},
			error: function(e) {
				
				this.cancelChanges();
				
			}

		});
	
		$("#_holiday_listView").kendoListView({
		
			remove: function(e) {
			
			},
			
			dataSource: _holiday_dataSource,
			
			selectable: "true",
			
			dataBound: _holiday_dataBound,
			
			change: _holiday_onChange,
			
			template: kendo.template($("#_holiday_template").html()),
			
			filterable: {
				field: "holidayDate", operator: "contains", 	value: $("#_holiday_keySearch").val().trim() 
			}
		
		});
		var firstTimeHl = true;
		
		function _holiday_dataBound(e) {
			
			var _holiday_listView = e.sender;
			
			var children = _holiday_listView.element.children();
			
			var index = $("#_holiday_hidden_new_id").val().trim();

			if (firstTimeHl) {
				_holiday_listView.select(children[0]);
				firstTimeHl = false;
				return;
			}

			if (index === '' || index === undefined || index === 0 || index === 'undefined' || index === null) {
				// _holiday_listView.select(children[0]);
			} else {
				for (var x = 0; x < children.length; x++) {

					var getObj = _holiday_listView.dataSource.view()[x];

					if (getObj.holidayDate == index) {
						console.log("index -----", x);
						index = x;
					};
				};
				_holiday_listView.select(children[index]);
			}			
		}
		function pullDetailHoliday(data) {
			if (data) {
				$("#holidayDescription").val(data.description)
				var holidayDate_temp = new Date(data.holidayDate);
				var formatted_date = holidayDate_temp.getDate() + "/" + (holidayDate_temp.getMonth() + 1) + "/" + holidayDate_temp.getFullYear()
				console.log('formatted_date------------', formatted_date)
				$("#holidayDate").data('kendoDatePicker').value(formatted_date)
			} else {
				$("#holidayDescription").val('')
				var holidayDate_temp = new Date();
				var formatted_date = holidayDate_temp.getDate() + "/" + (holidayDate_temp.getMonth() + 1) + "/" + holidayDate_temp.getFullYear()
				console.log('formatted_date------------', formatted_date)
				$("#holidayDate").data('kendoDatePicker').value(formatted_date)
			}
		}
		
		function _holiday_onChange(e) {
	
			var data = _holiday_dataSource.view(),
	
			selected = $.map(this.select(), function(item) {
			
				return data[$(item).index()];
			
			});
			if (selected[0]) {
				pullDetailHoliday(selected[0])
				$("#_holidayDetail_submitBtn > span").html('Lưu lại');
				$("#_holiday_hidden_new_id").val(selected[0].holidayDate);
			} else {
				pullDetailHoliday()
				$("#_holidayDetail_submitBtn > span").html('Thêm mới');
				$("#_holiday_hidden_new_id").val('');
			}
		}

		$(document).on('click', '#_holiday_editLabel', function(event){
		
			event.preventDefault();
			event.stopPropagation();
			event.stopImmediatePropagation();
			
			// $("#_jobpos_right-page").load(
			// 	'${url.adminJobPosPortlet.jobpos_detail}'
			// 	);
			$("#_holidayDetail_submitBtn > span").html('Thêm mới');
			$("#_holiday_listView").getKendoListView().clearSelection();
		});
		
	})(jQuery);
</script>