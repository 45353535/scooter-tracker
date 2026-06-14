package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2404Rr {
    public static byte[] A00;
    public static String[] A01 = {"T8", "", "As3hIStO2xNa0GSSHrkEVjQu", "DXoFAMJTZKDaTyX0if7pZrkyLA7XvGsC", "niDMG5wZxQy0H8acRFWa8hH2XuraMrTN", "878XRXnWNCNw6FCwqGtfz4QO6Hd03tfb", "ID5FT62NpqbpmPra08cWCCHJVsi2pDHC", "txdj"};
    public static final AtomicReference<C2402Rp> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[7].length() != 4) {
                throw new RuntimeException();
            }
            A01[6] = "PcSdqCtN9qYKSfDsPVWrfTZjyuiu0dLa";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 86);
            i13++;
        }
    }

    public static void A05() {
        A00 = new byte[]{19, Ascii.ESC, Ascii.SYN, 17, 33, 40, Ascii.ETB, 36, 36, Ascii.ESC, Ascii.SYN, Ascii.ETB, 17, Ascii.SI, Ascii.CAN, Ascii.SI, Ascii.FS, 19, 13, 43, 38, 40, 35, 33, 49, 56, 39, 52, 52, 43, 38, 39};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 12));
    }

    public static C2402Rp A00() {
        C2402Rp advertisingIdInfo = A02.get();
        if (advertisingIdInfo == null) {
            return C2402Rp.A00();
        }
        return advertisingIdInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.core.C2402Rp A01(com.facebook.ads.redexgen.core.SQ r5, com.facebook.ads.redexgen.core.C2402Rp r6) {
        /*
            if (r6 == 0) goto Lc
            java.lang.String r0 = r6.A03()     // Catch: java.lang.Throwable -> L11
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L29
        Lc:
            com.facebook.ads.redexgen.X.Rp r0 = com.facebook.ads.redexgen.core.AbstractC2409Rx.A00(r5)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.X.Su r5 = r5.A08()
            int r4 = com.facebook.ads.redexgen.core.AbstractC2433Sv.A1Q
            com.facebook.ads.redexgen.X.Sw r3 = new com.facebook.ads.redexgen.X.Sw
            r3.<init>(r0)
            r2 = 12
            r1 = 7
            r0 = 84
            java.lang.String r0 = A04(r2, r1, r0)
            r5.AAy(r0, r4, r3)
        L29:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC2404Rr.A01(com.facebook.ads.redexgen.X.SQ, com.facebook.ads.redexgen.X.Rp):com.facebook.ads.redexgen.X.Rp");
    }

    public static C2402Rp A02(SQ sq, C2402Rp c2402Rp, C2403Rq c2403Rq) {
        C2405Rs c2405RsA00 = null;
        try {
            if (U6.A06(sq) && (c2402Rp == null || TextUtils.isEmpty(c2402Rp.A03()))) {
                c2405RsA00 = AbstractC2406Rt.A00(sq.getContentResolver());
            }
        } catch (Throwable th2) {
            sq.A08().AAy(A04(12, 7, 84), AbstractC2433Sv.A1S, new C2434Sw(th2));
        }
        if (c2405RsA00 != null && c2405RsA00.A01 != null) {
            A03.set(c2405RsA00.A01);
            c2403Rq.A05(c2405RsA00.A01);
        }
        if (c2402Rp == null && c2405RsA00 != null && !TextUtils.isEmpty(c2405RsA00.A00)) {
            return new C2402Rp(c2405RsA00.A00, c2405RsA00.A02, EnumC2401Ro.A04);
        }
        return c2402Rp;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 12);
        }
        return attributionId;
    }

    public static void A06(C2403Rq c2403Rq) {
        A02.set(c2403Rq.A02());
        A03.set(c2403Rq.A03());
    }

    public static void A07(SQ sq) {
        long jA01;
        C2402Rp advertisingIdInfo;
        try {
            C2403Rq c2403Rq = new C2403Rq(sq);
            A06(c2403Rq);
            if (A08()) {
                return;
            }
            C2402Rp advertisingIdInfo2 = A02.get();
            if (advertisingIdInfo2 != null && !TextUtils.isEmpty(advertisingIdInfo2.A03())) {
                jA01 = advertisingIdInfo2.A01();
            } else {
                jA01 = -1;
            }
            if (jA01 > 0 && System.currentTimeMillis() - jA01 < U6.A00(sq)) {
                return;
            }
            if (U6.A07(sq)) {
                advertisingIdInfo = A01(sq, A02(sq, null, c2403Rq));
            } else {
                advertisingIdInfo = A02(sq, A01(sq, null), c2403Rq);
            }
            if (advertisingIdInfo != null && !TextUtils.isEmpty(advertisingIdInfo.A03())) {
                A02.set(advertisingIdInfo);
                c2403Rq.A04(advertisingIdInfo);
            }
        } catch (Throwable t10) {
            sq.A08().AAy(A04(12, 7, 84), AbstractC2433Sv.A1R, new C2434Sw(t10));
        }
    }

    public static boolean A08() {
        boolean z10 = false;
        boolean updated = WS.A04();
        if (updated) {
            String strA04 = A04(0, 12, 92);
            boolean updated2 = WS.A05(strA04);
            if (updated2) {
                A03.set(WS.A01(strA04));
                z10 = true;
            }
        }
        boolean zA04 = WS.A04();
        if (A01[7].length() != 4) {
            throw new RuntimeException();
        }
        A01[6] = "Cpq5b7Aomj18wFHDN8BPNJlk9AiHAVMm";
        if (!zA04) {
            return z10;
        }
        String strA042 = A04(19, 13, 108);
        boolean updated3 = WS.A05(strA042);
        if (updated3) {
            String strA01 = WS.A01(strA042);
            AtomicReference<C2402Rp> atomicReference = A02;
            if (strA01 == null) {
                if (A01[7].length() != 4) {
                    A01[7] = "Ywke";
                    strA01 = A04(0, 0, 2);
                } else {
                    A01[5] = "aB8iQRCNNWTx0AWcZvgXlT81SikGsrWB";
                    strA01 = A04(0, 0, 12);
                }
            }
            atomicReference.set(new C2402Rp(strA01, false, EnumC2401Ro.A03));
            return true;
        }
        return z10;
    }
}
