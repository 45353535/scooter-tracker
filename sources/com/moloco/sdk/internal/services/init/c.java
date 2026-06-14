package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.internal.h0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f55616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55617b;

    public c(h0 sdkInitResult, String fetchType) {
        Intrinsics.checkNotNullParameter(sdkInitResult, "sdkInitResult");
        Intrinsics.checkNotNullParameter(fetchType, "fetchType");
        this.f55616a = sdkInitResult;
        this.f55617b = fetchType;
    }

    public final String a() {
        return this.f55617b;
    }

    public final h0 b() {
        return this.f55616a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f55616a, cVar.f55616a) && Intrinsics.areEqual(this.f55617b, cVar.f55617b);
    }

    public int hashCode() {
        return (this.f55616a.hashCode() * 31) + this.f55617b.hashCode();
    }

    public String toString() {
        return "FetchState(sdkInitResult=" + this.f55616a + ", fetchType=" + this.f55617b + ')';
    }
}
