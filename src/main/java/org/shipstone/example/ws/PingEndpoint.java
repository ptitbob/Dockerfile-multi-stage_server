package org.shipstone.example.ws;

import org.shipstone.example.configuration.ServerInformation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author François Robert
 */
@RestController()
@RequestMapping("ping")
public class PingEndpoint {

  private final ServerInformation serverInformation;

  public PingEndpoint(ServerInformation serverInformation) {
    this.serverInformation = serverInformation;
  }

  @GetMapping
  public String pong() {
    return "pong";
  }

  @GetMapping("version")
  public String getServerVersion() {
    return serverInformation.getVersion();
  }

  @GetMapping("description")
  public String getServerDescription() {
    return serverInformation.getDescription();
  }
}
