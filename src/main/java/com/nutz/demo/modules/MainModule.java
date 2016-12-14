package com.nutz.demo.modules;

import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.annotation.Ok;

//模块类自动扫描，添加这行注解nutz将自动扫描主模块所在包下所有的子模块以及入口函数（带有@At注解）
@Modules(scanPackage = true)
public class MainModule {
	
	@At("init")
	//@Ok代表入口函数成功执行后返回的结果，可以为jsp页面，也可以以json格式返回数据（例如@Fail-->执行失败情况）
	@Ok("jsp:/views/hello.jsp")
	@Fail("json")
	public String init(){
		return "Hello Nutz!";
	}
	
}
