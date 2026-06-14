package f1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class sa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final sa f71087b = new sa("BANNER", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final sa f71088c = new sa("INTERSTITIAL", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final sa f71089d = new sa(com.taurusx.tax.w.s.w.f67531f, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ sa[] f71090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f71091f;

    static {
        sa[] saVarArrD = d();
        f71090e = saVarArrD;
        f71091f = qf.a.a(saVarArrD);
    }

    public sa(String str, int i10) {
    }

    public static final /* synthetic */ sa[] d() {
        return new sa[]{f71087b, f71088c, f71089d};
    }

    public static sa valueOf(String str) {
        return (sa) Enum.valueOf(sa.class, str);
    }

    public static sa[] values() {
        return (sa[]) f71090e.clone();
    }
}
