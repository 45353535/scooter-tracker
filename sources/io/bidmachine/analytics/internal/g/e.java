package io.bidmachine.analytics.internal.g;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f79557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f79558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f79559c;

    public enum a {
        UNKNOWN,
        MONITOR_INVALID,
        MONITOR_NO_CONTENT,
        MONITOR_BAD_CONTENT,
        READER_INVALID,
        READER_NO_CONTENT,
        READER_BAD_CONTENT,
        READER_NO_ACCESS
    }

    public e(String str, a aVar, String str2) {
        this.f79557a = str;
        this.f79558b = aVar;
        this.f79559c = str2;
    }

    public final String a() {
        return this.f79557a;
    }

    public final String b() {
        return this.f79559c;
    }

    public final a c() {
        return this.f79558b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f79557a, eVar.f79557a) && this.f79558b == eVar.f79558b && Intrinsics.areEqual(this.f79559c, eVar.f79559c);
    }

    public int hashCode() {
        return (((this.f79557a.hashCode() * 31) + this.f79558b.hashCode()) * 31) + this.f79559c.hashCode();
    }

    public String toString() {
        return "TrackerError(name=" + this.f79557a + ", type=" + this.f79558b + ", reason=" + this.f79559c + ')';
    }

    public /* synthetic */ e(String str, a aVar, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, aVar, (i10 & 4) != 0 ? "" : str2);
    }
}
