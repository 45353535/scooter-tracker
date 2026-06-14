package f1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class wd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wd f71448c = new wd("LOADING", 0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wd f71449d = new wd("LOADED", 1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wd f71450e = new wd("DISPLAYED", 2, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final wd f71451f = new wd("CACHED", 3, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wd f71452g = new wd("DISMISSING", 4, 4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wd f71453h = new wd("NONE", 5, 5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ wd[] f71454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f71455j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f71456b;

    static {
        wd[] wdVarArrD = d();
        f71454i = wdVarArrD;
        f71455j = qf.a.a(wdVarArrD);
    }

    public wd(String str, int i10, int i11) {
        this.f71456b = i11;
    }

    public static final /* synthetic */ wd[] d() {
        return new wd[]{f71448c, f71449d, f71450e, f71451f, f71452g, f71453h};
    }

    public static wd valueOf(String str) {
        return (wd) Enum.valueOf(wd.class, str);
    }

    public static wd[] values() {
        return (wd[]) f71454i.clone();
    }
}
