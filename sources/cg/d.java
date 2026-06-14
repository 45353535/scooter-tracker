package cg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f6846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f6847b;

    public /* synthetic */ d(Object obj, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, j10);
    }

    public final Object a() {
        return this.f6846a;
    }

    public final long b() {
        return this.f6847b;
    }

    public final Object c() {
        return this.f6846a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f6846a, dVar.f6846a) && kotlin.time.b.l(this.f6847b, dVar.f6847b);
    }

    public int hashCode() {
        Object obj = this.f6846a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + kotlin.time.b.y(this.f6847b);
    }

    public String toString() {
        return "TimedValue(value=" + this.f6846a + ", duration=" + ((Object) kotlin.time.b.L(this.f6847b)) + ')';
    }

    private d(Object obj, long j10) {
        this.f6846a = obj;
        this.f6847b = j10;
    }
}
