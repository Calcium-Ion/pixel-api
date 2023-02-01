package work.caion.api.pixelapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import work.caion.api.pixelapi.result.Result;
import work.caion.api.pixelapi.result.Results;
import work.caion.api.pixelapi.util.PingUtil;

import java.io.IOException;


@RequestMapping("/server")
@RestController
@Slf4j
public class ServerController {

    @GetMapping("/ping/{ip}/{port}")
    public Result ping(@PathVariable String ip, @PathVariable Integer port) throws IOException {
        log.info("Ping {}:{}", ip, port);
        return Results.success(PingUtil.ping(ip, port));
    }

}
