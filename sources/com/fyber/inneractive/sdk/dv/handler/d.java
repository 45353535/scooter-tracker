package com.fyber.inneractive.sdk.dv.handler;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20532a;

    static {
        int[] iArr = new int[UnitDisplayType.values().length];
        f20532a = iArr;
        try {
            iArr[UnitDisplayType.BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20532a[UnitDisplayType.MRECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f20532a[UnitDisplayType.REWARDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
