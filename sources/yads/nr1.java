package yads;

import android.content.Context;
import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class nr1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m93 f114003b = wr3.f117545a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f114004c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr1(Context context) {
        super(0);
        this.f114004c = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        vr3 vr3Var;
        m93 m93Var = this.f114003b;
        Context context = this.f114004c;
        ((wr3) m93Var).getClass();
        vr3 vr3Var2 = wr3.f117547c;
        if (vr3Var2 != null) {
            return vr3Var2;
        }
        synchronized (wr3.f117546b) {
            try {
                vr3Var = wr3.f117547c;
                if (vr3Var == null) {
                    String str = sb.a(context) ? "322a737a-a0ca-44e0-bc85-649b1c7c1db6" : "478cb909-6ad1-4e12-84cc-b3629a789f93";
                    jg jgVar = new jg(context);
                    try {
                        AppMetricaAdapter appMetricaAdapter = jgVar.f112334a;
                        if (appMetricaAdapter != null) {
                            appMetricaAdapter.a(str);
                        }
                    } catch (Throwable unused) {
                        boolean z10 = lb1.f113032a;
                    }
                    Object obj = vt2.f117186j;
                    vr3Var = new vr3(jgVar, ut2.a().a(context));
                    wr3.f117547c = vr3Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return vr3Var;
    }
}
