package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w33 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nh2 f117303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u2 f117304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vb0 f117305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final iv f117306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vv f117307e;

    public /* synthetic */ w33(nh2 nh2Var, u2 u2Var, vb0 vb0Var, iv ivVar) {
        this(nh2Var, u2Var, vb0Var, ivVar, new vv());
    }

    public final iv a() {
        return this.f117306d;
    }

    public final vv b() {
        return this.f117307e;
    }

    public final vb0 c() {
        return this.f117305c;
    }

    public final nh2 d() {
        return this.f117303a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w33)) {
            return false;
        }
        w33 w33Var = (w33) obj;
        return Intrinsics.areEqual(this.f117303a, w33Var.f117303a) && Intrinsics.areEqual(this.f117304b, w33Var.f117304b) && Intrinsics.areEqual(this.f117305c, w33Var.f117305c) && Intrinsics.areEqual(this.f117306d, w33Var.f117306d) && Intrinsics.areEqual(this.f117307e, w33Var.f117307e);
    }

    public final int hashCode() {
        return this.f117307e.hashCode() + ((this.f117306d.hashCode() + ((this.f117305c.hashCode() + ((this.f117304b.hashCode() + (this.f117303a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TimeProviderContainer(progressIncrementer=" + this.f117303a + ", adBlockDurationProvider=" + this.f117304b + ", defaultContentDelayProvider=" + this.f117305c + ", closableAdChecker=" + this.f117306d + ", closeTimerProgressIncrementer=" + this.f117307e + ")";
    }

    public w33(nh2 nh2Var, u2 u2Var, vb0 vb0Var, iv ivVar, vv vvVar) {
        this.f117303a = nh2Var;
        this.f117304b = u2Var;
        this.f117305c = vb0Var;
        this.f117306d = ivVar;
        this.f117307e = vvVar;
    }
}
