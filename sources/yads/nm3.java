package yads;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class nm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final im3 f113983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f113984b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public om2 f113985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f113986d;

    public nm3(im3 im3Var) {
        this.f113983a = im3Var;
    }

    public final void a(Context context, List list, om2 om2Var, Object obj) {
        if (list.isEmpty()) {
            om2Var.a(this.f113984b);
            return;
        }
        this.f113985c = om2Var;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ib3 ib3Var = (ib3) it.next();
            this.f113986d++;
            im3 im3Var = this.f113983a;
            mm3 mm3Var = new mm3(this);
            im3Var.getClass();
            jm3 jm3Var = new jm3(mm3Var, new km3(context, ib3Var));
            dc3 dc3Var = im3Var.f112058e;
            es2 es2Var = im3Var.f112055b;
            c4 c4Var = im3Var.f112054a;
            fa3 fa3Var = im3Var.f112056c;
            td3 td3Var = im3Var.f112057d;
            dc3Var.getClass();
            na3 na3Var = new na3();
            String string = ib3Var.f111948i;
            if (string == null) {
                string = "";
            }
            Uri uri = Uri.parse(string);
            if (CollectionsKt.contains(k81.f112641a, uri.getHost())) {
                string = ij2.a(uri, new ma3(na3Var, fa3Var, c4Var, context)).toString();
            }
            String str = string;
            sm3 sm3Var = new sm3(td3Var);
            wj3 wj3Var = new wj3(jm3Var);
            mr1 mr1VarA = ((pr3) es2Var).a();
            Context context2 = context;
            ra3 ra3Var = new ra3(context2, c4Var, mr1VarA, str, wj3Var, ib3Var, sm3Var, new w93(context, mr1VarA));
            ra3Var.f112777q = obj;
            dc3Var.f109882a.a(ra3Var);
            context = context2;
        }
    }
}
