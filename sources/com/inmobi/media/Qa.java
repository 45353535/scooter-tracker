package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Qa extends Sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37586a;

    public Qa(int i10) {
        this.f37586a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Qa) && this.f37586a == ((Qa) obj).f37586a;
    }

    public final int hashCode() {
        return this.f37586a;
    }

    public final String toString() {
        return "InValid(errorCode=" + this.f37586a + ")";
    }
}
