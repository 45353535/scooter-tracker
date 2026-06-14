package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductType;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f74973a;

    static {
        int[] iArr = new int[ProductType.values().length];
        iArr[ProductType.INAPP.ordinal()] = 1;
        iArr[ProductType.SUBS.ordinal()] = 2;
        f74973a = iArr;
    }
}
