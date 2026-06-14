package com.ironsource;

import com.ironsource.D0;
import com.ironsource.mediationsdk.IronSource;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class B5 implements C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSource.a f40421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final D0 f40422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<C0> f40423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final X8 f40424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final C4621xb f40425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Of f40426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Q1 f40427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final M f40428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Sf f40429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Qc f40430j;

    public B5(@NotNull IronSource.a adFormat, @NotNull D0.b level, @NotNull List<? extends C0> eventsInterfaces, @Nullable AbstractC4511r3 abstractC4511r3) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(eventsInterfaces, "eventsInterfaces");
        this.f40421a = adFormat;
        D0 d02 = new D0(adFormat, level, this, abstractC4511r3);
        this.f40422b = d02;
        this.f40423c = CollectionsKt.toMutableList((Collection) eventsInterfaces);
        X8 x82 = d02.f40511e;
        Intrinsics.checkNotNullExpressionValue(x82, "wrapper.init");
        this.f40424d = x82;
        C4621xb c4621xb = d02.f40512f;
        Intrinsics.checkNotNullExpressionValue(c4621xb, "wrapper.load");
        this.f40425e = c4621xb;
        Of of2 = d02.f40513g;
        Intrinsics.checkNotNullExpressionValue(of2, "wrapper.token");
        this.f40426f = of2;
        Q1 q12 = d02.f40514h;
        Intrinsics.checkNotNullExpressionValue(q12, "wrapper.auction");
        this.f40427g = q12;
        M m10 = d02.f40515i;
        Intrinsics.checkNotNullExpressionValue(m10, "wrapper.adInteraction");
        this.f40428h = m10;
        Sf sf2 = d02.f40516j;
        Intrinsics.checkNotNullExpressionValue(sf2, "wrapper.troubleshoot");
        this.f40429i = sf2;
        Qc qc2 = d02.f40517k;
        Intrinsics.checkNotNullExpressionValue(qc2, "wrapper.operational");
        this.f40430j = qc2;
    }

    @NotNull
    public final M a() {
        return this.f40428h;
    }

    @NotNull
    public final Q1 b() {
        return this.f40427g;
    }

    @NotNull
    public final List<C0> c() {
        return this.f40423c;
    }

    @NotNull
    public final X8 d() {
        return this.f40424d;
    }

    @NotNull
    public final C4621xb e() {
        return this.f40425e;
    }

    @NotNull
    public final Qc f() {
        return this.f40430j;
    }

    @NotNull
    public final Of g() {
        return this.f40426f;
    }

    @NotNull
    public final Sf h() {
        return this.f40429i;
    }

    @Override // com.ironsource.C0
    @NotNull
    public Map<String, Object> a(@NotNull A0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        HashMap map = new HashMap();
        Iterator<C0> it = this.f40423c.iterator();
        while (it.hasNext()) {
            Map<String, Object> mapA = it.next().a(event);
            Intrinsics.checkNotNullExpressionValue(mapA, "it.getEventsAdditionalDataMap(event)");
            map.putAll(mapA);
        }
        return map;
    }

    public final void a(@NotNull C0 eventInterface) {
        Intrinsics.checkNotNullParameter(eventInterface, "eventInterface");
        this.f40423c.add(eventInterface);
    }

    public final void a(boolean z10) {
        if (z10) {
            this.f40425e.a(true);
        } else {
            if (z10) {
                throw new lf.m();
            }
            if (this.f40421a == IronSource.a.BANNER) {
                this.f40425e.a();
            } else {
                this.f40425e.a(false);
            }
        }
    }

    public /* synthetic */ B5(IronSource.a aVar, D0.b bVar, List list, AbstractC4511r3 abstractC4511r3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, bVar, (i10 & 4) != 0 ? CollectionsKt.emptyList() : list, (i10 & 8) != 0 ? null : abstractC4511r3);
    }
}
