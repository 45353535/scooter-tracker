package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f115153a;

    public qt0(ArrayList arrayList) {
        this.f115153a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qt0) && Intrinsics.areEqual(this.f115153a, ((qt0) obj).f115153a);
    }

    public final int hashCode() {
        return this.f115153a.hashCode();
    }

    public final String toString() {
        return "FilteringRule(installedPackages=" + this.f115153a + ")";
    }
}
