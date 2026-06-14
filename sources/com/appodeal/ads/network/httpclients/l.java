package com.appodeal.ads.network.httpclients;

import com.appodeal.ads.network.HttpError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpError f13987a;

    public l(HttpError httpError) {
        Intrinsics.checkNotNullParameter(httpError, "httpError");
        this.f13987a = httpError;
    }

    public final HttpError a() {
        return this.f13987a;
    }
}
