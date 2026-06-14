package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class j62 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f112244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f112245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f112246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k62 f112247e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j62(k62 k62Var, List list, Continuation continuation) {
        super(2, continuation);
        this.f112246d = list;
        this.f112247e = k62Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        j62 j62Var = new j62(this.f112247e, this.f112246d, continuation);
        j62Var.f112245c = obj;
        return j62Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j62) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f112244b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f112245c;
            List<xb3> list = this.f112246d;
            k62 k62Var = this.f112247e;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (xb3 xb3Var : list) {
                arrayList.add(xb3Var.f117777b.f111940a ? eg.i.b(coroutineScope, null, null, new i62(k62Var, xb3Var, null), 3, null) : eg.r.a(CollectionsKt.listOf(xb3Var)));
            }
            this.f112244b = 1;
            obj = eg.d.a(arrayList, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        return CollectionsKt.flatten((Iterable) obj);
    }
}
