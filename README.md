# Conversor de Moeda

Um aplicativo Java simples para converter valores entre diferentes moedas usando a API ExchangeRate-API.

## 📝 Descrição

Este conversor de moedas permite aos usuários converter valores entre as seguintes moedas:
- Dólar Americano (USD)
- Real Brasileiro (BRL)
- Peso Argentino (ARS)
- Peso Colombiano (COP)

O aplicativo usa a ExchangeRate-API v6 para obter taxas de câmbio em tempo real, garantindo conversões precisas baseadas nos valores de mercado atuais.

## ✨ Funcionalidades

- Interface de linha de comando (CLI) simples e intuitiva
- Conversão entre múltiplos pares de moedas
- Taxas de câmbio atualizadas em tempo real
- Tratamento de erros para requisições à API
- Menu interativo para facilitar o uso

## 🛠️ Requisitos

- Java JDK 8 ou superior
- Conexão com a internet (para acessar a API de taxas de câmbio)
- Biblioteca Gson (Google JSON) para processamento de JSON
- Chave de API válida da ExchangeRate-API

## 📦 Dependências

- **Gson**: Biblioteca para processamento de JSON
    - Versão recomendada: 2.8.9 ou superior
    - [Download da biblioteca Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson)

## 🖥️ Como usar

1. Execute o aplicativo
2. Selecione uma das opções de conversão numeradas (1-6) ou escolha a opção 7 para sair
3. Digite o valor que deseja converter
4. O resultado da conversão será exibido
5. O menu será mostrado novamente para novas conversões até que você escolha sair

## 🔄 Opções de conversão disponíveis

1. Dólar para Real
2. Real para Dólar
3. Dólar para Peso Argentino
4. Peso Argentino para Dólar
5. Dólar para Peso Colombiano
6. Peso Colombiano para Dólar
7. Sair


## 🧩 Estrutura do código

- `main()`: Ponto de entrada do programa que configura o scanner e executa o loop principal
- `menuEscolha()`: Exibe o menu, processa a escolha do usuário e realiza a conversão
- `pegarFatorDeConversao()`: Conecta-se à API para obter a taxa de conversão entre duas moedas

## 🔧 Solução de problemas comuns

- **Erro de conexão**: Verifique sua conexão com a internet
- **Resposta "0" nas conversões**: Verifique se sua chave de API é válida
- **Erro de compilação**: Certifique-se de que a biblioteca Gson está corretamente incluída no classpath

## 📈 Possíveis melhorias futuras

- Adicionar mais moedas para conversão
- Implementar interface gráfica de usuário (GUI)
- Adicionar histórico de conversões
- Implementar cache das taxas de câmbio para reduzir chamadas à API
- Exibir gráficos de variação cambial


Desenvolvido por Jess

---

