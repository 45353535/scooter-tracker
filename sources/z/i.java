package z;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import z.c;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f119133c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f119134d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f119135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f119136b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        c.b bVar = c.b.f119121a;
        f119134d = new i(bVar, bVar);
    }

    public i(c cVar, c cVar2) {
        this.f119135a = cVar;
        this.f119136b = cVar2;
    }

    public final c a() {
        return this.f119136b;
    }

    public final c b() {
        return this.f119135a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f119135a, iVar.f119135a) && Intrinsics.areEqual(this.f119136b, iVar.f119136b);
    }

    public int hashCode() {
        return (this.f119135a.hashCode() * 31) + this.f119136b.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.f119135a + ", height=" + this.f119136b + ')';
    }
}
