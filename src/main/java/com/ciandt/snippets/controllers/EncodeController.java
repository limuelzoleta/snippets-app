package com.ciandt.snippets.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ciandt.snippets.models.SnippetRequest;
import com.ciandt.snippets.models.SnippetResponse;

@RestController
public class EncodeController {

    @PostMapping("/encode")
    public ResponseEntity<SnippetResponse> encode(@RequestBody SnippetRequest encodeRequest) {
        return ResponseEntity.ok(new SnippetResponse("test url"));
    }

}