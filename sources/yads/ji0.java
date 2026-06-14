package yads;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class ji0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f112355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f112356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ki0 f112357d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji0(ki0 ki0Var, List list, Continuation continuation) {
        super(2, continuation);
        this.f112356c = list;
        this.f112357d = ki0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        ji0 ji0Var = new ji0(this.f112357d, this.f112356c, continuation);
        ji0Var.f112355b = obj;
        return ji0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ji0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f112355b;
        List list = this.f112356c;
        ki0 ki0Var = this.f112357d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eg.i.d(coroutineScope, null, null, new ii0(ki0Var, (String) it.next(), null), 3, null);
        }
        return Unit.f93236a;
    }
}
