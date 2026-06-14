package f1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class s7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s7 f71051b = new s7("START", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s7 f71052c = new s7("RESUME", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s7 f71053d = new s7("PAUSE", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s7 f71054e = new s7("BUFFER_START", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s7 f71055f = new s7("BUFFER_END", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s7 f71056g = new s7("QUARTILE1", 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s7 f71057h = new s7("MIDPOINT", 6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s7 f71058i = new s7("QUARTILE3", 7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final s7 f71059j = new s7("COMPLETED", 8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final s7 f71060k = new s7("SKIP", 9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final s7 f71061l = new s7("VOLUME_CHANGE", 10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ s7[] f71062m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f71063n;

    static {
        s7[] s7VarArrD = d();
        f71062m = s7VarArrD;
        f71063n = qf.a.a(s7VarArrD);
    }

    public s7(String str, int i10) {
    }

    public static final /* synthetic */ s7[] d() {
        return new s7[]{f71051b, f71052c, f71053d, f71054e, f71055f, f71056g, f71057h, f71058i, f71059j, f71060k, f71061l};
    }

    public static s7 valueOf(String str) {
        return (s7) Enum.valueOf(s7.class, str);
    }

    public static s7[] values() {
        return (s7[]) f71062m.clone();
    }
}
