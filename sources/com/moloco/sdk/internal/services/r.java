package com.moloco.sdk.internal.services;

import androidx.lifecycle.Lifecycle;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f55708e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f55709f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lifecycle f55710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SingleObserverBackgroundThenForegroundAnalyticsListener f55711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f55712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f55713d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55714r;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return r.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f55714r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            r.this.d();
            return Unit.f93236a;
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55716r;

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
            return r.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f55716r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AnalyticsApplicationLifecycleTrackerImpl", "Tracking next bg / fg of the application", false, 4, null);
            r.this.d();
            r.this.f55711b.a();
            return Unit.f93236a;
        }
    }

    public r(Lifecycle lifecycle, SingleObserverBackgroundThenForegroundAnalyticsListener fgBgListener) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(fgBgListener, "fgBgListener");
        this.f55710a = lifecycle;
        this.f55711b = fgBgListener;
        this.f55712c = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().a());
    }

    @Override // com.moloco.sdk.internal.services.q
    public void b() {
        eg.i.d(this.f55712c, null, null, new c(null), 3, null);
    }

    public final void d() {
        if (this.f55713d) {
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AnalyticsApplicationLifecycleTrackerImpl", "Observing application lifecycle events", false, 4, null);
        this.f55710a.addObserver(this.f55711b);
        this.f55713d = true;
    }

    @Override // com.moloco.sdk.internal.services.q
    public void a() {
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AnalyticsApplicationLifecycleTrackerImpl", "Start observing application lifecycle events", false, 4, null);
        eg.i.d(this.f55712c, null, null, new b(null), 3, null);
    }
}
