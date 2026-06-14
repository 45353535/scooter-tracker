package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes10.dex */
public final class em extends eg {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2000 = 181;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2001 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2002;

    public em(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6455(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f730) {
            try {
                char[] cArr2 = new char[i10];
                b.f728 = 0;
                while (true) {
                    int i13 = b.f728;
                    if (i13 >= i10) {
                        break;
                    }
                    b.f729 = cArr[i13];
                    cArr2[b.f728] = (char) (b.f729 + i12);
                    int i14 = b.f728;
                    cArr2[i14] = (char) (cArr2[i14] - f2000);
                    b.f728 = i14 + 1;
                }
                if (i11 > 0) {
                    b.f731 = i11;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = b.f731;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = b.f731;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    b.f728 = 0;
                    while (true) {
                        int i17 = b.f728;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        b.f728 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo6443() {
        int i10 = f2001 + 57;
        f2002 = i10 % 128;
        String strIntern = (i10 % 2 != 0 ? m6455("\u0000\u0000", (ViewConfiguration.getScrollBarFadeDuration() >>> 44) + 4, false, 1 >> View.getDefaultSize(1, 0), 5094 / (ViewConfiguration.getMaximumFlingVelocity() * 16)) : m6455("\u0000\u0000", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2, true, View.getDefaultSize(0, 0) + 1, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE)).intern();
        int i11 = f2002 + 35;
        f2001 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 80 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6401(du duVar, cq cqVar) {
        return new dr(Boolean.valueOf(m6444().m6434(duVar, cqVar).m6379() && m6445().m6434(duVar, cqVar).m6379()));
    }
}
