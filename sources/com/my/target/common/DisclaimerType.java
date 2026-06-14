package com.my.target.common;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes11.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface DisclaimerType {
    public static final int ALCOHOL = 3;
    public static final int BEER = 4;
    public static final int DECLARATION = 10;
    public static final int DIETARY = 9;
    public static final int DRUGS = 8;
    public static final int MEDICAL = 6;
    public static final int TOBACCO = 5;
    public static final int UNDEFINED = 0;
}
