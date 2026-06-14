package ve;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f106709d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final t0 f106710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final t0 f106711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final t0 f106712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final t0 f106713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final t0 f106714i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Map f106715j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f106716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f106717c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t0 a(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            String strC = ze.c0.c(name);
            t0 t0Var = (t0) t0.f106709d.b().get(strC);
            return t0Var == null ? new t0(strC, 0) : t0Var;
        }

        public final Map b() {
            return t0.f106715j;
        }

        public final t0 c() {
            return t0.f106710e;
        }

        private a() {
        }
    }

    static {
        t0 t0Var = new t0("http", 80);
        f106710e = t0Var;
        t0 t0Var2 = new t0("https", 443);
        f106711f = t0Var2;
        t0 t0Var3 = new t0("ws", 80);
        f106712g = t0Var3;
        t0 t0Var4 = new t0("wss", 443);
        f106713h = t0Var4;
        t0 t0Var5 = new t0("socks", 1080);
        f106714i = t0Var5;
        List listListOf = CollectionsKt.listOf((Object[]) new t0[]{t0Var, t0Var2, t0Var3, t0Var4, t0Var5});
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listListOf, 10)), 16));
        for (Object obj : listListOf) {
            linkedHashMap.put(((t0) obj).f106716b, obj);
        }
        f106715j = linkedHashMap;
    }

    public t0(String name, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f106716b = name;
        this.f106717c = i10;
        for (int i11 = 0; i11 < name.length(); i11++) {
            if (!ze.l.a(name.charAt(i11))) {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.areEqual(this.f106716b, t0Var.f106716b) && this.f106717c == t0Var.f106717c;
    }

    public final int h() {
        return this.f106717c;
    }

    public int hashCode() {
        return (this.f106716b.hashCode() * 31) + this.f106717c;
    }

    public final String i() {
        return this.f106716b;
    }

    public String toString() {
        return "URLProtocol(name=" + this.f106716b + ", defaultPort=" + this.f106717c + ')';
    }
}
