package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7 implements InterfaceC2915et {
    public static byte[] A01;
    public final boolean A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{75, Ascii.SO, 48, Ascii.FS, Ascii.GS, 7, Ascii.SYN, Ascii.GS, 7, 73, 83, 42, Ascii.GS, Ascii.ESC, Ascii.GS, 17, Ascii.SO, Ascii.GS, 88, 13, 10, Ascii.DC4, 66, 88, Ascii.RS, 57, 44, 57, 56, 62, 119, 109};
    }

    public C7(boolean z10) {
        this.A00 = z10;
    }

    private void A02(Map<String, List<String>> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                for (String header : map.get(str)) {
                    String str2 = str + A00(1, 1, 74) + header;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2915et
    public final boolean AAQ() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2915et
    public final void ABN(HttpURLConnection httpURLConnection, Object obj) throws IOException {
        String str = httpURLConnection.getRequestMethod() + A00(0, 1, 21) + httpURLConnection.getURL().toString();
        if (obj instanceof String) {
            String str2 = A00(2, 9, 13) + ((String) obj);
        }
        A02(httpURLConnection.getRequestProperties());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2915et
    public final void ABO(InterfaceC2898ec interfaceC2898ec) {
        if (interfaceC2898ec != null) {
            String str = A00(11, 13, 6) + interfaceC2898ec.getUrl();
            String str2 = A00(24, 8, 51) + interfaceC2898ec.A94();
            A02(interfaceC2898ec.A86());
        }
    }
}
