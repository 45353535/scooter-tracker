package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114886b;

    public q70(String str, String str2) {
        this.f114885a = str;
        this.f114886b = str2;
    }

    public final String a() {
        return this.f114885a;
    }

    public final String b() {
        return this.f114886b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q70)) {
            return false;
        }
        q70 q70Var = (q70) obj;
        return Intrinsics.areEqual(this.f114885a, q70Var.f114885a) && Intrinsics.areEqual(this.f114886b, q70Var.f114886b);
    }

    public final int hashCode() {
        return this.f114886b.hashCode() + (this.f114885a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelMediationAdapterParameterData(name=" + this.f114885a + ", value=" + this.f114886b + ")";
    }
}
