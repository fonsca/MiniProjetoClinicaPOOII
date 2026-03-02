# Decisões de Modelagem - Sistema Simplificado de Clínica

> **Este projeto foi desenvolvido em Java para aplicar os conceitos fundamentais de Programação Orientada a Objetos, com foco em encapsulamento, construtores e validação de regras de negócio.**
> 
## Encapsulamento e Modificadores de Acesso:

Todos os atributos das classes foram declarados como private. O acesso a esses dados é feito exclusivamente por métodos getters, e a modificação ocorre apenas através de construtores ou métodos específicos que validam as regras de negócio antes de alterar o estado do objeto.

## Validações nos Construtores e Métodos:

* **Consulta:** Utiliza LocalDateTime do Java. O construtor verifica se a data informada é anterior à data atual, lançando uma IllegalArgumentException caso seja, garantindo que a consulta não seja marcada no passado. O registro de comparecimento só ocorre em um objeto Consulta já instanciado (marcado).
* **Exame:** O construtor valida se o prazo em dias é estritamente maior que zero.
* **Histórico** Clínico: Centraliza os registros do paciente. O método de adicionar registro verifica se a String é nula ou vazia, impedindo a inserção de textos em branco.
* **Associações:** A classe Consulta agrega Medico e Paciente. A classe Paciente possui uma composição com HistoricoClinico, garantindo que o histórico exista atrelado ao ciclo de vida do paciente.
