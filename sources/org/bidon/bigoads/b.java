package org.bidon.bigoads;

import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdapterParameters;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements AdapterParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f97174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f97175b;

    public b(String appId, String str) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.f97174a = appId;
        this.f97175b = str;
    }

    public final String a() {
        return this.f97174a;
    }

    public final String b() {
        return this.f97175b;
    }
}
