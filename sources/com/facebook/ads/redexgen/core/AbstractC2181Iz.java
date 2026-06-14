package com.facebook.ads.redexgen.core;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Iz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2181Iz {
    public static String[] A0D = {"XeH1UKKuz1EDpBeQKhAXaKjrjZgsodJU", "Qh9sfVWsiKdbMkoZ0Fly5mM08PFSskfX", "g5Vgu", "IbV76iHRvjKg6MHaSQGzPOhr6f1ApNQX", "p6vckuBwU2Q2AllMmzSrbAD", "CWShENYx4MqsFhdcA74Ut20lXSF9FxoW", "efy3JamC8vBQUYLSbDR2yGzuJR", "AxMKck"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public GY A06;
    public H1 A07;
    public InterfaceC2178Iw A08;
    public boolean A0A;
    public boolean A0B;
    public final C2176Iu A0C = new C2176Iu();
    public C2180Iy A09 = new C2180Iy();

    public abstract long A09(C4J c4j);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean A0C(C4J c4j, long j10, C2180Iy c2180Iy) throws IOException;

    @RequiresNonNull({"trackOutput"})
    private int A00(InterfaceC3286lN interfaceC3286lN) throws IOException {
        if (A03(interfaceC3286lN)) {
            this.A00 = this.A09.A00.A0G;
            if (!this.A0A) {
                this.A07.A6W(this.A09.A00);
                this.A0A = true;
            }
            InterfaceC2178Iw interfaceC2178Iw = this.A09.A01;
            String[] strArr = A0D;
            if (strArr[5].charAt(2) == strArr[3].charAt(2)) {
                throw new RuntimeException();
            }
            A0D[7] = "ikA5IIIrIRBN8L1z";
            if (interfaceC2178Iw != null) {
                this.A08 = this.A09.A01;
            } else if (interfaceC3286lN.A8G() == -1) {
                this.A08 = new C3238kP();
            } else {
                C2177Iv c2177IvA02 = this.A0C.A02();
                this.A08 = new C3244kV(this, this.A04, interfaceC3286lN.A8G(), c2177IvA02.A01 + c2177IvA02.A00, c2177IvA02.A05, (c2177IvA02.A04 & 4) != 0);
            }
            this.A01 = 2;
            this.A0C.A04();
            return 0;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A01(com.facebook.ads.redexgen.core.InterfaceC3286lN r19, com.facebook.ads.redexgen.core.C2124Gt r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC2181Iz.A01(com.facebook.ads.redexgen.X.lN, com.facebook.ads.redexgen.X.Gt):int");
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    private void A02() {
        C3M.A02(this.A07);
    }

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    private boolean A03(InterfaceC3286lN interfaceC3286lN) throws IOException {
        while (true) {
            C2176Iu c2176Iu = this.A0C;
            String[] strArr = A0D;
            if (strArr[5].charAt(2) == strArr[3].charAt(2)) {
                break;
            }
            A0D[7] = "RUb6h5R55PuDixsZqq";
            if (!c2176Iu.A05(interfaceC3286lN)) {
                this.A01 = 3;
                return false;
            }
            this.A03 = interfaceC3286lN.A8f() - this.A04;
            if (A0C(this.A0C.A01(), this.A04, this.A09)) {
                long jA8f = interfaceC3286lN.A8f();
                if (A0D[7].length() == 17) {
                    break;
                }
                A0D[0] = "MjaWWlFxdP245keDLyVkXHL1D0C1Hazn";
                this.A04 = jA8f;
            } else {
                return true;
            }
        }
        throw new RuntimeException();
    }

    public final int A04(InterfaceC3286lN interfaceC3286lN, C2124Gt c2124Gt) throws IOException {
        A02();
        switch (this.A01) {
            case 0:
                return A00(interfaceC3286lN);
            case 1:
                interfaceC3286lN.AJJ((int) this.A04);
                this.A01 = 2;
                return 0;
            case 2:
                return A01(interfaceC3286lN, c2124Gt);
            case 3:
                return -1;
            default:
                throw new IllegalStateException();
        }
    }

    public final long A05(long j10) {
        return (1000000 * j10) / ((long) this.A00);
    }

    public final long A06(long j10) {
        return (((long) this.A00) * j10) / 1000000;
    }

    public final void A07(long j10, long j11) {
        this.A0C.A03();
        if (j10 == 0) {
            A0B(!this.A0B);
        } else {
            if (this.A01 == 0) {
                return;
            }
            this.A05 = A06(j11);
            ((InterfaceC2178Iw) AbstractC18094a.A0f(this.A08)).AJR(this.A05);
            this.A01 = 2;
        }
    }

    public final void A08(GY gy, H1 h12) {
        this.A06 = gy;
        this.A07 = h12;
        A0B(true);
    }

    public void A0A(long j10) {
        this.A02 = j10;
    }

    public void A0B(boolean z10) {
        if (z10) {
            this.A09 = new C2180Iy();
            this.A04 = 0L;
            this.A01 = 0;
        } else {
            this.A01 = 1;
        }
        this.A05 = -1L;
        this.A02 = 0L;
    }
}
