package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.jz;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ds {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static boolean f1868 = true;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1869 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1870 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f1871 = true;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1872 = 49;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1873 = {146, 163, 152, 164, 147, 160, 149, 170, 'v', 'Q', 161, 154, 159, 158, 150, 165, 153, '~', 166, 157, 169, 148, 167};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String[] f1874;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private fr f1875;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1876;

    public ds(String str, String str2, JSONObject jSONObject) {
        this.f1876 = dz.m6421(str2);
        List listM7093 = jz.m7093(jSONObject.optJSONArray(m6384(null, Color.green(0) + 127, null, "\u0084\u0083\u0082\u0081").intern()), new jz.b<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.ds.4
            @Override // com.ironsource.adqualitysdk.sdk.i.jz.b
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ String mo4838(JSONArray jSONArray, int i10) {
                return dz.m6421(jSONArray.optString(i10));
            }
        });
        String[] strArr = new String[listM7093.size()];
        this.f1874 = strArr;
        listM7093.toArray(strArr);
        try {
            this.f1875 = new dq(str, str2).m6366(dt.m6387(str, str2, jSONObject.optString(m6384(null, 127 - TextUtils.getTrimmedLength(""), null, "\u0088\u0087\u0086\u0085").intern())));
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6384(null, (ViewConfiguration.getTapTimeout() >> 16) + 127, null, "\u008a\u0087\u0086\u0091\u0090\u008f\u008e\u008a\u0083\u008d\u008c\u0084\u0082\u0081\u008b\u008a\u0082\u0086\u0082\u0082\u0089").intern());
            sb2.append(this.f1876);
            co.m5911(str, sb2.toString(), th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007b, code lost:
    
        if ((r6 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007d, code lost:
    
        r6 = 59 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0080, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        r6 = new java.util.HashMap();
        com.ironsource.adqualitysdk.sdk.i.ds.f1869 = (com.ironsource.adqualitysdk.sdk.i.ds.f1870 + 43) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0092, code lost:
    
        if (r1 >= r7.size()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.ds.f1869 + 55;
        com.ironsource.adqualitysdk.sdk.i.ds.f1870 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
    
        if ((r0 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
    
        r6.put(r8.get(r1), r7.get(r1));
        r1 = r1 + 47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ae, code lost:
    
        r6.put(r8.get(r1), r7.get(r1));
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r7.size() != r8.size()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r7.size() != r8.size()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r6 = r6.m5971();
        r0 = new java.lang.StringBuilder();
        r0.append(r5.f1876);
        r0.append(m6384(null, 127 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), null, "\u008a\u0087\u008f\u0090\u0096\u008f\u008b\u0095\u008f\u008a\u0087\u0086\u0091\u0090\u008f\u008e\u008a").intern());
        r0.append(r8.size());
        r0.append(m6384(null, 127 - android.view.View.resolveSizeAndState(0, 0, 0), null, "\u008a\u0087\u008f\u0097\u008c\u008f\u0096\u008f\u0082\u008a\u0090\u0093\u0085\u008a\u0084\u0090\u008d\u008f\u008e\u0093\u0083\u0082\u0081\u008a").intern());
        r0.append(r7.size());
        com.ironsource.adqualitysdk.sdk.i.co.m5911(r6, r0.toString(), null);
        r6 = com.ironsource.adqualitysdk.sdk.i.ds.f1869 + 47;
        com.ironsource.adqualitysdk.sdk.i.ds.f1870 = r6 % 128;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Map<java.lang.String, java.lang.Object> m6383(com.ironsource.adqualitysdk.sdk.i.cq r6, java.util.List<java.lang.Object> r7, java.util.List<java.lang.String> r8) {
        /*
            r5 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ds.f1870
            int r0 = r0 + 45
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ds.f1869 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L1b
            int r0 = r7.size()
            int r2 = r8.size()
            r3 = 84
            int r3 = r3 / r1
            if (r0 == r2) goto L81
            goto L25
        L1b:
            int r0 = r7.size()
            int r2 = r8.size()
            if (r0 == r2) goto L81
        L25:
            java.lang.String r6 = r6.m5971()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r5.f1876
            r0.append(r2)
            int r2 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r2 = r2 >> 16
            int r2 = 127 - r2
            java.lang.String r3 = "\u008a\u0087\u008f\u0090\u0096\u008f\u008b\u0095\u008f\u008a\u0087\u0086\u0091\u0090\u008f\u008e\u008a"
            r4 = 0
            java.lang.String r2 = m6384(r4, r2, r4, r3)
            java.lang.String r2 = r2.intern()
            r0.append(r2)
            int r8 = r8.size()
            r0.append(r8)
            int r8 = android.view.View.resolveSizeAndState(r1, r1, r1)
            int r8 = 127 - r8
            java.lang.String r2 = "\u008a\u0087\u008f\u0097\u008c\u008f\u0096\u008f\u0082\u008a\u0090\u0093\u0085\u008a\u0084\u0090\u008d\u008f\u008e\u0093\u0083\u0082\u0081\u008a"
            java.lang.String r8 = m6384(r4, r8, r4, r2)
            java.lang.String r8 = r8.intern()
            r0.append(r8)
            int r7 = r7.size()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.ironsource.adqualitysdk.sdk.i.co.m5911(r6, r7, r4)
            int r6 = com.ironsource.adqualitysdk.sdk.i.ds.f1869
            int r6 = r6 + 47
            int r7 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.ds.f1870 = r7
            int r6 = r6 % 2
            if (r6 != 0) goto L80
            r6 = 59
            int r6 = r6 / r1
        L80:
            return r4
        L81:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            int r0 = com.ironsource.adqualitysdk.sdk.i.ds.f1870
            int r0 = r0 + 43
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ds.f1869 = r0
        L8e:
            int r0 = r7.size()
            if (r1 >= r0) goto Lbc
            int r0 = com.ironsource.adqualitysdk.sdk.i.ds.f1869
            int r0 = r0 + 55
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ds.f1870 = r2
            int r0 = r0 % 2
            if (r0 != 0) goto Lae
            java.lang.Object r0 = r8.get(r1)
            java.lang.Object r2 = r7.get(r1)
            r6.put(r0, r2)
            int r1 = r1 + 47
            goto L8e
        Lae:
            java.lang.Object r0 = r8.get(r1)
            java.lang.Object r2 = r7.get(r1)
            r6.put(r0, r2)
            int r1 = r1 + 1
            goto L8e
        Lbc:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ds.m6383(com.ironsource.adqualitysdk.sdk.i.cq, java.util.List, java.util.List):java.util.Map");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6384(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f3012) {
            try {
                char[] cArr2 = f1873;
                int i11 = f1872;
                if (f1868) {
                    int length = bArr.length;
                    m.f3014 = length;
                    char[] cArr3 = new char[length];
                    m.f3013 = 0;
                    while (m.f3013 < m.f3014) {
                        int i12 = m.f3013;
                        int i13 = m.f3014 - 1;
                        int i14 = m.f3013;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        m.f3013 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f1871) {
                    int length2 = cArr.length;
                    m.f3014 = length2;
                    char[] cArr4 = new char[length2];
                    m.f3013 = 0;
                    while (m.f3013 < m.f3014) {
                        int i15 = m.f3013;
                        int i16 = m.f3014 - 1;
                        int i17 = m.f3013;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        m.f3013 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                m.f3014 = length3;
                char[] cArr5 = new char[length3];
                m.f3013 = 0;
                while (m.f3013 < m.f3014) {
                    int i18 = m.f3013;
                    int i19 = m.f3014 - 1;
                    int i20 = m.f3013;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    m.f3013 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final dr m6385(du duVar, cq cqVar, List<Object> list) {
        du duVar2 = new du(m6383(cqVar, list, Arrays.asList(this.f1874)), duVar.m6398());
        fr frVar = this.f1875;
        if (frVar != null) {
            f1869 = (f1870 + 117) % 128;
            dr drVarMo6475 = frVar.mo6475(duVar2, cqVar);
            int i10 = f1869 + 109;
            f1870 = i10 % 128;
            if (i10 % 2 != 0) {
                return drVarMo6475;
            }
            throw null;
        }
        String strM5971 = cqVar.m5971();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6384(null, 127 - TextUtils.indexOf("", "", 0), null, "\u008a\u0087\u0086\u0091\u0090\u008f\u0092").intern());
        sb2.append(this.f1876);
        sb2.append(m6384(null, 127 - Color.argb(0, 0, 0, 0), null, "\u0088\u0087\u0086\u0085\u008a\u0094\u0094\u0093\u008d\u008a\u0084\u0081\u0091\u008a").intern());
        co.m5911(strM5971, sb2.toString(), null);
        return null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m6386() {
        int i10 = f1870;
        String str = this.f1876;
        f1869 = (i10 + 41) % 128;
        return str;
    }
}
