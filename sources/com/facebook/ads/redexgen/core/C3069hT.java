package com.facebook.ads.redexgen.core;

import android.view.View;
import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3069hT implements MX {
    public static byte[] A02;
    public static String[] A03 = {"ebJtInVgM8lwtLsL8CqjQvfHZTFWXyTj", "MRT4Iz3aNiJEaKRUIrDApfghDq01n6sB", "qhIcWii6jOsLbVLe4G", "jd0Ec4CahT7YYBjB568owPC0gY4s3zOU", "RPiMcfQYBdHC0SSG6XvNc0NsjlYurq5U", "E74vSWGMqEH8Jt4WlgBEkdQ8nTEO7fKB", "DEVdv4rr1ByH9p4ezSF9ryFdFyWOGnGy", "23RYwIDt1nJrIBpc57"};
    public final /* synthetic */ AnonymousClass72 A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{93, Ascii.SI, 93, 88, Ascii.SI, Ascii.SI, 10, 13, 32, 3, Ascii.FF, Ascii.FF, 7, Ascii.DLE, 66, Ascii.VT, Ascii.SI, Ascii.DC2, Ascii.DLE, 7, 17, 17, Ascii.VT, 13, Ascii.FF, 66, 4, Ascii.VT, Ascii.DLE, 7, 6, Ascii.FS, Ascii.GS, 49, Ascii.DC2, Ascii.GS, Ascii.GS, Ascii.SYN, 1, Utf8.REPLACEMENT_BYTE, Ascii.FS, Ascii.DC4, Ascii.DC4, Ascii.SUB, Ascii.GS, Ascii.DC4, 58, Ascii.RS, 3, 1, Ascii.SYN, 0, 0, Ascii.SUB, Ascii.FS, Ascii.GS};
    }

    static {
        A01();
    }

    public C3069hT(AnonymousClass72 anonymousClass72, Runnable runnable) {
        this.A00 = anonymousClass72;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.core.MX
    public final void ACb(InterfaceC3132id interfaceC3132id) {
        this.A00.A02.A0F().A4S();
        this.A00.A07.A0C();
    }

    @Override // com.facebook.ads.redexgen.core.MX
    public final void ACc(InterfaceC3132id interfaceC3132id, View view) {
        this.A00.A02.A0F().A4R(interfaceC3132id == ((AbstractC3066hQ) this.A00).A00);
        if (interfaceC3132id != ((AbstractC3066hQ) this.A00).A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        MP mp = ((AbstractC3066hQ) this.A00).A01;
        AnonymousClass72 anonymousClass72 = this.A00;
        String[] strArr = A03;
        if (strArr[6].charAt(14) != strArr[5].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[0] = "gfJNIdbF2FrCa8qL8kuytpSS0QUlrsrj";
        strArr2[1] = "KzSpIsxhAVssntgB7OlLodebxm4ynnXJ";
        ((AbstractC3066hQ) anonymousClass72).A01 = interfaceC3132id;
        this.A00.A01 = view;
        if (!this.A00.A0C) {
            this.A00.A07.A0F(interfaceC3132id);
        } else {
            this.A00.A07.A0E(view);
            this.A00.A0Q(mp);
        }
    }

    @Override // com.facebook.ads.redexgen.core.MX
    public final void ACd(InterfaceC3132id interfaceC3132id) {
        VF.A05(A00(31, 25, 61), A00(8, 23, 44), A00(0, 8, 37));
        this.A00.A02.A0F().A4U();
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.facebook.ads.redexgen.core.MX
    public final void ADj(InterfaceC3132id interfaceC3132id, V1 v12) {
        this.A00.A02.A0F().A4T(interfaceC3132id == ((AbstractC3066hQ) this.A00).A00, v12.A03().getErrorCode());
        if (interfaceC3132id != ((AbstractC3066hQ) this.A00).A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0Q(interfaceC3132id);
        this.A00.ADB(v12);
    }
}
