package com.appodeal.ads.initializing;

import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.utils.session.r;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f13479b = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f13480a = new i(new a(r.f15109b), new com.appodeal.ads.utils.reflection.a());

    @Override // com.appodeal.ads.initializing.h
    public final AdNetwork a(String networkName) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        return this.f13480a.a(networkName);
    }

    @Override // com.appodeal.ads.initializing.h
    public final Set a(AdType adType) {
        return this.f13480a.a(adType);
    }
}
