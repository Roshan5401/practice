function loop()
{
var row = prompt("Input number of rows");
var col = prompt("Input number of columns");
  var n=1;
 for(var r=0;r<parseInt(row);r++)
  {
   var x=document.getElementById('myTable').insertRow(r);
   for(var c=0;c<parseInt(col);c++)  
    {
     var y=  x.insertCell(c);
     y.innerHTML=n;
     n++; 
    }
   }
    const element = document.getElementById('Buttonid');
    element.remove();
}