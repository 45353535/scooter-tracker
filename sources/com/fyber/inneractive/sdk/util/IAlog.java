package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.logger.FMPLogger;
import com.ironsource.C4240b4;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class IAlog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f23840a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.fyber.inneractive.sdk.logger.a f23841b = new com.fyber.inneractive.sdk.logger.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x0 f23842c = new x0();

    public static void a(String str, Object... objArr) {
        Iterator it = f23842c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).debug(str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        Iterator it = f23842c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).error(str, null, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        Iterator it = f23842c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).info(str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        Iterator it = f23842c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).log(1, null, str, objArr);
        }
    }

    public static void e(String str, Object... objArr) {
        Iterator it = f23842c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).verbose(str, objArr);
        }
    }

    public static void f(String str, Object... objArr) {
        Iterator it = f23842c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).warning(str, objArr);
        }
    }

    public static void a(String str, Throwable th2, Object... objArr) {
        Iterator it = f23842c.iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).error(str, th2, objArr);
        }
    }

    public static String a(Object obj) {
        return "(" + Thread.currentThread().getName() + "): " + obj.getClass().getSimpleName() + C4240b4.j.f42672d + Integer.toHexString(System.identityHashCode(obj)) + "] ";
    }

    public static String a(Class cls) {
        return "(" + Thread.currentThread().getName() + "): " + cls.getSimpleName() + C4240b4.j.f42672d + Integer.toHexString(System.identityHashCode(cls)) + "] ";
    }
}
