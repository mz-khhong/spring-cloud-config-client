package com.example.springcloudconfigclient.config;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Getter
@RefreshScope
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Component
public class TemplateConfig {

  @Value("${message.profile}")
  private String profile;

  @Value("${message.server-name}")
  private String serverName;

  @Value("${spring.datasource.url}")
  private String url;

  @Value("${spring.datasource.username}")
  private String username;

  @Value("${spring.datasource.password}")
  private String password;

}
