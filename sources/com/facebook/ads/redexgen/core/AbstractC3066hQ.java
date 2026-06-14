package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.dynamicloading.FlashPreferences;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC3066hQ implements VT {
    public static byte[] A0D;
    public static String[] A0E = {"mx9sJqsz4sgJcdPgoYbgRIW9VnwzqRx6", "rFbyGWP2Ub8PQhtH", "vlmOFoI5eqS6Nw0ENJhYNh6o4BRmenqE", "", "JTMxf3amnDxIP84vbXSIdB2jgXN5bQ", "LkG9NIMCA2H26FKF", "xLNm9V1ZNmyFYJ5qhdZubuzSePd6Iimu", "7SoM7bEoo8CKfR8pxc6QG8O9JCd0xBEh"};
    public static final Handler A0F;
    public static final MU A0G = null;
    public static final VU A0H = null;
    public static final String A0I;
    public MP A00;
    public MP A01;
    public TE A04;
    public VR A05;
    public VU A06;
    public MQ A07;
    public final NT A08;
    public final US A09;
    public final MU A0A;
    public final C2820dL A0B;
    public volatile boolean A0C;
    public long A03 = -1;
    public String A02 = null;

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0D = new byte[]{-58, -23, -26, -11, -7, -22, -9, -91, -23, -12, -22, -8, -91, -13, -12, -7, -91, -22, -3, -18, -8, -7, -14, Ascii.NAK, Ascii.DC2, 33, 37, Ascii.SYN, 35, -47, Ascii.SUB, 36, -47, Ascii.US, 38, Ascii.GS, Ascii.GS, -47, -39, Ascii.DC4, Ascii.EM, Ascii.DC2, Ascii.SUB, Ascii.US, -47, Ascii.US, 32, 37, -47, Ascii.GS, 32, Ascii.DC2, Ascii.NAK, Ascii.SYN, Ascii.NAK, -38, -56, -21, -24, -9, -5, -20, -7, -89, -16, -6, -89, -11, -4, -13, -13, -89, -81, -22, -17, -24, -16, -11, -20, -21, -80, -91, -56, -59, -44, -40, -55, -42, -124, -51, -41, -124, -46, -39, -48, -48, -124, -116, -46, -45, -124, -57, -52, -59, -51, -46, -115, 6, 41, 38, 53, 57, 42, 55, -27, 46, 56, -27, 51, 58, 49, 49, -27, 52, 51, -27, 56, 57, 38, 55, 57, 6, 41, -21, Ascii.FF, -67, 10, Ascii.FF, Ascii.SI, 2, -67, -2, 1, -67, 0, -2, Ascii.VT, 1, 6, 1, -2, 17, 2, Ascii.DLE, -53, -50, -23, -26, -27, -34, -105, -40, -37, -40, -25, -21, -36, -23, -105, -21, -16, -25, -36, -91, Utf8.REPLACEMENT_BYTE, 66, -2, Utf8.REPLACEMENT_BYTE, 74, 80, 67, Utf8.REPLACEMENT_BYTE, 66, 87, -2, 81, 82, Utf8.REPLACEMENT_BYTE, 80, 82, 67, 66, 47, 50, 65, -51, -36, -43, 62, 67, 60, 68, 73, 58, 75, 60, 77, 60, 72, 78, -50, -33, -29, -32, -13, -32, -50, -31, -23, -28, -30, -13, -97, -24, -14, -97, -19, -12, -21, -21, 19, Ascii.FS, 17, 32, 39, Ascii.RS, 34, 19, Ascii.DC2, 13, Ascii.ETB, Ascii.DC2, 60, 69, 77, SignedBytes.MAX_POWER_OF_TWO, 73, 70, 69, 68, 60, 69, 75, -9, SignedBytes.MAX_POWER_OF_TWO, 74, -9, 60, 68, 71, 75, 80, 51, 57, 46, SignedBytes.MAX_POWER_OF_TWO, 53, 44, 48, 60, 59, 51, 54, 52, Ascii.NAK, 33, Ascii.DC4, 32, 36, Ascii.DC4, Ascii.GS, Ascii.DC2, 40, Ascii.SO, Ascii.DC2, Ascii.DLE, Ascii.US, Ascii.US, Ascii.CAN, Ascii.GS, Ascii.SYN, -3, 2, 10, -11, 0, -3, -8, -76, 4, 0, -11, -9, -7, 1, -7, 2, 8, -76, -3, 2, -76, 6, -7, 7, 4, 3, 2, 7, -7, 36, 39, Ascii.EM, Ascii.FS, Ascii.ETB, 44, 33, 37, Ascii.GS, Ascii.ETB, 37, 43, 17, 4, Ascii.DLE, Ascii.DC4, 4, Ascii.DC2, 19, -2, 8, 3, 10, 5, -7, -10, 9, -6, -12, 9, -2, 2, -6, 8, 9, -10, 2, 5};
    }

    public abstract void A0P();

    public abstract void A0R(MP mp, TE te2, TC tc2, NU nu);

    static {
        A08();
        XR.A02();
        A0I = AbstractC3066hQ.class.getSimpleName();
        A0F = new Handler(Looper.getMainLooper());
    }

    public AbstractC3066hQ(C2820dL c2820dL, NT nt) {
        this.A0B = c2820dL;
        this.A08 = nt;
        if (A0H != null) {
            this.A06 = A0H;
        } else {
            this.A06 = new VU(this.A0B);
        }
        this.A06.A0R(this);
        if (A0G != null) {
            this.A0A = A0G;
        } else {
            this.A0A = new MU();
        }
        DynamicLoaderFactory.makeLoader(this.A0B).getInitApi().onAdLoadInvoked(this.A0B);
        this.A09 = c2820dL.A0A();
        this.A0B.A0F().A5W();
    }

    private void A09(TE te2) {
        if (ProcessUtils.isRemoteRenderingProcess()) {
            return;
        }
        SharedPreferences sharedPreferences = FlashPreferences.getSharedPreferences(this.A0B);
        if (te2.A0C() != null) {
            sharedPreferences.edit().putString(A07(262, 12, 110), te2.A0C()).putLong(A07(342, 16, 54), System.currentTimeMillis()).apply();
            return;
        }
        sharedPreferences.edit().clear().apply();
    }

    private void A0A(TE te2) {
        this.A0B.A0F().AIi(te2.A0H());
    }

    private void A0B(PW pw) {
        TE placement = pw.A00();
        if (placement == null || placement.A05() == null) {
            String strA07 = A07(291, 29, 53);
            V1 error = new V1(AdErrorType.NO_AD_PLACEMENT, strA07);
            this.A0B.A0F().A5Y(error.A03().getErrorCode(), strA07);
            if (this.A07 != null) {
                this.A07.A0G(error);
                return;
            }
            return;
        }
        this.A04 = placement;
        this.A00 = null;
        TE te2 = this.A04;
        JSONObject jSONObjectA0E = te2.A0E();
        String strA072 = A07(195, 3, 13);
        if (jSONObjectA0E == null) {
            TC tcA04 = te2.A04();
            if (!A0F(te2, tcA04)) {
                return;
            }
            if (this.A00 == null) {
                this.A0B.A08().AAy(strA072, AbstractC2433Sv.A0a, new C2434Sw(A07(81, 26, 5), tcA04.A02()));
                ADB(V1.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            A0R(this.A00, te2, tcA04, new NU(tcA04.A04(), te2.A05(), this.A08.A0A, te2.A05().A0C()));
        } else {
            ArrayList arrayList = new ArrayList();
            TC tcA042 = te2.A04();
            do {
                if (arrayList.isEmpty()) {
                    if (A0F(te2, tcA042)) {
                        arrayList.add(tcA042);
                    } else {
                        return;
                    }
                } else if (A0E(tcA042)) {
                    arrayList.add(tcA042);
                }
                tcA042 = te2.A04();
            } while (tcA042 != null);
            MP mp = this.A00;
            String[] strArr = A0E;
            if (strArr[7].charAt(26) != strArr[6].charAt(26)) {
                throw new RuntimeException();
            }
            A0E[2] = "ioxWOihgwDfBac41kTr6w1CF9LpRHapv";
            if (mp == null) {
                this.A0B.A08().AAy(strA072, AbstractC2433Sv.A0a, new C2434Sw(A07(56, 25, 40), ((TC) arrayList.get(0)).A02()));
                ADB(V1.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            boolean z10 = false;
            try {
                if (arrayList.size() > 1 && this.A00 != null && this.A00.AJa()) {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((TC) it.next()).A04());
                    }
                    jSONObject.put(A07(192, 3, 111), jSONArray);
                    jSONObject.put(A07(198, 12, 124), te2.A0E());
                    A0R(this.A00, te2, tcA042, new NU(jSONObject, te2.A05(), this.A08.A0A, te2.A05().A0C()));
                    z10 = true;
                }
            } catch (Exception unused) {
                z10 = false;
            }
            if (!z10) {
                if (arrayList.isEmpty()) {
                    V1 v1A01 = V1.A01(AdErrorType.NO_FILL, A07(0, 0, 103));
                    this.A0B.A0F().A5Y(v1A01.A03().getErrorCode(), A07(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 22, 62));
                    if (this.A07 != null) {
                        this.A07.A0G(v1A01);
                        return;
                    }
                    return;
                }
                if (this.A00 == null) {
                    this.A0B.A08().AAy(strA072, AbstractC2433Sv.A0a, new C2434Sw(A07(22, 34, 82), ((TC) arrayList.get(0)).A02()));
                    ADB(V1.A00(AdErrorType.INTERNAL_ERROR));
                    return;
                }
                TC tc2 = (TC) arrayList.get(0);
                A0R(this.A00, te2, tc2, new NU(tc2.A04(), te2.A05(), this.A08.A0A, te2.A05().A0C()));
            }
        }
        A09(placement);
        A0A(placement);
    }

    private final void A0C(String str, AdExperienceType adExperienceType) {
        this.A0B.A0F().A5Z(str != null);
        this.A03 = System.currentTimeMillis();
        try {
            VB bidPayload = new VB(this.A0B, str, this.A08.A0A, this.A08.A09);
            this.A05 = this.A08.A00(this.A0B, bidPayload, adExperienceType);
            if (this.A06 != null) {
                this.A06.A0Q(this.A05);
            }
        } catch (V2 e10) {
            ADB(V1.A02(e10));
        }
    }

    private void A0D(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A02 = jSONObject.optString(A07(230, 12, 79));
            MW.A01(this.A0B).A0O(jSONObject);
        }
    }

    private boolean A0E(TC tc2) {
        return (tc2 == null || tc2.A04() == null) ? false : true;
    }

    private boolean A0F(TE te2, TC tc2) {
        String strA07 = A07(0, 0, 103);
        if (tc2 == null) {
            V1 v1A01 = V1.A01(AdErrorType.NO_FILL, strA07);
            this.A0B.A0F().A5Y(v1A01.A03().getErrorCode(), A07(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 22, 62));
            if (this.A07 != null) {
                this.A07.A0G(v1A01);
            }
            return false;
        }
        String strA02 = tc2.A02();
        MP mpA00 = this.A0A.A00(this.A0B, te2.A05().A0D());
        if (mpA00 == null) {
            this.A0B.A08().AAy(A07(195, 3, 13), AbstractC2433Sv.A0a, new C2434Sw(A07(0, 22, 38), strA02));
            ADB(V1.A00(AdErrorType.INTERNAL_ERROR));
            return false;
        }
        if (!this.A08.A01().contains(mpA00.A8c())) {
            V1 v1A012 = V1.A01(AdErrorType.INTERNAL_ERROR, strA07);
            this.A0B.A0F().A5Y(v1A012.A03().getErrorCode(), A07(ModuleDescriptor.MODULE_VERSION, 19, 24));
            if (this.A07 != null) {
                MQ mq = this.A07;
                if (A0E[0].length() != 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A0E;
                strArr[7] = "XDVsCbJ3K5v8dlUMGtS0uKtjThdAM1fs";
                strArr[6] = "AXbWkB0jI9efrJtSTWvCCcVR8Wd1ee9G";
                mq.A0G(v1A012);
            }
            return false;
        }
        this.A00 = mpA00;
        JSONObject jSONObjectA04 = tc2.A04();
        if (jSONObjectA04 != null) {
            String strOptString = jSONObjectA04.optString(A07(332, 10, 64));
            this.A0B.A0F().AJ0(strOptString);
            this.A0B.A0D(strOptString);
            C2794cu c2794cuA00 = SP.A00();
            if (c2794cuA00 != null) {
                c2794cuA00.A0D(strOptString);
            }
            JSONObject dataObject = jSONObjectA04.optJSONObject(A07(274, 17, 80));
            A0D(dataObject);
            if (this.A05 == null) {
                String strA072 = A07(242, 20, 120);
                V1 v1A013 = V1.A01(AdErrorType.UNKNOWN_ERROR, strA072);
                this.A0B.A0F().A5Y(v1A013.A03().getErrorCode(), strA072);
                if (this.A07 != null) {
                    this.A07.A0G(v1A013);
                }
                return false;
            }
            return true;
        }
        String strA073 = A07(212, 18, 32);
        V1 v1A014 = V1.A01(AdErrorType.UNKNOWN_ERROR, strA073);
        this.A0B.A0F().A5Y(v1A014.A03().getErrorCode(), strA073);
        if (this.A07 != null) {
            this.A07.A0G(v1A014);
        }
        return false;
    }

    public final long A0G() {
        if (this.A04 != null) {
            return this.A04.A03();
        }
        String[] strArr = A0E;
        if (strArr[7].charAt(26) != strArr[6].charAt(26)) {
            throw new RuntimeException();
        }
        A0E[2] = "cOTrI9DB0oxjTyLR1voyMrEgWVbVphTL";
        return -1L;
    }

    public final Handler A0H() {
        return A0F;
    }

    public AbstractC2273Mo A0I() {
        if (this.A01 != null) {
            MP mp = this.A01;
            if (A0E[2].charAt(15) == 'D') {
                return ((AbstractC3103iA) mp).A0I();
            }
            A0E[0] = "oRXWb94touLPnP0lmqQIoCQNN81QkmVq";
            return ((AbstractC3103iA) mp).A0I();
        }
        String[] strArr = A0E;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[7] = "c4mFc8cvcfHQyghvzrB7bYP2aMdrhGND";
        strArr2[6] = "OOjdStzIF6ducmayoMT1WxOsFGdjLtMG";
        return null;
    }

    public final TF A0J() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A05();
    }

    public final void A0K() {
        if (!U7.A1q(this.A0B)) {
            return;
        }
        MP mp = this.A01;
        String[] strArr = A0E;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[3] = "";
        strArr2[4] = "YS2d1pFjROLoYd3yH38ADYRoaACmCS";
        if (mp != null) {
            W2.A00(this.A0B).A0D(this.A01.A8c().toString(), this.A01.A7G());
        }
        if (this.A06 != null) {
            this.A06.A0R(null);
            this.A06 = null;
        }
        this.A07 = null;
        this.A00 = null;
        this.A01 = null;
    }

    public final void A0L() {
        String strA7G;
        this.A0B.A0F().A3J(XG.A01(this.A03));
        if (this.A01 == null || (strA7G = this.A01.A7G()) == null) {
            return;
        }
        HashMap map = new HashMap();
        String strA05 = XG.A05(this.A03);
        String clientToken = A07(320, 12, 89);
        map.put(clientToken, strA05);
        new C2463Ua(strA7G, this.A09).A04(UZ.A08, map);
    }

    public final void A0M() {
        MP mp = this.A01;
        String strA07 = A07(195, 3, 13);
        if (mp == null) {
            String strA072 = A07(107, 26, 102);
            this.A0B.A08().AAy(strA07, AbstractC2433Sv.A0Q, new C2434Sw(strA072));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0B.A0F().A5Y(adErrorType.getErrorCode(), strA072);
            if (this.A07 != null) {
                MQ mq = this.A07;
                String errorMessage = adErrorType.getDefaultErrorMessage();
                mq.A0G(V1.A01(adErrorType, errorMessage));
            }
            this.A0B.A0F().A5b();
            return;
        }
        if (this.A0C) {
            String strA073 = A07(174, 18, 127);
            this.A0B.A08().AAy(strA07, AbstractC2433Sv.A0M, new C2434Sw(strA073));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0F().A5Y(adErrorType2.getErrorCode(), strA073);
            if (this.A07 != null) {
                MQ mq2 = this.A07;
                String errorMessage2 = adErrorType2.getDefaultErrorMessage();
                mq2.A0G(V1.A01(adErrorType2, errorMessage2));
            }
            this.A0B.A0F().A5a();
            return;
        }
        if (!TextUtils.isEmpty(this.A01.A7G())) {
            this.A09.ABS(this.A01.A7G());
        }
        this.A0B.A0F().A5c();
        this.A0C = true;
        A0P();
    }

    public final void A0N() {
        A0Y(false);
    }

    public final void A0O() {
        if (this.A02 != null) {
            MW.A01(this.A0B).A0N(this.A02);
        }
    }

    public final void A0Q(MP mp) {
        if (mp != null) {
            mp.onDestroy();
        }
    }

    public final void A0S(MQ mq) {
        this.A07 = mq;
    }

    public final void A0T(NU nu) {
        A0V(nu.A03().optString(A07(210, 2, 12)));
    }

    public void A0U(String str) {
        A0C(str, null);
    }

    public final void A0V(String str) {
        this.A0B.A0F().A5V();
        if (!TextUtils.isEmpty(str)) {
            new C2463Ua(str, this.A09).A04(UZ.A04, null);
        }
    }

    public final void A0W(String str) {
        A0U(str);
    }

    public final void A0X(String str, AdExperienceType adExperienceType) {
        A0C(str, adExperienceType);
    }

    public void A0Y(boolean z10) {
        if (!z10 && !this.A0C) {
            return;
        }
        this.A0B.A0F().A5d();
        A0Q(this.A01);
        this.A0C = false;
    }

    public final boolean A0Z() {
        return this.A04 == null || this.A04.A0I();
    }

    @Override // com.facebook.ads.redexgen.core.VT
    public final synchronized void ADB(V1 v12) {
        A0H().post(new C3067hR(this, v12));
    }

    @Override // com.facebook.ads.redexgen.core.VT
    public final synchronized void AFO(PW pw) {
        try {
            A0B(pw);
        } catch (Exception e10) {
            this.A0B.A08().AAy(A07(195, 3, 13), AbstractC2433Sv.A0T, new C2434Sw(e10));
        }
    }
}
