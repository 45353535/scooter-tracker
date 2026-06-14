package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m80 implements t80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113347a;

    public m80(String str) {
        this.f113347a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m80) && Intrinsics.areEqual(this.f113347a, ((m80) obj).f113347a);
    }

    public final int hashCode() {
        return this.f113347a.hashCode();
    }

    public final String toString() {
        return "OnAdUnitClick(id=" + this.f113347a + ")";
    }
}
