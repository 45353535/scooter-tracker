package com.moloco.sdk.internal.ilrd;

import com.moloco.sdk.internal.MolocoLogger;
import eg.k0;
import java.text.SimpleDateFormat;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f54386f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f54387g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f54388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.i f54389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Job f54391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SimpleDateFormat f54392e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54393r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f54395t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1 f54396u;

        public static final class a extends k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f54397r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ e f54398s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ Function1 f54399t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, Function1 function1, Continuation continuation) {
                super(2, continuation);
                this.f54398s = eVar;
                this.f54399t = function1;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f54398s, this.f54399t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f54397r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdScheduler", "Task " + this.f54398s.f54390c + " invoked", null, false, 12, null);
                    Function1 function1 = this.f54399t;
                    this.f54397r = 1;
                    if (function1.invoke(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                return Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f54395t = j10;
            this.f54396u = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new b(this.f54395t, this.f54396u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f54393r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                String str = e.this.f54392e.format(kotlin.coroutines.jvm.internal.b.e(e.this.f54389b.a() + kotlin.time.b.q(this.f54395t)));
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdScheduler", "Task " + e.this.f54390c + " scheduled at " + str, null, false, 12, null);
                long j10 = this.f54395t;
                this.f54393r = 1;
                if (k0.b(j10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            eg.i.d(e.this.f54388a, null, null, new a(e.this, this.f54396u, null), 3, null);
            return Unit.f93236a;
        }
    }

    public e(CoroutineScope scope, com.moloco.sdk.internal.services.i timeProvider, String name) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f54388a = scope;
        this.f54389b = timeProvider;
        this.f54390c = name;
        this.f54392e = new SimpleDateFormat("HH:mm:ss");
    }

    public final synchronized void b(long j10, Function1 task) {
        Throwable th2;
        try {
            try {
                Intrinsics.checkNotNullParameter(task, "task");
                Job job = this.f54391d;
                if (job != null) {
                    try {
                        c(job);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                try {
                    this.f54391d = eg.i.d(this.f54388a, null, null, new b(j10, task, null), 3, null);
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final void c(Job job) {
        Intrinsics.checkNotNullParameter(job, "job");
        if (job.isActive()) {
            Job.a.a(job, null, 1, null);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdScheduler", "Task " + this.f54390c + " cancelled", null, false, 12, null);
        }
    }
}
