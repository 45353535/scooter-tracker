package d0;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f68328a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f68329b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f68330c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f68331d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static n0.f f68333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static n0.e f68334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile n0.h f68335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile n0.g f68336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static ThreadLocal f68337j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f68332e = a.AUTOMATIC;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static h0.b f68338k = new h0.c();

    public static /* synthetic */ File a(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static void b(String str) {
        if (f68329b) {
            g().a(str);
        }
    }

    public static float c(String str) {
        if (f68329b) {
            return g().b(str);
        }
        return 0.0f;
    }

    public static a d() {
        return f68332e;
    }

    public static boolean e() {
        return f68331d;
    }

    public static h0.b f() {
        return f68338k;
    }

    private static q0.i g() {
        q0.i iVar = (q0.i) f68337j.get();
        if (iVar != null) {
            return iVar;
        }
        q0.i iVar2 = new q0.i();
        f68337j.set(iVar2);
        return iVar2;
    }

    public static boolean h() {
        return f68329b;
    }

    public static n0.g i(Context context) {
        n0.g gVar;
        if (!f68330c) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        n0.g gVar2 = f68336i;
        if (gVar2 != null) {
            return gVar2;
        }
        synchronized (n0.g.class) {
            try {
                gVar = f68336i;
                if (gVar == null) {
                    n0.e eVar = f68334g;
                    if (eVar == null) {
                        eVar = new n0.e() { // from class: d0.d
                            @Override // n0.e
                            public final File a() {
                                return e.a(applicationContext);
                            }
                        };
                    }
                    gVar = new n0.g(eVar);
                    f68336i = gVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static n0.h j(Context context) {
        n0.h hVar;
        n0.h hVar2 = f68335h;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (n0.h.class) {
            try {
                hVar = f68335h;
                if (hVar == null) {
                    n0.g gVarI = i(context);
                    n0.f bVar = f68333f;
                    if (bVar == null) {
                        bVar = new n0.b();
                    }
                    hVar = new n0.h(gVarI, bVar);
                    f68335h = hVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
