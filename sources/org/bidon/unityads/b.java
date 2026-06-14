package org.bidon.unityads;

import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdapterParameters;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements AdapterParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f97759a;

    public b(String unityGameId) {
        Intrinsics.checkNotNullParameter(unityGameId, "unityGameId");
        this.f97759a = unityGameId;
    }

    public final String a() {
        return this.f97759a;
    }
}
