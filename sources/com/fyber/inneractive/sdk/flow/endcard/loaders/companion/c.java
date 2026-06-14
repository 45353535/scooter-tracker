package com.fyber.inneractive.sdk.flow.endcard.loaders.companion;

import com.fyber.inneractive.sdk.model.vast.k;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20685a;

    static {
        int[] iArr = new int[k.values().length];
        f20685a = iArr;
        try {
            iArr[k.Jpeg.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20685a[k.Jpg.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f20685a[k.Png.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
