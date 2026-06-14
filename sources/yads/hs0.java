package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111771a;

    public hs0(String str) {
        this.f111771a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hs0) && Intrinsics.areEqual(this.f111771a, ((hs0) obj).f111771a);
    }

    public final int hashCode() {
        return this.f111771a.hashCode();
    }

    public final String toString() {
        return "FeedSessionData(value=" + this.f111771a + ")";
    }
}
