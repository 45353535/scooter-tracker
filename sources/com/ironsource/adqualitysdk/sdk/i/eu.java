package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes10.dex */
public final class eu extends eo {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2023 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2024 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2025 = 76;

    public eu(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6462(String str, int i10, boolean z10, int i11, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f2025);
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
        int i10 = f2024 + 87;
        f2023 = i10 % 128;
        String strIntern = (i10 % 2 == 0 ? m6462("\u0000", 1 >>> (ViewConfiguration.getEdgeSlop() * 78), true, Drawable.resolveOpacity(1, 1), 8695 >> TextUtils.indexOf((CharSequence) "", 'T', 1, 1)) : m6462("\u0000", (ViewConfiguration.getEdgeSlop() >> 16) + 1, true, Drawable.resolveOpacity(0, 0) + 1, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE)).intern();
        f2024 = (f2023 + 117) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾇ */
    final boolean mo6452(int i10) {
        int i11 = f2024;
        f2023 = (i11 + 9) % 128;
        if (i10 >= 0) {
            return false;
        }
        f2023 = (i11 + 33) % 128;
        return true;
    }
}
