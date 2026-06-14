package io.appmetrica.analytics.billingv8.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f75135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f75136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f75137c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, Map map, i iVar) {
        super(0);
        this.f75135a = linkedHashMap;
        this.f75136b = map;
        this.f75137c = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Map map = this.f75135a;
        Map map2 = this.f75136b;
        i iVar = this.f75137c;
        m.a(map, map2, iVar.f75141d, iVar.f75140c.getBillingInfoManager());
        return Unit.f93236a;
    }
}
