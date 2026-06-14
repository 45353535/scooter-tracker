package com.appodeal.ads.services.appsflyer.collector;

import android.content.Context;
import com.appodeal.ads.ext.LogExtKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f14584r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f14585s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, e eVar, Continuation continuation) {
        super(2, continuation);
        this.f14584r = context;
        this.f14585s = eVar;
    }

    public static final Unit c(e eVar, String str) {
        LogExtKt.logInternal$default("AppsflyerService", "readExternalAttributionData attributionId: " + str, null, 4, null);
        e.b(eVar, str);
        return Unit.f93236a;
    }

    public static final Unit i(e eVar, Map map) {
        LogExtKt.logInternal$default("AppsflyerService", "readExternalAttributionData conversionData: " + map, null, 4, null);
        e.c(eVar, map);
        return Unit.f93236a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f14584r, this.f14585s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new d(this.f14584r, this.f14585s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        com.appodeal.ads.services.appsflyer.util.e eVar = new com.appodeal.ads.services.appsflyer.util.e(this.f14584r);
        final e eVar2 = this.f14585s;
        eVar.d(new Function1() { // from class: com.appodeal.ads.services.appsflyer.collector.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return d.c(eVar2, (String) obj2);
            }
        });
        final e eVar3 = this.f14585s;
        eVar.f(new Function1() { // from class: com.appodeal.ads.services.appsflyer.collector.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return d.i(eVar3, (Map) obj2);
            }
        });
        return Unit.f93236a;
    }
}
