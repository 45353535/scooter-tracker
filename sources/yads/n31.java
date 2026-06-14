package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n31 implements o31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f113713a;

    public n31(Map map) {
        this.f113713a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n31) && Intrinsics.areEqual(this.f113713a, ((n31) obj).f113713a);
    }

    public final int hashCode() {
        return this.f113713a.hashCode();
    }

    public final String toString() {
        return "Success(images=" + this.f113713a + ")";
    }
}
