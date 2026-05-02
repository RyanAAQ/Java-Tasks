var1 = 1 ;
var2 = 2;
var3 = 3;

var temp = var1;
var1 = var2;
var2 = var3;
var3 = temp;

process.stdout.write(var1, var2, var3);
