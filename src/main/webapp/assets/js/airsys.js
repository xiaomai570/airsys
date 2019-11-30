function goback(){
	var updateairport = $(".updateairport").css("display");
	var insertairport = $(".insertairport").css("display");
	var updateboss=$(".updateboss").css("display");
	var insertboss=$(".insertboss").css("display");
	var updatebranch=$(".updatebranch").css("display");
	var insertbranch=$(".insertbranch").css("display");
	var updatecustomer=$(".updatecustomer").css("display");
	var updateflight=$(".updateflight").css("display");
	var insertflight=$(".insertflight").css("display");
	var updatesale=$(".updatesale").css("display");
	var updateticketorder=$(".updateticketorder").css("display");
	if (updateairport=="block") {
		$(".updateairport").css({"display":"none"});
	}
	if (insertairport=="block") {
		$(".insertairport").css({"display":"none"});
	}
	if (updateboss=="block") {
		$(".updateboss").css({"display":"none"});
	}
	if (insertboss=="block") {
		$(".insertboss").css({"display":"none"});
	}
	if (updatebranch=="block") {
		$(".updatebranch").css({"display":"none"});
	}
	if (insertbranch=="block") {
		$(".insertbranch").css({"display":"none"});
	}
	if (updatecustomer=="block") {
		$(".updatecustomer").css({"display":"none"});
	}
	if (updateflight=="block") {
		$(".updateflight").css({"display":"none"});
	}
	if (insertflight=="block") {
		$(".insertflight").css({"display":"none"});
	}
	if (updatesale=="block") {
		$(".updatesale").css({"display":"none"});
	}
	if (updateticketorder=="block") {
		$(".updateticketorder").css({"display":"none"});
	}
}

function deleteboss(id) {
	isdelete = confirm("你确定要删除？");
	if (isdelete) {
		//$(".del").css({"animation":"name 1s"});
		window.location.href = "/airsys/deleteboss/"+id;
	}
}
function updateboss(boss) {
	$(".updateboss").css({"display":"block"});
	$(".insertboss").css({"display":"none"});
	$(".id").val(boss[0].id);
	$(".uname").val(boss[0].b_name);
	$(".num").val(boss[0].boss_number);
	$(".pwd").val(boss[0].boss_password);
	//$(".upd").css({"animation":"name 1s"});
}
function insertboss(){
	$(".insertboss").css({"display":"block"});
	$(".updateboss").css({"display":"none"});
}

function deleteairport(id) {
	isdelete = confirm("你确定要删除？");
	if (isdelete) {
		window.location.href = "/airsys/deleteairport/"+id;
	}
}
function updateairport(airport){
	$(".updateairport").css({"display":"block"});
	$(".insertairport").css({"display":"none"});
	$(".id").val(airport[0].id);
	$(".uname").val(airport[0].airport_code);
	$(".num").val(airport[0].city);
	$(".pwd").val(airport[0].airport_name);
}
function insertairport(){
	$(".insertairport").css({"display":"block"});
	$(".updateairport").css({"display":"none"});
}

function deletebranch(id) {
	isdelete = confirm("你确定要删除？");
	if (isdelete) {
		window.location.href = "/airsys/deletebranch/"+id;
	}
}
function updatebranch(branch){
	$(".updatebranch").css({"display":"block"});
	$(".insertbranch").css({"display":"none"});
	$(".id").val(branch[0].id);
	$(".b_name").val(branch[0].b_name);
	$(".address").val(branch[0].address);
	$(".telephone").val(branch[0].telephone);
	$(".province").val(branch[0].province);
	$(".city").val(branch[0].city);
	$(".b_password").val(branch[0].b_password);
	$(".branch_id").val(branch[0].branch_id);
}
function insertbranch(){
	$(".insertbranch").css({"display":"block"});
	$(".updatebranch").css({"display":"none"});
}
function findSales(branch_id){
	window.location.href = "/airsys/sales/"+branch_id;
}

function deletecustomer(id) {
	isdelete = confirm("你确定要删除？");
	if (isdelete) {
		window.location.href = "/airsys/deletecustomer/"+id;
	}
}
function updatecustomer(customer){
	$(".updatecustomer").css({"display":"block"});
	$(".id").val(customer[0].id);
	$(".c_name").val(customer[0].c_name);
	$(".c_number").val(customer[0].c_number);
	$(".c_password").val(customer[0].c_password);
	$(".age").val(customer[0].age);
	$(".id_card").val(customer[0].id_card);
	$(".phone").val(customer[0].phone);
}

function findflight(flight_number){
	window.location.href = "/airsys/flight/"+flight_number;
}
function deleteflight(id) {
	isdelete = confirm("你确定要删除？");
	if (isdelete) {
		window.location.href = "/airsys/deleteflight/"+id;
	}
}
function updateflight(flight){
	$(".updateflight").css({"display":"block"});
	$(".insertflight").css({"display":"none"});
	$(".id").val(flight[0].id);
	$(".flight_number").val(flight[0].flight_number);
	$(".first_class_remain_seats").val(flight[0].first_class_remain_seats);
	$(".business_class_remain_seats").val(flight[0].business_class_remain_seats);
	$(".economy_class_remain_seats").val(flight[0].economy_class_remain_seats);
	$(".first_price").val(flight[0].first_price);
	$(".business_price").val(flight[0].business_price);
	$(".economy_price").val(flight[0].economy_price);
	$(".start_date").val(flight[0].start_date);
	$(".end_date").val(flight[0].end_date);
	$(".from_city").val(flight[0].from_city);
	$(".to_city").val(flight[0].to_city);
	$(".departure_time").val(flight[0].departure_time);
	$(".arrival_time").val(flight[0].arrival_time);
	$(".start_airplane").val(flight[0].start_airplane);
	$(".end_airplane").val(flight[0].end_airplane);
}
function insertflight(){
	$(".insertflight").css({"display":"block"});
	$(".updateflight").css({"display":"none"});
}

function deletesale(id) {
	isdelete = confirm("你确定要删除？");
	if (isdelete) {
		window.location.href = "/airsys/deletesale/"+id;
	}
}
function updatesale(sale){
	$(".updatesale").css({"display":"block"});
	$(".id").val(sale[0].id);
	$(".job_id").val(sale[0].job_id);
	$(".s_name").val(sale[0].s_name);
	$(".s_number").val(sale[0].s_number);
	$(".s_password").val(sale[0].s_password);
	$(".branch_id").val(sale[0].branch_id);
}

function deleteticketorder(id) {
	isdelete = confirm("你确定要删除？");
	if (isdelete) {
		window.location.href = "/airsys/deleteticketorder/"+id;
	}
}
function updateticketorder(ticketorder){
	$(".updateticketorder").css({"display":"block"});
	$(".id").val(ticketorder[0].id);
	$(".flight_number").val(ticketorder[0].flight_number);
	$(".passenger_name").val(ticketorder[0].passenger_name);
	$(".certification_number").val(ticketorder[0].certification_number);
	$(".order_date").val(ticketorder[0].order_date);
	$(".grade").val(ticketorder[0].grade);
	$(".branch_id").val(ticketorder[0].branch_id);
	$(".sales_id").val(ticketorder[0].sales_id);
}

