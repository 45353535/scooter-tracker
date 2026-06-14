package com.google.android.odml.image;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes9.dex */
final /* synthetic */ class zzd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f28612a;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        f28612a = iArr;
        try {
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f28612a[Bitmap.Config.ARGB_8888.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
