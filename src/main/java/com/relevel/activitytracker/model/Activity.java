package com.relevel.activitytracker.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Activity {

    @Id
    private long activity_id;
}
