# SQL2TXT

This project is an implementation of operating txt with SQL, which is equivalent to using TXT files as a database, and can be used  in some special cases.

## Getting Started

Add [sqlParser.jar](https://github.com/yuenci/sqlParser/blob/master/sqlParser.jar) package to module dependencies of your project.
## Running the tests

Under the [example](https://github.com/yuenci/sqlParser/tree/master/src/example) folder, there are test cases of [Insert](https://github.com/yuenci/sqlParser/blob/master/src/example/demoInsert.java), [Select](https://github.com/yuenci/sqlParser/blob/master/src/example/demoSelect.java), [Update](https://github.com/yuenci/sqlParser/blob/master/src/example/demoUpdate.java), [Delete](https://github.com/yuenci/sqlParser/blob/master/src/example/demoDelete.java), and you can directly run the main function test.

## Demo
### Insert
![Insert](https://github.com/yuenci/sqlParser/blob/master/src/example/Insert.gif)
### Select
![Select](https://github.com/yuenci/sqlParser/blob/master/src/example/Select.gif)
### Update
![Update](https://github.com/yuenci/sqlParser/blob/master/src/example/Update.gif)
### Delete
![Delete](https://github.com/yuenci/sqlParser/blob/master/src/example/Delete.gif)

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

# Roadmap


- [ ] Date, DateTime dataType
- [ ] Max,Min
- [ ] Order
- [ ] Group
- [ ] Join

Coming Soon!

## Built With

* **[JSqlParser](https://github.com/JSQLParser/JSqlParser)**

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com) for details on our code of conduct, and the process for submitting pull requests to us.

## Authors
<img src="https://github.com/yuenci/Laptop-Repair-Services-Management-System/blob/master/image/avatar-innis.png" alt="profile image" width="60px">


## License

This project is licensed under the MIT License 
