window.onload=function(){
	var search = document.querySelector(".searchbtn");
	var table = document.querySelector(".table1 tbody");
	

	search.onclick=function(){
		$(".result").remove();
		var from_city = $(".from_city").val();
		var to_city = $(".to_city").val();
		var start_date = $(".start_date").val();
		
		console.log(from_city);
		console.log(to_city);
		console.log(start_date);
		
		
		
		var data = {"from_city":from_city,"to_city":to_city,"start_date":start_date};
		console.log(data);
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
            	console.log(e);
            	console.log(e.length);
            	for (var i = 0; i < e.length; i++) {
            		var tr = document.createElement("tr");
            		$(tr).attr("class","result");
            		$(tr).attr("id",e[i].flight_number);
            		var td = "";
            		if((typeof e[i].from_city) == "undefined"){
        				td+="<td> class='tdx1'"+"Null"+"</td>";
        			}else{
        				td+="<td class='tdx1'>"+e[i].from_city+"</td>";
        			}
            		if((typeof e[i].to_city) == "undefined"){
        				td+="<td class='tdx2'>"+"Null"+"</td>";
        			}else{
        				td+="<td class='tdx2'>"+e[i].to_city+"</td>";
        			}
            		if((typeof e[i].departure_time) == "undefined"){
        				td+="<td class='tdx3'>"+"Null"+"</td>";
        			}else{
        				td+="<td class='tdx3'>"+time(e[i].departure_time)+"</td>";
        			}
            		if((typeof e[i].arrival_time) == "undefined"){
        				td+="<td class='tdx4'>"+"Null"+"</td>";
        			}else{
        				td+="<td class='tdx4'>"+time(e[i].arrival_time)+"</td>";
        			}
            		if((typeof e[i].start_airplane) == "undefined"){
        				td+="<td class='tdx5'>"+"Null"+"</td>";
        			}else{
        				td+="<td class='tdx5'>"+e[i].start_airplane+"</td>";
        			}
            		if((typeof e[i].end_airplane) == "undefined"){
        				td+="<td class='tdx6'"+"Null"+"</td>";
        			}else{
        				td+="<td class='tdx6'>"+e[i].end_airplane+"</td>";
        			}
            		if((typeof e[i].first_class_remain_seats) == "undefined"){
        				td+="<td class='tdy7'>"+"Null"+"</td>";
        			}else{
        				td+="<td class='tdy7'>"+e[i].first_class_remain_seats+"</td>";
        			}
            		if((typeof e[i].business_class_remain_seats) == "undefined"){
        				td+="<td class='tdy8'>"+"Null"+"</td>";
        			}else{
        				td+="<td class='tdy8'>"+e[i].business_class_remain_seats+"</td>";
        			}
            		if((typeof e[i].economy_class_remain_seats) == "undefined"){
        				td+="<td class='tdy9'>"+"Null"+"</td>";
        			}else{
        				td+="<td class='tdy9'>"+e[i].economy_class_remain_seats+"</td>";
        			}
            		if((typeof e[i].first_price) == "undefined"){
        				td+="<td class='tdy10'>"+"Null"+"</td>";
        			}else{
        				td+="<td class='tdy10'>"+e[i].first_price+"</td>";
        			}
            		if((typeof e[i].business_price) == "undefined"){
        				td+="<td class='tdy11'>"+"Null"+"</td>";
        			}else{
        				td+="<td class='tdy11'>"+e[i].business_price+"</td>";
        			}
            		if((typeof e[i].economy_price) == "undefined"){
        				td+="<td class='tdy12'>"+"Null"+"</td>";
        			}else{
        				td+="<td class='tdy12'>"+e[i].economy_price+"</td>";
        			}
            		td+=`<td class='tdy13'>
        				<button class="buybtn" onClick="buy(this)">购买</button>
        				</td>`;
        			tr.innerHTML=td;
        			table.appendChild(tr)
            	}
            	
            }  
         });  
	}

	
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
	var id =$(obj).parents("tr").attr("id");
	console.log(id);

	var div = document.createElement("div");
	div.style.cssText="width:500px;height:300px;background:#99FFCC;position:absolute;left:0;top:50%;right:0;bottom:0;margin:auto";
	var div1 = document.createElement("div");
	div1.innerHTML="请选择舱位"
	div1.style.cssText="width:100%;height:50px;font-size:30px;margin-top:50px";
	div.appendChild(div1);
	
	/*var form = document.createElement("form");
	$(form).attr("action","#");
	$(form).attr("method","post");*/
	
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
	submit.style.cssText="width:100px;height:30px;font-size:20px;margin-top:20px;margin-left:200px";
	
	/*form.appendChild(select);
	form.appendChild(submit);*/
	
	div.appendChild(select);
	div.appendChild(submit);
	document.body.appendChild(div);
}

function order(){
	var  cang = $("option:selected").attr("value");
	console.log(cang);
	var card = $(".hidden").attr("card");
	console.log(card);
	var flightId = $("select").attr("id");
	console.log(flightId);
	
	var data = {"flightId":flightId,"card":card,"cang":cang};
	
	$.ajax({
		url:"order",
		dataType:"json",
		type:"post",
		contentType:"application/json;charset=utf-8",
		data:JSON.stringify(data), 
		success:function(e){
			console.log(e);
		}
	});
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
				td += "<td class='order'>"+e[i].grade+"</td>";
				td += "<td class='order'>"+e[i].passenger_type+"</td>";
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
	//航班id
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
        				<button class="buybtn" onClick="buy(this)">改签</button>
        				</td>`;
        			tr.innerHTML=td;
        			$(".table3 tbody").append(tr);
        	}
        }
	})
	
}

