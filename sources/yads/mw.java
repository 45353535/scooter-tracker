package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mw extends sw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113622a;

    public mw(String str) {
        super(0);
        this.f113622a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mw) && Intrinsics.areEqual(this.f113622a, ((mw) obj).f113622a);
    }

    public final int hashCode() {
        String str = this.f113622a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "AdditionalConsent(value=" + this.f113622a + ")";
    }
}
