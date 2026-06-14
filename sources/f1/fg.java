package f1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class fg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fg f69867d = new fg("UNKNOWN", 0, 0, "Unknown");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fg f69868e = new fg("ETHERNET", 1, 1, "Ethernet");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final fg f69869f = new fg("WIFI", 2, 2, "WIFI");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final fg f69870g = new fg("CELLULAR_UNKNOWN", 3, 3, "Cellular_Unknown");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final fg f69871h = new fg("CELLULAR_2G", 4, 4, "Cellular_2G");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final fg f69872i = new fg("CELLULAR_3G", 5, 5, "Cellular_3G");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final fg f69873j = new fg("CELLULAR_4G", 6, 6, "Cellular_4G");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final fg f69874k = new fg("CELLULAR_5G", 7, 7, "Cellular_5G");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ fg[] f69875l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f69876m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f69878c;

    static {
        fg[] fgVarArrD = d();
        f69875l = fgVarArrD;
        f69876m = qf.a.a(fgVarArrD);
    }

    public fg(String str, int i10, int i11, String str2) {
        this.f69877b = i11;
        this.f69878c = str2;
    }

    public static final /* synthetic */ fg[] d() {
        return new fg[]{f69867d, f69868e, f69869f, f69870g, f69871h, f69872i, f69873j, f69874k};
    }

    public static fg valueOf(String str) {
        return (fg) Enum.valueOf(fg.class, str);
    }

    public static fg[] values() {
        return (fg[]) f69875l.clone();
    }

    public final String g() {
        return this.f69878c;
    }

    public final int h() {
        return this.f69877b;
    }
}
