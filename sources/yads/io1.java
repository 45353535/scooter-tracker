package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class io1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f112068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a f112069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f112070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp1 f112071e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io1(com.monetization.ads.mediation.base.initialize.a aVar, Context context, cp1 cp1Var, Continuation continuation) {
        super(2, continuation);
        this.f112069c = aVar;
        this.f112070d = context;
        this.f112071e = cp1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new io1(this.f112069c, this.f112070d, this.f112071e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((io1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f112068b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            com.monetization.ads.mediation.base.initialize.a aVar = this.f112069c;
            Context context = this.f112070d;
            cp1 cp1Var = this.f112071e;
            this.f112068b = 1;
            AtomicBoolean atomicBoolean = com.monetization.ads.mediation.base.initialize.a.f59033g;
            if (aVar.a(context, cp1Var, this) == objG) {
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
