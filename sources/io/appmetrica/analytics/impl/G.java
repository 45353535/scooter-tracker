package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f75804c;

    public G(int i10, int i11, int i12) {
        this.f75802a = i10;
        this.f75803b = i11;
        this.f75804c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(G.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.id.AdvIdGetterController.CanTrackIdentifiers");
        }
        G g10 = (G) obj;
        return this.f75802a == g10.f75802a && this.f75803b == g10.f75803b && this.f75804c == g10.f75804c;
    }

    public final int hashCode() {
        return Q7.a(this.f75804c) + ((Q7.a(this.f75803b) + (Q7.a(this.f75802a) * 31)) * 31);
    }

    public final String toString() {
        return "CanTrackIdentifiers(canTrackGaid=" + H.a(this.f75802a) + ", canTrackHoaid=" + H.a(this.f75803b) + ", canTrackYandexAdvId=" + H.a(this.f75804c) + ')';
    }
}
