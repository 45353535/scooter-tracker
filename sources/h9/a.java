package h9;

import android.content.Context;
import de.h;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lf.i;
import pd.x;
import qd.a;
import td.c;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f72957a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f72958b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lazy f72959c = i.a(b.f72963f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f72960d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile qd.a f72961e;

    /* JADX INFO: renamed from: h9.a$a, reason: collision with other inner class name */
    public static final class C0893a implements c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ qd.a f72962a;

        C0893a(qd.a aVar) {
            this.f72962a = aVar;
        }

        @Override // td.c.a
        public void a(c.b storageSpaceStat) {
            Intrinsics.checkNotNullParameter(storageSpaceStat, "storageSpaceStat");
            this.f72962a.F();
        }
    }

    static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f72963f = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final td.c invoke() {
            return new td.c(0.0d, null, 0L, null, 15, null);
        }
    }

    private a() {
    }

    public static final qd.a b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        qd.a aVar = f72961e;
        if (aVar != null) {
            return aVar;
        }
        synchronized (f72960d) {
            qd.a aVar2 = f72961e;
            if (aVar2 != null) {
                return aVar2;
            }
            File file = new File(context.getNoBackupFilesDir(), "bm/renderer/cache");
            File file2 = new File(context.getCacheDir(), "bm/renderer/temp");
            h hVar = new h();
            x xVarA = x.f98252g.a();
            qd.a aVar3 = new qd.a(file, new sd.b(context, file2, null, xVarA, hVar, 4, null), f72957a.c(), xVarA, hVar);
            f72961e = aVar3;
            return aVar3;
        }
    }

    private final td.c c() {
        return (td.c) f72959c.getValue();
    }

    public final void a(Context context, a.c configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        b(context).t(configuration);
    }

    public final void d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f72958b.compareAndSet(false, true)) {
            c().c(new C0893a(b(context)));
            c().g();
        }
    }

    public final void e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        b(context).G();
    }
}
