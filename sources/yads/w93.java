package yads;

import android.content.Context;
import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class w93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tj3 f117359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sa3 f117360b;

    public /* synthetic */ w93(Context context, mr1 mr1Var) {
        this(q62.a(), new sa3(context, mr1Var));
    }

    public final s93 a(r62 r62Var) {
        String strC;
        tj3 tj3Var = this.f117359a;
        tj3Var.f116267a.getClass();
        int i10 = r62Var.f115340a;
        sn2 sn2Var = new sn2(r62Var.f115341b);
        Map mapEmptyMap = r62Var.f115342c;
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        String strA = ((u62) tj3Var.f116268b).a(new rn2(i10, sn2Var, mapEmptyMap));
        Map mapEmptyMap2 = r62Var.f115342c;
        if (mapEmptyMap2 == null) {
            mapEmptyMap2 = MapsKt.emptyMap();
        }
        cn cnVar = new cn(mapEmptyMap2);
        if (strA != null && strA.length() != 0) {
            try {
                n93 n93VarA = this.f117360b.a(strA, cnVar);
                if (n93VarA != null) {
                    Map map = r62Var.f115342c;
                    if (map == null || (strC = ez0.c(map, f01.B)) == null || !Boolean.parseBoolean(strC)) {
                        strA = null;
                    }
                    return new s93(n93VarA, strA);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public w93(tj3 tj3Var, sa3 sa3Var) {
        this.f117359a = tj3Var;
        this.f117360b = sa3Var;
    }
}
