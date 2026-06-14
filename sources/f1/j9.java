package f1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class j9 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j9 f70165c = new j9("CTA_SHOW", 0, "cta_show");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j9 f70166d = new j9("COUNTDOWN_COMPLETE", 1, "countdown_complete");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ j9[] f70167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f70168f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70169b;

    static {
        j9[] j9VarArrD = d();
        f70167e = j9VarArrD;
        f70168f = qf.a.a(j9VarArrD);
    }

    public j9(String str, int i10, String str2) {
        this.f70169b = str2;
    }

    public static final /* synthetic */ j9[] d() {
        return new j9[]{f70165c, f70166d};
    }

    public static j9 valueOf(String str) {
        return (j9) Enum.valueOf(j9.class, str);
    }

    public static j9[] values() {
        return (j9[]) f70167e.clone();
    }

    public final String g() {
        return this.f70169b;
    }
}
