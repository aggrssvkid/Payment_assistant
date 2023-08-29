## Usage
1. Download and run [Postgres](https://www.postgresql.org/download/) (for example, [Postgres.app](https://postgresapp.com/downloads.html)).
2. Connect to the database.
3. Create tables by running [src/main/resources/sql/schema.sql](https://github.com/rbiodies/Payment_assistant/blob/master/src/main/resources/sql/schema.sql) and fill them with test data by running [src/main/resources/sql/data.sql](https://github.com/rbiodies/Payment_assistant/blob/master/src/main/resources/sql/data.sql) (optional).
4. Navigate to the root of the project via command line and execute the command.
```
mvn spring-boot:run
curl --json '{"id": 1, "firstName": "Alex", "lastName": "Wolf", "phoneNumber": "88005353535"}' http://localhost:8080/api/client/new
```

Example https://github.com/rbiodies/Spring_Boot/tree/master
