package yg;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import wg.m;

/* JADX INFO: loaded from: classes3.dex */
public class i2 implements SerialDescriptor, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f118990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0 f118991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f118992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f118993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f118994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List[] f118995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f118996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f118997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f118998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Lazy f118999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Lazy f119000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Lazy f119001l;

    public i2(String serialName, o0 o0Var, int i10) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f118990a = serialName;
        this.f118991b = o0Var;
        this.f118992c = i10;
        this.f118993d = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f118994e = strArr;
        int i12 = this.f118992c;
        this.f118995f = new List[i12];
        this.f118997h = new boolean[i12];
        this.f118998i = MapsKt.emptyMap();
        lf.l lVar = lf.l.f94210c;
        this.f118999j = lf.i.b(lVar, new Function0() { // from class: yg.f2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i2.q(this.f118966b);
            }
        });
        this.f119000k = lf.i.b(lVar, new Function0() { // from class: yg.g2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i2.w(this.f118974b);
            }
        });
        this.f119001l = lf.i.b(lVar, new Function0() { // from class: yg.h2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(i2.m(this.f118981b));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(i2 i2Var) {
        return k2.b(i2Var, i2Var.s());
    }

    public static /* synthetic */ void o(i2 i2Var, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        i2Var.n(str, z10);
    }

    private final Map p() {
        HashMap map = new HashMap();
        int length = this.f118994e.length;
        for (int i10 = 0; i10 < length; i10++) {
            map.put(this.f118994e[i10], Integer.valueOf(i10));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer[] q(i2 i2Var) {
        KSerializer[] kSerializerArrChildSerializers;
        o0 o0Var = i2Var.f118991b;
        return (o0Var == null || (kSerializerArrChildSerializers = o0Var.childSerializers()) == null) ? l2.f119025a : kSerializerArrChildSerializers;
    }

    private final KSerializer[] r() {
        return (KSerializer[]) this.f118999j.getValue();
    }

    private final int t() {
        return ((Number) this.f119001l.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor[] w(i2 i2Var) {
        ArrayList arrayList;
        KSerializer[] kSerializerArrTypeParametersSerializers;
        o0 o0Var = i2Var.f118991b;
        if (o0Var == null || (kSerializerArrTypeParametersSerializers = o0Var.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                arrayList.add(kSerializer.getDescriptor());
            }
        }
        return d2.b(arrayList);
    }

    @Override // yg.n
    public Set a() {
        return this.f118998i.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public /* synthetic */ boolean b() {
        return wg.f.c(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.f118998i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor d(int i10) {
        return r()[i10].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return this.f118992c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        if (!Intrinsics.areEqual(h(), serialDescriptor.h()) || !Arrays.equals(s(), ((i2) obj).s()) || e() != serialDescriptor.e()) {
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
        return this.f118994e[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List g(int i10) {
        List list = this.f118995f[i10];
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List getAnnotations() {
        List list = this.f118996g;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public wg.l getKind() {
        return m.a.f108008a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String h() {
        return this.f118990a;
    }

    public int hashCode() {
        return t();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean i(int i10) {
        return this.f118997h[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public /* synthetic */ boolean isInline() {
        return wg.f.b(this);
    }

    public final void n(String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.f118994e;
        int i10 = this.f118993d + 1;
        this.f118993d = i10;
        strArr[i10] = name;
        this.f118997h[i10] = z10;
        this.f118995f[i10] = null;
        if (i10 == this.f118992c - 1) {
            this.f118998i = p();
        }
    }

    public final SerialDescriptor[] s() {
        return (SerialDescriptor[]) this.f119000k.getValue();
    }

    public String toString() {
        return k2.c(this);
    }

    public final void u(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        List arrayList = this.f118995f[this.f118993d];
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            this.f118995f[this.f118993d] = arrayList;
        }
        arrayList.add(annotation);
    }

    public final void v(Annotation a10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        if (this.f118996g == null) {
            this.f118996g = new ArrayList(1);
        }
        List list = this.f118996g;
        Intrinsics.checkNotNull(list);
        list.add(a10);
    }

    public /* synthetic */ i2(String str, o0 o0Var, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : o0Var, i10);
    }
}
