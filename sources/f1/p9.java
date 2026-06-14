package f1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class p9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p9 f70767b = new p9("PORTRAIT", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p9 f70768c = new p9("LANDSCAPE", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p9 f70769d = new p9("PORTRAIT_REVERSE", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p9 f70770e = new p9("LANDSCAPE_REVERSE", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p9 f70771f = new p9("PORTRAIT_LEFT", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p9 f70772g = new p9("PORTRAIT_RIGHT", 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p9 f70773h = new p9("LANDSCAPE_LEFT", 6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p9 f70774i = new p9("LANDSCAPE_RIGHT", 7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ p9[] f70775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f70776k;

    static {
        p9[] p9VarArrD = d();
        f70775j = p9VarArrD;
        f70776k = qf.a.a(p9VarArrD);
    }

    public p9(String str, int i10) {
    }

    public static final /* synthetic */ p9[] d() {
        return new p9[]{f70767b, f70768c, f70769d, f70770e, f70771f, f70772g, f70773h, f70774i};
    }

    public static p9 valueOf(String str) {
        return (p9) Enum.valueOf(p9.class, str);
    }

    public static p9[] values() {
        return (p9[]) f70775j.clone();
    }
}
