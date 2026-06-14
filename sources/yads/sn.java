package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class sn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mx2 f115879a;

    public sn(mx2 mx2Var) {
        this.f115879a = mx2Var;
    }

    public final mx2 a() {
        return this.f115879a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof sn) && Intrinsics.areEqual(((sn) obj).f115879a, this.f115879a);
    }

    public final int hashCode() {
        return this.f115879a.hashCode();
    }

    public final String toString() {
        return this.f115879a.toString();
    }
}
