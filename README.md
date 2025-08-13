# ConversorDeMoedasjv.
Conversor de Moedas CLI, Feito por Ricaela
O que é isso?
Um programinha em Java pra converter grana entre moedas da América Latina. Tudo no terminal mesmo, nada de interface chique, aqui é na raça! Usa a ExchangeRate-API pra trazer taxas atualizadas, mas se a internet falhar, o sistema é esperto e usa dados guardados no cache.

O que ele faz?
Converte entre USD, BRL, ARS, BOB, CLP e COP

Pega as taxas direto da API (ou do cache, se precisar)

Guarda as taxas pra quando ficar offline

Terminal colorido, pra não ser só texto sem graça

Configuração da chave da API no arquivo .env, pra deixar seguro

Feito com Java 21, Maven e aquele toque de Lombok pra não enlouquecer com código repetido

Como rodar?
Clone esse repositório:

bash
Copiar
Editar
git clone https://github.com/seu-usuario/conversor_one.git
cd conversor_one
Crie um arquivo .env com sua chave da ExchangeRate-API:

ini
Copiar
Editar
API_KEY=sua_chave_aqui
Compile e execute com Maven:

bash
Copiar
Editar
mvn clean install
mvn spring-boot:run
Como usar?
Quando rodar, vai abrir um menu simples:

r
Copiar
Editar
1) Converter moeda
2) Mostrar taxas de câmbio
3) Sobre o programa
4) Sair
   Escolha o número e siga as instruções. É só digitar o valor, a moeda base e a que quer converter. Fácil, rápido e direto.

O que aprendi fazendo isso?
Como trabalhar com APIs externas e tratar erros com elegância

A importância de cache e fallback pra garantir que o app não quebre

Usar Lombok pra deixar o código enxuto (quem não ama?)

Deixar o terminal mais legal com cores e interação bacana

Tecnologias
Java 21

Spring Boot

Maven

Gson (pra lidar com JSON)

Lombok

JANSI e JLine (pra terminal estiloso)

Autora
Ricaela Maiara — estudante que não para quieta e gosta de botar a mão na massa.

