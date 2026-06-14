package org.bidon.inmobi;

import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdapterParameters;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements AdapterParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f97288a;

    public b(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f97288a = accountId;
    }

    public final String a() {
        return this.f97288a;
    }
}
