package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2274Mp implements Serializable {
    public static byte[] A0C = null;
    public static final long serialVersionUID = 85021702336014823L;
    public C2276Mr A00;
    public long A01;
    public C2277Ms A02;
    public C2281Mw A03;
    public C2284Mz A04;
    public N0 A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    static {
        A04();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2274Mp A00(JSONObject jSONObject) {
        C2274Mp c2274Mp = new C2274Mp();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A01(374, 12, 28));
        c2274Mp.A08(new C2280Mv().A0X(jSONObject.optString(A01(760, 5, 83))).A0W(jSONObject.optString(A01(752, 8, 21))).A0L(jSONObject.optString(A01(136, 4, 53))).A0V(jSONObject.optString(A01(738, 14, 29))).A0T(jSONObject.optString(A01(588, 12, 41))).A0Q(jSONObject.optString(A01(548, 12, 11))).A0I(jSONObject.optString(A01(128, 8, 59))).A0N(jSONObject.optString(A01(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 14, 8))).A0H(jSONObject.optString(A01(93, 16, 119))).A0J(jSONObject.optString(A01(165, 8, 12))).A0M(jSONObject.optString(A01(202, 17, 56))).A0S(A03(jSONObjectOptJSONObject, A01(577, 11, 23), A01(76, 6, 46))).A0O(A03(jSONObjectOptJSONObject, A01(233, 19, 111), A01(8, 9, 99))).A0U(A03(jSONObjectOptJSONObject, A01(692, 9, 10), A01(89, 4, 30))).A0K(A03(jSONObjectOptJSONObject, A01(TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 13, 28), A01(0, 8, 55))).A0R(A03(jSONObjectOptJSONObject, A01(560, 17, 54), A01(82, 7, 30))).A0P(A03(jSONObjectOptJSONObject, A01(347, 27, 29), A01(17, 22, 63))).A0Y());
        c2274Mp.A0B(jSONObject.optString(A01(541, 7, 75)));
        c2274Mp.A09(new C2284Mz(jSONObject.optString(A01(335, 12, 95)), jSONObject.optString(A01(151, 14, 95)), jSONObject.optJSONObject(A01(140, 11, 25)), jSONObject.optString(A02(jSONObject))));
        String strA01 = A01(765, 19, 26);
        C2276Mr c2276MrA0K = new C2276Mr().A0L(jSONObject.optString(A01(851, 9, 107))).A0J(jSONObject.optLong(A01(827, 24, 105), -1L)).A0F(jSONObject.optInt(strA01, -1) == -1 ? jSONObject.optInt(A01(721, 17, 61), -1) : jSONObject.optInt(strA01, -1)).A0E(jSONObject.optInt(A01(IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, 18, 101), Integer.MAX_VALUE)).A0D(jSONObject.optInt(A01(600, 20, 106), -1)).A0K(NB.A01(jSONObject));
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(A01(392, 5, 82));
        if (jSONObjectOptJSONObject2 != null) {
            c2276MrA0K.A0M(jSONObjectOptJSONObject2.optString(A01(784, 3, 94))).A0I(jSONObjectOptJSONObject2.optInt(A01(860, 5, 121))).A0H(jSONObjectOptJSONObject2.optInt(A01(386, 6, 11)));
        }
        c2274Mp.A06(c2276MrA0K);
        c2274Mp.A0F(jSONObject.optBoolean(A01(671, 21, 31)));
        c2274Mp.A0A(new N0(AbstractC2529Wr.A04(jSONObject.optJSONArray(A01(320, 15, 66))), jSONObject.optLong(A01(252, 24, 44), 0L), jSONObject.optLong(A01(276, 44, 57), 0L), jSONObject.optBoolean(A01(476, 26, 46)), jSONObject.optBoolean(A01(397, 31, 29), false), jSONObject.optBoolean(A01(428, 34, 46), false)));
        c2274Mp.A0C(jSONObject.optBoolean(A01(522, 19, 27)));
        c2274Mp.A05(jSONObject.optLong(A01(109, 19, 72), 0L));
        return c2274Mp;
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{109, 79, 90, 75, 73, 65, 92, 87, 62, Ascii.NAK, 13, Ascii.DC4, Ascii.SYN, Ascii.NAK, Ascii.ESC, Ascii.RS, 9, 96, 84, 73, 75, 6, 97, 73, 73, 65, 74, 67, 6, 118, 74, 71, 95, 6, 117, 82, 73, 84, 67, 19, 46, 122, 45, 51, 54, 54, 122, 59, 47, 46, 53, 55, 59, 46, 51, 57, 59, 54, 54, 35, 122, 53, 42, Utf8.REPLACEMENT_BYTE, 52, 122, 51, 52, 122, 1, 41, Utf8.REPLACEMENT_BYTE, 57, 41, 7, 41, 101, 86, 67, 94, 89, 80, 85, 98, 113, 110, 98, 112, 116, 84, 110, 125, 98, Ascii.SI, 10, 49, 13, Ascii.FS, Ascii.VT, Ascii.SI, Ascii.SUB, 7, Ascii.CAN, Ascii.VT, 49, Ascii.SUB, Ascii.ETB, Ascii.RS, Ascii.VT, 48, 53, Ascii.SO, 39, 56, 53, 52, 62, Ascii.SO, 61, 62, 62, 33, Ascii.SO, 37, 56, 60, 52, 34, 67, 82, 82, 125, 81, 75, 88, 71, 78, 67, 72, 85, 98, 117, 116, 116, 111, 110, 95, 105, 99, 111, 110, 37, 39, 42, 42, Ascii.EM, 50, 41, Ascii.EM, 39, 37, 50, 47, 41, 40, 118, 116, 97, 112, 114, 122, 103, 108, 102, 100, 113, 96, 98, 106, 119, 124, 90, 113, 96, 125, 113, Ascii.RS, Ascii.US, Ascii.SYN, Ascii.ESC, 3, 37, Ascii.EM, Ascii.SYN, 19, Ascii.EM, 17, 37, Ascii.SO, Ascii.US, 2, Ascii.SO, 69, 68, 82, 85, 72, 79, SignedBytes.MAX_POWER_OF_TWO, 85, 72, 78, 79, 126, 85, 72, 85, 77, 68, 117, 126, 102, Ascii.DEL, 125, 126, 112, 117, 78, 114, 126, 100, Ascii.DEL, 101, Ascii.DC2, Ascii.EM, 1, Ascii.CAN, Ascii.SUB, Ascii.EM, Ascii.ETB, Ascii.DC2, 41, Ascii.NAK, Ascii.EM, 3, Ascii.CAN, 2, 41, 2, 19, Ascii.SO, 2, 80, 91, 81, 106, 86, 84, 71, 81, 106, 83, 90, 71, 86, 80, 106, 67, 92, 80, 66, 106, 65, 92, 88, 80, 69, 78, 68, Ascii.DEL, 67, 65, 82, 68, Ascii.DEL, 70, 79, 82, 67, 69, Ascii.DEL, 86, 73, 69, 87, Ascii.DEL, 84, 73, 77, 69, Ascii.DEL, 70, 79, 82, Ascii.DEL, 83, 69, 67, 79, 78, 68, Ascii.DEL, 69, 78, 68, Ascii.DEL, 67, 65, 82, 68, 62, 53, Utf8.REPLACEMENT_BYTE, 4, 56, 58, 41, Utf8.REPLACEMENT_BYTE, 4, 50, 54, 58, 60, 62, 40, 32, 36, 39, 34, Ascii.EM, 37, 41, 43, 43, 39, 40, 34, 98, 118, 107, 105, 91, 99, 107, 107, 99, 104, 97, 91, 116, 104, 101, 125, 91, 119, 112, 107, 118, 97, 91, 112, 97, 124, 112, 98, 96, 107, 96, 119, 108, 102, 90, 113, 96, 125, 113, 122, 119, 123, 117, 122, 102, 34, 38, 42, 44, 46, 109, 119, 91, 97, 106, 96, 91, 103, 101, 118, 96, 91, 114, 54, 91, 118, 97, 96, 97, 119, 109, 99, 106, 91, 97, 106, 101, 102, 104, 97, 96, 94, 68, 104, 88, 84, 104, 82, 89, 83, 104, 84, 86, 69, 83, 104, 65, 5, 104, 69, 82, 83, 82, 68, 94, 80, 89, 104, 82, 89, 86, 85, 91, 82, 83, Utf8.REPLACEMENT_BYTE, 37, 9, 36, 51, 33, 55, 36, 50, 51, 50, 9, 55, 50, 94, 68, 104, 68, 82, 84, 88, 89, 83, 104, 82, 89, 83, 104, 84, 86, 69, 83, 104, 82, 89, 86, 85, 91, 82, 83, 59, 33, 13, 36, 59, 54, 55, 61, 13, 51, 39, 54, 59, 61, 13, Utf8.REPLACEMENT_BYTE, 39, 38, 55, 54, 107, 113, 93, 117, 99, 118, 97, 106, 93, 99, 108, 102, 93, 96, 112, 109, 117, 113, 103, 34, 51, 49, 57, 51, 53, 55, 96, 115, 102, 123, 124, 117, 77, 113, 125, 103, 124, 102, 93, 78, 91, 70, 65, 72, 112, 76, SignedBytes.MAX_POWER_OF_TWO, 90, 65, 91, 112, 91, 74, 87, 91, 124, 111, 122, 103, 96, 105, 81, 122, 107, 118, 122, 66, 81, 68, 89, 94, 87, 111, 70, 81, 92, 69, 85, 0, Ascii.SYN, Ascii.DLE, Ascii.FS, Ascii.GS, Ascii.ETB, 0, 44, Ascii.NAK, Ascii.FS, 1, 44, Ascii.GS, Ascii.SYN, Ascii.VT, 7, 44, Ascii.DLE, 7, Ascii.DC2, Ascii.SI, Ascii.EM, Ascii.US, 19, Ascii.DC2, Ascii.CAN, Ascii.SI, 35, Ascii.SUB, 19, Ascii.SO, 35, Ascii.SO, Ascii.EM, Ascii.VT, Ascii.GS, Ascii.SO, Ascii.CAN, 6, Ascii.GS, Ascii.SUB, 2, 42, Ascii.DLE, Ascii.ESC, 17, 42, Ascii.SYN, Ascii.DC4, 7, 17, 34, 57, 62, 38, Ascii.SO, 52, 41, 56, 37, Ascii.SO, 37, 35, 48, Utf8.REPLACEMENT_BYTE, 34, 56, 37, 56, 62, Utf8.REPLACEMENT_BYTE, 117, 110, 105, 113, 89, 111, 104, 114, 116, 105, 89, 114, 116, 103, 104, 117, 111, 114, 111, 105, 104, 96, 122, 105, 118, 76, 103, 118, 107, 103, Ascii.DC4, Ascii.FF, Ascii.SO, Ascii.ETB, 56, 6, 9, 3, 56, Ascii.VT, 8, Ascii.DC4, 2, 56, Ascii.NAK, 2, Ascii.DLE, 6, Ascii.NAK, 3, 87, 79, 77, 84, 84, 69, 70, 72, 65, 123, 87, 65, 71, 75, 74, SignedBytes.MAX_POWER_OF_TWO, 87, 119, 107, 103, 109, 101, 104, 91, 103, 107, 106, 112, 97, 124, 112, Ascii.DEL, 121, 110, 120, 101, 120, 96, 105, 62, 35, 62, 38, 47, 118, 109, 112, 104, 106, 115, 115, 98, 97, 111, 102, 92, 112, 102, 96, 108, 109, 103, 112, 50, 53, 43, 47, 48, 61, 60, 54, 6, 56, 44, 45, 54, 41, 53, 56, 32, 6, 60, 55, 56, 59, 53, 60, 61, 13, Ascii.DC2, Ascii.US, Ascii.RS, Ascii.DC4, 36, Ascii.US, Ascii.SO, 9, Ascii.SUB, Ascii.SI, Ascii.DC2, Ascii.DC4, Ascii.NAK, 36, 8, Ascii.RS, Ascii.CAN, 6, Ascii.EM, Ascii.DC4, Ascii.NAK, Ascii.US, 47, 0, 2, Ascii.NAK, Ascii.FS, Ascii.US, 17, Ascii.DC4, 47, 3, Ascii.EM, 10, Ascii.NAK, 47, Ascii.DC2, 9, 4, Ascii.NAK, 3, 4, Ascii.ESC, Ascii.SYN, Ascii.ETB, Ascii.GS, 45, 7, 0, Ascii.RS, Ascii.ETB, 9, 4, Ascii.DC4, 8};
    }

    public static String A02(JSONObject jSONObject) {
        String strA01 = A01(186, 16, 99);
        String strA012 = A01(39, 37, 67);
        String strOptString = jSONObject.optString(strA01, strA012);
        if (strOptString.equals(strA012)) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A01(374, 12, 28));
            if (jSONObjectOptJSONObject != null) {
                strA012 = jSONObjectOptJSONObject.optString(strA01, strA012);
            }
            return strA012;
        }
        return strOptString;
    }

    public static String A03(JSONObject jSONObject, String str, String str2) {
        return jSONObject != null ? jSONObject.optString(str, str2) : str2;
    }

    private final void A05(long j10) {
        this.A01 = Math.max(0L, j10);
    }

    private void A06(C2276Mr c2276Mr) {
        this.A00 = c2276Mr;
    }

    private final void A07(C2277Ms c2277Ms) {
        this.A02 = c2277Ms;
    }

    private final void A08(C2281Mw c2281Mw) {
        this.A03 = c2281Mw;
    }

    private final void A09(C2284Mz c2284Mz) {
        this.A04 = c2284Mz;
    }

    private final void A0A(N0 n02) {
        this.A05 = n02;
    }

    private final void A0B(String str) {
        this.A06 = str;
    }

    private final void A0C(boolean z10) {
        this.A08 = z10;
    }

    private final void A0D(boolean z10) {
        this.A09 = z10;
    }

    private final void A0E(boolean z10) {
        this.A0A = z10;
    }

    private final void A0F(boolean z10) {
        this.A0B = z10;
    }

    public final long A0G() {
        return this.A01;
    }

    public final C2277Ms A0H() {
        return this.A02;
    }

    public final C2281Mw A0I() {
        return this.A03;
    }

    public final C2284Mz A0J() {
        return this.A04;
    }

    public final N0 A0K() {
        return this.A05;
    }

    public final String A0L() {
        return this.A06;
    }

    public final void A0M(int i10) {
        this.A00.A0D(i10);
        A07(this.A00.A0Q());
    }

    public final void A0N(JSONObject jSONObject) {
        A07(this.A00.A0Q());
    }

    public final void A0O(JSONObject jSONObject) {
        this.A00.A0O(jSONObject.optBoolean(A01(787, 22, 64)));
        this.A00.A0N(jSONObject.optBoolean(A01(502, 20, 75), true));
        A07(this.A00.A0Q());
        A0R(jSONObject.optBoolean(A01(462, 14, 79)));
        A0D(jSONObject.optBoolean(A01(638, 13, 108)));
        A0E(jSONObject.optBoolean(A01(651, 20, 72)));
    }

    public final void A0P(JSONObject jSONObject) {
        this.A00.A0N(jSONObject.optBoolean(A01(502, 20, 75), true));
        A07(this.A00.A0Q());
    }

    public final void A0Q(JSONObject jSONObject) {
        this.A00.A0G(jSONObject.optInt(A01(809, 18, 98)));
        this.A00.A0N(jSONObject.optBoolean(A01(502, 20, 75), true));
        this.A00.A0P(jSONObject.optBoolean(A01(701, 20, 126), false));
        A07(this.A00.A0Q());
        A0D(jSONObject.optBoolean(A01(638, 13, 108)));
    }

    public final void A0R(boolean z10) {
        this.A07 = z10;
    }

    public final boolean A0S() {
        return this.A07;
    }

    public final boolean A0T() {
        return this.A08;
    }

    public final boolean A0U() {
        return this.A01 > 0;
    }

    public final boolean A0V() {
        return this.A09;
    }

    public final boolean A0W() {
        return this.A0B;
    }
}
