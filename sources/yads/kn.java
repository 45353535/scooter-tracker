package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class kn extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f112782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rn f112783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo f112784d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn(rn rnVar, zo zoVar, Continuation continuation) {
        super(2, continuation);
        this.f112783c = rnVar;
        this.f112784d = zoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new kn(this.f112783c, this.f112784d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new kn(this.f112783c, this.f112784d, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f112782b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        rn rnVar = this.f112783c;
        dz0 dz0Var = rnVar.f115516l;
        Context context = rnVar.f115505a;
        zo zoVar = this.f112784d;
        this.f112782b = 1;
        Object objA = dz0Var.a(context, zoVar, this);
        return objA == objG ? objG : objA;
    }
}
