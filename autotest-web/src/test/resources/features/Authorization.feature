#language:ru
#@sandbox
Функционал: Авторизация

  Сценарий:

    * открыть url "https://at-sandbox.workbench.lanit.ru/"
    * инициализация страницы "Sandbox"

    * кликнуть на элемент "Войти"
    * проверить что текущий url содержит текст "login"

    * ввести в поле "Username" значение "admin"
    * ввести в поле "Password" значение "adminat"

    * кликнуть на элемент "Вход"