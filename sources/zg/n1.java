package zg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n1 f119451d = new n1("OBJ", 0, '{', '}');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n1 f119452e = new n1("LIST", 1, '[', ']');

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n1 f119453f = new n1("MAP", 2, '{', '}');

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n1 f119454g = new n1("POLY_OBJ", 3, '[', ']');

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ n1[] f119455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f119456i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f119457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f119458c;

    static {
        n1[] n1VarArrD = d();
        f119455h = n1VarArrD;
        f119456i = qf.a.a(n1VarArrD);
    }

    private n1(String str, int i10, char c10, char c11) {
        this.f119457b = c10;
        this.f119458c = c11;
    }

    private static final /* synthetic */ n1[] d() {
        return new n1[]{f119451d, f119452e, f119453f, f119454g};
    }

    public static EnumEntries g() {
        return f119456i;
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) f119455h.clone();
    }
}
