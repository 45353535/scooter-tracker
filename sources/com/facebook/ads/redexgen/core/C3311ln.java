package com.facebook.ads.redexgen.core;

import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3311ln extends E5<C3311ln> implements Comparable<C3311ln> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(List<C3311ln> list, List<C3311ln> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public C3311ln(int i10, C3463oH c3463oH, int i11, AnonymousClass93 anonymousClass93, int i12, String str) {
        List<String> listA03;
        super(i10, c3463oH, i11);
        int i13 = 0;
        this.A08 = AnonymousClass92.A0S(i12, false);
        int i14 = super.A02.A0H & (~((C3456oA) anonymousClass93).A00);
        this.A06 = (i14 & 1) != 0;
        this.A07 = (i14 & 2) != 0;
        int i15 = Integer.MAX_VALUE;
        int bestLanguageScore = 0;
        if (anonymousClass93.A0K.isEmpty()) {
            listA03 = MetaExoPlayerCustomizedCollections.A03("");
        } else {
            listA03 = anonymousClass93.A0K;
        }
        int bestLanguageIndex = 0;
        while (true) {
            if (bestLanguageIndex >= listA03.size()) {
                break;
            }
            int iA02 = AnonymousClass92.A02(super.A02, listA03.get(bestLanguageIndex), anonymousClass93.A0P);
            if (iA02 > 0) {
                i15 = bestLanguageIndex;
                bestLanguageScore = iA02;
                break;
            }
            bestLanguageIndex++;
        }
        this.A00 = i15;
        this.A01 = bestLanguageScore;
        this.A02 = AnonymousClass92.A00(super.A02.A0E, ((C3456oA) anonymousClass93).A0C);
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = AnonymousClass92.A02(super.A02, str, AnonymousClass92.A0K(str) == null);
        boolean z10 = this.A01 > 0 || (anonymousClass93.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (AnonymousClass92.A0S(i12, anonymousClass93.A0B) && z10) {
            i13 = 1;
        }
        this.A04 = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3311ln c3311ln) {
        AbstractC3328m4 abstractC3328m4A06 = AbstractC3328m4.A01().A09(this.A08, c3311ln.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(c3311ln.A00), AbstractC3476oV.A03().A06()).A06(this.A01, c3311ln.A01).A06(this.A02, c3311ln.A02).A09(this.A06, c3311ln.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(c3311ln.A07), this.A01 == 0 ? AbstractC3476oV.A03() : AbstractC3476oV.A03().A06()).A06(this.A03, c3311ln.A03);
        if (this.A02 == 0) {
            abstractC3328m4A06 = abstractC3328m4A06.A0A(this.A05, c3311ln.A05);
        }
        return abstractC3328m4A06.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static AbstractC1964Am<C3311ln> A02(int i10, C3463oH c3463oH, AnonymousClass93 anonymousClass93, int[] iArr, String str) {
        C17401h c17401hA01 = AbstractC1964Am.A01();
        for (int i11 = 0; i11 < c3463oH.A01; i11++) {
            c17401hA01.A04(new C3311ln(i10, c3463oH, i11, anonymousClass93, iArr[i11], str));
        }
        return c17401hA01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.E5
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C3311ln c3311ln) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.E5
    public final int A08() {
        return this.A04;
    }
}
