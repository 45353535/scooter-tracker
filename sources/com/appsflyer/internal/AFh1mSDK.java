package com.appsflyer.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AFh1mSDK extends AFh1jSDK {
    private final boolean equals;
    private final boolean toString;

    AFh1mSDK() {
        this(null, null, null);
    }

    protected AFh1mSDK(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2) {
        super(str, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
        this.equals = bool != null ? bool.booleanValue() : true;
        this.toString = true;
    }
}
