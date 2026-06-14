package yads;

import android.content.Context;
import java.util.Map;
import kotlin.collections.MapsKt;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class uz1 implements zn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tj3 f116817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o22 f116818b;

    public /* synthetic */ uz1(Context context, mr1 mr1Var) {
        this(q62.a(), new o22(context, mr1Var));
    }

    @Override // yads.zn2
    public final Object a(r62 r62Var) {
        tj3 tj3Var = this.f116817a;
        tj3Var.f116267a.getClass();
        int i10 = r62Var.f115340a;
        sn2 sn2Var = new sn2(r62Var.f115341b);
        Map mapEmptyMap = r62Var.f115342c;
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        String strA = ((u62) tj3Var.f116268b).a(new rn2(i10, sn2Var, mapEmptyMap));
        if (strA == null || strA.length() == 0) {
            return null;
        }
        Map mapEmptyMap2 = r62Var.f115342c;
        if (mapEmptyMap2 == null) {
            mapEmptyMap2 = MapsKt.emptyMap();
        }
        try {
            return this.f116818b.a(strA, new cn(mapEmptyMap2));
        } catch (JSONException e10) {
            lf.c.b(e10);
            boolean z10 = lb1.f113032a;
            return null;
        } catch (mz1 e11) {
            lf.c.b(e11);
            boolean z11 = lb1.f113032a;
            return null;
        }
    }

    public uz1(tj3 tj3Var, o22 o22Var) {
        this.f116817a = tj3Var;
        this.f116818b = o22Var;
    }
}
