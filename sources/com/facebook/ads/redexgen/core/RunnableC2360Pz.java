package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RunnableC2360Pz implements Runnable {
    public static Comparator<C2359Py> A04;
    public static byte[] A05;
    public static String[] A06 = {"ZWObiMwNkhaZGfEgqHenCxQvRQCezgXM", "iKaB5ntiNbaiz6tgW", "JplxjEE1IYbCInXXNCkbxZV0", "UEoPOy6vCmPnpiXEMXmcZKvRtDoHf0nN", "JvUlYJe7lgtJoJN1gtwvhyIs", "RcG3r4ysor4dcgCWVGn8CFYsdgQ7jZkt", "cxmAjzJ", "EyohaYHYoMvb6y9gFGiucolIeU60NsdM"};
    public static final ThreadLocal<RunnableC2360Pz> A07;
    public long A00;
    public long A01;
    public ArrayList<C18676g> A02 = new ArrayList<>();
    public ArrayList<C2359Py> A03 = new ArrayList<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{105, 109, Ascii.ESC, 117, 94, 72, 79, 94, 95, Ascii.ESC, 107, 73, 94, 93, 94, 79, 88, 83, 100, 96, Ascii.SYN, 102, 68, 83, 80, 83, 66, 85, 94};
    }

    static {
        A03();
        A07 = new ThreadLocal<>();
        A04 = new C2358Px();
    }

    private AbstractC2367Qg A00(C18676g c18676g, int i10, long j10) {
        if (A08(c18676g, i10)) {
            return null;
        }
        QW qw = c18676g.A0r;
        try {
            c18676g.A1M();
            AbstractC2367Qg abstractC2367QgA0I = qw.A0I(i10, false, j10);
            if (abstractC2367QgA0I != null) {
                if (abstractC2367QgA0I.A0e() && !abstractC2367QgA0I.A0f()) {
                    qw.A0T(abstractC2367QgA0I.A0H);
                } else {
                    qw.A0Z(abstractC2367QgA0I, false);
                }
            }
            return abstractC2367QgA0I;
        } finally {
            c18676g.A1o(false);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:16:0x0054 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A02() {
        /*
            r10 = this;
            java.util.ArrayList<com.facebook.ads.redexgen.X.6g> r0 = r10.A02
            int r9 = r0.size()
            r4 = 0
            r3 = 0
        L8:
            r2 = 0
            if (r3 >= r9) goto L26
            java.util.ArrayList<com.facebook.ads.redexgen.X.6g> r0 = r10.A02
            java.lang.Object r1 = r0.get(r3)
            com.facebook.ads.redexgen.X.6g r1 = (com.facebook.ads.redexgen.core.C18676g) r1
            int r0 = r1.getWindowVisibility()
            if (r0 != 0) goto L23
            com.facebook.ads.redexgen.X.gJ r0 = r1.A02
            r0.A04(r1, r2)
            com.facebook.ads.redexgen.X.gJ r0 = r1.A02
            int r0 = r0.A00
            int r4 = r4 + r0
        L23:
            int r3 = r3 + 1
            goto L8
        L26:
            java.util.ArrayList<com.facebook.ads.redexgen.X.Py> r0 = r10.A03
            r0.ensureCapacity(r4)
            r8 = 0
            r7 = 0
        L2d:
            if (r7 >= r9) goto L8f
            java.util.ArrayList<com.facebook.ads.redexgen.X.6g> r0 = r10.A02
            java.lang.Object r6 = r0.get(r7)
            com.facebook.ads.redexgen.X.6g r6 = (com.facebook.ads.redexgen.core.C18676g) r6
            int r0 = r6.getWindowVisibility()
            if (r0 == 0) goto L40
        L3d:
            int r7 = r7 + 1
            goto L2d
        L40:
            com.facebook.ads.redexgen.X.gJ r5 = r6.A02
            int r0 = r5.A01
            int r4 = java.lang.Math.abs(r0)
            int r0 = r5.A02
            int r0 = java.lang.Math.abs(r0)
            int r4 = r4 + r0
            r3 = 0
        L50:
            int r0 = r5.A00
            int r0 = r0 * 2
            if (r3 >= r0) goto L3d
            java.util.ArrayList<com.facebook.ads.redexgen.X.Py> r0 = r10.A03
            int r0 = r0.size()
            if (r8 < r0) goto L86
            com.facebook.ads.redexgen.X.Py r0 = new com.facebook.ads.redexgen.X.Py
            r0.<init>()
            java.util.ArrayList<com.facebook.ads.redexgen.X.Py> r1 = r10.A03
            r1.add(r0)
        L68:
            int[] r2 = r5.A03
            int r1 = r3 + 1
            r2 = r2[r1]
            if (r2 > r4) goto L84
            r1 = 1
        L71:
            r0.A04 = r1
            r0.A02 = r4
            r0.A00 = r2
            r0.A03 = r6
            int[] r1 = r5.A03
            r1 = r1[r3]
            r0.A01 = r1
            int r8 = r8 + 1
            int r3 = r3 + 2
            goto L50
        L84:
            r1 = 0
            goto L71
        L86:
            java.util.ArrayList<com.facebook.ads.redexgen.X.Py> r0 = r10.A03
            java.lang.Object r0 = r0.get(r8)
            com.facebook.ads.redexgen.X.Py r0 = (com.facebook.ads.redexgen.core.C2359Py) r0
            goto L68
        L8f:
            java.util.ArrayList<com.facebook.ads.redexgen.X.Py> r1 = r10.A03
            java.util.Comparator<com.facebook.ads.redexgen.X.Py> r0 = com.facebook.ads.redexgen.core.RunnableC2360Pz.A04
            java.util.Collections.sort(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.RunnableC2360Pz.A02():void");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A04(long r6) {
        /*
            r5 = this;
            r4 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.Py> r0 = r5.A03
            int r0 = r0.size()
            if (r4 >= r0) goto L31
            java.util.ArrayList<com.facebook.ads.redexgen.X.Py> r0 = r5.A03
            java.lang.Object r3 = r0.get(r4)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.RunnableC2360Pz.A06
            r0 = 7
            r1 = r1[r0]
            r0 = 15
            char r1 = r1.charAt(r0)
            r0 = 103(0x67, float:1.44E-43)
            if (r1 == r0) goto L24
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L24:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.RunnableC2360Pz.A06
            java.lang.String r1 = "gpZ2KV2"
            r0 = 6
            r2[r0] = r1
            com.facebook.ads.redexgen.X.Py r3 = (com.facebook.ads.redexgen.core.C2359Py) r3
            com.facebook.ads.redexgen.X.6g r0 = r3.A03
            if (r0 != 0) goto L32
        L31:
            return
        L32:
            r5.A06(r3, r6)
            r3.A00()
            int r4 = r4 + 1
            goto L1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.RunnableC2360Pz.A04(long):void");
    }

    private final void A05(long j10) {
        A02();
        A04(j10);
    }

    private void A06(C2359Py c2359Py, long j10) {
        AbstractC2367Qg abstractC2367QgA00 = A00(c2359Py.A03, c2359Py.A01, c2359Py.A04 ? Long.MAX_VALUE : j10);
        if (abstractC2367QgA00 != null && abstractC2367QgA00.A09 != null && abstractC2367QgA00.A0e() && !abstractC2367QgA00.A0f()) {
            C18676g c18676g = abstractC2367QgA00.A09.get();
            if (A06[3].charAt(4) != 'O') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[0] = "y01bdO2VJYUoPT1JEr7HCeGbjhjinZRt";
            strArr[5] = "ogbTL45N3M3fzw26YptkCantwmvhDLLM";
            A07(c18676g, j10);
        }
    }

    private void A07(C18676g c18676g, long j10) {
        if (c18676g == null) {
            return;
        }
        if (c18676g.A0C && c18676g.A01.A06() != 0) {
            c18676g.A1P();
        }
        C3001gJ c3001gJ = c18676g.A02;
        c3001gJ.A04(c18676g, true);
        if (c3001gJ.A00 != 0) {
            try {
                OQ.A01(A01(0, 18, 83));
                c18676g.A0s.A05(c18676g.A04);
                for (int i10 = 0; i10 < c3001gJ.A00 * 2; i10 += 2) {
                    A00(c18676g, c3001gJ.A03[i10], j10);
                }
            } finally {
                OQ.A00();
            }
        }
    }

    public static boolean A08(C18676g c18676g, int i10) {
        int iA06 = c18676g.A01.A06();
        for (int i11 = 0; i11 < iA06; i11++) {
            AbstractC2367Qg abstractC2367QgA0F = C18676g.A0F(c18676g.A01.A0A(i11));
            int childCount = abstractC2367QgA0F.A03;
            if (childCount == i10 && !abstractC2367QgA0F.A0f()) {
                return true;
            }
        }
        return false;
    }

    public final void A09(C18676g c18676g) {
        this.A02.add(c18676g);
    }

    public final void A0A(C18676g c18676g) {
        this.A02.remove(c18676g);
    }

    public final void A0B(C18676g c18676g, int i10, int i11) {
        if (c18676g.isAttachedToWindow()) {
            long j10 = this.A01;
            String[] strArr = A06;
            if (strArr[0].charAt(20) != strArr[5].charAt(20)) {
                throw new RuntimeException();
            }
            A06[6] = "T8Y6UBY";
            if (j10 == 0) {
                this.A01 = c18676g.getNanoTime();
                c18676g.post(this);
            }
        }
        c18676g.A02.A03(i10, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            OQ.A01(A01(18, 11, 94));
            if (this.A02.isEmpty()) {
                this.A01 = 0L;
                if (A06[6].length() != 7) {
                    throw new RuntimeException();
                }
                A06[7] = "jOxF3Mzmcdx8L8GgZmI4I6pGAsyGGZV3";
                OQ.A00();
                return;
            }
            int size = this.A02.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                C18676g c18676g = this.A02.get(i10);
                if (c18676g.getWindowVisibility() == 0) {
                    jMax = Math.max(c18676g.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                return;
            }
            A05(TimeUnit.MILLISECONDS.toNanos(jMax) + this.A00);
        } finally {
            this.A01 = 0L;
            OQ.A00();
        }
    }
}
