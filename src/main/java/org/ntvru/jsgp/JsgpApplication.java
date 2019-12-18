package org.ntvru.jsgp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JsgpApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsgpApplication.class, args);
	}

//	@Bean
//	public FilterRegistrationBean<MaterialFilter> materialFilterChain(){
//		FilterRegistrationBean<MaterialFilter> filterBean 
//	      = new FilterRegistrationBean<>();
//		filterBean.setFilter(new MaterialFilter());		
//		filterBean.addUrlPatterns("/material/*");
//		return filterBean;
//	}
	

}
