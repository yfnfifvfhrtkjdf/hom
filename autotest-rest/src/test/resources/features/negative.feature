#language:ru
@negativeTicket
Функционал: Создание тикета с высоким приоритетом.
            перевод статуса тикета из "Закрыт" в "Открыт".

Сценарий:  Негативная проверка

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
    | id | $.id |
  * извлечь данные
    | status1 | $.status |
  * сравнить значения
    | ${id}       | != | null                |

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
    | ${token}       | != | null                |
  #Перевод статуса тикета


  * создать контекстные переменные
    | status                | 4                 |
  * создать запрос
    | method | path          | body            |
    | PUT    |/api/tickets/${id}| ticket.json     |

  * добавить header
    |Accept        |application/json, application/javascript, text/javascript, text/json|
    | Content-Type | application/json |
  |  Authorization  |token c1803e6e3b12359683796496625e8518b2e082c3|

  * отправить запрос
  * извлечь данные
    | status | $.status |
  * сравнить значения
    | ${status}       | != |  ${status1}                |
  * статус код 420

