package y;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements Iterable, yf.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f108314c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f108315d = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f108316b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f108317a;

        public a(n nVar) {
            this.f108317a = MapsKt.toMutableMap(nVar.f108316b);
        }

        public final n a() {
            return new n(c0.c.b(this.f108317a), null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ n(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public final Map e() {
        if (isEmpty()) {
            return MapsKt.emptyMap();
        }
        Map map = this.f108316b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return linkedHashMap;
        }
        androidx.privacysandbox.ads.adservices.topics.a.a(((Map.Entry) it.next()).getValue());
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.areEqual(this.f108316b, ((n) obj).f108316b);
    }

    public final a f() {
        return new a(this);
    }

    public int hashCode() {
        return this.f108316b.hashCode();
    }

    public final boolean isEmpty() {
        return this.f108316b.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Map map = this.f108316b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            androidx.privacysandbox.ads.adservices.topics.a.a(entry.getValue());
            arrayList.add(TuplesKt.to(str, null));
        }
        return arrayList.iterator();
    }

    public String toString() {
        return "Parameters(entries=" + this.f108316b + ')';
    }

    private n(Map map) {
        this.f108316b = map;
    }

    public n() {
        this(MapsKt.emptyMap());
    }
}
