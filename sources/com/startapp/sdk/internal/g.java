package com.startapp.sdk.internal;

import android.net.Uri;
import android.util.Base64;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.C4240b4;
import com.startapp.sdk.common.utils.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f64533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f64534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f64535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f64536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f64537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f64538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f64539g;

    static {
        int i10 = q0.f65128a;
        "startapp.".concat(g.class.getSimpleName());
        f64533a = new byte[]{10, Ascii.RS, 84, 95, 101, Ascii.DC4, 0, Ascii.SO, Ascii.SI, 80, 36, 84, SignedBytes.MAX_POWER_OF_TWO, 82, 84, SignedBytes.MAX_POWER_OF_TWO, 80, 80, 65, 78, 84, 73, 70, 82, 65, 85, 68, 75, 69, 89, 1, 2, 3, 8, Ascii.SI, 42, 10, 51, 44, 32};
        f64534b = "ts";
        f64535c = "tsh";
        f64536d = "afh";
        f64537e = "MD5";
        f64538f = "UTF-8";
        f64539g = new byte[]{Ascii.FF, Ascii.US, 86, 96, 103, 10, Ascii.FS, Ascii.SI, 17, Ascii.FS, 36, 84, SignedBytes.MAX_POWER_OF_TWO, 82, 84, SignedBytes.MAX_POWER_OF_TWO, 80, 80, 69, 78, 67, 82, 89, 80, 84, 73, 79, 78, 75, 69, 89, 4, 32, Ascii.DC2, Ascii.DLE, Ascii.DC2, Ascii.VT, 53, 45, 34};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(Pair pair) {
        return C4240b4.j.f42670c + f64534b + C4240b4.j.f42668b + ((String) pair.first) + C4240b4.j.f42670c + f64536d + C4240b4.j.f42668b + ((String) pair.second);
    }

    public static String b(String str) {
        return Base64.encodeToString(a(str.getBytes()), 2);
    }

    public static Pair c(String str) {
        String strDecode = "";
        if (str != null) {
            try {
                strDecode = URLDecoder.decode(str, f64538f);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        String strA = a();
        return new Pair(strA, a(strDecode + strA));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(String str, String str2) {
        Pair pairC = c(str2);
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter(f64534b, (String) pairC.first).appendQueryParameter(f64536d, (String) pairC.second).build().toString();
        } catch (Throwable unused) {
            return str + a(pairC);
        }
    }

    public static String a() {
        int iHashCode = Arrays.hashCode(f64533a);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (iHashCode > 0) {
            int i10 = (int) ((((jCurrentTimeMillis * 25214903917L) + 11) & 281474976710655L) >>> 17);
            if ((((-iHashCode) & iHashCode) == iHashCode ? (int) ((((long) iHashCode) * ((long) i10)) >> 31) : i10 % iHashCode) == 0) {
                System.out.println();
            }
        }
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr = f64533a;
        int length = bytes.length < bArr.length ? bytes.length : bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            byte b10 = bytes[i10];
            byte b11 = bArr[i10];
        }
        byte[] bytes2 = str.getBytes();
        byte b12 = f64533a[5];
        byte[] bArr2 = new byte[Math.min(bytes2.length, (int) b12)];
        for (int i11 = 0; i11 < bytes2.length; i11++) {
            int i12 = i11 % b12;
            bArr2[i12] = (byte) (bArr2[i12] ^ bytes2[i11]);
        }
        byte[] bArr3 = f64533a;
        try {
            return URLEncoder.encode(Base64.encodeToString(MessageDigest.getInstance(f64537e).digest(a(bArr2, new String(bArr3).substring(bArr3[0], bArr3[1]).getBytes())), 3), f64538f);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = f64539g;
        int iHashCode = bArr2.hashCode();
        long jHashCode = bArr.hashCode();
        if (iHashCode > jHashCode) {
            int i10 = (int) ((((jHashCode * 29509871405L) + 11) & 16777215) >>> 17);
            if (iHashCode >= 1000) {
                int i11 = i10 % iHashCode;
            }
        }
        return a(a(bArr, new String(bArr2).substring(bArr2[5], bArr2[33]).getBytes()), new String(bArr2).substring(bArr2[35], bArr2[1]).getBytes());
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10 % bArr2.length]);
        }
        return bArr3;
    }
}
