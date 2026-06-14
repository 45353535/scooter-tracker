package com.my.target.common;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes11.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface CachePolicy {
    public static final int ALL = 0;
    public static final int IMAGE = 1;
    public static final int NONE = 3;
    public static final int VIDEO = 2;
}
