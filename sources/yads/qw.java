package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qw extends sw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115182a;

    public qw(String str) {
        super(0);
        this.f115182a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qw) && Intrinsics.areEqual(this.f115182a, ((qw) obj).f115182a);
    }

    public final int hashCode() {
        String str = this.f115182a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "PurposeConsents(value=" + this.f115182a + ")";
    }
}
