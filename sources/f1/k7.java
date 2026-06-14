package f1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
public final class k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f70260a;

    public k7(int i10) {
        this.f70260a = i10;
    }

    public final int a() {
        return this.f70260a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k7) && this.f70260a == ((k7) obj).f70260a;
    }

    public int hashCode() {
        return this.f70260a;
    }

    public String toString() {
        return "InterruptionConfig(audioFocusType=" + this.f70260a + ")";
    }

    public /* synthetic */ k7(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 3 : i10);
    }
}
