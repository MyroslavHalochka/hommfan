package com.hommfan.configuration;

import com.hommfan.model.RaceInteractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.thymeleaf.spring5.SpringTemplateEngine;
//import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
//import org.thymeleaf.spring5.view.ThymeleafViewResolver;

@Configuration
@ComponentScan(basePackages = {"com.hommfan"})
@PropertySource("classpath:hommfan.properties")
@EnableWebMvc
public class HOMMConfiguration implements WebMvcConfigurer {

  private final ApplicationContext applicationContext;

  @Autowired
  public HOMMConfiguration(ApplicationContext applicationContext) {

    this.applicationContext = applicationContext;

  }

  @Bean
  public RaceInteractor raceInteractor() {

    return new RaceInteractor();

  }

  public void addViewControllers(ViewControllerRegistry registry) {

    registry.addViewController("/artifacts").setViewName("artifacts");
    registry.addViewController("/").setViewName("");
    registry.addViewController("/resources").setViewName("resources");
    registry.addViewController("/login").setViewName("login");

  }

//  @Bean
//  public SpringResourceTemplateResolver templateResolver() {
//
//    SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
//    templateResolver.setApplicationContext(applicationContext);
//    templateResolver.setPrefix("/WEB-INF/view/");
//    templateResolver.setSuffix(".html");
//
//    return templateResolver;
//
//  }
//
//  @Bean
//  public SpringTemplateEngine templateEngine() {
//
//
//    SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//    templateEngine.setTemplateResolver(templateResolver());
//    templateEngine.setEnableSpringELCompiler(true);
//
//    return templateEngine;
//
//  }
//
//  @Override
//  public void configureViewResolvers(ViewResolverRegistry registry) {
//
//    ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//    resolver.setTemplateEngine(templateEngine());
//    registry.viewResolver(resolver);
//
//  }

//  @Override
//  public void addViewControllers(ViewControllerRegistry registry) {
//    registry.addViewController("/hello").setViewName("artifacts.html");
//    registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
//  }

}
