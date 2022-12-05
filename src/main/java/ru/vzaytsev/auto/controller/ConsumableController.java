//package ru.vzaytsev.auto.controller;
//
//import io.micrometer.core.annotation.Timed;
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.media.Content;
//import io.swagger.v3.oas.annotations.media.Schema;
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
//import io.swagger.v3.oas.annotations.responses.ApiResponses;
//import io.swagger.v3.oas.annotations.tags.Tag;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import ru.vzaytsev.auto.entity.Auto;
//import ru.vzaytsev.auto.entity.ClientInfo;
//import ru.vzaytsev.auto.service.ClientInfoService;
//
//@Tag(name = "AutoController", description = "AutoController")
//@RequestMapping(value = "/v1")
//@RestController
//@RequiredArgsConstructor
//public class ConsumableController {
//
//    private final ClientInfoService clientInfoService;
//
//    @Operation(summary = "Create auto", tags = {"create-feedback"})
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "201", description = "Created",
//                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Auto.class))),
//            @ApiResponse(responseCode = "500", description = "При выполнении запроса возникла неизвестная ошибка.", content = @Content)})
//    @Timed(value = "create-auto", description = "Create auto")
//    @PostMapping("/create-client")
//    public ResponseEntity createClientInfo(@RequestBody ClientInfo clientInfo){
//        clientInfoService.createClientInfo(clientInfo);
//        return ResponseEntity.status(HttpStatus.CREATED).build();
//    }
//}
