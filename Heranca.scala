/*
	Aplicando os conceitos de herança. 
	@author: Diogenes Laertius.
	@date 12/14/2015

*/


abstract class Pessoa (nome: String, cpf: Double){
	def retornaNome = nome
	def retornaCPF = cpf

	override def toString = "Nome: " + nome + ", CPF: " + cpf 
}


class Professor(nome: String, cpf: Int, ensinaOq: String) extends Pessoa (nome, cpf){
	def retornaEnsinaOQ = ensinaOq

	override def toString = "Nome: " + nome + ", CPF: " + cpf + ", Ensina: " + ensinaOq
}

object ComplexNumbers{
	def main(args: Array[String]){
		val pessoa = new Professor("Diogenes", 1111, "Física")
		println(pessoa.retornaEnsinaOQ)
		println(pessoa.toString)
	}
}