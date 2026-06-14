package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ov2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114423a;

    public ov2(String str) {
        this.f114423a = str;
    }

    public final String a() {
        return this.f114423a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ov2) && Intrinsics.areEqual(this.f114423a, ((ov2) obj).f114423a);
    }

    public final int hashCode() {
        return this.f114423a.hashCode();
    }

    public final String toString() {
        return "SessionParameters(token=" + this.f114423a + ")";
    }
}
