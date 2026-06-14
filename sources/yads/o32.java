package yads;

import androidx.core.app.NotificationCompat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class o32 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o32 f114180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o32 f114181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ o32[] f114182e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114183b;

    static {
        o32 o32Var = new o32(0, "AD", "ad");
        f114180c = o32Var;
        o32 o32Var2 = new o32(1, "PROMO", NotificationCompat.CATEGORY_PROMO);
        f114181d = o32Var2;
        o32[] o32VarArr = {o32Var, o32Var2};
        f114182e = o32VarArr;
        qf.a.a(o32VarArr);
    }

    public o32(int i10, String str, String str2) {
        this.f114183b = str2;
    }

    public static o32 valueOf(String str) {
        return (o32) Enum.valueOf(o32.class, str);
    }

    public static o32[] values() {
        return (o32[]) f114182e.clone();
    }
}
