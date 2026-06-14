package yads;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class z00 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z00 f118481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z00 f118482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ z00[] f118483d;

    static {
        z00 z00Var = new z00(0, AdPreferences.TYPE_TEXT);
        f118481b = z00Var;
        z00 z00Var2 = new z00(1, "IMAGE");
        f118482c = z00Var2;
        z00[] z00VarArr = {z00Var, z00Var2};
        f118483d = z00VarArr;
        qf.a.a(z00VarArr);
    }

    public z00(int i10, String str) {
    }

    public static z00 valueOf(String str) {
        return (z00) Enum.valueOf(z00.class, str);
    }

    public static z00[] values() {
        return (z00[]) f118483d.clone();
    }
}
