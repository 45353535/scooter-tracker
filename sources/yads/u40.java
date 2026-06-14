package yads;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class u40 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u40 f116482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ u40[] f116483d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116484b;

    static {
        u40 u40Var = new u40(0, "ERROR", "error");
        u40 u40Var2 = new u40(1, "MESSAGE", PglCryptUtils.KEY_MESSAGE);
        f116482c = u40Var2;
        u40[] u40VarArr = {u40Var, u40Var2};
        f116483d = u40VarArr;
        qf.a.a(u40VarArr);
    }

    public u40(int i10, String str, String str2) {
        this.f116484b = str2;
    }

    public static u40 valueOf(String str) {
        return (u40) Enum.valueOf(u40.class, str);
    }

    public static u40[] values() {
        return (u40[]) f116483d.clone();
    }
}
