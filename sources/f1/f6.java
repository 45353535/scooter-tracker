package f1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class f6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f6 f69801c = new f6("TRACKING_UNKNOWN", 0, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f6 f69802d = new f6("TRACKING_ENABLED", 1, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f6 f69803e = new f6("TRACKING_LIMITED", 2, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f6[] f69804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f69805g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69806b;

    static {
        f6[] f6VarArrD = d();
        f69804f = f6VarArrD;
        f69805g = qf.a.a(f6VarArrD);
    }

    public f6(String str, int i10, int i11) {
        this.f69806b = i11;
    }

    public static final /* synthetic */ f6[] d() {
        return new f6[]{f69801c, f69802d, f69803e};
    }

    public static f6 valueOf(String str) {
        return (f6) Enum.valueOf(f6.class, str);
    }

    public static f6[] values() {
        return (f6[]) f69804f.clone();
    }

    public final int g() {
        return this.f69806b;
    }
}
