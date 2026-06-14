package wg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import yg.d2;
import yg.k2;
import yg.n;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements SerialDescriptor, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f107988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f107989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f107990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f107991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f107992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String[] f107993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SerialDescriptor[] f107994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List[] f107995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean[] f107996i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f107997j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final SerialDescriptor[] f107998k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Lazy f107999l;

    public h(String serialName, l kind, int i10, List typeParameters, a builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f107988a = serialName;
        this.f107989b = kind;
        this.f107990c = i10;
        this.f107991d = builder.c();
        this.f107992e = CollectionsKt.toHashSet(builder.f());
        String[] strArr = (String[]) builder.f().toArray(new String[0]);
        this.f107993f = strArr;
        this.f107994g = d2.b(builder.e());
        this.f107995h = (List[]) builder.d().toArray(new List[0]);
        this.f107996i = CollectionsKt.toBooleanArray(builder.g());
        Iterable<IndexedValue> iterableWithIndex = ArraysKt.withIndex(strArr);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10));
        for (IndexedValue indexedValue : iterableWithIndex) {
            arrayList.add(TuplesKt.to(indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex())));
        }
        this.f107997j = MapsKt.toMap(arrayList);
        this.f107998k = d2.b(typeParameters);
        this.f107999l = lf.i.a(new Function0() { // from class: wg.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(h.k(this.f107987b));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(h hVar) {
        return k2.b(hVar, hVar.f107998k);
    }

    private final int l() {
        return ((Number) this.f107999l.getValue()).intValue();
    }

    @Override // yg.n
    public Set a() {
        return this.f107992e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public /* synthetic */ boolean b() {
        return f.c(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.f107997j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor d(int i10) {
        return this.f107994g[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int e() {
        return this.f107990c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        if (!Intrinsics.areEqual(h(), serialDescriptor.h()) || !Arrays.equals(this.f107998k, ((h) obj).f107998k) || e() != serialDescriptor.e()) {
            return false;
        }
        int iE = e();
        for (int i10 = 0; i10 < iE; i10++) {
            if (!Intrinsics.areEqual(d(i10).h(), serialDescriptor.d(i10).h()) || !Intrinsics.areEqual(d(i10).getKind(), serialDescriptor.d(i10).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String f(int i10) {
        return this.f107993f[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List g(int i10) {
        return this.f107995h[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List getAnnotations() {
        return this.f107991d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public l getKind() {
        return this.f107989b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String h() {
        return this.f107988a;
    }

    public int hashCode() {
        return l();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean i(int i10) {
        return this.f107996i[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public /* synthetic */ boolean isInline() {
        return f.b(this);
    }

    public String toString() {
        return k2.c(this);
    }
}
