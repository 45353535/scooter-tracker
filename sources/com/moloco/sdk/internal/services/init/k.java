package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MediationInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.init.d f55663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f55664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f55665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Init$SDKInitResponse f55666d;

    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55667r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55668s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f55669t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f55670u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f55671v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f55673x;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55671v = obj;
            this.f55673x |= Integer.MIN_VALUE;
            return k.this.c(null, null, null, this);
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55674r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f55676t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ MediationInfo f55677u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f55678v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, MediationInfo mediationInfo, com.moloco.sdk.acm.recorder.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f55676t = str;
            this.f55677u = mediationInfo;
            this.f55678v = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return k.this.new b(this.f55676t, this.f55677u, this.f55678v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f55674r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitService", "Async fetching init response", null, false, 12, null);
                k kVar = k.this;
                String str = this.f55676t;
                MediationInfo mediationInfo = this.f55677u;
                com.moloco.sdk.acm.recorder.a aVar = this.f55678v;
                this.f55674r = 1;
                if (kVar.d(str, mediationInfo, aVar, true, this) == objG) {
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

    public static final class c extends kotlin.coroutines.jvm.internal.d {
        public int A;
        public /* synthetic */ Object B;
        public int D;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55679r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55680s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f55681t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f55682u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f55683v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f55684w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f55685x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f55686y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f55687z;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return k.this.d(null, null, null, false, this);
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55688r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55689s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f55690t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f55692v;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55690t = obj;
            this.f55692v |= Integer.MIN_VALUE;
            return k.this.a(null, null, this);
        }
    }

    public k(com.moloco.sdk.internal.services.init.d initApi, g initCache, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(initApi, "initApi");
        Intrinsics.checkNotNullParameter(initCache, "initCache");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f55663a = initApi;
        this.f55664b = initCache;
        this.f55665c = scope;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.internal.services.init.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r6, com.moloco.sdk.publisher.MediationInfo r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.init.k.a(java.lang.String, com.moloco.sdk.publisher.MediationInfo, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r24, com.moloco.sdk.publisher.MediationInfo r25, com.moloco.sdk.acm.recorder.a r26, kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.init.k.c(java.lang.String, com.moloco.sdk.publisher.MediationInfo, com.moloco.sdk.acm.recorder.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x02f6, code lost:
    
        if (r0.c(r2, r14, r1) == r3) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x036c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x034a -> B:79:0x0352). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r30, com.moloco.sdk.publisher.MediationInfo r31, com.moloco.sdk.acm.recorder.a r32, boolean r33, kotlin.coroutines.Continuation r34) {
        /*
            Method dump skipped, instruction units count: 931
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.init.k.d(java.lang.String, com.moloco.sdk.publisher.MediationInfo, com.moloco.sdk.acm.recorder.a, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.moloco.sdk.internal.services.init.j
    public Object a(Continuation continuation) {
        this.f55666d = null;
        Object objA = this.f55664b.a(continuation);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }
}
