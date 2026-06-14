package org.bidon.mintegral;

import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdapterParameters;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements AdapterParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f97437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f97438b;

    public d(String appId, String appKey) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        this.f97437a = appId;
        this.f97438b = appKey;
    }

    public final String a() {
        return this.f97437a;
    }

    public final String b() {
        return this.f97438b;
    }
}
