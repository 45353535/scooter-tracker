package f1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71155a;

    public t9(String actionName) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        this.f71155a = actionName;
    }

    public final String a() {
        return this.f71155a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t9) && Intrinsics.areEqual(this.f71155a, ((t9) obj).f71155a);
    }

    public int hashCode() {
        return this.f71155a.hashCode();
    }

    public String toString() {
        return "UrlActionResult(actionName=" + this.f71155a + ")";
    }
}
