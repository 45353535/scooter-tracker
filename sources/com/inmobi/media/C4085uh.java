package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: com.inmobi.media.uh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4085uh extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ref$ObjectRef f39689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f39691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4110vh f39692e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4085uh(C4110vh c4110vh, Continuation continuation) {
        super(2, continuation);
        this.f39692e = c4110vh;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C4085uh c4085uh = new C4085uh(this.f39692e, continuation);
        c4085uh.f39691d = obj;
        return c4085uh;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4085uh c4085uh = new C4085uh(this.f39692e, (Continuation) obj2);
        c4085uh.f39691d = (FlowCollector) obj;
        return c4085uh.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        String str;
        Ref$ObjectRef ref$ObjectRef;
        Object objG = pf.b.g();
        int i10 = this.f39690c;
        if (i10 == 0) {
            kotlin.d.b(obj);
            flowCollector = (FlowCollector) this.f39691d;
            str = Ji.f37159c;
            if (str == null) {
                return Unit.f93236a;
            }
            ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.f93280b = C4110vh.a(this.f39692e);
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = this.f39689b;
            str = this.f39688a;
            flowCollector = (FlowCollector) this.f39691d;
            kotlin.d.b(obj);
        }
        String accountId = str;
        FlowCollector flowCollector2 = flowCollector;
        while (!((Collection) ref$ObjectRef.f93280b).isEmpty()) {
            List configRequestContexts = (List) ref$ObjectRef.f93280b;
            ref$ObjectRef.f93280b = CollectionsKt.emptyList();
            Bh bh2 = (Bh) this.f39692e.f39782b.getValue();
            C3774i4 c3774i4 = Y3.f38021a;
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            RootConfig rootConfig = (RootConfig) Y3.f38021a.a(RootConfig.class);
            bh2.getClass();
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(rootConfig, "rootConfig");
            Intrinsics.checkNotNullParameter(configRequestContexts, "configRequestContexts");
            Flow flowJ = hg.i.j(new C4185yh(configRequestContexts, bh2, accountId, rootConfig, null));
            C4060th c4060th = new C4060th(this.f39692e, flowCollector2, ref$ObjectRef);
            this.f39691d = flowCollector2;
            this.f39688a = accountId;
            this.f39689b = ref$ObjectRef;
            this.f39690c = 1;
            if (flowJ.collect(c4060th, this) == objG) {
                return objG;
            }
        }
        return Unit.f93236a;
    }
}
