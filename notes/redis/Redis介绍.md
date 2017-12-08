## Redis笔记：

### 1、Redis 简介：

> `Redis` 是完全开源免费的，是一个高性能的key-value数据库。

Redis支持数据的持久化，可以将内存中的数据保存在磁盘中，重启的时候可以再次加载进行使用。
Redis不仅仅支持简单的key-value类型的数据，同时还提供**string，list，set，zset，hash**等数据结构的存储。
Redis支持数据的备份，即master-slave模式的数据备份。

### 2、Redis 使用：

查看当前的配置：config get redis.conf文件中的key

`127.0.0.1:6379> config get port`

### 3、Redis 数据类型

Redis支持五种数据类型：string（字符串），hash（哈希），list（列表），set（集合）及zset(sorted set：有序集合)。

- String（字符串）

string是redis最基本的类型，你可以理解成与Memcached一模一样的类型，一个key对应一个value。
string类型是二进制安全的。意思是redis的string可以包含任何数据。比如jpg图片或者序列化的对象 。
string类型是Redis最基本的数据类型，一个键最大能存储512MB。
```
127.0.0.1:6379> set name 'youfang'
127.0.0.1:6379> get name
```


- Hash（哈希）

Redis hash 是一个键名对集合。
Redis hash是一个string类型的field和value的映射表，hash特别适合用于存储对象。
```
127.0.0.1:6379> hmset user:1 username youfang password yxserver points 200
127.0.0.1:6379> hgetall user:1
```
- List（列表）允许重复元素

Redis 列表是简单的字符串列表，按照插入顺序排序。你可以添加一个元素到列表的头部（左边）或者尾部（右边）。
```
127.0.0.1:6379> lpush youfang redis
127.0.0.1:6379> lpush youfang mongodb
127.0.0.1:6379> lpush youfang rabbitmq
127.0.0.1:6379> lrange youfang 0 10
```
- Set（集合）

Redis的Set是string类型的无序集合。(会忽略重复的元素)
集合是通过哈希表实现的，所以添加，删除，查找的复杂度都是O(1)。
```
127.0.0.1:6379> sadd youfang redis
127.0.0.1:6379> sadd youfang mongodb
127.0.0.1:6379> smembers youfang
```
- zset(sorted set：有序集合)

Redis zset 和 set 一样也是string类型元素的集合,且不允许重复的成员。
不同的是每个元素都会关联一个double类型的分数。redis正是通过分数来为集合中的成员进行从小到大的排序。
zset的成员是唯一的,但分数(score)却可以重复。
```
127.0.0.1:6379> zadd key2 10 redis
127.0.0.1:6379> zadd key2 0 rabbitmq
127.0.0.1:6379> zrangebyscore key2 0 1000
```
### 4、Redis的使用：
```
$redis-cli
redis 127.0.0.1:6379>
redis 127.0.0.1:6379> PING
PONG	
			              主机名	       端口	      密码
$redis-cli -h 127.0.0.1 -p 6379 -a "mypass"
redis 127.0.0.1:6379>
redis 127.0.0.1:6379> PING
PONG
```

### 5、相关命令：
```
del key     	       - 该命令用于在 key 存在时删除 key。
exists key         - 检查给定 key 是否存在。
expire key seconds - 为给定 key 设置过期时间。
persist key        - 移除 key 的过期时间，key 将持久保持。
ttl key            - 以秒为单位，返回给定 key 的剩余生存时间(TTL, time to live)。
incr key           - 	将 key 中储存的数字值增一。
decr key           - 将 key 中储存的数字值减一。

查看服务器信息：
127.0.0.1:6379> info
```

### 6、Redis安全：
设置密码：
```
127.0.0.1:6379> config get requirepass
127.0.0.1:6379> config set requirepass yxserver
127.0.0.1:6379> auth yxserver
127.0.0.1:6379> config get requirepass
```











