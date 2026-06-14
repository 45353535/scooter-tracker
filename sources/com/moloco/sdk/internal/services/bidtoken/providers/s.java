package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f55447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f55448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f55449c;

    public s(Boolean bool, Long l10, Long l11) {
        this.f55447a = bool;
        this.f55448b = l10;
        this.f55449c = l11;
    }

    public final Boolean a() {
        return this.f55447a;
    }

    public final Long b() {
        return this.f55448b;
    }

    public final Long c() {
        return this.f55449c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.areEqual(this.f55447a, sVar.f55447a) && Intrinsics.areEqual(this.f55448b, sVar.f55448b) && Intrinsics.areEqual(this.f55449c, sVar.f55449c);
    }

    public int hashCode() {
        Boolean bool = this.f55447a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l10 = this.f55448b;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f55449c;
        return iHashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    public String toString() {
        return "MemoryInfoSignal(lowMemory=" + this.f55447a + ", threshold=" + this.f55448b + ", totalMem=" + this.f55449c + ')';
    }

    public /* synthetic */ s(Boolean bool, Long l10, Long l11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : l10, (i10 & 4) != 0 ? null : l11);
    }
}
