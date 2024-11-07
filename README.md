Santander Dev Week

Um projeto para buscar dados de uma conta bancária fictícia.

Estrutura do banco de dados e entidades:

```mermade
classDiagram
    class User {
        -String name
        -Account account
        -List~Feature~ features
        -Card card
        -List~News~ news
    }
    
    class Account {
        -String number
        -String agency
        -double balance
        -double limit
    }
    
    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String number
        -double limit
    }
    
    class News {
        -String icon
        -String description
    }

    User --> Account
    User --> Card
    User --> Feature
    User --> News

```