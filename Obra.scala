abstract class Obra (var autor: var String, var cunho: String, var data: String){

	def retornaAutor = autor
	def retornaCunho = cunho
	def retornaData = data

	override def toString = "Autor: " + autor + ", Cunho: " + cunho + ", Data: " + data

}