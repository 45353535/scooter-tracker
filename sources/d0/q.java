package d0;

import android.content.Context;
import android.content.res.Resources;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import vh.l0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f68378a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f68379b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f68380c = {80, 75, 3, 4};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f68381d = {Ascii.US, -117, 8};

    public static com.airbnb.lottie.q A(final Context context, final String str, final String str2) {
        return h(str2, new Callable() { // from class: d0.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q.b(context, str, str2);
            }
        }, null);
    }

    public static z B(Context context, ZipInputStream zipInputStream, String str) {
        return C(context, zipInputStream, str, true);
    }

    public static z C(Context context, ZipInputStream zipInputStream, String str, boolean z10) {
        try {
            return D(context, zipInputStream, str);
        } finally {
            if (z10) {
                q0.p.c(zipInputStream);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x014b A[Catch: IOException -> 0x02b0, TryCatch #4 {IOException -> 0x02b0, blocks: (B:7:0x0019, B:9:0x001f, B:12:0x0028, B:14:0x0034, B:75:0x017b, B:15:0x0039, B:17:0x0045, B:18:0x004a, B:20:0x0056, B:21:0x006f, B:24:0x0079, B:26:0x0081, B:28:0x0089, B:31:0x0093, B:33:0x009b, B:36:0x00a4, B:37:0x00a9, B:39:0x00bb, B:41:0x00dc, B:70:0x0141, B:72:0x014b, B:73:0x0168, B:69:0x0120, B:74:0x016c, B:5:0x000f, B:42:0x00e5, B:53:0x0106, B:68:0x011f, B:67:0x011c, B:64:0x0117, B:43:0x00ea, B:52:0x0103, B:63:0x0116, B:62:0x0113), top: B:131:0x000f, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static d0.z D(android.content.Context r13, java.util.zip.ZipInputStream r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.q.D(android.content.Context, java.util.zip.ZipInputStream, java.lang.String):d0.z");
    }

    private static Boolean E(vh.g gVar) {
        return H(gVar, f68381d);
    }

    private static boolean F(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean G(vh.g gVar) {
        return H(gVar, f68380c);
    }

    private static Boolean H(vh.g gVar, byte[] bArr) {
        try {
            vh.g gVarPeek = gVar.peek();
            for (byte b10 : bArr) {
                if (gVarPeek.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            gVarPeek.close();
            return Boolean.TRUE;
        } catch (Exception e10) {
            q0.g.b("Failed to check zip file header", e10);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    private static void I(boolean z10) {
        ArrayList arrayList = new ArrayList(f68379b);
        if (arrayList.size() <= 0) {
            return;
        }
        androidx.privacysandbox.ads.adservices.topics.a.a(arrayList.get(0));
        throw null;
    }

    private static String J(Context context, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(F(context) ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }

    public static /* synthetic */ void a(String str, AtomicBoolean atomicBoolean, Throwable th2) {
        Map map = f68378a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            I(true);
        }
    }

    public static /* synthetic */ z b(Context context, String str, String str2) {
        z zVarC = e.j(context).c(context, str, str2);
        if (str2 != null && zVarC.b() != null) {
            j0.g.b().c(str2, (i) zVarC.b());
        }
        return zVarC;
    }

    public static /* synthetic */ z c(WeakReference weakReference, Context context, int i10, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return y(context, i10, str);
    }

    public static /* synthetic */ void g(String str, AtomicBoolean atomicBoolean, i iVar) {
        Map map = f68378a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            I(true);
        }
    }

    private static com.airbnb.lottie.q h(final String str, Callable callable, Runnable runnable) {
        i iVarA = str == null ? null : j0.g.b().a(str);
        com.airbnb.lottie.q qVar = iVarA != null ? new com.airbnb.lottie.q(iVarA) : null;
        if (str != null) {
            Map map = f68378a;
            if (map.containsKey(str)) {
                qVar = (com.airbnb.lottie.q) map.get(str);
            }
        }
        if (qVar != null) {
            if (runnable != null) {
                runnable.run();
            }
            return qVar;
        }
        com.airbnb.lottie.q qVar2 = new com.airbnb.lottie.q(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            qVar2.d(new w() { // from class: d0.n
                @Override // d0.w
                public final void onResult(Object obj) {
                    q.g(str, atomicBoolean, (i) obj);
                }
            });
            qVar2.c(new w() { // from class: d0.o
                @Override // d0.w
                public final void onResult(Object obj) {
                    q.a(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map map2 = f68378a;
                map2.put(str, qVar2);
                if (map2.size() == 1) {
                    I(false);
                }
            }
        }
        return qVar2;
    }

    private static v i(i iVar, String str) {
        for (v vVar : iVar.j().values()) {
            if (vVar.c().equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public static com.airbnb.lottie.q j(Context context, String str) {
        return k(context, str, "asset_" + str);
    }

    public static com.airbnb.lottie.q k(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return h(str2, new Callable() { // from class: d0.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q.m(applicationContext, str, str2);
            }
        }, null);
    }

    public static z l(Context context, String str) {
        return m(context, str, "asset_" + str);
    }

    public static z m(Context context, String str, String str2) {
        i iVarA = str2 == null ? null : j0.g.b().a(str2);
        if (iVarA != null) {
            return new z(iVarA);
        }
        try {
            return n(context, context.getAssets().open(str), str2);
        } catch (IOException e10) {
            return new z((Throwable) e10);
        }
    }

    public static z n(Context context, InputStream inputStream, String str) {
        i iVarA = str == null ? null : j0.g.b().a(str);
        if (iVarA != null) {
            return new z(iVarA);
        }
        try {
            vh.g gVarD = vh.x.d(vh.x.k(inputStream));
            return G(gVarD).booleanValue() ? B(context, new ZipInputStream(gVarD.inputStream()), str) : E(gVarD).booleanValue() ? p(new GZIPInputStream(gVarD.inputStream()), str) : r(p0.c.n(gVarD), str);
        } catch (IOException e10) {
            return new z((Throwable) e10);
        }
    }

    public static com.airbnb.lottie.q o(final InputStream inputStream, final String str) {
        return h(str, new Callable() { // from class: d0.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q.p(inputStream, str);
            }
        }, new Runnable() { // from class: d0.l
            @Override // java.lang.Runnable
            public final void run() {
                q0.p.c(inputStream);
            }
        });
    }

    public static z p(InputStream inputStream, String str) {
        return q(inputStream, str, true);
    }

    public static z q(InputStream inputStream, String str, boolean z10) {
        return u(vh.x.k(inputStream), str, z10);
    }

    public static z r(p0.c cVar, String str) {
        return s(cVar, str, true);
    }

    public static z s(p0.c cVar, String str, boolean z10) {
        return t(cVar, str, z10);
    }

    private static z t(p0.c cVar, String str, boolean z10) {
        i iVarA;
        try {
            if (str == null) {
                iVarA = null;
            } else {
                try {
                    iVarA = j0.g.b().a(str);
                } catch (Exception e10) {
                    z zVar = new z((Throwable) e10);
                    if (z10) {
                        q0.p.c(cVar);
                    }
                    return zVar;
                }
            }
            if (iVarA != null) {
                z zVar2 = new z(iVarA);
                if (z10) {
                    q0.p.c(cVar);
                }
                return zVar2;
            }
            i iVarA2 = o0.w.a(cVar);
            if (str != null) {
                j0.g.b().c(str, iVarA2);
            }
            z zVar3 = new z(iVarA2);
            if (z10) {
                q0.p.c(cVar);
            }
            return zVar3;
        } catch (Throwable th2) {
            if (z10) {
                q0.p.c(cVar);
            }
            throw th2;
        }
    }

    public static z u(l0 l0Var, String str, boolean z10) {
        return t(p0.c.n(vh.x.d(l0Var)), str, z10);
    }

    public static com.airbnb.lottie.q v(Context context, int i10) {
        return w(context, i10, J(context, i10));
    }

    public static com.airbnb.lottie.q w(Context context, final int i10, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return h(str, new Callable() { // from class: d0.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q.c(weakReference, applicationContext, i10, str);
            }
        }, null);
    }

    public static z x(Context context, int i10) {
        return y(context, i10, J(context, i10));
    }

    public static z y(Context context, int i10, String str) {
        i iVarA = str == null ? null : j0.g.b().a(str);
        if (iVarA != null) {
            return new z(iVarA);
        }
        try {
            vh.g gVarD = vh.x.d(vh.x.k(context.getResources().openRawResource(i10)));
            if (G(gVarD).booleanValue()) {
                return B(context, new ZipInputStream(gVarD.inputStream()), str);
            }
            if (!E(gVarD).booleanValue()) {
                return r(p0.c.n(gVarD), str);
            }
            try {
                return p(new GZIPInputStream(gVarD.inputStream()), str);
            } catch (IOException e10) {
                return new z((Throwable) e10);
            }
        } catch (Resources.NotFoundException e11) {
            return new z((Throwable) e11);
        }
    }

    public static com.airbnb.lottie.q z(Context context, String str) {
        return A(context, str, "url_" + str);
    }
}
