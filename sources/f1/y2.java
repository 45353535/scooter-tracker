package f1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class y2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y2 f71610b = new y2("SKIP", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y2 f71611c = new y2("CLOSE", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y2 f71612d = new y2("AUTO_ADVANCE", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y2 f71613e = new y2("AD_COMPLETE", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y2 f71614f = new y2("FAILURE", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final y2 f71615g = new y2("UNLOAD", 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ y2[] f71616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f71617i;

    static {
        y2[] y2VarArrD = d();
        f71616h = y2VarArrD;
        f71617i = qf.a.a(y2VarArrD);
    }

    public y2(String str, int i10) {
    }

    public static final /* synthetic */ y2[] d() {
        return new y2[]{f71610b, f71611c, f71612d, f71613e, f71614f, f71615g};
    }

    public static y2 valueOf(String str) {
        return (y2) Enum.valueOf(y2.class, str);
    }

    public static y2[] values() {
        return (y2[]) f71616h.clone();
    }
}
