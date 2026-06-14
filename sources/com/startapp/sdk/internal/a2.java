package com.startapp.sdk.internal;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a2 {
    public static final String a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            return new String(bArrDecode, Charsets.UTF_8);
        } catch (Exception unused) {
            return str;
        }
    }
}
