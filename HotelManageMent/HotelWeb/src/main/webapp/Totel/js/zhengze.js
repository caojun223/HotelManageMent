$("#password").on("blur",function(){
    distance=$("#password").val();
    var re = /^[a-z0-9_-]{6,18}$/;
    var password=$("#password").val();
    if (password==""){
    } else if (re.test(password)) {
    } else {
        alert("密码只能为6—18位的字母和数字");
    }
});

$("#usertel").on("blur",function(){
    distance=$("#usertel").val();
    var re = /^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\d{8}$/;
    var usertel=$("#usertel").val();
    if (usertel==""){
    } else if (re.test(usertel)) {
    } else {
        alert("请输入合法的手机号");
    }
});

$("#username").on("blur",function(){
    distance=$("#username").val();
    var re = /^[a-zA-Z0-9_-]{4,16}$/;
    var username=$("#username").val();
    if (username==""){
    } else if (re.test(username)) {
    } else {
        alert("请输入正确的账号");
    }
});

$("#password2").on("blur",function(){
    distance=$("#password2").val();
    // $("#distance").val("失去焦点后触发");         //blur 获取焦点然后失去焦点时触发，包括鼠标点击离开和TAB键离开。
    var a=$("#password").val();
    var b=$("#password2").val();
    if (a!=b){
        alert("俩次输入密码不一致");
    }
});


$("#useremail").on("blur",function(){
    distance=$("#useremail").val();
    // $("#distance").val("失去焦点后触发");         //blur 获取焦点然后失去焦点时触发，包括鼠标点击离开和TAB键离开。
    var re = /^[A-Za-z\d]+([-_.][A-Za-z\d]+)*@([A-Za-z\d]+[-.])+[A-Za-z\d]{2,4}$/;
    var useremail=$("#useremail").val();
    if (useremail==""){
    } else if (re.test(useremail)) {
    } else {
        alert("请输入正确的邮箱");
    }
});