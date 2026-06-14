package com.appodeal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f14197r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Map f14198s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Iterator f14199t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14200u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ArrayList f14201v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f14202w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Map f14203x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ArrayList arrayList, String str, Map map, Continuation continuation) {
        super(2, continuation);
        this.f14201v = arrayList;
        this.f14202w = str;
        this.f14203x = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new o(this.f14201v, this.f14202w, this.f14203x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Map map;
        Iterator it;
        Object objG = pf.b.g();
        int i10 = this.f14200u;
        if (i10 == 0) {
            kotlin.d.b(obj);
            ArrayList arrayList = this.f14201v;
            str = this.f14202w;
            map = this.f14203x;
            it = arrayList.iterator();
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f14199t;
            map = this.f14198s;
            str = this.f14197r;
            kotlin.d.b(obj);
        }
        while (it.hasNext()) {
            String str2 = (String) it.next();
            boolean z10 = h2.f13367a;
            com.appodeal.ads.services.r rVar = (com.appodeal.ads.services.r) com.appodeal.ads.services.v.f14778a.getValue();
            this.f14197r = str;
            this.f14198s = map;
            this.f14199t = it;
            this.f14200u = 1;
            if (rVar.c(str2, str, map, this) == objG) {
                return objG;
            }
        }
        return Unit.f93236a;
    }
}
