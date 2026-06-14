package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ui3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f116669a;

    public ui3(ArrayList arrayList) {
        this.f116669a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ui3) && Intrinsics.areEqual(this.f116669a, ((ui3) obj).f116669a);
    }

    public final int hashCode() {
        return this.f116669a.hashCode();
    }

    public final String toString() {
        return "ViewableImpression(viewableUrls=" + this.f116669a + ")";
    }
}
