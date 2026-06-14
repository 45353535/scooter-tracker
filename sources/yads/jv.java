package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jv implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112467a;

    public jv(String str) {
        this.f112467a = str;
    }

    @Override // yads.m0
    public final String a() {
        return this.f112467a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jv) && Intrinsics.areEqual(this.f112467a, ((jv) obj).f112467a);
    }

    public final int hashCode() {
        return this.f112467a.hashCode();
    }

    public final String toString() {
        return "CloseAction(actionType=" + this.f112467a + ")";
    }
}
