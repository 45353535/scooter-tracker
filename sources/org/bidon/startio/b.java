package org.bidon.startio;

import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdapterParameters;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements AdapterParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f97668a;

    public b(String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.f97668a = appId;
    }

    public final String a() {
        return this.f97668a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.f97668a, ((b) obj).f97668a);
    }

    public int hashCode() {
        return this.f97668a.hashCode();
    }

    public String toString() {
        return "StartIoParams(appId=" + this.f97668a + ")";
    }
}
