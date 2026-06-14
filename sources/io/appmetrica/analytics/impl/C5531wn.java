package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5531wn implements TempCacheStorage.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f78538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f78540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f78541d;

    public C5531wn(long j10, @NotNull String str, long j11, @NotNull byte[] bArr) {
        this.f78538a = j10;
        this.f78539b = str;
        this.f78540c = j11;
        this.f78541d = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C5531wn.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        }
        C5531wn c5531wn = (C5531wn) obj;
        if (this.f78538a == c5531wn.f78538a && Intrinsics.areEqual(this.f78539b, c5531wn.f78539b) && this.f78540c == c5531wn.f78540c) {
            return Arrays.equals(this.f78541d, c5531wn.f78541d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    @NotNull
    public final byte[] getData() {
        return this.f78541d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.f78538a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    @NotNull
    public final String getScope() {
        return this.f78539b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.f78540c;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f78541d) + ((androidx.collection.b.a(this.f78540c) + ((this.f78539b.hashCode() + (androidx.collection.b.a(this.f78538a) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "TempCacheEntry(id=" + this.f78538a + ", scope='" + this.f78539b + "', timestamp=" + this.f78540c + ", data=array[" + this.f78541d.length + "])";
    }
}
