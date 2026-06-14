package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f55424c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f55425d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f55426b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public n(List signalProviders) {
        Intrinsics.checkNotNullParameter(signalProviders, "signalProviders");
        this.f55426b = signalProviders;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        Iterator it = this.f55426b.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a();
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        List<j> list = this.f55426b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (j jVar : list) {
            boolean zB = jVar.b();
            if (zB) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ClientBidTokenSignalProviderImpl", "[CBT] Signal provider " + jVar.c() + " needs refresh", null, false, 12, null);
            }
            if (zB) {
                return true;
            }
        }
        return false;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "ClientBidTokenSignalProviderImpl";
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public k d() {
        List list = this.f55426b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(v0.b(((j) obj).getClass()), obj);
        }
        Object obj2 = linkedHashMap.get(v0.b(x.class));
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.SDKInitStateSignalProvider");
        boolean zBooleanValue = ((x) obj2).d().booleanValue();
        Object obj3 = linkedHashMap.get(v0.b(w.class));
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.PrivacyStateSignalProvider");
        MolocoPrivacy.PrivacySettings privacySettingsD = ((w) obj3).d();
        Object obj4 = linkedHashMap.get(v0.b(t.class));
        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.MemorySignalProvider");
        s sVarD = ((t) obj4).d();
        Object obj5 = linkedHashMap.get(v0.b(e.class));
        Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.AppDirInfoSignalProvider");
        d dVarD = ((e) obj5).d();
        Object obj6 = linkedHashMap.get(v0.b(v.class));
        Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.NetworkInfoSignalProvider");
        u uVarD = ((v) obj6).d();
        Object obj7 = linkedHashMap.get(v0.b(i.class));
        Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.BatteryInfoSignalProvider");
        h hVarD = ((i) obj7).d();
        Object obj8 = linkedHashMap.get(v0.b(c.class));
        Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.AdvertisingSignalProvider");
        com.moloco.sdk.internal.services.n nVarD = ((c) obj8).d();
        Object obj9 = linkedHashMap.get(v0.b(p.class));
        Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.DeviceSignalProvider");
        o oVarD = ((p) obj9).d();
        Object obj10 = linkedHashMap.get(v0.b(g.class));
        Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.AudioSignalProvider");
        f fVarD = ((g) obj10).d();
        Object obj11 = linkedHashMap.get(v0.b(b.class));
        Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.AccessibilitySignalProvider");
        com.moloco.sdk.internal.services.bidtoken.providers.a aVarD = ((b) obj11).d();
        Object obj12 = linkedHashMap.get(v0.b(r.class));
        Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.IlrdSignalProvider");
        return new k(zBooleanValue, privacySettingsD, sVarD, dVarD, uVarD, hVarD, nVarD, oVarD, fVarD, aVarD, ((r) obj12).d());
    }
}
