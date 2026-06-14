package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Log;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VG implements US {
    public static US A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final C2794cu A00;
    public final InterfaceC2446Tj A01;
    public final UR A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{50, 119, 100, 119, 124, 102, 60, 54, 3, 3, Ascii.DC2, Ascii.SUB, 7, 3, Ascii.RS, Ascii.EM, Ascii.DLE, 87, 3, Ascii.CAN, 87, Ascii.ESC, Ascii.CAN, Ascii.DLE, 87, Ascii.SYN, Ascii.EM, 87, Ascii.RS, Ascii.EM, 1, Ascii.SYN, Ascii.ESC, Ascii.RS, 19, 87, 66, 100, 119, 117, 115, 87, 85, 94, 85, 66, 89, 83, Ascii.GS, Ascii.DLE, Ascii.EM, Ascii.FF};
    }

    static {
        A03();
        A05 = VG.class.getSimpleName();
        A06 = false;
    }

    public VG(C2794cu c2794cu) {
        UQ dispatchCallback;
        this.A00 = c2794cu;
        if (U9.A0T(c2794cu)) {
            this.A01 = AbstractC2445Th.A00(c2794cu);
            dispatchCallback = UX.A00(c2794cu, this.A01);
        } else {
            C6J c6jA01 = AbstractC2445Th.A01(c2794cu);
            dispatchCallback = UX.A01(c2794cu, c6jA01);
            this.A01 = c6jA01;
        }
        this.A02 = new VJ(c2794cu, dispatchCallback);
        XU.A08.execute(new VI(this));
        A04(c2794cu);
    }

    public static synchronized US A01(C2794cu c2794cu) {
        if (A03 == null) {
            A03 = new VG(c2794cu);
        }
        return A03;
    }

    public static synchronized void A04(C2794cu c2794cu) {
        if (A06) {
            return;
        }
        c2794cu.A04().ACE();
        A06 = true;
    }

    private void A05(UP up) {
        if (!up.A0A()) {
            Log.e(A05, A02(7, 29, 55) + up.A06() + A02(0, 7, 82));
        } else {
            A06(up);
            this.A01.AKL(up, new VH(this, up));
        }
    }

    private void A06(UP up) {
        switch (up.A06()) {
            case A0Q:
            case A0K:
            case A07:
            case A0J:
            case A0R:
            case A0T:
            case A0U:
                C2434Sw c2434Sw = new C2434Sw(new Exception(A02(36, 5, 86)));
                c2434Sw.A05(1);
                try {
                    c2434Sw.A07(new JSONObject().put(A02(48, 4, 41), up.A06().toString()));
                    break;
                } catch (JSONException unused) {
                }
                this.A00.A08().AAz(A02(41, 7, 112), AbstractC2433Sv.A1H, c2434Sw);
                break;
        }
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void AAp(String str, Map<String, String> data) {
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A04).A02(UV.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void AAr(String str, Map<String, String> data) {
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A04).A02(UV.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void AAs(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A04).A02(UV.A07).A06(AbstractC2465Uc.A0A(str, UZ.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void AAt(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A04).A02(UV.A08).A06(AbstractC2465Uc.A0A(str, UZ.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void AAx(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A04).A02(UV.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void AB1(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A04).A02(UV.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void AB5(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A05).A02(UV.A0D).A06(AbstractC2465Uc.A0A(str, UZ.A0T)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void AB6(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A05).A02(UV.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void AB7(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A05).A02(UV.A0F).A06(AbstractC2465Uc.A0A(str, UZ.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void AB8(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A05).A02(UV.A0K).A06(AbstractC2465Uc.A0A(str, UZ.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void ABH(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A05).A02(UV.A0H).A06(AbstractC2465Uc.A0A(str, UZ.A0X)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void ABJ(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A04).A02(UV.A0J).A06(AbstractC2465Uc.A0A(str, UZ.A0a)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void ABK(String str, Map<String, String> data, String str2, UU uu) {
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(uu).A02(UV.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void ABL(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        UP adEvent = new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A04).A02(UV.A0L).A07(this.A00);
        A05(adEvent);
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void ABP(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A05).A02(UV.A0N).A06(AbstractC2465Uc.A0A(str, UZ.A0i)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void ABQ(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A05).A02(UV.A0O).A06(AbstractC2465Uc.A0A(str, UZ.A0j)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void ABS(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A01(UU.A04).A02(UV.A0P).A06(AbstractC2465Uc.A0A(str, UZ.A0k)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void ABT(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A04).A02(UV.A0G).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void ABX(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A05).A02(UV.A0Q).A06(AbstractC2465Uc.A0A(str, UZ.A0o)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void ABY(String str, Map<String, String> data) {
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A05).A02(UV.A0V).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void ABa(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new UO().A04(str).A00(this.A00.A09().A01()).A03(this.A00.A09().A02()).A05(data).A01(UU.A05).A02(UV.A0W).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.US
    public final void AGF(String str) {
        new AsyncTaskC2919ex(this.A00).execute(str);
    }
}
