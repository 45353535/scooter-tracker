package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ku {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ku f112853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ku f112854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ku[] f112855e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112856b;

    static {
        ku kuVar = new ku(0, "INTERNAL_BROWSER", "internal_browser");
        f112853c = kuVar;
        ku kuVar2 = new ku(1, "BROWSER", "browser");
        f112854d = kuVar2;
        ku[] kuVarArr = {kuVar, kuVar2, new ku(2, "UNKNOWN", "unknown")};
        f112855e = kuVarArr;
        qf.a.a(kuVarArr);
    }

    public ku(int i10, String str, String str2) {
        this.f112856b = str2;
    }

    public static ku valueOf(String str) {
        return (ku) Enum.valueOf(ku.class, str);
    }

    public static ku[] values() {
        return (ku[]) f112855e.clone();
    }
}
