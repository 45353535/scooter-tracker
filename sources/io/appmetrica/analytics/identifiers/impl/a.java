package io.appmetrica.analytics.identifiers.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f75354c;

    public a(String str, String str2, Boolean bool) {
        this.f75352a = str;
        this.f75353b = str2;
        this.f75354c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f75352a, aVar.f75352a) && Intrinsics.areEqual(this.f75353b, aVar.f75353b) && Intrinsics.areEqual(this.f75354c, aVar.f75354c);
    }

    public final int hashCode() {
        int iHashCode = this.f75352a.hashCode() * 31;
        String str = this.f75353b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f75354c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdInfo(provider=" + this.f75352a + ", advId=" + this.f75353b + ", limitedAdTracking=" + this.f75354c + ')';
    }
}
