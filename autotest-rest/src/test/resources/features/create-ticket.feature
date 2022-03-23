#language:ru
@createTicket
Функционал: Создание тикета с высоким приоритетом

Сценарий: Создать тикет с высоким приоритетом

  * создать контекстные переменные
    | title             | EEEEEEEE          |
    | queue             | 2                 |
    | status            | 1                 |
    | priority          | 1                 |
  * создать запрос
    | method | path         | body            |
    | POST   | /api/tickets | ticket.json     |
  * добавить header
    |Accept        |application/json, application/javascript, text/javascript, text/json|
    | Content-Type | application/json |
  * отправить запрос
  * статус код 201
  * извлечь данные
    | id1 | $.id |

  #ЛОГИНИМСЯ
  * создать запрос
    | method | path         | body            |
    | POST   |/api/login    | login.json      |
  * добавить header
    |Accept        |application/json, application/javascript, text/javascript, text/json|
    | Content-Type | application/json |
  * отправить запрос
  * статус код 200
  * извлечь данные
    | token | $.token |
  * сравнить значения
    | ${token}       | != | null  |

  * создать запрос
    | method | path              |
    | GET    |/api/tickets/${id1}|

  * добавить header
    | Accept        |application/json, application/javascript, text/javascript, text/json|
    | Content-Type  | application/json |
    | Authorization |token ${token}|

  * отправить запрос
  * статус код 200
  * извлечь данные
    | id | $.id |
  * сравнить значения
    | ${id}       | == |  ${id1}                |


