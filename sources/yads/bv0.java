package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class bv0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f109122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f109123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f109124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dv0 f109125e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv0(List list, dv0 dv0Var, Continuation continuation) {
        super(2, continuation);
        this.f109124d = list;
        this.f109125e = dv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        bv0 bv0Var = new bv0(this.f109124d, this.f109125e, continuation);
        bv0Var.f109123c = obj;
        return bv0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((bv0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f109122b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f109123c;
        List list = this.f109124d;
        dv0 dv0Var = this.f109125e;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(eg.i.b(coroutineScope, null, null, new av0(dv0Var, (yk2) it.next(), null), 3, null));
        }
        this.f109122b = 1;
        Object objA = eg.d.a(arrayList, this);
        return objA == objG ? objG : objA;
    }
}
