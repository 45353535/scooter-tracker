package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.View;
import android.view.Window;
import androidx.core.view.ViewCompat;
import io.sentry.android.replay.q;
import io.sentry.android.replay.r;
import io.sentry.android.replay.util.s;
import io.sentry.android.replay.viewhierarchy.b;
import io.sentry.android.replay.x;
import io.sentry.g7;
import io.sentry.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f83112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v7 f83113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f83114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.android.replay.util.d f83115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f83116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.sentry.android.replay.util.j f83117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Lazy f83118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Bitmap f83119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Lazy f83120i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Lazy f83121j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f83122k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Lazy f83123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f83124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f83125n;

    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f83127g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Canvas f83128h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, Canvas canvas) {
            super(1);
            this.f83127g = list;
            this.f83128h = canvas;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(io.sentry.android.replay.viewhierarchy.b node) {
            Pair pair;
            Integer numI;
            Intrinsics.checkNotNullParameter(node, "node");
            if (node.c() && node.e() > 0 && node.b() > 0) {
                if (node.d() == null) {
                    return Boolean.FALSE;
                }
                if (node instanceof b.c) {
                    List listListOf = CollectionsKt.listOf(node.d());
                    k kVar = k.this;
                    pair = TuplesKt.to(listListOf, Integer.valueOf(kVar.r(kVar.f83119h, node.d())));
                } else {
                    boolean z10 = node instanceof b.d;
                    int iIntValue = ViewCompat.MEASURED_STATE_MASK;
                    if (z10) {
                        b.d dVar = (b.d) node;
                        io.sentry.android.replay.util.r rVarJ = dVar.j();
                        if ((rVarJ != null && (numI = rVarJ.b()) != null) || (numI = dVar.i()) != null) {
                            iIntValue = numI.intValue();
                        }
                        pair = TuplesKt.to(s.d(dVar.j(), node.d(), dVar.k(), dVar.l()), Integer.valueOf(iIntValue));
                    } else {
                        pair = TuplesKt.to(CollectionsKt.listOf(node.d()), Integer.valueOf(ViewCompat.MEASURED_STATE_MASK));
                    }
                }
                List list = (List) pair.component1();
                k.this.s().setColor(((Number) pair.component2()).intValue());
                Canvas canvas = this.f83128h;
                k kVar2 = k.this;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    canvas.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, kVar2.s());
                }
                if (k.this.f83113b.getReplayController().m()) {
                    this.f83127g.addAll(list);
                }
            }
            return Boolean.TRUE;
        }
    }

    static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f83129f = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            return new Paint();
        }
    }

    static final class c extends Lambda implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Matrix invoke() {
            Matrix matrix = new Matrix();
            k kVar = k.this;
            matrix.preScale(kVar.f83114c.e(), kVar.f83114c.f());
            return matrix;
        }
    }

    static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f83131f = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke() {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            return bitmapCreateBitmap;
        }
    }

    static final class e extends Lambda implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Canvas invoke() {
            return new Canvas(k.this.u());
        }
    }

    public k(io.sentry.android.replay.b executorProvider, q qVar, v7 options, r config, io.sentry.android.replay.util.d debugOverlayDrawable) {
        Intrinsics.checkNotNullParameter(executorProvider, "executorProvider");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(debugOverlayDrawable, "debugOverlayDrawable");
        this.f83112a = qVar;
        this.f83113b = options;
        this.f83114c = config;
        this.f83115d = debugOverlayDrawable;
        this.f83116e = executorProvider.o();
        this.f83117f = executorProvider.m();
        lf.l lVar = lf.l.f94211d;
        this.f83118g = lf.i.b(lVar, d.f83131f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(config.d(), config.c(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        this.f83119h = bitmapCreateBitmap;
        this.f83120i = lf.i.b(lVar, new e());
        this.f83121j = lf.i.b(lVar, new c());
        this.f83122k = new AtomicBoolean(false);
        this.f83123l = lf.i.b(lVar, b.f83129f);
        this.f83124m = new AtomicBoolean(false);
        this.f83125n = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final k kVar, final View view, int i10) {
        if (kVar.f83125n.get()) {
            kVar.f83113b.getLogger().c(g7.DEBUG, "PixelCopyStrategy is closed, ignoring capture result", new Object[0]);
            return;
        }
        if (i10 != 0) {
            kVar.f83113b.getLogger().c(g7.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i10));
            kVar.f83122k.set(false);
        } else if (kVar.f83124m.get()) {
            kVar.f83113b.getLogger().c(g7.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
            kVar.f83122k.set(false);
        } else {
            final io.sentry.android.replay.viewhierarchy.b bVarA = io.sentry.android.replay.viewhierarchy.b.f83226m.a(view, null, 0, kVar.f83113b);
            s.k(view, bVarA, kVar.f83113b);
            kVar.f83116e.submit(new io.sentry.android.replay.util.n("screenshot_recorder.mask", new Runnable() { // from class: io.sentry.android.replay.screenshot.i
                @Override // java.lang.Runnable
                public final void run() {
                    k.o(this.f83106b, bVarA, view);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(final k kVar, io.sentry.android.replay.viewhierarchy.b bVar, final View view) {
        if (kVar.f83125n.get() || kVar.f83119h.isRecycled()) {
            kVar.f83113b.getLogger().c(g7.DEBUG, "PixelCopyStrategy is closed, skipping masking", new Object[0]);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        Canvas canvas = new Canvas(kVar.f83119h);
        canvas.setMatrix(kVar.t());
        bVar.h(kVar.new a(arrayList, canvas));
        if (kVar.f83113b.getReplayController().m()) {
            kVar.f83117f.b(new Runnable() { // from class: io.sentry.android.replay.screenshot.j
                @Override // java.lang.Runnable
                public final void run() {
                    k.p(this.f83109b, view, arrayList);
                }
            });
        }
        q qVar = kVar.f83112a;
        if (qVar != null) {
            qVar.d(kVar.f83119h);
        }
        kVar.f83122k.set(true);
        kVar.f83124m.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(k kVar, View view, List list) {
        if (kVar.f83115d.getCallback() == null) {
            view.getOverlay().add(kVar.f83115d);
        }
        kVar.f83115d.b(list);
        view.postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(k kVar) {
        if (!kVar.f83119h.isRecycled()) {
            synchronized (kVar.f83119h) {
                try {
                    if (!kVar.f83119h.isRecycled()) {
                        kVar.f83119h.recycle();
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (kVar.u().isRecycled()) {
            return;
        }
        kVar.u().recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r(Bitmap bitmap, Rect rect) {
        if (this.f83125n.get() || bitmap.isRecycled() || u().isRecycled()) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        Rect rect2 = new Rect(rect);
        RectF rectF = new RectF(rect2);
        t().mapRect(rectF);
        rectF.round(rect2);
        v().drawBitmap(bitmap, rect2, new Rect(0, 0, 1, 1), (Paint) null);
        return u().getPixel(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Paint s() {
        return (Paint) this.f83123l.getValue();
    }

    private final Matrix t() {
        return (Matrix) this.f83121j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap u() {
        return (Bitmap) this.f83118g.getValue();
    }

    private final Canvas v() {
        return (Canvas) this.f83120i.getValue();
    }

    @Override // io.sentry.android.replay.screenshot.l
    public void a(final View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        Window windowA = x.a(root);
        if (windowA == null) {
            this.f83113b.getLogger().c(g7.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (this.f83125n.get()) {
            this.f83113b.getLogger().c(g7.DEBUG, "PixelCopyStrategy is closed, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.f83124m.set(false);
            PixelCopy.request(windowA, this.f83119h, new PixelCopy$OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.g
                public final void onPixelCopyFinished(int i10) {
                    k.n(this.f83103a, root, i10);
                }
            }, this.f83117f.a());
        } catch (Throwable th2) {
            this.f83113b.getLogger().a(g7.WARNING, "Failed to capture replay recording", th2);
            this.f83122k.set(false);
        }
    }

    @Override // io.sentry.android.replay.screenshot.l
    public boolean b() {
        return this.f83122k.get();
    }

    @Override // io.sentry.android.replay.screenshot.l
    public void c() {
        q qVar;
        if (!b() || this.f83119h.isRecycled() || (qVar = this.f83112a) == null) {
            return;
        }
        qVar.d(this.f83119h);
    }

    @Override // io.sentry.android.replay.screenshot.l
    public void close() {
        this.f83125n.set(true);
        this.f83116e.submit(new io.sentry.android.replay.util.n("PixelCopyStrategy.close", new Runnable() { // from class: io.sentry.android.replay.screenshot.h
            @Override // java.lang.Runnable
            public final void run() {
                k.q(this.f83105b);
            }
        }));
    }

    @Override // io.sentry.android.replay.screenshot.l
    public void onContentChanged() {
        this.f83124m.set(true);
    }
}
