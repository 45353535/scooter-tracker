package com.explorestack.protobuf;

/* JADX INFO: loaded from: classes7.dex */
public abstract class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f19468a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f19469b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f19470c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f19471d = c(3, 2);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19472a;

        static {
            int[] iArr = new int[b.values().length];
            f19472a = iArr;
            try {
                iArr[b.f19473d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19472a[b.f19474e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19472a[b.f19475f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19472a[b.f19476g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19472a[b.f19477h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19472a[b.f19478i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19472a[b.f19479j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19472a[b.f19480k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19472a[b.f19484o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19472a[b.f19485p.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19472a[b.f19487r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19472a[b.f19488s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19472a[b.f19489t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19472a[b.f19490u.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19472a[b.f19481l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19472a[b.f19482m.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19472a[b.f19483n.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f19472a[b.f19486q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f19473d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f19474e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f19475f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f19476g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f19477h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f19478i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f19479j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f19480k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f19481l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f19482m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f19483n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f19484o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f19485p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f19486q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f19487r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f19488s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f19489t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final b f19490u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final /* synthetic */ b[] f19491v;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f19492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f19493c;

        enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // com.explorestack.protobuf.z2.b
            public boolean h() {
                return false;
            }
        }

        /* JADX INFO: renamed from: com.explorestack.protobuf.z2$b$b, reason: collision with other inner class name */
        enum C0325b extends b {
            C0325b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // com.explorestack.protobuf.z2.b
            public boolean h() {
                return false;
            }
        }

        enum c extends b {
            c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // com.explorestack.protobuf.z2.b
            public boolean h() {
                return false;
            }
        }

        enum d extends b {
            d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // com.explorestack.protobuf.z2.b
            public boolean h() {
                return false;
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f19473d = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f19474e = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f19475f = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f19476g = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f19477h = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f19478i = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f19479j = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f19480k = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f19481l = aVar;
            c cVar3 = c.MESSAGE;
            C0325b c0325b = new C0325b("GROUP", 9, cVar3, 3);
            f19482m = c0325b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f19483n = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f19484o = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f19485p = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f19486q = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f19487r = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f19488s = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f19489t = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f19490u = bVar14;
            f19491v = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0325b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        /* synthetic */ b(String str, int i10, c cVar, int i11, a aVar) {
            this(str, i10, cVar, i11);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f19491v.clone();
        }

        public c d() {
            return this.f19492b;
        }

        public int g() {
            return this.f19493c;
        }

        public boolean h() {
            return true;
        }

        private b(String str, int i10, c cVar, int i11) {
            this.f19492b = cVar;
            this.f19493c = i11;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(ByteString.EMPTY),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f19504b;

        c(Object obj) {
            this.f19504b = obj;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f19505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f19506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f19507d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ d[] f19508e;

        enum a extends d {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.explorestack.protobuf.z2.d
            Object a(l lVar) {
                return lVar.I();
            }
        }

        enum b extends d {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.explorestack.protobuf.z2.d
            Object a(l lVar) {
                return lVar.J();
            }
        }

        enum c extends d {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.explorestack.protobuf.z2.d
            Object a(l lVar) {
                return lVar.r();
            }
        }

        static {
            a aVar = new a("LOOSE", 0);
            f19505b = aVar;
            b bVar = new b("STRICT", 1);
            f19506c = bVar;
            c cVar = new c("LAZY", 2);
            f19507d = cVar;
            f19508e = new d[]{aVar, bVar, cVar};
        }

        private d(String str, int i10) {
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f19508e.clone();
        }

        abstract Object a(l lVar);

        /* synthetic */ d(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    public static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }

    static Object d(l lVar, b bVar, d dVar) {
        switch (a.f19472a[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(lVar.s());
            case 2:
                return Float.valueOf(lVar.w());
            case 3:
                return Long.valueOf(lVar.z());
            case 4:
                return Long.valueOf(lVar.M());
            case 5:
                return Integer.valueOf(lVar.y());
            case 6:
                return Long.valueOf(lVar.v());
            case 7:
                return Integer.valueOf(lVar.u());
            case 8:
                return Boolean.valueOf(lVar.q());
            case 9:
                return lVar.r();
            case 10:
                return Integer.valueOf(lVar.L());
            case 11:
                return Integer.valueOf(lVar.E());
            case 12:
                return Long.valueOf(lVar.F());
            case 13:
                return Integer.valueOf(lVar.G());
            case 14:
                return Long.valueOf(lVar.H());
            case 15:
                return dVar.a(lVar);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
