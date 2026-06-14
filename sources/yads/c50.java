package yads;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@ug.l
public final class c50 {

    @NotNull
    public static final b50 Companion = new b50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109222b;

    public /* synthetic */ c50(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            yg.e2.a(i10, 3, a50.f108557a.getDescriptor());
        }
        this.f109221a = str;
        this.f109222b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c50)) {
            return false;
        }
        c50 c50Var = (c50) obj;
        return Intrinsics.areEqual(this.f109221a, c50Var.f109221a) && Intrinsics.areEqual(this.f109222b, c50Var.f109222b);
    }

    public final int hashCode() {
        return this.f109222b.hashCode() + (this.f109221a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelBiddingParameter(name=" + this.f109221a + ", value=" + this.f109222b + ")";
    }
}
