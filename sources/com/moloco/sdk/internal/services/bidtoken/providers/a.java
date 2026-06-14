package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f55381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f55382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f55383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Float f55384d;

    public a(Boolean bool, Boolean bool2, Boolean bool3, Float f10) {
        this.f55381a = bool;
        this.f55382b = bool2;
        this.f55383c = bool3;
        this.f55384d = f10;
    }

    public final Boolean a() {
        return this.f55381a;
    }

    public final Boolean b() {
        return this.f55382b;
    }

    public final Float c() {
        return this.f55384d;
    }

    public final Boolean d() {
        return this.f55383c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f55381a, aVar.f55381a) && Intrinsics.areEqual(this.f55382b, aVar.f55382b) && Intrinsics.areEqual(this.f55383c, aVar.f55383c) && Intrinsics.areEqual((Object) this.f55384d, (Object) aVar.f55384d);
    }

    public int hashCode() {
        Boolean bool = this.f55381a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f55382b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f55383c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Float f10 = this.f55384d;
        return iHashCode3 + (f10 != null ? f10.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilitySignal(accessibilityCaptioningEnabled=" + this.f55381a + ", accessibilityLargePointerIcon=" + this.f55382b + ", reduceBrightColorsActivated=" + this.f55383c + ", fontScale=" + this.f55384d + ')';
    }

    public /* synthetic */ a(Boolean bool, Boolean bool2, Boolean bool3, Float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2, (i10 & 4) != 0 ? null : bool3, (i10 & 8) != 0 ? null : f10);
    }
}
