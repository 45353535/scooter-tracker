package io.appmetrica.analytics.billingv6.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f75082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f75083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f75084c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, Map map, i iVar) {
        super(0);
        this.f75082a = linkedHashMap;
        this.f75083b = map;
        this.f75084c = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Map map = this.f75082a;
        Map map2 = this.f75083b;
        i iVar = this.f75084c;
        m.a(map, map2, iVar.f75088d, iVar.f75087c.getBillingInfoManager());
        return Unit.f93236a;
    }
}
