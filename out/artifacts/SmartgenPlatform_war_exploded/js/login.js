var url = null;//在请求远程数据的地址
var phone = null;//拼接的查询条件，字符串型
var password=null;
var userPassword = null;
var authority=null;
var condition = null;//转换后的查询条件，JSON型

//有一个不太好的地方

$(".text").blur(function(){
	 phone =$("#userPhone").val();
	 password = $("#userPassword").val();
	if(phone == "" || password == ""){
		$("#loginBtn").attr("disabled", true); 
//		console.log(1);
		$("#errorUserContent")[0].innerHTML ="手机号或密码不能为空";
		return;
	}
	//userExist(name,pwd);
	$("#loginBtn").attr("disabled", false); 
	$("#errorUserContent")[0].innerHTML ="";
	
});

/*user = "{\"userName\":\""+userName+"\",\"userPassword\":\""+userPassword+"\"}";
onUser = JSON.parse(user);
*/
$("#loginBtn").click(function(){
	authority=$("input[name='authority']:checked").val();
	layui.use('layer', function(){
    var layer = layui.layer; 
	if(typeof authority=="undefined"){
		layer.alert('您还没有选择权限呢！', {
			  time: 20000, //20s后自动关闭
			  offset: ['30%', '40%'],
			  btn: ['知道了']
			});
		return;
	}else{
		if(authority==1){
			condition="User_phone=\""+phone+"\" and "+"User_password=\""+password+"\"";
			$.ajax({
		     	url:"/SmartgenPlatform/userLoginGet",
		     	type:"post",
		     	dataType:"json",
		     	data:{condition:condition},
		     	success:function(data){
		     		console.log(data.length);
		     		if(data.length==0){
		     			 layui.use('layer', function(){
		     				  var layer = layui.layer; 
		     				  var tips = layer.open({
		     				  type: 1
		     				  ,title: false //不显示标题栏
		     				  ,closeBtn: false
		     				  ,area: '300px;'
		     				  ,offset: ['35%', '40%']
		     				  ,shade: 0.3
		     				  ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
		     				  ,resize: false
		     				  ,btn: ['知道了']
		     				  ,btnAlign: 'c'
		     				  ,moveType: 1 //拖拽模式，0或者1
		     				  ,content: '<div style="padding: 50px; line-height: 20px; background-color: #393D49; color: #fff; font-weight: 300;font-size:16px;">您的手机号或者密码错误！</div>'
		     				  ,success: function(layero){
		     				    var btn = layero.find('.layui-layer-btn');
		     				    btn.find('.layui-layer-btn0').attr({
		     				      href: '/SmartgenPlatform/login.html'
		     				      ,target: '_self'
		     				    });
		     				  }
		     				});}); 
		     			 return;
		     		}
		     			window.location.href="/SmartgenPlatform/homePage/homePage.jsp";
		     	},
		     	error:function(){
		     		console.log("fff");
		     	}
		     	
		   });//ajax
		}else{
			condition="Expert_phone="+phone+" and "+"Expert_password=\""+password+"\"";
			$.ajax({
		     	url:"/SmartgenPlatform/expertGet",
		     	type:"post",
		     	dataType:"json",
		     	data:{condition:condition},
		     	success:function(data){
		     		console.log(data.length);
		     		if(data.length==0){
		     			 layui.use('layer', function(){
		     				  var layer = layui.layer; 
		     				  var tips = layer.open({
		     				  type: 1
		     				  ,title: false //不显示标题栏
		     				  ,closeBtn: false
		     				  ,area: '300px;'
		     				  ,offset: ['35%', '40%']
		     				  ,shade: 0.3
		     				  ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
		     				  ,resize: false
		     				  ,btn: ['知道了']
		     				  ,btnAlign: 'c'
		     				  ,moveType: 1 //拖拽模式，0或者1
		     				  ,content: '<div style="padding: 50px; line-height: 20px; background-color: #393D49; color: #fff; font-weight: 300;font-size:16px;">您的手机号或者密码错误！</div>'
		     				  ,success: function(layero){
		     				    var btn = layero.find('.layui-layer-btn');
		     				    btn.find('.layui-layer-btn0').attr({
		     				      href: '/SmartgenPlatform/login.html'
		     				      ,target: '_self'
		     				    });
		     				  }
		     				});}); 
		     			 return;
		     		}
		     		window.location.href="/SmartgenPlatform/expert/jsp/index.jsp"
		     	},
		     	error:function(){
		     		console.log("fff");
		     	}
		     	
		   });
			
		}
	}
	 });
		}); //click  




//判断用户名是否存在的ajax
