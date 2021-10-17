## ビルド
```
./gradlew build
```

## 開発環境起動
環境変数`SPRING_PROFILES_ACTIVE`によって、利用するapplication.propertiesを変更する。
### local環境
8081ポートで起動
IntellijのRunConfigurationで下記の環境変数を設定しておく。
```
SPRING_PROFILES_ACTIVE=local
```

### dokcer環境
8080ポートで起動
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
