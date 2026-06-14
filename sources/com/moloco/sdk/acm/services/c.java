package com.moloco.sdk.acm.services;

import androidx.lifecycle.Lifecycle;
import eg.o0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements com.moloco.sdk.acm.services.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f54099d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lifecycle f54100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApplicationLifecycleObserver f54101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AtomicBoolean f54102c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54103r;

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
            return c.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f54103r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            if (c.this.f54102c.compareAndSet(false, true)) {
                d.f(d.f54105a, "ApplicationLifecycleTrackerServiceImpl", "Start observing application lifecycle events", false, 4, null);
                c.this.f54100a.addObserver(c.this.f54101b);
            }
            return Unit.f93236a;
        }
    }

    public c(Lifecycle lifecycle, ApplicationLifecycleObserver bgListener) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(bgListener, "bgListener");
        this.f54100a = lifecycle;
        this.f54101b = bgListener;
        this.f54102c = new AtomicBoolean(false);
    }

    @Override // com.moloco.sdk.acm.services.b
    public Object a(Continuation continuation) {
        Object objG = eg.g.g(o0.c().w(), new b(null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }
}
