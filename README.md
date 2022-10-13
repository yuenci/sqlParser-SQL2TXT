# SQL2TXT

This project is an implementation of operating txt with SQL, which is equivalent to using TXT files as a database, and can be used  in some special cases.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

## Running the tests

Under the [example](https://github.com/yuenci/sqlParser/tree/master/src/example) folder, there are test cases of [Insert](https://github.com/yuenci/sqlParser/blob/master/src/example/demoInsert.java), [Select](https://github.com/yuenci/sqlParser/blob/master/src/example/demoSelect.java), [Update](https://github.com/yuenci/sqlParser/blob/master/src/example/demoUpdate.java), [Delete](https://github.com/yuenci/sqlParser/blob/master/src/example/demoDelete.java), and you can directly run the main function test.\

# Features

- Support  using   insert, select, update, and delete to CRUD.

- Insert supports simultaneous insertion of multiple data.

Example: `insert into testtable (name, address) values ('innis',' China'), ('kk',' Malaysia') `

- Insert can ignore column name insertion.

Example: ` insert into testtable values ('innis', 23,' China' )`.

- Support  using the Where sentence + logic words to filter the content (likes don't support mixed logic)

Example: `delete from testtable where address =' China' or (name =' inners3' and age = 27); `

- Support the comparing of =, < >, >, > =, <, < =

# Restriction

* Select, Update, Delete must have a Where clause.
* String content must be wrapped in single quotation marks.

# Planning

* Order

Coming Soon!

## Built With

* **[JSqlParser](https://github.com/JSQLParser/JSqlParser)**

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com) for details on our code of conduct, and the process for submitting pull requests to us.

## Authors

* **[Yuenci](https://github.com/yuenci)**

## License

This project is licensed under the MIT License 
