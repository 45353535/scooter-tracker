package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Triple implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f93233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f93234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f93235d;

    public Triple(Object obj, Object obj2, Object obj3) {
        this.f93233b = obj;
        this.f93234c = obj2;
        this.f93235d = obj3;
    }

    public final Object d() {
        return this.f93233b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return Intrinsics.areEqual(this.f93233b, triple.f93233b) && Intrinsics.areEqual(this.f93234c, triple.f93234c) && Intrinsics.areEqual(this.f93235d, triple.f93235d);
    }

    public final Object g() {
        return this.f93234c;
    }

    public final Object h() {
        return this.f93235d;
    }

    public int hashCode() {
        Object obj = this.f93233b;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f93234c;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f93235d;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final Object i() {
        return this.f93233b;
    }

    public final Object j() {
        return this.f93234c;
    }

    public final Object k() {
        return this.f93235d;
    }

    public String toString() {
        return '(' + this.f93233b + ", " + this.f93234c + ", " + this.f93235d + ')';
    }
}
