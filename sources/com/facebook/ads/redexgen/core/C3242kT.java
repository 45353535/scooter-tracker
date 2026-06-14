package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3242kT extends AbstractC2181Iz {
    public static String[] A02 = {"WZkrugZ9k", "x4SWtznAL", "HpTT9hwXiF", "GejxPsVIqdMqn4uNSueU2CvK5QdcE", "kY6PJZpIMUpeuimCFjYxSQzMMPc04", "AyPx1MENxNPCbM7HZGi1kOnAmMtkHxm9", "mMmHuZ9NaaUgibHMJoRcA4q0AdWca5ys", "Hii3DdXYVzyt8ReiNrO7wglp0i"};
    public C2112Gh A00;
    public C3243kU A01;

    private int A00(C4J c4j) {
        int i10 = (c4j.A0l()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            c4j.A0g(4);
            String[] strArr = A02;
            String str = strArr[6];
            String str2 = strArr[5];
            int iCharAt = str.charAt(19);
            int blockSizeKey = str2.charAt(19);
            if (iCharAt == blockSizeKey) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "Cisj8wK8S";
            strArr2[0] = "koTyuZ08X";
            c4j.A0S();
        }
        int result = AbstractC2108Gd.A00(c4j, i10);
        c4j.A0f(0);
        return result;
    }

    public static boolean A01(C4J c4j) {
        return c4j.A07() >= 5 && c4j.A0I() == 127 && c4j.A0Q() == 1179402563;
    }

    public static boolean A02(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2181Iz
    public final long A09(C4J c4j) {
        if (!A02(c4j.A0l())) {
            return -1L;
        }
        return A00(c4j);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2181Iz
    public final void A0B(boolean z10) {
        super.A0B(z10);
        if (z10) {
            this.A00 = null;
            this.A01 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2181Iz
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(C4J c4j, long j10, C2180Iy c2180Iy) {
        byte[] bArrA0l = c4j.A0l();
        C2112Gh c2112Gh = this.A00;
        if (c2112Gh == null) {
            C2112Gh c2112Gh2 = new C2112Gh(bArrA0l, 17);
            this.A00 = c2112Gh2;
            c2180Iy.A00 = c2112Gh2.A08(Arrays.copyOfRange(bArrA0l, 9, c4j.A0A()), null);
            return true;
        }
        if ((bArrA0l[0] & Ascii.DEL) == 3) {
            C2111Gg c2111GgA03 = AbstractC2110Gf.A03(c4j);
            C2112Gh streamMetadata = c2112Gh.A09(c2111GgA03);
            this.A00 = streamMetadata;
            this.A01 = new C3243kU(streamMetadata, c2111GgA03);
            return true;
        }
        if (!A02(bArrA0l)) {
            return true;
        }
        if (this.A01 != null) {
            this.A01.A00(j10);
            c2180Iy.A01 = this.A01;
        }
        C3497or c3497or = c2180Iy.A00;
        String[] strArr = A02;
        if (strArr[4].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "zwTfeKiQLRobCpiZaAgtU0oyP8s29";
        strArr2[2] = "wrCWS6iAkk";
        C3M.A01(c3497or);
        return false;
    }
}
