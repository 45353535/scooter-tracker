package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.z6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4199z6 extends C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f40035a;

    public C4199z6(short s10) {
        this.f40035a = s10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4199z6) && this.f40035a == ((C4199z6) obj).f40035a;
    }

    public final int hashCode() {
        return this.f40035a;
    }

    public final String toString() {
        return "Failure(errorCode=" + ((int) this.f40035a) + ")";
    }
}
