package b1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f5789b = new d("NONE", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f5790c = new d("INTEGRATION", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f5791d = new d("ALL", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d[] f5792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f5793f;

    static {
        d[] dVarArrD = d();
        f5792e = dVarArrD;
        f5793f = qf.a.a(dVarArrD);
    }

    public d(String str, int i10) {
    }

    public static final /* synthetic */ d[] d() {
        return new d[]{f5789b, f5790c, f5791d};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f5792e.clone();
    }
}
