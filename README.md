# clicker-service
A clicker service for clicker-game project


Setup project
1) Init cassandra db keyspace manually with


CREATE KEYSPACE clicker
    WITH REPLICATION = {
        'class' : 'SimpleStrategy',
        'replication_factor' : 1
        };