function saledelete(id){
	var isdelete = confirm("是否删除?")
	if(isdelete){
		window.location.href='/airsys/saledelete/'+id;
	}
}