# Code Review do Projeto backend_Aluguel-de-Carros

link do projeto: https://github.com/paulovictor0907/backend_Aluguel-de-Carros

1. Padronização no nome de métodos, como por exemplo:
     1. Nomes de métodos como buscarVeiculoPorMatricula e buscaVeiculoPorMarca poderiam seguir o mesmo padrão.
2. Manter ResponseEntity como retorno para métodos do Controller para indicar o status HTTP apropriado.
    1. Sugestão: Retorne ResponseEntity.ok() para sucesso ou ResponseEntity.status(HttpStatus.CREATED) ao inserir um novo automóvel. Para excluirAutomovel, utilize ResponseEntity.noContent() para operações bem-sucedidas sem resposta.  
3. Implementação de um mapeamento DTO para desacoplar as entidades do banco dos retornos da API.
4. Tratamento de exceções e erros
   1. Criação de exceções personalizadas, como: 
      1. Sugestão: Em vez de RuntimeException, crie uma exceção personalizada (UsuarioNotFoundException) para melhorar a clareza e rastreamento do erro.
5. Refatoração de Código Redundante
   1. No UsuarioService, getClientes e getAgentes são bastante similares.
      1. Sugestão: Crie um método genérico getUsuariosByRole(UsuarioEnum role) para reduzir a duplicação.
6. Sugestão para o application.properties:
   1. spring.jpa.hibernate.ddl-auto=update para permitir que o Hibernate atualize automaticamente o esquema do banco de dados com base nas mudanças nas entidades.
   2. spring.datasource.initialization-mode=always para iniciar o banco de dados automaticamente, caso não exista.