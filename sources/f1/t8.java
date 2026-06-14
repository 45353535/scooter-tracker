package f1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class t8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t8 f71148c = new t8("REQUEST_SUCCESS_START", 0, 200);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t8 f71149d = new t8("REQUEST_SUCCESS_END", 1, 299);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t8 f71150e = new t8("REDIRECTION_START", 2, 300);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t8 f71151f = new t8("REDIRECTION_END", 3, 399);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ t8[] f71152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f71153h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f71154b;

    static {
        t8[] t8VarArrD = d();
        f71152g = t8VarArrD;
        f71153h = qf.a.a(t8VarArrD);
    }

    public t8(String str, int i10, int i11) {
        this.f71154b = i11;
    }

    public static final /* synthetic */ t8[] d() {
        return new t8[]{f71148c, f71149d, f71150e, f71151f};
    }

    public static t8 valueOf(String str) {
        return (t8) Enum.valueOf(t8.class, str);
    }

    public static t8[] values() {
        return (t8[]) f71152g.clone();
    }

    public final int g() {
        return this.f71154b;
    }
}
