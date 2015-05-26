object sourcecode{
def main(args: Array[String])
{
var pi = BigDecimal("1.0")
var n = BigDecimal(1.0)
var d = BigDecimal(3.0)
val iterations = 1000
var i = 1
for(i <- 2 to iterations)
{
pi = pi+(n/d)
n=n*i
d=d*(2*i+1)
}
println(pi*2)
}
}
