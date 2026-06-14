package com.pgl.ssdk;

/* JADX INFO: loaded from: classes11.dex */
public final class o<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f62166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f62167b;

    public o(A a10, B b10) {
        this.f62166a = a10;
        this.f62167b = b10;
    }

    public static <A, B> o<A, B> a(A a10, B b10) {
        return new o<>(a10, b10);
    }

    public B b() {
        return this.f62167b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        A a10 = this.f62166a;
        if (a10 == null) {
            if (oVar.f62166a != null) {
                return false;
            }
        } else if (!a10.equals(oVar.f62166a)) {
            return false;
        }
        B b10 = this.f62167b;
        if (b10 == null) {
            if (oVar.f62167b != null) {
                return false;
            }
        } else if (!b10.equals(oVar.f62167b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a10 = this.f62166a;
        int iHashCode = ((a10 == null ? 0 : a10.hashCode()) + 31) * 31;
        B b10 = this.f62167b;
        return iHashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public A a() {
        return this.f62166a;
    }
}
