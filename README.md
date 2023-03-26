# stug
Java Spring заглушка для REST сервиса

Запустить проект

На любой API платформе (пример приведен на Postman), отправляете Post-запрос по адресу "http://localhost:8080/dadada" в формате JSON 

Пример тела JSON:

{
    "name": "Oleg",
    "account": 200562
}

Если все сделано верно, то будет получен ответ c телом:

{
    "message": "Nice to meet you, Oleg. The total amount of your account is 200562 Uzbek Sym."
}
