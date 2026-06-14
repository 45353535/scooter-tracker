package f1;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vd {
    public static final List a(JSONArray jSONArray) {
        return pe.e(jSONArray);
    }

    public static final List b(JSONArray jSONArray) {
        return pe.f(jSONArray);
    }

    public static final PackageInfo c(PackageManager packageManager, String str, int i10) {
        return pe.a(packageManager, str, i10);
    }

    public static final String d(PackageManager packageManager, String str) {
        return pe.d(packageManager, str);
    }

    public static final b9 e(i8 i8Var) {
        return pe.c(i8Var);
    }

    public static final z8 f(i iVar) {
        return pe.b(iVar);
    }
}
