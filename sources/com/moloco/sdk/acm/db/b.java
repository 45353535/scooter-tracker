package com.moloco.sdk.acm.db;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f53958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f53959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f53960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f53961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f53962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f53963f;

    public b(long j10, String name, long j11, c eventType, Long l10, List tags) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f53958a = j10;
        this.f53959b = name;
        this.f53960c = j11;
        this.f53961d = eventType;
        this.f53962e = l10;
        this.f53963f = tags;
    }

    public final Long a() {
        return this.f53962e;
    }

    public final c b() {
        return this.f53961d;
    }

    public final long c() {
        return this.f53958a;
    }

    public final String d() {
        return this.f53959b;
    }

    public final List e() {
        return this.f53963f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f53958a == bVar.f53958a && Intrinsics.areEqual(this.f53959b, bVar.f53959b) && this.f53960c == bVar.f53960c && this.f53961d == bVar.f53961d && Intrinsics.areEqual(this.f53962e, bVar.f53962e) && Intrinsics.areEqual(this.f53963f, bVar.f53963f);
    }

    public final long f() {
        return this.f53960c;
    }

    public int hashCode() {
        int iA = ((((((androidx.collection.b.a(this.f53958a) * 31) + this.f53959b.hashCode()) * 31) + androidx.collection.b.a(this.f53960c)) * 31) + this.f53961d.hashCode()) * 31;
        Long l10 = this.f53962e;
        return ((iA + (l10 == null ? 0 : l10.hashCode())) * 31) + this.f53963f.hashCode();
    }

    public String toString() {
        return "EventEntity(id=" + this.f53958a + ", name=" + this.f53959b + ", timestamp=" + this.f53960c + ", eventType=" + this.f53961d + ", data=" + this.f53962e + ", tags=" + this.f53963f + ')';
    }

    public /* synthetic */ b(long j10, String str, long j11, c cVar, Long l10, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, str, j11, cVar, (i10 & 16) != 0 ? null : l10, (i10 & 32) != 0 ? CollectionsKt.emptyList() : list);
    }
}
