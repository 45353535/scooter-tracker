package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.Cif;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class ib {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f2473;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ig f2474;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Cif f2475;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Context f2476;

    public ib(Context context, String str, String str2) {
        this.f2476 = context.getApplicationContext();
        this.f2473 = str2;
        this.f2474 = new ig(this.f2476, str);
        this.f2475 = new Cif(id.f2477, this.f2476.getPackageName(), ik.m6794(this.f2476), this.f2473);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m6745(String str) {
        try {
            this.f2474.m6771(str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final HashMap<String, String> m6747(String str, int i10) {
        try {
            HashMap<String, String> mapM6769 = this.f2474.m6769(str, i10);
            HashMap<String, String> map = new HashMap<>();
            for (String str2 : mapM6769.keySet()) {
                String str3 = mapM6769.get(str2);
                if (str3 != null && !TextUtils.isEmpty(str3)) {
                    try {
                        map.put(str2, this.f2475.m6765(str3));
                    } catch (Cif.e unused) {
                    }
                }
            }
            return map;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m6748(String str) {
        try {
            return this.f2474.m6768(str);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m6749(String str, String str2) {
        try {
            this.f2474.m6770(str, this.f2475.m6764(str2));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m6746(String str) {
        try {
            String strM6772 = this.f2474.m6772(str);
            if (strM6772 == null || TextUtils.isEmpty(strM6772)) {
                return strM6772;
            }
            try {
                return this.f2475.m6765(strM6772);
            } catch (Cif.e unused) {
                return "";
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
