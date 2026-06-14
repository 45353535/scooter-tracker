package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import io.sentry.android.replay.capture.h;
import io.sentry.android.replay.r;
import io.sentry.android.replay.util.n;
import io.sentry.android.replay.util.o;
import io.sentry.b1;
import io.sentry.g7;
import io.sentry.j4;
import io.sentry.protocol.x;
import io.sentry.transport.p;
import io.sentry.util.z;
import io.sentry.v7;
import io.sentry.w7;
import io.sentry.y0;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends io.sentry.android.replay.capture.a {
    public static final a A = new a(null);
    public static final int B = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final v7 f82969v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final b1 f82970w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final p f82971x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final z f82972y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List f82973z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f82975g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function1 function1) {
            super(1);
            this.f82975g = function1;
        }

        public final void a(h.c segment) throws InterruptedException {
            Intrinsics.checkNotNullParameter(segment, "segment");
            f fVar = f.this;
            fVar.J(fVar.f82973z);
            if (segment instanceof h.c.a) {
                h.c.a aVar = (h.c.a) segment;
                h.c.a.b(aVar, f.this.f82970w, null, 2, null);
                Function1 function1 = this.f82975g;
                Date dateI0 = aVar.c().i0();
                Intrinsics.checkNotNullExpressionValue(dateI0, "getTimestamp(...)");
                function1.invoke(dateI0);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws InterruptedException {
            a((h.c) obj);
            return Unit.f93236a;
        }
    }

    static final class c extends Lambda implements Function1 {
        c() {
            super(1);
        }

        public final void a(h.c segment) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof h.c.a) {
                f.this.f82973z.add(segment);
                f fVar = f.this;
                fVar.b(fVar.c() + 1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h.c) obj);
            return Unit.f93236a;
        }
    }

    static final class d extends Lambda implements Function1 {
        d() {
            super(1);
        }

        public final void a(h.c segment) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof h.c.a) {
                f.this.f82973z.add(segment);
                f fVar = f.this;
                fVar.b(fVar.c() + 1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h.c) obj);
            return Unit.f93236a;
        }
    }

    static final class e extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f82978f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f82979g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Ref$BooleanRef f82980h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, f fVar, Ref$BooleanRef ref$BooleanRef) {
            super(1);
            this.f82978f = j10;
            this.f82979g = fVar;
            this.f82980h = ref$BooleanRef;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(h.c.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.c().i0().getTime() >= this.f82978f) {
                return Boolean.FALSE;
            }
            this.f82979g.b(r0.c() - 1);
            this.f82979g.N(it.c().j0());
            this.f82980h.f93279b = true;
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(v7 options, b1 b1Var, p dateProvider, z random, ScheduledExecutorService executor, Function1 function1) {
        super(options, b1Var, dateProvider, executor, function1);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(random, "random");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f82969v = options;
        this.f82970w = b1Var;
        this.f82971x = dateProvider;
        this.f82972y = random;
        this.f82973z = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(List list) throws InterruptedException {
        h.c.a aVar = (h.c.a) CollectionsKt.removeFirstOrNull(list);
        while (aVar != null) {
            h.c.a.b(aVar, this.f82970w, null, 2, null);
            aVar = (h.c.a) CollectionsKt.removeFirstOrNull(list);
            Thread.sleep(100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(f fVar, y0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.g(fVar.g());
    }

    private final void L(String str, final Function1 function1) {
        final Date dateE;
        Long lS;
        final r rVarQ = q();
        if (rVarQ == null) {
            this.f82969v.getLogger().c(g7.DEBUG, "Recorder config is not set, not creating segment for task: " + str, new Object[0]);
            return;
        }
        long jC = this.f82969v.getSessionReplay().c();
        long currentTimeMillis = this.f82971x.getCurrentTimeMillis();
        io.sentry.android.replay.h hVarN = n();
        if (hVarN == null || (lS = hVarN.s()) == null || (dateE = io.sentry.l.e(lS.longValue())) == null) {
            dateE = io.sentry.l.e(currentTimeMillis - jC);
        }
        Intrinsics.checkNotNull(dateE);
        final long time = currentTimeMillis - dateE.getTime();
        final x xVarG = g();
        r().submit(new n("BufferCaptureStrategy." + str, new Runnable() { // from class: io.sentry.android.replay.capture.b
            @Override // java.lang.Runnable
            public final void run() {
                f.M(this.f82957b, time, dateE, xVarG, rVarQ, function1);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(f fVar, long j10, Date date, x xVar, r rVar, Function1 function1) {
        function1.invoke(io.sentry.android.replay.capture.a.m(fVar, j10, date, xVar, fVar.c(), rVar.c(), rVar.d(), rVar.b(), rVar.a(), null, null, null, null, null, 7936, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(File file) {
        if (file == null) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            this.f82969v.getLogger().c(g7.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
        } catch (Throwable th2) {
            this.f82969v.getLogger().b(g7.ERROR, th2, "Failed to delete replay segment: %s", file.getAbsolutePath());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(f fVar, Function2 function2, long j10) {
        io.sentry.android.replay.h hVarN = fVar.n();
        if (hVarN != null) {
            function2.invoke(hVarN, Long.valueOf(j10));
        }
        long currentTimeMillis = fVar.f82971x.getCurrentTimeMillis() - fVar.f82969v.getSessionReplay().c();
        io.sentry.android.replay.h hVarN2 = fVar.n();
        fVar.A(hVarN2 != null ? hVarN2.R(currentTimeMillis) : null);
        fVar.P(fVar.f82973z, currentTimeMillis);
    }

    private final void P(List list, long j10) {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        CollectionsKt.removeAll(list, (Function1) new e(j10, this, ref$BooleanRef));
        if (ref$BooleanRef.f93279b) {
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ((h.c.a) obj).d(i10);
                i10 = i11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(File file, f fVar) {
        io.sentry.util.h.a(file);
        fVar.b(-1);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void a(r recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        L("configuration_changed", new c());
        super.a(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.h
    public void d(Bitmap bitmap, final Function2 store) {
        Intrinsics.checkNotNullParameter(store, "store");
        final long currentTimeMillis = this.f82971x.getCurrentTimeMillis();
        r().submit(new n("BufferCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.e
            @Override // java.lang.Runnable
            public final void run() {
                f.O(this.f82966b, store, currentTimeMillis);
            }
        }));
    }

    @Override // io.sentry.android.replay.capture.h
    public h e() {
        if (w().get()) {
            this.f82969v.getLogger().c(g7.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        m mVar = new m(this.f82969v, this.f82970w, this.f82971x, r(), null, 16, null);
        mVar.y(q());
        mVar.f(c(), g(), w7.b.BUFFER);
        return mVar;
    }

    @Override // io.sentry.android.replay.capture.h
    public void h(boolean z10, Function1 onSegmentSent) {
        Intrinsics.checkNotNullParameter(onSegmentSent, "onSegmentSent");
        if (!o.a(this.f82972y, this.f82969v.getSessionReplay().g())) {
            this.f82969v.getLogger().c(g7.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        b1 b1Var = this.f82970w;
        if (b1Var != null) {
            b1Var.x(new j4() { // from class: io.sentry.android.replay.capture.c
                @Override // io.sentry.j4
                public final void a(y0 y0Var) {
                    f.K(this.f82963a, y0Var);
                }
            });
        }
        if (!z10) {
            L("capture_replay", new b(onSegmentSent));
        } else {
            w().set(true);
            this.f82969v.getLogger().c(g7.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onTouchEvent(event);
        h.a.h(h.f82982a, o(), this.f82971x.getCurrentTimeMillis() - this.f82969v.getSessionReplay().c(), null, 4, null);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void pause() {
        L("pause", new d());
        super.pause();
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void stop() throws Exception {
        io.sentry.android.replay.h hVarN = n();
        final File fileZ = hVarN != null ? hVarN.z() : null;
        r().submit(new n("BufferCaptureStrategy.stop", new Runnable() { // from class: io.sentry.android.replay.capture.d
            @Override // java.lang.Runnable
            public final void run() {
                f.Q(fileZ, this);
            }
        }));
        super.stop();
    }
}
