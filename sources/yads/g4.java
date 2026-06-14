package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g4 extends oj3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f111053d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l4 f111054c;

    public g4(l4 l4Var, r62 r62Var) {
        super(r62Var);
        this.f111054c = l4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(g4.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.monetization.ads.base.AdFetchError");
        return this.f111054c == ((g4) obj).f111054c;
    }

    public final int hashCode() {
        return this.f111054c.hashCode();
    }
}
