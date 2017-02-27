package com.leo.web.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

@Configurable
@PropertySource(value={"classpath:application.properties"})
public class BackConfig {
	
	@Value("${jdbc.driverClass}")
	private String driverClass;
	
	@Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }
	
	@Bean(name="schedulerFactoryBean")
	public SchedulerFactoryBean schedulerFactoryBean(){
		System.out.println("+++++++++++++++++++++++++++++++++driverClass:"+driverClass);
		return new SchedulerFactoryBean();
	}

}
