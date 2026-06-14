package f1;

import android.content.Context;
import f1.q1;
import f1.q3;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes6.dex */
public final class i2 implements q1, q3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qb f70057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y3 f70058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f70059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineDispatcher f70060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f70061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Lazy f70062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g7 f70063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Job f70064h;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f70065f = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a8 invoke(Context c10) {
            Intrinsics.checkNotNullParameter(c10, "c");
            return new a8(c10, null, null, null, 14, null);
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f70066f = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap invoke() {
            return new ConcurrentHashMap();
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f70067r;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return i2.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f70067r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                long jS = i2.this.f70057a.s();
                this.f70067r = 1;
                if (eg.k0.a(jS, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            i2.this.f70064h = null;
            try {
                q1.a.a(i2.this, null, 0, false, 7, null);
            } catch (IllegalStateException e10) {
                eg.i("Cannot start download", e10);
            }
            return Unit.f93236a;
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f70069f = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap invoke() {
            return new ConcurrentHashMap();
        }
    }

    public i2(qb policy, y3 downloadManager, Function1 fileCachingFactory, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(fileCachingFactory, "fileCachingFactory");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f70057a = policy;
        this.f70058b = downloadManager;
        this.f70059c = fileCachingFactory;
        this.f70060d = dispatcher;
        this.f70061e = lf.i.a(b.f70066f);
        this.f70062f = lf.i.a(d.f70069f);
    }

    @Override // f1.q1
    public int a(c9 c9Var) {
        if (c9Var != null) {
            return p1.a(this.f70058b.d(c9Var.e()));
        }
        return 0;
    }

    @Override // f1.q1
    public c9 b(String filename) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        return (c9) g().get(filename);
    }

    @Override // f1.q3.a
    public void c(String uri, String videoFileName, g1.a aVar) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        eg.e("onError() - uri " + uri + ", videoFileName " + videoFileName + ", error " + aVar, null, 2, null);
        k().remove(uri);
    }

    @Override // f1.q1
    public void d(String url, String filename, boolean z10, e9 e9Var) {
        c9 c9VarE;
        c9 c9VarJ;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(filename, "filename");
        eg.e("downloadVideoFile() - url: " + url + ", filename: " + filename + ", showImmediately: " + z10 + ", callback: " + e9Var, null, 2, null);
        if (e9Var != null) {
            k().put(url, e9Var);
        }
        File fileM = m(filename);
        if (fileM == null || (c9VarE = e(fileM, url)) == null || (c9VarJ = j(c9VarE)) == null || l(c9VarJ) == null) {
            eg.e("downloadVideoFile() - cache file is null", null, 2, null);
        }
        q1.a.a(this, filename, 0, z10, 2, null);
    }

    public final c9 e(File file, String str) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        c9 c9Var = new c9(str, name, file, file.getParentFile(), 0L, null, 0L, 112, null);
        file.setLastModified(c9Var.a());
        return c9Var;
    }

    public final ConcurrentHashMap g() {
        return (ConcurrentHashMap) this.f70061e.getValue();
    }

    public final void i(c9 c9Var, x3 x3Var) {
        eg.e("sendDownloadToDownloadManager() - " + c9Var, null, 2, null);
        if (x3Var == x3.f71490d) {
            this.f70057a.a();
        }
        this.f70058b.d(c9Var, x3Var);
    }

    public final c9 j(c9 c9Var) {
        g().put(c9Var.e(), c9Var);
        return c9Var;
    }

    public final ConcurrentHashMap k() {
        return (ConcurrentHashMap) this.f70062f.getValue();
    }

    public final c9 l(c9 c9Var) {
        eg.e("queueDownload() - asset: " + c9Var, null, 2, null);
        i(c9Var, x3.f71491e);
        return c9Var;
    }

    public final File m(String str) {
        g7 g7Var = this.f70063g;
        if (g7Var != null) {
            return g7Var.a(str);
        }
        return null;
    }

    public final void n() {
        x3 x3Var;
        if (this.f70057a.q()) {
            o();
            x3Var = x3.f71492f;
        } else {
            x3Var = x3.f71490d;
        }
        if (x3Var == x3.f71490d) {
            this.f70057a.a();
        }
        this.f70058b.b(x3Var);
    }

    public final void o() {
        if (this.f70064h == null) {
            this.f70064h = eg.i.d(kotlinx.coroutines.i.a(this.f70060d), null, null, new c(null), 3, null);
        }
    }

    public final void p(c9 c9Var) {
        eg.e("startForcedDownload() - " + c9Var, null, 2, null);
        this.f70057a.a();
        this.f70058b.a(c9Var);
    }

    public final void q(c9 c9Var) {
        x3 x3Var;
        if (this.f70057a.q()) {
            o();
            x3Var = x3.f71492f;
        } else {
            x3Var = x3.f71490d;
        }
        i(c9Var, x3Var);
    }

    @Override // f1.q1
    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        eg.e("initialize()", null, 2, null);
        this.f70063g = (g7) this.f70059c.invoke(context);
        y3 y3Var = this.f70058b;
        y3Var.a();
        y3Var.c(this);
        y3Var.b();
    }

    @Override // f1.q3.a
    public void b(String url, String videoFileName, long j10, e9 e9Var) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        eg.e("tempFileIsReady() - url " + url + ", videoFileName " + videoFileName, null, 2, null);
        if (e9Var == null) {
            e9Var = (e9) k().get(url);
        }
        if (e9Var != null) {
            e9Var.a(url);
        }
    }

    public /* synthetic */ i2(qb qbVar, y3 y3Var, Function1 function1, CoroutineDispatcher coroutineDispatcher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(qbVar, y3Var, (i10 & 4) != 0 ? a.f70065f : function1, (i10 & 8) != 0 ? eg.o0.b() : coroutineDispatcher);
    }

    @Override // f1.q1
    public boolean a(String videoFilename) {
        Intrinsics.checkNotNullParameter(videoFilename, "videoFilename");
        return this.f70058b.a(videoFilename);
    }

    @Override // f1.q3.a
    public void a(String uri, String videoFileName) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        eg.e("onSuccess() - uri " + uri + ", videoFileName " + videoFileName, null, 2, null);
        k().remove(uri);
        q1.a.a(this, null, 0, false, 7, null);
    }

    @Override // f1.q1
    public void a(String str, int i10, boolean z10) {
        Unit unit;
        c9 c9Var;
        eg.e("startDownloadIfPossible() - filename " + str + ", forceDownload " + z10, null, 2, null);
        if (str == null || (c9Var = (c9) g().get(str)) == null) {
            unit = null;
        } else {
            eg.e("startDownloadIfPossible() - asset: " + c9Var, null, 2, null);
            if (z10) {
                p(c9Var);
            } else {
                q(c9Var);
            }
            unit = Unit.f93236a;
        }
        if (unit == null) {
            eg.e("startDownloadIfPossible() - null asset, resume next download in Download Manager index", null, 2, null);
            n();
        }
    }
}
