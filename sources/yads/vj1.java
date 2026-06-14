package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class vj1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ vj1[] f117019c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117020b;

    static {
        vj1[] vj1VarArr = {new vj1(0, "STREAMING", "streaming"), new vj1(1, "PROGRESSIVE", "progressive")};
        f117019c = vj1VarArr;
        qf.a.a(vj1VarArr);
    }

    public vj1(int i10, String str, String str2) {
        this.f117020b = str2;
    }

    public static vj1 valueOf(String str) {
        return (vj1) Enum.valueOf(vj1.class, str);
    }

    public static vj1[] values() {
        return (vj1[]) f117019c.clone();
    }
}
