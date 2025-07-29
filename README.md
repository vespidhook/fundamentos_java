# 📚 Fundamentos Java - Jornada Java

Este repositório contém exercícios práticos do curso **Jornada Java** ministrado por **@danieleleaoe** | Dev Java. Os exercícios abrangem os conceitos fundamentais da linguagem Java, desde sintaxe básica até conceitos avançados de programação orientada a objetos.

**Desenvolvido durante o curso Jornada Java por @danieleleaoe | Dev Java**

_Última atualização: 28 de Julho de 2025_

## 🎯 Sobre o Curso

O curso **Jornada Java** é uma formação completa que aborda desde os fundamentos básicos até conceitos avançados da linguagem Java, preparando desenvolvedores para o mercado de trabalho.

**Instrutor:** [@danieleleaoe](https://github.com/danieleleaoe) | Dev Java

## 📂 Estrutura do Projeto

```
fundamentos_java/
├── 📄 Fundamentos Básicos
│   ├── Pessoa.java                    # Classes e objetos básicos
│   ├── Aluno.java                     # Exercício com classe Aluno
│   ├── ContaBancaria.java             # Sistema de conta bancária
│   ├── CriarObjetoContaBancaria.java  # Instanciação de objetos
│   ├── CriarPessoa.java               # Criação de objetos Pessoa
│   ├── Metodo.java                    # Exemplos de métodos
│   └── WrapperClasses.java            # Classes wrapper (Integer, Double, etc.)
│
├── 🔄 Controle de Fluxo
│   ├── ControleDeFluxo.java           # Estruturas condicionais
│   ├── Switch.java                    # Comando switch-case
│   ├── VerificadorIdade.java          # Validação de idade
│   └── DiasDaSemana.java              # Exercício com dias da semana
│
├── 🔁 Estruturas de Repetição
│   ├── For.java                       # Laços for
│   ├── While.java                     # Laços while
│   ├── DoWhile.java                   # Laços do-while
│   └── Tabuada.java                   # Geração de tabuada
│
├── 🔤 Manipulação de Dados
│   ├── ManioulacaoString.java         # Operações com strings
│   └── StringBuilderDemo.java         # StringBuilder para performance
│
├── 📊 estruturaDeDados/
│   ├── AulaArray.java                 # Arrays e vetores
│   ├── AulaListas.java                # Listas (ArrayList)
│   ├── AulaSet.java                   # Conjuntos (Set)
│   ├── AulaMap.java                   # Mapas (HashMap)
│   └── Iterador.java                  # Iteração em coleções
│
├── ⚠️ excecoes/
│   ├── ExcecaoPrincipal.java          # Tratamento de exceções
│   ├── SacarException.java            # Exceção personalizada para saque
│   └── SaldoInsuficienteException.java # Exceção para saldo insuficiente
│
├── 🧬 heranca/
│   ├── Veiculo.java                   # Classe abstrata base
│   ├── Carro.java                     # Herança - Carro
│   ├── Moto.java                      # Herança - Moto
│   ├── Aviao.java                     # Herança - Avião
│   ├── ContratoVeiculo.java           # Interface
│   ├── ContratoVeiculo2.java          # Interface alternativa
│   └── PricipalVeiculo.java           # Classe principal
│
├── 🔒 modificadores/
│   ├── ExemploFinalStatic.java        # Modificadores final e static
│   ├── Pessoa.java                    # Encapsulamento
│   └── PessoaPricipal.java            # Classe principal
│
└── 📁 entradaSaida/
    ├── Console.java                   # Entrada de dados via console
    ├── leituraEscrita.java           # Leitura e escrita de arquivos
    ├── leituraEscritaBuffer.java     # Buffer para otimização I/O
    └── ManipulacaoArquivo.java       # Manipulação avançada de arquivos
```

## 🎓 Conceitos Abordados

### 1. **Fundamentos Básicos**

- ✅ Sintaxe básica do Java
- ✅ Criação de classes e objetos
- ✅ Construtores
- ✅ Métodos e atributos
- ✅ Tipos de dados primitivos

### 2. **Controle de Fluxo**

- ✅ Estruturas condicionais (`if`, `else if`, `else`)
- ✅ Comando `switch-case`
- ✅ Operadores lógicos e relacionais

### 3. **Estruturas de Repetição**

- ✅ Laço `for`
- ✅ Laço `while`
- ✅ Laço `do-while`
- ✅ Controle de iteração (`break`, `continue`)

### 4. **Estruturas de Dados**

- ✅ Arrays (vetores)
- ✅ ArrayList (listas dinâmicas)
- ✅ HashSet (conjuntos)
- ✅ HashMap (mapas chave-valor)

### 5. **Programação Orientada a Objetos**

- ✅ **Herança** - Reutilização de código através de hierarquia de classes
- ✅ **Polimorfismo** - Múltiplas formas de um mesmo método
- ✅ **Abstração** - Classes abstratas e interfaces
- ✅ **Encapsulamento** - Modificadores de acesso

### 6. **Tratamento de Exceções**

- ✅ Estrutura `try-catch-finally`
- ✅ Exceções personalizadas
- ✅ Hierarquia de exceções
- ✅ Boas práticas no tratamento de erros

### 7. **Entrada e Saída de Dados**

- ✅ Leitura de dados via console
- ✅ Manipulação de arquivos
- ✅ BufferedReader e BufferedWriter
- ✅ Otimização de I/O

### 8. **Modificadores de Acesso**

- ✅ `public`, `private`, `protected`
- ✅ Modificador `static`
- ✅ Modificador `final`
- ✅ Classes abstratas

## 🚀 Como Executar os Exercícios

### Pré-requisitos

- ☕ Java JDK 8+ instalado
- 🔧 IDE de sua preferência (VS Code, IntelliJ IDEA, Eclipse)

### Execução

1. **Clone ou baixe o repositório**

   ```bash
   git clone <url-do-repositorio>
   cd fundamentos_java
   ```

2. **Compilar um arquivo Java**

   ```bash
   javac NomeDoArquivo.java
   ```

3. **Executar o programa**
   ```bash
   java NomeDoArquivo
   ```

### Exemplo Prático

```bash
# Compilar e executar o exercício de Pessoa
javac Pessoa.java CriarPessoa.java
java CriarPessoa

# Compilar e executar exercícios com pacotes
javac estruturaDeDados/AulaArray.java
java estruturaDeDados.AulaArray
```

## 📝 Exercícios Destacados

### 🏦 Sistema de Conta Bancária

- **Arquivos:** `ContaBancaria.java`, `CriarObjetoContaBancaria.java`
- **Conceitos:** Encapsulamento, métodos getter/setter, validações

### 👥 Sistema de Herança de Veículos

- **Pasta:** `heranca/`
- **Conceitos:** Classes abstratas, herança, polimorfismo, interfaces

### 📊 Estruturas de Dados Avançadas

- **Pasta:** `estruturaDeDados/`
- **Conceitos:** Collections Framework, ArrayList, HashMap, HashSet, Iteradores

### ⚠️ Tratamento de Exceções

- **Pasta:** `excecoes/`
- **Arquivos:** `ExcecaoPrincipal.java`, `SacarException.java`, `SaldoInsuficienteException.java`
- **Conceitos:** Try-catch-finally, exceções personalizadas, hierarquia de exceções

### 📁 Sistema de Entrada e Saída

- **Pasta:** `entradaSaida/`
- **Conceitos:** Manipulação de arquivos, BufferedReader/Writer, Scanner, I/O otimizado

### 🔤 Manipulação Avançada de Strings

- **Arquivos:** `ManioulacaoString.java`, `StringBuilderDemo.java`, `WrapperClasses.java`
- **Conceitos:** StringBuilder, performance, classes wrapper

## 🎯 Objetivos de Aprendizado

Ao completar estes exercícios, você será capaz de:

- ✅ Criar e manipular classes e objetos em Java
- ✅ Implementar lógica de programação com estruturas de controle
- ✅ Utilizar estruturas de dados apropriadas para cada situação
- ✅ Aplicar conceitos de POO (herança, polimorfismo, encapsulamento)
- ✅ Trabalhar com modificadores de acesso e boas práticas
- ✅ Trabalhar com entrada e saída de dados
- ✅ Manipular arquivos e streams de dados
- ✅ Desenvolver aplicações Java bem estruturadas e robustas
- ✅ Tratar exceções e erros adequadamente
- ✅ Otimizar performance com StringBuilder e wrapper classes

## 📊 Estatísticas do Projeto

- 📁 **5 módulos principais** organizados por conceito
- 📄 **25+ arquivos Java** com exercícios práticos
- 🎯 **8 categorias** de conceitos fundamentais
- 🏗️ **4 projetos destacados** para demonstração de conceitos avançados
- 💾 **Sistema completo** de manipulação de arquivos e I/O

## 🔥 Recursos Avançados

### 💡 Exceções Personalizadas

- `SacarException.java` - Exceção específica para operações de saque
- `SaldoInsuficienteException.java` - Tratamento de saldo insuficiente
- Demonstração prática de criação e uso de exceções customizadas

### 🏦 Sistema Bancário Completo

- Implementação robusta com tratamento de exceções
- Validações de negócio aplicadas
- Exemplo real de aplicação OOP

### 📂 Manipulação de Arquivos

- Leitura e escrita básica de arquivos
- Uso de buffers para otimização de performance
- Tratamento adequado de exceções de I/O
- Console interativo para entrada de dados

### 🚗 Hierarquia de Veículos

- Implementação completa de herança
- Uso de classes abstratas e interfaces
- Polimorfismo em ação com diferentes tipos de veículos

## �🔗 Links Úteis

- [Documentação Oficial Java](https://docs.oracle.com/javase/)
- [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/)
- [@danieleleaoe no GitHub](https://github.com/danieleleaoe)

## 📄 Licença

Este projeto é destinado para fins educacionais como parte do curso **Jornada Java**.

---

**Desenvolvido durante o curso Jornada Java por @danieleleaoe | Dev Java**

_Última atualização: 28 de Julho de 2025_
