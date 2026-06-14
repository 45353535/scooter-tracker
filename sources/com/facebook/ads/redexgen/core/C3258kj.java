package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
public final class C3258kj extends II {
    public static byte[] A03;
    public static String[] A04 = {"GA2pmS7X4ROGOgByNCdi18taC", "aAh4RNygY6pz4IdlAQ9iIXEvCFWWkzLF", "JuodTrkofMpjka010", "J1Lmlws0eqmUUC5GC3jhEdxTYojxk4jf", "6Ya7uqSvo", "3XyRCMiSsp8rG7f8J4q6xkUhsqnZzFaE", "VspF2Q", "vTSdivoAe22KROlTGGoK4NP8GmV"};
    public final long A00;
    public final List<C3258kj> A01;
    public final List<C3257ki> A02;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 84);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{68, 7, Ascii.VT, 10, Ascii.DLE, 5, 13, 10, 1, Ascii.SYN, Ascii.ETB, 94, 68, 105, 37, 44, 40, Utf8.REPLACEMENT_BYTE, 44, 58, 115, 105};
    }

    static {
        A05();
    }

    public C3258kj(int i10, long j10) {
        super(i10);
        this.A00 = j10;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final C3258kj A06(int i10) {
        int size = this.A01.size();
        for (int i11 = 0; i11 < size; i11++) {
            C3258kj c3258kj = this.A01.get(i11);
            int i12 = A04[7].length();
            if (i12 == 3) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[1] = "n49CDGF4gSULbNzRfDOXSmTNWTogkE10";
            strArr[3] = "P3Agw1JJwclCkyu9DcuVtuUqOjxfkaYK";
            C3258kj c3258kj2 = c3258kj;
            int childrenSize = ((II) c3258kj2).A00;
            if (childrenSize == i10) {
                return c3258kj2;
            }
        }
        if (A04[4].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[1] = "eWhxbLiQvYVwUHrDqb1spRuVxj0ikF7I";
        strArr2[3] = "G0JrlMiW26lgTwAQcPtVzhOkcvjPkvCh";
        return null;
    }

    public final C3257ki A07(int i10) {
        int size = this.A02.size();
        for (int i11 = 0; i11 < size; i11++) {
            C3257ki c3257ki = this.A02.get(i11);
            String[] strArr = A04;
            String str = strArr[2];
            String str2 = strArr[0];
            int i12 = str.length();
            int childrenSize = str2.length();
            if (i12 == childrenSize) {
                throw new RuntimeException();
            }
            A04[5] = "r5cbbIuLaeCnR7fWkiITKmUfsEKVcSuB";
            int childrenSize2 = ((II) c3257ki).A00;
            if (childrenSize2 == i10) {
                return c3257ki;
            }
        }
        return null;
    }

    public final void A08(C3258kj c3258kj) {
        this.A01.add(c3258kj);
    }

    public final void A09(C3257ki c3257ki) {
        this.A02.add(c3257ki);
    }

    @Override // com.facebook.ads.redexgen.core.II
    public final String toString() {
        return II.A02(super.A00) + A04(13, 9, 29) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 48) + Arrays.toString(this.A01.toArray());
    }
}
