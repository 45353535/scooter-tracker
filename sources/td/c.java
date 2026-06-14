package td;

import android.os.Environment;
import android.os.StatFs;
import eg.k0;
import eg.m1;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.g;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.i;
import pd.x;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f105147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1311c f105148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f105149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f105150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f105151e;

    public interface a {
        void a(b bVar);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f105152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f105153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final double f105154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final double f105155d;

        public b(long j10, long j11) {
            this.f105152a = j10;
            this.f105153b = j11;
            double d10 = j10 == 0 ? 0.0d : j11 / j10;
            this.f105154c = d10;
            this.f105155d = ((double) 1) - d10;
        }

        public final double a() {
            return this.f105154c;
        }

        public final double b() {
            return this.f105155d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f105152a == bVar.f105152a && this.f105153b == bVar.f105153b;
        }

        public int hashCode() {
            return (androidx.collection.b.a(this.f105152a) * 31) + androidx.collection.b.a(this.f105153b);
        }

        public String toString() {
            return "StorageSpaceStat(totalBytes=" + this.f105152a + ", availableBytes=" + this.f105153b + ')';
        }
    }

    /* JADX INFO: renamed from: td.c$c, reason: collision with other inner class name */
    public interface InterfaceC1311c {
        b a();
    }

    public static final class d implements InterfaceC1311c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f105156a;

        public d(File targetDir) {
            Intrinsics.checkNotNullParameter(targetDir, "targetDir");
            this.f105156a = targetDir;
        }

        @Override // td.c.InterfaceC1311c
        public b a() {
            try {
                StatFs statFs = new StatFs(this.f105156a.getAbsolutePath());
                return new b(statFs.getTotalBytes(), statFs.getAvailableBytes());
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ x f105157f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(x xVar) {
            super(0);
            this.f105157f = xVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineScope invoke() {
            return i.a(m1.b(null, 1, null).plus(this.f105157f.e()));
        }
    }

    static final class f extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f105158r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f105159s;

        f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            f fVar = c.this.new f(continuation);
            fVar.f105159s = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object objG = pf.b.g();
            int i10 = this.f105158r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                coroutineScope = (CoroutineScope) this.f105159s;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.f105159s;
                kotlin.d.b(obj);
            }
            while (i.i(coroutineScope)) {
                c cVar = c.this;
                try {
                    Result.Companion companion = Result.f93230c;
                    cVar.d();
                    Result.b(Unit.f93236a);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.f93230c;
                    Result.b(kotlin.d.a(th2));
                }
                long j10 = c.this.f105147a;
                this.f105159s = coroutineScope;
                this.f105158r = 1;
                if (k0.b(j10, this) == objG) {
                    return objG;
                }
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public /* synthetic */ c(double d10, x xVar, long j10, InterfaceC1311c interfaceC1311c, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, xVar, j10, interfaceC1311c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        b bVarA = this.f105148b.a();
        if (bVarA != null && bVarA.a() < this.f105151e) {
            Iterator it = this.f105149c.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(bVarA);
            }
        }
    }

    private final CoroutineScope e() {
        return (CoroutineScope) this.f105150d.getValue();
    }

    public final void c(a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f105149c.add(listener);
    }

    public final b f() {
        return this.f105148b.a();
    }

    public final void g() {
        h();
        eg.i.d(e(), null, null, new f(null), 3, null);
    }

    public final void h() {
        a0.j(e().getCoroutineContext(), null, 1, null);
    }

    private c(double d10, x xVar, long j10, InterfaceC1311c interfaceC1311c) {
        this.f105147a = j10;
        this.f105148b = interfaceC1311c;
        this.f105149c = new CopyOnWriteArraySet();
        this.f105150d = lf.i.a(new e(xVar));
        this.f105151e = g.l(d10, 0.0d, 1.0d);
    }

    public /* synthetic */ c(double d10, x xVar, long j10, InterfaceC1311c interfaceC1311c, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        double d11 = (i10 & 1) != 0 ? 0.1d : d10;
        x xVarA = (i10 & 2) != 0 ? x.f98252g.a() : xVar;
        if ((i10 & 4) != 0) {
            b.a aVar = kotlin.time.b.f93560c;
            j10 = kotlin.time.c.s(10, cg.b.f6839f);
        }
        long j11 = j10;
        if ((i10 & 8) != 0) {
            File dataDirectory = Environment.getDataDirectory();
            Intrinsics.checkNotNullExpressionValue(dataDirectory, "getDataDirectory()");
            interfaceC1311c = new d(dataDirectory);
        }
        this(d11, xVarA, j11, interfaceC1311c, null);
    }
}
