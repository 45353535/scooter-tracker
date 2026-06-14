package com.appodeal.ads.networking.processors;

import com.appodeal.ads.network.NetworkResponse;
import com.appodeal.ads.networking.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f14154b = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f14155a = (a) e.f14156a.getValue();

    @Override // com.appodeal.ads.networking.processors.a
    public final void a(b0 request, NetworkResponse.JsonResult response) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        this.f14155a.a(request, response);
    }
}
