package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ev0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ev0 f110471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ev0 f110472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ev0 f110473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ev0 f110474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ev0[] f110475f;

    static {
        ev0 ev0Var = new ev0(0, "YS_BOLD");
        f110471b = ev0Var;
        ev0 ev0Var2 = new ev0(1, "YS_LIGHT");
        f110472c = ev0Var2;
        ev0 ev0Var3 = new ev0(2, "YS_MEDIUM");
        f110473d = ev0Var3;
        ev0 ev0Var4 = new ev0(3, "YS_REGULAR");
        f110474e = ev0Var4;
        ev0[] ev0VarArr = {ev0Var, ev0Var2, ev0Var3, ev0Var4};
        f110475f = ev0VarArr;
        qf.a.a(ev0VarArr);
    }

    public ev0(int i10, String str) {
    }

    public static ev0 valueOf(String str) {
        return (ev0) Enum.valueOf(ev0.class, str);
    }

    public static ev0[] values() {
        return (ev0[]) f110475f.clone();
    }
}
