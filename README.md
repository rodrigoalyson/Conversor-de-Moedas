# Conversor de Moedas
Projeto com objetivo de converter a moeda de um país base para um país de referência. Ótimo para aplicações em viagens, onde deseja-se saber o valor da taxa de câmbio.

## Para usuários

Para utilizar a aplicação realize o daowload do projeto. O projeto possui a nove paises em sua base de dados para realizar as conversões de moeda entre eles.
O usuário deve escolher o país de origem e o país de destino com base na lista que aparece na tela. Depois de selecionar o número que equivale a posição do país na lista,
deve-se digitar o valor que deseja levar para a viagem e então o programa irá converter esse número com base na taxa de câmbio do momento.

## Para desenvolvedores

O programa utiliza a API Exchange Rate para pegar as informações de taxa de câmbio atual e realizar as conversões necessárias.
O programa é dividido em 5 blocos mais o bloco principal. 
O mainCambio é onde acontece a relação com o usuário e coleta as informações.
A TaxaCambio é um record que coleta as informações disponibilizadas pela API com base nos nomes originais e em formato json.
A ConversãoApiJava é uma classe que converte os valores da API de forma que fique mais visível para o usuário entender os dados de câmbio.
O BuscaTaxaCambio é a classe que recebe as informações do usuário e faz a busca na API.
O ListaPaises é uma função que imprime a lista dos paises disponíveis na aplicação.
O CodigoPais converte o nome do país digitado pelo usuário em um código de referência que será utilizado no endereço da busca na API.

**Autor:** Alyson Rodrigo Arruda de Souza
