package yads;

import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class vr3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jg f117162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hr2 f117163b;

    public vr3(jg jgVar, hr2 hr2Var) {
        this.f117162a = jgVar;
        this.f117163b = hr2Var;
    }

    public final void a(String str) {
        hr2 hr2Var = this.f117163b;
        if (hr2Var == null || !hr2Var.I) {
            return;
        }
        jg jgVar = this.f117162a;
        jgVar.getClass();
        try {
            AppMetricaAdapter appMetricaAdapter = jgVar.f112334a;
            if (appMetricaAdapter != null) {
                appMetricaAdapter.setExperiments(str);
            }
        } catch (Throwable unused) {
            boolean z10 = lb1.f113032a;
        }
    }

    public final void a(Set set) {
        hr2 hr2Var = this.f117163b;
        if (hr2Var == null || !hr2Var.I) {
            return;
        }
        jg jgVar = this.f117162a;
        jgVar.getClass();
        try {
            AppMetricaAdapter appMetricaAdapter = jgVar.f112334a;
            if (appMetricaAdapter != null) {
                appMetricaAdapter.setTriggeredTestIds(set);
            }
        } catch (Throwable unused) {
            set.toString();
            boolean z10 = lb1.f113032a;
        }
    }
}
