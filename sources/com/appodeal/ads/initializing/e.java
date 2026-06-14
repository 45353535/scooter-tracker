package com.appodeal.ads.initializing;

import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.session.r;
import com.appodeal.ads.z6;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f13469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdNetworkBuilder f13470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f13471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f13472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f13473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Lazy f13474f;

    public e(l networkVariant, AdNetworkBuilder builder, r sessionManager) {
        Intrinsics.checkNotNullParameter(networkVariant, "networkVariant");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        this.f13469a = networkVariant;
        this.f13470b = builder;
        this.f13471c = sessionManager;
        this.f13472d = new LinkedHashSet();
        this.f13473e = lf.i.a(new Function0() { // from class: com.appodeal.ads.initializing.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.b(this.f13467b);
            }
        });
        this.f13474f = lf.i.a(new Function0() { // from class: com.appodeal.ads.initializing.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.d(this.f13468b);
            }
        });
    }

    public static final List b(e eVar) {
        return eVar.f13469a.f13485d;
    }

    public static final AdNetwork d(e eVar) {
        return eVar.a();
    }

    public final AdNetwork a() {
        AdNetwork<?, ?> adNetworkBuild = this.f13470b.build();
        com.appodeal.ads.utils.c.f14968a.addAll(adNetworkBuild.getAdActivities());
        this.f13471c.b(new b(adNetworkBuild));
        String strD = z6.d(adNetworkBuild.getName());
        Intrinsics.checkNotNullExpressionValue(strD, "capitalize(...)");
        Log.log("Network", LogConstants.EVENT_INFO, strD + " - ver. " + adNetworkBuild.getVersion(), Log.LogLevel.verbose);
        return adNetworkBuild;
    }

    public final void c(AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f13472d.add(adType);
    }

    public final g e() {
        return new g(((AdNetwork) this.f13474f.getValue()).getName(), ((AdNetwork) this.f13474f.getValue()).getAdapterVersion(), ((AdNetwork) this.f13474f.getValue()).getVersion());
    }

    public final boolean f(AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        return CollectionsKt.minus((Iterable) this.f13473e.getValue(), (Iterable) this.f13472d).contains(adType);
    }

    public final AdNetwork g() {
        return (AdNetwork) this.f13474f.getValue();
    }

    public final l h() {
        return this.f13469a;
    }
}
