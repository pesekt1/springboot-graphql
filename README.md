# springboot-graphql

Dependencies
```xml
        <dependency>
            <groupId>com.graphql-java</groupId>
            <artifactId>graphql-java-extended-scalars</artifactId>
            <version>1.0.1</version>
        </dependency>
        <dependency>
            <groupId>com.graphql-java</groupId>
            <artifactId>graphiql-spring-boot-starter</artifactId>
            <version>5.0.2</version>
        </dependency>
```

graphql endpoint:
application.properties:
```
graphql.servlet.mapping= /graphql
```

graphiql endpoint is by default /graphiql