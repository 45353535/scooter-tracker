package f1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f70877c = new r("IMMEDIATE", 0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f70878d = new r("HIGH", 1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f70879e = new r("NORMAL", 2, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f70880f = new r("LOW", 3, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ r[] f70881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f70882h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f70883b;

    static {
        r[] rVarArrD = d();
        f70881g = rVarArrD;
        f70882h = qf.a.a(rVarArrD);
    }

    public r(String str, int i10, int i11) {
        this.f70883b = i11;
    }

    public static final /* synthetic */ r[] d() {
        return new r[]{f70877c, f70878d, f70879e, f70880f};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f70881g.clone();
    }

    public final int g() {
        return this.f70883b;
    }
}
