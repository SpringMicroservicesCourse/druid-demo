# 課程介紹

這是一個展示如何在 Spring Boot 專案中整合 Alibaba Druid 連接池的示例專案。

## 技術棧

- Java 17
- Spring Boot 3.4.5
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

## 授權說明

本專案採用 MIT 授權條款，詳見 LICENSE 檔案。 

## 關於我們

我們主要專注在敏捷專案管理、物聯網（IoT）應用開發和領域驅動設計（DDD）。喜歡把先進技術和實務經驗結合，打造好用又靈活的軟體解決方案。近來也積極結合 AI 技術，推動自動化工作流，讓開發與運維更有效率、更智慧。持續學習與分享，希望能一起推動軟體開發的創新和進步。

## 聯繫我們

若有任何問題、合作或想了解更多，歡迎透過以下管道與我們聯繫：

- FB 粉絲頁：[風清雲談 | Facebook](https://www.facebook.com/profile.php?id=61576838896062)
- LinkedIn：[linkedin.com/in/chu-kuo-lung](https://www.linkedin.com/in/chu-kuo-lung)
- YouTube 頻道：[雲談風清 - YouTube](https://www.youtube.com/channel/UCXDqLTdCMiCJ1j8xGRfwEig)
- 風清雲談 部落格：[風清雲談](https://blog.fengqing.tw/)
- 電子郵件：[fengqing.tw@gmail.com](mailto:fengqing.tw@gmail.com)