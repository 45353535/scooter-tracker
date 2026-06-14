package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.google.common.base.Ascii;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f56118a;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        f56118a = charArray;
    }

    public static final String a(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f56118a;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & Ascii.SI];
        }
        return new String(cArr);
    }
}
