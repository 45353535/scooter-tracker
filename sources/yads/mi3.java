package yads;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class mi3 implements oc1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mi3 f113514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mi3 f113515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mi3 f113516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ mi3[] f113517f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113518b;

    static {
        mi3 mi3Var = new mi3(0, "DEFAULT", "default");
        f113514c = mi3Var;
        mi3 mi3Var2 = new mi3(1, "LOADING", "loading");
        f113515d = mi3Var2;
        mi3 mi3Var3 = new mi3(2, "HIDDEN", "hidden");
        f113516e = mi3Var3;
        mi3[] mi3VarArr = {mi3Var, mi3Var2, mi3Var3};
        f113517f = mi3VarArr;
        qf.a.a(mi3VarArr);
    }

    public mi3(int i10, String str, String str2) {
        this.f113518b = str2;
    }

    public static mi3 valueOf(String str) {
        return (mi3) Enum.valueOf(mi3.class, str);
    }

    public static mi3[] values() {
        return (mi3[]) f113517f.clone();
    }

    @Override // yads.oc1
    public final String a() {
        String strQuote = JSONObject.quote(this.f113518b);
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        String str = String.format("state: %s", Arrays.copyOf(new Object[]{strQuote}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
