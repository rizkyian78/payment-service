package com.ipg.paymentservice.repository

import com.ipg.paymentservice.entity.Inquiries
import org.springframework.data.repository.CrudRepository

interface InquiryRepository: CrudRepository<Inquiries, String> {
}