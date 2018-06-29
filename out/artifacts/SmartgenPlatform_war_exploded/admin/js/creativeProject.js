/**
 * <summary>基本增删改查导出相关脚本</summary>
 * <param name="searchRecord()">查询
 * <param name="saveRecord()">保存
*/

var url = null; //在请求远程数据的地址
var condition1 = null;
var condition2 = null;
var condition3 = null;
var param = null; //拼接的查询条件，字符串型
var jsonParam = null; //转换后的查询条件，JSON型


//页面加载时查询
$(document).ready(function() {
	$("#btn_Query").click();
});

//单击查询按钮
$("#btn_Query").click(function() {
	url = "/SmartgenPlatform/creativeProjectGet";
	condition1 = $("#key_NameLabel").val()
	condition2 = $("#key_Name").val()
	condition3 = $("#key_date").val();
	param = "{\"condition1\":\"" + condition1 + "\",\"condition2\":\"" + condition2 + "\",\"condition3\":\"" + condition3 + "\"}";
	jsonParam = JSON.parse(param);
	searchRecord();
});

//查询记录
/**
* queryParams：在请求远程数据时发送额外的参数
* 格式：queryParams:{key1:value1,key2:value2}
* 参数类型：JSON对象
*/
function searchRecord() {
	$('#dg_creativeProject').datagrid({
		url : "/SmartgenPlatform/creativeProjectGet",
		queryParams : jsonParam
	});
}
;


//单击修改按钮
$("#btn_Edit").click(function() {
	$("#fm_creativeProject").form("clear");
	var row = $('#dg_creativeProject').datagrid('getSelected'); //获取选中行的记录号
	if (row == null) {
		alert("请选择需要修改的记录");
		return;
	}
/*	$.getJSON(row, function(data){
		
	});*/
	$("#dlg_creativeProject").dialog("open");
	$("#fm_creativeProject").form("load", row); //根据选中行的记录号读取该行记录
	url = "/SmartgenPlatform/creativeProjectUpdate";
});

//单击保存按钮
function saveRecord() {
		$("#fm_creativeProject").form("submit", {
			url : url,
			//验证表单提交的函数：当validate()返回值是true时，表单提交，反之不提交
			onSubmit : function(para) {
				return $(this).form("validate");
			},
			//回调函数：成功时执行
			success : function(result) {
				$("#dg_creativeProject").datagrid("reload");
				$("#dlg_creativeProject").dialog("close");
			}
		});
	}


//单击删除按钮
$("#btn_Del").click(function() {
	var row = $("#dg_creativeProject").datagrid("getSelected");
	if (row == null) {
		alert("请选择需要删除的记录");
		return;
	}
	url = "/SmartgenPlatform/creativeProjectDelete";
	var id = row.creproject_id;
	$.messager.confirm('提示', '确认要删除吗?', function(data) {
		if (data) {
			$.post(
				url,
				{
					creproject_id : id
				},
				function(result) {
					$("#dg_creativeProject").datagrid("reload");
				});
		}
	});
});


function pagerFilter(data) {
	if (typeof data.length == 'number' && typeof data.splice == 'function') { // 判断数据是否是数组
		data = {
			total : data.length,
			rows : data
		}
	}
	var dg = $(this);
	var opts = dg.datagrid('options');
	var pager = dg.datagrid('getPager');
	pager.pagination({
		onSelectPage : function(pageNum, pageSize) {
			opts.pageNumber = pageNum;
			opts.pageSize = pageSize;
			pager.pagination('refresh', {
				pageNumber : pageNum,
				pageSize : pageSize
			});
			dg.datagrid('loadData', data);
		}
	});
	if (!data.originalRows) {
		data.originalRows = (data.rows);
	}
	var start = (opts.pageNumber - 1) * parseInt(opts.pageSize);
	var end = start + parseInt(opts.pageSize);
	data.rows = (data.originalRows.slice(start, end));
	return data;
}

$(function() {
	$('#dg_creativeProject').datagrid({
		loadFilter : pagerFilter
	});
});

//格式化显示
function formatterCreproject_classify(value) {
	switch (value) {
	case 0:
		return "生活手工";	
		break;
	case 1:
		return "家具家居";
		break;
	case 2:
		return "科技数码";
		break;
	case 3:
		return "艺术娱乐";
		break;
	case 4:
		return "医疗健康";
		break;
	case 5:
		return "户外运动";
		break;
	case 6:
		return "其他";
		break;
	default:
		return "未知状态";
		break;
	}
}
function formatterCreproject_state(value) {
	switch (value) {
	case 0:
		return "<label style='background-color:#dd514c;display: inline-block;padding: 2px 4px;font-size: 11.844px;font-weight: bold;line-height: 14px;color: #fff;vertical-align: middle;overflow: hidden;border-radius: 3px;'>未孵化</label>";	
		break;
	case 1:
		return "<label style='background-color:#f37b1d;display: inline-block;padding: 2px 4px;font-size: 11.844px;font-weight: bold;line-height: 14px;color: #fff;vertical-align: middle;overflow: hidden;border-radius: 3px;'>孵化中</label>";	
		break;
	case 2:
		return "<label style='background-color:#5eb95e;display: inline-block;padding: 2px 4px;font-size: 11.844px;font-weight: bold;line-height: 14px;color: #fff;vertical-align: middle;overflow: hidden;border-radius: 3px;'>已孵化</label>";	
		break;
	default:
		return "未知状态";
		break;
	}
}
function formatterCreproject_evaluateResult(value) {
	switch (value) {
	case 0:
		return "<label style='background-color:#dd514c;display: inline-block;padding: 2px 4px;font-size: 11.844px;font-weight: bold;line-height: 14px;color: #fff;vertical-align: middle;overflow: hidden;border-radius: 3px;'>未通过</label>";		
		break;
	case 1:
		return "<label style='background-color:#dd514c;display: inline-block;padding: 2px 4px;font-size: 11.844px;font-weight: bold;line-height: 14px;color: #fff;vertical-align: middle;overflow: hidden;border-radius: 3px;'>已通过</label>";	
		break;
	case 2:
		return 已孵化;
		break;
	default:
		return "未知状态";
		break;
	}
}

function ajaxLoading() {
	var id = "#textboxDiv";
	var left = ($(window).outerWidth(true) - 190) / 2;
	var top = ($(window).height() - 35) / 2;
	var height = $(window).height() * 2;
	$("<div class=\"datagrid-mask\"></div>").css({
		display : "block",
		width : "100%",
		height : height
	}).appendTo(id);
	$("<div class=\"datagrid-mask-msg\"></div>").html("正在加载,请稍候...").appendTo(id).css({
		display : "block",
		left : left,
		top : top
	});
}
function ajaxLoadEnd() {
	$(".datagrid-mask").remove();
	$(".datagrid-mask-msg").remove();
}

// 等待所有加载
$(window).load(function() {
	$('body').addClass('loaded');
	$('#loader-wrapper .load_title').remove();
});