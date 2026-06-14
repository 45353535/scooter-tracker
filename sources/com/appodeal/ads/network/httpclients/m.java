package com.appodeal.ads.network.httpclients;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f13988a;

    public m(Map headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f13988a = headers;
    }

    public final Map a() {
        return this.f13988a;
    }
}
