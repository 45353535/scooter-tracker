package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Fo extends C2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f36896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f36897b;

    public /* synthetic */ Fo(Map map, ArrayList arrayList, int i10) {
        this((i10 & 1) != 0 ? MapsKt.emptyMap() : map, (i10 & 2) != 0 ? CollectionsKt.emptyList() : arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fo)) {
            return false;
        }
        Fo fo = (Fo) obj;
        return Intrinsics.areEqual(this.f36896a, fo.f36896a) && Intrinsics.areEqual(this.f36897b, fo.f36897b);
    }

    public final int hashCode() {
        return this.f36897b.hashCode() + (this.f36896a.hashCode() * 31);
    }

    public final String toString() {
        return "WithExtras(macros=" + this.f36896a + ", trackers=" + this.f36897b + ")";
    }

    public Fo(Map macros, List trackers) {
        Intrinsics.checkNotNullParameter(macros, "macros");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        this.f36896a = macros;
        this.f36897b = trackers;
    }
}
