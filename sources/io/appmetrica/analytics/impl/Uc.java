package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class Uc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f76559a;

    static {
        int[] iArr = new int[ModuleAdType.values().length];
        iArr[ModuleAdType.NATIVE.ordinal()] = 1;
        iArr[ModuleAdType.BANNER.ordinal()] = 2;
        iArr[ModuleAdType.REWARDED.ordinal()] = 3;
        iArr[ModuleAdType.INTERSTITIAL.ordinal()] = 4;
        iArr[ModuleAdType.MREC.ordinal()] = 5;
        iArr[ModuleAdType.APP_OPEN.ordinal()] = 6;
        iArr[ModuleAdType.OTHER.ordinal()] = 7;
        f76559a = iArr;
    }
}
