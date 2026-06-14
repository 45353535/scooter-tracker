package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class vd3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final vd3 f116978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final vd3 f116979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final vd3 f116980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final vd3 f116981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final vd3 f116982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final vd3 f116983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final vd3 f116984h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final vd3 f116985i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final vd3 f116986j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final vd3 f116987k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ vd3[] f116988l;

    static {
        vd3 vd3Var = new vd3(0, "INITIAL");
        f116978b = vd3Var;
        vd3 vd3Var2 = new vd3(1, "PREPARING");
        f116979c = vd3Var2;
        vd3 vd3Var3 = new vd3(2, "PREPARED");
        f116980d = vd3Var3;
        vd3 vd3Var4 = new vd3(3, "PLAYING");
        f116981e = vd3Var4;
        vd3 vd3Var5 = new vd3(4, "STOPPED");
        f116982f = vd3Var5;
        vd3 vd3Var6 = new vd3(5, "FINISHED");
        f116983g = vd3Var6;
        vd3 vd3Var7 = new vd3(6, "PAUSED");
        f116984h = vd3Var7;
        vd3 vd3Var8 = new vd3(7, "BUFFERING");
        f116985i = vd3Var8;
        vd3 vd3Var9 = new vd3(8, "PLAYING_ERROR");
        f116986j = vd3Var9;
        vd3 vd3Var10 = new vd3(9, "PREPARING_ERROR");
        f116987k = vd3Var10;
        vd3[] vd3VarArr = {vd3Var, vd3Var2, vd3Var3, vd3Var4, vd3Var5, vd3Var6, vd3Var7, vd3Var8, vd3Var9, vd3Var10};
        f116988l = vd3VarArr;
        qf.a.a(vd3VarArr);
    }

    public vd3(int i10, String str) {
    }

    public static vd3 valueOf(String str) {
        return (vd3) Enum.valueOf(vd3.class, str);
    }

    public static vd3[] values() {
        return (vd3[]) f116988l.clone();
    }
}
