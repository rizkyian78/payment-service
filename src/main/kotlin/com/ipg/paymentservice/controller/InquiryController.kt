package com.ipg.paymentservice.controller

import com.ipg.paymentservice.service.InquiryService
import com.ipg.paymentservice.specs.InquiryRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/inquiries")
class InquiryController {

    @Autowired
    lateinit var inquiryService: InquiryService

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createInquiry(@RequestBody payload: InquiryRequest): Unit {
        inquiryService.createRepository(payload)
        return
    }

}