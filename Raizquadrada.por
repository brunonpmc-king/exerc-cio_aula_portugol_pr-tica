programa {
  inclua biblioteca Matematica
  real numero, raizDoNumero
  funcao inicio() {
    escreva("Raiz quadrada de um número ")
    escreva("\n" + "Insira um número: ")
    leia(numero)

    raizDoNumero = Matematica.raiz(numero, 2.0)

    escreva("A raiz do numero é: " + raizDoNumero)
  }
}
