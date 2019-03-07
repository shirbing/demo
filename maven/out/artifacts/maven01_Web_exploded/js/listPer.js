$(function () {
    function getlist(){
        $.ajax({
            type:"post",
            url:"listPerson",
            cache:false,
            processData:false,
            contentType:false,
            beforeSend:function () {
            },
            success:function (obj) {
                console.log(obj);
                var str="<td><div class=\"button-group\"><a class=\"button border-main\" href=\"reinfo.html\" onclick=\"reinfo(this)\"><span class=\"icon-edit\"></span> 修改</a><a class=\"button border-red\" href=\"javascript:void(0)\" onclick=\"dele(this)\"><span class=\"icon-trash-o\"></span> 删除</a></div></td>";
                for (var index in obj) {
                   var mode=obj[index];//取出数组中的对象 hero
                   //创建一个row
                   var tb=$(".tt");
                   var row=tb.insertRow(index);
                   var cell=row.insertCell(0);
                   cell.innerHTML=mode.id;
                   cell=row.insertCell(1);
                   var img=document.createElement("img");
                   img.setAttribute("src", mode.icon);
                   img.setAttribute("width", "60%");
                   cell.appendChild(img);
                   cell=row.insertCell(2);
                   cell.innerHTML=mode.name;
                   cell=row.insertCell(3);
                   cell.innerHTML=mode.age;
                   cell=row.insertCell(4);
                   cell.innerHTML=mode.sex;
                   cell=row.insertCell(5);
                   cell.innerHTML=mode.depart;
                   cell=row.insertCell(6);
                   cell.innerHTML=mode.phone;
                   cell=row.insertCell(7);
                   cell.innerHTML=mode.email;
                   cell=row.insertCell(8);
                   cell.innerHTML=mode.describe;
                   cell=row.insertCell(9);
                   cell.innerHTML=mode.sort;
                   cell=row.insertCell(10);
                   cell.innerHTML=str;
                }

            },
            error:function () {

            },
        });
    }
});