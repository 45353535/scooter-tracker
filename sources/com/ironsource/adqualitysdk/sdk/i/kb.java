package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class kb {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2976 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2977;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2978;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Map<a, Method> f2979;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2980;

    static class a {

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f2981 = 1;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2982 = 0;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f2983 = 5943164199102125346L;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private Class f2984;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private String f2985;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private List<Class> f2986;

        public a(Object obj, String str, List<Class> list) {
            if (obj instanceof Class) {
                this.f2984 = (Class) obj;
            } else {
                this.f2984 = obj.getClass();
            }
            this.f2985 = str;
            this.f2986 = list;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m7146(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (h.f2308) {
                try {
                    char[] cArrM6531 = h.m6531(f2983, cArr, i10);
                    h.f2309 = 4;
                    while (true) {
                        int i11 = h.f2309;
                        if (i11 < cArrM6531.length) {
                            h.f2307 = i11 - 4;
                            cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f2983));
                            h.f2309++;
                        } else {
                            str2 = new String(cArrM6531, 4, cArrM6531.length - 4);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                f2982 = (f2981 + 63) % 128;
                if (a.class == obj.getClass()) {
                    a aVar = (a) obj;
                    if (!this.f2984.equals(aVar.f2984)) {
                        int i10 = f2981 + 7;
                        f2982 = i10 % 128;
                        return i10 % 2 != 0;
                    }
                    if (this.f2985.equals(aVar.f2985)) {
                        return this.f2986.equals(aVar.f2986);
                    }
                    f2981 = (f2982 + 89) % 128;
                    return false;
                }
            }
            return false;
        }

        public final int hashCode() {
            f2982 = (f2981 + 39) % 128;
            int iHashCode = (((this.f2984.hashCode() * 31) + this.f2985.hashCode()) * 31) + this.f2986.hashCode();
            int i10 = f2982 + 35;
            f2981 = i10 % 128;
            if (i10 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(m7146("\udd4c\udd01馏\ue908姛賈쌸曕覫\uf041鞀쩐琺⟔㨲뇄₠譜캻敋輗", ViewConfiguration.getTouchSlop() >> 8).intern());
            sb2.append(m7146("텒턿四捵寨䎶䥓擤薿㼒᷍졅砮\ue888끒돭\u2cf7", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1).intern());
            sb2.append(this.f2984);
            sb2.append(m7146("笀第럺᭜膧ꋸㅵ뺌\u2fed\ude24旸ሦ퉴আ졩榼蛽ꕽ㲧", Process.getGidForName("") + 1).intern());
            sb2.append(this.f2985);
            sb2.append('\'');
            sb2.append(m7146("ᦴᦘ朩昿厴爫䰖沓䵎\u0ee4ᢰ쀶냅\ud968딘뮧\ue45f疮", ViewConfiguration.getWindowTouchSlop() >> 8).intern());
            sb2.append(this.f2986);
            sb2.append('}');
            String string = sb2.toString();
            f2981 = (f2982 + 69) % 128;
            return string;
        }
    }

    static {
        m7140();
        f2979 = new ConcurrentHashMap();
        int i10 = f2978 + 123;
        f2976 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Method m7128(Object obj, String str, List<Object> list) {
        int i10 = f2976 + 59;
        f2978 = i10 % 128;
        return m7127(obj.getClass(), str, list, i10 % 2 != 0);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Method m7131(Object obj, String str, List<Object> list) {
        Method methodM7128;
        a aVar = new a(obj, str, m7132(list));
        Method method = f2979.get(aVar);
        if (method != null) {
            if (m7130(method.getParameterTypes(), list)) {
                f2978 = (f2976 + 7) % 128;
                return method;
            }
            String strIntern = m7139(ViewConfiguration.getLongPressTimeout() >> 16, (char) (View.MeasureSpec.getMode(0) + 48731), TextUtils.getTrimmedLength("") + 15).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m7139((Process.myTid() >> 22) + 31, (char) (ExpandableListView.getPackedPositionType(0L) + 58399), MotionEvent.axisFromString("") + 29).intern());
            sb2.append(aVar);
            co.m5911(strIntern, sb2.toString(), null);
            f2978 = (f2976 + 81) % 128;
        }
        if (obj instanceof Class) {
            f2976 = (f2978 + 41) % 128;
            methodM7128 = m7127((Class) obj, str, list, true);
            if (methodM7128 == null) {
                f2978 = (f2976 + 55) % 128;
                methodM7128 = m7128(Class.class, str, list);
            }
        } else {
            methodM7128 = m7128(obj, str, list);
        }
        if (methodM7128 != null) {
            int i10 = f2976 + 9;
            f2978 = i10 % 128;
            if (i10 % 2 != 0) {
                f2979.put(aVar, methodM7128);
                int i11 = 86 / 0;
                return methodM7128;
            }
            f2979.put(aVar, methodM7128);
        }
        return methodM7128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Class m7136(String str, boolean z10) {
        try {
            Class<?> cls = Class.forName(str);
            f2976 = (f2978 + 81) % 128;
            return cls;
        } catch (Throwable th2) {
            if (z10) {
                String strIntern = m7139(TextUtils.indexOf((CharSequence) "", '0') + 1, (char) (48731 - (ViewConfiguration.getTouchSlop() >> 8)), 15 - (ViewConfiguration.getTapTimeout() >> 16)).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m7139(16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (33366 - Gravity.getAbsoluteGravity(0, 0)), 6 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
                sb2.append(str);
                sb2.append(m7139(21 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9).intern());
                co.m5911(strIntern, sb2.toString(), th2);
            }
            f2978 = (f2976 + 69) % 128;
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static void m7140() {
        f2980 = new char[]{48649, 6069, 60715, 17046, 6162, 61839, 18285, 7423, 62060, 19414, 8544, 63190, 19638, 8760, 64434, 33301, 11185, 53537, 32388, 9225, 52673, ' ', 43493, 21369, 64725, 42508, 20433, 63789, 41656, 19510, 62855, 58458, 19942, 46971, 6353, 16961, 43912, 7482, 18103, 43059, 4488, 31512, 44168, 5884, 30768, 41446, 2907, 31948, 42572, 4028, 28970, 56035, 3093, 30088, 57110, 383, 27363, 56421, 1430, 26230, 53212, 13582, 39614, 60633, 17749, 49029, 4154, 19110, 41761, 5587, 20055, 41094, 6523, 29695, 42098, 7700, 28821, 43332, 957, 29729, 44727, 1816, 'c', 43492, 21371, 64655, 42565, 20421, 63789, 41635, 19499, 62860, 40731, 18571, 62183, 40042, 17844, 61252, 39124, 16970, 60339, 38192, 16048, 59406, 37254, 15108};
        f2977 = -4185486480735295093L;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m7144(Class cls, List<Object> list, Class... clsArr) throws Exception {
        f2976 = (f2978 + 83) % 128;
        Object objNewInstance = cls.getConstructor(clsArr).newInstance(list.toArray());
        f2976 = (f2978 + 19) % 128;
        return objNewInstance;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Method m7127(Class cls, String str, List<Object> list, boolean z10) {
        f2978 = (f2976 + 71) % 128;
        Method[] methods = cls.getMethods();
        f2978 = (f2976 + 9) % 128;
        for (Method method : methods) {
            if (method.getName().equals(str)) {
                f2976 = (f2978 + 95) % 128;
                if (method.getParameterTypes().length == list.size() && Modifier.isStatic(method.getModifiers()) == z10) {
                    int i10 = f2978 + 123;
                    f2976 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 35 / 0;
                        if (m7141(method, list)) {
                            f2978 = (f2976 + 49) % 128;
                            return method;
                        }
                    } else if (m7141(method, list)) {
                        f2978 = (f2976 + 49) % 128;
                        return method;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m7141(Method method, List<Object> list) {
        f2978 = (f2976 + 85) % 128;
        boolean zM7130 = m7130(method.getParameterTypes(), list);
        int i10 = f2978 + 109;
        f2976 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 40 / 0;
        }
        return zM7130;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Constructor m7145(Class cls, List<Object> list) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            f2978 = (f2976 + 67) % 128;
            if (constructor.getParameterTypes().length == list.size()) {
                int i10 = f2978 + 3;
                f2976 = i10 % 128;
                if (i10 % 2 == 0) {
                    m7134(constructor, list);
                    throw null;
                }
                if (m7134(constructor, list)) {
                    return constructor;
                }
            }
        }
        f2978 = (f2976 + 21) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Method[] m7143(Method[] methodArr, Method[] methodArr2) {
        f2978 = (f2976 + 109) % 128;
        int length = methodArr.length;
        int length2 = methodArr2.length;
        Method[] methodArr3 = new Method[length + length2];
        System.arraycopy(methodArr, 0, methodArr3, 0, length);
        System.arraycopy(methodArr2, 0, methodArr3, length, length2);
        int i10 = f2978 + 65;
        f2976 = i10 % 128;
        if (i10 % 2 != 0) {
            return methodArr3;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Object m7137(Class cls, List<Object> list) throws Exception {
        int i10 = f2976 + 23;
        f2978 = i10 % 128;
        int i11 = i10 % 2;
        Constructor constructorM7145 = m7145(cls, list);
        Object[] array = list.toArray();
        if (i11 != 0) {
            constructorM7145.newInstance(array);
            throw null;
        }
        Object objNewInstance = constructorM7145.newInstance(array);
        f2978 = (f2976 + 23) % 128;
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.reflect.Method] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Method m7138(Object obj, String str, List<Class> list) {
        int i10 = f2976 + 31;
        f2978 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                Class<?>[] clsArrM7142 = m7142(list);
                if (obj instanceof Class) {
                    try {
                        obj = ((Class) obj).getMethod(str, clsArrM7142);
                        int i11 = f2976 + 111;
                        f2978 = i11 % 128;
                        if (i11 % 2 == 0) {
                            return obj;
                        }
                        throw null;
                    } catch (NoSuchMethodException unused) {
                        return Class.class.getMethod(str, clsArrM7142);
                    }
                }
                Method method = obj.getClass().getMethod(str, clsArrM7142);
                f2978 = (f2976 + 1) % 128;
                return method;
            }
            m7142(list);
            boolean z10 = obj instanceof Class;
            throw null;
        } catch (NoSuchMethodException e10) {
            String strIntern = m7139(TextUtils.lastIndexOf("", '0') + 1, (char) (ExpandableListView.getPackedPositionChild(0L) + 48732), 15 - KeyEvent.keyCodeFromString("")).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m7139((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 58, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 26168), TextUtils.indexOf("", "", 0) + 4).intern());
            sb2.append(str);
            sb2.append(m7139((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 62, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 60671), TextUtils.getTrimmedLength("") + 19).intern());
            sb2.append(obj);
            co.m5911(strIntern, sb2.toString(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Class[] m7142(List<Class> list) {
        Class[] clsArr;
        int i10;
        int i11 = f2976 + 51;
        f2978 = i11 % 128;
        if (i11 % 2 != 0) {
            clsArr = new Class[list.size()];
            i10 = 1;
        } else {
            clsArr = new Class[list.size()];
            i10 = 0;
        }
        while (i10 < list.size()) {
            f2976 = (f2978 + 49) % 128;
            clsArr[i10] = list.get(i10);
            i10++;
            f2978 = (f2976 + 91) % 128;
        }
        return clsArr;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m7130(Class[] clsArr, List<Object> list) {
        int i10 = f2976 + 61;
        f2978 = i10 % 128;
        for (int i11 = i10 % 2 != 0 ? 1 : 0; i11 < clsArr.length; i11++) {
            Object obj = list.get(i11);
            if ((obj == null && (!Object.class.isAssignableFrom(clsArr[i11]))) || (obj != null && !m7129(clsArr[i11], obj))) {
                return false;
            }
        }
        f2976 = (f2978 + 37) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List<Class> m7132(List<Object> list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            int i10 = f2976 + 33;
            f2978 = i10 % 128;
            if (i10 % 2 != 0) {
                next = it.next();
                int i11 = 68 / 0;
                if (next != null) {
                    arrayList.add(next.getClass());
                    f2976 = (f2978 + 93) % 128;
                } else {
                    arrayList.add(Object.class);
                }
            } else {
                next = it.next();
                if (next != null) {
                    arrayList.add(next.getClass());
                    f2976 = (f2978 + 93) % 128;
                } else {
                    arrayList.add(Object.class);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m7139(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2980[i10 + i12]) ^ (((long) i12) * f2977)) ^ ((long) c10));
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012c  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m7129(java.lang.Class r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kb.m7129(java.lang.Class, java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m7134(Constructor constructor, List<Object> list) {
        int i10 = f2978 + 125;
        f2976 = i10 % 128;
        int i11 = i10 % 2;
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if (i11 != 0) {
            return m7130(parameterTypes, list);
        }
        boolean zM7130 = m7130(parameterTypes, list);
        int i12 = 30 / 0;
        return zM7130;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Field[] m7135(Field[] fieldArr, Field[] fieldArr2) {
        f2978 = (f2976 + 119) % 128;
        int length = fieldArr.length;
        int length2 = fieldArr2.length;
        Field[] fieldArr3 = new Field[length + length2];
        System.arraycopy(fieldArr, 0, fieldArr3, 0, length);
        System.arraycopy(fieldArr2, 0, fieldArr3, length, length2);
        int i10 = f2978 + 71;
        f2976 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 28 / 0;
        }
        return fieldArr3;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m7133(java.lang.Class r9, java.util.List<java.lang.String> r10) {
        /*
            r0 = 0
            if (r9 == 0) goto Laf
            int r1 = com.ironsource.adqualitysdk.sdk.i.kb.f2976
            int r1 = r1 + 43
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.kb.f2978 = r1
            r1 = 1
            if (r10 == 0) goto Lae
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L16
            goto Lae
        L16:
            java.util.Iterator r10 = r10.iterator()
        L1a:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L53
            java.lang.Object r2 = r10.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = ""
            boolean r4 = r2.equals(r3)
            if (r4 == 0) goto L42
            java.lang.Package r4 = r9.getPackage()
            if (r4 == 0) goto L52
            java.lang.Package r4 = r9.getPackage()
            java.lang.String r4 = r4.getName()
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L52
        L42:
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L1a
            java.lang.String r3 = r9.getName()
            boolean r2 = r3.startsWith(r2)
            if (r2 == 0) goto L1a
        L52:
            return r1
        L53:
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.kb> r10 = com.ironsource.adqualitysdk.sdk.i.kb.class
            java.lang.String r2 = r10.getName()
            int r3 = android.view.KeyEvent.normalizeMetaState(r0)
            int r3 = 82 - r3
            int r4 = android.view.View.resolveSizeAndState(r0, r0, r0)
            char r4 = (char) r4
            long r5 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            int r5 = 25 - r5
            java.lang.String r3 = m7139(r3, r4, r5)
            java.lang.String r3 = r3.intern()
            boolean r2 = r2.startsWith(r3)
            if (r2 != 0) goto Laf
            java.lang.Package r2 = r10.getPackage()
            if (r2 != 0) goto L90
            int r2 = com.ironsource.adqualitysdk.sdk.i.kb.f2976
            int r2 = r2 + 3
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.kb.f2978 = r2
            java.lang.Package r2 = r9.getPackage()
            if (r2 == 0) goto Lac
        L90:
            java.lang.Package r2 = r10.getPackage()
            if (r2 == 0) goto Lad
            int r2 = com.ironsource.adqualitysdk.sdk.i.kb.f2976
            int r2 = r2 + 99
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.kb.f2978 = r2
            java.lang.Package r10 = r10.getPackage()
            java.lang.Package r9 = r9.getPackage()
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto Lad
        Lac:
            return r1
        Lad:
            return r0
        Lae:
            return r1
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kb.m7133(java.lang.Class, java.util.List):boolean");
    }
}
