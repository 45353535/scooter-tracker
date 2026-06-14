package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f55454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f55455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f55456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.a f55457d;

    public u(Integer num, Integer num2, Boolean bool, com.moloco.sdk.internal.services.a aVar) {
        this.f55454a = num;
        this.f55455b = num2;
        this.f55456c = bool;
        this.f55457d = aVar;
    }

    public final Integer a() {
        return this.f55454a;
    }

    public final Integer b() {
        return this.f55455b;
    }

    public final Boolean c() {
        return this.f55456c;
    }

    public final com.moloco.sdk.internal.services.a d() {
        return this.f55457d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.areEqual(this.f55454a, uVar.f55454a) && Intrinsics.areEqual(this.f55455b, uVar.f55455b) && Intrinsics.areEqual(this.f55456c, uVar.f55456c) && Intrinsics.areEqual(this.f55457d, uVar.f55457d);
    }

    public int hashCode() {
        Integer num = this.f55454a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f55455b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f55456c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        com.moloco.sdk.internal.services.a aVar = this.f55457d;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkInfoSignal(mobileCountryCode=" + this.f55454a + ", mobileNetworkCode=" + this.f55455b + ", networkRestricted=" + this.f55456c + ", networkType=" + this.f55457d + ')';
    }

    public /* synthetic */ u(Integer num, Integer num2, Boolean bool, com.moloco.sdk.internal.services.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : aVar);
    }
}
