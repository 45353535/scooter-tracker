package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class Gm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75834a;

    public Gm(int i10) {
        this.f75834a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Gm) && this.f75834a == ((Gm) obj).f75834a;
    }

    public final int hashCode() {
        return this.f75834a;
    }

    public final String toString() {
        return "StartupUpdateConfig(intervalSeconds=" + this.f75834a + ')';
    }
}
