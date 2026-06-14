package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.Surface;
import android.view.View;
import androidx.core.view.ViewCompat;
import io.sentry.android.replay.q;
import io.sentry.android.replay.r;
import io.sentry.g1;
import io.sentry.g7;
import io.sentry.v7;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.android.replay.b f83088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f83089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v7 f83090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f83091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Bitmap f83092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicReference f83093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.util.a f83094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Lazy f83095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f83096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final o f83097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f83098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SurfaceTexture f83099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Surface f83100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f83101n;

    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Matrix invoke() {
            Matrix matrix = new Matrix();
            f fVar = f.this;
            matrix.preScale(fVar.f83091d.e(), fVar.f83091d.f());
            return matrix;
        }
    }

    public f(io.sentry.android.replay.b executor, q qVar, v7 options, r config) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f83088a = executor;
        this.f83089b = qVar;
        this.f83090c = options;
        this.f83091d = config;
        this.f83093f = new AtomicReference(null);
        this.f83094g = new io.sentry.util.a();
        this.f83095h = lf.i.b(lf.l.f94211d, new a());
        this.f83096i = new AtomicBoolean(false);
        this.f83097j = new o();
        this.f83098k = new AtomicBoolean(false);
        SurfaceTexture surfaceTextureA = io.sentry.android.replay.screenshot.a.a(false);
        surfaceTextureA.setDefaultBufferSize(config.d(), config.c());
        this.f83099l = surfaceTextureA;
        this.f83100m = new Surface(surfaceTextureA);
        io.sentry.util.o.a("ReplayCanvasStrategy");
        this.f83101n = new Runnable() { // from class: io.sentry.android.replay.screenshot.c
            @Override // java.lang.Runnable
            public final void run() {
                f.j(this.f83085b);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(f fVar) {
        Bitmap bitmap = fVar.f83092e;
        if (bitmap != null) {
            synchronized (bitmap) {
                try {
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        fVar.f83100m.release();
        fVar.f83099l.release();
    }

    private final Matrix i() {
        return (Matrix) this.f83095h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final f fVar) {
        if (fVar.f83098k.get()) {
            fVar.f83090c.getLogger().c(g7.DEBUG, "Canvas Strategy already closed, skipping picture render", new Object[0]);
            return;
        }
        Picture picture = (Picture) fVar.f83093f.getAndSet(null);
        if (picture == null) {
            return;
        }
        try {
            Canvas canvasLockHardwareCanvas = fVar.f83100m.lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.drawColor(ViewCompat.MEASURED_STATE_MASK, PorterDuff.Mode.CLEAR);
                picture.draw(canvasLockHardwareCanvas);
                fVar.f83100m.unlockCanvasAndPost(canvasLockHardwareCanvas);
                if (fVar.f83092e == null) {
                    g1 g1VarD = fVar.f83094g.d();
                    try {
                        if (fVar.f83092e == null) {
                            fVar.f83092e = Bitmap.createBitmap(fVar.f83091d.d(), fVar.f83091d.c(), Bitmap.Config.ARGB_8888);
                        }
                        Unit unit = Unit.f93236a;
                        wf.a.a(g1VarD, null);
                    } finally {
                    }
                }
                if (fVar.f83098k.get()) {
                    fVar.f83090c.getLogger().c(g7.DEBUG, "Canvas Strategy already closed, skipping pixel copy request", new Object[0]);
                    return;
                }
                Surface surface = fVar.f83100m;
                Bitmap bitmap = fVar.f83092e;
                Intrinsics.checkNotNull(bitmap);
                PixelCopy.request(surface, bitmap, new PixelCopy$OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.e
                    public final void onPixelCopyFinished(int i10) {
                        f.k(this.f83087a, i10);
                    }
                }, fVar.f83088a.n());
            } catch (Throwable th2) {
                fVar.f83100m.unlockCanvasAndPost(canvasLockHardwareCanvas);
                throw th2;
            }
        } catch (Throwable th3) {
            fVar.f83090c.getLogger().a(g7.ERROR, "Canvas Strategy: picture render failed", th3);
            fVar.f83096i.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(f fVar, int i10) {
        q qVar;
        if (fVar.f83098k.get()) {
            fVar.f83090c.getLogger().c(g7.DEBUG, "CanvasStrategy is closed, ignoring capture result", new Object[0]);
            return;
        }
        if (i10 == 0) {
            fVar.f83096i.set(true);
            Bitmap bitmap = fVar.f83092e;
            if (bitmap == null || bitmap.isRecycled() || (qVar = fVar.f83089b) == null) {
                return;
            }
            qVar.d(bitmap);
            return;
        }
        fVar.f83090c.getLogger().c(g7.ERROR, "Canvas Strategy: PixelCopy failed with code " + i10, new Object[0]);
        fVar.f83096i.set(false);
    }

    @Override // io.sentry.android.replay.screenshot.l
    public void a(View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        if (this.f83098k.get()) {
            return;
        }
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(this.f83091d.d(), this.f83091d.c());
        Intrinsics.checkNotNullExpressionValue(canvasBeginRecording, "beginRecording(...)");
        this.f83097j.e(canvasBeginRecording);
        this.f83097j.setMatrix(i());
        root.draw(this.f83097j);
        picture.endRecording();
        if (this.f83098k.get()) {
            return;
        }
        this.f83093f.set(picture);
        l(this.f83088a.n(), new io.sentry.android.replay.util.n("screenshot_recorder.canvas", this.f83101n));
    }

    @Override // io.sentry.android.replay.screenshot.l
    public boolean b() {
        return this.f83096i.get();
    }

    @Override // io.sentry.android.replay.screenshot.l
    public void c() {
        Bitmap bitmap;
        q qVar;
        if (!b() || (bitmap = this.f83092e) == null || bitmap.isRecycled() || (qVar = this.f83089b) == null) {
            return;
        }
        qVar.d(bitmap);
    }

    @Override // io.sentry.android.replay.screenshot.l
    public void close() {
        this.f83098k.set(true);
        l(this.f83088a.n(), new io.sentry.android.replay.util.n("CanvasStrategy.close", new Runnable() { // from class: io.sentry.android.replay.screenshot.d
            @Override // java.lang.Runnable
            public final void run() {
                f.h(this.f83086b);
            }
        }));
        this.f83093f.getAndSet(null);
    }

    public final void l(Handler handler, io.sentry.android.replay.util.n runnable) {
        Intrinsics.checkNotNullParameter(handler, "<this>");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        try {
            handler.post(runnable);
        } catch (Throwable th2) {
            this.f83090c.getLogger().a(g7.ERROR, "Canvas Strategy: failed to post runnable " + runnable.a(), th2);
        }
    }

    @Override // io.sentry.android.replay.screenshot.l
    public void onContentChanged() {
    }
}
