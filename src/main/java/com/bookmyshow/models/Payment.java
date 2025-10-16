package com.bookmyshow.models;

import com.bookmyshow.enums.PaymentMode;
import com.bookmyshow.enums.PaymentProvider;
import com.bookmyshow.enums.PaymentStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
@Entity
public class Payment extends BaseModel {

	private int amount;
	private String refNo;
	@Enumerated(EnumType.ORDINAL)
	private PaymentProvider paymentProvider;
	@Enumerated(EnumType.ORDINAL)
	private PaymentStatus paymentStatus;
	@Enumerated(EnumType.ORDINAL)
	private PaymentMode paymentMode;


}
