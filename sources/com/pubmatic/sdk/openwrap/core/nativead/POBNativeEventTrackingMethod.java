package com.pubmatic.sdk.openwrap.core.nativead;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public enum POBNativeEventTrackingMethod {
    IMAGE(1),
    JAVASCRIPT(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f62887a;

    POBNativeEventTrackingMethod(int i10) {
        this.f62887a = i10;
    }

    @Nullable
    public static POBNativeEventTrackingMethod getEventTrackingMethod(int i10) {
        if (i10 == 1) {
            return IMAGE;
        }
        if (i10 != 2) {
            return null;
        }
        return JAVASCRIPT;
    }

    public int getNativeEventTrackingMethodValue() {
        return this.f62887a;
    }
}
