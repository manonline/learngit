package com.otms.newcomer.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ActualOrder")
public class ActualOrder extends Order {

}
