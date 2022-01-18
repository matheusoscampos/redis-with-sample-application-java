# Redis + docker + Java

Neste projeto, há demonstração de conexão com o Redis com 2 tipos de clients (Jedis e RedisClient). Executando o redis
em um container docker.

# Rodar comando para criar o container do docker

``` docker-compose -f docker/docker-compose.yml up -d --build ```

Na classe ```Execute.java``` basta executar o método main.

Para excluir todas as imagens do docker, basta executar:

``` docker-compose -f .\docker\docker-compose.yml down -v --remove-orphans ```