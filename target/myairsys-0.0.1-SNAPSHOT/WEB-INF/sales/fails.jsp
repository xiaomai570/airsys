<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<style>
    .content{
        width: 180px;
        height: 100px;
        border: 1px solid red;
        margin-left: 450px;
        margin-top: 310px;
    }

</style>
<script>
       window.onload=function () {
           var span=document.querySelector(".math");
            var i=3;
           var t= setInterval(function () {
                i--;
                span.innerHTML=i;
                if(i==0){
                    clearInterval(t);
                    location.href="/air_system/xiupassword"
                }
            },1000)
       }

</script>
<body>
       <div class="content">
           <div><span>修改失败,请核对信息</span></div>
           <div><span>请稍等<span class="math">3</span>秒</span></div>
           <div><span>如果未响应，请点击</span><a href="/airsys/xiupassword">超链接1</a></div>
       </div>
</body>
</html>