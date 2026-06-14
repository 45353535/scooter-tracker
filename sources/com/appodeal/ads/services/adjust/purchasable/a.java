package com.appodeal.ads.services.adjust.purchasable;

import com.adjust.sdk.purchase.ADJPVerificationState;
import com.appodeal.ads.inapp.InAppPurchase;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f14551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f14552b;

    static {
        int[] iArr = new int[InAppPurchase.Type.values().length];
        try {
            iArr[InAppPurchase.Type.InApp.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InAppPurchase.Type.Subs.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f14551a = iArr;
        int[] iArr2 = new int[ADJPVerificationState.values().length];
        try {
            iArr2[ADJPVerificationState.ADJPVerificationStatePassed.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ADJPVerificationState.ADJPVerificationStateFailed.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ADJPVerificationState.ADJPVerificationStateUnknown.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f14552b = iArr2;
    }
}
