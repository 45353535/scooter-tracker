package f1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class z9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z9 f71783b = new z9("COUNTDOWN_COMPLETE", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z9 f71784c = new z9("CTA_SHOW", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ z9[] f71785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f71786e;

    static {
        z9[] z9VarArrD = d();
        f71785d = z9VarArrD;
        f71786e = qf.a.a(z9VarArrD);
    }

    public z9(String str, int i10) {
    }

    public static final /* synthetic */ z9[] d() {
        return new z9[]{f71783b, f71784c};
    }

    public static z9 valueOf(String str) {
        return (z9) Enum.valueOf(z9.class, str);
    }

    public static z9[] values() {
        return (z9[]) f71785d.clone();
    }
}
