class Complex(real: Double, imaginary: Double){

	//O retorno será definido automaticamente pelo compilador.

	def re() = real
	def im() = imaginary

	override def toString() = "" + re() + (if (im() > 0) "re" else "+") + im() + "i"

	/*
	
	Métodos sem argumentos, para chamar é apenas usar c.re
	
	def re = real
	def im = imaginary

	*/
}

object ComplexNumbers{
	def main(args: Array[String]){
		val c = new Complex(1.5,1.6)
		println("imaginary part: " + c.im())
		println(c.toString())
	}
}