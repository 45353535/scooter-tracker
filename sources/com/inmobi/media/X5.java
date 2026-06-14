package com.inmobi.media;

import android.util.Base64;
import android.util.Log;
import com.ironsource.C4240b4;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes9.dex */
public abstract class X5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f37988a = 0;

    public static byte[] a(String str) {
        int i10;
        if (str != null) {
            int length = str.length() % 4;
            i10 = length + ((((length ^ 4) & ((-length) | length)) >> 31) & 4);
        } else {
            i10 = 0;
        }
        String strValueOf = String.valueOf(str != null ? StringsKt.H1(str).toString() : null);
        for (int i11 = 0; i11 < i10; i11++) {
            strValueOf = ((Object) strValueOf) + C4240b4.j.f42668b;
        }
        byte[] bytes = strValueOf.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return Base64.decode(bytes, 2);
    }

    public static String a(String data, byte[] bArr) {
        byte[] bArrDoFinal;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullExpressionValue("X5", "TAG");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(...)");
            cipher.init(1, secretKeySpec);
            byte[] bytes = data.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            bArrDoFinal = cipher.doFinal(bytes);
        } catch (Throwable th2) {
            Log.d("X5", "SDK encountered unexpected error in getting encrypted AES bytes; " + th2.getMessage());
            bArrDoFinal = null;
        }
        byte[] bArrEncode = Base64.encode(bArrDoFinal, 2);
        Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(...)");
        String str = new String(bArrEncode, Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue("X5", "TAG");
        return str;
    }
}
