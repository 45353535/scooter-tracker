package io.bidmachine.core;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f80024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile de.c f80025b = new de.a("BidMachineLog");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile de.c f80026c = new de.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static volatile de.c f80027d = f80026c;

    public static void a(ce.b bVar) {
        f80027d.f(bVar);
    }

    public static void b(Object obj, ce.b bVar) {
        f80027d.e(obj, bVar);
    }

    public static void c(Object obj, String str) {
        f80027d.d(obj, str);
    }

    public static void d(String str) {
        f80027d.d(str);
    }

    public static void e(ce.b bVar) {
        f80027d.a(bVar);
    }

    public static void f(Object obj, ce.b bVar) {
        f80027d.h(obj, bVar);
    }

    public static void g(String str) {
        f80027d.e(str);
    }

    public static boolean h() {
        return f80024a;
    }

    public static void i(de.c cVar) {
        f80025b = cVar;
        j(f80024a);
    }

    public static void j(boolean z10) {
        f80024a = z10;
        f80027d = z10 ? f80025b : f80026c;
    }

    public static void k(ce.b bVar) {
        f80027d.g(bVar);
    }

    public static void l(Object obj, ce.b bVar) {
        f80027d.b(obj, bVar);
    }

    public static void m(Object obj, String str) {
        f80027d.j(obj, str);
    }

    public static void n(Object obj, Throwable th2) {
        f80027d.d(obj, th2);
    }

    public static void o(String str) {
        f80027d.i(str);
    }

    public static void p(Throwable th2) {
        f80027d.c(th2);
    }
}
