package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class d12 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d12 f109692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d12 f109693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d12[] f109694e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109695b;

    static {
        d12 d12Var = new d12(0, "CUSTOM", "custom");
        f109692c = d12Var;
        d12 d12Var2 = new d12(1, "TEMPLATE", "template");
        f109693d = d12Var2;
        d12[] d12VarArr = {d12Var, d12Var2};
        f109694e = d12VarArr;
        qf.a.a(d12VarArr);
    }

    public d12(int i10, String str, String str2) {
        this.f109695b = str2;
    }

    public static d12 valueOf(String str) {
        return (d12) Enum.valueOf(d12.class, str);
    }

    public static d12[] values() {
        return (d12[]) f109694e.clone();
    }
}
