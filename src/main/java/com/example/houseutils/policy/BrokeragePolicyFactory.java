package com.example.houseutils.policy;

import com.example.houseutils.constants.ActionType;

public class BrokeragePolicyFactory {
    // 정책을 설정해주는 클래스
    public static BrokeragePolicy of(ActionType actionType) {
        switch (actionType) {
            case RENT:
                return new RentBrokeragePolicy();
            case PURCHASE:
                return new PurchaseBrokeragePolicy();
            default:
                throw new IllegalArgumentException("해당 actionType에 대한 정책이 존재하지 않음");
        }
    }
}
