package com.startapp.sdk.adsbase.adinformation;

import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f63984a;

    static {
        int[] iArr = new int[AdInformationPositions.Position.values().length];
        f63984a = iArr;
        try {
            iArr[AdInformationPositions.Position.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f63984a[AdInformationPositions.Position.TOP_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f63984a[AdInformationPositions.Position.BOTTOM_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f63984a[AdInformationPositions.Position.BOTTOM_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
