package com.explorestack.protobuf;

import com.explorestack.protobuf.j0;

/* JADX INFO: loaded from: classes7.dex */
final class b0 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.reflect.Field f18855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f18856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class f18857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f18858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.reflect.Field f18859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f18860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f18861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f18862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n1 f18863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.lang.reflect.Field f18864k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Class f18865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f18866m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j0.e f18867n;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18868a;

        static {
            int[] iArr = new int[d0.values().length];
            f18868a = iArr;
            try {
                iArr[d0.f18956p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18868a[d0.f18964x.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18868a[d0.H.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18868a[d0.f18942d0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private b0(java.lang.reflect.Field field, int i10, d0 d0Var, Class cls, java.lang.reflect.Field field2, int i11, boolean z10, boolean z11, n1 n1Var, Class cls2, Object obj, j0.e eVar, java.lang.reflect.Field field3) {
        this.f18855b = field;
        this.f18856c = d0Var;
        this.f18857d = cls;
        this.f18858e = i10;
        this.f18859f = field2;
        this.f18860g = i11;
        this.f18861h = z10;
        this.f18862i = z11;
        this.f18863j = n1Var;
        this.f18865l = cls2;
        this.f18866m = obj;
        this.f18867n = eVar;
        this.f18864k = field3;
    }

    private static void a(int i10) {
        if (i10 > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + i10);
    }

    public static b0 d(java.lang.reflect.Field field, int i10, d0 d0Var, boolean z10) {
        a(i10);
        j0.b(field, "field");
        j0.b(d0Var, "fieldType");
        if (d0Var == d0.H || d0Var == d0.f18942d0) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new b0(field, i10, d0Var, null, null, 0, false, z10, null, null, null, null, null);
    }

    public static b0 e(java.lang.reflect.Field field, int i10, d0 d0Var, j0.e eVar) {
        a(i10);
        j0.b(field, "field");
        return new b0(field, i10, d0Var, null, null, 0, false, false, null, null, null, eVar, null);
    }

    public static b0 f(java.lang.reflect.Field field, int i10, Object obj, j0.e eVar) {
        j0.b(obj, "mapDefaultEntry");
        a(i10);
        j0.b(field, "field");
        return new b0(field, i10, d0.f18943e0, null, null, 0, false, true, null, null, obj, eVar, null);
    }

    public static b0 g(int i10, d0 d0Var, n1 n1Var, Class cls, boolean z10, j0.e eVar) {
        a(i10);
        j0.b(d0Var, "fieldType");
        j0.b(n1Var, "oneof");
        j0.b(cls, "oneofStoredType");
        if (d0Var.j()) {
            return new b0(null, i10, d0Var, null, null, 0, false, z10, n1Var, cls, null, eVar, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i10 + " is of type " + d0Var);
    }

    public static b0 h(java.lang.reflect.Field field, int i10, d0 d0Var, java.lang.reflect.Field field2) {
        a(i10);
        j0.b(field, "field");
        j0.b(d0Var, "fieldType");
        if (d0Var == d0.H || d0Var == d0.f18942d0) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new b0(field, i10, d0Var, null, null, 0, false, false, null, null, null, null, field2);
    }

    public static b0 i(java.lang.reflect.Field field, int i10, d0 d0Var, j0.e eVar, java.lang.reflect.Field field2) {
        a(i10);
        j0.b(field, "field");
        return new b0(field, i10, d0Var, null, null, 0, false, false, null, null, null, eVar, field2);
    }

    public static b0 j(java.lang.reflect.Field field, int i10, d0 d0Var, java.lang.reflect.Field field2, int i11, boolean z10, j0.e eVar) {
        a(i10);
        j0.b(field, "field");
        j0.b(d0Var, "fieldType");
        j0.b(field2, "presenceField");
        if (field2 == null || x(i11)) {
            return new b0(field, i10, d0Var, null, field2, i11, false, z10, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i11);
    }

    public static b0 k(java.lang.reflect.Field field, int i10, d0 d0Var, java.lang.reflect.Field field2, int i11, boolean z10, j0.e eVar) {
        a(i10);
        j0.b(field, "field");
        j0.b(d0Var, "fieldType");
        j0.b(field2, "presenceField");
        if (field2 == null || x(i11)) {
            return new b0(field, i10, d0Var, null, field2, i11, true, z10, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i11);
    }

    public static b0 l(java.lang.reflect.Field field, int i10, d0 d0Var, Class cls) {
        a(i10);
        j0.b(field, "field");
        j0.b(d0Var, "fieldType");
        j0.b(cls, "messageClass");
        return new b0(field, i10, d0Var, cls, null, 0, false, false, null, null, null, null, null);
    }

    private static boolean x(int i10) {
        return i10 != 0 && (i10 & (i10 + (-1))) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(b0 b0Var) {
        return this.f18858e - b0Var.f18858e;
    }

    public java.lang.reflect.Field m() {
        return this.f18864k;
    }

    public j0.e n() {
        return this.f18867n;
    }

    public java.lang.reflect.Field o() {
        return this.f18855b;
    }

    public int p() {
        return this.f18858e;
    }

    public Object q() {
        return this.f18866m;
    }

    public Class r() {
        int i10 = a.f18868a[this.f18856c.ordinal()];
        if (i10 == 1 || i10 == 2) {
            java.lang.reflect.Field field = this.f18855b;
            return field != null ? field.getType() : this.f18865l;
        }
        if (i10 == 3 || i10 == 4) {
            return this.f18857d;
        }
        return null;
    }

    public n1 s() {
        return this.f18863j;
    }

    public java.lang.reflect.Field t() {
        return this.f18859f;
    }

    public int u() {
        return this.f18860g;
    }

    public d0 v() {
        return this.f18856c;
    }

    public boolean w() {
        return this.f18862i;
    }

    public boolean y() {
        return this.f18861h;
    }
}
