# Projeto de Exemplo: Primeiros Testes com JUnit 5

Este projeto demonstra a configuração e implementação de testes unitários usando **JUnit 5** em um projeto Maven.

## 📋 Pré-requisitos

- Java 8 ou superior
- Maven 3.6.3 ou superior
- JUnit 5

## 🧪 Classes de Teste Implementadas

### 1. **MeuPrimeiroTest.java**
- **Propósito**: Demonstração básica de métodos de teste
- **Características**:
  - `teste01()`: Método executado (possui `@Test`)
  - `teste02()`: Método **NÃO** executado (falta `@Test`)
  - `teste03()`: Método executado (possui `@Test`)

### 2. **CalculadoraTest.java**
- **Propósito**: Testes para a classe `Calculadora`
- **Métodos testados**:
  - Soma (`calc`)
  - Multiplicação (`multiplicacao`)
  - Subtração (`subtracao`)
  - Divisão (`divisao`)

### 3. **ValidacaoIgualdadeTest.java**
- **Propósito**: Testes de igualdade usando `assertEquals`
- **Cenários**:
  - Teste de sucesso (valores iguais)
  - Teste de falha (valores diferentes)

### 4. **ValidacaoVerdadeiroFalsoTest.java**
- **Propósito**: Testes booleanos usando `assertTrue` e `assertFalse`

### 5. **PrePosCondicaoTest.java**
- **Propósito**: Demonstração de métodos de configuração (comentados)

## 🛠️ Configuração do Maven

### Plugins Configurados:

1. **maven-enforcer-plugin**: Garante versão mínima do Maven
2. **maven-checkstyle-plugin**: Análise estática de código
3. **maven-surefire-plugin**: Execução de testes
4. **jacoco-maven-plugin**: Cobertura de código
5. **maven-javadoc-plugin**: Geração de documentação

### Dependências:

- **JUnit 5**: Framework de testes
- **Checkstyle**: Análise de qualidade de código

## 🚀 Como Executar os Testes

### Executar todos os testes:
```bash
mvn test
