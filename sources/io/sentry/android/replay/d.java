package io.sentry.android.replay;

import io.sentry.w7;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f83009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f83010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Date f83011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f83012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f83013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w7.b f83014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f83015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f83016h;

    public d(r recorderConfig, h cache, Date timestamp, int i10, long j10, w7.b replayType, String str, List events) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f83009a = recorderConfig;
        this.f83010b = cache;
        this.f83011c = timestamp;
        this.f83012d = i10;
        this.f83013e = j10;
        this.f83014f = replayType;
        this.f83015g = str;
        this.f83016h = events;
    }

    public final h a() {
        return this.f83010b;
    }

    public final long b() {
        return this.f83013e;
    }

    public final List c() {
        return this.f83016h;
    }

    public final int d() {
        return this.f83012d;
    }

    public final r e() {
        return this.f83009a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f83009a, dVar.f83009a) && Intrinsics.areEqual(this.f83010b, dVar.f83010b) && Intrinsics.areEqual(this.f83011c, dVar.f83011c) && this.f83012d == dVar.f83012d && this.f83013e == dVar.f83013e && this.f83014f == dVar.f83014f && Intrinsics.areEqual(this.f83015g, dVar.f83015g) && Intrinsics.areEqual(this.f83016h, dVar.f83016h);
    }

    public final w7.b f() {
        return this.f83014f;
    }

    public final String g() {
        return this.f83015g;
    }

    public final Date h() {
        return this.f83011c;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.f83009a.hashCode() * 31) + this.f83010b.hashCode()) * 31) + this.f83011c.hashCode()) * 31) + this.f83012d) * 31) + androidx.collection.b.a(this.f83013e)) * 31) + this.f83014f.hashCode()) * 31;
        String str = this.f83015g;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f83016h.hashCode();
    }

    public String toString() {
        return "LastSegmentData(recorderConfig=" + this.f83009a + ", cache=" + this.f83010b + ", timestamp=" + this.f83011c + ", id=" + this.f83012d + ", duration=" + this.f83013e + ", replayType=" + this.f83014f + ", screenAtStart=" + this.f83015g + ", events=" + this.f83016h + ')';
    }
}
