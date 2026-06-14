package com.facebook.ads.redexgen.core;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.shadow.okio.Utf8;
import com.explorestack.protobuf.openrtb.LossReason;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7Q extends AbstractC3139im {
    public static byte[] A04;
    public static String[] A05 = {"b4EbQiKGBOPn48tIsiPL5n4N5SxNZ1EN", "C4qAvqPXqcx1", "av0PnThHX1ufh2ncI3f6iPLWfGZcgSDj", "l1hdtvJdt41N", "aFghpyqA523JYmrsO", "P4eeegJbz09MXnMZrJhy5IVHeFKKR7Ef", "fwPno9KqPJ0g1dx57vycq8IipA21WGGJ", "Ava7qu9S1KN"};
    public static final String A06;
    public C2519Wh A00;
    public final Uri A01;
    public final N3 A02;
    public final Map<String, String> A03;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 41);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final List<Intent> A06() {
        List<MM> listA05 = A05();
        ArrayList arrayList = new ArrayList();
        if (listA05 != null) {
            Iterator<MM> it = listA05.iterator();
            while (it.hasNext()) {
                Intent intentA00 = A00(it.next());
                if (intentA00 != null) {
                    arrayList.add(intentA00);
                }
            }
        }
        return arrayList;
    }

    public static void A07() {
        A04 = new byte[]{88, 111, 111, 114, 111, 61, 109, 124, 111, 110, 116, 115, 122, 61, 124, 109, 109, 110, 116, 105, 120, 66, 121, 124, 105, 124, 51, Ascii.DC4, Ascii.FS, Ascii.EM, Ascii.DLE, 17, 85, 1, Ascii.SUB, 85, Ascii.SUB, 5, Ascii.DLE, Ascii.ESC, 85, Ascii.CAN, Ascii.DC4, 7, Ascii.RS, Ascii.DLE, 1, 85, 0, 7, Ascii.EM, 79, 85, 51, 53, 8, 7, 13, Ascii.ESC, 6, 0, 13, Utf8.REPLACEMENT_BYTE, 48, 58, 44, 49, 55, 58, 112, 55, 48, 42, 59, 48, 42, 112, Utf8.REPLACEMENT_BYTE, 61, 42, 55, 49, 48, 112, Ascii.SUB, Ascii.ETB, Ascii.US, Ascii.DC2, 5, 10, 0, Ascii.SYN, Ascii.VT, 13, 0, 74, 13, 10, Ascii.DLE, 1, 10, Ascii.DLE, 74, 5, 7, Ascii.DLE, 13, Ascii.VT, 10, 74, 50, 45, 33, 51, 34, 51, 51, 48, 42, 55, 38, Ascii.FS, 39, 34, 55, 34, 65, 77, 94, 71, 73, 88, Ascii.SYN, 3, 3, 72, 73, 88, 77, 69, SignedBytes.MAX_POWER_OF_TWO, 95, 19, 69, 72, 17, 9, 95, Ascii.ESC, 4, 17, Ascii.SUB, 17, Ascii.DLE, 43, Ascii.DLE, 17, 17, 4, Ascii.CAN, Ascii.GS, Ascii.SUB, Ascii.US, 125, 98, 119, 124, 119, 118, 77, 97, 102, 125, 96, 119, 77, 116, 115, 126, 126, 112, 115, 113, 121, 77, 103, 96, 126, 123, 100, 113, 122, 113, 112, 75, 103, 96, 123, 102, 113, 75, 97, 102, 120, 100, 117, 102, 103, 125, 122, 115, 81, 86, 77, 80, 71, 125, 75, 70, 56, Utf8.REPLACEMENT_BYTE, 36, 57, 46, Ascii.DC4, 62, 57, 39, 81, 86, 77, 80, 71, 125, 87, 80, 78, 125, 85, 71, SignedBytes.MAX_POWER_OF_TWO, 125, 68, 67, 78, 78, SignedBytes.MAX_POWER_OF_TWO, 67, 65, 73, 59, 42, 35, 117, Ascii.ETB, 6, Ascii.SI, 19, 17, Ascii.FF, Ascii.SO, 19, Ascii.ETB, 89};
    }

    static {
        A07();
        A06 = C7Q.class.getSimpleName();
    }

    public C7Q(C2820dL c2820dL, US us, String str, Uri uri, Map<String, String> extraData, MO mo, boolean z10, N3 n32) {
        super(c2820dL, us, str, mo, z10);
        this.A01 = uri;
        this.A03 = extraData;
        this.A02 = n32;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r3.startsWith(r0) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.content.Intent A00(com.facebook.ads.redexgen.core.MM r12) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C7Q.A00(com.facebook.ads.redexgen.X.MM):android.content.Intent");
    }

    private Intent A01(MM mm) {
        Intent intent = new Intent(A04(88, 26, 77));
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(mm.A05()) && !TextUtils.isEmpty(mm.A04())) {
            intent.setComponent(new ComponentName(mm.A05(), mm.A04()));
        }
        if (!TextUtils.isEmpty(mm.A03())) {
            intent.setData(WQ.A00(mm.A03()));
        }
        return intent;
    }

    private final Uri A02() {
        String queryParameter = this.A01.getQueryParameter(A04(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 9, 98));
        if (!TextUtils.isEmpty(queryParameter)) {
            return WQ.A00(queryParameter);
        }
        Uri uri = this.A01;
        String storeUrl = A04(LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 8, 11);
        String storeId = uri.getQueryParameter(storeUrl);
        Locale locale = Locale.US;
        Object[] objArr = {storeId};
        String storeUrl2 = A04(126, 22, 5);
        return WQ.A00(String.format(locale, storeUrl2, objArr));
    }

    private ME A03() throws W9 {
        WN wn = new WN();
        try {
            return WN.A06(wn, ((MH) this).A01, A02(), ((MH) this).A03, this.A03);
        } catch (W9 unused) {
            String str = A04(26, 27, 92) + this.A01.toString();
            String queryParameter = this.A01.getQueryParameter(A04(228, 22, 11));
            if (queryParameter != null && queryParameter.length() > 0) {
                WN.A0E(wn, ((MH) this).A01, WQ.A00(queryParameter), ((MH) this).A03);
            }
            return ME.A09;
        }
    }

    private List<MM> A05() {
        String queryParameter = this.A01.getQueryParameter(A04(114, 12, 106));
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        String appsiteDataString = A04(53, 2, 65);
        if (appsiteDataString.equals(queryParameter)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(queryParameter);
            String appsiteDataString2 = A04(55, 7, 64);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(appsiteDataString2);
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    MM mmA00 = MM.A00(jSONArrayOptJSONArray.optJSONObject(i10));
                    if (mmA00 != null) {
                        arrayList.add(mmA00);
                    }
                }
            }
        } catch (JSONException e10) {
            InterfaceC2432Su interfaceC2432SuA08 = ((MH) this).A01.A08();
            int i11 = AbstractC2433Sv.A24;
            C2434Sw c2434Sw = new C2434Sw(e10);
            String appsiteDataString3 = A04(204, 7, 61);
            interfaceC2432SuA08.AAy(appsiteDataString3, i11, c2434Sw);
            String str = A06;
            String appsiteDataString4 = A04(0, 26, 52);
            Log.w(str, appsiteDataString4, e10);
        }
        return arrayList;
    }

    private boolean A08() {
        List<Intent> appLaunchIntents = A06();
        if (appLaunchIntents == null) {
            return false;
        }
        Iterator<Intent> it = appLaunchIntents.iterator();
        while (it.hasNext()) {
            if (WB.A0D(((MH) this).A01, it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A09(C2820dL c2820dL, String str) {
        return Build.VERSION.SDK_INT >= 30 && str != null && U7.A23(c2820dL);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3139im
    public final ME A0H() {
        ME meA0M = ME.A09;
        if (((AbstractC3139im) this).A03) {
            meA0M = A0M();
        } else {
            this.A03.put(A04(188, 16, 61), String.valueOf(true));
        }
        Map<String, String> map = this.A03;
        if (A05[2].charAt(5) != 'T') {
            throw new RuntimeException();
        }
        A05[4] = "kOq5WVrOOgnK8qBpA";
        A0J(map, meA0M);
        N3.A06(this.A02, ((MH) this).A01);
        return meA0M;
    }

    public final ME A0M() {
        ME meA03 = ME.A09;
        String strA04 = A04(148, 15, 93);
        boolean zA0K = A0K(this.A01);
        if (!zA0K) {
            zA0K = A08();
        }
        if (!zA0K) {
            try {
                meA03 = A03();
                if (meA03 != ME.A09) {
                    strA04 = A04(188, 16, 61);
                } else {
                    strA04 = A04(163, 25, 59);
                }
            } catch (Exception unused) {
                meA03 = ME.A04;
            }
        }
        Map<String, String> map = this.A03;
        String redirectionAction = String.valueOf(true);
        map.put(strA04, redirectionAction);
        return meA03;
    }

    public final void A0N(C2519Wh c2519Wh) {
        this.A00 = c2519Wh;
    }
}
