package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f55404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f55405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f55406c;

    public h(Integer num, Integer num2, Boolean bool) {
        this.f55404a = num;
        this.f55405b = num2;
        this.f55406c = bool;
    }

    public final Integer a() {
        return this.f55405b;
    }

    public final Integer b() {
        return this.f55404a;
    }

    public final Boolean c() {
        return this.f55406c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f55404a, hVar.f55404a) && Intrinsics.areEqual(this.f55405b, hVar.f55405b) && Intrinsics.areEqual(this.f55406c, hVar.f55406c);
    }

    public int hashCode() {
        Integer num = this.f55404a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f55405b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f55406c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "BatteryInfoSignal(maxBatteryLevel=" + this.f55404a + ", batteryStatus=" + this.f55405b + ", isPowerSaveMode=" + this.f55406c + ')';
    }

    public /* synthetic */ h(Integer num, Integer num2, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : bool);
    }
}
