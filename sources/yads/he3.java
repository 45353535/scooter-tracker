package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class he3 extends ie3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f111566a;

    public he3(List list) {
        super(0);
        this.f111566a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof he3) && Intrinsics.areEqual(this.f111566a, ((he3) obj).f111566a);
    }

    public final int hashCode() {
        return this.f111566a.hashCode();
    }

    public final String toString() {
        return "Success(result=" + this.f111566a + ")";
    }
}
