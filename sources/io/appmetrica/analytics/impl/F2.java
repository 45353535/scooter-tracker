package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class F2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E2 f75756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f75757b;

    public F2(E2 e22, Boolean bool) {
        this.f75756a = e22;
        this.f75757b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && F2.class == obj.getClass()) {
            F2 f22 = (F2) obj;
            if (this.f75756a != f22.f75756a) {
                return false;
            }
            Boolean bool = this.f75757b;
            if (bool != null) {
                return bool.equals(f22.f75757b);
            }
            if (f22.f75757b == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        E2 e22 = this.f75756a;
        int iHashCode = (e22 != null ? e22.hashCode() : 0) * 31;
        Boolean bool = this.f75757b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundRestrictionsState{mAppStandByBucket=" + this.f75756a + ", mBackgroundRestricted=" + this.f75757b + '}';
    }
}
