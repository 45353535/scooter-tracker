package kotlinx.serialization.json;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f93651b = new a("NONE", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f93652c = new a("ALL_JSON_OBJECTS", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f93653d = new a("POLYMORPHIC", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ a[] f93654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f93655f;

    static {
        a[] aVarArrD = d();
        f93654e = aVarArrD;
        f93655f = qf.a.a(aVarArrD);
    }

    private a(String str, int i10) {
    }

    private static final /* synthetic */ a[] d() {
        return new a[]{f93651b, f93652c, f93653d};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f93654e.clone();
    }
}
