# Redis + docker + Java

Neste projeto, há demonstração de conexão com o Redis com 2 tipos de clients (Jedis e RedisClient). Executando o redis
em um container docker.

# Rodar comando para criar o container do docker

``` docker-compose -f docker/docker-compose.yml up -d --build ```

Na classe Execute basta executar o método main.

Excluir todas as imagens do docker:

``` docker-compose -f .\docker\docker-compose.yml down -v --remove-orphans ```