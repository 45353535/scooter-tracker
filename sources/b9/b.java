package b9;

import com.google.common.base.Ascii;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes12.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f5854a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, 13, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, 13, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM};

    /* JADX INFO: renamed from: b9.b$b, reason: collision with other inner class name */
    private static final class C0127b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f5855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        byte[] f5856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f5857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f5858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f5859e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f5860f;

        private C0127b() {
        }
    }

    private int a(int i10, int i11) {
        int i12 = i10 - Integer.MIN_VALUE;
        int i13 = i11 - Integer.MIN_VALUE;
        if (i12 < i13) {
            return -1;
        }
        return i12 == i13 ? 0 : 1;
    }

    private int b(C0127b c0127b) {
        if (c0127b.f5856b != null) {
            return c0127b.f5857c - c0127b.f5858d;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(byte[] r23, int r24, int r25, b9.b.C0127b r26) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.b.c(byte[], int, int, b9.b$b):void");
    }

    private void d(byte[] bArr, int i10, C0127b c0127b) {
        if (c0127b.f5856b != null) {
            int iMin = Math.min(b(c0127b), i10);
            System.arraycopy(c0127b.f5856b, c0127b.f5858d, bArr, 0, iMin);
            int i11 = c0127b.f5858d + iMin;
            c0127b.f5858d = i11;
            if (i11 >= c0127b.f5857c) {
                c0127b.f5856b = null;
            }
        }
    }

    private byte[] e(int i10, C0127b c0127b) {
        byte[] bArr = c0127b.f5856b;
        if (bArr == null) {
            c0127b.f5856b = new byte[Math.max(i10, 8192)];
            c0127b.f5857c = 0;
            c0127b.f5858d = 0;
        } else {
            int i11 = c0127b.f5857c + i10;
            if (i11 - bArr.length > 0) {
                return f(c0127b, i11);
            }
        }
        return c0127b.f5856b;
    }

    private byte[] f(C0127b c0127b, int i10) {
        int length = c0127b.f5856b.length * 2;
        if (a(length, i10) < 0) {
            length = i10;
        }
        if (a(length, 2147483639) > 0) {
            length = Math.max(i10, 2147483639);
        }
        byte[] bArr = new byte[length];
        byte[] bArr2 = c0127b.f5856b;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        c0127b.f5856b = bArr;
        return bArr;
    }

    public String g(String str) {
        return h(str.getBytes(Charset.forName("UTF-8")));
    }

    public String h(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new String(bArr);
        }
        C0127b c0127b = new C0127b();
        c(bArr, 0, bArr.length, c0127b);
        c(bArr, 0, -1, c0127b);
        int i10 = c0127b.f5857c;
        byte[] bArr2 = new byte[i10];
        d(bArr2, i10, c0127b);
        return new String(bArr2);
    }
}
