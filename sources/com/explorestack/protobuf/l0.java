package com.explorestack.protobuf;

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
/* JADX INFO: loaded from: classes7.dex */
public final class l0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l0 f19193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l0 f19194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l0 f19195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l0 f19196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l0 f19197i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l0 f19198j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l0 f19199k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l0 f19200l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l0 f19201m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l0 f19202n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ l0[] f19203o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f19204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f19205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f19206d;

    static {
        l0 l0Var = new l0("VOID", 0, Void.class, Void.class, null);
        f19193e = l0Var;
        Class cls = Integer.TYPE;
        l0 l0Var2 = new l0("INT", 1, cls, Integer.class, 0);
        f19194f = l0Var2;
        l0 l0Var3 = new l0("LONG", 2, Long.TYPE, Long.class, 0L);
        f19195g = l0Var3;
        l0 l0Var4 = new l0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f19196h = l0Var4;
        l0 l0Var5 = new l0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f19197i = l0Var5;
        l0 l0Var6 = new l0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f19198j = l0Var6;
        l0 l0Var7 = new l0("STRING", 6, String.class, String.class, "");
        f19199k = l0Var7;
        l0 l0Var8 = new l0("BYTE_STRING", 7, ByteString.class, ByteString.class, ByteString.EMPTY);
        f19200l = l0Var8;
        l0 l0Var9 = new l0("ENUM", 8, cls, Integer.class, null);
        f19201m = l0Var9;
        l0 l0Var10 = new l0("MESSAGE", 9, Object.class, Object.class, null);
        f19202n = l0Var10;
        f19203o = new l0[]{l0Var, l0Var2, l0Var3, l0Var4, l0Var5, l0Var6, l0Var7, l0Var8, l0Var9, l0Var10};
    }

    private l0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f19204b = cls;
        this.f19205c = cls2;
        this.f19206d = obj;
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) f19203o.clone();
    }

    public Class d() {
        return this.f19205c;
    }
}
