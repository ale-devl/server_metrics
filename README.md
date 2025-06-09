# server_metrics
This is a super simple application with two components

# server
This component runs on a remote server and gathers metrics of the same. It is not yet clear which metrics will be acquired. It then provides these to the client via Spring Boot.

# client
Most likely will be a simple CLI client to obtain the data of the server component and display those to the user.

# Further READMEs
This projects contains Java projects for the server and client part. See their READMEs:
[Server](./server/README.md)
[Client](./client/README.md)