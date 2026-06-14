package org.bidon.vungle;

import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdapterParameters;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements AdapterParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f97827a;

    public b(String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.f97827a = appId;
    }

    public final String a() {
        return this.f97827a;
    }
}
