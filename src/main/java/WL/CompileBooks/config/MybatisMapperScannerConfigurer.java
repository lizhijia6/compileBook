package WL.CompileBooks.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@AutoConfigureAfter(MybatisConfig.class)
public class MybatisMapperScannerConfigurer {
	 @Bean
	    public MapperScannerConfigurer mapperScannerConfigurer() {
	        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
	        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
	        mapperScannerConfigurer.setBasePackage("tk.mybatis.springboot.mapper");
	        return mapperScannerConfigurer;
	    }
}
