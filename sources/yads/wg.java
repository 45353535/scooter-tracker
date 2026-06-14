package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.ReporterConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class wg extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in3 f117445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f117446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg f117447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f117448e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(in3 in3Var, Context context, xg xgVar, String str) {
        super(0);
        this.f117445b = in3Var;
        this.f117446c = context;
        this.f117447d = xgVar;
        this.f117448e = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        in3 in3Var = this.f117445b;
        in3Var.f112065a.a(this.f117446c);
        xg xgVar = this.f117447d;
        Context context = this.f117446c;
        String str = this.f117448e;
        xgVar.getClass();
        try {
            AppMetrica.activateReporter(context, ReporterConfig.newConfigBuilder(str).build());
        } catch (Throwable unused) {
            boolean z10 = lb1.f113032a;
        }
        return AppMetrica.getReporter(this.f117446c, this.f117448e);
    }
}
