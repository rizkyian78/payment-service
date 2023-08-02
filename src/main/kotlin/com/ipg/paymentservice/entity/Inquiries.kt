package com.ipg.paymentservice.entity

import jakarta.persistence.*
import jdk.jfr.Timestamp
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.jetbrains.annotations.NotNull
import java.util.*


@Entity
@Table(name = "inquiries")
class Inquiries(
    @Column(name = "id", unique = true)
    @Id
//    @org.hibernate.annotations.Index(name = "inquiries_pkey")
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String,

    @CreationTimestamp
    @NotNull
//    @org.hibernate.annotations.Index(name = "inquiries_createdtime")
    val createdtime: Date,

    @UpdateTimestamp
    val updatetime: Date,

    @NotNull
    val currency: String,

    @NotNull
    val amount: Long,

    @NotNull
    val lockedamount: Long,

    @NotNull
    val state: String,

    @NotNull
//    @org.hibernate.annotations.Index(name = "inquiries_merchant")
    val merchantid: String,

    @NotNull
//    @org.hibernate.annotations.Index(name = "inquiries_merchant")
    val refereceid: String,

    @NotNull
    val referenceUrl: String,

    @NotNull
    val paymentSourceMethod: String,

    @NotNull
    val paymentSource: String,

    @NotNull
    val token: String,

    @Column(columnDefinition = "jsonb")
    val orders: String,

    @Column(columnDefinition = "jsonb")
    val customer: String,

    @Timestamp
    val expirationTime: Date

    ){
    private constructor(): this("", Date(), Date(), "", 0, 0, "", "", "", "", "", "", "", "", "", Date())
}
