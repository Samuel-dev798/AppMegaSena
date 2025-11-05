# AppMegaSena
Aplicativo Android nativo desenvolvido em Kotlin que gera números aleatórios da Mega-Sena, com validação de entrada e salvamento do último resultado usando SharedPreferences.

# 🎯 Gerador de Números da Mega-Sena

Um aplicativo Android simples desenvolvido em **Kotlin** que gera números aleatórios para apostas da **Mega-Sena**.  
O app permite escolher a quantidade de números desejada (entre 6 e 15) e salva automaticamente o último resultado gerado.

---

## 📱 Funcionalidades

- ✅ Geração aleatória de números entre **1 e 60**  
- ✅ Escolha da quantidade de números (mínimo 6, máximo 15)  
- ✅ Validação de entrada com mensagens de erro  
- ✅ Exibição do último resultado salvo  
- ✅ Armazenamento local usando **SharedPreferences**

---

## 🧠 Tecnologias e conhecimentos aplicados

- **Kotlin** — Linguagem principal do projeto  
- **Android Studio** — IDE utilizada para desenvolvimento  
- **SharedPreferences** — Persistência simples de dados  
- **ConstraintLayout** — Layout responsivo da interface  
- **Toast** — Exibição de mensagens ao usuário  
- **Random** — Geração de números aleatórios  
- **Boas práticas de UI/UX** — Interface simples e direta  

---

## 🧩 Estrutura principal

- `MainActivity.kt` — Lógica principal do app  
- `activity_main.xml` — Layout da interface  
- `SharedPreferences` — Armazenamento do último resultado gerado  

---

## 🚀 Como executar o projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git
2. Abra o projeto no Android Studio
3. Execute em um emulador ou dispositivo físico

🖼️ Layout

A interface foi construída com ConstraintLayout, contendo:

* Logo da Mega-Sena

* Campo para digitar a quantidade de números

* Botão para gerar os números

* Área de resultado exibindo os números sorteados

💡 Aprendizados

Durante o desenvolvimento deste projeto, foram aplicados conceitos como:

* Manipulação de componentes de interface no Android

* Validação de dados de entrada do usuário

* Uso de MutableSet para evitar números repetidos

* Armazenamento de informações locais com SharedPreferences

* Estrutura e fluxo básico de um app Android em Kotlin

🧑‍💻 Autor

Samuel Ferreira da Silva
📧 samuel.dev798@gmail.com
   

