package lf;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f94209b = new l("SYNCHRONIZED", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f94210c = new l("PUBLICATION", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f94211d = new l("NONE", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ l[] f94212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f94213f;

    static {
        l[] lVarArrD = d();
        f94212e = lVarArrD;
        f94213f = qf.a.a(lVarArrD);
    }

    private l(String str, int i10) {
    }

    private static final /* synthetic */ l[] d() {
        return new l[]{f94209b, f94210c, f94211d};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f94212e.clone();
    }
}
