function loop()
{
    
var row = prompt("Input number of rows");
var col = prompt("Input number of columns");
  var n=1;
 for(var r=1;r<=parseInt(row);r++)
  {
   var x=document.getElementById('myTable').insertRow(r-1);
   for(var c=1;c<=parseInt(col);c++)  
    {
     var y=  x.insertCell(c-1);
     y.innerHTML=c*r;
     

    }
   }
    const element = document.getElementById('Buttonid');
    element.remove();
}