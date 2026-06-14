package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class fo1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f110812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a f110813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f110814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zo f110815e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo1(com.monetization.ads.mediation.base.initialize.a aVar, Context context, zo zoVar, Continuation continuation) {
        super(2, continuation);
        this.f110813c = aVar;
        this.f110814d = context;
        this.f110815e = zoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new fo1(this.f110813c, this.f110814d, this.f110815e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((fo1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Collection<oq1> collectionEmptyList;
        List list;
        Object objG = pf.b.g();
        int i10 = this.f110812b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            com.monetization.ads.mediation.base.initialize.a aVar = this.f110813c;
            Context context = this.f110814d;
            zo zoVar = this.f110815e;
            this.f110812b = 1;
            AtomicBoolean atomicBoolean = com.monetization.ads.mediation.base.initialize.a.f59033g;
            aVar.getClass();
            if (com.monetization.ads.mediation.base.initialize.a.f59033g.getAndSet(false)) {
                aVar.f59036b.getClass();
                sq1 sq1Var = zoVar.f118747c;
                if (sq1Var == null || (list = sq1Var.f115900c) == null) {
                    collectionEmptyList = CollectionsKt.emptyList();
                } else {
                    collectionEmptyList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        CollectionsKt.addAll(collectionEmptyList, ((jq1) it.next()).f112434c);
                    }
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionEmptyList, 10));
                for (oq1 oq1Var : collectionEmptyList) {
                    aVar.f59037c.getClass();
                    arrayList.add(new cp1(oq1Var.f114390b, oq1Var.f114391c, null, null, null, null, null));
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
