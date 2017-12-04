-- 测试JOIN

-- 有匹配才返回 ： 注释：INNER JOIN 与 JOIN 是相同的。
-- （内连接,或等值连接）：取得两个表中存在连接匹配关系的记录。
SELECT e.*,b.* from t_emp e JOIN t_boss b ON e.id_boss = b.id
SELECT e.*,b.* from t_emp e INNER JOIN t_boss b ON e.id_boss = b.id

-- 注意：不添加查询条件会产生笛卡尔积；表中的每一条记录都会和JOIN的表全部记录相关联(n*m条数的记录)
SELECT e.*,b.* from t_emp e JOIN t_boss b


-- LEFT [OUTER] JOIN:    LEFT JOIN 关键字会从左表 (table_name1) 那里返回所有的行，即使在右表 (table_name2) 中没有匹配的行。
-- （左连接）：取得左表（table1）完全记录，即是右表（table2）并无对应匹配记录。
-- 如果没有匹配,右侧将包含null。
SELECT e.*,b.* from t_emp e LEFT JOIN t_boss b ON e.id_boss = b.id


-- RIGHT JOIN：RIGHT JOIN 关键字会右表 (table_name2) 那里返回所有的行，即使在左表 (table_name1) 中没有匹配的行。
-- （右连接）：与 LEFT JOIN 相反，取得右表（table2）完全记录，即是左表（table1）并无匹配对应记录。
SELECT e.*,b.* from t_emp e RIGHT JOIN t_boss b ON e.id_boss = b.id



-- 注意：mysql不支持Full join,不过可以通过UNION 关键字来合并 LEFT JOIN 与 RIGHT JOIN来模拟FULL join.
[x] SELECT e.*,b.* from t_emp e FULL JOIN t_boss b ON e.id_boss = b.id
[x] SELECT e.* from t_emp e FULL JOIN t_boss b ON e.id_boss = b.id


-- UNION

-- UNION 操作符用于合并两个或多个 SELECT 语句的结果集。
-- 请注意，UNION 内部的 SELECT 语句必须拥有相同数量的列。列也必须拥有相似的数据类型。同时，每条 SELECT 语句中的列的顺序必须相同。
SELECT id,name,age FROM t_emp UNION ALL SELECT id,name,age FROM t_boss

-- 注释：默认地，UNION 操作符选取不同的值。如果允许重复的值，请使用 UNION ALL。
SELECT name,age FROM t_emp UNION SELECT name,age FROM t_boss
SELECT name,age FROM t_emp UNION ALL SELECT name,age FROM t_boss
