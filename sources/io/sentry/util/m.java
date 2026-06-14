package io.sentry.util;

import io.sentry.ILogger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    public interface a {
        void accept(Object obj);
    }

    public interface b {
        void a(Object obj, Class cls);
    }

    public interface c {
        void accept(Object obj);
    }

    public static /* synthetic */ void c(Object obj, Class cls) {
    }

    public static /* synthetic */ void d(Object obj) {
    }

    public static io.sentry.i0 e(Object obj) {
        io.sentry.i0 i0Var = new io.sentry.i0();
        p(i0Var, obj);
        return i0Var;
    }

    public static io.sentry.hints.h f(io.sentry.i0 i0Var) {
        return (io.sentry.hints.h) i0Var.d("sentry:eventDropReason", io.sentry.hints.h.class);
    }

    public static Object g(io.sentry.i0 i0Var) {
        return i0Var.c("sentry:typeCheckHint");
    }

    public static boolean h(io.sentry.i0 i0Var, Class cls) {
        return cls.isInstance(g(i0Var));
    }

    public static boolean i(io.sentry.i0 i0Var) {
        return Boolean.TRUE.equals(i0Var.d("sentry:isFromHybridSdk", Boolean.class));
    }

    public static void j(io.sentry.i0 i0Var, Class cls, final c cVar) {
        l(i0Var, cls, new a() { // from class: io.sentry.util.k
            @Override // io.sentry.util.m.a
            public final void accept(Object obj) {
                m.d(obj);
            }
        }, new b() { // from class: io.sentry.util.l
            @Override // io.sentry.util.m.b
            public final void a(Object obj, Class cls2) {
                cVar.accept(obj);
            }
        });
    }

    public static void k(io.sentry.i0 i0Var, Class cls, a aVar) {
        l(i0Var, cls, aVar, new b() { // from class: io.sentry.util.i
            @Override // io.sentry.util.m.b
            public final void a(Object obj, Class cls2) {
                m.c(obj, cls2);
            }
        });
    }

    public static void l(io.sentry.i0 i0Var, Class cls, a aVar, b bVar) {
        Object objG = g(i0Var);
        if (!h(i0Var, cls) || objG == null) {
            bVar.a(objG, cls);
        } else {
            aVar.accept(objG);
        }
    }

    public static void m(io.sentry.i0 i0Var, Class cls, final ILogger iLogger, a aVar) {
        l(i0Var, cls, aVar, new b() { // from class: io.sentry.util.j
            @Override // io.sentry.util.m.b
            public final void a(Object obj, Class cls2) {
                u.a(cls2, obj, iLogger);
            }
        });
    }

    public static void n(io.sentry.i0 i0Var, io.sentry.hints.h hVar) {
        i0Var.k("sentry:eventDropReason", hVar);
    }

    public static void o(io.sentry.i0 i0Var, String str) {
        if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
            i0Var.k("sentry:isFromHybridSdk", Boolean.TRUE);
        }
    }

    public static void p(io.sentry.i0 i0Var, Object obj) {
        i0Var.k("sentry:typeCheckHint", obj);
    }

    public static boolean q(io.sentry.i0 i0Var) {
        return !(h(i0Var, io.sentry.hints.e.class) || h(i0Var, io.sentry.hints.c.class)) || h(i0Var, io.sentry.hints.b.class);
    }
}
