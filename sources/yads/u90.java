package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class u90 {

    @NotNull
    public static final t90 Companion = new t90();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f116571b;

    public /* synthetic */ u90(int i10, String str, double d10) {
        if (3 != (i10 & 3)) {
            yg.e2.a(i10, 3, s90.f115721a.getDescriptor());
        }
        this.f116570a = str;
        this.f116571b = d10;
    }

    public final double a() {
        return this.f116571b;
    }

    public final String b() {
        return this.f116570a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u90)) {
            return false;
        }
        u90 u90Var = (u90) obj;
        return Intrinsics.areEqual(this.f116570a, u90Var.f116570a) && Double.compare(this.f116571b, u90Var.f116571b) == 0;
    }

    public final int hashCode() {
        return androidx.collection.a.a(this.f116571b) + (this.f116570a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelWaterfallCpmFloor(networkAdUnitId=" + this.f116570a + ", minCpm=" + this.f116571b + ")";
    }
}
