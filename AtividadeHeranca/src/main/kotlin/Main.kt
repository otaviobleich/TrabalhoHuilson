// Otavio Bleich,
// Charles Teixeira,
// Eduardo Colella,
// João Pedro Sartor,
// João Gabriel Dalla Costa

// Classe base (superclasse) com atributos comuns
open class Pessoa(
    val nome: String,
    val cpf: String
)

// Classe Cliente que herda de Pessoa
class Cliente(
    nome: String,
    cpf: String,
    val limiteCredito: Double
) : Pessoa(nome, cpf)

// Classe Profissional que herda de Pessoa
class Profissional(
    nome: String,
    cpf: String,
    val profissao: String
) : Pessoa(nome, cpf)

// Testando
fun main() {
    val cliente = Cliente("João", "12345678900", 5000.0)
    val profissional = Profissional("Maria", "98765432100", "Engenheira")

    println("Cliente: ${cliente.nome}, CPF: ${cliente.cpf}, Limite: ${cliente.limiteCredito}")
    println("Profissional: ${profissional.nome}, CPF: ${profissional.cpf}, Profissão: ${profissional.profissao}")
}


