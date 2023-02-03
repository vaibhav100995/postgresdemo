package com.postgresqlcode.postgresdemo.constant;

import lombok.Getter;

@Getter
public enum I18Constants {
    NO_ITEM_FOUND("item.absent");

    String key;
    I18Constants(String key) {
        this.key = key;
    }
}