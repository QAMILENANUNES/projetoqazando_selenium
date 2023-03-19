#language:pt

  Funcionalidade: receber desconto da qazando
    Eu como usuário da qazando
    Quero receber cupom de desconto
    Para comprar um curso com valor reduzido

    Cenario:Visualizar codigo de desconto
      Dado que estou no site da qazando
      Quando preencho meu email
      E clico em ganhar cupom
      Então visualizo codigo de desconto