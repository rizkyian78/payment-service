package com.ipg.paymentservice.service

import com.ipg.paymentservice.specs.InquiryRequest
import com.ipg.paymentservice.repository.InquiryRepository
import com.ipg.paymentservice.specs.validateInquiryRequest
import com.ipg.paymentservice.utils.BadRequestException
import io.konform.validation.Invalid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.HttpClientErrorException.BadRequest
import java.lang.IllegalArgumentException

import kotlin.reflect.typeOf

@Service
class InquiryService {

    @Autowired
    lateinit var inquiryRepository: InquiryRepository


    fun createRepository(inquiry: InquiryRequest): Unit {
        val validateUser =  validateInquiryRequest(inquiry)
        if (validateUser is Invalid<InquiryRequest>) {
    validateUser.errors.forEach { it ->
        println(it.message)
    }

            throw BadRequestException("Bad Parameter Requisite")
        }

    }
}