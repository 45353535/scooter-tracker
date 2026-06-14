package yads;

import android.content.Context;
import com.ironsource.D5;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ma3 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ na3 f113365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fa3 f113366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4 f113367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f113368e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma3(na3 na3Var, fa3 fa3Var, c4 c4Var, Context context) {
        super(1);
        this.f113365b = na3Var;
        this.f113366c = fa3Var;
        this.f113367d = c4Var;
        this.f113368e = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jj2 jj2Var = (jj2) obj;
        na3 na3Var = this.f113365b;
        fa3 fa3Var = this.f113366c;
        c4 c4Var = this.f113367d;
        Context context = this.f113368e;
        jj2Var.a(D5.M, "UTF-8");
        na3Var.f113765a.getClass();
        jj2Var.a("rnd", String.valueOf(new Random().nextInt(89999999) + 10000000));
        Map mapA = fa3Var.a();
        if (mapA != null) {
            for (Map.Entry entry : mapA.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!StringsKt.y0(str)) {
                    jj2Var.a(str, str2);
                }
            }
        }
        fl0 fl0Var = c4Var.f109195b.f108850a;
        na3Var.f113767c.getClass();
        if (!bv2.a(context)) {
            jj2Var.a(CommonUrlParts.UUID, fl0Var.b());
            jj2Var.a("mauid", fl0Var.f110763d);
        }
        na3Var.f113766b.getClass();
        ew ewVar = new ew(jj2Var);
        hw.f111788a.getClass();
        jw jwVar = (jw) gw.a(context);
        ewVar.invoke("gdpr", jwVar.c());
        ewVar.invoke("gdpr_consent", jwVar.b());
        ewVar.invoke("parsed_purpose_consents", jwVar.d());
        ewVar.invoke("parsed_vendor_consents", jwVar.e());
        ewVar.invoke("cmp_present", Integer.valueOf(jwVar.a() ? 1 : 0).toString());
        new kl0(context, c4Var).a(context, new jl0(jj2Var));
        return jj2Var;
    }
}
