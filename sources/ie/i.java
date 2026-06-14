package ie;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oe.v;
import oe.w;
import ze.u;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f74721g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f74715a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f74716b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f74717c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Function1 f74718d = new Function1() { // from class: ie.g
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return i.f((le.j) obj);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f74719e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f74720f = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f74722h = u.f119366a.b();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(le.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return Unit.f93236a;
    }

    public static /* synthetic */ void n(i iVar, v vVar, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: ie.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return i.o(obj2);
                }
            };
        }
        iVar.m(vVar, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Function1 function1, Function1 function12, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        if (function1 != null) {
            function1.invoke(obj);
        }
        function12.invoke(obj);
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(v vVar, c scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        ze.b bVar = (ze.b) scope.getAttributes().d(w.a(), new Function0() { // from class: ie.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.r();
            }
        });
        Object obj = scope.n().f74716b.get(vVar.getKey());
        Intrinsics.checkNotNull(obj);
        Object objA = vVar.a((Function1) obj);
        vVar.b(objA, scope);
        bVar.e(vVar.getKey(), objA);
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ze.b r() {
        return ze.d.a(true);
    }

    public final Function1 g() {
        return this.f74718d;
    }

    public final boolean h() {
        return this.f74721g;
    }

    public final boolean i() {
        return this.f74719e;
    }

    public final boolean j() {
        return this.f74720f;
    }

    public final void k(c client) {
        Intrinsics.checkNotNullParameter(client, "client");
        Iterator it = this.f74715a.values().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(client);
        }
        Iterator it2 = this.f74717c.values().iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(client);
        }
    }

    public final void l(String key, Function1 block) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f74717c.put(key, block);
    }

    public final void m(final v plugin, final Function1 configure) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        Intrinsics.checkNotNullParameter(configure, "configure");
        final Function1 function1 = (Function1) this.f74716b.get(plugin.getKey());
        this.f74716b.put(plugin.getKey(), new Function1() { // from class: ie.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.p(function1, configure, obj);
            }
        });
        if (this.f74715a.containsKey(plugin.getKey())) {
            return;
        }
        this.f74715a.put(plugin.getKey(), new Function1() { // from class: ie.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.q(plugin, (c) obj);
            }
        });
    }

    public final void s(i other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f74719e = other.f74719e;
        this.f74720f = other.f74720f;
        this.f74721g = other.f74721g;
        this.f74715a.putAll(other.f74715a);
        this.f74716b.putAll(other.f74716b);
        this.f74717c.putAll(other.f74717c);
    }
}
