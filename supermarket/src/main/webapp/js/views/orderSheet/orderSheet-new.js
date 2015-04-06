OrderSheetNew=function(){}
OrderSheetNew.prototype={
		init:function(){
			alert("ok");
		},
		saveOrderSheet:function(){
			$.post("/orderSheet/saveOrderSheet.html",$("#orderSheetForm").serialize(),function(data){
				if(null !== data && data.messageStatus ==="000000"){
					alert(data.message);
				}else{
					alert(data.messageStatus +"--"+ data.message);
				}
			});
		}
}

var orderSheetNew=new OrderSheetNew();