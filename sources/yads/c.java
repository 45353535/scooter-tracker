package yads;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f109165b;

    public c(String str, Set set) {
        this.f109164a = str;
        this.f109165b = set;
    }

    public final String a() {
        return this.f109164a;
    }

    public final Set b() {
        return this.f109165b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f109164a, cVar.f109164a) && Intrinsics.areEqual(this.f109165b, cVar.f109165b);
    }

    public final int hashCode() {
        return this.f109165b.hashCode() + (this.f109164a.hashCode() * 31);
    }

    public final String toString() {
        return "AbExperimentData(experiments=" + this.f109164a + ", triggeredTestIds=" + this.f109165b + ")";
    }
}
