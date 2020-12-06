package com.cashew.user.entity;

import com.cashew.user.VO.PK;

public abstract class AggregateRoot<PK> {
    private PK pk;


    public AggregateRoot() {
    }

    public AggregateRoot(PK pk) {
        this.pk = pk;
    }

    public PK getPK() {
        return pk;
    }
}
