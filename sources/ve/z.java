package ve;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f106771b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final z f106772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final z f106773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final z f106774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final z f106775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final z f106776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final z f106777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final z f106778i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final List f106779j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106780a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return z.f106779j;
        }

        public final z b() {
            return z.f106772c;
        }

        public final z c() {
            return z.f106777h;
        }

        public final z d() {
            return z.f106778i;
        }

        public final z e() {
            return z.f106773d;
        }

        private a() {
        }
    }

    static {
        z zVar = new z("GET");
        f106772c = zVar;
        z zVar2 = new z("POST");
        f106773d = zVar2;
        z zVar3 = new z("PUT");
        f106774e = zVar3;
        z zVar4 = new z("PATCH");
        f106775f = zVar4;
        z zVar5 = new z("DELETE");
        f106776g = zVar5;
        z zVar6 = new z("HEAD");
        f106777h = zVar6;
        z zVar7 = new z("OPTIONS");
        f106778i = zVar7;
        f106779j = CollectionsKt.listOf((Object[]) new z[]{zVar, zVar2, zVar3, zVar4, zVar5, zVar6, zVar7});
    }

    public z(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f106780a = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.areEqual(this.f106780a, ((z) obj).f106780a);
    }

    public final String f() {
        return this.f106780a;
    }

    public int hashCode() {
        return this.f106780a.hashCode();
    }

    public String toString() {
        return this.f106780a;
    }
}
