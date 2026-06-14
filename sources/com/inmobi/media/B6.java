package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class B6 extends C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3840kl f36612a;

    public B6() {
        this.f36612a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B6) && Intrinsics.areEqual(this.f36612a, ((B6) obj).f36612a);
    }

    public final int hashCode() {
        C3840kl c3840kl = this.f36612a;
        if (c3840kl == null) {
            return 0;
        }
        return c3840kl.hashCode();
    }

    public final String toString() {
        return "UnAvailable(vastBeaconData=" + this.f36612a + ")";
    }

    public B6(C3840kl c3840kl) {
        this.f36612a = c3840kl;
    }
}
