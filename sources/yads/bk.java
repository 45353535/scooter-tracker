package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f109025c;

    public bk(String str, String str2, String str3) {
        this.f109023a = str;
        this.f109024b = str2;
        this.f109025c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk)) {
            return false;
        }
        bk bkVar = (bk) obj;
        return Intrinsics.areEqual(this.f109023a, bkVar.f109023a) && Intrinsics.areEqual(this.f109024b, bkVar.f109024b) && Intrinsics.areEqual(this.f109025c, bkVar.f109025c);
    }

    public final int hashCode() {
        return this.f109025c.hashCode() + j4.a(this.f109024b, this.f109023a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Attributes(campaignId=" + this.f109023a + ", bannerId=" + this.f109024b + ", placeId=" + this.f109025c + ")";
    }
}
