package yads;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class rf2 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f115439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f115440c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf2(List list, Continuation continuation) {
        super(2, continuation);
        this.f115440c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new rf2(this.f115440c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new rf2(this.f115440c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f115439b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            List list = this.f115440c;
            this.f115439b = 1;
            obj = eg.d.a(list, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        return CollectionsKt.filterNotNull((Iterable) obj);
    }
}
