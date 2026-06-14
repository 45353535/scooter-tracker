package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class l30 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l30 f112933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l30 f112934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l30 f112935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l30 f112936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ l30[] f112937g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112938b;

    static {
        l30 l30Var = new l30(0, "CROSS_CLICKED", "cross_clicked");
        f112933c = l30Var;
        l30 l30Var2 = new l30(1, "CROSS_TIMER_START", "cross_timer_start");
        f112934d = l30Var2;
        l30 l30Var3 = new l30(2, "CROSS_TIMER_END", "cross_timer_end");
        f112935e = l30Var3;
        l30 l30Var4 = new l30(3, "FAILED_TO_CREATE_DOWNLOAD_MANAGER", "failed_to_create_download_manager");
        f112936f = l30Var4;
        l30[] l30VarArr = {l30Var, l30Var2, l30Var3, l30Var4, new l30(4, "LISTENER_IS_NULL_ON_LOADING_FINISHED", "listener_is_null_on_loading_finished")};
        f112937g = l30VarArr;
        qf.a.a(l30VarArr);
    }

    public l30(int i10, String str, String str2) {
        this.f112938b = str2;
    }

    public static l30 valueOf(String str) {
        return (l30) Enum.valueOf(l30.class, str);
    }

    public static l30[] values() {
        return (l30[]) f112937g.clone();
    }
}
