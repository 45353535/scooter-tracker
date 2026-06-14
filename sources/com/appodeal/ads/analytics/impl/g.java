package com.appodeal.ads.analytics.impl;

import com.appodeal.ads.analytics.models.Event;
import com.appodeal.ads.analytics.models.GeneralParams;
import com.appodeal.ads.modules.common.internal.service.InternalEventTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Function0 f12684r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f12686t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l f12687u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function0 f12688v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f12687u = lVar;
        this.f12688v = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        g gVar = new g(this.f12687u, this.f12688v, continuation);
        gVar.f12686t = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        l lVar;
        Function0 function0;
        Object objG = pf.b.g();
        int i10 = this.f12685s;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                lVar = this.f12687u;
                Function0 function02 = this.f12688v;
                Result.Companion companion = Result.f93230c;
                MutableStateFlow mutableStateFlow = lVar.f12706b;
                f fVar = new f(null);
                this.f12686t = lVar;
                this.f12684r = function02;
                this.f12685s = 1;
                Object objY = hg.i.y(mutableStateFlow, fVar, this);
                if (objY == objG) {
                    return objG;
                }
                function0 = function02;
                obj = objY;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = this.f12684r;
                lVar = (l) this.f12686t;
                kotlin.d.b(obj);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (obj2 instanceof InternalEventTracker) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (((InternalEventTracker) obj3).getF14574d()) {
                    arrayList2.add(obj3);
                }
            }
            Set set = CollectionsKt.toSet(arrayList2);
            if (!set.isEmpty()) {
                Event event = (Event) function0.invoke();
                GeneralParams generalParams = (GeneralParams) lVar.f12707c.invoke();
                Map mapA = generalParams != null ? d.a(generalParams) : null;
                if (mapA == null) {
                    mapA = MapsKt.emptyMap();
                }
                Map<String, ? extends Object> mapPlus = MapsKt.plus(mapA, c.a(event));
                String name = event.getName();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((InternalEventTracker) it.next()).internalLogEvent(name, mapPlus);
                }
            }
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return Result.a(objB);
    }
}
