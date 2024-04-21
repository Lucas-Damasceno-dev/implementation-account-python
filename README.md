# Sistema de Gerenciamento de Contas Bancárias
Este é um sistema simples de gerenciamento de contas bancárias desenvolvido em Java. Ele permite aos usuários abrir contas poupança ou corrente, fazer depósitos, saques e fechar suas contas. O sistema fornece funcionalidades básicas para gerenciar saldos de contas e status de conta.

## Funcionalidades
- Abrir Conta: Permite aos usuários abrir uma conta poupança ou corrente. O sistema exibe informações sobre cada tipo de conta e define o saldo inicial conforme necessário.
- Fechar Conta: Permite aos usuários fechar sua conta se não houver saldo pendente.
- Depósito: Permite aos usuários depositar dinheiro em sua conta. Eles devem fornecer um valor de depósito positivo.
- Saque: Permite aos usuários sacar dinheiro de sua conta, desde que tenham fundos suficientes. Eles devem inserir um valor de saque válido.
- Pagamento de Taxa Mensal: Deduz automaticamente uma taxa mensal do saldo da conta com base no tipo de conta.
  
## Estrutura da Classe
- BankAccount.java: Define a classe BankAccount, que representa uma conta bancária. Ela contém métodos para abrir, fechar, depositar, sacar e pagar taxas mensais para a conta.

## Como Usar
Para usar o sistema de gerenciamento de contas bancárias, siga estas etapas:

1. Compile o arquivo BankAccount.java usando um compilador Java.
2. Execute o arquivo compilado para executar o programa.
3. Siga as instruções fornecidas pelo sistema para interagir com as diferentes funcionalidades, como abrir uma conta, depositar ou sacar dinheiro e fechar uma conta.
Exemplo de Uso
```
public static void main(String[] args) {
    BankAccount conta = new BankAccount(0, false);

    // Abrir uma nova conta
    String tipoConta = conta.openAccount();
    System.out.println("Conta aberta com sucesso: " + tipoConta);

    // Depositar dinheiro na conta
    conta.deposit();

    // Sacar dinheiro da conta
    conta.withdraw();

    // Fechar a conta
    conta.closeAccount();
}
```

## Contribuições
Contribuições para este projeto são bem-vindas. Se você encontrar algum problema ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença
Este projeto está licenciado sob a Licença MIT.
