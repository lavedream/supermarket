InventoryEdit=function(){}
InventoryEdit.prototype={
		init:function(){
			alert("ok");
		},
		saveInventory:function(){
			$.post("/inventory/inventoryEditSave.html",$("#example").serialize(),function(data){
				if(null !== data && data.messageStatus ==="000000"){
					alert(data.message);
				}else{
					alert(data.messageStatus +"--"+ data.message);
				}
			});
		}
}

var inventoryEdit=new InventoryEdit();