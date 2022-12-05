package ru.vzaytsev.auto.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.vzaytsev.auto.entity.Auto;
import ru.vzaytsev.auto.service.AutoService;

import java.util.List;

@Tag(name = "AutoController", description = "AutoController")
@RequestMapping(value = "/v1")
@RestController
@RequiredArgsConstructor
public class AutoController {

    private final AutoService autoService;

    @Operation(summary = "Create auto", tags = {"create-auto"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Created",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Auto.class))),
            @ApiResponse(responseCode = "500", description = "При выполнении запроса возникла неизвестная ошибка.", content = @Content)})
    @PostMapping("/auto")
    public ResponseEntity createAuto(@RequestBody Auto auto){
        autoService.createAuto(auto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Operation(summary = "Get auto", tags = {"get-auto"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Created",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Auto.class))),
            @ApiResponse(responseCode = "500", description = "При выполнении запроса возникла неизвестная ошибка.", content = @Content)})
    @GetMapping("/auto/{autoId}")
    public ResponseEntity<Auto> getAuto(@PathVariable("autoId") Long autoId){
        return ResponseEntity.status(HttpStatus.OK).body(autoService.getAutoById(autoId));
    }

    @Operation(summary = "Get auto", tags = {"get-auto"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Created",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Auto.class))),
            @ApiResponse(responseCode = "500", description = "При выполнении запроса возникла неизвестная ошибка.", content = @Content)})
    @GetMapping("/auto/list/{clientId}")
    public ResponseEntity<List<Auto>> getAutoByClientId(@PathVariable("clientId") Long clientId){
        return ResponseEntity.status(HttpStatus.OK).body(autoService.getAutoByClientId(clientId));
    }

    @Operation(summary = "updated auto", tags = {"updated-auto"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Created",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Auto.class))),
            @ApiResponse(responseCode = "500", description = "При выполнении запроса возникла неизвестная ошибка.", content = @Content)})
    @PutMapping("/auto")
    public ResponseEntity updatedAuto(@RequestBody Auto auto){
        autoService.updatedAuto(auto);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
