package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.primitives.UnsignedBytes;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class jz {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2955 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2956 = {261, 270, 266, 265, 272, 303, 292, 295, 302, 256, 301, 298, 219, 305, 284, 287, 297, 290, 293, 233, 227, 304, 286, 288, 228, 307, 308, 271, 291};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2957 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2958 = 187;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2959 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2960 = true;

    public interface b<T> {
        /* JADX INFO: renamed from: ﾒ */
        T mo4838(JSONArray jSONArray, int i10);
    }

    public interface c<T> {
        /* JADX INFO: renamed from: ﻛ */
        T mo4837(JSONObject jSONObject, String str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m7081(JSONObject jSONObject, JSONObject jSONObject2, boolean z10) {
        int i10 = f2955 + 125;
        int i11 = i10 % 128;
        f2957 = i11;
        if (i10 % 2 != 0) {
            int i12 = 89 / 0;
            if (jSONObject == null) {
                return;
            }
        } else if (jSONObject == null) {
            return;
        }
        int i13 = i11 + 71;
        f2955 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 54 / 0;
            if (jSONObject2 == null) {
                return;
            }
        } else if (jSONObject2 == null) {
            return;
        }
        int i15 = i11 + 81;
        f2955 = i15 % 128;
        if (i15 % 2 == 0) {
            jSONObject2.keys();
            throw null;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                jSONObject.put(next, jSONObject2.opt(next));
            } catch (JSONException unused) {
            }
        }
        if (z10) {
            f2955 = (f2957 + 125) % 128;
            jSONObject.remove(ih.f2559);
            f2955 = (f2957 + 101) % 128;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static JSONObject m7082(JSONObject jSONObject) {
        int i10 = f2955 + 97;
        f2957 = i10 % 128;
        int i11 = i10 % 2;
        return m7094(jSONObject, false);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m7086(JSONObject jSONObject, int i10, List<String> list) {
        int i11 = f2955 + 33;
        f2957 = i11 % 128;
        try {
            if (i11 % 2 != 0) {
                jSONObject.names();
                throw null;
            }
            JSONArray jSONArrayNames = jSONObject.names();
            if (jSONArrayNames != null) {
                f2957 = (f2955 + 121) % 128;
                for (int i12 = 0; i12 < jSONArrayNames.length(); i12++) {
                    f2957 = (f2955 + 119) % 128;
                    String strOptString = jSONArrayNames.optString(i12);
                    if (list != null) {
                        f2957 = (f2955 + 69) % 128;
                        if (!list.contains(strOptString)) {
                            m7092(jSONObject, strOptString, i10);
                        }
                    } else {
                        m7092(jSONObject, strOptString, i10);
                    }
                }
            }
        } catch (JSONException e10) {
            k.m7118(m7087((String) null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (int[]) null, "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m7087((String) null, 126 - Process.getGidForName(""), (int[]) null, "\u0091\u008c\u0089\u0093\u008d\u0092\u0091\u0087\u0086\u008f\u0090\u0087\u0088\u008f\u008e\u008d\u008b\u008c\u008b\u008b\u008a").intern(), e10);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static <T> List<T> m7088(JSONArray jSONArray) {
        List<T> listM7093 = m7093(jSONArray, new b<T>() { // from class: com.ironsource.adqualitysdk.sdk.i.jz.1
            @Override // com.ironsource.adqualitysdk.sdk.i.jz.b
            /* JADX INFO: renamed from: ﾒ */
            public final T mo4838(JSONArray jSONArray2, int i10) {
                return (T) jSONArray2.opt(i10);
            }
        });
        int i10 = f2957 + 113;
        f2955 = i10 % 128;
        if (i10 % 2 != 0) {
            return listM7093;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m7094(JSONObject jSONObject, boolean z10) {
        int i10 = f2957 + 47;
        f2955 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (!z10) {
                    return jSONObject2;
                }
                int i11 = f2957 + 41;
                f2955 = i11 % 128;
                if (i11 % 2 != 0) {
                    jSONObject2.remove(ih.f2559);
                    return jSONObject2;
                }
                jSONObject2.remove(ih.f2559);
                throw null;
            } catch (JSONException unused) {
            }
        }
        return new JSONObject();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m7083(JSONObject jSONObject, JSONObject jSONObject2) {
        f2957 = (f2955 + 3) % 128;
        m7081(jSONObject, jSONObject2, false);
        int i10 = f2957 + 105;
        f2955 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 83 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<String> m7089(JSONObject jSONObject, String str, List<String> list) {
        f2955 = (f2957 + 71) % 128;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            return m7078(jSONArrayOptJSONArray);
        }
        int i10 = f2955 + 39;
        f2957 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 55 / 0;
        }
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m7092(org.json.JSONObject r3, java.lang.String r4, int r5) throws org.json.JSONException {
        /*
            java.lang.Object r0 = r3.opt(r4)
            java.lang.String r5 = m7084(r0, r5)
            r0 = 0
            if (r5 == 0) goto L38
            int r1 = com.ironsource.adqualitysdk.sdk.i.jz.f2957
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f2955 = r2
            int r1 = r1 % 2
            java.lang.String r2 = ""
            if (r1 != 0) goto L26
            boolean r1 = r5.equals(r2)
            r2 = 25
            int r2 = r2 / 0
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L35
            goto L2c
        L26:
            boolean r1 = r5.equals(r2)
            if (r1 == 0) goto L35
        L2c:
            int r5 = com.ironsource.adqualitysdk.sdk.i.jz.f2957
            int r5 = r5 + 19
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f2955 = r5
            r5 = r0
        L35:
            r3.put(r4, r5)
        L38:
            int r3 = com.ironsource.adqualitysdk.sdk.i.jz.f2957
            int r3 = r3 + 63
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f2955 = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L45
            return
        L45:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jz.m7092(org.json.JSONObject, java.lang.String, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[PHI: r3
  0x002a: PHI (r3v5 T) = (r3v4 T), (r3v6 T) binds: [B:12:0x0028, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> java.util.List<T> m7093(org.json.JSONArray r5, com.ironsource.adqualitysdk.sdk.i.jz.b<T> r6) {
        /*
            if (r5 == 0) goto L39
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L9:
            int r3 = r5.length()
            if (r2 >= r3) goto L38
            int r3 = com.ironsource.adqualitysdk.sdk.i.jz.f2957
            int r3 = r3 + 83
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f2955 = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L24
            java.lang.Object r3 = r6.mo4838(r5, r2)
            r4 = 4
            int r4 = r4 / r1
            if (r3 == 0) goto L35
            goto L2a
        L24:
            java.lang.Object r3 = r6.mo4838(r5, r2)
            if (r3 == 0) goto L35
        L2a:
            int r4 = com.ironsource.adqualitysdk.sdk.i.jz.f2957
            int r4 = r4 + 9
            int r4 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f2955 = r4
            r0.add(r3)
        L35:
            int r2 = r2 + 1
            goto L9
        L38:
            return r0
        L39:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jz.m7093(org.json.JSONArray, com.ironsource.adqualitysdk.sdk.i.jz$b):java.util.List");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Map<String, String> m7090(JSONObject jSONObject) {
        Map<String, String> mapM7085 = m7085(jSONObject, new c<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.jz.3
            @Override // com.ironsource.adqualitysdk.sdk.i.jz.c
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ String mo4837(JSONObject jSONObject2, String str) {
                return jSONObject2.optString(str, null);
            }
        });
        int i10 = f2955 + 11;
        f2957 = i10 % 128;
        if (i10 % 2 == 0) {
            return mapM7085;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<String> m7078(JSONArray jSONArray) {
        int i10 = f2957;
        int i11 = i10 + 21;
        f2955 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (jSONArray != null) {
            return m7088(jSONArray);
        }
        f2955 = (i10 + 79) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static JSONObject m7091(int i10, int i11, long j10, long j11) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (j10 > -1) {
                f2957 = (f2955 + 117) % 128;
                jSONObject.put(m7087((String) null, Color.alpha(0) + 127, (int[]) null, "\u009a").intern(), i10);
                jSONObject.put(m7087((String) null, 127 - ExpandableListView.getPackedPositionType(0L), (int[]) null, "\u009b").intern(), i11);
                jSONObject.put(m7087((String) null, Color.argb(0, 0, 0, 0) + 127, (int[]) null, "\u0086").intern(), j10);
                jSONObject.put(m7087((String) null, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), (int[]) null, "\u0096").intern(), j11);
                f2957 = (f2955 + 15) % 128;
                return jSONObject;
            }
            jSONObject.put(m7087((String) null, 127 - Color.alpha(0), (int[]) null, "\u009a").intern(), -1);
            jSONObject.put(m7087((String) null, 126 - ((byte) KeyEvent.getModifierMetaStateMask()), (int[]) null, "\u009b").intern(), -1);
            jSONObject.put(m7087((String) null, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (int[]) null, "\u0086").intern(), -1);
            jSONObject.put(m7087((String) null, ((byte) KeyEvent.getModifierMetaStateMask()) + UnsignedBytes.MAX_POWER_OF_TWO, (int[]) null, "\u0096").intern(), -1);
            return jSONObject;
        } catch (JSONException e10) {
            k.m7118(m7087((String) null, 127 - (KeyEvent.getMaxKeyCode() >> 16), (int[]) null, "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m7087((String) null, ExpandableListView.getPackedPositionChild(0L) + 128, (int[]) null, "\u0091\u008c\u0089\u0093\u008d\u009d\u0097\u0096\u008c\u009c\u0086\u0089\u008f\u0088\u008d\u0092\u0091\u0087\u0086\u008f\u0098\u008b\u0097\u008d\u008b\u008c\u008b\u008b\u008a").intern(), e10);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m7084(Object obj, int i10) throws JSONException {
        int i11 = f2955 + 13;
        int i12 = i11 % 128;
        f2957 = i12;
        if (i11 % 2 == 0) {
            if (obj instanceof JSONObject) {
                m7080((JSONObject) obj, i10);
            } else if (obj instanceof JSONArray) {
                int i13 = i12 + 83;
                f2955 = i13 % 128;
                if (i13 % 2 == 0) {
                    m7095((JSONArray) obj, i10);
                    int i14 = 67 / 0;
                } else {
                    m7095((JSONArray) obj, i10);
                }
            } else if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() > i10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str.substring(0, i10));
                    sb2.append(m7087((String) null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, (int[]) null, "\u0099\u0090\u0098\u0086\u008f\u0097\u0091\u0096\u008b\u0086\u0095\u0094\u0094\u0094").intern());
                    return sb2.toString();
                }
                f2957 = (f2955 + 43) % 128;
                return str;
            }
            return null;
        }
        boolean z10 = obj instanceof JSONObject;
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m7080(JSONObject jSONObject, int i10) {
        f2955 = (f2957 + 21) % 128;
        m7086(jSONObject, i10, null);
        f2957 = (f2955 + 29) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m7079(JSONArray jSONArray, int i10, int i11) throws JSONException {
        String strM7084;
        int i12 = f2955 + 111;
        f2957 = i12 % 128;
        if (i12 % 2 != 0) {
            strM7084 = m7084(jSONArray.opt(i10), i11);
            int i13 = 33 / 0;
            if (strM7084 == null) {
                return;
            }
        } else {
            strM7084 = m7084(jSONArray.opt(i10), i11);
            if (strM7084 == null) {
                return;
            }
        }
        jSONArray.put(i10, strM7084);
        f2957 = (f2955 + 85) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m7095(JSONArray jSONArray, int i10) throws JSONException {
        f2955 = (f2957 + 115) % 128;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            f2955 = (f2957 + 59) % 128;
            m7079(jSONArray, i11, i10);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static <T> Map<String, T> m7085(JSONObject jSONObject, c<T> cVar) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            int i10 = f2955 + 71;
            f2957 = i10 % 128;
            if (i10 % 2 == 0) {
                String next = itKeys.next();
                map.put(next, cVar.mo4837(jSONObject, next));
                f2957 = (f2955 + 69) % 128;
            } else {
                String next2 = itKeys.next();
                map.put(next2, cVar.mo4837(jSONObject, next2));
                throw null;
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m7087(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2956;
                int i11 = f2958;
                if (f2960) {
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
                if (f2959) {
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
}
