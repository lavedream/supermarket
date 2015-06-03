SalesOrderNew=function(){}
SalesOrderNew.prototype={
		init:function(){},
		saveSalesOrder:function(){
			 
		},
		sumProductPrice:function(src){
			var nums=$(src).val();
			var price=$(src).attr("data_price");
			$("#productSum"+$(src).attr("pid")).val(price*nums);
		},
		addProductNumber:function(pid){
			var num=eval($("#num"+pid).val());
			$("#num"+pid).val(num+1);
			$("#num"+pid).trigger("onchange");
		},
		minusProductNumber:function(pid){
			var num=eval($("#num"+pid).val());
			if(num>0){
				$("#num"+pid).val(num-1);
				$("#num"+pid).trigger("onchange");
			}

		},
		dropProduct:function(src){
			$(src).parent().parent().detach();
		},
		addProduct:function(data){
			data=eval("("+data+")");
			
			var trStr="<tr id='"+data.pid+"'>";
				trStr=trStr+"<td>"+data.project_code+"</td>";
				trStr=trStr+"<td>"+data.product_name+"</td>";
				trStr=trStr+"<td>"+data.purchase_price+"</td>";
				trStr=trStr+"<td> <input type='text' id='num"+data.pid+"' value='1' pid='"+data.pid+"' data_price='"+data.purchase_price+"' onchange='salesOrderNew.sumProductPrice(this)'></td>";
				trStr=trStr+"<td> <input type='text' id='productSum"+data.pid+"' > </td>";
				
				trStr=trStr+"<td>";
					trStr=trStr+"<button class='btn btn-blue' type='button' onclick='salesOrderNew.addProductNumber("+data.pid+")'>+</button>"
					trStr=trStr+"<button class='btn btn-blue' type='button' onclick='salesOrderNew.minusProductNumber("+data.pid+")'>-</button>"
					trStr=trStr+"<button class='btn btn-blue' type='button' onclick='salesOrderNew.dropProduct(this)'>删除</button>"
				trStr=trStr+"</td>";
				
				trStr=trStr+"</tr>";
				
				$("#productTbody").append(trStr);
				
		},
		searchProductByProductCode:function(){
			

			var paramData={
					productCode:productCodeStr=$("#productCode").val()
			}
			
			$.post("/salesOrder/seachProduct.html",paramData,function(data){
				salesOrderNew.addProduct(data);
			});
			
			
		}
		
		
}




var salesOrderNew=new SalesOrderNew();

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
