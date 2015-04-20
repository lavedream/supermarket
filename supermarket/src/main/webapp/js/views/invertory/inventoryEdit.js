InventoryEdit=function(){}
InventoryEdit.prototype={
		init:function(){
			alert("ok");
		},
		saveInventory:function(){
			$.post("/inventory/inventoryEditSave.html",$("#inventoryForm").serialize(),function(data){
				data=eval(data);
				if(null != data && data.messageStatus == "000000"){
					alert(data.message);
				}else{
					alert(data.messageStatus +"--"+ data.message);
				}
			});
		}
}

var inventoryEdit=new InventoryEdit();