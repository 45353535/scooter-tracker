package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.h f55427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55429c;

    public o(com.moloco.sdk.internal.services.h hVar, String str, String str2) {
        this.f55427a = hVar;
        this.f55428b = str;
        this.f55429c = str2;
    }

    public final String a() {
        return this.f55429c;
    }

    public final String b() {
        return this.f55428b;
    }

    public final com.moloco.sdk.internal.services.h c() {
        return this.f55427a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f55427a == oVar.f55427a && Intrinsics.areEqual(this.f55428b, oVar.f55428b) && Intrinsics.areEqual(this.f55429c, oVar.f55429c);
    }

    public int hashCode() {
        com.moloco.sdk.internal.services.h hVar = this.f55427a;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        String str = this.f55428b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f55429c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DeviceSignalInfo(orientation=" + this.f55427a + ", locale=" + this.f55428b + ", keyboardLocale=" + this.f55429c + ')';
    }

    public /* synthetic */ o(com.moloco.sdk.internal.services.h hVar, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : hVar, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
    }
}
