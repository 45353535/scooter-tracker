package io.sentry.android.replay;

import android.view.View;
import android.view.ViewOverlay;
import android.view.ViewTreeObserver;
import io.sentry.g7;
import io.sentry.v4;
import io.sentry.v7;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f83066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v7 f83067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f83068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference f83069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f83070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.android.replay.util.d f83071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f83072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final io.sentry.android.replay.screenshot.l f83073i;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[v4.values().length];
            try {
                iArr[v4.CANVAS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v4.PIXEL_COPY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public p(r config, v7 options, b executorProvider, q qVar) {
        io.sentry.android.replay.screenshot.l fVar;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(executorProvider, "executorProvider");
        this.f83066b = config;
        this.f83067c = options;
        this.f83068d = executorProvider;
        this.f83070f = new AtomicBoolean(true);
        io.sentry.android.replay.util.d dVar = new io.sentry.android.replay.util.d();
        this.f83071g = dVar;
        this.f83072h = new AtomicBoolean(false);
        int i10 = a.$EnumSwitchMapping$0[options.getSessionReplay().i().ordinal()];
        if (i10 == 1) {
            fVar = new io.sentry.android.replay.screenshot.f(executorProvider, qVar, options, config);
        } else {
            if (i10 != 2) {
                throw new lf.m();
            }
            fVar = new io.sentry.android.replay.screenshot.k(executorProvider, qVar, options, config, dVar);
        }
        this.f83073i = fVar;
    }

    public final void a(View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        WeakReference weakReference = this.f83069e;
        f(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.f83069e;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f83069e = new WeakReference(root);
        io.sentry.android.replay.util.s.a(root, this);
        this.f83072h.set(true);
        this.f83073i.onContentChanged();
    }

    public final void b() {
        if (this.f83067c.getSessionReplay().p()) {
            this.f83067c.getLogger().c(g7.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(this.f83070f.get()));
        }
        if (!this.f83070f.get()) {
            if (this.f83067c.getSessionReplay().p()) {
                this.f83067c.getLogger().c(g7.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        if (this.f83067c.getSessionReplay().p()) {
            this.f83067c.getLogger().c(g7.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(this.f83072h.get()), Boolean.valueOf(this.f83073i.b()));
        }
        if (!this.f83072h.get()) {
            this.f83073i.c();
            return;
        }
        WeakReference weakReference = this.f83069e;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.f83067c.getLogger().c(g7.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (x.a(view) == null) {
            this.f83067c.getLogger().c(g7.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.f83072h.set(false);
            this.f83073i.a(view);
        } catch (Throwable th2) {
            this.f83067c.getLogger().a(g7.WARNING, "Failed to capture replay recording", th2);
        }
    }

    public final void c() {
        this.f83070f.set(false);
        WeakReference weakReference = this.f83069e;
        f(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.f83069e;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f83073i.close();
    }

    public final void d() {
        this.f83070f.set(false);
        WeakReference weakReference = this.f83069e;
        f(weakReference != null ? (View) weakReference.get() : null);
    }

    public final void e() {
        View view;
        WeakReference weakReference = this.f83069e;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            io.sentry.android.replay.util.s.a(view, this);
        }
        this.f83070f.set(true);
    }

    public final void f(View view) {
        ViewOverlay overlay;
        if (this.f83067c.getReplayController().m() && view != null && (overlay = view.getOverlay()) != null) {
            overlay.remove(this.f83071g);
        }
        if (view != null) {
            io.sentry.android.replay.util.s.h(view, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        if (this.f83070f.get()) {
            WeakReference weakReference = this.f83069e;
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.f83067c.getLogger().c(g7.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.f83072h.set(true);
                this.f83073i.onContentChanged();
            }
        }
    }
}
