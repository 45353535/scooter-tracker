package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l7 extends Throwable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112991b;

    public l7(String str) {
        super(str);
        this.f112991b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7) && Intrinsics.areEqual(this.f112991b, ((l7) obj).f112991b);
    }

    public final int hashCode() {
        return this.f112991b.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "AdPresentationError(description=" + this.f112991b + ")";
    }
}
