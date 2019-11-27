layui.use('carousel', function(){
  var carousel = layui.carousel;
  //建造实例
  carousel.render({
    elem: '#test1'
    ,width: '100%' //设置容器宽度
    ,arrow: 'always' //始终显示箭头
    //,anim: 'updown' //切换动画方式
  });
});

window.onload=function(){
	var submit = document.querySelector(".submit");
	submit.onclick=function(){
		alert("请登陆后查看");
	}
}