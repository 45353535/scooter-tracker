package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f55393a;

    public d(Long l10) {
        this.f55393a = l10;
    }

    public final Long a() {
        return this.f55393a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.areEqual(this.f55393a, ((d) obj).f55393a);
    }

    public int hashCode() {
        Long l10 = this.f55393a;
        if (l10 == null) {
            return 0;
        }
        return l10.hashCode();
    }

    public String toString() {
        return "AppDirInfo(appDirSize=" + this.f55393a + ')';
    }
}
