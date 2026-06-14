package se;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ff.a f100019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f100020b;

    public d(ff.a expectedType, Object response) {
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        Intrinsics.checkNotNullParameter(response, "response");
        this.f100019a = expectedType;
        this.f100020b = response;
    }

    public final ff.a a() {
        return this.f100019a;
    }

    public final Object b() {
        return this.f100020b;
    }

    public final Object c() {
        return this.f100020b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f100019a, dVar.f100019a) && Intrinsics.areEqual(this.f100020b, dVar.f100020b);
    }

    public int hashCode() {
        return (this.f100019a.hashCode() * 31) + this.f100020b.hashCode();
    }

    public String toString() {
        return "HttpResponseContainer(expectedType=" + this.f100019a + ", response=" + this.f100020b + ')';
    }
}
