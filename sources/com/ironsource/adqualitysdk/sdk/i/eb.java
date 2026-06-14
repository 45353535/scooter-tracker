package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class eb extends ed {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1946 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1947;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f1948 = {-535433339, 1266774245, 742894333, 552658682, -675292885, -722953515, -1744068873, 150274977, -2049564166, 1760004588, -619762561, 876300521, 1359149155, -6322137, -65259615, -2124283863, 123822553, -1002492637};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map<String, ed> f1949;

    public eb(Map<String, ed> map, dm dmVar) {
        super(dmVar);
        this.f1949 = new HashMap();
        for (String str : map.keySet()) {
            this.f1949.put(dz.m6421(str), map.get(str));
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6429(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1948.clone();
                e.f1937 = 0;
                while (true) {
                    int i11 = e.f1937;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        e.f1939 = (c10 << 16) + c11;
                        e.f1938 = (c12 << 16) + c13;
                        e.m6423(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = e.f1939 ^ iArr2[i13];
                            e.f1939 = i14;
                            e.f1938 = e.m6422(i14) ^ e.f1938;
                            int i15 = e.f1939;
                            e.f1939 = e.f1938;
                            e.f1938 = i15;
                        }
                        int i16 = e.f1939;
                        e.f1939 = e.f1938;
                        e.f1938 = i16;
                        e.f1938 = i16 ^ iArr2[16];
                        e.f1939 ^= iArr2[17];
                        int i17 = e.f1937;
                        int i18 = e.f1939;
                        cArr[0] = (char) (i18 >>> 16);
                        cArr[1] = (char) i18;
                        int i19 = e.f1938;
                        cArr[2] = (char) (i19 >>> 16);
                        cArr[3] = (char) i19;
                        e.m6423(iArr2);
                        int i20 = e.f1937;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        e.f1937 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            f1946 = (f1947 + 95) % 128;
            return true;
        }
        if (obj != null) {
            f1946 = (f1947 + 11) % 128;
            if (eb.class == obj.getClass()) {
                Map<String, ed> map = this.f1949;
                Map<String, ed> map2 = ((eb) obj).f1949;
                if (map != null) {
                    boolean zEquals = map.equals(map2);
                    int i10 = f1947 + 123;
                    f1946 = i10 % 128;
                    if (i10 % 2 != 0) {
                        return zEquals;
                    }
                    throw null;
                }
                if (map2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = f1946;
        int i11 = i10 + 123;
        f1947 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        Map<String, ed> map = this.f1949;
        if (map != null) {
            return map.hashCode();
        }
        f1947 = (i10 + 7) % 128;
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6429(new int[]{-1888385502, -1857378714}, TextUtils.indexOf("", "", 0) + 1).intern());
        Iterator<String> it = this.f1949.keySet().iterator();
        boolean z10 = true;
        while (!(!it.hasNext())) {
            f1947 = (f1946 + 23) % 128;
            String next = it.next();
            if (!z10) {
                sb2.append(m6429(new int[]{886692583, -1828502837}, 2 - View.resolveSizeAndState(0, 0, 0)).intern());
                f1947 = (f1946 + 69) % 128;
            }
            sb2.append(m6429(new int[]{-1759312545, -1534420617}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
            sb2.append(next);
            sb2.append(m6429(new int[]{-36148881, 1205995355}, 5 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
            sb2.append(this.f1949.get(next));
            z10 = false;
        }
        sb2.append(m6429(new int[]{-255083789, 1747221786}, 1 - Color.alpha(0)).intern());
        return sb2.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6401(du duVar, cq cqVar) {
        JSONObject jSONObject = new JSONObject();
        for (String str : this.f1949.keySet()) {
            try {
                jSONObject.put(str, this.f1949.get(str).m6434(duVar, cqVar).m6377());
                f1947 = (f1946 + 35) % 128;
            } catch (JSONException e10) {
                String strM5971 = cqVar.m5971();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m6429(new int[]{92075390, -1860197559, -1766919719, -1754077459, 1403379453, -799474343, -499409809, -172455628, -1202287319, 1659874355, -1819237121, -28594077, 919069850, -1651626105}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 25).intern());
                sb2.append(m6435());
                co.m5911(strM5971, sb2.toString(), e10);
            }
        }
        dr drVar = new dr(jSONObject);
        f1947 = (f1946 + 1) % 128;
        return drVar;
    }
}
