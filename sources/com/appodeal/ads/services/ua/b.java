package com.appodeal.ads.services.ua;

import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.services.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Iterator f14759r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14760s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f14761t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f14762u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, Continuation continuation) {
        super(2, continuation);
        this.f14762u = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        b bVar = new b(this.f14762u, continuation);
        bVar.f14761t = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b bVar = new b(this.f14762u, (Continuation) obj2);
        bVar.f14761t = (List) obj;
        return bVar.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        i iVar;
        Object objG = pf.b.g();
        int i10 = this.f14760s;
        if (i10 == 0) {
            kotlin.d.b(obj);
            List list = (List) this.f14761t;
            LogExtKt.logInternal$default("ServicesEventManager", "process " + list, null, 4, null);
            i iVar2 = this.f14762u;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!iVar2.f14775c.contains(((a) obj2).a())) {
                    arrayList.add(obj2);
                }
            }
            i iVar3 = this.f14762u;
            it = arrayList.iterator();
            iVar = iVar3;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f14759r;
            iVar = (i) this.f14761t;
            kotlin.d.b(obj);
        }
        while (it.hasNext()) {
            a aVar = (a) it.next();
            iVar.f14775c.add(aVar.a());
            LogExtKt.logInternal$default("ServicesEventManager", "logevent " + aVar.a(), null, 4, null);
            r rVar = iVar.f14773a;
            String strD = aVar.d();
            String strB = aVar.b();
            Map mapC = aVar.c();
            this.f14761t = iVar;
            this.f14759r = it;
            this.f14760s = 1;
            if (rVar.c(strD, strB, mapC, this) == objG) {
                return objG;
            }
        }
        return Unit.f93236a;
    }
}
