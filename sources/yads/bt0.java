package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d31 f109095a;

    public bt0(d31 d31Var) {
        this.f109095a = d31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bt0) && Intrinsics.areEqual(this.f109095a, ((bt0) obj).f109095a);
    }

    public final int hashCode() {
        d31 d31Var = this.f109095a;
        if (d31Var == null) {
            return 0;
        }
        return d31Var.hashCode();
    }

    public final String toString() {
        return "FeedbackValue(imageValue=" + this.f109095a + ")";
    }
}
