package com.taurusx.tax.g;

import android.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f66103w = 8;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static ConcurrentLinkedQueue<byte[]> f66104y = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f66105z = "BytesCrypt";

    public static void c(byte[] bArr) {
        if (f66104y.size() >= 5) {
            Log.d(f66105z, "returnKeyBytes with full cache pool");
        } else {
            Arrays.fill(bArr, (byte) 0);
            f66104y.offer(bArr);
        }
    }

    public static String w(byte[] bArr) {
        byte[] bArrZ = z();
        System.arraycopy(bArr, 0, bArrZ, 0, 8);
        String strZ = z(bArr, 8, bArr.length - 8, bArrZ);
        c(bArrZ);
        return strZ;
    }

    public static void y(byte[] bArr) {
        int length = bArr.length / 2;
        for (int i10 = 0; i10 < length * 2; i10 += 2) {
            byte b10 = bArr[i10];
            int i11 = i10 + 1;
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }
    }

    public static byte[] z(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        byte[] bArrZ = z(8);
        byte[] bArr = new byte[bytes.length + bArrZ.length];
        System.arraycopy(bArrZ, 0, bArr, 0, bArrZ.length);
        z(bArrZ);
        w(bytes, 0, bytes.length, bArrZ);
        System.arraycopy(bytes, 0, bArr, bArrZ.length, bytes.length);
        return bArr;
    }

    public static void w(byte[] bArr, int i10, int i11, byte[] bArr2) {
        int length = bArr2.length;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            bArr[i14] = (byte) (bArr[i14] ^ bArr2[i13 % length]);
            i12++;
            i13++;
        }
    }

    public static byte[] w(int i10) {
        byte[] bArr = new byte[i10];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static String z(byte[] bArr, int i10, int i11, byte[] bArr2) {
        z(bArr2);
        w(bArr, i10, i11, bArr2);
        return new String(bArr, i10, i11, StandardCharsets.UTF_8);
    }

    public static void z(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        y(bArr2);
        w(bArr, 0, bArr.length, bArr2);
    }

    public static byte[] z(int i10) {
        return w(i10);
    }

    public static byte[] z() {
        byte[] bArrPoll = f66104y.poll();
        if (bArrPoll != null) {
            return bArrPoll;
        }
        byte[] bArr = new byte[8];
        Log.d(f66105z, "getCachedKeyBytes with empty cache pool");
        return bArr;
    }
}
