var row;
window.generateTable = function () {
	row = document.getElementById("numberOfRows").value;
	if(isNaN(row) || row == ""){
		alert("Please enter numeric values");
	}
	else{
		var tableStart="<table id='myTable' align='center' style = 'border : 3px solid black;'>";
        var tableEnd = "</table>";
        var trStart = "<tr>";
        var trEnd = "</tr>";
        var tdStart = "<td>";
        var tdEnd = "</td>";
        var thStart = "<th>";
        var thEnd = "</th>";
        var inpName = "<input type='text' class = 'name'";
		var inpNameEnd =">";
		var inpMin = "<input type='number' class = 'minmax' max ='10' min='1'";
 		var inpMinEnd =">";
 		var inpMax = "<input type='number' class = 'minmax' max = '10' min = '1'";
 		var inpMaxEnd =">";
        document.write(tableStart);
        document.write(trStart);
        document.write(thStart + "Name" + thEnd);
    	document.write(thStart + "Min" + thEnd);
    	document.write(thStart + "max" + thEnd);
    	document.write(trEnd);
        for (var r=1;r<=row;r++) { 
        	document.write(trEnd);
            	document.write(tdStart + inpName + "id=" + 'name'+r + inpNameEnd + tdEnd);
            	document.write(tdStart + inpMin + "id=" + 'min'+r + inpMinEnd + tdEnd);
            	document.write(tdStart + inpMax + "id=" + 'max'+r + inpMaxEnd + tdEnd);
            document.write(trEnd);
        }
        document.write("<tr><td colspan='3' align='center'><input type='button' id = 'colorGenerate' align='center' onclick='colorGenerator()' value='create color table'></td></tr>");
        document.write("<tr><td colspan='3' align='center'><input type='button' id = 'reset' align='center' onclick='reset()' value='Reset Table' disabled></td></tr>");
        document.write(tableEnd);
	}
}

function colorGenerator(){
	var flag = false;
	var tableStart="<table id='myNewTable' align='center' style = 'margin-top: 30px; width : 35%; border : 3px solid black; border-collapse : collapse'>";
    var tableEnd = "</table>";
    var trStart = "<tr style = 'height : 40px; border-bottom : 1px solid black';>";
    var trEnd = "</tr>";
    var tdStart = "<td class = 'dataTd' style='width:50px;'>";
    var tdEnd = "</td>";
    var tdStartName = "<td class = 'dataTD' style='border-right: 1px solid black; width:50px;'>";
    var newTd = "<td style='background-color:red;width:50px'>";
    for(var i=1;i<=row;i++) {
    	
    	var inpName = document.getElementById("name"+i).value;
		var inpMin = document.getElementById("min"+i).value;
		var inpMax = document.getElementById("max"+i).value;
		if(inpName == "" || inpMax < inpMin || inpMin <= 0 || inpMax <= 0 || inpMin > 10 || inpMax > 10) {
			flag = true;
			break;
		}
    }
	if(flag == false) {
        document.write(tableStart);
    	for(var i=1;i<=row;i++){
    		var inpName = document.getElementById("name"+i).value;
    		var inpMin = document.getElementById("min"+i).value;
    		var inpMax = document.getElementById("max"+i).value;
    		document.write(trStart + tdStartName + inpName + tdEnd);
    		
    		for(var j=1;j<=10;j++){
    			if(j>=inpMin && j<= inpMax){
    				document.write(newTd + tdEnd);
    			}
    			else{
    				document.write(tdStart + tdEnd);
    			}
    		}
    		document.write(trEnd);
    	}
    	document.write(tableEnd);
    	document.getElementById("colorGenerate").disabled = true;
    	document.getElementById("reset").disabled = false;
	}
	else {
		alert("Please Specify all correct details");
	}
}

function reset() {
	document.getElementById("myNewTable").remove();
	document.getElementById("colorGenerate").disabled = false;
	document.getElementById("reset").disabled = true;
}