package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.ViewConfiguration;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class jb {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2738 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int[] f2739 = {433625881, 1637479217, -1985095493, 628328357, -967363710, 5720099, -473771358, -45404727, 1877659770, -792096389, -1196455218, 2100725071, 1780420405, -722162633, -1210916506, 1242792997, 1385166394, 180941739};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2740 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private JSONObject f2741;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f2742;

    jb(JSONObject jSONObject) {
        this(jSONObject, UUID.randomUUID().toString());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m6884() {
        int i10 = f2740;
        String str = this.f2742;
        int i11 = i10 + 51;
        f2738 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 9 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m6885() {
        int i10 = f2740 + 25;
        f2738 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f2741;
        }
        int i11 = 43 / 0;
        return this.f2741;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m6886() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(m6883(new int[]{-2126419468, -1149986458, 653468025, 1867341968}, 8 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), this.f2741);
        jSONObject.put(m6883(new int[]{340223049, -1873379722}, (ViewConfiguration.getTouchSlop() >> 8) + 4).intern(), this.f2742);
        f2738 = (f2740 + 67) % 128;
        return jSONObject;
    }

    jb(JSONObject jSONObject, String str) {
        this.f2741 = jSONObject;
        this.f2742 = str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6883(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2739.clone();
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
}
