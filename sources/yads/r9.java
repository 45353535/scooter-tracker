package yads;

import android.content.Context;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class r9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q9 f115368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f115369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r9 f115370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r9 f115371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r9 f115372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ r9[] f115373g;

    static {
        r9 r9Var = new r9(0, "BROWSER_CONTROL_PANEL_HEIGHT");
        f115370d = r9Var;
        r9 r9Var2 = new r9(1, "BROWSER_CONTROL_PANEL_BUTTON_PADDING");
        f115371e = r9Var2;
        r9 r9Var3 = new r9(2, "BROWSER_CONTROL_PANEL_TITLE_TEXT_SIZE");
        f115372f = r9Var3;
        r9[] r9VarArr = {r9Var, r9Var2, r9Var3};
        f115373g = r9VarArr;
        qf.a.a(r9VarArr);
        f115368b = new q9();
        f115369c = MapsKt.mutableMapOf(TuplesKt.to(q9.a("values_dimen_%s", r9Var.name()), 48), TuplesKt.to(q9.a("values_dimen_%s_sw600dp", r9Var.name()), 56), TuplesKt.to(q9.a("values_dimen_%s", r9Var2.name()), 15), TuplesKt.to(q9.a("values_dimen_%s_sw600dp", r9Var2.name()), 17), TuplesKt.to(q9.a("values_dimen_%s", r9Var3.name()), 19), TuplesKt.to(q9.a("values_dimen_%s_sw600dp", r9Var3.name()), 23));
    }

    public r9(int i10, String str) {
    }

    public static r9 valueOf(String str) {
        return (r9) Enum.valueOf(r9.class, str);
    }

    public static r9[] values() {
        return (r9[]) f115373g.clone();
    }

    public final int a(Context context) {
        try {
            q9 q9Var = f115368b;
            StringBuilder sb2 = new StringBuilder(name());
            if (kotlin.ranges.g.j(qi3.d(context), qi3.b(context)) >= 600) {
                sb2.append("_sw600dp");
            }
            String string = sb2.toString();
            q9Var.getClass();
            Integer num = (Integer) f115369c.get(q9.a("values_dimen_%s", string));
            if (num != null) {
                return num.intValue();
            }
        } catch (Exception unused) {
        }
        try {
            q9 q9Var2 = f115368b;
            String strName = name();
            q9Var2.getClass();
            Integer num2 = (Integer) f115369c.get(q9.a("values_dimen_%s", strName));
            if (num2 != null) {
                return num2.intValue();
            }
            return 0;
        } catch (Exception unused2) {
            return 0;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name();
    }
}
