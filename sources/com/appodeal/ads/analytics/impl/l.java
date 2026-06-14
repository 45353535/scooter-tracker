package com.appodeal.ads.analytics.impl;

import com.appodeal.ads.analytics.SdkAnalytics;
import eg.m1;
import eg.o0;
import hg.l0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements SdkAnalytics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f12705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableStateFlow f12706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function0 f12707c;

    public l() {
        CoroutineScope scope = kotlinx.coroutines.i.a(m1.b(null, 1, null).plus(o0.a()));
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f12705a = scope;
        this.f12706b = l0.a(SetsKt.emptySet());
        this.f12707c = e.f12682b;
    }

    public static final Map a(l lVar, Map map) {
        lVar.getClass();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            arrayList.add(value instanceof String ? TuplesKt.to(str, StringsKt.J1((String) value, 100)) : TuplesKt.to(str, value));
        }
        return MapsKt.toMap(arrayList);
    }

    @Override // com.appodeal.ads.analytics.SdkAnalytics
    public final void internalEvent(Function0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        eg.i.d(this.f12705a, null, null, new h(this, provider, null), 3, null);
    }

    @Override // com.appodeal.ads.analytics.SdkAnalytics
    public final void log(String eventName, Map params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(params, "params");
        eg.i.d(this.f12705a, null, null, new k(this, params, eventName, null), 3, null);
    }

    @Override // com.appodeal.ads.analytics.SdkAnalytics
    public final void registerServices(List services) {
        Object value;
        Intrinsics.checkNotNullParameter(services, "services");
        try {
            Result.Companion companion = Result.f93230c;
            MutableStateFlow mutableStateFlow = this.f12706b;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.b(value, SetsKt.plus((Set) value, (Iterable) services)));
            Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Result.b(kotlin.d.a(th2));
        }
    }

    @Override // com.appodeal.ads.analytics.SdkAnalytics
    public final void setGeneralParamsProvider(Function0 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f12707c = params;
    }
}
