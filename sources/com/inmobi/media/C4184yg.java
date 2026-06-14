package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.yg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4184yg extends Tn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40004a;

    public C4184yg(int i10) {
        this.f40004a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4184yg) && this.f40004a == ((C4184yg) obj).f40004a;
    }

    public final int hashCode() {
        return this.f40004a;
    }

    public final String toString() {
        return "PollingVisibilityTrackerConfig(pollingIntervalInMillis=" + this.f40004a + ")";
    }
}
