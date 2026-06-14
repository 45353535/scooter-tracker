package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import com.appodeal.ads.modules.common.internal.service.ServiceVariant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class y6 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15280r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f15281s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15282t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n8 f15283u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n6 f15284v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(ArrayList arrayList, n8 n8Var, n6 n6Var, Continuation continuation) {
        super(2, continuation);
        this.f15282t = arrayList;
        this.f15283u = n8Var;
        this.f15284v = n6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        y6 y6Var = new y6(this.f15282t, this.f15283u, this.f15284v, continuation);
        y6Var.f15281s = obj;
        return y6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f15280r;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f15281s;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<Pair> arrayList = this.f15282t;
        n8 n8Var = this.f15283u;
        n6 n6Var = this.f15284v;
        for (Pair pair : arrayList) {
            ServiceVariant serviceVariant = (ServiceVariant) pair.component1();
            linkedHashMap.put(serviceVariant, eg.i.b(coroutineScope, eg.o0.a(), null, new r6(n6Var, n8Var, (ServiceOptions) pair.component2(), serviceVariant, null), 2, null));
            n8Var = n8Var;
            n6Var = n6Var;
        }
        n8 n8Var2 = this.f15283u;
        n6 n6Var2 = this.f15284v;
        this.f15280r = 1;
        Object objC = n8Var2.c(linkedHashMap, n6Var2, this);
        return objC == objG ? objG : objC;
    }
}
