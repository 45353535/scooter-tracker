package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.ironsource.Ya;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7R, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization("Exo version is final but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
public final class C7R implements InterfaceC3149iw {
    public static byte[] A03;
    public static String[] A04 = {"jtWHdC1JS00IQCACyTEvOJEMPrvoo3Ob", "eCCt1HwS4IToKXyi1WzLFL1R4PlgsDM4", "yXgy4dLxj37Ni2Ba12KifyhgeRBIXCXp", "5p7nRT0g4n3u8StY", "28aCkGMBHBRgMUJ0i4knnGO", "XAmyqmpuCXa4X38XkweYk7F1knbiAlXr", "krkFdswQPRExlipS29WIEjh8hbH7SBjj", Ya.f42175u};

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public long A00;

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public final long A01;

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public final TreeSet<C2257Lx> A02 = new TreeSet<>(new Comparator() { // from class: com.facebook.ads.redexgen.X.MB
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C7R.A00((C2257Lx) obj, (C2257Lx) obj2);
        }
    });

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{46, 61, 34, 40, Utf8.REPLACEMENT_BYTE, 8, 42, 40, 35, 46};
    }

    static {
        A02();
    }

    public C7R(long j10) {
        this.A01 = j10;
    }

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public static int A00(C2257Lx c2257Lx, C2257Lx c2257Lx2) {
        if (c2257Lx.A00 - c2257Lx2.A00 == 0) {
            return c2257Lx.compareTo(c2257Lx2);
        }
        return c2257Lx.A00 < c2257Lx2.A00 ? -1 : 1;
    }

    private void A03(InterfaceC2247Ln interfaceC2247Ln, long j10) {
        C4S.A02(A01(0, 10, 87));
        while (this.A00 + j10 > this.A01 && !this.A02.isEmpty()) {
            C2257Lx c2257LxFirst = this.A02.first();
            if (A04[1].charAt(10) != 'T') {
                throw new RuntimeException();
            }
            A04[4] = "DjrmhsDHxGC2SVigK1e7Rl2";
            interfaceC2247Ln.AHl(c2257LxFirst);
        }
        C4S.A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2246Lm
    public final void AFJ(InterfaceC2247Ln interfaceC2247Ln, C2257Lx c2257Lx) {
        this.A02.add(c2257Lx);
        this.A00 += c2257Lx.A01;
        A03(interfaceC2247Ln, 0L);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2246Lm
    public final void AFK(InterfaceC2247Ln interfaceC2247Ln, C2257Lx c2257Lx) {
        this.A02.remove(c2257Lx);
        this.A00 -= c2257Lx.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2246Lm
    public final void AFL(InterfaceC2247Ln interfaceC2247Ln, C2257Lx c2257Lx, C2257Lx c2257Lx2) {
        AFK(interfaceC2247Ln, c2257Lx);
        AFJ(interfaceC2247Ln, c2257Lx2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3149iw
    public final void AFM(InterfaceC2247Ln interfaceC2247Ln, String str, long j10, long j11) {
        if (j11 != -1) {
            A03(interfaceC2247Ln, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3149iw
    public final boolean AHz() {
        return true;
    }
}
