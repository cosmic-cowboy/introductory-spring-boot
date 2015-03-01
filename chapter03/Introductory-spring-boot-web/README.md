### 実行見本

全件取得

```
$ curl localhost:8080/api/customers
```

１件取得

```
$ curl localhost:8080/api/customers/1
```

登録

```
$ curl localhost:8080/api/customers -v -X POST -H "Content-Type: application/json" -d "{\"firstName\":\"kaku\",\"lastName\":\"Tanaka\"}"
```

登録確認

```
$ curl localhost:8080/api/customers
```

更新

```
$ curl localhost:8080/api/customers/5 -v -X PUT -H "Content-Type: application/json" -d "{\"firstName\":\"maki\",\"lastName\":\"Tanaka\"}"
```

削除

```
$ curl localhost:8080/api/customers/5 -v -X DELETE
```
