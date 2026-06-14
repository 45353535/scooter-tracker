package com.appodeal.ads.analytics.impl;

import eg.x1;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12701r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f12702s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Map f12703t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f12704u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Map map, String str, Continuation continuation) {
        super(2, continuation);
        this.f12702s = lVar;
        this.f12703t = map;
        this.f12704u = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f12702s, this.f12703t, this.f12704u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f12701r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            j jVar = new j(this.f12702s, this.f12703t, this.f12704u, null);
            this.f12701r = 1;
            if (x1.e(20000L, jVar, this) == objG) {
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
