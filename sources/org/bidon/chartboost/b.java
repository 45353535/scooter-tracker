package org.bidon.chartboost;

import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdapterParameters;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements AdapterParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f97213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f97214b;

    public b(String appId, String appSignature) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appSignature, "appSignature");
        this.f97213a = appId;
        this.f97214b = appSignature;
    }

    public final String a() {
        return this.f97213a;
    }

    public final String b() {
        return this.f97214b;
    }
}
