
配置中可以使用MD5加密和 BCrypt加密 本配置是http头验证 
测试： 前端吧账号密码经过base64加密后放在http头里进行验证
/login 接口是用来获取个人信息（要把账号密码放在http头才能获取login接口里的数据）