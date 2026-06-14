package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class aa0 {

    @NotNull
    public static final z90 Companion = new z90();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108614b;

    public /* synthetic */ aa0(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            yg.e2.a(i10, 3, y90.f118118a.getDescriptor());
        }
        this.f108613a = str;
        this.f108614b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa0)) {
            return false;
        }
        aa0 aa0Var = (aa0) obj;
        return Intrinsics.areEqual(this.f108613a, aa0Var.f108613a) && Intrinsics.areEqual(this.f108614b, aa0Var.f108614b);
    }

    public final int hashCode() {
        return this.f108614b.hashCode() + (this.f108613a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelWaterfallParameter(name=" + this.f108613a + ", value=" + this.f108614b + ")";
    }
}
