package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ea extends ed {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1940 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1943;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1944;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ed[] f1945;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1942 = {'l', 10168, 20425, 'S', 10117, 20450, 30634, '(', ')'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f1941 = -4899378648914581545L;

    public ea(String str, List<ed> list, dm dmVar) {
        super(dmVar);
        this.f1944 = dz.m6421(str);
        ed[] edVarArr = new ed[list.size()];
        this.f1945 = edVarArr;
        list.toArray(edVarArr);
    }

    public boolean equals(Object obj) {
        int i10 = f1940 + 109;
        f1943 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 51 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ea eaVar = (ea) obj;
        if (!this.f1944.equals(eaVar.f1944)) {
            return false;
        }
        boolean zEquals = Arrays.equals(this.f1945, eaVar.f1945);
        int i12 = f1940 + 35;
        f1943 = i12 % 128;
        if (i12 % 2 == 0) {
            return zEquals;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i10 = (f1943 + 17) % 128;
        f1940 = i10;
        String str = this.f1944;
        if (str != null) {
            f1943 = (i10 + 75) % 128;
            iHashCode = str.hashCode();
        } else {
            iHashCode = 0;
        }
        return (iHashCode * 31) + Arrays.hashCode(this.f1945);
    }

    public String toString() {
        f1940 = (f1943 + 29) % 128;
        String strMo6428 = mo6428(this.f1945);
        int i10 = f1940 + 75;
        f1943 = i10 % 128;
        if (i10 % 2 == 0) {
            return strMo6428;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    final ed[] m6426() {
        int i10 = f1943;
        ed[] edVarArr = this.f1945;
        f1940 = (i10 + 35) % 128;
        return edVarArr;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public dr mo6401(du duVar, cq cqVar) {
        f1943 = (f1940 + 75) % 128;
        List<Object> listM6425 = m6425(duVar, cqVar);
        if (!m6427().equals(m6424((Process.getThreadPriority(0) + 20) >> 6, (char) Gravity.getAbsoluteGravity(0, 0), 3 - View.resolveSize(0, 0)).intern())) {
            try {
                dr drVar = new dr(((ds) duVar.m6399(m6427())).m6385(duVar, cqVar, listM6425));
                f1940 = (f1943 + 89) % 128;
                return drVar;
            } catch (Exception unused) {
                if (cqVar.m5976().m6625(m6427()) != null) {
                    return cqVar.m5976().m6625(m6427()).m6385(duVar, cqVar, listM6425).m6380(false);
                }
                db dbVarM5970 = cqVar.m5970();
                String strM6427 = m6427();
                cqVar.m5972();
                return new dr(dbVarM5970.mo5833(cqVar, strM6427, listM6425, duVar));
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6424(3 - TextUtils.indexOf("", "", 0), (char) (KeyEvent.getMaxKeyCode() >> 16), 4 - KeyEvent.getDeadChar(0, 0)).intern());
        sb2.append(cqVar.m5971());
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(listM6425.get(0));
        k.m7098(string, sb3.toString());
        dr drVar2 = new dr(null);
        int i10 = f1940 + 53;
        f1943 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 93 / 0;
        }
        return drVar2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    final String m6427() {
        int i10 = (f1943 + 61) % 128;
        f1940 = i10;
        String str = this.f1944;
        int i11 = i10 + 117;
        f1943 = i11 % 128;
        if (i11 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    final List<Object> m6425(du duVar, cq cqVar) {
        ArrayList arrayList = new ArrayList();
        ed[] edVarArr = this.f1945;
        int length = edVarArr.length;
        f1940 = (f1943 + 73) % 128;
        int i10 = 0;
        while (i10 < length) {
            int i11 = f1943 + 67;
            f1940 = i11 % 128;
            if (i11 % 2 == 0) {
                arrayList.add(edVarArr[i10].m6434(duVar, cqVar).m6377());
                i10 += 50;
            } else {
                arrayList.add(edVarArr[i10].m6434(duVar, cqVar).m6377());
                i10++;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    String mo6428(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1944);
        sb2.append(m6424((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 7, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), -TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
        sb2.append(ed.m6432(objArr));
        sb2.append(m6424((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 7, (char) Color.green(0), 1 - (Process.myTid() >> 22)).intern());
        String string = sb2.toString();
        int i10 = f1943 + 25;
        f1940 = i10 % 128;
        if (i10 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6424(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1942[i10 + i12]) ^ (((long) i12) * f1941)) ^ ((long) c10));
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
}
