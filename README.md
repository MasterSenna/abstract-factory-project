
# Abstract Factory Project

## 📘 Finalidade do Projeto

Este projeto implementa o padrão de design **Abstract Factory**, que é usado para criar famílias de objetos relacionados sem especificar suas classes concretas. O objetivo principal é fornecer uma implementação flexível para gerenciamento de **Carros** e **Usuários**, permitindo que os serviços sejam fornecidos através de duas tecnologias diferentes: **EJB (Enterprise Java Beans)** e **REST API**.

O projeto simula a criação, atualização e exclusão de carros e usuários usando a interface de fábrica abstrata para escolher qual tecnologia será usada em tempo de execução.

---

## 🛠 Estrutura do Projeto

A estrutura do projeto é organizada da seguinte forma:

```
abstract-factory-project/
│
├── app/                          # Contém a lógica principal da aplicação
│   └── service/
│       └── Client.java            # Ponto de entrada principal, onde a fábrica é escolhida
│       └── ServicesAbstractFactory.java  # Interface que define o contrato para as fábricas
│
├── factory/                       # Implementações de fábricas concretas
│   └── EJBServiceFactory.java      # Implementa serviços baseados em EJB
│   └── RestServiceFactory.java     # Implementa serviços baseados em REST API
│
├── services/                      # Serviços para gerenciamento de Carros e Usuários
│   └── CarService.java             # Interface para serviços de Carro
│   └── UserService.java            # Interface para serviços de Usuário
│   └── CarEJBService.java          # Implementação EJB para serviços de Carro
│   └── CarRestApiService.java      # Implementação REST para serviços de Carro
│   └── UserEJBService.java         # Implementação EJB para serviços de Usuário
│   └── UserRestApiService.java     # Implementação REST para serviços de Usuário
```

### 🧩 Padrão Abstract Factory

O **ServicesAbstractFactory.java** define o contrato para as fábricas que fornecem serviços. Dependendo se você deseja usar **EJB** ou **REST**, você instanciará:

- **EJBServiceFactory**: Fornece serviços usando tecnologia EJB.
- **RestServiceFactory**: Fornece serviços usando REST API.

---

## 🚗 Gerenciamento de Carros e Usuários

- A interface **CarService** define dois métodos principais: `save(String model)` e `update(String newModel)`.
- A interface **UserService** define dois métodos principais: `save(String name)` e `delete(Integer id)`.

Cada tecnologia (EJB ou REST) implementa essas interfaces com a lógica apropriada.

### Exemplo de Uso:

```java
CarService carService = factory.getCarService();
carService.save("Tesla Model 3");
carService.update("Tesla Model X");

UserService userService = factory.getUserService();
userService.save("John Doe");
userService.delete(1);
```

### Exemplo de Saída:

#### Usando EJB:

```
Salvando carro Tesla Model 3 através da interface EJB
Atualizando carro Tesla Model X através da interface EJB
Salvando John Doe através da interface EJB
Removendo Usuário #1 através da interface EJB
```

#### Usando REST API:

```
Salvando carro Tesla Model 3 através da interface REST
Atualizando carro Tesla Model X através da interface REST
Salvando John Doe através da interface REST
Removendo Usuário #1 através da interface REST
```

---

## 💻 Como Executar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/MasterSenna/abstract-factory-project.git
```

2. Navegue até o diretório do projeto:

```bash
cd abstract-factory-project
```

3. Compile e execute o projeto usando sua IDE favorita (IntelliJ, Eclipse) ou pela linha de comando.

---

## 📂 Como Contribuir

1. Faça o fork do repositório.
2. Crie uma nova branch para suas alterações:

```bash
git checkout -b feature/nova-feature
```

3. Commit suas alterações:

```bash
git commit -m "Adicionar nova feature"
```

4. Envie as alterações para o GitHub:

```bash
git push origin feature/nova-feature
```

5. Abra um Pull Request no GitHub.

---

## 📝 Licença

Este projeto é licenciado sob a licença MIT.


