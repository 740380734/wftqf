$(function(){
	
	//banner
    var swiper = new Swiper('.banner', {
        pagination: '.banner-fours',
        paginationClickable: true,
        loop: true,
    });
	// ���߽Ӵ� ����Ч��
	$('.online > .container > div > a').hover(function(){
		$(this).addClass('hui-ring');},function(){
			$(this).removeClass('hui-ring');
		});
	// ��Ŀ
	var swiper = new Swiper('.items_box', {
        pagination: '.swiper-pagination',
        paginationClickable: true,
        loop: true,
    });
	// ����
	var swiper = new Swiper('.env_box', {
        pagination: '.swiper-pagination',
        paginationClickable: true,
        loop: true,
    });
	
	//���ض���
	$.Huitotop();
	

	/*���һ����˵�*/
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

