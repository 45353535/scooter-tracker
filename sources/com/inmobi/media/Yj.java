package com.inmobi.media;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f38066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f38067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f38068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f38069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f38070g;

    public Yj(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, List priorityEventsList, double d10) {
        Intrinsics.checkNotNullParameter(priorityEventsList, "priorityEventsList");
        this.f38064a = z10;
        this.f38065b = z11;
        this.f38066c = z12;
        this.f38067d = z13;
        this.f38068e = z14;
        this.f38069f = priorityEventsList;
        this.f38070g = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Yj)) {
            return false;
        }
        Yj yj = (Yj) obj;
        return this.f38064a == yj.f38064a && this.f38065b == yj.f38065b && this.f38066c == yj.f38066c && this.f38067d == yj.f38067d && this.f38068e == yj.f38068e && Intrinsics.areEqual(this.f38069f, yj.f38069f) && Double.compare(this.f38070g, yj.f38070g) == 0;
    }

    public final int hashCode() {
        return androidx.collection.a.a(this.f38070g) + ((this.f38069f.hashCode() + ((androidx.compose.foundation.c.a(this.f38068e) + ((androidx.compose.foundation.c.a(this.f38067d) + ((androidx.compose.foundation.c.a(this.f38066c) + ((androidx.compose.foundation.c.a(this.f38065b) + (androidx.compose.foundation.c.a(this.f38064a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TelemetryConfigMetaData(isTelemetryEnabled=" + this.f38064a + ", isImageEnabled=" + this.f38065b + ", isGIFEnabled=" + this.f38066c + ", isVideoEnabled=" + this.f38067d + ", isGeneralEventsDisabled=" + this.f38068e + ", priorityEventsList=" + this.f38069f + ", samplingFactor=" + this.f38070g + ")";
    }
}
