package yads;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class hi0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f111597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ki0 f111598c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi0(ki0 ki0Var, Continuation continuation) {
        super(2, continuation);
        this.f111598c = ki0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new hi0(this.f111598c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new hi0(this.f111598c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f111597b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            ki0 ki0Var = this.f111598c;
            AtomicBoolean atomicBoolean = ki0.f112708e;
            ki0Var.getClass();
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            String strA = m83.a(ki0Var.f112711c.a(ki0Var.f112710b));
            if (strA != null) {
                listCreateListBuilder.add(strA);
            }
            List listBuild = CollectionsKt.build(listCreateListBuilder);
            if (listBuild.isEmpty()) {
                boolean z10 = lb1.f113032a;
                return Unit.f93236a;
            }
            ki0 ki0Var2 = this.f111598c;
            this.f111597b = 1;
            ki0Var2.getClass();
            Object objC = eg.x1.c(2500L, new ji0(ki0Var2, listBuild, null), this);
            if (objC != pf.b.g()) {
                objC = Unit.f93236a;
            }
            if (objC == objG) {
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
