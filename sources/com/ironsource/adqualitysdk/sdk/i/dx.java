package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class dx extends ed {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1911 = 108;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1912 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1913 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ed[] f1914;

    public dx(List<ed> list, dm dmVar) {
        super(dmVar);
        ed[] edVarArr = new ed[list.size()];
        this.f1914 = edVarArr;
        list.toArray(edVarArr);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6404(String str, int i10, boolean z10, int i11, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f1911);
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

    public final boolean equals(Object obj) {
        int i10 = f1913;
        f1912 = (i10 + 45) % 128;
        if (this != obj) {
            if (obj == null || dx.class != obj.getClass()) {
                return false;
            }
            return Arrays.equals(this.f1914, ((dx) obj).f1914);
        }
        int i11 = i10 + 119;
        f1912 = i11 % 128;
        if (i11 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public final int hashCode() {
        int i10 = f1913 + 71;
        f1912 = i10 % 128;
        if (i10 % 2 != 0) {
            Arrays.hashCode(this.f1914);
            throw null;
        }
        int iHashCode = Arrays.hashCode(this.f1914);
        f1912 = (f1913 + 71) % 128;
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6404("\u0000", 1 - KeyEvent.keyCodeFromString(""), false, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 200).intern());
        sb2.append(ed.m6432(this.f1914));
        sb2.append(m6404("\u0000", 1 - Color.alpha(0), true, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, MotionEvent.axisFromString("") + 202).intern());
        String string = sb2.toString();
        f1913 = (f1912 + 35) % 128;
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6401(du duVar, cq cqVar) {
        ArrayList arrayList = new ArrayList();
        ed[] edVarArr = this.f1914;
        int length = edVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = f1913 + 97;
            f1912 = i11 % 128;
            if (i11 % 2 != 0) {
                arrayList.add(edVarArr[i10].m6434(duVar, cqVar).m6377());
                i10 += 82;
            } else {
                arrayList.add(edVarArr[i10].m6434(duVar, cqVar).m6377());
                i10++;
            }
        }
        dr drVar = new dr(arrayList);
        int i12 = f1912 + 101;
        f1913 = i12 % 128;
        if (i12 % 2 != 0) {
            return drVar;
        }
        throw null;
    }
}
