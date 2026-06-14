package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j90 extends o90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112271a;

    public j90(String str) {
        super(0);
        this.f112271a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j90) && Intrinsics.areEqual(this.f112271a, ((j90) obj).f112271a);
    }

    public final int hashCode() {
        return this.f112271a.hashCode();
    }

    public final String toString() {
        return "Header(text=" + this.f112271a + ")";
    }
}
