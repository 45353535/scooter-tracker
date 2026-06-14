package ze;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f119376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f119377b;

    public z(boolean z10, int i10) {
        this.f119376a = z10;
        this.f119377b = z10 ? n.a() : new LinkedHashMap(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(z zVar, String name, List values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        zVar.c(name, values);
        return Unit.f93236a;
    }

    private final List i(String str) {
        List list = (List) this.f119377b.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        n(str);
        this.f119377b.put(str, arrayList);
        return arrayList;
    }

    @Override // ze.x
    public List a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (List) this.f119377b.get(name);
    }

    @Override // ze.x
    public final boolean b() {
        return this.f119376a;
    }

    @Override // ze.x
    public void c(String name, Iterable values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        List listI = i(name);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            o((String) it.next());
        }
        CollectionsKt.addAll(listI, values);
    }

    @Override // ze.x
    public void clear() {
        this.f119377b.clear();
    }

    @Override // ze.x
    public boolean contains(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f119377b.containsKey(name);
    }

    @Override // ze.x
    public void d(w stringValues) {
        Intrinsics.checkNotNullParameter(stringValues, "stringValues");
        stringValues.c(new Function2() { // from class: ze.y
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return z.g(this.f119375b, (String) obj, (List) obj2);
            }
        });
    }

    @Override // ze.x
    public void e(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        o(value);
        i(name).add(value);
    }

    @Override // ze.x
    public Set entries() {
        return m.a(this.f119377b.entrySet());
    }

    public void h(String name, Iterable values) {
        Set setEmptySet;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        List list = (List) this.f119377b.get(name);
        if (list == null || (setEmptySet = CollectionsKt.toSet(list)) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (!setEmptySet.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        c(name, arrayList);
    }

    @Override // ze.x
    public boolean isEmpty() {
        return this.f119377b.isEmpty();
    }

    public String j(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List listA = a(name);
        if (listA != null) {
            return (String) CollectionsKt.firstOrNull(listA);
        }
        return null;
    }

    protected final Map k() {
        return this.f119377b;
    }

    public void l(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f119377b.remove(name);
    }

    public void m(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        o(value);
        List listI = i(name);
        listI.clear();
        listI.add(value);
    }

    protected void n(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // ze.x
    public Set names() {
        return this.f119377b.keySet();
    }

    protected void o(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
