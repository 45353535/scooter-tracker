package io.appmetrica.analytics.idsync.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f75453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f75454c;

    public z(String str, long j10, int i10) {
        this.f75452a = str;
        this.f75453b = j10;
        this.f75454c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.areEqual(this.f75452a, zVar.f75452a) && this.f75453b == zVar.f75453b && this.f75454c == zVar.f75454c;
    }

    public final int hashCode() {
        return v.a(this.f75454c) + ((androidx.collection.b.a(this.f75453b) + (this.f75452a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RequestState(type=" + this.f75452a + ", lastAttempt=" + this.f75453b + ", lastAttemptResult=" + u.b(this.f75454c) + ')';
    }
}
