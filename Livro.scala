
import Obra.Obra

//titulo, autor,cunho,data,tipo,editora
class Livro (var titulo: String, var autor: String, var cunho: String, var data: String, var tipo: String, var editora: String) extends Obra(autor,cunho,data){

	override def toString = s"Titulo: $titulo de $autor"


}