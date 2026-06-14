package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e70 extends f70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110232b;

    public e70(String str) {
        super(str, 0);
        this.f110232b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e70) && Intrinsics.areEqual(this.f110232b, ((e70) obj).f110232b);
    }

    public final int hashCode() {
        return this.f110232b.hashCode();
    }

    public final String toString() {
        return "MediationNetwork(network=" + this.f110232b + ")";
    }
}
