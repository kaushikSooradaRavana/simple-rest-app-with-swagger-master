package com.cinteo.oneweb.mbusa;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.daimler.oneweb.common.ResponseMessages;
import com.daimler.oneweb.common.documentation.DocumentedApiMethod;
import com.daimler.oneweb.common.error.OneWebServiceException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * 
 * @author Gregor Zurowski
 *
 */
@Api(produces = "application/json", protocols = "https")
@RestController
public class SimpleRestController {

    /**
     * Exposed via Swagger due to {@code @DocumentedApiMethod} annotation.
     */
    @ApiResponses(value = { @ApiResponse(code = 200, message = ResponseMessages.RESPONSE_MESSAGE_200),
            @ApiResponse(code = 400, message = ResponseMessages.RESPONSE_MESSAGE_400, response = OneWebServiceException.class),
            @ApiResponse(code = 500, message = ResponseMessages.RESPONSE_MESSAGE_500, response = OneWebServiceException.class),
            @ApiResponse(code = 501, message = ResponseMessages.RESPONSE_MESSAGE_501, response = OneWebServiceException.class) })
    @DocumentedApiMethod
    @GetMapping("/hello/{name}")
    public Map<String, String> hello(@PathVariable(value = "name") String name) {
        return Collections.singletonMap("message", String.format("Hello %s!", name));
    }

    /**
     * Not exposed via Swagger due to missing {@code @DocumentedApiMethod}
     * annotation.
     */
    @GetMapping("/guten-tag/{name}")
    public Map<String, String> gutenTag(@PathVariable(value = "name") String name) {
        return Collections.singletonMap("message", String.format("Guten Tag, %s!", name));
    }

}
