package kr.wky.stdout.api.v1;

import kr.wky.stdout.api.dto.ApiResult;
import kr.wky.stdout.api.dto.LevelDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController("/api/v1/stdout")
public class StdoutApiController {

    @GetMapping("/logStdout")
    public ApiResult getLogStdout(@RequestParam(value = "level", defaultValue = "all") String level, @RequestParam(value = "msg", defaultValue = "Log Hello World") String msg) {

        level = level.toLowerCase();

        switch(level){
            case "TRACE" -> log.trace(msg);
            case "DEBUG" -> log.debug(msg);
            case "INFO" -> log.info(msg);
            case "WARN" -> log.warn(msg);
            case "ERROR" -> log.error(msg);
            default -> {
                log.trace(msg);
                log.debug(msg);
                log.info(msg);
                log.warn(msg);
                log.error(msg);
            }
        }
        return new ApiResult(new LevelDto(level, msg));
    }

    @GetMapping("/print")
    public ApiResult getSysout(@RequestParam(value = "msg", defaultValue = "Print Hello World") String msg) {

        System.out.println(msg);
        return new ApiResult(new LevelDto("System.out.println", msg));
    }
}
