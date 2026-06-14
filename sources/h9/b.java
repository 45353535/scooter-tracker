package h9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f72964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f72965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f72966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Long f72967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f72968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Long f72969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Boolean f72970g;

    public b(String str, String str2, Long l10, Long l11, Long l12, Long l13, Boolean bool) {
        this.f72964a = str;
        this.f72965b = str2;
        this.f72966c = l10;
        this.f72967d = l11;
        this.f72968e = l12;
        this.f72969f = l13;
        this.f72970g = bool;
    }

    public final Long a() {
        return this.f72967d;
    }

    public final Long b() {
        return this.f72969f;
    }

    public final Long c() {
        return this.f72966c;
    }

    public final Long d() {
        return this.f72968e;
    }

    public final String e() {
        return this.f72964a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f72964a, bVar.f72964a) && Intrinsics.areEqual(this.f72965b, bVar.f72965b) && Intrinsics.areEqual(this.f72966c, bVar.f72966c) && Intrinsics.areEqual(this.f72967d, bVar.f72967d) && Intrinsics.areEqual(this.f72968e, bVar.f72968e) && Intrinsics.areEqual(this.f72969f, bVar.f72969f) && Intrinsics.areEqual(this.f72970g, bVar.f72970g);
    }

    public final String f() {
        return this.f72965b;
    }

    public final boolean g() {
        if (this.f72964a != null || this.f72965b != null) {
            return false;
        }
        Long l10 = this.f72966c;
        if (l10 != null && (l10 == null || l10.longValue() != 0)) {
            return false;
        }
        Long l11 = this.f72967d;
        if (l11 != null && (l11 == null || l11.longValue() != 0)) {
            return false;
        }
        Long l12 = this.f72968e;
        if (l12 != null && (l12 == null || l12.longValue() != 0)) {
            return false;
        }
        Long l13 = this.f72969f;
        return (l13 == null || (l13 != null && l13.longValue() == 0)) && this.f72970g == null;
    }

    public final boolean h() {
        Long l10;
        Long l11;
        Long l12;
        Long l13;
        if (this.f72964a == null || this.f72965b == null || (l10 = this.f72966c) == null) {
            return false;
        }
        if ((l10 != null && l10.longValue() == 0) || (l11 = this.f72967d) == null) {
            return false;
        }
        if ((l11 != null && l11.longValue() == 0) || (l12 = this.f72968e) == null) {
            return false;
        }
        if ((l12 != null && l12.longValue() == 0) || (l13 = this.f72969f) == null) {
            return false;
        }
        return (l13 == null || l13.longValue() != 0) && this.f72970g != null;
    }

    public int hashCode() {
        String str = this.f72964a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f72965b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.f72966c;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f72967d;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f72968e;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f72969f;
        int iHashCode6 = (iHashCode5 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Boolean bool = this.f72970g;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean i() {
        return this.f72970g;
    }

    public String toString() {
        return "InstallInfo(installReferrerUrl=" + this.f72964a + ", installVersion=" + this.f72965b + ", installReferrerClickSec=" + this.f72966c + ", installBeginSec=" + this.f72967d + ", installReferrerClickServerSec=" + this.f72968e + ", installBeginServerSec=" + this.f72969f + ", isGooglePlayInstant=" + this.f72970g + ')';
    }
}
