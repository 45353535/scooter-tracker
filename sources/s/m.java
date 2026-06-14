package s;

import kotlin.jvm.internal.Intrinsics;
import q.p;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f99537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f99538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q.f f99539c;

    public m(p pVar, String str, q.f fVar) {
        super(null);
        this.f99537a = pVar;
        this.f99538b = str;
        this.f99539c = fVar;
    }

    public final q.f a() {
        return this.f99539c;
    }

    public final p b() {
        return this.f99537a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.f99537a, mVar.f99537a) && Intrinsics.areEqual(this.f99538b, mVar.f99538b) && this.f99539c == mVar.f99539c;
    }

    public int hashCode() {
        int iHashCode = this.f99537a.hashCode() * 31;
        String str = this.f99538b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f99539c.hashCode();
    }
}
