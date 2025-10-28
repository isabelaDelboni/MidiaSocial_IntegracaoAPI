Sistema de Integração de APIs de Mídia Social (Padrão Adapter)
Descrição do Projeto

Este projeto implementa um sistema de gerenciamento e publicação de conteúdo em múltiplas redes sociais, utilizando os padrões de projeto Adapter, Strategy e Factory Method.

O objetivo é unificar o processo de autenticação e publicação, simulando o funcionamento de APIs reais (Twitter, Instagram, LinkedIn e TikTok), cada uma com regras e autenticações diferentes.

O sistema foi desenvolvido em Java, com foco em modularidade, flexibilidade e reutilização de código.

Estrutura do Projeto
src/
└── br/com/midiasocial/
    ├── interfaces/
    │   ├── PlataformaMidiaSocial.java
    │   └── AutenticacaoStrategy.java
    ├── models/
    │   ├── Conteudo.java
    │   └── Estatisticas.java
    ├── adapters/
    │   ├── TwitterAdapter.java
    │   ├── InstagramAdapter.java
    │   ├── LinkedInAdapter.java
    │   └── TikTokAdapter.java
    ├── factory/
    │   └── SocialMediaFactory.java
    ├── core/
    │   └── GerenciadorMidiaSocial.java
    ├── auth/
    │   ├── TokenAuth.java
    │   ├── OAuthAuth.java
    │   ├── ApiKeyAuth.java
    │   └── ComplexAuth.java
    └── Main.java

Funcionamento do Sistema
Interface Unificada

A interface PlataformaMidiaSocial define o comportamento comum de todas as plataformas, com o método:

void publicar(Conteudo conteudo);


Cada rede social possui um Adapter que adapta o formato da mensagem e o processo de autenticação ao seu funcionamento interno.

Estratégia de Autenticação (Strategy)

A interface AutenticacaoStrategy define o método autenticar(), permitindo diferentes tipos de autenticação:

TokenAuth: autenticação simples via token (Twitter e LinkedIn)

ApiKeyAuth: autenticação por chave de API (Instagram)

OAuthAuth: autenticação via OAuth (TikTok)

ComplexAuth: autenticação combinada (token + secret)

Isso permite trocar o tipo de autenticação sem alterar a lógica dos Adapters.

Fábrica de Plataformas (Factory Method)

A classe SocialMediaFactory cria os Adapters com suas estratégias de autenticação correspondentes, centralizando a configuração do sistema e facilitando a inclusão de novas plataformas.

Exemplo de uso:

PlataformaMidiaSocial twitter = SocialMediaFactory.criarPlataforma("twitter");

Gerenciador de Mídia Social

A classe GerenciadorMidiaSocial mantém uma lista ou mapa de plataformas configuradas e permite publicar o mesmo conteúdo em todas elas de forma unificada.

Principais métodos:

void adicionarPlataforma(String nome, PlataformaMidiaSocial plataforma)
void publicarEmTodas(Conteudo conteudo)

Modelos de Dados

Conteudo: representa a mensagem e a mídia a serem publicadas.

Estatisticas: armazena dados simulados de interações (curtidas, comentários, visualizações, etc.).

Fluxo de Execução

A Main cria uma instância do GerenciadorMidiaSocial.

As plataformas são criadas dinamicamente pela SocialMediaFactory, com suas estratégias de autenticação.

Um objeto Conteudo é criado com texto e imagem.

O gerenciador publica o conteúdo em todas as plataformas configuradas.

Cada Adapter exibe a mensagem autenticada e estatísticas simuladas.

Exemplo de saída:

Autenticado com token: tok12...
Tweet publicado: Lançamos o novo curso sobre como não desistir da Facul!!!
Estatísticas: likes: 120 | retweets: 15
------------------------------------
Autenticado com API Key: api98...
Post no Instagram: Lançamos o novo curso sobre como não desistir da Facul!!!
Estatísticas: curtidas: 340 | comentarios: 22
------------------------------------
Autenticado com token: abcde...
Publicação no LinkedIn: Lançamos o novo curso sobre como não desistir da Facul!!!
Estatísticas: engajamento: 80 | visualizações: 1020
------------------------------------
Usuário isa.dev autenticado via OAuth.
Vídeo postado no TikTok: Lançamos o novo curso sobre como não desistir da Facul!!!
Estatísticas: compartilhamentos: 48 | views: 3500 | curtidas: 540
------------------------------------

Padrões de Projeto Utilizados

Adapter: unifica APIs heterogêneas em uma interface comum.

Strategy: permite múltiplos tipos de autenticação intercambiáveis.

Factory Method: centraliza a criação e configuração dos Adapters e suas estratégias.

Como Executar
Compilar
javac -d bin src/br/com/midiasocial/**/*.java

Executar
java -cp bin br.com.midiasocial.Main


A saída será exibida no console.