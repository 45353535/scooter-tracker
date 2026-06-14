package com.appodeal.ads.services.adjust.util;

import com.appodeal.ads.modules.common.internal.service.InitializationMode;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f14567a;

    static {
        int[] iArr = new int[InitializationMode.values().length];
        try {
            iArr[InitializationMode.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InitializationMode.Passive.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f14567a = iArr;
    }
}
