package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final com.mbridge.msdk.thrid.okio.f f51382a = com.mbridge.msdk.thrid.okio.f.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f51383b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String[] f51384c = new String[64];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String[] f51385d = new String[256];

    static {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = f51385d;
            if (i11 >= strArr.length) {
                break;
            }
            strArr[i11] = com.mbridge.msdk.thrid.okhttp.internal.c.a("%8s", Integer.toBinaryString(i11)).replace(' ', '0');
            i11++;
        }
        String[] strArr2 = f51384c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[9] = strArr2[1] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f51384c;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            strArr3[i15 | 8] = strArr3[i14] + '|' + strArr3[i13] + "|PADDED";
        }
        while (true) {
            String[] strArr4 = f51384c;
            if (i10 >= strArr4.length) {
                return;
            }
            if (strArr4[i10] == null) {
                strArr4[i10] = f51385d[i10];
            }
            i10++;
        }
    }

    private e() {
    }

    static IllegalArgumentException a(String str, Object... objArr) {
        throw new IllegalArgumentException(com.mbridge.msdk.thrid.okhttp.internal.c.a(str, objArr));
    }

    static IOException b(String str, Object... objArr) throws IOException {
        throw new IOException(com.mbridge.msdk.thrid.okhttp.internal.c.a(str, objArr));
    }

    static String a(boolean z10, int i10, int i11, byte b10, byte b11) {
        String[] strArr = f51383b;
        return com.mbridge.msdk.thrid.okhttp.internal.c.a("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b10 < strArr.length ? strArr[b10] : com.mbridge.msdk.thrid.okhttp.internal.c.a("0x%02x", Byte.valueOf(b10)), a(b10, b11));
    }

    static String a(byte b10, byte b11) {
        if (b11 == 0) {
            return "";
        }
        if (b10 != 2 && b10 != 3) {
            if (b10 == 4 || b10 == 6) {
                return b11 == 1 ? "ACK" : f51385d[b11];
            }
            if (b10 != 7 && b10 != 8) {
                String[] strArr = f51384c;
                String str = b11 < strArr.length ? strArr[b11] : f51385d[b11];
                if (b10 != 5 || (b11 & 4) == 0) {
                    return (b10 != 0 || (b11 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                }
                return str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f51385d[b11];
    }
}
