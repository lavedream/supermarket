SalesOrderNew=function(){}
SalesOrderNew.prototype={
		init:function(){},
		saveSalesOrder:function(){
			
		},
		sumProductPrice:function(src){
			var nums=$(src).val();
			var price=$(src).attr("data_price");
			$("#productSum").val(price*nums);
		},
		addProductNumber:function(){
			var num=eval($("#pid1").val());
			$("#pid1").val(num+1);
			$("#pid1").trigger("onchange");
		},
		minusProductNumber:function(){
			var num=eval($("#pid1").val());
			if(num>0){
				$("#pid1").val(num-1);
				$("#pid1").trigger("onchange");
			}

		},
		dropProduct:function(src){
			$(src).parent().parent().detach();
		}
}
var salesOrderNew=new SalesOrderNew();