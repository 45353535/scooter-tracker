package yads;

import android.content.Context;
import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppMetricaAdapter f112334a;

    public jg(Context context) {
        AppMetricaAdapter appMetricaAdapter;
        try {
            appMetricaAdapter = new AppMetricaAdapter(context);
        } catch (Throwable th2) {
            th2.toString();
            boolean z10 = lb1.f113032a;
            appMetricaAdapter = null;
        }
        this.f112334a = appMetricaAdapter;
    }
}
