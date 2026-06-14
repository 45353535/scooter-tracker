package com.ironsource.adqualitysdk.sdk.i;

import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.bd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp.maio.sdk.android.MaioAds;
import jp.maio.sdk.android.MaioAdsListenerInterface;

/* JADX INFO: loaded from: classes10.dex */
public final class bu extends bd {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1065 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1066 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1067 = -494605247435270810L;

    public bu(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m5451(MaioAdsListenerInterface maioAdsListenerInterface) {
        int i10 = f1066 + 119;
        f1065 = i10 % 128;
        int i11 = i10 % 2;
        m5452(maioAdsListenerInterface);
        if (i11 != 0) {
            throw null;
        }
        int i12 = f1065 + 21;
        f1066 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 74 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m5452(MaioAdsListenerInterface maioAdsListenerInterface) {
        int i10 = f1066 + 5;
        f1065 = i10 % 128;
        int i11 = i10 % 2;
        MaioAds.setMaioAdsListener(maioAdsListenerInterface);
        if (i11 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    final Map<String, bd.b> mo5024() {
        HashMap map = new HashMap();
        map.put(m5450("锕\ued50斴\ufdd2瑋첐䓻\udf62垚꿾☔뺞㛱褥Ɖ駕ဳ梗", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 30803).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo5027(List<Object> list, ch chVar) {
                bu.m5451((MaioAdsListenerInterface) list.get(0));
                return null;
            }
        });
        f1066 = (f1065 + 111) % 128;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo5025() {
        f1065 = (f1066 + 27) % 128;
        String sdkVersion = MaioAds.getSdkVersion();
        f1066 = (f1065 + 101) % 128;
        return sdkVersion;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Class mo5026(java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bu.mo5026(java.lang.String):java.lang.Class");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5450(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2043) {
            try {
                f.f2041 = i10;
                char[] cArr2 = new char[cArr.length];
                f.f2042 = 0;
                while (true) {
                    int i11 = f.f2042;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2041 * i11))) ^ f1067);
                        f.f2042++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
