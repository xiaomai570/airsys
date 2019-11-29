window.onload=function(){
	var search = document.querySelector(".searchbtn");
	var searchFlight = document.querySelector(".searchFlight-in");
	

	search.onclick=function(){
		$(".result").remove();
		var from_city = $(".from_city").val();
		var to_city = $(".to_city").val();
		var start_date = $(".start_date").val();
		
		console.log(from_city);console.log(to_city);console.log(start_date);
		
		var data = {"from_city":from_city,"to_city":to_city,"start_date":start_date};
		$.ajax({  
			url: "/airsys/searchFlight",  
			dataType:"json",
            type: "post",  
            contentType:"application/json;charset=utf-8",
            data:JSON.stringify(data), 
            success: function(e){
            	$(".from_city").val(null);
            	$(".to_city").val(null);
            	$(".start_date").val(null);
            	// console.log(e);
            	// console.log(e.length);
            	for (var i = 0; i < e.length; i++) {
            		var piao = document.createElement("div");
            		$(piao).attr("class","result");
            		$(piao).attr("id",e[i].flight_number);
                	var xiangqing = JSON.stringify(e[i]);
                	console.log("所有的数据"+xiangqing);
            		var inner = "";
            		inner+="<div style='width:800px;height:50px;margin:auto;margin-top:10px;position:relative;'>"+
            			"<div style='width:100px;height:50px;float:left;text-align:center;font-size:22px;line-height:50px;'>"+e[i].start_airplane+"</div>"+
            			"<div style='width:100px;height:30px;float:left;left:350px;top:0;text-align:center;font-size:18px;position:absolute;line-height:30px;'>"+e[i].flight_number+"</div>"+
            			"<div style='width:600px;height:15px;float:left;left:100px;bottom:0;position:absolute;border-top:2px solid black;'></div>"+
            			"<div style='width:100px;height:50px;float:right;text-align:center;font-size:22px;line-height:50px;'>"+e[i].end_airplane+"</div>"+
            			"<button class='buybtn' onClick='buy(this)' style='float:left;left:480px;top:5px;position:absolute;'>购买</button>"+
            			"<button class='xiangqing' onClick='xiangqing("+xiangqing+")' style='float:left;left:290px;top:5px;position:absolute;'>详情</button>"+
            			"</div>";
            		piao.innerHTML = inner;
            		searchFlight.appendChild(piao);
            	}
            }  
         });  
	}
}
function xiangqing(e){
	var div = document.createElement("div");
	$(div).attr("class","xiangxi");
	div.style.cssText="width:500px;height:300px;background:#99FFCC;position:absolute;left:0;top:55%;right:0;bottom:0;margin:auto;";
	
	var div0 = document.createElement("div");
	div0.innerHTML="头等舱剩余票数";
	div0.style.cssText="width:240px;height:20px;font-size:16px;text-align:center;position:absolute;left:0;top:10px;";
	
	var div1 = document.createElement("div");
	div1.innerHTML=e.first_class_remain_seats;
	div1.style.cssText="width:240px;height:20px;font-size:20px;text-align:left;position:absolute;left:250px;top:10px;";
	
	var div2 = document.createElement("div");
	div2.innerHTML="商务舱剩余票数";
	div2.style.cssText="width:240px;height:20px;font-size:16px;text-align:center;position:absolute;left:0;top:40px;";
	
	var div3 = document.createElement("div");
	div3.innerHTML=e.business_class_remain_seats;
	div3.style.cssText="width:240px;height:20px;font-size:20px;text-align:left;position:absolute;left:250px;top:40px;";
	
	var div4 = document.createElement("div");
	div4.innerHTML="经济舱剩余票数";
	div4.style.cssText="width:240px;height:20px;font-size:16px;text-align:center;position:absolute;left:0;top:70px;";
	
	var div5 = document.createElement("div");
	div5.innerHTML=e.economy_class_remain_seats;
	div5.style.cssText="width:240px;height:20px;font-size:20px;text-align:left;position:absolute;left:250px;top:70px;";
	
	var div6 = document.createElement("div");
	div6.innerHTML="头等舱价格";
	div6.style.cssText="width:240px;height:20px;font-size:16px;text-align:center;position:absolute;left:0;top:100px;";
	
	var div7 = document.createElement("div");
	div7.innerHTML=e.first_price;
	div7.style.cssText="width:240px;height:20px;font-size:20px;text-align:left;position:absolute;left:250px;top:100px;";
	
	var div8 = document.createElement("div");
	div8.innerHTML="商务舱价格";
	div8.style.cssText="width:240px;height:20px;font-size:16px;text-align:center;position:absolute;left:0;top:130px;";
	
	var div9 = document.createElement("div");
	div9.innerHTML=e.business_price;
	div9.style.cssText="width:240px;height:20px;font-size:20px;text-align:left;position:absolute;left:250px;top:130px;";
	
	var div10 = document.createElement("div");
	div10.innerHTML="经济舱价格";
	div10.style.cssText="width:240px;height:20px;font-size:16px;text-align:center;position:absolute;left:0;top:160px;";
	
	var div11 = document.createElement("div");
	div11.innerHTML=e.economy_price;
	div11.style.cssText="width:240px;height:20px;font-size:20px;text-align:left;position:absolute;left:250px;top:160px;";
	
	var div12 = document.createElement("div");
	div12.innerHTML="出发时间";
	div12.style.cssText="width:240px;height:20px;font-size:16px;text-align:center;position:absolute;left:0;top:190px;";
	
	var div13 = document.createElement("div");
	div13.innerHTML=time(e.departure_time);
	div13.style.cssText="width:240px;height:20px;font-size:20px;text-align:left;position:absolute;left:250px;top:190px;";
	
	var div14 = document.createElement("div");
	div14.innerHTML="到达时间";
	div14.style.cssText="width:240px;height:20px;font-size:16px;text-align:center;position:absolute;left:0;top:220px;";
	
	var div15 = document.createElement("div");
	div15.innerHTML=time(e.departure_time);
	div15.style.cssText="width:240px;height:20px;font-size:20px;text-align:left;position:absolute;left:250px;top:220px;";
	
	var exit = document.createElement("button");
	$(exit).attr("class","exit3");
	$(exit).attr("onClick","exit3()");
	$(exit).html("返回");
	exit.style.cssText="width:100px;height:30px;font-size:20px;position:absolute;bottom:20px;left:200px";
	
	div.appendChild(div0);
	div.appendChild(div1);
	div.appendChild(div2);
	div.appendChild(div3);
	div.appendChild(div4);
	div.appendChild(div5);
	div.appendChild(div6);
	div.appendChild(div7);
	div.appendChild(div8);
	div.appendChild(div9);
	div.appendChild(div10);
	div.appendChild(div11);
	div.appendChild(div12);
	div.appendChild(div13);
	div.appendChild(div14);
	div.appendChild(div15);
	div.appendChild(exit);
	document.body.appendChild(div);
}
function exit3(){
	$(".xiangxi").css({"display":"none"});
}
function time(sj)
{
    var now = new Date(sj);
    var   year=now.getFullYear();    
      var   month=now.getMonth()+1;    
      var   date=now.getDate();    
      var   hour=now.getHours();    
      var   minute=now.getMinutes();    
      var   second=now.getSeconds();    
      return   year+"-"+month+"-"+date+"   "+hour+":"+minute+":"+second;    
     
}

function buy(obj){
	var id =$(obj).parents(".result").attr("id");
	console.log(id);

	var div = document.createElement("div");
	$(div).attr("class","buy");
	div.style.cssText="width:500px;height:300px;background:#99FFCC;position:absolute;left:0;top:55%;right:0;bottom:0;margin:auto";
	var div1 = document.createElement("div");
	div1.innerHTML="请选择舱位"
	div1.style.cssText="width:100%;height:50px;font-size:30px;margin-top:50px";
	div.appendChild(div1);
	
	var select = document.createElement("select");
	$(select).attr("name","cang");
	$(select).attr("id",id);
	select.style.cssText="width:300px;height:50px;font-size:30px;margin-left:100px;margin-top:20px";
	
	var option1 = document.createElement("option");
	$(option1).attr("value",1);
	$(option1).attr("selected","selected");
	$(option1).html("头等舱");
	
	var option2 = document.createElement("option");
	$(option2).attr("value",2);
	$(option2).html("商务舱");
	
	var option3 = document.createElement("option");
	$(option3).attr("value",3);
	$(option3).html("经济舱");
	
	select.appendChild(option1);
	select.appendChild(option2);
	select.appendChild(option3);
	
	var submit = document.createElement("button");
	$(submit).attr("class","buy");
	$(submit).attr("onClick","order()");
	$(submit).html("购买");
	submit.style.cssText="width:100px;height:30px;font-size:20px;bottom:50px;left:50px;position:absolute;";
	
	var exit = document.createElement("button");
	$(exit).attr("class","exit1");
	$(exit).attr("onClick","exit1()");
	$(exit).html("退出");
	exit.style.cssText="width:100px;height:30px;font-size:20px;bottom:50px;left:300px;position:absolute;";
	/*
	 * form.appendChild(select); form.appendChild(submit);
	 */
	
	div.appendChild(select);
	div.appendChild(submit);
	div.appendChild(exit);
	document.body.appendChild(div);
}
function exit1(){
	$(".buy").css({"display":"none"});
}
function buy1(obj){
	var id =$(obj).parents("tr").attr("id");
	console.log(id);

	var div = document.createElement("div");
	$(div).attr("class","buy1");
	div.style.cssText="width:500px;height:300px;background:#99FFCC;position:absolute;left:0;top:55%;right:0;bottom:0;margin:auto";
	var div1 = document.createElement("div");
	div1.innerHTML="请选择舱位"
	div1.style.cssText="width:100%;height:50px;font-size:30px;margin-top:50px";
	div.appendChild(div1);
	
	/*
	 * var form = document.createElement("form"); $(form).attr("action","#");
	 * $(form).attr("method","post");
	 */
	
	var select = document.createElement("select");
	$(select).attr("name","cang");
	$(select).attr("id",id);
	select.style.cssText="width:300px;height:50px;font-size:30px;margin-left:100px;margin-top:20px";
	
	var option1 = document.createElement("option");
	$(option1).attr("value",1);
	$(option1).attr("selected","selected");
	$(option1).html("头等舱");
	
	var option2 = document.createElement("option");
	$(option2).attr("value",2);
	$(option2).html("商务舱");
	
	var option3 = document.createElement("option");
	$(option3).attr("value",3);
	$(option3).html("经济舱");
	
	select.appendChild(option1);
	select.appendChild(option2);
	select.appendChild(option3);
	
	var submit = document.createElement("button");
	$(submit).attr("class","gaiqian3");
	$(submit).attr("onClick","gaiqian3()");
	$(submit).html("购买");
	submit.style.cssText="width:100px;height:30px;font-size:20px;bottom:50px;left:50px;position:absolute;";
	
	var exit = document.createElement("button");
	$(exit).attr("class","exit2");
	$(exit).attr("onClick","exit2()");
	$(exit).html("退出");
	exit.style.cssText="width:100px;height:30px;font-size:20px;bottom:50px;left:300px;position:absolute;";
	/*
	 * form.appendChild(select); form.appendChild(submit);
	 */
	
	div.appendChild(select);
	div.appendChild(submit);
	div.appendChild(exit2);
	document.body.appendChild(div);
}
function exit2(){
	$(".buy1").css({"display":"none"});
}
function order(){
	var  cang = $("option:selected").attr("value");
	console.log(cang);
	var card = $(".hidden").attr("card");
	console.log(card);
	var flightId = $("select").attr("id");
	console.log(flightId);
	
// var data = {"flightId":flightId,"card":card,"cang":cang};
	
	$.ajax({
		url:"/airsys/insert1",
	// dataType:"json",
	// type:"post",
	// contentType:"application/json;charset=utf-8",
	// data:JSON.stringify(data),
		data:{
			flightNumber:flightId,
			idCard:card,
			grade:cang
		},
		success:function(e){
			console.log(e)
			var result=e.replace(/\s/g, "");
			
			if(result=="ok"){
				alert("买票成功")
			}else{
				alert("买票失败")
			}
	  }
		
	});
}

function tuipiao(obj){
	var id_card = $(".hidden").attr("card");
	var flight_id =$(obj).parents("tr").find(".flight_number").html();
	console.log(id_card);
	console.log(flight_id);
	
// var data = {"id_card":id_card,"flight_id":flight_id};
	$.ajax({
		url:"/airsys/TuiOrder",
	// type:"post",
	// dataType:"json",
	// contentType:"application/json;charset=utf-8",
	// data: JSON.stringify(data),
		
		data:{
			flightNumber:flight_id,
			IdCard:id_card
		},
		success:function(e){
			console.log(e)
			var result=e.replace(/\s/g, "");
			
			if(result=="ok"){
				alert("退票成功");
				window.location.herf=window.location.href;
			}else{
				alert("退票失败")
			}
		}
		
	})
}

function seeOrder(){ 
	$(".table2 tbody").remove();
	var content = document.querySelector(".orderContent");
	var card = $(".hidden").attr("card");
	var table2 = document.querySelector(".table2 tbody");
	console.log(card);
	var data = {"card":card}
	$.ajax({
		url:"seeOrder",
		type:"post",
		dataType:"json",
		contentType:"application/json;charset=utf-8",
		data: JSON.stringify(data),
		success:function(e){
			console.log(e);
			for (var i = 0; i < e.length; i++) {			
				console.log(e[i].passenger_name);
				var tr = document.createElement("tr");
				$(tr).attr("id",e[i].id);
				var td = "";
				td += "<td class='order flight_number'>"+e[i].flight_number+"</td>";
				td += "<td class='order'>"+e[i].passenger_name+"</td>";
				td += "<td class='order order_date'>"+e[i].order_date+"</td>";
				td += "<td class='order grade'>"+e[i].grade+"</td>";
				td += "<td class='order'>"+e[i].branch_id+"</td>";
				td += "<td class='order'>"+e[i].sales_id+"</td>";
				td += `<td class='order'>
						<button class="gaiqian" onClick="gaiqian(this)">改签</button>
					<button class="tuipiao" onClick="tuipiao(this)">退票</button>
					</td>`;
				tr.innerHTML=td;
				console.log(tr)
				$(".table2").append(tr)
				
			}
		}
	})
}

function gaiqian(obj){
	// 航班id
	var flight_number = $(obj).parents("tr").find(".flight_number").html();
	var order_date = $(obj).parents("tr").find(".order_date").html();
	console.log(order_date);
	console.log(flight_number);
	$(".result1").remove();
	$(".box3").css({ "display": "block"});
	data = {"flight_number":flight_number,"order_date":order_date};
	$.ajax({
		url: "gaiqian",  
		dataType:"json",
        type: "post",  
        contentType:"application/json;charset=utf-8",
        data: JSON.stringify(data),
        success:function(e){
        	console.log(e)
        	for (var i = 0; i < e.length; i++) {
            		var tr = document.createElement("tr");
            		$(tr).attr("class","result1");
            		$(tr).attr("id",e[i].flight_number);
            		var td = "";
        			td+="<td class='tdx14'>"+e[i].from_city+"</td>";
        			td+="<td class='tdx15'>"+e[i].to_city+"</td>";
        			td+="<td class='tdx16'>"+time(e[i].departure_time)+"</td>";
        			td+="<td class='tdx16'>"+time(e[i].arrival_time)+"</td>";
        			td+="<td class='tdx17'>"+e[i].start_airplane+"</td>";
        			td+="<td class='tdx18'>"+e[i].end_airplane+"</td>";
        			td+="<td class='tdy19'>"+e[i].first_class_remain_seats+"</td>";
        			td+="<td class='tdy20'>"+e[i].business_class_remain_seats+"</td>";
        			td+="<td class='tdy21'>"+e[i].economy_class_remain_seats+"</td>";
        			td+="<td class='tdy22'>"+e[i].first_price+"</td>";
        			td+="<td class='tdy23'>"+e[i].business_price+"</td>";
        			td+="<td class='tdy24'>"+e[i].economy_price+"</td>";
            		td+=`<td class='tdy25'>
        				<button class="gaiqian2" onClick="buy1(this)">改签</button>
        				</td>`;
        			tr.innerHTML=td;
        			$(".table3 tbody").append(tr);
        	}
        }
	})
}
function gaiqian3(obj){

	var old_fNumber = $(".gaiqian").parents("tr").children(".flight_number").html();
	console.log(old_fNumber);
	var new_fNumber = $(".gaiqian2").parents("tr").attr("id");
	console.log(new_fNumber);
	var old_grade = $(".gaiqian").parents("tr").children(".grade").html();
	console.log("旧舱位是："+old_grade);
	var new_grade = $("option:selected").val();
	console.log("新的舱位是："+new_grade);
	var id_card = $(".hidden").attr("card");
	console.log(id_card);
	
	// var data =
	// {"old_fNumber":old_fNumber,"new_fNumber":new_fNumber,"old_grade":old_grade,"new_grade":new_grade,"id_card":id_card}
	$.ajax({
		url:"/airsys/updateTicket1",
		// type:"post",
	// dataType:"json",
	// contentType:"application/json;charset=utf-8",
		data:{
			flightNumber:old_fNumber,
			grade:old_grade,
			idCard:id_card,
			flightNumber1:new_fNumber,
			grade1:new_grade
		},
		success:function(e){
			console.log(e)
			var result=e.replace(/\s/g, "");
			
			if(result=="ok"){
				alert("改签成功");
				window.location.herf=window.location.href;
			}else{
				alert("改签失败")
			}
		}
		
	})
}

