package pf;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f98304b = new a("COROUTINE_SUSPENDED", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f98305c = new a("UNDECIDED", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f98306d = new a("RESUMED", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ a[] f98307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f98308f;

    static {
        a[] aVarArrD = d();
        f98307e = aVarArrD;
        f98308f = qf.a.a(aVarArrD);
    }

    private a(String str, int i10) {
    }

    private static final /* synthetic */ a[] d() {
        return new a[]{f98304b, f98305c, f98306d};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f98307e.clone();
    }
}
