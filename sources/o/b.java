package o;

import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import q.i;
import s.i;
import y.m;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f96178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f96179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f96180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f96181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f96182e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f96183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f96184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f96185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f96186d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f96187e;

        public a(b bVar) {
            this.f96183a = CollectionsKt.toMutableList((Collection) bVar.c());
            this.f96184b = CollectionsKt.toMutableList((Collection) bVar.e());
            this.f96185c = CollectionsKt.toMutableList((Collection) bVar.d());
            this.f96186d = CollectionsKt.toMutableList((Collection) bVar.b());
            this.f96187e = CollectionsKt.toMutableList((Collection) bVar.a());
        }

        public final a a(i.a aVar) {
            this.f96187e.add(aVar);
            return this;
        }

        public final a b(i.a aVar, Class cls) {
            this.f96186d.add(TuplesKt.to(aVar, cls));
            return this;
        }

        public final a c(u.b bVar, Class cls) {
            this.f96185c.add(TuplesKt.to(bVar, cls));
            return this;
        }

        public final a d(v.d dVar, Class cls) {
            this.f96184b.add(TuplesKt.to(dVar, cls));
            return this;
        }

        public final b e() {
            return new b(c0.c.a(this.f96183a), c0.c.a(this.f96184b), c0.c.a(this.f96185c), c0.c.a(this.f96186d), c0.c.a(this.f96187e), null);
        }

        public final List f() {
            return this.f96187e;
        }

        public final List g() {
            return this.f96186d;
        }
    }

    public /* synthetic */ b(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    public final List a() {
        return this.f96182e;
    }

    public final List b() {
        return this.f96181d;
    }

    public final List c() {
        return this.f96178a;
    }

    public final List d() {
        return this.f96180c;
    }

    public final List e() {
        return this.f96179b;
    }

    public final String f(Object obj, m mVar) {
        List list = this.f96180c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) list.get(i10);
            u.b bVar = (u.b) pair.component1();
            if (((Class) pair.component2()).isAssignableFrom(obj.getClass())) {
                Intrinsics.checkNotNull(bVar, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String strA = bVar.a(obj, mVar);
                if (strA != null) {
                    return strA;
                }
            }
        }
        return null;
    }

    public final Object g(Object obj, m mVar) {
        List list = this.f96179b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) list.get(i10);
            v.d dVar = (v.d) pair.component1();
            if (((Class) pair.component2()).isAssignableFrom(obj.getClass())) {
                Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object objA = dVar.a(obj, mVar);
                if (objA != null) {
                    obj = objA;
                }
            }
        }
        return obj;
    }

    public final a h() {
        return new a(this);
    }

    public final Pair i(s.m mVar, m mVar2, e eVar, int i10) {
        int size = this.f96182e.size();
        while (i10 < size) {
            q.i iVarA = ((i.a) this.f96182e.get(i10)).a(mVar, mVar2, eVar);
            if (iVarA != null) {
                return TuplesKt.to(iVarA, Integer.valueOf(i10));
            }
            i10++;
        }
        return null;
    }

    public final Pair j(Object obj, m mVar, e eVar, int i10) {
        int size = this.f96181d.size();
        while (i10 < size) {
            Pair pair = (Pair) this.f96181d.get(i10);
            i.a aVar = (i.a) pair.component1();
            if (((Class) pair.component2()).isAssignableFrom(obj.getClass())) {
                Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                s.i iVarA = aVar.a(obj, mVar, eVar);
                if (iVarA != null) {
                    return TuplesKt.to(iVarA, Integer.valueOf(i10));
                }
            }
            i10++;
        }
        return null;
    }

    private b(List list, List list2, List list3, List list4, List list5) {
        this.f96178a = list;
        this.f96179b = list2;
        this.f96180c = list3;
        this.f96181d = list4;
        this.f96182e = list5;
    }

    public b() {
        this(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList());
    }
}
