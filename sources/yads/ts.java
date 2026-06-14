package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ts {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ts f116350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ts f116351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ts[] f116352d;

    static {
        ts tsVar = new ts(0, "ACTIVE");
        f116350b = tsVar;
        ts tsVar2 = new ts(1, "CANCELED");
        f116351c = tsVar2;
        ts[] tsVarArr = {tsVar, tsVar2};
        f116352d = tsVarArr;
        qf.a.a(tsVarArr);
    }

    public ts(int i10, String str) {
    }

    public static ts valueOf(String str) {
        return (ts) Enum.valueOf(ts.class, str);
    }

    public static ts[] values() {
        return (ts[]) f116352d.clone();
    }
}
