package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3109iG implements MK {
    public static byte[] A08;
    public final MJ A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Collection<String> A06;
    public final Map<String, String> A07;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C3109iG A00(C6M c6m, JSONObject jSONObject) {
        String strOptString = jSONObject.optString(A01(33, 6, 120));
        String strOptString2 = jSONObject.optString(A01(0, 18, 118));
        String strOptString3 = jSONObject.optString(A01(47, 10, 52));
        String strA02 = AbstractC2529Wr.A02(jSONObject, A01(18, 2, 83));
        MJ mjA00 = ML.A00(jSONObject);
        Collection<String> collectionA03 = ML.A03(c6m, jSONObject);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A01(39, 8, 66));
        HashMap map = new HashMap();
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObjectOptJSONObject.optString(next));
            }
        }
        return new C3109iG(strOptString, strOptString2, mjA00, collectionA03, map, strOptString3, strA02, AbstractC2529Wr.A02(jSONObject, A01(20, 13, 89)));
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 119);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{78, 80, 97, 86, 99, 78, 97, 86, 92, 91, 76, 80, 92, 90, 90, 78, 91, 81, 45, 62, 53, 62, 51, 66, 73, SignedBytes.MAX_POWER_OF_TWO, 68, 53, 52, 47, 51, SignedBytes.MAX_POWER_OF_TWO, 61, 92, 80, 97, 90, 100, 95, 38, Ascii.RS, 45, Ascii.SUB, Ascii.GS, Ascii.SUB, 45, Ascii.SUB, Ascii.GS, Ascii.DLE, Ascii.FS, 32, Ascii.DLE, Ascii.RS, Ascii.US, 10, Ascii.DC4, Ascii.SI};
    }

    public C3109iG(String str, String str2, MJ mj, Collection<String> detectionStrings, Map<String, String> metadata, String str3, String str4, String str5) {
        this.A04 = str;
        this.A01 = str2;
        this.A00 = mj;
        this.A06 = detectionStrings;
        this.A07 = metadata;
        this.A05 = str3;
        this.A02 = str4;
        this.A03 = str5;
    }

    public final String A03() {
        return this.A01;
    }

    public final String A04() {
        return this.A04;
    }

    public final String A05() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.MK
    public final String A7G() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.MK
    public final Collection<String> A7h() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.core.MK
    public final MJ A8C() {
        return this.A00;
    }
}
