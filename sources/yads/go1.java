package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class go1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f111290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a f111291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f111292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zo f111293e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go1(com.monetization.ads.mediation.base.initialize.a aVar, Context context, zo zoVar, Continuation continuation) {
        super(2, continuation);
        this.f111291c = aVar;
        this.f111292d = context;
        this.f111293e = zoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new go1(this.f111291c, this.f111292d, this.f111293e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((go1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object objG = pf.b.g();
        int i10 = this.f111290b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            com.monetization.ads.mediation.base.initialize.a aVar = this.f111291c;
            Context context = this.f111292d;
            zo zoVar = this.f111293e;
            this.f111290b = 1;
            AtomicBoolean atomicBoolean = com.monetization.ads.mediation.base.initialize.a.f59033g;
            aVar.getClass();
            if (com.monetization.ads.mediation.base.initialize.a.f59034h.getAndSet(false)) {
                aVar.f59036b.getClass();
                List list = zoVar.f118746b;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    CollectionsKt.addAll(arrayList, ((eb) it.next()).f110275c);
                }
                objC = eg.m1.c(new jo1(aVar.f59039e.a(arrayList), aVar, context, null), this);
                if (objC != pf.b.g()) {
                    objC = Unit.f93236a;
                }
                if (objC != pf.b.g()) {
                    objC = Unit.f93236a;
                }
            } else {
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
