package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import io.sentry.android.replay.capture.h;
import io.sentry.android.replay.r;
import io.sentry.android.replay.util.n;
import io.sentry.b1;
import io.sentry.g7;
import io.sentry.j4;
import io.sentry.protocol.x;
import io.sentry.transport.p;
import io.sentry.v7;
import io.sentry.w7;
import io.sentry.y0;
import java.io.File;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import net.pubnative.lite.sdk.utils.AtomManager;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends io.sentry.android.replay.capture.a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f83000y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f83001z = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final v7 f83002v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final b1 f83003w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final p f83004x;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends Lambda implements Function1 {
        b() {
            super(1);
        }

        public final void a(h.c segment) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof h.c.a) {
                h.c.a aVar = (h.c.a) segment;
                h.c.a.b(aVar, m.this.f83003w, null, 2, null);
                m mVar = m.this;
                mVar.b(mVar.c() + 1);
                m.this.i(aVar.c().i0());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
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
                h.c.a.b((h.c.a) segment, m.this.f83003w, null, 2, null);
                m mVar = m.this;
                mVar.b(mVar.c() + 1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h.c) obj);
            return Unit.f93236a;
        }
    }

    static final class d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ File f83008g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(File file) {
            super(1);
            this.f83008g = file;
        }

        public final void a(h.c segment) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof h.c.a) {
                h.c.a.b((h.c.a) segment, m.this.f83003w, null, 2, null);
            }
            m.this.b(-1);
            io.sentry.util.h.a(this.f83008g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h.c) obj);
            return Unit.f93236a;
        }
    }

    public /* synthetic */ m(v7 v7Var, b1 b1Var, p pVar, ScheduledExecutorService scheduledExecutorService, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(v7Var, b1Var, pVar, scheduledExecutorService, (i10 & 16) != 0 ? null : function1);
    }

    private final void G(String str, final Function1 function1) {
        final r rVarQ = q();
        if (rVarQ == null) {
            this.f83002v.getLogger().c(g7.DEBUG, "Recorder config is not set, not creating segment for task: " + str, new Object[0]);
            return;
        }
        long currentTimeMillis = this.f83004x.getCurrentTimeMillis();
        final Date dateV = v();
        if (dateV == null) {
            return;
        }
        final long time = currentTimeMillis - dateV.getTime();
        final x xVarG = g();
        r().submit(new n("SessionCaptureStrategy." + str, new Runnable() { // from class: io.sentry.android.replay.capture.i
            @Override // java.lang.Runnable
            public final void run() {
                m.H(this.f82989b, time, dateV, xVarG, rVarQ, function1);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(m mVar, long j10, Date date, x xVar, r rVar, Function1 function1) {
        function1.invoke(io.sentry.android.replay.capture.a.m(mVar, j10, date, xVar, mVar.c(), rVar.c(), rVar.d(), rVar.b(), rVar.a(), null, null, null, null, null, 7936, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(m mVar, Function2 function2, long j10, r rVar) {
        io.sentry.android.replay.h hVarN = mVar.n();
        if (hVarN != null) {
            function2.invoke(hVarN, Long.valueOf(j10));
        }
        Date dateV = mVar.v();
        if (dateV == null) {
            mVar.f83002v.getLogger().c(g7.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
            return;
        }
        if (mVar.w().get()) {
            mVar.f83002v.getLogger().c(g7.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
            return;
        }
        if (rVar == null) {
            mVar.f83002v.getLogger().c(g7.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
            return;
        }
        long currentTimeMillis = mVar.f83004x.getCurrentTimeMillis();
        if (currentTimeMillis - dateV.getTime() >= mVar.f83002v.getSessionReplay().m()) {
            h.c cVarM = io.sentry.android.replay.capture.a.m(mVar, mVar.f83002v.getSessionReplay().m(), dateV, mVar.g(), mVar.c(), rVar.c(), rVar.d(), rVar.b(), rVar.a(), null, null, null, null, null, 7936, null);
            if (cVarM instanceof h.c.a) {
                h.c.a aVar = (h.c.a) cVarM;
                h.c.a.b(aVar, mVar.f83003w, null, 2, null);
                mVar.b(mVar.c() + 1);
                mVar.i(aVar.c().i0());
            }
        }
        if (currentTimeMillis - mVar.s().get() >= mVar.f83002v.getSessionReplay().k()) {
            mVar.f83002v.getReplayController().stop();
            mVar.f83002v.getLogger().c(g7.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(m mVar, y0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.g(mVar.g());
        String strY = it.y();
        mVar.A(strY != null ? StringsKt.k1(strY, '.', null, 2, null) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(y0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.g(x.f84062c);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void a(r recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        G("onConfigurationChanged", new b());
        super.a(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.h
    public void d(Bitmap bitmap, final Function2 store) {
        Intrinsics.checkNotNullParameter(store, "store");
        final r rVarQ = q();
        final long currentTimeMillis = this.f83004x.getCurrentTimeMillis();
        r().submit(new n("SessionCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.l
            @Override // java.lang.Runnable
            public final void run() {
                m.I(this.f82996b, store, currentTimeMillis, rVarQ);
            }
        }));
    }

    @Override // io.sentry.android.replay.capture.h
    public h e() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void f(int i10, x replayId, w7.b bVar) {
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        super.f(i10, replayId, bVar);
        b1 b1Var = this.f83003w;
        if (b1Var != null) {
            b1Var.x(new j4() { // from class: io.sentry.android.replay.capture.j
                @Override // io.sentry.j4
                public final void a(y0 y0Var) {
                    m.J(this.f82995a, y0Var);
                }
            });
        }
    }

    @Override // io.sentry.android.replay.capture.h
    public void h(boolean z10, Function1 onSegmentSent) {
        Intrinsics.checkNotNullParameter(onSegmentSent, "onSegmentSent");
        if (this.f83002v.getSessionReplay().p()) {
            this.f83002v.getLogger().c(g7.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        w().set(z10);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void pause() {
        G("pause", new c());
        super.pause();
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void stop() throws Exception {
        io.sentry.android.replay.h hVarN = n();
        G(AtomManager.ATOM_STOP_METHOD_NAME, new d(hVarN != null ? hVarN.z() : null));
        b1 b1Var = this.f83003w;
        if (b1Var != null) {
            b1Var.x(new j4() { // from class: io.sentry.android.replay.capture.k
                @Override // io.sentry.j4
                public final void a(y0 y0Var) {
                    m.K(y0Var);
                }
            });
        }
        super.stop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(v7 options, b1 b1Var, p dateProvider, ScheduledExecutorService executor, Function1 function1) {
        super(options, b1Var, dateProvider, executor, function1);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f83002v = options;
        this.f83003w = b1Var;
        this.f83004x = dateProvider;
    }
}
