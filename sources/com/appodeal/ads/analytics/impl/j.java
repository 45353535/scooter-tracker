package com.appodeal.ads.analytics.impl;

import com.appodeal.ads.analytics.models.GeneralParams;
import com.appodeal.ads.modules.common.internal.service.Service;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f12693r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Map f12694s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public l f12695t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12696u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f12697v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f12698w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Map f12699x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f12700y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Map map, String str, Continuation continuation) {
        super(2, continuation);
        this.f12698w = lVar;
        this.f12699x = map;
        this.f12700y = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        j jVar = new j(this.f12698w, this.f12699x, this.f12700y, continuation);
        jVar.f12697v = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Map mapPlus;
        l lVar;
        String str;
        l lVar2;
        Object objG = pf.b.g();
        int i10 = this.f12696u;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                l lVar3 = this.f12698w;
                Map map = this.f12699x;
                String str2 = this.f12700y;
                Result.Companion companion = Result.f93230c;
                GeneralParams generalParams = (GeneralParams) lVar3.f12707c.invoke();
                Map mapA = generalParams != null ? d.a(generalParams) : null;
                if (mapA == null) {
                    mapA = MapsKt.emptyMap();
                }
                mapPlus = MapsKt.plus(mapA, map);
                MutableStateFlow mutableStateFlow = lVar3.f12706b;
                i iVar = new i(null);
                this.f12697v = lVar3;
                this.f12693r = str2;
                this.f12694s = mapPlus;
                this.f12695t = lVar3;
                this.f12696u = 1;
                Object objY = hg.i.y(mutableStateFlow, iVar, this);
                if (objY == objG) {
                    return objG;
                }
                lVar = lVar3;
                obj = objY;
                str = str2;
                lVar2 = lVar;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lVar = this.f12695t;
                mapPlus = this.f12694s;
                str = this.f12693r;
                lVar2 = (l) this.f12697v;
                kotlin.d.b(obj);
            }
            Map<String, ? extends Object> mapA2 = l.a(lVar2, mapPlus);
            lVar.getClass();
            Iterator it = ((Set) obj).iterator();
            while (it.hasNext()) {
                ((Service) it.next()).logEvent(str, mapA2);
            }
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return Result.a(objB);
    }
}
