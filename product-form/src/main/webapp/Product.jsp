<%@page isELIgnored = "false"%>

<html>
<body>
<h2>Product Form</h2>
${message}
<form action="save" method="post">
<pre>
Name<input type="text" name="name" value="${productDTO.name}">
Type<select name="type" value="${productDTO.type}">
    <option>--Select--</option>
    <option>Electonic</option>
    <option>Clothing</option>
    <option>Furniture</option>
    <option>Grocery</option>
    <option>Home Appliances</option>
    <option>Beauty Products</option>
    </select>
Cost<input type="number" name="cost" value="${productDTO.cost}">
Manf Company<select name="manfCompany" value="${productDTO.manfCompany}">
            <option>--Select--</option>
            <option>HP</option>
            <option>LG</option>
            <option>Nilkamal</option>
            <option>Jio Mart</option>
            <option>Adidas</option>
            <option>Fabindia</option>
            <option>L Oreal</option>
            <option>Maybelline</option>
            </select>
Manf Date<input type="calender" name="manfDate" value="${productDTO.manfDate}">
Warrenty<input type="number" name="warrenty" value="${productDTO.warrenty}">

<input type="submit" value="Save">
<a href="ProductSuccess.jsp"></a>
</pre>
</form>
</body>
</html>