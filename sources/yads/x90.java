package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class x90 {

    @NotNull
    public static final w90 Companion = new w90();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117740b;

    public /* synthetic */ x90(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            yg.e2.a(i10, 3, v90.f116904a.getDescriptor());
        }
        this.f117739a = str;
        this.f117740b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x90)) {
            return false;
        }
        x90 x90Var = (x90) obj;
        return Intrinsics.areEqual(this.f117739a, x90Var.f117739a) && Intrinsics.areEqual(this.f117740b, x90Var.f117740b);
    }

    public final int hashCode() {
        return this.f117740b.hashCode() + (this.f117739a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelWaterfallCurrency(name=" + this.f117739a + ", symbol=" + this.f117740b + ")";
    }
}
