
import scala.collection.mutable.ArrayBuffer

abstract class Obra (var autor: String, var cunho: String, var data: String){

	def retornaAutor = autor
	def retornaCunho = cunho
	def retornaData = data

	def toStringSuper = "Autor: " + autor + ", Cunho: " + cunho + ", Data: " + data

}


//titulo, autor,cunho,data,tipo,editora
class Livro (titulo: String, autor: String,cunho: String,data: String, var tipo: String, var editora: String) extends Obra(autor,cunho,data){

	override def toString = s"Titulo: $titulo de $autor"


}

class Cd (var album: String, autor: String,cunho: String,data: String, var tipo: String, var gravadora: String) extends Obra(autor, cunho, data){


	def toStringCD = s"Cantor: $autor, Album: $album"

}

object Main{

	def main(args: Array[String]){

		//titulo, autor,cunho,data,tipo,editora
		val livro = new Livro("Wild Cards", "Martin, G.", "Literário", "12/12/2010", "Livro", "LeYa")

		println(livro.toString)
		println(livro.toStringSuper)

		val cd1 = new Cd("Baby", "PitBull", "Composição musical", "22/22/2012", "CD", "EMI")
		println(cd1.toStringCD)
		println(cd1.toStringSuper)

		var itens = ArrayBuffer[Obra]()

		itens += livro
		itens += cd1

		println("Teste: " + itens(0).toStringSuper)


	}
}