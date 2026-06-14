package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import io.sentry.android.replay.capture.h;
import io.sentry.android.replay.r;
import io.sentry.android.replay.util.n;
import io.sentry.b1;
import io.sentry.g7;
import io.sentry.protocol.x;
import io.sentry.transport.p;
import io.sentry.v7;
import io.sentry.w7;
import java.util.Date;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements io.sentry.android.replay.capture.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v7 f82876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b1 f82877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f82878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f82879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Function1 f82880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Lazy f82881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.sentry.android.replay.gestures.b f82882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f82883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private io.sentry.android.replay.h f82884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final kotlin.properties.e f82885k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final kotlin.properties.e f82886l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicLong f82887m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final kotlin.properties.e f82888n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final kotlin.properties.e f82889o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final kotlin.properties.e f82890p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final kotlin.properties.e f82891q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Deque f82892r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f82874t = {v0.f(new g0(a.class, "recorderConfig", "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0)), v0.f(new g0(a.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0)), v0.f(new g0(a.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0)), v0.f(new g0(a.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0)), v0.f(new g0(a.class, "currentSegment", "getCurrentSegment()I", 0)), v0.f(new g0(a.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0))};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0994a f82873s = new C0994a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f82875u = 8;

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$a, reason: collision with other inner class name */
    public static final class C0994a {
        public /* synthetic */ C0994a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0994a() {
        }
    }

    private static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f82893a;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r10) {
            Intrinsics.checkNotNullParameter(r10, "r");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryReplayPersister-");
            int i10 = this.f82893a;
            this.f82893a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(r10, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    static final class c extends Lambda implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final io.sentry.android.replay.util.m invoke() {
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new b());
            Intrinsics.checkNotNull(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
            return new io.sentry.android.replay.util.m(scheduledExecutorServiceNewSingleThreadScheduledExecutor, a.this.f82876b);
        }
    }

    public static final class d implements kotlin.properties.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicReference f82895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f82896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f82897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f82898d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f82899e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$d$a, reason: collision with other inner class name */
        public static final class RunnableC0995a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0 f82900b;

            public RunnableC0995a(Function0 function0) {
                this.f82900b = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f82900b.invoke();
            }
        }

        public static final class b extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f82901f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Object f82902g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Object f82903h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ a f82904i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ String f82905j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f82901f = str;
                this.f82902g = obj;
                this.f82903h = obj2;
                this.f82904i = aVar;
                this.f82905j = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                m7803invoke();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m7803invoke() throws Exception {
                Object obj = this.f82903h;
                io.sentry.android.replay.h hVarN = this.f82904i.n();
                if (hVarN != null) {
                    hVarN.M(this.f82905j, String.valueOf(obj));
                }
            }
        }

        public d(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f82896b = aVar;
            this.f82897c = str;
            this.f82898d = aVar2;
            this.f82899e = str2;
            this.f82895a = new AtomicReference(obj);
        }

        private final void a(Function0 function0) {
            if (this.f82896b.f82876b.getThreadChecker().a()) {
                this.f82896b.p().submit(new n("CaptureStrategy.runInBackground", new RunnableC0995a(function0)));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th2) {
                this.f82896b.f82876b.getLogger().a(g7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // kotlin.properties.e, kotlin.properties.d
        public Object getValue(Object obj, KProperty property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f82895a.get();
        }

        @Override // kotlin.properties.e
        public void setValue(Object obj, KProperty property, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            Object andSet = this.f82895a.getAndSet(obj2);
            if (Intrinsics.areEqual(andSet, obj2)) {
                return;
            }
            a(new b(this.f82897c, andSet, obj2, this.f82898d, this.f82899e));
        }
    }

    public static final class e implements kotlin.properties.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicReference f82906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f82907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f82908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f82909d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f82910e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$e$a, reason: collision with other inner class name */
        public static final class RunnableC0996a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0 f82911b;

            public RunnableC0996a(Function0 function0) {
                this.f82911b = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f82911b.invoke();
            }
        }

        public static final class b extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f82912f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Object f82913g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Object f82914h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ a f82915i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ String f82916j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f82912f = str;
                this.f82913g = obj;
                this.f82914h = obj2;
                this.f82915i = aVar;
                this.f82916j = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                m7804invoke();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m7804invoke() throws Exception {
                Object obj = this.f82914h;
                io.sentry.android.replay.h hVarN = this.f82915i.n();
                if (hVarN != null) {
                    hVarN.M(this.f82916j, String.valueOf(obj));
                }
            }
        }

        public e(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f82907b = aVar;
            this.f82908c = str;
            this.f82909d = aVar2;
            this.f82910e = str2;
            this.f82906a = new AtomicReference(obj);
        }

        private final void a(Function0 function0) {
            if (this.f82907b.f82876b.getThreadChecker().a()) {
                this.f82907b.p().submit(new n("CaptureStrategy.runInBackground", new RunnableC0996a(function0)));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th2) {
                this.f82907b.f82876b.getLogger().a(g7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // kotlin.properties.e, kotlin.properties.d
        public Object getValue(Object obj, KProperty property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f82906a.get();
        }

        @Override // kotlin.properties.e
        public void setValue(Object obj, KProperty property, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            Object andSet = this.f82906a.getAndSet(obj2);
            if (Intrinsics.areEqual(andSet, obj2)) {
                return;
            }
            a(new b(this.f82908c, andSet, obj2, this.f82909d, this.f82910e));
        }
    }

    public static final class f implements kotlin.properties.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicReference f82917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f82918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f82919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f82920d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f82921e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$f$a, reason: collision with other inner class name */
        public static final class RunnableC0997a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0 f82922b;

            public RunnableC0997a(Function0 function0) {
                this.f82922b = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f82922b.invoke();
            }
        }

        public static final class b extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f82923f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Object f82924g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Object f82925h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ a f82926i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ String f82927j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f82923f = str;
                this.f82924g = obj;
                this.f82925h = obj2;
                this.f82926i = aVar;
                this.f82927j = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                m7805invoke();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m7805invoke() throws Exception {
                Object obj = this.f82925h;
                io.sentry.android.replay.h hVarN = this.f82926i.n();
                if (hVarN != null) {
                    hVarN.M(this.f82927j, String.valueOf(obj));
                }
            }
        }

        public f(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f82918b = aVar;
            this.f82919c = str;
            this.f82920d = aVar2;
            this.f82921e = str2;
            this.f82917a = new AtomicReference(obj);
        }

        private final void a(Function0 function0) {
            if (this.f82918b.f82876b.getThreadChecker().a()) {
                this.f82918b.p().submit(new n("CaptureStrategy.runInBackground", new RunnableC0997a(function0)));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th2) {
                this.f82918b.f82876b.getLogger().a(g7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // kotlin.properties.e, kotlin.properties.d
        public Object getValue(Object obj, KProperty property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f82917a.get();
        }

        @Override // kotlin.properties.e
        public void setValue(Object obj, KProperty property, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            Object andSet = this.f82917a.getAndSet(obj2);
            if (Intrinsics.areEqual(andSet, obj2)) {
                return;
            }
            a(new b(this.f82919c, andSet, obj2, this.f82920d, this.f82921e));
        }
    }

    public static final class g implements kotlin.properties.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicReference f82928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f82929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f82930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f82931d;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$g$a, reason: collision with other inner class name */
        public static final class RunnableC0998a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0 f82932b;

            public RunnableC0998a(Function0 function0) {
                this.f82932b = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f82932b.invoke();
            }
        }

        public static final class b extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f82933f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Object f82934g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Object f82935h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ a f82936i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar) {
                super(0);
                this.f82933f = str;
                this.f82934g = obj;
                this.f82935h = obj2;
                this.f82936i = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                m7806invoke();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m7806invoke() throws Exception {
                Object obj = this.f82934g;
                r rVar = (r) this.f82935h;
                if (rVar == null) {
                    return;
                }
                io.sentry.android.replay.h hVarN = this.f82936i.n();
                if (hVarN != null) {
                    hVarN.M("config.height", String.valueOf(rVar.c()));
                }
                io.sentry.android.replay.h hVarN2 = this.f82936i.n();
                if (hVarN2 != null) {
                    hVarN2.M("config.width", String.valueOf(rVar.d()));
                }
                io.sentry.android.replay.h hVarN3 = this.f82936i.n();
                if (hVarN3 != null) {
                    hVarN3.M("config.frame-rate", String.valueOf(rVar.b()));
                }
                io.sentry.android.replay.h hVarN4 = this.f82936i.n();
                if (hVarN4 != null) {
                    hVarN4.M("config.bit-rate", String.valueOf(rVar.a()));
                }
            }
        }

        public g(Object obj, a aVar, String str, a aVar2) {
            this.f82929b = aVar;
            this.f82930c = str;
            this.f82931d = aVar2;
            this.f82928a = new AtomicReference(obj);
        }

        private final void a(Function0 function0) {
            if (this.f82929b.f82876b.getThreadChecker().a()) {
                this.f82929b.p().submit(new n("CaptureStrategy.runInBackground", new RunnableC0998a(function0)));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th2) {
                this.f82929b.f82876b.getLogger().a(g7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // kotlin.properties.e, kotlin.properties.d
        public Object getValue(Object obj, KProperty property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f82928a.get();
        }

        @Override // kotlin.properties.e
        public void setValue(Object obj, KProperty property, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            Object andSet = this.f82928a.getAndSet(obj2);
            if (Intrinsics.areEqual(andSet, obj2)) {
                return;
            }
            a(new b(this.f82930c, andSet, obj2, this.f82931d));
        }
    }

    public static final class h implements kotlin.properties.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicReference f82937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f82938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f82939c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f82940d;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$h$a, reason: collision with other inner class name */
        public static final class RunnableC0999a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0 f82941b;

            public RunnableC0999a(Function0 function0) {
                this.f82941b = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f82941b.invoke();
            }
        }

        public static final class b extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f82942f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Object f82943g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Object f82944h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ a f82945i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar) {
                super(0);
                this.f82942f = str;
                this.f82943g = obj;
                this.f82944h = obj2;
                this.f82945i = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                m7807invoke();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m7807invoke() throws Exception {
                Object obj = this.f82943g;
                Date date = (Date) this.f82944h;
                io.sentry.android.replay.h hVarN = this.f82945i.n();
                if (hVarN != null) {
                    hVarN.M("segment.timestamp", date == null ? null : io.sentry.l.h(date));
                }
            }
        }

        public h(Object obj, a aVar, String str, a aVar2) {
            this.f82938b = aVar;
            this.f82939c = str;
            this.f82940d = aVar2;
            this.f82937a = new AtomicReference(obj);
        }

        private final void a(Function0 function0) {
            if (this.f82938b.f82876b.getThreadChecker().a()) {
                this.f82938b.p().submit(new n("CaptureStrategy.runInBackground", new RunnableC0999a(function0)));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th2) {
                this.f82938b.f82876b.getLogger().a(g7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // kotlin.properties.e, kotlin.properties.d
        public Object getValue(Object obj, KProperty property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f82937a.get();
        }

        @Override // kotlin.properties.e
        public void setValue(Object obj, KProperty property, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            Object andSet = this.f82937a.getAndSet(obj2);
            if (Intrinsics.areEqual(andSet, obj2)) {
                return;
            }
            a(new b(this.f82939c, andSet, obj2, this.f82940d));
        }
    }

    public static final class i implements kotlin.properties.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicReference f82946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f82947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f82948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f82949d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f82950e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$i$a, reason: collision with other inner class name */
        public static final class RunnableC1000a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0 f82951b;

            public RunnableC1000a(Function0 function0) {
                this.f82951b = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f82951b.invoke();
            }
        }

        public static final class b extends Lambda implements Function0 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f82952f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Object f82953g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Object f82954h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ a f82955i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ String f82956j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f82952f = str;
                this.f82953g = obj;
                this.f82954h = obj2;
                this.f82955i = aVar;
                this.f82956j = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                m7808invoke();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m7808invoke() throws Exception {
                Object obj = this.f82954h;
                io.sentry.android.replay.h hVarN = this.f82955i.n();
                if (hVarN != null) {
                    hVarN.M(this.f82956j, String.valueOf(obj));
                }
            }
        }

        public i(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f82947b = aVar;
            this.f82948c = str;
            this.f82949d = aVar2;
            this.f82950e = str2;
            this.f82946a = new AtomicReference(obj);
        }

        private final void a(Function0 function0) {
            if (this.f82947b.f82876b.getThreadChecker().a()) {
                this.f82947b.p().submit(new n("CaptureStrategy.runInBackground", new RunnableC1000a(function0)));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th2) {
                this.f82947b.f82876b.getLogger().a(g7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // kotlin.properties.e, kotlin.properties.d
        public Object getValue(Object obj, KProperty property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.f82946a.get();
        }

        @Override // kotlin.properties.e
        public void setValue(Object obj, KProperty property, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            Object andSet = this.f82946a.getAndSet(obj2);
            if (Intrinsics.areEqual(andSet, obj2)) {
                return;
            }
            a(new b(this.f82948c, andSet, obj2, this.f82949d, this.f82950e));
        }
    }

    public a(v7 options, b1 b1Var, p dateProvider, ScheduledExecutorService replayExecutor, Function1 function1) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(replayExecutor, "replayExecutor");
        this.f82876b = options;
        this.f82877c = b1Var;
        this.f82878d = dateProvider;
        this.f82879e = replayExecutor;
        this.f82880f = function1;
        this.f82881g = lf.i.a(new c());
        this.f82882h = new io.sentry.android.replay.gestures.b(dateProvider);
        this.f82883i = new AtomicBoolean(false);
        this.f82885k = new g(null, this, "", this);
        this.f82886l = new h(null, this, "segment.timestamp", this);
        this.f82887m = new AtomicLong();
        this.f82888n = new i(null, this, "replay.screen-at-start", this, "replay.screen-at-start");
        this.f82889o = new d(x.f84062c, this, "replay.id", this, "replay.id");
        this.f82890p = new e(-1, this, "segment.id", this, "segment.id");
        this.f82891q = new f(null, this, "replay.type", this, "replay.type");
        this.f82892r = new ConcurrentLinkedDeque();
    }

    public static /* synthetic */ h.c m(a aVar, long j10, Date date, x xVar, int i10, int i11, int i12, int i13, int i14, w7.b bVar, io.sentry.android.replay.h hVar, String str, List list, Deque deque, int i15, Object obj) {
        Deque deque2;
        a aVar2;
        long j11;
        Date date2;
        x xVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSegmentInternal");
        }
        w7.b bVarT = (i15 & 256) != 0 ? aVar.t() : bVar;
        io.sentry.android.replay.h hVar2 = (i15 & 512) != 0 ? aVar.f82884j : hVar;
        String strU = (i15 & 1024) != 0 ? aVar.u() : str;
        List list2 = (i15 & 2048) != 0 ? null : list;
        if ((i15 & 4096) != 0) {
            deque2 = aVar.f82892r;
            aVar2 = aVar;
            date2 = date;
            xVar2 = xVar;
            i16 = i10;
            i17 = i11;
            i18 = i12;
            i19 = i13;
            i20 = i14;
            j11 = j10;
        } else {
            deque2 = deque;
            aVar2 = aVar;
            j11 = j10;
            date2 = date;
            xVar2 = xVar;
            i16 = i10;
            i17 = i11;
            i18 = i12;
            i19 = i13;
            i20 = i14;
        }
        return aVar2.l(j11, date2, xVar2, i16, i17, i18, i19, i20, bVarT, hVar2, strU, list2, deque2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduledExecutorService p() {
        return (ScheduledExecutorService) this.f82881g.getValue();
    }

    protected final void A(String str) {
        this.f82888n.setValue(this, f82874t[2], str);
    }

    @Override // io.sentry.android.replay.capture.h
    public void a(r recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        y(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.h
    public void b(int i10) {
        this.f82890p.setValue(this, f82874t[4], Integer.valueOf(i10));
    }

    @Override // io.sentry.android.replay.capture.h
    public int c() {
        return ((Number) this.f82890p.getValue(this, f82874t[4])).intValue();
    }

    @Override // io.sentry.android.replay.capture.h
    public void f(int i10, x replayId, w7.b bVar) {
        io.sentry.android.replay.h hVar;
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        Function1 function1 = this.f82880f;
        if (function1 == null || (hVar = (io.sentry.android.replay.h) function1.invoke(replayId)) == null) {
            hVar = new io.sentry.android.replay.h(this.f82876b, replayId);
        }
        this.f82884j = hVar;
        x(replayId);
        b(i10);
        if (bVar == null) {
            bVar = this instanceof m ? w7.b.SESSION : w7.b.BUFFER;
        }
        z(bVar);
        i(io.sentry.l.d());
        this.f82887m.set(this.f82878d.getCurrentTimeMillis());
    }

    @Override // io.sentry.android.replay.capture.h
    public x g() {
        return (x) this.f82889o.getValue(this, f82874t[3]);
    }

    @Override // io.sentry.android.replay.capture.h
    public void i(Date date) {
        this.f82886l.setValue(this, f82874t[1], date);
    }

    protected final h.c l(long j10, Date currentSegmentTimestamp, x replayId, int i10, int i11, int i12, int i13, int i14, w7.b replayType, io.sentry.android.replay.h hVar, String str, List list, Deque events) {
        Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "currentSegmentTimestamp");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        return io.sentry.android.replay.capture.h.f82982a.c(this.f82877c, this.f82876b, j10, currentSegmentTimestamp, replayId, i10, i11, i12, replayType, hVar, i13, i14, str, list, events);
    }

    protected final io.sentry.android.replay.h n() {
        return this.f82884j;
    }

    protected final Deque o() {
        return this.f82892r;
    }

    @Override // io.sentry.android.replay.capture.h
    public void onTouchEvent(MotionEvent event) {
        List listA;
        Intrinsics.checkNotNullParameter(event, "event");
        r rVarQ = q();
        if (rVarQ == null || (listA = this.f82882h.a(event, rVarQ)) == null) {
            return;
        }
        CollectionsKt.addAll(this.f82892r, listA);
    }

    @Override // io.sentry.android.replay.capture.h
    public void pause() {
    }

    public final r q() {
        return (r) this.f82885k.getValue(this, f82874t[0]);
    }

    protected final ScheduledExecutorService r() {
        return this.f82879e;
    }

    @Override // io.sentry.android.replay.capture.h
    public void resume() {
        i(io.sentry.l.d());
    }

    protected final AtomicLong s() {
        return this.f82887m;
    }

    @Override // io.sentry.android.replay.capture.h
    public void stop() throws Exception {
        io.sentry.android.replay.h hVar = this.f82884j;
        if (hVar != null) {
            hVar.close();
        }
        this.f82887m.set(0L);
        i(null);
        x EMPTY_ID = x.f84062c;
        Intrinsics.checkNotNullExpressionValue(EMPTY_ID, "EMPTY_ID");
        x(EMPTY_ID);
    }

    public w7.b t() {
        return (w7.b) this.f82891q.getValue(this, f82874t[5]);
    }

    protected final String u() {
        return (String) this.f82888n.getValue(this, f82874t[2]);
    }

    public Date v() {
        return (Date) this.f82886l.getValue(this, f82874t[1]);
    }

    protected final AtomicBoolean w() {
        return this.f82883i;
    }

    public void x(x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<set-?>");
        this.f82889o.setValue(this, f82874t[3], xVar);
    }

    public final void y(r rVar) {
        this.f82885k.setValue(this, f82874t[0], rVar);
    }

    public void z(w7.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f82891q.setValue(this, f82874t[5], bVar);
    }
}
