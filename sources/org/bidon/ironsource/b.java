package org.bidon.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdapterParameters;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements AdapterParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f97319a;

    public b(String appKey) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        this.f97319a = appKey;
    }

    public final String a() {
        return this.f97319a;
    }
}
