package com.appodeal.ads.adapters.bidon.ext;

import org.bidon.sdk.logs.analytic.Precision;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12124a;

    static {
        int[] iArr = new int[Precision.values().length];
        try {
            iArr[Precision.Precise.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Precision.Estimated.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f12124a = iArr;
    }
}
