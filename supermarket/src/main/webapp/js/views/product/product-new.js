ProductNew=function(){}
ProductNew.prototype={
	init:function(){
		alert("ok");
	},
	saveProduct:function(){
		$.post("/hello/saveProduct.html",$("#productForm").serialize(),function(map){
			if(null !=map.data && map.data.messageStatus=="000000"){
				alert(map.data.message);
			}else{
				alert(mapdata.messageStatus +" "+map.data.message);
			}
		});
	}
	
}

var productNew=new ProductNew();