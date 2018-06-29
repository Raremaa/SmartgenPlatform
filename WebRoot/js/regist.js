//用户名设置 提示
function test1() {
	var input = document.getElementById("User_name");
	var account = input.value;
	var span = document.getElementById("text1");
	console.log(account.length);
	if (account.length <= 0) {
		span.innerHTML = "用户名不能为空";
		return false;
	} else {
		if(account.length>20){
			span.innerHTML = "请输入正确的用户名";
			return false;
		}else{
			span.innerHTML = " ";
		}
		
	}
}


//密码设置  提示  
var reg1 = /^\w{6,20}$/;//使用了正则表达式
function test2() {
	var input = document.getElementById("User_password");
	var account = input.value;
	var span = document.getElementById("text2");
	if (!reg1.test(account)) {
		span.className = "error";
	} else {
		span.className = "right";
	}

}


//确认密码设置     提示
function test3() {
	var input1 = document.getElementById("User_password");
	var input2 = document.getElementById("User_rePassword");
	var account1 = input1.value;
	var account2 = input2.value;
	var span = document.getElementById("text3");
	if (account1 != account2) {
		span.innerHTML = "确认密码输入错误 , 重新输入";
	} else {
		if(account2.length<=0){
			span.innerHTML = "确认密码不能为空";
		}else{
			span.innerHTML = " ";
		}
		
	}

}


//手机号验证 提示
var reg2 = /^\d{11}$/;
function test4() {
	var input = document.getElementById("User_phone");
	var account = input.value;
	var span = document.getElementById("text4");
	if (!reg2.test(account)) {
		span.className = "error";
	} else {
		span.className = "right";
	}

}


//验证码
/*var time;
var timer;
function d1() {
	var btn = document.getElementById("checkBtn1");
	btn.disabled = true;
	time = arguments[0];
	timer = window.setInterval("begin()", 2000);
}
function begin() {
	var btn = document.getElementById("checkBtn1");
	time--;
	if (time == 0) {
		window.clearInterval(timer);
		btn.disabled = false;
		btn.value = "获取验证码";
	} else {
		btn.value = "验证码" + time + "秒";
	}
}

function d2() {
	var btn = document.getElementById("checkBtn2");
	btn.disabled = true;
	time = arguments[0];
	timer = window.setInterval("begin()", 2000);
}
function begin() {
	var btn = document.getElementById("checkBtn2");
	time--;
	if (time == 0) {
		window.clearInterval(timer);
		btn.disabled = false;
		btn.value = "获取验证码";
	} else {
		btn.value = "验证码" + time + "秒";
	}
}
*/


//所在地  
var array = new Array();
array[0] = [ "请选择城市" ];
array[1] = [ "南昌", "九江", "赣州" ];
array[2] = [ "武汉", "孝感", "黄石" ];
array[3] = [ "长沙", "株洲", "湘潭" ];
function change1() {
	var sel1 = document.getElementById("User_locationProvince");
	var sel2 = document.getElementById("User_locationCity");
	var cities = array[sel1.selectedIndex];
	while (sel2.childNodes.length > 2) {
		sel2.removeChild(sel2.lastChild);
	}
	for ( var index = 0; index < cities.length; index++) {
		var newNode = document.createElement("option");
		newNode.innerHTML = cities[index];
		sel2.appendChild(newNode);
	}

}

function change2() {
	var sel1 = document.getElementById("Company_locationProvince");
	var sel2 = document.getElementById("Company_locationCity");
	var cities = array[sel1.selectedIndex];
	while (sel2.childNodes.length > 2) {
		sel2.removeChild(sel2.lastChild);
	}
	for ( var index = 0; index < cities.length; index++) {
		var newNode = document.createElement("option");
		newNode.innerHTML = cities[index];
		sel2.appendChild(newNode);
	}

}

var url = null;//在请求远程数据的地址
var User_name=null;
var User_phone=null;
var User_password=null;
var User_rePassword=null;
var User_sex=null;
var User_locationProvince=null;
var User_locationCity=null;
var User_location=null;




	$("#registBtn").click(function(){
		User_name=$("#User_name").val();
		User_phone=$("#User_phone").val();
		User_password=$("#User_password").val();
		User_rePassword=$("#User_rePassword").val();
		User_sex=$(":radio").val();
		User_locationProvince=$("#User_locationProvince").val();
		User_locationCity=$("#User_locationCity").val();
		console.log(User_sex);
		console.log(User_name+"  "+User_phone+"  "+User_password+"  "+User_rePassword);
		layui.use('layer', function(){
		    var layer = layui.layer; 
		    if(User_name=="" || User_phone=="" || User_password=="" || User_rePassword==""){
		    	console.log("jhjh");
	        	layer.alert('注册失败！', {
	  			  time: 20000, //20s后自动关闭
	  			  offset: ['30%', '40%'],
	  			  btn: ['知道了']
	  			});
		    }else{
		    	console.log(User_name.length);
		    	console.log(User_password.length);
		    	console.log(User_rePassword.length);
		    	console.log(User_phone.length);
		    	console.log(User_rePassword);
		    	console.log(User_password);
		    	if(User_name.length<=0 || User_name.length>20 || User_password.length<6 || User_password.length>20 ||User_rePassword.length<6 || User_rePassword.length>20 ||User_password!=User_rePassword || User_phone.length!=11){
		    		layer.alert('注册失败！', {
			  			  time: 20000, //20s后自动关闭
			  			  offset: ['30%', '40%'],
			  			  btn: ['知道了']
			  			});
		    	}else{
		    		//过来的数据如此所示{"flag":"false"}，访问的时候直接用data.flag访问就可以了
		    		$.ajax({
		    	     	url:"/SmartgenPlatform/userRegistAdd",
		    	     	type:"post",
		    	     	dataType:"json",
		    	     	data:{User_name:User_name,User_phone:User_phone,User_password:User_password,User_sex:User_sex,User_locationProvince:User_locationProvince,User_locationCity:User_locationCity,},
		    	     	success:function(data){
		    	     		layui.use('layer', function(){
		    	    		    var layer = layui.layer; 
		    	    		    if(data.flag=="true"){
		    	    		    	 var tips = layer.open({
		    		     				  type: 1
		    		     				  ,title: false //不显示标题栏
		    		     				  , skin: 'layui-layer-molv' //样式类名
		    		     				  ,closeBtn: false
		    		     				  ,area: '300px;'
		    		     				  ,offset: ['35%', '40%']
		    		     				  ,shade: 0.6
		    		     				  ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
		    		     				  ,resize: false
		    		     				  ,btn: ['知道了']
		    		     				  ,btnAlign: 'c'
		    		     				  ,moveType: 1 //拖拽模式，0或者1
		    		     				  ,content: '<div style="padding: 50px;text-align:center; line-height: 20px; background-color: #393D49; color: #fff; font-weight: 300;font-size:16px;">注册成功，去登录！</div>'
		    		     				  ,success: function(layero){
		    		     				    var btn = layero.find('.layui-layer-btn');
		    		     				    btn.find('.layui-layer-btn0').attr({
		    		     				      href: '/SmartgenPlatform/login.html'
		    		     				      ,target: '_self'
		    		     				    });
		    		     				  }
		    		     				});
		    		     		}else{
		    		     			layer.alert('您已经注册过了，直接登录吧！', {icon: 6
		    		     			}, function(index){
		    		     				 window.location.href="/SmartgenPlatform/login.html";
		    		     				  layer.close(index);
		    		     				}); 
		    		     		}
		    	    		});
		    	     		
		    	     		//怎么解析传回来的数据，怎么在后台设置msg（比如：用户名或者密码不正确）或者其他
		    	             //如果我登录成功。我能转发到另一个页面吗，并且传一些数据
		    	     	}
		    		});
		    	}
		    }
		});
		
	
	})

