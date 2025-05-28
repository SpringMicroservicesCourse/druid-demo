package tw.fengqing.spring.durid.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import com.alibaba.druid.filter.Filter;
import java.sql.Connection;

@SpringBootApplication
@Slf4j
public class DruidDemoApplication implements CommandLineRunner {
	
	private final DataSource dataSource;

	public DruidDemoApplication(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Configuration
	static class DruidConfig {
		@Bean
		public Filter connectionLogFilter() {
			return new ConnectionLogFilter();
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(DruidDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(dataSource.toString());
	}
}
