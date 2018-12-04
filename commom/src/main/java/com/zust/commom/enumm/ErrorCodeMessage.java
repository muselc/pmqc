package com.zust.commom.enumm;

import org.apache.commons.lang3.StringUtils;

public enum ErrorCodeMessage {

    INDICATOR(951004, "Set at least one indicator","请至少设置一项伸缩指标"),
    PARAMETERS(951005, "Request parameters:","请求参数:");

    private final int value;
    private final String reasonEnPhrase;
    private final String reasonChPhrase;

    ErrorCodeMessage(int value, String reasonEnPhrase, String reasonChPhrase) {
        this.value = value;
        this.reasonEnPhrase = reasonEnPhrase;
        this.reasonChPhrase = reasonChPhrase;
    }


    public String getReasonEnPhrase() {
        return this.reasonEnPhrase;
    }

    public String getReasonChPhrase() {
        return reasonChPhrase;
    }

    @Override
    public String toString() {
        return Integer.toString(this.value);
    }

    public static ErrorCodeMessage valueOf(int statusCode) {
        ErrorCodeMessage[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ErrorCodeMessage status = var1[var3];
            if (status.value == statusCode) {
                return status;
            }
        }
        throw new IllegalArgumentException("No matching constant for [" + statusCode + "]");
    }
}
