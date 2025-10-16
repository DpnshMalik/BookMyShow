package com.bookmyshow.models;
import java.util.List;

import com.bookmyshow.enums.Feature;
import com.bookmyshow.enums.ShowStatus;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;

import java.util.Date;
import lombok.Data;

@Data
@Entity(name="shows")
public class Show extends BaseModel {

	private Date startTime;

	private Date endTime;

	@Enumerated(EnumType.ORDINAL)
	private ShowStatus showStatus;


	@ManyToOne
	private Screen screen;

	@ManyToOne
	private Movie movie;

	@Enumerated(EnumType.ORDINAL)
	@ElementCollection
	private List<Feature> features;

}
