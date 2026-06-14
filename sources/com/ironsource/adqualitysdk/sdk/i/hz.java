package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.hy;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
public final class hz {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2464 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2465 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2466 = 200;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2468 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2469 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Map<hy.a, ht> f2470;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2467 = {279, 298, 306, 301, 299, 316, 270, 305, 310, 300, 314, 232, 321, 312, 302, 311, 309, 315, 244, 269, 303, 308, 297, 304, 320, 267, 277, 318};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int[] f2463 = {1026070196, -1497733472, 1007237320, 748579486, 709667319, 1802634736, 1645467311, 2040079237, 902973595, 162566763, 917144358, 78795934, 1736430505, -1215225542, 1366241589, -1802646025, -217124763, 1964028701};

    public hz() {
        m6734((String) null, Gravity.getAbsoluteGravity(0, 0) + 127, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        this.f2470 = new HashMap();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m6720(Object obj, List<String> list) {
        if (obj == null) {
            return false;
        }
        f2465 = (f2464 + 47) % 128;
        boolean zM7133 = kb.m7133(obj.getClass(), list);
        f2465 = (f2464 + 83) % 128;
        return zM7133;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static <T> T m6732(Class cls, Object obj, ho hoVar, T t10) {
        f2465 = (f2464 + 113) % 128;
        try {
            Field fieldM6587 = hu.m6637().m6640().m6587(cls, hoVar);
            if (fieldM6587 == null) {
                return t10;
            }
            T t11 = (T) fieldM6587.get(obj);
            int i10 = f2465 + 41;
            f2464 = i10 % 128;
            if (i10 % 2 == 0) {
                return t11;
            }
            throw null;
        } catch (Throwable unused) {
            String strIntern = m6734((String) null, View.getDefaultSize(0, 0) + 127, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6725(new int[]{1021459676, 1316833329, 957014191, 687155372, 367715111, -1346472520, -1597475101, -188208045}, 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern());
            sb2.append(hoVar.m6563());
            sb2.append(m6734((String) null, (ViewConfiguration.getEdgeSlop() >> 16) + 127, (int[]) null, "\u008c\u0091\u0090\u008b\u008f\u008c\u0084\u008e\u008d\u0086\u008c").intern());
            sb2.append(cls);
            sb2.append(m6725(new int[]{-1227658563, -1190981675, 49833950, 35684323}, 6 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
            k.m7098(strIntern, sb2.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m6737(hv hvVar, Object obj, String str) {
        int i10 = f2465 + 91;
        f2464 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (hvVar == null) {
            String strIntern = m6734((String) null, Color.alpha(0) + 127, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(m6725(new int[]{1984592391, 1232721020}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 2).intern());
            sb2.append(str);
            k.m7097(strIntern, sb2.toString());
            return;
        }
        String strIntern2 = m6734((String) null, TextUtils.indexOf((CharSequence) "", '0') + 128, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append(m6725(new int[]{1984592391, 1232721020}, 2 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
        sb3.append(str);
        sb3.append(m6725(new int[]{545079718, -884987865, -272923517, 535263954}, (ViewConfiguration.getLongPressTimeout() >> 16) + 8).intern());
        sb3.append(hvVar.mo6642());
        k.m7097(strIntern2, sb3.toString());
        int i11 = f2464 + 101;
        f2465 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if (m6736(r15.m6667(), r5) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r15 = new java.lang.StringBuilder();
        r15.append(m6725(new int[]{1857419887, -1178320534, -2102558973, 301600277, 1729643396, -1474478369, -853871098, -1916766595, 1862184034, 486974620}, android.graphics.Color.rgb(0, 0, 0) + 16777235).intern());
        r15.append(java.lang.System.currentTimeMillis() - r2);
        r15.append(m6725(new int[]{191332316, 1435805943}, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2).intern());
        m6737(r5, r14, r15.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0090, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (m6736(r15.m6667(), r5) != false) goto L13;
     */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> com.ironsource.adqualitysdk.sdk.i.hv<T> m6738(java.lang.Object r14, com.ironsource.adqualitysdk.sdk.i.hy r15) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hz.m6738(java.lang.Object, com.ironsource.adqualitysdk.sdk.i.hy):com.ironsource.adqualitysdk.sdk.i.hv");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m6743(Object obj, String str) {
        int i10 = f2465 + 63;
        f2464 = i10 % 128;
        if (i10 % 2 != 0) {
            m6733(obj, obj.getClass(), str);
            throw null;
        }
        String strM6733 = m6733(obj, obj.getClass(), str);
        f2465 = (f2464 + 69) % 128;
        return strM6733;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m6744(Object obj, JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int i10 = (f2465 + 89) % 128;
        f2464 = i10;
        f2465 = (i10 + 83) % 128;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            String strM6743 = m6743(obj, jSONArray.optString(i11));
            if (strM6743 != null) {
                return strM6743;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Field[] m6722(Class cls, int i10) {
        Field[] declaredFields = cls.getDeclaredFields();
        for (int i11 = 0; cls != null && i11 != i10; i11++) {
            int i12 = f2464 + 35;
            f2465 = i12 % 128;
            if (i12 % 2 != 0) {
                cls = cls.getSuperclass();
                if (cls != null) {
                    declaredFields = kb.m7135(declaredFields, cls.getDeclaredFields());
                    f2465 = (f2464 + 77) % 128;
                }
            } else {
                cls.getSuperclass();
                throw null;
            }
        }
        return declaredFields;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static List<Object> m6735(Class cls, Object obj, ho hoVar) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<Field> it = hu.m6637().m6640().m6589(cls, hoVar).iterator();
            f2464 = (f2465 + 87) % 128;
            while (it.hasNext()) {
                f2464 = (f2465 + 5) % 128;
                arrayList.add(it.next().get(obj));
            }
        } catch (Throwable unused) {
            String strIntern = m6734((String) null, 127 - TextUtils.indexOf("", "", 0), (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6725(new int[]{1021459676, 1316833329, 957014191, 687155372, 367715111, -1346472520, -1597475101, -188208045}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14).intern());
            sb2.append(hoVar.m6563());
            sb2.append(m6734((String) null, View.getDefaultSize(0, 0) + 127, (int[]) null, "\u008c\u0091\u0090\u008b\u008f\u008c\u0084\u008e\u008d\u0086\u008c").intern());
            sb2.append(cls);
            sb2.append(m6725(new int[]{-1227658563, -1190981675, 49833950, 35684323}, MotionEvent.axisFromString("") + 7).intern());
            k.m7098(strIntern, sb2.toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List m6719(Object obj, hy hyVar, int i10) {
        int i11 = f2464 + 67;
        f2465 = i11 % 128;
        if (i11 % 2 == 0) {
            m6727(obj, hyVar.m6666(i10), hyVar.m6668(i10), hyVar.m6672(i10));
            throw null;
        }
        List listM6727 = m6727(obj, hyVar.m6666(i10), hyVar.m6668(i10), hyVar.m6672(i10));
        f2464 = (f2465 + 101) % 128;
        return listM6727;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static <T> hv<T> m6718(Object obj, Object obj2, hv hvVar) {
        if (obj != null) {
            int i10 = f2465 + 117;
            f2464 = i10 % 128;
            if (i10 % 2 == 0) {
                if (obj instanceof Collection) {
                    return new hx((Collection) obj, obj2, hvVar);
                }
                if (obj instanceof Map) {
                    return new hx((Map) obj, obj2, hvVar);
                }
                if (obj.getClass().isArray()) {
                    hx hxVar = new hx(new ArrayList(Arrays.asList(obj)), obj2, hvVar);
                    f2465 = (f2464 + 101) % 128;
                    return hxVar;
                }
            } else {
                boolean z10 = obj instanceof Collection;
                throw null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final <T> hv<T> m6740(Object obj, ia iaVar, hm hmVar, List<String> list, int i10) {
        hv<T> hvVarM6738 = m6738(obj, new hy.c().m6715(true).m6708(iaVar, hmVar, list, i10));
        f2464 = (f2465 + 45) % 128;
        return hvVarM6738;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<hv> m6741(Object obj, hy hyVar) {
        hw hwVar = new hw(hyVar);
        hwVar.m6645();
        m6730(obj, hwVar, 0, (hv) null);
        ArrayList arrayList = new ArrayList(hwVar.m6643());
        f2465 = (f2464 + 55) % 128;
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private <T> hv<T> m6723(Object obj, ht htVar) {
        f2464 = (f2465 + 107) % 128;
        try {
            hv<T> hvVarM6728 = m6728(m6731(obj, htVar.m6632().get(0), (hv) null), htVar, 1);
            f2464 = (f2465 + 115) % 128;
            return hvVarM6728;
        } catch (Exception e10) {
            k.m7118(m6734((String) null, (ViewConfiguration.getTapTimeout() >> 16) + 127, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m6734((String) null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), (int[]) null, "\u0098\u0086\u0097\u008e\u008c\u0091\u0090\u008b\u008f\u008c\u008a\u0096\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081\u008c\u0095\u0089\u0088\u0086\u0086\u0084\u0095\u008c\u008b\u0090\u008b\u008b\u0094").intern(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private <T> hv<T> m6728(hv hvVar, ht htVar, int i10) {
        if (i10 >= htVar.m6632().size()) {
            return hvVar;
        }
        List<Field> list = htVar.m6632().get(i10);
        Object objMo6642 = hvVar.mo6642();
        List listM6726 = m6726(objMo6642);
        if (listM6726 == null) {
            String strIntern = m6734((String) null, 127 - Color.alpha(0), (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6734((String) null, TextUtils.lastIndexOf("", '0') + 128, (int[]) null, "\u008c\u008a\u0084\u009c\u0088\u0084\u0085\u0084\u008b\u008c\u0093\u008e\u0097\u009b\u008c\u008b\u0090\u008c\u0089\u0090\u0088\u0086\u0085\u0084\u0096\u0096\u0090\u009a\u008c\u008a\u0084\u0086\u0085\u0084\u008e\u0099\u0094").intern());
            sb2.append(objMo6642.getClass());
            k.m7098(strIntern, sb2.toString());
            return null;
        }
        Iterator it = listM6726.iterator();
        while (!(!it.hasNext())) {
            f2465 = (f2464 + 107) % 128;
            Object next = it.next();
            try {
                hv hvVarM6731 = m6731(next, list, m6718(objMo6642, next, hvVar));
                if (hvVarM6731 != null) {
                    return m6728(hvVarM6731, htVar, 1 + i10);
                }
                f2465 = (f2464 + 19) % 128;
            } catch (Exception unused) {
            }
        }
        int i11 = f2464 + 99;
        f2465 = i11 % 128;
        if (i11 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Field[] m6721(Class cls) {
        ArrayList arrayList = new ArrayList();
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = f2465 + 47;
            f2464 = i11 % 128;
            if (i11 % 2 == 0) {
                Field field = declaredFields[i10];
                if (field.getType().equals(String.class)) {
                    int i12 = f2464 + 85;
                    f2465 = i12 % 128;
                    if (i12 % 2 == 0) {
                        arrayList.add(field);
                        throw null;
                    }
                    arrayList.add(field);
                }
            } else {
                declaredFields[i10].getType().equals(String.class);
                throw null;
            }
        }
        return (Field[]) arrayList.toArray(new Field[0]);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List m6726(Object obj) {
        int i10 = f2464 + 125;
        f2465 = i10 % 128;
        List listM6727 = i10 % 2 == 0 ? m6727(obj, false, true, true) : m6727(obj, true, true, true);
        int i11 = f2465 + 87;
        f2464 = i11 % 128;
        if (i11 % 2 == 0) {
            return listM6727;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List m6727(Object obj, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList;
        int i10;
        int i11 = (f2464 + 7) % 128;
        f2465 = i11;
        if (obj != null) {
            f2464 = (i11 + 103) % 128;
            if ((obj instanceof Collection) && z10) {
                arrayList = new ArrayList((Collection) obj);
                i10 = f2464 + 121;
            } else if (obj.getClass().isArray() && z12) {
                arrayList = new ArrayList(Arrays.asList(obj));
            } else {
                if ((obj instanceof Map) && z11) {
                    Map map = (Map) obj;
                    arrayList = new ArrayList(map.values());
                    arrayList.addAll(map.keySet());
                    i10 = f2464 + 67;
                }
                arrayList = null;
            }
            f2465 = i10 % 128;
        } else {
            arrayList = null;
        }
        int i12 = f2465 + 25;
        f2464 = i12 % 128;
        if (i12 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static <T> hv<T> m6731(Object obj, List<Field> list, hv hvVar) throws IllegalAccessException {
        Object obj2;
        int i10 = f2465 + 69;
        f2464 = i10 % 128;
        if (i10 % 2 != 0) {
            list.iterator();
            throw null;
        }
        f2464 = (f2465 + 51) % 128;
        for (Field field : list) {
            if (WeakReference.class.isAssignableFrom(field.getType())) {
                f2464 = (f2465 + 47) % 128;
                obj2 = ((WeakReference) field.get(obj)).get();
            } else {
                obj2 = field.get(obj);
            }
            hvVar = m6724(field, obj, hvVar);
            obj = obj2;
        }
        int i11 = f2465 + 113;
        f2464 = i11 % 128;
        if (i11 % 2 == 0) {
            return hvVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static <T> hv<T> m6724(Field field, Object obj, hv hvVar) {
        hx hxVar = new hx(field, obj, hvVar);
        f2465 = (f2464 + 77) % 128;
        return hxVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m6739(Class cls, String str) {
        int i10 = f2464 + 93;
        f2465 = i10 % 128;
        if (i10 % 2 != 0) {
            return m6733((Object) null, cls, str);
        }
        m6733((Object) null, cls, str);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6725(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2463.clone();
                e.f1937 = 0;
                while (true) {
                    int i11 = e.f1937;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        e.f1939 = (c10 << 16) + c11;
                        e.f1938 = (c12 << 16) + c13;
                        e.m6423(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = e.f1939 ^ iArr2[i13];
                            e.f1939 = i14;
                            e.f1938 = e.m6422(i14) ^ e.f1938;
                            int i15 = e.f1939;
                            e.f1939 = e.f1938;
                            e.f1938 = i15;
                        }
                        int i16 = e.f1939;
                        e.f1939 = e.f1938;
                        e.f1938 = i16;
                        e.f1938 = i16 ^ iArr2[16];
                        e.f1939 ^= iArr2[17];
                        int i17 = e.f1937;
                        int i18 = e.f1939;
                        cArr[0] = (char) (i18 >>> 16);
                        cArr[1] = (char) i18;
                        int i19 = e.f1938;
                        cArr[2] = (char) (i19 >>> 16);
                        cArr[3] = (char) i19;
                        e.m6423(iArr2);
                        int i20 = e.f1937;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        e.f1937 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private <T> hv<T> m6730(Object obj, hw<T> hwVar, int i10, hv hvVar) {
        Field[] fieldArrM6722;
        int i11 = f2465 + 91;
        f2464 = i11 % 128;
        if (i11 % 2 == 0) {
            if (i10 != hwVar.m6651().m6673()) {
                int i12 = f2464;
                f2465 = (i12 + 17) % 128;
                if (obj != null) {
                    f2465 = (i12 + 39) % 128;
                    if (!hwVar.m6650().contains(obj)) {
                        f2464 = (f2465 + 15) % 128;
                        if (i10 <= 0 || !(obj instanceof Activity)) {
                            hwVar.m6650().add(obj);
                            try {
                                if (hwVar.m6651().m6676() != null) {
                                    fieldArrM6722 = hwVar.m6651().m6676().mo6552(obj);
                                } else {
                                    fieldArrM6722 = m6722(obj.getClass(), hwVar.m6651().m6669(i10));
                                }
                                ht htVarM6648 = hwVar.m6648();
                                for (Field field : fieldArrM6722) {
                                    field.setAccessible(true);
                                    htVarM6648.m6635(field);
                                    hv<T> hvVarM6729 = m6729(m6724(field, obj, hvVar), hwVar, i10);
                                    if (hvVarM6729 != null && !hwVar.m6649()) {
                                        return hvVarM6729;
                                    }
                                    htVarM6648.m6633(field);
                                }
                                f2465 = (f2464 + 1) % 128;
                            } catch (Throwable th2) {
                                k.m7118(m6734((String) null, (ViewConfiguration.getScrollBarSize() >> 8) + 127, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m6725(new int[]{1021459676, 1316833329, 957014191, 687155372, 367715111, -1346472520, -1082011640, 1374541143, 437445677, -1579277629, -1379548377, -2010087012, -1753696167, 1477608565}, ExpandableListView.getPackedPositionChild(0L) + 26).intern(), th2);
                            }
                        }
                    }
                }
            }
            return null;
        }
        hwVar.m6651().m6673();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private hv m6729(hv hvVar, hw hwVar, int i10) {
        Object objMo6642 = hvVar.mo6642();
        if (hwVar.m6650().contains(objMo6642) || hwVar.m6644().contains(objMo6642)) {
            return null;
        }
        if (hwVar.m6651().m6675(i10) && m6736(hwVar.m6651().m6667(), hvVar)) {
            f2464 = (f2465 + 65) % 128;
            if (hwVar.m6649()) {
                f2464 = (f2465 + 13) % 128;
                hwVar.m6646(hvVar);
                hwVar.m6647(objMo6642);
            }
            return hvVar;
        }
        if (objMo6642 instanceof WeakReference) {
            WeakReference weakReference = (WeakReference) objMo6642;
            if (weakReference.get() != null && hwVar.m6651().m6677(i10)) {
                f2465 = (f2464 + 33) % 128;
                if (m6720(weakReference.get(), hwVar.m6651().m6671())) {
                    f2464 = (f2465 + 77) % 128;
                    return m6730(weakReference.get(), hwVar, i10 + 1, hvVar);
                }
            }
        }
        if (!m6720(objMo6642, hwVar.m6651().m6671())) {
            if (hwVar.m6651().m6670()) {
                int i11 = f2465;
                f2464 = (i11 + 13) % 128;
                if (objMo6642 != null) {
                    int i12 = i11 + 25;
                    f2464 = i12 % 128;
                    if (i12 % 2 != 0) {
                        hwVar.m6650().add(objMo6642);
                        throw null;
                    }
                    hwVar.m6650().add(objMo6642);
                }
            }
            List listM6719 = m6719(objMo6642, hwVar.m6651(), i10);
            ht htVarM6648 = hwVar.m6648();
            if (listM6719 == null) {
                return null;
            }
            Iterator it = listM6719.iterator();
            hv hvVarM6729 = null;
            while (it.hasNext()) {
                hv hvVarM6718 = m6718(objMo6642, it.next(), hvVar);
                htVarM6648.m6634();
                hvVarM6729 = m6729(hvVarM6718, hwVar, i10);
                if (hvVarM6729 != null) {
                    int i13 = f2464 + 59;
                    f2465 = i13 % 128;
                    if (i13 % 2 == 0) {
                        hwVar.m6649();
                        throw null;
                    }
                    if (!hwVar.m6649()) {
                        f2465 = (f2464 + 11) % 128;
                        return hvVarM6729;
                    }
                }
                htVarM6648.m6636();
            }
            return hvVarM6729;
        }
        return m6730(objMo6642, hwVar, i10 + 1, hvVar);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m6742(Object obj, List<String> list, int i10) {
        hw hwVar = new hw(new hy.c().m6712(true).m6717(true).m6710(true).m6705(-1).m6713(new ia() { // from class: com.ironsource.adqualitysdk.sdk.i.hz.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ia
            /* JADX INFO: renamed from: ﻛ */
            public final boolean mo6154(hv hvVar) {
                return hvVar.mo6642() instanceof String;
            }
        }, list, i10));
        hwVar.m6645();
        m6730(obj, hwVar, 0, (hv) null);
        ArrayList arrayList = new ArrayList(hwVar.m6644());
        int i11 = f2464 + 117;
        f2465 = i11 % 128;
        if (i11 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m6736(ia iaVar, hv hvVar) {
        int i10 = f2465 + 95;
        f2464 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                boolean zMo6154 = iaVar.mo6154(hvVar);
                int i11 = f2464 + 65;
                f2465 = i11 % 128;
                if (i11 % 2 != 0) {
                    return zMo6154;
                }
                throw null;
            }
            iaVar.mo6154(hvVar);
            throw null;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m6733(Object obj, Class cls, String str) {
        String str2;
        while (cls != null && !cls.equals(Object.class)) {
            Field[] fieldArrM6721 = m6721(cls);
            int length = fieldArrM6721.length;
            int i10 = 0;
            while (i10 < length) {
                Field field = fieldArrM6721[i10];
                field.setAccessible(true);
                try {
                    str2 = (String) field.get(obj);
                } catch (Exception unused) {
                }
                if (str2 != null && Pattern.compile(str).matcher(str2).matches()) {
                    int i11 = (f2464 + 29) % 128;
                    f2465 = i11;
                    int i12 = i11 + 25;
                    f2464 = i12 % 128;
                    if (i12 % 2 == 0) {
                        return str2;
                    }
                    throw null;
                }
                i10++;
                f2465 = (f2464 + 63) % 128;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6734(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2467;
                int i11 = f2466;
                if (f2468) {
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
                if (f2469) {
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
