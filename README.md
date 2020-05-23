# DEMO-LIVRARIA
Demo Livraria (Hexagonal, Cassandra, Kafka)

...

## PRE-REQUISITOS

### CASSANDRA

Comando para subir cassandra no Docker:
```
docker run -p 9042:9042 --name cassandra -d cassandra:latest
```

Comando para acessar o container cassandra:
```
docker exec -it some-cassandra bash
```

Comando para acessar o cqlsh:
```
> cqlsh
```

Comando para criar um keyspace no cassandra:
```
cqlsh> create keyspace livraria with replication = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 } ;
```

### KAFKA

...
