package f1;

import g1.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final la f70040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.b f70041b;

    public hb(la laVar, a.b bVar) {
        this.f70040a = laVar;
        this.f70041b = bVar;
    }

    public final a.b a() {
        return this.f70041b;
    }

    public final la b() {
        return this.f70040a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb)) {
            return false;
        }
        hb hbVar = (hb) obj;
        return Intrinsics.areEqual(this.f70040a, hbVar.f70040a) && this.f70041b == hbVar.f70041b;
    }

    public int hashCode() {
        la laVar = this.f70040a;
        int iHashCode = (laVar == null ? 0 : laVar.hashCode()) * 31;
        a.b bVar = this.f70041b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ImpressionHolder(impression=" + this.f70040a + ", error=" + this.f70041b + ")";
    }
}
