ProductEdit=function(){}
ProductEdit.prototype={
	init:function(){
		alert("ok");
	},
	saveProduct:function(){
		$.post("/hello/editProduct.html",$("#productForm").serialize(),function(data){
			if(null !=data && data.messageStatus=="000000"){
				alert(data.message);
			}else{
				alert(data.messageStatus +" "+data.message);
			}
		});
	}
	
}

var productEdit=new ProductEdit();