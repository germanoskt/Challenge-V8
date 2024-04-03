# Challenge-V8

# Como inicializar a aplicação

*PRÉ REQUISITOS:*
- JRE(Java Runtime Environment) ou JDK(Java Development Kit), ambos podem ser encontrados neste link: https://www.java.com/;

## 1. Abra o terminal no local do arquivo executável;
O caminho é: "Challenge-V8/out/artifacts/Challenge_V8_jar" clique com o botão direito na pasta e selecione "abrir no terminal";
<img width="254" alt="image" src="https://github.com/germanoskt/Challenge-V8/assets/142634508/def8d360-e76a-479b-85ce-25fef7673011">

## 2. Insira o comando "java -jar Challenge-V8.jar <quantas iterações deseja rodar>";
Se o valor inserido for inválido ou ausente, o sistema realizará 10 iterações

<img width="189" alt="image" src="https://github.com/germanoskt/Challenge-V8/assets/142634508/b53536c0-553b-46da-a5dc-55918292eb70">


<img width="455" alt="image" src="https://github.com/germanoskt/Challenge-V8/assets/142634508/ee12bf52-e10d-4ca3-87c1-6823c7e2b2e3">



---


## Premissas do jogo:

1. **Três Portas**:
   - Existem três portas distintas, numeradas de 1 a 3;
   - Cada porta representa uma escolha possível para o jogador.
   
3. **Apenas um Prêmio**:
   - Atrás de uma das três portas há um prêmio, que é único e exclusivo;
   - As outras duas portas não contêm nenhum prêmio.
   
5. **Escolha Inicial do Jogador**:
   - O jogador escolhe inicialmente uma das três portas sem saber onde está o prêmio;
   - Essa escolha inicial determina a porta que o jogador acredita conter o prêmio.
   
7. **Intervenção do Apresentador**:
   - O apresentador tem conhecimento sobre a localização do prêmio;
   - Após a escolha inicial do jogador, o apresentador abre uma das duas portas restantes que não foram escolhidas e que não contém o prêmio.
     Esta abertura serve para revelar uma das portas sem prêmio e criar um momento de decisão para o jogador.
   
9. **Opção de Mudança**:
    - Após a abertura de uma porta pelo apresentador, o jogador é apresentado com a opção de manter sua escolha original ou mudar para a outra porta que ainda está fechada.
      O jogador pode optar por trocar de porta ou permanecer com sua escolha inicial.

11. **Revelação do Prêmio**:
    - Após a decisão final do jogador, a porta escolhida é aberta.
      Se o prêmio estiver atrás da porta escolhida, o jogador ganha o prêmio. Caso contrário, ele não ganha nada.


## Escolhas do Jogo:

1. **Escolha Inicial do Jogador**: O jogador escolhe uma das três portas representadas por numeros.
2. **Escolha do Apresentador**: O código automaticamente seleciona e abre uma das portas que não foi escolhida pelo jogador e que não tem o prêmio.
3. **Escolha Final do Jogador**: O jogador, tendo visto uma porta aberta pelo apresentador, escolhe novamente entre as portas que ainda estão fechadas.
4. **Estratégia de Mudança**: O jogador pode optar por mudar de porta ou manter sua escolha original após uma porta ter sido aberta pelo apresentador.





  
