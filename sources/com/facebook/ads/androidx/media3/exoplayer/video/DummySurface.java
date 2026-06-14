package com.facebook.ads.androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.redexgen.core.AbstractC18094a;
import com.facebook.ads.redexgen.core.C3M;
import com.facebook.ads.redexgen.core.F6;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DummySurface extends Surface {
    public static int A03;
    public static boolean A04;
    public static byte[] A05;
    public static String[] A06 = {"ToLQMf4zVEPQ4KvEooDgfRDe7yK6oNRK", "K0o48H12GfZKMIt1wQk8mac7vZfrpMfZ", "E5u", "BRaMCvq", "l9UvErrzvq13nAT2kKu87XSUotDZHlU4", "KpcnqVP7VQEeHX003zJg7kklGvYVOXV6", "nWaipra9RnK7e6o7QCyQoP578AoonQfH", "y6ffzf1HkvdiGAu1g8uZUTsw8JywLKMO"};
    public boolean A00;
    public final boolean A01;
    public final F6 A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 72);
            String[] strArr = A06;
            if (strArr[4].charAt(13) != strArr[7].charAt(13)) {
                throw new RuntimeException();
            }
            A06[6] = "JqkQNQrwLqX5JhphVyehfhpUDDUdSiIM";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{Ascii.SYN, Ascii.DC4, Ascii.US, Ascii.FF, Ascii.SYN, Ascii.VT, 7, Ascii.FF, 35, 33, 60, 39, 54, 48, 39, 54, 55, Ascii.FF, 48, 60, 61, 39, 54, 61, 39, 4, 6, 13, Ascii.RS, 10, 9, 19, Ascii.RS, 50, 52, 51, 39, 32, 34, 36, 45, 36, 50, 50, Ascii.RS, 34, 46, 47, 53, 36, 57, 53, 32, Ascii.ESC, 6, 0, 5, 5, Ascii.SUB, 7, 1, Ascii.DLE, 17, 85, 5, 7, Ascii.FS, Ascii.SUB, 7, 85, 1, Ascii.SUB, 85, 52, 37, 60, 85, Ascii.EM, Ascii.DLE, 3, Ascii.DLE, Ascii.EM, 85, 68, 66, 101, 105, Ascii.FF, Ascii.VT, 8, 13, Utf8.REPLACEMENT_BYTE, 48, 58, 44, 49, 55, 58, 112, 54, Utf8.REPLACEMENT_BYTE, 44, 58, 41, Utf8.REPLACEMENT_BYTE, 44, 59, 112, 40, 44, 112, 54, 55, 57, 54, 1, 46, 59, 44, 56, 49, 44, 51, Utf8.REPLACEMENT_BYTE, 48, 61, 59, Ascii.VT, Ascii.EM, Ascii.NAK, Ascii.VT, 13, Ascii.SYN, Ascii.US};
        if (A06[6].charAt(20) == 'p') {
            throw new RuntimeException();
        }
        A06[0] = "LdigSr1cvkrlhyQY3m7v5wXMq9EFvMie";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static synchronized boolean A05(Context context) {
        boolean z10;
        z10 = true;
        if (!A04) {
            A03 = AbstractC18094a.A02 < 24 ? 0 : A00(context);
            A04 = true;
        }
        if (A03 == 0) {
            z10 = false;
        }
        return z10;
    }

    static {
        A04();
    }

    public DummySurface(F6 f62, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.A02 = f62;
        this.A01 = z10;
    }

    public static int A00(Context context) {
        String strEglQueryString;
        if (AbstractC18094a.A02 < 26 && (A02(127, 7, 48).equals(AbstractC18094a.A05) || A02(85, 6, 117).equals(AbstractC18094a.A06))) {
            return 0;
        }
        if ((AbstractC18094a.A02 < 26 && !context.getPackageManager().hasSystemFeature(A02(91, 36, 22))) || (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !strEglQueryString.contains(A02(0, 25, 27))) {
            return 0;
        }
        if (strEglQueryString.contains(A02(25, 27, 9))) {
            return 1;
        }
        return 2;
    }

    public static DummySurface A01(Context context, boolean z10) {
        A03();
        C3M.A08(!z10 || A05(context));
        return new F6().A04(z10 ? A03 : 0);
    }

    public static void A03() {
        if (AbstractC18094a.A02 >= 17) {
        } else {
            throw new UnsupportedOperationException(A02(52, 33, 61));
        }
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.A02) {
            if (!this.A00) {
                this.A02.A05();
                this.A00 = true;
            }
        }
    }
}
