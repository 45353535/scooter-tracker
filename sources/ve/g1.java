package ve;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f106675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f106676b;

    public g1(h0 encodedParametersBuilder) {
        Intrinsics.checkNotNullParameter(encodedParametersBuilder, "encodedParametersBuilder");
        this.f106675a = encodedParametersBuilder;
        this.f106676b = encodedParametersBuilder.b();
    }

    @Override // ze.x
    public List a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List listA = this.f106675a.a(f.m(name, false, 1, null));
        if (listA == null) {
            return null;
        }
        List list = listA;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f.k((String) it.next(), 0, 0, true, null, 11, null));
        }
        return arrayList;
    }

    @Override // ze.x
    public boolean b() {
        return this.f106676b;
    }

    @Override // ve.h0
    public g0 build() {
        return h1.d(this.f106675a);
    }

    @Override // ze.x
    public void c(String name, Iterable values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        h0 h0Var = this.f106675a;
        String strM = f.m(name, false, 1, null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(f.o((String) it.next()));
        }
        h0Var.c(strM, arrayList);
    }

    @Override // ze.x
    public void clear() {
        this.f106675a.clear();
    }

    @Override // ze.x
    public boolean contains(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f106675a.contains(f.m(name, false, 1, null));
    }

    @Override // ze.x
    public void d(ze.w stringValues) {
        Intrinsics.checkNotNullParameter(stringValues, "stringValues");
        h1.c(this.f106675a, stringValues);
    }

    @Override // ze.x
    public void e(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f106675a.e(f.m(name, false, 1, null), f.o(value));
    }

    @Override // ze.x
    public Set entries() {
        return h1.d(this.f106675a).entries();
    }

    @Override // ze.x
    public boolean isEmpty() {
        return this.f106675a.isEmpty();
    }

    @Override // ze.x
    public Set names() {
        Set setNames = this.f106675a.names();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setNames, 10));
        Iterator it = setNames.iterator();
        while (it.hasNext()) {
            arrayList.add(f.k((String) it.next(), 0, 0, false, null, 15, null));
        }
        return CollectionsKt.toSet(arrayList);
    }
}
