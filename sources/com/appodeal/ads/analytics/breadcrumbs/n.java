package com.appodeal.ads.analytics.breadcrumbs;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f12678b = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f12679a = new m();

    @Override // com.appodeal.ads.analytics.breadcrumbs.f
    public final void a(ArrayList services) {
        Intrinsics.checkNotNullParameter(services, "services");
        this.f12679a.a(services);
    }

    public final void b(Function0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        m mVar = this.f12679a;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        eg.i.d(mVar.f12676a, null, null, new i(mVar, provider, null), 3, null);
    }
}
