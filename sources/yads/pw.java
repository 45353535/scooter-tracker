package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pw extends sw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114799a;

    public pw(String str) {
        super(0);
        this.f114799a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pw) && Intrinsics.areEqual(this.f114799a, ((pw) obj).f114799a);
    }

    public final int hashCode() {
        String str = this.f114799a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "Gdpr(value=" + this.f114799a + ")";
    }
}
