package io.sentry.android.replay;

import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewTreeObserver;
import io.sentry.ILogger;
import io.sentry.g1;
import io.sentry.g7;
import io.sentry.v7;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements f, e, io.sentry.android.replay.b, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v7 f83175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q f83176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t f83177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.android.replay.util.j f83178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f83179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f83180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f83181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Point f83182i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.sentry.util.a f83183j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final io.sentry.util.a f83184k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final io.sentry.util.a f83185l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile a f83186m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile HandlerThread f83187n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile Handler f83188o;

    private static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v7 f83189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.sentry.android.replay.util.j f83190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p f83191d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private r f83192e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final AtomicBoolean f83193f;

        public a(v7 options, io.sentry.android.replay.util.j mainLooperHandler) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
            this.f83189b = options;
            this.f83190c = mainLooperHandler;
            this.f83193f = new AtomicBoolean(true);
        }

        public final p a() {
            return this.f83191d;
        }

        public final void b() {
            p pVar = this.f83191d;
            if (pVar != null) {
                pVar.d();
            }
            this.f83193f.getAndSet(false);
        }

        public final void d() {
            if (this.f83189b.getSessionReplay().p()) {
                this.f83189b.getLogger().c(g7.DEBUG, "Resuming the capture runnable.", new Object[0]);
            }
            p pVar = this.f83191d;
            if (pVar != null) {
                pVar.e();
            }
            this.f83193f.getAndSet(true);
            this.f83190c.d(this);
            if (this.f83190c.b(this)) {
                return;
            }
            this.f83189b.getLogger().c(g7.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
        }

        public final void e(r rVar) {
            this.f83192e = rVar;
        }

        public final void f(p pVar) {
            this.f83191d = pVar;
        }

        public final void g() {
            p pVar = this.f83191d;
            if (pVar != null) {
                pVar.c();
            }
            this.f83191d = null;
            this.f83193f.getAndSet(false);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f83193f.get()) {
                if (this.f83189b.getSessionReplay().p()) {
                    this.f83189b.getLogger().c(g7.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
                    return;
                }
                return;
            }
            try {
                if (this.f83189b.getSessionReplay().p()) {
                    this.f83189b.getLogger().c(g7.DEBUG, "Capturing a frame.", new Object[0]);
                }
                p pVar = this.f83191d;
                if (pVar != null) {
                    pVar.b();
                }
            } catch (Throwable th2) {
                this.f83189b.getLogger().a(g7.ERROR, "Failed to capture a frame", th2);
            }
            if (this.f83189b.getSessionReplay().p()) {
                ILogger logger = this.f83189b.getLogger();
                g7 g7Var = g7.DEBUG;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Posting the capture runnable again, frame rate is ");
                r rVar = this.f83192e;
                sb2.append(rVar != null ? rVar.b() : 1);
                sb2.append(" fps.");
                logger.c(g7Var, sb2.toString(), new Object[0]);
            }
            io.sentry.android.replay.util.j jVar = this.f83190c;
            r rVar2 = this.f83192e;
            if (jVar.c(this, 1000 / ((long) (rVar2 != null ? rVar2.b() : 1)))) {
                return;
            }
            this.f83189b.getLogger().c(g7.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }
    }

    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f83195c;

        b(View view) {
            this.f83195c = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            WeakReference weakReference = (WeakReference) CollectionsKt.lastOrNull((List) v.this.f83181h);
            if (!Intrinsics.areEqual(this.f83195c, weakReference != null ? (View) weakReference.get() : null)) {
                io.sentry.android.replay.util.s.i(this.f83195c, this);
                return true;
            }
            if (io.sentry.android.replay.util.s.e(this.f83195c)) {
                io.sentry.android.replay.util.s.i(this.f83195c, this);
                if (this.f83195c.getWidth() != v.this.f83182i.x && this.f83195c.getHeight() != v.this.f83182i.y) {
                    v.this.f83182i.set(this.f83195c.getWidth(), this.f83195c.getHeight());
                    v.this.f83177d.h(this.f83195c.getWidth(), this.f83195c.getHeight());
                }
            }
            return true;
        }
    }

    static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f83196f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(1);
            this.f83196f = view;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.areEqual(it.get(), this.f83196f));
        }
    }

    public v(v7 options, q qVar, t windowCallback, io.sentry.android.replay.util.j mainLooperHandler, ScheduledExecutorService replayExecutor) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(windowCallback, "windowCallback");
        Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
        Intrinsics.checkNotNullParameter(replayExecutor, "replayExecutor");
        this.f83175b = options;
        this.f83176c = qVar;
        this.f83177d = windowCallback;
        this.f83178e = mainLooperHandler;
        this.f83179f = replayExecutor;
        this.f83180g = new AtomicBoolean(false);
        this.f83181h = new ArrayList();
        this.f83182i = new Point();
        this.f83183j = new io.sentry.util.a();
        this.f83184k = new io.sentry.util.a();
        this.f83185l = new io.sentry.util.a();
    }

    @Override // io.sentry.android.replay.f
    public void a(r config) throws Exception {
        a aVar;
        p pVarA;
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.f83180g.get()) {
            if (this.f83186m == null) {
                g1 g1VarD = this.f83184k.d();
                try {
                    if (this.f83186m == null) {
                        this.f83186m = new a(this.f83175b, this.f83178e);
                    }
                    Unit unit = Unit.f93236a;
                    wf.a.a(g1VarD, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        wf.a.a(g1VarD, th2);
                        throw th3;
                    }
                }
            }
            a aVar2 = this.f83186m;
            if (aVar2 != null) {
                aVar2.e(config);
            }
            a aVar3 = this.f83186m;
            if (aVar3 != null) {
                aVar3.f(new p(config, this.f83175b, this, this.f83176c));
            }
            WeakReference weakReference = (WeakReference) CollectionsKt.lastOrNull((List) this.f83181h);
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view != null && (aVar = this.f83186m) != null && (pVarA = aVar.a()) != null) {
                pVarA.a(view);
            }
            this.f83178e.d(this.f83186m);
            if (this.f83178e.c(this.f83186m, 100L)) {
                return;
            }
            this.f83175b.getLogger().c(g7.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.e
    public void c(View root, boolean z10) throws Exception {
        p pVarA;
        p pVarA2;
        p pVarA3;
        Intrinsics.checkNotNullParameter(root, "root");
        g1 g1VarD = this.f83183j.d();
        try {
            if (!z10) {
                a aVar = this.f83186m;
                if (aVar != null && (pVarA2 = aVar.a()) != null) {
                    pVarA2.f(root);
                }
                CollectionsKt.removeAll((List) this.f83181h, (Function1) new c(root));
                WeakReference weakReference = (WeakReference) CollectionsKt.lastOrNull((List) this.f83181h);
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null && !Intrinsics.areEqual(root, view)) {
                    a aVar2 = this.f83186m;
                    if (aVar2 != null && (pVarA = aVar2.a()) != null) {
                        pVarA.a(view);
                    }
                    h(view);
                }
            } else {
                if (x.a(root) == null) {
                    this.f83175b.getLogger().c(g7.WARNING, "Root view does not have a phone window, skipping.", new Object[0]);
                    wf.a.a(g1VarD, null);
                    return;
                }
                this.f83181h.add(new WeakReference(root));
                a aVar3 = this.f83186m;
                if (aVar3 != null && (pVarA3 = aVar3.a()) != null) {
                    pVarA3.a(root);
                }
                h(root);
            }
            Unit unit = Unit.f93236a;
            wf.a.a(g1VarD, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                wf.a.a(g1VarD, th2);
                throw th3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        reset();
        this.f83178e.d(this.f83186m);
        g1 g1VarD = this.f83185l.d();
        try {
            Handler handler = this.f83188o;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = this.f83187n;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            wf.a.a(g1VarD, null);
            stop();
        } finally {
        }
    }

    public final void h(View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        if (!io.sentry.android.replay.util.s.e(root)) {
            io.sentry.android.replay.util.s.b(root, new b(root));
            return;
        }
        if (root.getWidth() != this.f83182i.x) {
            int height = root.getHeight();
            Point point = this.f83182i;
            if (height != point.y) {
                point.set(root.getWidth(), root.getHeight());
                this.f83177d.h(root.getWidth(), root.getHeight());
            }
        }
    }

    @Override // io.sentry.android.replay.b
    public io.sentry.android.replay.util.j m() {
        return this.f83178e;
    }

    @Override // io.sentry.android.replay.b
    public Handler n() throws Exception {
        if (this.f83188o == null) {
            g1 g1VarD = this.f83185l.d();
            try {
                if (this.f83188o == null) {
                    this.f83187n = new HandlerThread("SentryReplayBackgroundProcessing");
                    HandlerThread handlerThread = this.f83187n;
                    if (handlerThread != null) {
                        handlerThread.start();
                    }
                    HandlerThread handlerThread2 = this.f83187n;
                    Intrinsics.checkNotNull(handlerThread2);
                    this.f83188o = new Handler(handlerThread2.getLooper());
                }
                Unit unit = Unit.f93236a;
                wf.a.a(g1VarD, null);
            } finally {
            }
        }
        Handler handler = this.f83188o;
        Intrinsics.checkNotNull(handler);
        return handler;
    }

    @Override // io.sentry.android.replay.b
    public ScheduledExecutorService o() {
        return this.f83179f;
    }

    @Override // io.sentry.android.replay.f
    public void pause() {
        a aVar = this.f83186m;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // io.sentry.android.replay.f
    public void reset() throws Exception {
        p pVarA;
        this.f83182i.set(0, 0);
        g1 g1VarD = this.f83183j.d();
        try {
            for (WeakReference weakReference : this.f83181h) {
                a aVar = this.f83186m;
                if (aVar != null && (pVarA = aVar.a()) != null) {
                    pVarA.f((View) weakReference.get());
                }
            }
            this.f83181h.clear();
            Unit unit = Unit.f93236a;
            wf.a.a(g1VarD, null);
        } finally {
        }
    }

    @Override // io.sentry.android.replay.f
    public void resume() {
        a aVar = this.f83186m;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // io.sentry.android.replay.f
    public void start() {
        this.f83180g.getAndSet(true);
    }

    @Override // io.sentry.android.replay.f
    public void stop() throws Exception {
        a aVar = this.f83186m;
        if (aVar != null) {
            aVar.g();
        }
        g1 g1VarD = this.f83184k.d();
        try {
            this.f83186m = null;
            Unit unit = Unit.f93236a;
            wf.a.a(g1VarD, null);
            this.f83180g.set(false);
        } finally {
        }
    }
}
