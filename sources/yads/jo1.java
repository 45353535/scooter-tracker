package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class jo1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f112419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f112420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a f112421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f112422e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo1(List list, com.monetization.ads.mediation.base.initialize.a aVar, Context context, Continuation continuation) {
        super(2, continuation);
        this.f112420c = list;
        this.f112421d = aVar;
        this.f112422e = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        jo1 jo1Var = new jo1(this.f112420c, this.f112421d, this.f112422e, continuation);
        jo1Var.f112419b = obj;
        return jo1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jo1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f112419b;
        List list = this.f112420c;
        com.monetization.ads.mediation.base.initialize.a aVar = this.f112421d;
        Context context = this.f112422e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eg.i.d(coroutineScope, null, null, new io1(aVar, context, (cp1) it.next(), null), 3, null);
        }
        return Unit.f93236a;
    }
}
