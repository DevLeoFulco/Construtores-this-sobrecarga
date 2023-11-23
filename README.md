# README

## Visão Geral

Este repositório contém um programa Java projetado para demonstrar os conceitos de Construtores, a palavra-chave `this` e Sobrecarga de Métodos. O programa simula um sistema simples de gerenciamento de inventário para produtos, permitindo que os usuários insiram dados do produto, atualizem quantidades em estoque e exibam informações atualizadas.

## Conceitos Demonstrados

### Construtores

Na programação orientada a objetos, construtores são métodos especiais usados para inicializar objetos. No código fornecido, a classe `Produtos` possui dois construtores:

1. **Construtor Parametrizado com Quantidade:**
   ```java
   public Produtos(String name, double price, int quantity) {
       this.name = name;
       this.price = price;
       this.quantity = quantity;
   }
   ```
   Este construtor inicializa o objeto `Produtos` com um nome, preço e quantidade especificados.

2. **Construtor Parametrizado sem Quantidade:**
   ```java
   public Produtos(String name, double price) {
       this.name = name;
       this.price = price;
   }
   ```
   Este construtor é uma versão sobrecarregada sem o parâmetro de quantidade. Permite a criação de objetos `Produtos` sem especificar uma quantidade inicial.

### Palavra-Chave `this`

A palavra-chave `this` em Java é uma variável de referência que se refere ao objeto atual. Frequentemente é usada para diferenciar variáveis de instância de parâmetros em construtores e métodos. Por exemplo:
   ```java
   this.name = name;
   this.price = price;
   ```

### Sobrecarga de Métodos

A Sobrecarga de Métodos permite que uma classe tenha vários métodos com o mesmo nome, mas com parâmetros diferentes. Na classe `Produtos`, a sobrecarga de métodos é demonstrada com os métodos `addProduto` e `removeProduto`:
   ```java
   public void addProduto(int quantity) {
       this.quantity += quantity;
   }

   public void removeProduto(int quantity) {
       this.quantity -= quantity;
   }
   ```

## Como Usar

1. Clone o repositório em sua máquina local.
   ```bash
   git clone https://github.com/seu-nome/nome-do-repositorio.git
   ```

2. Abra o projeto em seu ambiente de desenvolvimento Java preferido.

3. Execute a classe `Program` para executar a simulação de gerenciamento de inventário.

4. Siga as instruções na tela para inserir dados do produto, atualizar quantidades em estoque e visualizar as informações atualizadas.

## Exemplo

Aqui está um exemplo de como o programa pode ser usado:

1. Insira dados do produto:
   - Nome: Laptop
   - Preço: 899.99

2. Visualize os dados iniciais do produto:
   ```
   Dados do produto: Laptop, R$ 899,99, 0 unidades, Total: R$ 0,00
   ```

3. Adicione 5 unidades ao estoque:
   ```
   Dados atualizados: Laptop, R$ 899,99, 5 unidades, Total: R$ 4.499,95
   ```

4. Remova 2 unidades do estoque:
   ```
   Dados atualizados: Laptop, R$ 899,99, 3 unidades, Total: R$ 2.699,97
   ```

## Conclusão

Este projeto serve como uma implementação prática de conceitos fundamentais de programação orientada a objetos em Java. Ao explorar construtores, a palavra-chave `this` e sobrecarga de métodos, você obtém uma compreensão melhor de como estruturar e inicializar objetos em seus programas. Sinta-se à vontade para explorar e modificar o código para aprofundar sua compreensão desses conceitos. Bons estudos!
