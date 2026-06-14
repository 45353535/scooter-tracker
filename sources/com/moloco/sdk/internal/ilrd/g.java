package com.moloco.sdk.internal.ilrd;

import android.content.Context;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.d;
import com.moloco.sdk.internal.ilrd.i;
import com.moloco.sdk.internal.services.bidtoken.providers.q;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import lf.m;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f54403f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f54404g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f54405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IlrdEventsRepository f54406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f54407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f54408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Job f54409e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54410r;

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
            return g.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f54410r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            List<d> listB = g.this.b();
            g gVar = g.this;
            for (d dVar : listB) {
                i iVar = (i) dVar.getState().getValue();
                if (iVar instanceof i.a) {
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "IlrdService", "Failed to subscribe to " + dVar.a() + " ILRD: " + ((i.a) iVar).a(), null, false, 12, null);
                } else if (iVar instanceof i.c) {
                    gVar.d(dVar);
                } else if (!(iVar instanceof i.b)) {
                    throw new m();
                }
            }
            return Unit.f93236a;
        }
    }

    public static final class c extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54412r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f54413s;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d.a aVar, Continuation continuation) {
            return ((c) create(aVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = g.this.new c(continuation);
            cVar.f54413s = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f54412r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            d.a aVar = (d.a) this.f54413s;
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdService", "Revenue event: " + aVar, null, false, 12, null);
            g.this.f54406b.l(aVar);
            return Unit.f93236a;
        }
    }

    public g(CoroutineScope scope, final Context context, IlrdEventsRepository eventsRepository, final List supportedNetworksList) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventsRepository, "eventsRepository");
        Intrinsics.checkNotNullParameter(supportedNetworksList, "supportedNetworksList");
        this.f54405a = scope;
        this.f54406b = eventsRepository;
        this.f54407c = lf.i.a(new Function0() { // from class: com.moloco.sdk.internal.ilrd.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.c(supportedNetworksList, context, this);
            }
        });
        this.f54408d = DesugarCollections.synchronizedSet(new LinkedHashSet());
    }

    public static final List c(List list, Context context, g gVar) {
        ArrayList arrayList = new ArrayList();
        if (list.contains(Init$SDKInitResponse.e.MAX)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdService", "Adding AppLovin as ILRD provider", null, false, 12, null);
            arrayList.add(new com.moloco.sdk.internal.ilrd.provider.c(context, gVar.f54405a));
        }
        if (list.contains(Init$SDKInitResponse.e.LEVEL_PLAY)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdService", "Adding IronSource as ILRD provider", null, false, 12, null);
            arrayList.add(new com.moloco.sdk.internal.ilrd.provider.f(context, gVar.f54405a));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final List b() {
        return (List) this.f54407c.getValue();
    }

    public final void d(d dVar) {
        Object objB = dVar.b();
        Throwable thG = Result.g(objB);
        if (thG != null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "IlrdService", "Failed to subscribe to " + dVar.a() + " ILRD: " + thG, null, false, 12, null);
        }
        if (Result.j(objB)) {
            this.f54408d.add(dVar);
            hg.i.F(hg.i.K(dVar.c(), new c(null)), this.f54405a);
        }
    }

    public final q f() {
        q qVarB;
        IlrdEventsRepository ilrdEventsRepository = this.f54406b;
        ilrdEventsRepository.t();
        com.moloco.sdk.internal.ilrd.a session = ilrdEventsRepository.getSession();
        if (session != null && (qVarB = h.b(session)) != null) {
            return qVarB;
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "IlrdService", "provideDataForBidToken() Session is null", null, false, 12, null);
        return null;
    }

    public final synchronized void h() {
        Job job = this.f54409e;
        if (job == null || !job.isActive()) {
            this.f54409e = eg.i.d(this.f54405a, null, null, new b(null), 3, null);
        }
    }
}
