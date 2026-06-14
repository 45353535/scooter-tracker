package gg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f72765b = new a("SUSPEND", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f72766c = new a("DROP_OLDEST", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f72767d = new a("DROP_LATEST", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ a[] f72768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f72769f;

    static {
        a[] aVarArrD = d();
        f72768e = aVarArrD;
        f72769f = qf.a.a(aVarArrD);
    }

    private a(String str, int i10) {
    }

    private static final /* synthetic */ a[] d() {
        return new a[]{f72765b, f72766c, f72767d};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f72768e.clone();
    }
}
