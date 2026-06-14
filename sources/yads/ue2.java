package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ue2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ue2 f116621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ue2 f116622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ue2 f116623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ue2 f116624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ue2[] f116625h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116627c;

    static {
        ue2 ue2Var = new ue2(0, 1001, "TIMEOUT", "The request failed to load due to a timeout");
        f116621d = ue2Var;
        ue2 ue2Var2 = new ue2(1, 1002, "INVALID_CONFIGURATION", "The provided configuration is invalid");
        f116622e = ue2Var2;
        ue2 ue2Var3 = new ue2(2, 1003, "EMPTY_MEDIATION_DATA", "No mediation data was received. Possibly, Client Bidding adapters are not connected");
        f116623f = ue2Var3;
        ue2 ue2Var4 = new ue2(3, 1004, "INVALID_FETCHED_DATA", "The fetched data is invalid");
        f116624g = ue2Var4;
        ue2[] ue2VarArr = {ue2Var, ue2Var2, ue2Var3, ue2Var4};
        f116625h = ue2VarArr;
        qf.a.a(ue2VarArr);
    }

    public ue2(int i10, int i11, String str, String str2) {
        this.f116626b = i11;
        this.f116627c = str2;
    }

    public static ue2 valueOf(String str) {
        return (ue2) Enum.valueOf(ue2.class, str);
    }

    public static ue2[] values() {
        return (ue2[]) f116625h.clone();
    }

    public final int a() {
        return this.f116626b;
    }

    public final String b() {
        return this.f116627c;
    }
}
