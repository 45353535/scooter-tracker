package f1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class gf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final gf f69954c = new gf("CONNECTION_UNKNOWN", 0, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final gf f69955d = new gf("CONNECTION_ERROR", 1, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final gf f69956e = new gf("CONNECTION_WIFI", 2, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final gf f69957f = new gf("CONNECTION_MOBILE", 3, 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ gf[] f69958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f69959h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69960b;

    static {
        gf[] gfVarArrD = d();
        f69958g = gfVarArrD;
        f69959h = qf.a.a(gfVarArrD);
    }

    public gf(String str, int i10, int i11) {
        this.f69960b = i11;
    }

    public static final /* synthetic */ gf[] d() {
        return new gf[]{f69954c, f69955d, f69956e, f69957f};
    }

    public static gf valueOf(String str) {
        return (gf) Enum.valueOf(gf.class, str);
    }

    public static gf[] values() {
        return (gf[]) f69958g.clone();
    }

    public final int g() {
        return this.f69960b;
    }
}
