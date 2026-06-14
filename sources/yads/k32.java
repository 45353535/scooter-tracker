package yads;

import com.appsflyer.AdRevenueScheme;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class k32 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k32 f112571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k32 f112572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k32 f112573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k32[] f112574f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112575b;

    static {
        k32 k32Var = new k32(0, "AD", "ad");
        f112571c = k32Var;
        k32 k32Var2 = new k32(1, "BULK", "bulk");
        f112572d = k32Var2;
        k32 k32Var3 = new k32(2, "SLIDER", AdRevenueScheme.AD_UNIT);
        f112573e = k32Var3;
        k32[] k32VarArr = {k32Var, k32Var2, k32Var3};
        f112574f = k32VarArr;
        qf.a.a(k32VarArr);
    }

    public k32(int i10, String str, String str2) {
        this.f112575b = str2;
    }

    public static k32 valueOf(String str) {
        return (k32) Enum.valueOf(k32.class, str);
    }

    public static k32[] values() {
        return (k32[]) f112574f.clone();
    }
}
