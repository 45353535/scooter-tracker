package com.appodeal.ads.utils.debug;

import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.utils.Log;
import java.lang.reflect.InvocationTargetException;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f15000a = lf.i.a(new Function0() { // from class: com.appodeal.ads.utils.debug.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return m.c();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f15001b = lf.i.a(new Function0() { // from class: com.appodeal.ads.utils.debug.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return m.e();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy f15002c = lf.i.a(new Function0() { // from class: com.appodeal.ads.utils.debug.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return m.g();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Lazy f15003d = lf.i.a(new Function0() { // from class: com.appodeal.ads.utils.debug.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return m.a();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Lazy f15004e = lf.i.a(new Function0() { // from class: com.appodeal.ads.utils.debug.l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return m.f();
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    static {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.utils.debug.m.<clinit>():void");
    }

    public static final String a() {
        String strB = b(g.f14993e);
        if (strB != null) {
            if (strB.length() <= 0) {
                strB = null;
            }
            if (strB != null) {
                return StringsKt.v1(strB).toString();
            }
        }
        return null;
    }

    public static String b(g gVar) {
        try {
            String property = System.getProperty(gVar.d());
            if (property != null && property.length() > 0 && !StringsKt.N(property, ".none.", true)) {
                LogExtKt.logInternal$default("DebugProperty", "System.getProperty(" + gVar.d() + ") = " + property, null, 4, null);
                return property;
            }
        } catch (Throwable th2) {
            LogExtKt.logInternal("DebugProperty", "System.getProperty() threw an exception", th2);
        }
        return d(gVar);
    }

    public static final Boolean c() {
        String strB = b(g.f14991c);
        if (strB != null) {
            if (strB.length() <= 0) {
                strB = null;
            }
            if (strB != null) {
                return Boolean.valueOf(Boolean.parseBoolean(strB));
            }
        }
        return null;
    }

    public static String d(g gVar) {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, gVar.d(), null);
            String str = objInvoke instanceof String ? (String) objInvoke : null;
            if (str != null && str.length() > 0 && !StringsKt.N(str, ".none.", true)) {
                LogExtKt.logInternal$default("DebugProperty", "SystemProperties.get(" + gVar.d() + ") = " + str, null, 4, null);
                return str;
            }
        } catch (ClassNotFoundException e10) {
            LogExtKt.logInternal("DebugProperty", "Could not find SystemProperties class", e10);
        } catch (IllegalAccessException e11) {
            LogExtKt.logInternal("DebugProperty", "Could not access SystemProperties.get()", e11);
        } catch (NoSuchMethodException e12) {
            LogExtKt.logInternal("DebugProperty", "Could not find SystemProperties class", e12);
        } catch (InvocationTargetException e13) {
            LogExtKt.logInternal("DebugProperty", "SystemProperties.get() threw an exception", e13);
        } catch (Throwable th2) {
            LogExtKt.logInternal("DebugProperty", "Exception during getSystemProperty()", th2);
        }
        return null;
    }

    public static final Boolean e() {
        String strB = b(g.f14992d);
        if (strB != null) {
            if (strB.length() <= 0) {
                strB = null;
            }
            if (strB != null) {
                return Boolean.valueOf(Boolean.parseBoolean(strB));
            }
        }
        return null;
    }

    public static final Log.LogLevel f() {
        String strB = b(g.f14995g);
        if (strB != null) {
            if (strB.length() <= 0) {
                strB = null;
            }
            if (strB != null) {
                return Log.LogLevel.valueOf(strB);
            }
        }
        return null;
    }

    public static final Boolean g() {
        String strB = b(g.f14996h);
        if (strB != null) {
            if (strB.length() <= 0) {
                strB = null;
            }
            if (strB != null) {
                return Boolean.valueOf(Boolean.parseBoolean(strB));
            }
        }
        return null;
    }
}
