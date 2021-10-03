## ビルド
```
./gradlew build
```

## 開発環境起動
```
docker-compose up --build -d
```

## APIテスト
### POST

```
curl -i -H "Content-Type: application/json" -X POST \
-d '{"title": "Create API by Spring Boot and Kotlin", "content": "Text of creating API"}' \
http://localhost:8080/api/qiitas
```

### GET
```
curl -i -H 'Accept: application/json' http://localhost:8080/api/qiitas
```
