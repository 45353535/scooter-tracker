package f1;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f71189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f71190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f71192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f71193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f71194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f71195g;

    public u(boolean z10, List blackList, String endpoint, int i10, int i11, boolean z11, int i12) {
        Intrinsics.checkNotNullParameter(blackList, "blackList");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.f71189a = z10;
        this.f71190b = blackList;
        this.f71191c = endpoint;
        this.f71192d = i10;
        this.f71193e = i11;
        this.f71194f = z11;
        this.f71195g = i12;
    }

    public final List a() {
        return this.f71190b;
    }

    public final String b() {
        return this.f71191c;
    }

    public final int c() {
        return this.f71192d;
    }

    public final boolean d() {
        return this.f71194f;
    }

    public final int e() {
        return this.f71195g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f71189a == uVar.f71189a && Intrinsics.areEqual(this.f71190b, uVar.f71190b) && Intrinsics.areEqual(this.f71191c, uVar.f71191c) && this.f71192d == uVar.f71192d && this.f71193e == uVar.f71193e && this.f71194f == uVar.f71194f && this.f71195g == uVar.f71195g;
    }

    public final int f() {
        return this.f71193e;
    }

    public final boolean g() {
        return this.f71189a;
    }

    public int hashCode() {
        return (((((((((((androidx.compose.foundation.c.a(this.f71189a) * 31) + this.f71190b.hashCode()) * 31) + this.f71191c.hashCode()) * 31) + this.f71192d) * 31) + this.f71193e) * 31) + androidx.compose.foundation.c.a(this.f71194f)) * 31) + this.f71195g;
    }

    public String toString() {
        return "TrackingConfig(isEnabled=" + this.f71189a + ", blackList=" + this.f71190b + ", endpoint=" + this.f71191c + ", eventLimit=" + this.f71192d + ", windowDuration=" + this.f71193e + ", persistenceEnabled=" + this.f71194f + ", persistenceMaxEvents=" + this.f71195g + ")";
    }

    public /* synthetic */ u(boolean z10, List list, String str, int i10, int i11, boolean z11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? i0.a() : list, (i13 & 4) != 0 ? "https://ssp-events.chartboost.com/track/sdk" : str, (i13 & 8) != 0 ? 10 : i10, (i13 & 16) != 0 ? 60 : i11, (i13 & 32) != 0 ? true : z11, (i13 & 64) != 0 ? 100 : i12);
    }
}
