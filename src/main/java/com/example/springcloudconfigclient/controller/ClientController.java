package com.example.springcloudconfigclient.controller;

import com.example.springcloudconfigclient.config.TemplateConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ClientController {

  private final TemplateConfig templateConfig;

  @GetMapping("/getInfo")
  private TemplateConfig getInfo() {
    return TemplateConfig.builder()
        .profile(templateConfig.getProfile())
        .serverName(templateConfig.getServerName())
        .url(templateConfig.getUrl())
        .username(templateConfig.getUsername())
        .password(templateConfig.getPassword())
        .build();
  }
}
