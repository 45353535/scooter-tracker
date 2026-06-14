package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90 f109285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f70 f109286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f109287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f109288d;

    public c90(c90 c90Var, f70 f70Var, boolean z10, List list) {
        this.f109285a = c90Var;
        this.f109286b = f70Var;
        this.f109287c = z10;
        this.f109288d = list;
    }

    public static c90 a(c90 c90Var, c90 c90Var2, f70 f70Var, boolean z10, List list, int i10) {
        if ((i10 & 1) != 0) {
            c90Var2 = c90Var.f109285a;
        }
        if ((i10 & 2) != 0) {
            f70Var = c90Var.f109286b;
        }
        if ((i10 & 4) != 0) {
            z10 = c90Var.f109287c;
        }
        if ((i10 & 8) != 0) {
            list = c90Var.f109288d;
        }
        c90Var.getClass();
        return new c90(c90Var2, f70Var, z10, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c90)) {
            return false;
        }
        c90 c90Var = (c90) obj;
        return Intrinsics.areEqual(this.f109285a, c90Var.f109285a) && Intrinsics.areEqual(this.f109286b, c90Var.f109286b) && this.f109287c == c90Var.f109287c && Intrinsics.areEqual(this.f109288d, c90Var.f109288d);
    }

    public final int hashCode() {
        c90 c90Var = this.f109285a;
        return this.f109288d.hashCode() + ((androidx.compose.foundation.c.a(this.f109287c) + ((this.f109286b.hashCode() + ((c90Var == null ? 0 : c90Var.hashCode()) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelUiState(prevState=" + this.f109285a + ", destination=" + this.f109286b + ", isLoading=" + this.f109287c + ", uiData=" + this.f109288d + ")";
    }
}
