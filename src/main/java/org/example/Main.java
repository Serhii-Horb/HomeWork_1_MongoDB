package org.example;

public class Main {
    public static void main(String[] args) {
        /* 1. Создать базу данных homeworks.

use homeworks

2. В бд homeworks создать коллекцию users и заполнить документами со следующими свойствами: _id, firstname, lastname,
age, gender. Используйте следующие данные:
1 Анатолий Ушанов 28 m
2 Светлана Демидова 25 f
3 Никита Иванов 33 m
4 Ольга Петрова 22 f

db.createCollection('users')

db.users.insertMany([
  {
			_id: 1,
			firstname: 'Андрей',
			lastname: 'Ушаков',
			age: 28,
			gender: 'm'
},
 {
			_id: 2,
			firstname: 'Светлана',
			lastname: 'Демидова',
			age: 25,
			gender: 'f'
},
 {
			_id: 3,
			firstname: 'Никита',
			lastname: 'Иванов',
			age: 33,
			gender: 'm'
},
 {
			_id: 4,
			firstname: 'Ольга',
			lastname: 'Петрова',
			age: 22,
			gender: 'f'
}
]) */

/* 3. В бд homeworks создать коллекцию vegetables и заполнить документами со следующими свойствами: _id, title, price,
count, country.
Используйте следующие данные:
1 Potato 370 5 Germany
2 Onion 320 3 Poland
3 Tomato 210 9 Spain
4 Carrot 280 4 France

db.createCollection('vegetables')

db.vegetables.insertMany([
  {
			_id: 1,
			title: 'Potato',
			price: 370,
			count: 5,
			country: 'Germany'
},
 {
				_id: 2,
			title: 'Onion',
			price: 320,
			count: 3,
			country: 'Poland'
},
 {
				_id: 3,
			title: 'Tomato',
			price: 210,
			count: 9,
			country: 'Spain'
},
 {
				_id: 4,
			title: 'Carrot',
			price: 280,
			count: 4,
			country: 'France'
}
])
*/
    }
}