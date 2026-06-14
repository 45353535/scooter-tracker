package com.appodeal.ads.services;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.service.Service;
import com.appodeal.ads.utils.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14690r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f14691s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f14692t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f14693u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Map f14694v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, String str, String str2, Map map, Continuation continuation) {
        super(2, continuation);
        this.f14691s = rVar;
        this.f14692t = str;
        this.f14693u = str2;
        this.f14694v = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f14691s, this.f14692t, this.f14693u, this.f14694v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f14690r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            MutableStateFlow mutableStateFlow = this.f14691s.f14725c;
            h hVar = new h(null);
            this.f14690r = 1;
            obj = hg.i.y(mutableStateFlow, hVar, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        String str = this.f14692t;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (Intrinsics.areEqual(((Service) obj2).getInfo().getName(), str)) {
                arrayList.add(obj2);
            }
        }
        String str2 = this.f14693u;
        Map<String, ? extends Object> map = this.f14694v;
        String str3 = this.f14692t;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Service) it.next()).logEvent(str2, map);
            Log.log(LogConstants.KEY_SERVICE, LogConstants.EVENT_INFO, str3 + " " + ("logEvent - " + str2 + " with params: " + map));
        }
        return Unit.f93236a;
    }
}
