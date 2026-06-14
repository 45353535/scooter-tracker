package com.appsflyer.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AFh1fSDK extends AFh1mSDK {
    AFh1fSDK() {
        this(null, null);
    }

    @Override // com.appsflyer.internal.AFh1jSDK
    public final boolean areAllFieldsValid() {
        return false;
    }

    @Override // com.appsflyer.internal.AFh1jSDK
    public final boolean component1() {
        return false;
    }

    @Override // com.appsflyer.internal.AFh1jSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    AFh1fSDK(@Nullable String str, @Nullable Boolean bool) {
        super(str, Boolean.FALSE, bool);
    }
}
