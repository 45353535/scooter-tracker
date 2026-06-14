package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class ka {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2965 = 160;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2966 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2967;

    public interface e {
        /* JADX INFO: renamed from: ﾇ */
        void mo6119(Object obj, Method method, Object[] objArr);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m7119(String str, int i10, boolean z10, int i11, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f2965);
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m7120(Object obj) {
        int i10 = (f2966 + 27) % 128;
        f2967 = i10;
        if (obj != null) {
            int i11 = i10 + 29;
            f2966 = i11 % 128;
            if (i11 % 2 == 0) {
                Proxy.isProxyClass(obj.getClass());
                throw null;
            }
            if (Proxy.isProxyClass(obj.getClass()) && (obj instanceof hg)) {
                return true;
            }
        }
        int i12 = f2966 + 43;
        f2967 = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m7121(Class<?> cls, Object obj, e eVar) {
        try {
            Object objNewProxyInstance = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls, hg.class}, new a(obj, eVar));
            int i10 = f2966 + 11;
            f2967 = i10 % 128;
            if (i10 % 2 == 0) {
                return objNewProxyInstance;
            }
            throw null;
        } catch (Throwable th2) {
            kd.m7160(m7119("￪\t\ufffe\u0001\b￥\u0007\u0004\r\u000e", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10, false, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4, 268 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m7119("\f\u000f\u000f￢\u000f\u0002\u0001\ufffe\f￩\u0010\u0010\ufffe\t￠\u0011\u0015\u0002\u0011\u000b\f￠\u0011\u0002\u0004ﾽ\u0005\u0011\u0006\u0014ﾽ\u000f\f\u0011\ufffe\u000f\f\u0000\u0002￡\u0016\u0015\f\u000f￭\u0002\u0011\ufffe\u0002\u000f\u0000ﾽ\u000b\u0006ﾽ\u000f", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 56, true, (ViewConfiguration.getJumpTapTimeout() >> 16) + 4, 259 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), th2, true);
            try {
                return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls, hg.class}, new a(obj, eVar));
            } catch (Throwable th3) {
                kd.m7160(m7119("￪\t\ufffe\u0001\b￥\u0007\u0004\r\u000e", View.combineMeasuredStates(0, 0) + 10, false, 5 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 267 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), m7119("￪\r\uffff\u0002\u0003\u0010￣\u0010\u0010\r\u0010ﾾ\u0007\fﾾ\u0001\u0010\u0003\uffff\u0012\u0003￮\u0010\r\u0016\u0017￢\u0003\u0001\r\u0010\uffff\u0012\r\u0010ﾾ\u0015\u0007\u0012\u0006ﾾ\u0005\u0003\u0012￡\n\uffff\u0011\u0011", 49 - TextUtils.getOffsetAfter("", 0), false, 5 - TextUtils.indexOf((CharSequence) "", '0', 0), 258 - Color.red(0)).intern(), th3, true);
                return obj;
            }
        }
    }

    static class a implements InvocationHandler {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static char f2968 = 40850;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f2969 = 1;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f2970 = 0;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char f2971 = 24620;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f2972 = 33560;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char f2973 = 58827;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private e f2974;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private Object f2975;

        a(Object obj, e eVar) {
            this.f2975 = obj;
            this.f2974 = eVar;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static Object[] m7124(Object[] objArr) {
            int i10 = f2969 + 71;
            f2970 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            if (objArr != null) {
                try {
                    ArrayList arrayList = new ArrayList();
                    int length = objArr.length;
                    int i11 = 0;
                    while (i11 < length) {
                        Object obj = objArr[i11];
                        if (Proxy.isProxyClass(obj.getClass())) {
                            int i12 = f2970 + 125;
                            f2969 = i12 % 128;
                            if (i12 % 2 == 0) {
                                arrayList.add(Proxy.getInvocationHandler(obj));
                                int i13 = 32 / 0;
                            } else {
                                arrayList.add(Proxy.getInvocationHandler(obj));
                            }
                        } else {
                            arrayList.add(obj);
                        }
                        i11++;
                        f2970 = (f2969 + 13) % 128;
                    }
                    return arrayList.toArray();
                } catch (Throwable th2) {
                    kd.m7160(m7122("ꇥ恎\u244b퇡〾ࣽ잓\udab1賂ꯉ", 10 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), m7122("䓱켈\ue0d1뿐\uf0d0잺̴鐒ꍘ䢭\uf122蜅\uf21e\uf760\uf122蜅ⳛᗋ憿ӏ잓\udab1\uec52빷䶴\ue896\uf6da퍩숕뱥", TextUtils.indexOf("", "") + 29).intern(), th2, true);
                }
            }
            return objArr;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private Object m7126(Method method) {
            int i10 = f2969 + 57;
            f2970 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            if (method != null) {
                String name = method.getName();
                if (name.hashCode() == 1622498214 && name.equals(m7122("̴鐒곌䚡\uf855猽❵敒ꋡ텚鼻\uf853瘢瓰귛殧쫰九楿ᦰ", 20 - View.getDefaultSize(0, 0)).intern())) {
                    f2969 = (f2970 + 107) % 128;
                    return m7125();
                }
            }
            return null;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            f2970 = (f2969 + 121) % 128;
            if (!(!m7123(method))) {
                try {
                    return m7126(method);
                } catch (Throwable th2) {
                    String strIntern = m7122("ꇥ恎\u244b퇡〾ࣽ잓\udab1賂ꯉ", 10 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m7122("䓱켈\ue0d1뿐\uf0d0잺\uf122蜅ⳛᗋསꌫ䶴\ue896㝍龴』ά傖鋆近凵壙깊嚽灀料긵鬳\uec12", TextUtils.getTrimmedLength("") + 30).intern());
                    sb2.append(method.getName());
                    kd.m7160(strIntern, sb2.toString(), th2, true);
                    return null;
                }
            }
            try {
                this.f2974.mo6119(obj, method, objArr);
            } catch (Throwable th3) {
                String strIntern2 = m7122("ꇥ恎\u244b퇡〾ࣽ잓\udab1賂ꯉ", 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m7122("䓱켈\ue0d1뿐\uf0d0잺\uf122蜅ⳛᗋསꌫ\ue25b㤺猹嵈\uf52dطᇕ௰ㅿ힘穲뗝", 23 - TextUtils.indexOf("", "")).intern());
                Object obj2 = this.f2975;
                sb3.append(obj2 != null ? obj2.toString() : m7122("鈣虌귛殧", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3).intern());
                sb3.append(m7122("壙깊嚽灀料긵慒\uefab", TextUtils.getTrimmedLength("") + 8).intern());
                sb3.append(method.getName());
                kd.m7160(strIntern2, sb3.toString(), th3, true);
                f2970 = (f2969 + 93) % 128;
            }
            Object obj3 = this.f2975;
            if (obj3 != null) {
                f2969 = (f2970 + 105) % 128;
                return method.invoke(obj3, objArr);
            }
            if (!Object.class.equals(method.getDeclaringClass())) {
                return null;
            }
            f2970 = (f2969 + 67) % 128;
            return method.invoke(this, m7124(objArr));
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private Object m7125() {
            int i10 = (f2969 + 23) % 128;
            f2970 = i10;
            Object obj = this.f2975;
            int i11 = i10 + 13;
            f2969 = i11 % 128;
            if (i11 % 2 != 0) {
                return obj;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static boolean m7123(Method method) {
            f2969 = (f2970 + 51) % 128;
            String name = method.getName();
            if (name.hashCode() == 1622498214 && name.equals(m7122("̴鐒곌䚡\uf855猽❵敒ꋡ텚鼻\uf853瘢瓰귛殧쫰九楿ᦰ", (ViewConfiguration.getTouchSlop() >> 8) + 20).intern())) {
                return true;
            }
            f2969 = (f2970 + 27) % 128;
            return false;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m7122(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (n.f3016) {
                try {
                    char[] cArr2 = new char[cArr.length];
                    n.f3015 = 0;
                    char[] cArr3 = new char[2];
                    while (true) {
                        int i11 = n.f3015;
                        if (i11 < cArr.length) {
                            cArr3[0] = cArr[i11];
                            cArr3[1] = cArr[i11 + 1];
                            int i12 = 58224;
                            for (int i13 = 0; i13 < 16; i13++) {
                                char c10 = cArr3[1];
                                char c11 = cArr3[0];
                                char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2972)) ^ ((c11 >>> 5) + f2968)));
                                cArr3[1] = c12;
                                cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2973) ^ ((c12 + i12) ^ ((c12 << 4) + f2971))));
                                i12 -= 40503;
                            }
                            int i14 = n.f3015;
                            cArr2[i14] = cArr3[0];
                            cArr2[i14 + 1] = cArr3[1];
                            n.f3015 = i14 + 2;
                        } else {
                            str2 = new String(cArr2, 0, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }
}
