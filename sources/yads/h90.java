package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h90 extends o90 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h90() {
        super(0);
        g90 g90Var = g90.f111110b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h90)) {
            return false;
        }
        ((h90) obj).getClass();
        if (!Intrinsics.areEqual("Enable Test mode", "Enable Test mode")) {
            return false;
        }
        g90 g90Var = g90.f111110b;
        return true;
    }

    public final int hashCode() {
        return g90.f111110b.hashCode() - 120198036;
    }

    public final String toString() {
        return "Button(text=Enable Test mode, actionType=" + g90.f111110b + ")";
    }
}
