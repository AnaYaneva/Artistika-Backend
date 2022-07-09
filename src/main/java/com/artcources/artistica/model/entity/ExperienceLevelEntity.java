package com.artcources.artistica.model.entity;

import com.artcources.artistica.model.enums.ExperienceLevelEnum;
import com.artcources.artistica.model.enums.UserRoleEnum;

import javax.persistence.*;

@Entity
@Table(name ="experience_level")
public class ExperienceLevelEntity extends BaseEntity {

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ExperienceLevelEnum experienceLevel;

    public ExperienceLevelEntity() {
    }

    public ExperienceLevelEnum getExperienceLevel() {
        return experienceLevel;
    }

    public ExperienceLevelEntity setExperienceLevel(ExperienceLevelEnum experienceLevel) {
        this.experienceLevel = experienceLevel;
        return this;
    }
}
