package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2799cz extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"5vYLtEaU9MAxDoI06TlJjFfWs8tiaGj", "TX23sib3Tj6X7eJy5cgYAILp0vVPLOiW", "Lxz50jZMaNdiu", "yIxUapHBf", "xsW4qvb7U5EMj5cNQbMl14i5qh6u6uOh", "8XLPt3rjq6gnj0Cd96o3z24ZTqMdgzej", "IIODaFrLnzdPntRGftRJpuPC", "ODWlzaCdU1siup4vWOfVQK22DnthNinE"};
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public InterfaceC2797cx A02;
    public Map<String, String> A03;
    public final AbstractC3095hy A04;
    public final NB A05;
    public final C2820dL A06;
    public final US A07;
    public final InterfaceC2597Zh A08;
    public final C2216Ki A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 9);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        String[] strArr = A0D;
        if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[7] = "Af0WM9g7Nak7nSkWG18ndsMVC8MahONd";
        strArr2[4] = "VergmF1iO6RBn6aZ7U2vBdquKGl77VZm";
        A0C = new byte[]{54, Ascii.DC2, 32, Ascii.FS, 17, 9, 17, Ascii.DC2, Ascii.FS, Ascii.NAK, 49, Ascii.DC4, 19, 34, 49, 48, 42, 45, 36, 99, 38, 49, 49, 44, 49, 68, 120, 117, 109, 117, 118, 120, 113, 52, 112, 123, 87, 96, 117, 87, 120, 125, 119, Ascii.DEL, 52, 96, 102, 125, 115, 115, 113, 102, 113, 112, 52, 99, 125, 96, 124, 52, 100, 102, 113, 57, 113, 98, 113, 122, 96, 52, 119, 120, 125, 119, Ascii.DEL, 103, 52, 119, 123, 97, 122, 96, 52, 117, 122, 112, 52, 80, 113, 120, 117, 109, 13, 49, 60, 36, 60, Utf8.REPLACEMENT_BYTE, 49, 56, Ascii.FS, 57, 46, Ascii.VT, 52, 56, 42, 114, 117, 119, 121, 126, 48, 124, Ascii.DEL, 113, 116, 121, 126, 119, 48, 98, 117, 125, Ascii.DEL, 100, 117, 48, 96, 124, 113, 105, 113, 114, 124, 117, 34, 45, 40, 34, 42, 50, 5, 4, 13, 0, Ascii.CAN, 114, 110, 99, 123, 99, 96, 110, 103, 52, 40, 37, 61, 37, 38, 40, 33, Ascii.ESC, 54, 33, 41, 43, 48, 33, 95, 72, SignedBytes.MAX_POWER_OF_TWO, 66, 89, 72, 114, 94, 72, 94, 94, 68, 66, 67, 114, 68, 73, 78, 85, 81, 95, 84, 119, 101, 98, 95, 118, 105, 101, 119};
    }

    static {
        A09();
        A0E = (int) (AbstractC2523Wl.A02 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C2799cz(C2820dL c2820dL, AbstractC3095hy abstractC3095hy, NB nb2, US us, InterfaceC2797cx interfaceC2797cx, Map<String, String> playableMetricsData) {
        super(c2820dL);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A08 = new AbstractC2227Kt() { // from class: com.facebook.ads.redexgen.X.3p
            @Override // com.facebook.ads.redexgen.core.InterfaceC2597Zh
            public final void ACO() {
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC2227Kt, com.facebook.ads.redexgen.core.InterfaceC2597Zh
            public final void ADG(int i10, String str) {
                this.A00.A0B.set(true);
                if (this.A00.A02 == null) {
                    return;
                }
                this.A00.A02.AE2();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC2597Zh
            public final void ADW() {
                if (this.A00.A0B.get() || !this.A00.A0A.compareAndSet(false, true) || this.A00.A02 == null) {
                    return;
                }
                this.A00.A02.ADW();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC2597Zh
            public final void AFw() {
                if (this.A00.A02 == null) {
                    return;
                }
                this.A00.A02.AFw();
            }
        };
        this.A06 = c2820dL;
        this.A04 = abstractC3095hy;
        this.A05 = nb2;
        this.A07 = us;
        this.A02 = interfaceC2797cx;
        this.A03 = playableMetricsData;
        this.A09 = A04();
        if (this.A05.A0M() && !this.A05.A0O()) {
            A0B();
        }
        if (U7.A1u(this.A06)) {
            this.A06.A0B().AK2(this.A09, this.A04.A25(), false);
        }
        addView(this.A09, A0F);
    }

    public static /* synthetic */ int A00(C2799cz c2799cz) {
        int i10 = c2799cz.A00;
        c2799cz.A00 = i10 + 1;
        return i10;
    }

    private C2216Ki A04() {
        C2216Ki c2216Ki = new C2216Ki(this.A06, (WeakReference<InterfaceC2597Zh>) new WeakReference(this.A08), 10, U7.A22(this.A06));
        c2216Ki.setCornerRadius(A0E);
        c2216Ki.setLogMultipleImpressions(false);
        c2216Ki.setCheckAssetsByJavascriptBridge(false);
        c2216Ki.setWebViewTimeoutInMillis(this.A05.A09());
        c2216Ki.setRequestId(this.A04.A17());
        c2216Ki.setOnTouchListener(new ViewOnTouchListenerC2798cy(this));
        WebSettings settings = c2216Ki.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        c2216Ki.addJavascriptInterface(new C2800d0(this.A06, this, this.A07, this.A03, this.A04.A25()), A06(0, 12, 121));
        return c2216Ki;
    }

    public final void A0A() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.A01;
        C2434Sw c2434Sw = new C2434Sw(A06(25, 67, 29));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A06(136, 6, 72), this.A00);
            jSONObject.put(A06(142, 5, 104), jCurrentTimeMillis);
            jSONObject.put(A06(187, 5, 51), this.A04.A25());
        } catch (JSONException e10) {
            Log.e(A06(92, 15, 84), A06(12, 13, 74), e10);
        }
        c2434Sw.A07(jSONObject);
        c2434Sw.A05(1);
        InterfaceC2432Su interfaceC2432SuA08 = this.A06.A08();
        int i10 = AbstractC2433Sv.A2D;
        String strA06 = A06(147, 8, 11);
        interfaceC2432SuA08.AAz(strA06, i10, c2434Sw);
        this.A00 = 0;
        if (!U7.A1p(this.A06)) {
            if (this.A02 == null) {
                return;
            }
            this.A02.ACt();
            return;
        }
        if (jCurrentTimeMillis <= U7.A0L(this.A06)) {
            InterfaceC2797cx interfaceC2797cx = this.A02;
            String[] strArr = A0D;
            if (strArr[7].charAt(0) == strArr[4].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[1] = "0XAlcIRGce3nNmobAWWNAzxTwWjfpKo1";
            strArr2[5] = "vX4VpuJxASYV4FwrDvVxGQ4QiWthZxUm";
            if (interfaceC2797cx != null) {
                this.A02.ACt();
                return;
            }
            return;
        }
        c2434Sw.A05(0);
        this.A06.A08().AAy(strA06, AbstractC2433Sv.A2E, c2434Sw);
    }

    public final void A0B() {
        String strA0F;
        if (this.A05.A0O()) {
            C2434Sw c2434Sw = new C2434Sw(A06(107, 29, 25));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A06(170, 17, 36), this.A05.A0I());
                jSONObject.put(A06(187, 5, 51), this.A04.A25());
            } catch (JSONException e10) {
                String strA06 = A06(92, 15, 84);
                String strA062 = A06(12, 13, 74);
                String[] strArr = A0D;
                if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[3] = "qKqF8GsLC";
                strArr2[6] = "yUBs4wOBB81EmWZp6CsNCuI0";
                Log.e(strA06, strA062, e10);
            }
            c2434Sw.A07(jSONObject);
            c2434Sw.A05(1);
            InterfaceC2432Su interfaceC2432SuA08 = this.A06.A08();
            int i10 = AbstractC2433Sv.A2G;
            String strA063 = A06(ModuleDescriptor.MODULE_VERSION, 15, 77);
            interfaceC2432SuA08.AAz(strA063, i10, c2434Sw);
            if (U7.A0r(this.A06) && XE.A00(this.A06) == XD.A07) {
                this.A06.A08().AAz(strA063, AbstractC2433Sv.A2F, c2434Sw);
                this.A08.ADG(0, null);
                String[] strArr3 = A0D;
                if (strArr3[1].charAt(1) != strArr3[5].charAt(1)) {
                    String[] strArr4 = A0D;
                    strArr4[7] = "eYeTyqsAvkMxTzxGPJMzaaOJBs1WoRUE";
                    strArr4[4] = "DGSgvEgHkFrTWskIwQomZOyU4ros1fyW";
                    return;
                } else {
                    String[] strArr5 = A0D;
                    strArr5[1] = "QXwUk7ZcYbXDO6xLw92fyo5XHWgn18Du";
                    strArr5[5] = "iXthj0ZXJZZP0QlicLBvNNfJ4d5EWvqr";
                    return;
                }
            }
        }
        try {
            C2216Ki c2216Ki = this.A09;
            if (!TextUtils.isEmpty(this.A05.A0C())) {
                strA0F = this.A05.A0C();
            } else {
                strA0F = this.A05.A0F();
            }
            c2216Ki.loadUrl(strA0F);
        } catch (Exception e11) {
            this.A06.A08().AAy(A06(192, 8, 9), AbstractC2433Sv.A2f, new C2434Sw(e11));
        }
    }

    public final void A0C() {
        if (U7.A1u(this.A06)) {
            this.A06.A0B().AJj(this.A09);
        }
        this.A09.removeJavascriptInterface(A06(0, 12, 121));
        this.A09.destroy();
    }

    public XH getTouchDataRecorder() {
        return this.A09.getTouchDataRecorder();
    }

    public C2893eX getViewabilityChecker() {
        return this.A09.getViewabilityChecker();
    }

    public void setPlayableAdsViewListener(InterfaceC2797cx interfaceC2797cx) {
        this.A02 = interfaceC2797cx;
    }
}
