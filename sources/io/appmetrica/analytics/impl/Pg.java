package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class Pg implements RemoteConfigMetaInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f76258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f76259b;

    public Pg(long j10, long j11) {
        this.f76258a = j10;
        this.f76259b = j11;
    }

    @NotNull
    public final Pg a(long j10, long j11) {
        return new Pg(j10, j11);
    }

    public final long b() {
        return this.f76259b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pg)) {
            return false;
        }
        Pg pg2 = (Pg) obj;
        return this.f76258a == pg2.f76258a && this.f76259b == pg2.f76259b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.f76258a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.f76259b;
    }

    public final int hashCode() {
        return androidx.collection.b.a(this.f76259b) + (androidx.collection.b.a(this.f76258a) * 31);
    }

    @NotNull
    public final String toString() {
        return "RemoteConfigMetaInfoModel(firstSendTime=" + this.f76258a + ", lastUpdateTime=" + this.f76259b + ')';
    }

    public final long a() {
        return this.f76258a;
    }

    public static Pg a(Pg pg2, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = pg2.f76258a;
        }
        if ((i10 & 2) != 0) {
            j11 = pg2.f76259b;
        }
        pg2.getClass();
        return new Pg(j10, j11);
    }
}
