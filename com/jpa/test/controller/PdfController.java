package com.jpa.test.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

public class PdfController {
	
	@PostMapping(value = "/api/pdf", consumes = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<String> savePdf(@RequestBody byte[] pdfData) {
        // Save or process the PDF file
        return ResponseEntity.ok("PDF saved successfully");
    }

}
