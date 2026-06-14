package com.appodeal.consent.networking;

import com.appodeal.consent.CmpType;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f15538a;

    static {
        int[] iArr = new int[CmpType.values().length];
        try {
            iArr[CmpType.Ump.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CmpType.None.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f15538a = iArr;
    }
}
