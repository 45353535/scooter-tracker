package com.appsflyer.internal;

import android.annotation.SuppressLint;
import com.appodeal.ads.modules.common.internal.LogConstants;

/* JADX INFO: loaded from: classes6.dex */
public final class AFg1uSDK extends AFh1jSDK {
    @SuppressLint({"VisibleForTests"})
    public AFg1uSDK() {
        super(LogConstants.EVENT_REGISTER, null, Boolean.FALSE);
    }

    @Override // com.appsflyer.internal.AFh1jSDK
    public final AFe1mSDK getCurrencyIso4217Code() {
        return AFe1mSDK.REGISTER;
    }

    @Override // com.appsflyer.internal.AFh1jSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }
}
