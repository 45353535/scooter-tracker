package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ee extends ea {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1960 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1961 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1962 = -7159607425052080275L;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ed f1963;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ed[] f1964;

    public ee(ed edVar, String str, List<ed> list, List<ed> list2, dm dmVar) {
        super(str, list2, dmVar);
        this.f1963 = edVar;
        if (list != null) {
            ed[] edVarArr = new ed[list.size()];
            this.f1964 = edVarArr;
            list.toArray(edVarArr);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List<Class> m6436(ed[] edVarArr, du duVar, cq cqVar) {
        ArrayList arrayList = new ArrayList();
        for (ed edVar : edVarArr) {
            f1960 = (f1961 + 17) % 128;
            arrayList.add((Class) edVar.m6434(duVar, cqVar).m6377());
        }
        f1961 = (f1960 + 5) % 128;
        return arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ea
    public final boolean equals(Object obj) {
        if (this == obj) {
            f1961 = (f1960 + 65) % 128;
            return true;
        }
        if (obj == null || ee.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        ee eeVar = (ee) obj;
        ed edVar = this.f1963;
        if (edVar == null ? eeVar.f1963 != null : !edVar.equals(eeVar.f1963)) {
            return false;
        }
        ed[] edVarArr = this.f1964;
        if (edVarArr == null) {
            if (eeVar.f1964 == null) {
                f1961 = (f1960 + 13) % 128;
                return true;
            }
            return false;
        }
        int i10 = f1961 + 81;
        f1960 = i10 % 128;
        int i11 = i10 % 2;
        ed[] edVarArr2 = eeVar.f1964;
        if (i11 != 0) {
            return edVarArr.equals(edVarArr2);
        }
        edVarArr.equals(edVarArr2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[PHI: r0
  0x0031: PHI (r0v10 int) = (r0v4 int), (r0v12 int) binds: [B:8:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r0
  0x0022: PHI (r0v5 int) = (r0v4 int), (r0v12 int) binds: [B:8:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ironsource.adqualitysdk.sdk.i.ea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int hashCode() {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ee.f1961
            int r0 = r0 + 125
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ee.f1960 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L18
            int r0 = super.hashCode()
            int r0 = r0 / 85
            com.ironsource.adqualitysdk.sdk.i.ed r2 = r4.f1963
            if (r2 == 0) goto L31
            goto L22
        L18:
            int r0 = super.hashCode()
            int r0 = r0 * 31
            com.ironsource.adqualitysdk.sdk.i.ed r2 = r4.f1963
            if (r2 == 0) goto L31
        L22:
            com.ironsource.adqualitysdk.sdk.i.ed r2 = r4.f1963
            int r2 = r2.hashCode()
            int r3 = com.ironsource.adqualitysdk.sdk.i.ee.f1960
            int r3 = r3 + 59
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.ee.f1961 = r3
            goto L3a
        L31:
            int r2 = com.ironsource.adqualitysdk.sdk.i.ee.f1960
            int r2 = r2 + 103
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.ee.f1961 = r2
            r2 = r1
        L3a:
            int r0 = r0 + r2
            int r0 = r0 * 31
            com.ironsource.adqualitysdk.sdk.i.ed[] r2 = r4.f1964
            if (r2 == 0) goto L4e
            int r1 = r2.hashCode()
            int r2 = com.ironsource.adqualitysdk.sdk.i.ee.f1961
            int r2 = r2 + 77
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.ee.f1960 = r2
            goto L56
        L4e:
            int r2 = com.ironsource.adqualitysdk.sdk.i.ee.f1960
            int r2 = r2 + 45
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.ee.f1961 = r2
        L56:
            int r0 = r0 + r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ee.hashCode():int");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ea
    public final String toString() {
        f1961 = (f1960 + 89) % 128;
        String strMo6428 = mo6428(m6426());
        int i10 = f1961 + 47;
        f1960 = i10 % 128;
        if (i10 % 2 != 0) {
            return strMo6428;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ea, com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6401(du duVar, cq cqVar) {
        Method methodM7131;
        List<Object> listM6425 = m6425(duVar, cqVar);
        ed edVar = this.f1963;
        if ((edVar instanceof ek) && ((ek) edVar).m6451().equals(m6438("蜞ï裳ჭ飃", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 34807).intern())) {
            return cqVar.m5976().m6624().m6625(m6427()).m6385(duVar, cqVar, listM6425).m6380(false);
        }
        Object objM6377 = this.f1963.m6434(duVar, cqVar).m6377();
        if (objM6377 instanceof cl) {
            return new dr(((cl) objM6377).mo5100(m6427(), listM6425, cqVar.m5972()));
        }
        if (objM6377 instanceof ci) {
            String strM6427 = m6427();
            cqVar.m5972();
            return new dr(((ci) objM6377).mo5833(cqVar, strM6427, listM6425, duVar));
        }
        if (objM6377 instanceof cq) {
            synchronized (objM6377) {
                try {
                    cq cqVar2 = (cq) objM6377;
                    ds dsVarM5975 = cqVar2.m5975(m6427());
                    if (dsVarM5975 != null) {
                        return dsVarM5975.m6385(cqVar2.m5973(), cqVar2, listM6425).m6380(false);
                    }
                    String strM5971 = cqVar.m5971();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m6438("蜨鯬뻹퇛\uf4d3៲⪺䶰悐莅Ꙧ륨\udc60ｔቀ㕰䠰欫踏ꄌ엾\ud8e6ﮯ", 7411 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
                    sb2.append(m6427());
                    co.m5911(strM5971, sb2.toString(), new NoSuchMethodException());
                } finally {
                }
            }
        }
        try {
            ed[] edVarArr = this.f1964;
            if (edVarArr != null) {
                methodM7131 = kb.m7138(objM6377, m6427(), m6436(edVarArr, duVar, cqVar));
            } else {
                methodM7131 = kb.m7131(objM6377, m6427(), listM6425);
            }
            if (methodM7131 != null) {
                return new dr(methodM7131.invoke(objM6377, listM6425.toArray()));
            }
            listM6425.add(0, objM6377);
            db dbVarM5970 = cqVar.m5970();
            String strM64272 = m6427();
            cqVar.m5972();
            return new dr(dbVarM5970.mo5833(cqVar, strM64272, listM6425, duVar));
        } catch (IllegalAccessException e10) {
            String strM59712 = cqVar.m5971();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m6438("蜨鯬뻹퇛\uf4d3៲⪺䶰悐莅Ꙧ륨\udc60ｔቀ㕰䠰欫踏ꄌ엾\ud8e6ﮯ", TextUtils.lastIndexOf("", '0') + 7412).intern());
            sb3.append(this);
            co.m5911(strM59712, sb3.toString(), e10);
            return null;
        } catch (IllegalArgumentException e11) {
            String strM59713 = cqVar.m5971();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m6438("蜨鯬뻹퇛\uf4d3៲⪺䶰悐莅Ꙧ륨\udc60ｔቀ㕰䠰欫踏ꄌ엾\ud8e6ﮯ", 7412 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern());
            sb4.append(this);
            co.m5911(strM59713, sb4.toString(), e11);
            return null;
        } catch (Exception e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ea
    /* JADX INFO: renamed from: ﾇ */
    final String mo6428(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1963);
        sb2.append(m6438("蝃", 26459 - (Process.myPid() >> 22)).intern());
        sb2.append(m6427());
        sb2.append(m6437());
        sb2.append(m6438("蝅", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 32321).intern());
        sb2.append(ed.m6432(objArr));
        sb2.append(m6438("蝄", (-16727225) - Color.rgb(0, 0, 0)).intern());
        String string = sb2.toString();
        f1960 = (f1961 + 49) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m6437() {
        int i10 = f1960 + 11;
        f1961 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (this.f1964 == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6438("蝑", TextUtils.getOffsetBefore("", 0) + 63179).intern());
        sb2.append(ed.m6432(this.f1964));
        sb2.append(m6438("蝓", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 30808).intern());
        String string = sb2.toString();
        int i11 = f1961 + 121;
        f1960 = i11 % 128;
        if (i11 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6438(String str, int i10) {
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
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2041 * i11))) ^ f1962);
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
