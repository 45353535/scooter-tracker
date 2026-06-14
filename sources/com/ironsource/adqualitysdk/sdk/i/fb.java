package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes10.dex */
public final class fb extends ed {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2050 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2053 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ed f2054;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2052 = {61316};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2051 = 6127450403300908907L;

    public fb(ed edVar, dm dmVar) {
        super(dmVar);
        this.f2054 = edVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6468(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2052[i10 + i12]) ^ (((long) i12) * f2051)) ^ ((long) c10));
                        d.f1676 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6468(KeyEvent.normalizeMetaState(0), (char) (TextUtils.getOffsetBefore("", 0) + 61349), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
        sb2.append(this.f2054);
        String string = sb2.toString();
        int i10 = f2050 + 33;
        f2053 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 36 / 0;
        }
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6401(du duVar, cq cqVar) {
        return new dr(Boolean.valueOf(!this.f2054.m6434(duVar, cqVar).m6379()));
    }
}
