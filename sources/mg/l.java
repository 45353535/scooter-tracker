package mg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f94912b = new l("SUCCESSFUL", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f94913c = new l("REREGISTER", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f94914d = new l("CANCELLED", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f94915e = new l("ALREADY_SELECTED", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ l[] f94916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f94917g;

    static {
        l[] lVarArrD = d();
        f94916f = lVarArrD;
        f94917g = qf.a.a(lVarArrD);
    }

    private l(String str, int i10) {
    }

    private static final /* synthetic */ l[] d() {
        return new l[]{f94912b, f94913c, f94914d, f94915e};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f94916f.clone();
    }
}
