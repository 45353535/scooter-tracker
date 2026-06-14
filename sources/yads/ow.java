package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ow extends sw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114424a;

    public ow(String str) {
        super(0);
        this.f114424a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ow) && Intrinsics.areEqual(this.f114424a, ((ow) obj).f114424a);
    }

    public final int hashCode() {
        String str = this.f114424a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "ConsentString(value=" + this.f114424a + ")";
    }
}
