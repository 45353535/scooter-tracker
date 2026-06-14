package f1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class gd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final gd f69940c = new gd("INTERSTITIAL", 0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final gd f69941d = new gd("INTERSTITIAL_VIDEO", 1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final gd f69942e = new gd("INTERSTITIAL_REWARD_VIDEO", 2, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final gd f69943f = new gd("BANNER", 3, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final gd f69944g = new gd("NONE", 4, 4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ gd[] f69945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f69946i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69947b;

    static {
        gd[] gdVarArrD = d();
        f69945h = gdVarArrD;
        f69946i = qf.a.a(gdVarArrD);
    }

    public gd(String str, int i10, int i11) {
        this.f69947b = i11;
    }

    public static final /* synthetic */ gd[] d() {
        return new gd[]{f69940c, f69941d, f69942e, f69943f, f69944g};
    }

    public static gd valueOf(String str) {
        return (gd) Enum.valueOf(gd.class, str);
    }

    public static gd[] values() {
        return (gd[]) f69945h.clone();
    }
}
