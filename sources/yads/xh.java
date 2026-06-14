package yads;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class xh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dm2 f117811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f117812b;

    public xh(dm2 dm2Var, boolean z10) {
        this.f117811a = dm2Var;
        this.f117812b = z10;
    }

    public final void a(ArrayList arrayList) {
        Iterator it;
        Map mapPlus;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aa2 aa2Var = (aa2) it2.next();
            if (this.f117812b) {
                Lazy lazy = hf.f111567a;
                ef efVar = aa2Var.f108615a;
                it = it2;
                Pair pair = TuplesKt.to(new Thread("ApplicationExitInfoDetails"), new StackTraceElement[]{new StackTraceElement("ExitInfo", "timestamp", ((SimpleDateFormat) hf.f111567a.getValue()).format(new Date(efVar.f110353a)), 0), new StackTraceElement("ExitInfo", "description", efVar.f110354b, 0), new StackTraceElement("Memory", "pss", hf.a(efVar.f110358f), 0), new StackTraceElement("Memory", "rss", hf.a(efVar.f110359g), 0), new StackTraceElement("Process", "name", efVar.f110360h, 0), new StackTraceElement("Process", "pid", String.valueOf(efVar.f110357e), 0), new StackTraceElement("Process", "importance", String.valueOf(efVar.f110356d), 0), new StackTraceElement("Process", com.taurusx.tax.g.e0.f66120c, String.valueOf(efVar.f110362j), 0), new StackTraceElement("Process", "status", String.valueOf(efVar.f110361i), 0)});
                mapPlus = MapsKt.plus(aa2Var.f108616b, TuplesKt.to((Thread) pair.component1(), (StackTraceElement[]) pair.component2()));
            } else {
                it = it2;
                mapPlus = aa2Var.f108616b;
            }
            this.f117811a.reportAnr(mapPlus);
            it2 = it;
        }
    }
}
