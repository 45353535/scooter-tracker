package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ja0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f112276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f112277d;

    public ja0(String str, String str2, List list, List list2) {
        this.f112274a = str;
        this.f112275b = str2;
        this.f112276c = list;
        this.f112277d = list2;
    }

    @Override // yads.m0
    public final String a() {
        return this.f112274a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja0)) {
            return false;
        }
        ja0 ja0Var = (ja0) obj;
        return Intrinsics.areEqual(this.f112274a, ja0Var.f112274a) && Intrinsics.areEqual(this.f112275b, ja0Var.f112275b) && Intrinsics.areEqual(this.f112276c, ja0Var.f112276c) && Intrinsics.areEqual(this.f112277d, ja0Var.f112277d);
    }

    public final int hashCode() {
        int iA = j4.a(this.f112275b, this.f112274a.hashCode() * 31, 31);
        List list = this.f112276c;
        return this.f112277d.hashCode() + ((iA + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        return "DeeplinkAction(actionType=" + this.f112274a + ", fallbackUrl=" + this.f112275b + ", fallbackTrackingUrls=" + this.f112276c + ", preferredPackages=" + this.f112277d + ")";
    }
}
