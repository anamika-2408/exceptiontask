fun main(){
    val a = 30
    val b = 10
     val result = try{ a/b }
catch (e: ArithmeticException)
{
    println("number cannot be 0 ")
}
     catch (e:Exception){
         println("Characters cannot be entered!!!")
     }
}