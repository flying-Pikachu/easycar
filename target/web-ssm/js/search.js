function search() {
	var carBrand = $('#carBrand').val();
	console.log(carBrand);
//	  低层实现 支持错误处理
	  $.ajax({
	    	url:"http://localhost:8080/yirenSystem/GetCars?from=true",
	    	async:true,// false
	    	type:"POST",//GET
	    	//default text(文本传输) 服务器传回来的就是文本传输，json传回来的就是json对象
	    	dataType:"json",// xml
		  	contentType:"application/x-www-form-urlencoded; charset=utf-8",
	    	// parameter
	    	data:{carBrand:carBrand},
	    	success:function(result){
	        console.log(JSON.stringify(result));
                $("#table1  tr:not(:first)").html("");
                for(var i=0,l=result.length;i<l;i++) {

                    var newObj = $(
                        "<tr bgcolor='EEF2FD'>" +
                        "<td width='9%'>" +
                        "<div align='center'>" + (i + 1) + "</div>" +
                        "</td>" +
                        "<td width='9%'>" +
                        "<div align='center'>" + result[i].carID + "</div>" +
                        "</td>" +
                        "<td width='9%'>" +
                        "<div align='center'>" + result[i].carBrand + "</div>" +
                        "</td>" +
                        "<td width='9%'>" +
                        "<div align='center'>" + result[i].carModel + "</div>" +
                        "</td>" +
                        "<td width='9%'>" +
                        "<div align='center'>" + result[i].carStruct + "</div>" +
                        "</td>" +
                        "<td width='9%'>" +
                        "<div align='center'>" + result[i].isManual + "</div>" +
                        "</td>" +
                        "<td width='9%'>" +
                        "<div align='center'>" + result[i].maxMum + "</div>" +
                        "</td>" +
                        "<td width='9%'>" +
                        "<div align='center'>" + result[i].originalPrice + "</div>" +
                        "</td>" +
                        "<td width='9%'>" +
                        "<div align='center'>" + result[i].discount + "</div>" +
                        "</td>" +
                        "<td width='9%'>" +
                        "<div align='center'>" +
                        "<a href=''>delete</a>" +"&nbsp;&nbsp;&nbsp;&nbsp;"+
                        "<a href=''>update</a>" +
                        "</div>" +
                        "</td>" +
                        "</tr>");
                    $('#table1').append(newObj);
                }
				}});
}
$(function(){
	$("#sub").click(function(){
		alert("点击了");
		search();
	  });
});