package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rw extends sw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115620a;

    public rw(String str) {
        super(0);
        this.f115620a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rw) && Intrinsics.areEqual(this.f115620a, ((rw) obj).f115620a);
    }

    public final int hashCode() {
        String str = this.f115620a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "VendorConsents(value=" + this.f115620a + ")";
    }
}
