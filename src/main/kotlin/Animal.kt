//1. Crie uma classe abstrata chamada "Animal" com um método abstrato chamado
//"emitirSom". Crie duas classes derivadas de "Animal" chamadas "Cachorro" e
//"Gato" que implementam o método "emitirSom" para imprimir o som característico
//de cada animal.

abstract class Animal {

    abstract fun emitirSom():String

}