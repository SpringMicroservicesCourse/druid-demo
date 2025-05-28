# 課程介紹

這是一個展示如何在 Spring Boot 專案中整合 Alibaba Druid 連接池的示例專案。

## 技術棧

- Java 17
- Spring Boot 3.1.5
- Druid Spring Boot 3 Starter 1.2.20
- H2 Database (內存模式)
- Maven

## 功能特點

- 整合 Druid 連接池
- 自定義連接池配置
- 連接監控和日誌記錄
- 數據庫密碼加密

## 快速開始

### 前置條件

- JDK 17 或更高版本
- Maven 3.6 或更高版本

### 構建和運行

1. 克隆專案：
```bash
git clone https://github.com/SpringMicroservicesCourse/druid-demo
cd druid-demo
```

2. 使用 Maven 構建：
```bash
mvn clean package -DskipTests
```

3. 運行應用：
```bash
mvn spring-boot:run
```

## 配置說明

主要配置文件位於 `src/main/resources/application.properties`：

```properties
# 數據源基本配置
spring.datasource.url=jdbc:h2:mem:foo
spring.datasource.username=sa

# Druid 連接池配置
spring.datasource.druid.initial-size=5
spring.datasource.druid.max-active=5
spring.datasource.druid.min-idle=5
spring.datasource.druid.filters=conn,config,stat,slf4j

# 連接池測試配置
spring.datasource.druid.test-on-borrow=true
spring.datasource.druid.test-on-return=true
spring.datasource.druid.test-while-idle=true
spring.datasource.druid.validation-query=SELECT 1
```

## 專案結構

```
src/main/java/tw/fengqing/spring/durid/demo/
├── DruidDemoApplication.java      # 主應用程序
└── ConnectionLogFilter.java       # 自定義連接日誌過濾器
```

## 主要特性說明

1. **連接池配置**
   - 初始連接數：5
   - 最大活動連接：5
   - 最小空閒連接：5

2. **連接監控**
   - 啟用連接監控和統計
   - 自定義連接日誌記錄

3. **安全特性**
   - 數據庫密碼加密
   - 使用配置加密功能

## 注意事項

- 本示例使用 H2 內存數據庫，生產環境請更換為實際的數據庫
- 生產環境部署時請更改默認的安全配置
- 建議根據實際需求調整連接池參數
