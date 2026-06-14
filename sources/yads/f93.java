package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f93 implements h93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f110663a;

    public f93(List list) {
        this.f110663a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f93) && Intrinsics.areEqual(this.f110663a, ((f93) obj).f110663a);
    }

    public final int hashCode() {
        return this.f110663a.hashCode();
    }

    public final String toString() {
        return "Success(warnings=" + this.f110663a + ")";
    }
}
