package f1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class gb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final gb f69925b = new gb("TTL_EXPIRED", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final gb f69926c = new gb("SIZE_LIMIT_EVICTION", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final gb f69927d = new gb("EXPLICIT_EVICTION", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final gb f69928e = new gb("CACHE_CLEARED", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final gb f69929f = new gb("UNKNOWN", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ gb[] f69930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f69931h;

    static {
        gb[] gbVarArrD = d();
        f69930g = gbVarArrD;
        f69931h = qf.a.a(gbVarArrD);
    }

    public gb(String str, int i10) {
    }

    public static final /* synthetic */ gb[] d() {
        return new gb[]{f69925b, f69926c, f69927d, f69928e, f69929f};
    }

    public static gb valueOf(String str) {
        return (gb) Enum.valueOf(gb.class, str);
    }

    public static gb[] values() {
        return (gb[]) f69930g.clone();
    }
}
