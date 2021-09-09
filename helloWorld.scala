object  HelloWorld{
    def main(args:Array[String]){
        println("hello World")
        lazy val a1 = 10
        lazy val a2 = "b"
        val res = if(a1 == 10) 5 else 10
        val res2 = if(a1 != 10) 5 
        val res3 = {10} // return 10
        val res4 = {val a3 = 20 a1 + a3} // return 30
        

    }
}