$(function(){
	
	//banner
    var swiper = new Swiper('.banner', {
        pagination: '.banner-fours',
        paginationClickable: true,
        loop: true,
    });
	// 在线接待 抖动效果
	$('.online > .container > div > a').hover(function(){
		$(this).addClass('hui-ring');},function(){
			$(this).removeClass('hui-ring');
		});
	// 项目
	var swiper = new Swiper('.items_box', {
        pagination: '.swiper-pagination',
        paginationClickable: true,
        loop: true,
    });
	// 环境
	var swiper = new Swiper('.env_box', {
        pagination: '.swiper-pagination',
        paginationClickable: true,
        loop: true,
    });
	
	//返回顶部
	$.Huitotop();
	

	/*左右滑动菜单*/
    $(".JS-nav-toggle").click(function() {
		$("body").addClass('sideBox-open');
        $(".containBox-bg").height(_bodyHeight).show();
    });
    $(".containBox-bg").click(function() {
		$(this).hide();
		$("body").removeClass('sideBox-open');
    });
});

var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "https://hm.baidu.com/hm.js?25ad27f6f5f17c50ace6776aa91dc4e4";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s);
})();

