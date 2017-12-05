<#if (Request)??>
<#include "init.ftl">
</#if>
<input type="hidden" name="serviceConfigId" id="serviceConfigId">
<div class="panel">
	<div class="panel-body PT0 PB0">
		<div class="row">
			<div id="listView">
			</div>
		</div>
	</div>
	<script type="text/x-kendo-tmpl" id="templateAdmin">
		#if(domains.length > 0) {#
		<div class="accordion" id=#:'acc1'+govAgencyCode#>
			<div class="accordion-group">
				<div class="accordion-heading">
					<a data-toggle="collapse" href=#:'\\#a'+govAgencyCode#>
						<i class="fa fa-university" aria-hidden="true"></i> #:govAgencyName #
					</a>
				</div>
				<div id=#:'a'+govAgencyCode# class="accordion-body collapse in">
					<div class="accordion-inner">
						<div class="accordion" id=#:'acc2'+govAgencyCode#>
							#for (var i = 0; i < domains.length; i ++) { #
							#if(domains[i].serviceConfigs.length > 0) { #
							<div class="accordion-group">
								<div class="accordion-heading">
									<a data-toggle="collapse" href=#:'\\#' +domains[i].domainCode#> 
										#:domains[i].domainName#
									</a>
								</div>
								<div id=#:domains[i].domainCode# class="accordion-body collapse in">
									<div class="accordion-inner P0">
										# if(domains[i].serviceConfigs.length > 0) {#
										# for (var j = 0; j < domains[i].serviceConfigs.length; j ++) {#
										<div class="eq-height">
											<div class="col-xs-12 col-sm-11 align-middle MR100">
												<a class="link-serviceInfo" data-pk="#:domains[i].serviceConfigs[j].serviceConfigId#" admt-pk="#domains[i].serviceConfigs.serviceConfigId#" href="\\#">
													#:domains[i].serviceConfigs[j].serviceInfoName#
												</a>
											</div>
											<div class="col-xs-12 col-sm-1 border-left ML100 center-all lh32 text-light-gray">
												Mức #:domains[i].serviceConfigs[j].level#
											</div>
											<div class="col-xs-12 col-sm-1 border-left align-center P0">
												<button class="btn btn-reset btn-select-serviceConfig text-light-gray" data-pk="#:domains[i].serviceConfigs[j].serviceConfigId#" admt-pk="#:domains[i].serviceConfigs[j].serviceConfigId#">Chọn</button>
											</div>
										</div>
										#}#
										#}#
									</div>
								</div>
							</div>
							#}#
							#}#
						</div>
					</div>
				</div>
			</div>
		</div>
		#}#
	</script>
</div>
<script type = "text/javascript">
	var dataSourceAdmin;
	$(document).ready(function(){
		var fnGenEventChoiseServiceConfig = function(){
			$('.btn-select-serviceConfig, .link-serviceInfo').unbind().click(function(){
				event.preventDefault();
				var serviceConfigId = $(this).attr("data-pk");
				$("#serviceConfigId").val(serviceConfigId);
				dataSourceProcessServiceConfig.read({
					serviceConfigId : serviceConfigId
				});
			});
		};

		dataSourceAdmin = new kendo.data.DataSource({
			transport: {
				read: function(options) {
					$.ajax({
						url: "${api.server}/serviceconfigs/govagencies",
						type: "GET",
						dataType: "json",
						headers : {"groupId": ${groupId}},
						data: {
							keyword: options.data.keyword,
						},
						success: function(result) {
							options.success(result);
						},
						error: function(error) {
							options.error(error);
						}
					});
				}
			},
			schema: {
				data: "govAgencies",
			}
		});

		$('#btn_search').click(function(){
			
			var input_Search = $('#input_search').val();
			if ($('#btn_fillter_by_admintration').hasClass('btn-active')){
				dataSourceAdmin.read({
					keyword: input_Search,
				});
			}
		});

		$("#listView").kendoListView({
			dataSource : dataSourceAdmin,
			template: kendo.template($("#templateAdmin").html()),
			autoBind : true,
			dataBound : function(){
				fnGenEventChoiseServiceConfig();
			}
		});

	});
</script>

