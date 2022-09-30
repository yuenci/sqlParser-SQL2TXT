# sqlParser

restriction：
1. Where clause can only use all and or all OR, not mixed.
```
select * from test1 where a = 1 and b = 2 and c = 3  -- ✅

select * from test1 where a = 1 or b = 2 or c = 3 -- ✅
 
select * from test1 where a = 1 and b = 2 or c = 3 -- ❌
```
