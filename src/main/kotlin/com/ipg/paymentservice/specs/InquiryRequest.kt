package com.ipg.paymentservice.specs

import io.konform.validation.Validation
import io.konform.validation.jsonschema.maximum
import io.konform.validation.jsonschema.minimum
import kotlin.math.min


data class InquiryRequest(
    val amount: Long
)

val validateInquiryRequest = Validation<InquiryRequest> {
    InquiryRequest::amount {
        minimum(1).hint("Amount must be greater than 0")
    }
}