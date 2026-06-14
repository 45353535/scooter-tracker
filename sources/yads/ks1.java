package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ks1 implements ls1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f112839a;

    public ks1(List list) {
        this.f112839a = list;
    }

    public final List a() {
        return this.f112839a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ks1) && Intrinsics.areEqual(this.f112839a, ((ks1) obj).f112839a);
    }

    public final int hashCode() {
        return this.f112839a.hashCode();
    }

    public final String toString() {
        return "IncorrectIntegration(causes=" + this.f112839a + ")";
    }
}
