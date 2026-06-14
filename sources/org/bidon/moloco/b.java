package org.bidon.moloco;

import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdapterParameters;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements AdapterParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f97501a;

    public b(String appKey) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        this.f97501a = appKey;
    }

    public final String a() {
        return this.f97501a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.f97501a, ((b) obj).f97501a);
    }

    public int hashCode() {
        return this.f97501a.hashCode();
    }

    public String toString() {
        return "MolocoParams(appKey=" + this.f97501a + ")";
    }
}
