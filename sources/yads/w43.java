package yads;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f117315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p53 f117316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f93 f117317c;

    public w43(WeakReference weakReference, p53 p53Var, f93 f93Var) {
        this.f117315a = weakReference;
        this.f117316b = p53Var;
        this.f117317c = f93Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w43)) {
            return false;
        }
        w43 w43Var = (w43) obj;
        return Intrinsics.areEqual(this.f117315a, w43Var.f117315a) && Intrinsics.areEqual(this.f117316b, w43Var.f117316b) && Intrinsics.areEqual(this.f117317c, w43Var.f117317c);
    }

    public final int hashCode() {
        return this.f117317c.f110663a.hashCode() + ((this.f117316b.hashCode() + (this.f117315a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TrackNoticeObject(manager=" + this.f117315a + ", notice=" + this.f117316b + ", validationResult=" + this.f117317c + ")";
    }
}
