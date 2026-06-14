package com.moloco.sdk.internal.services.analytics;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l;
import eg.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements com.moloco.sdk.internal.services.analytics.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f55275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f55276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f55277c;

    public static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55278r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f55280t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, Continuation continuation) {
            super(2, continuation);
            this.f55280t = j10;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new a(this.f55280t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object objG = pf.b.g();
            int i10 = this.f55278r;
            if (i10 == 0) {
                d.b(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar2 = b.this.f55276b;
                long j10 = this.f55280t;
                a.AbstractC0780a.C0781a c0781a = a.AbstractC0780a.C0781a.f58905a;
                String strA = b.this.f55277c.a();
                this.f55278r = 1;
                aVar = this;
                obj = aVar2.a(j10, c0781a, strA, aVar);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
                aVar = this;
            }
            b.this.f55275a.a((String) obj);
            return Unit.f93236a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.services.analytics.b$b, reason: collision with other inner class name */
    public static final class C0680b extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55281r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f55283t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f55284u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0680b(long j10, long j11, Continuation continuation) {
            super(2, continuation);
            this.f55283t = j10;
            this.f55284u = j11;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C0680b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new C0680b(this.f55283t, this.f55284u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C0680b c0680b;
            Object objG = pf.b.g();
            int i10 = this.f55281r;
            if (i10 == 0) {
                d.b(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = b.this.f55276b;
                long j10 = this.f55283t;
                a.AbstractC0780a.b bVar = new a.AbstractC0780a.b(this.f55284u);
                String strD = b.this.f55277c.d();
                this.f55281r = 1;
                c0680b = this;
                obj = aVar.a(j10, bVar, strD, c0680b);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
                c0680b = this;
            }
            b.this.f55275a.a((String) obj);
            return Unit.f93236a;
        }
    }

    public b(l persistentHttpRequest, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b configService) {
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(configService, "configService");
        this.f55275a = persistentHttpRequest;
        this.f55276b = customUserEventBuilderService;
        this.f55277c = configService;
    }

    @Override // com.moloco.sdk.internal.services.analytics.a
    public void a(long j10, long j11) {
        if (!this.f55277c.c() || this.f55277c.d().length() <= 0) {
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AnalyticsService", "Recording applicationForeground with timestamp: " + j10 + ", lastBgTimestamp: " + j11, false, 4, null);
        i.d(com.moloco.sdk.internal.scheduling.d.f55261a.a(), null, null, new C0680b(j10, j11, null), 3, null);
    }

    @Override // com.moloco.sdk.internal.services.analytics.a
    public void a(long j10) {
        if (!this.f55277c.c() || this.f55277c.a().length() <= 0) {
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AnalyticsService", "Recording applicationBackground with timestamp: " + j10, false, 4, null);
        i.d(com.moloco.sdk.internal.scheduling.d.f55261a.a(), null, null, new a(j10, null), 3, null);
    }
}
