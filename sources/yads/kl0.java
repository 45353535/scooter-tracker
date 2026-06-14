package yads;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import com.adjust.sdk.purchase.ADJPConstants;
import com.ironsource.N6;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final du2 f112743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bv2 f112744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rf0 f112745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nf1 f112746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qd f112747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ll0 f112748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pd f112749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fl0 f112750h;

    public /* synthetic */ kl0(Context context, c4 c4Var) {
        du2 du2Var = new du2();
        bv2 bv2Var = new bv2();
        rf0 rf0Var = new rf0();
        Object obj = nf1.f113852f;
        this(c4Var, du2Var, bv2Var, rf0Var, mf1.a(context), new qd(), new ml0());
    }

    public final void a(Context context, Function2 function2) {
        Location locationA;
        function2.invoke("app_id", context.getPackageName());
        function2.invoke("app_version_code", hg.a(context));
        function2.invoke(CommonUrlParts.APP_VERSION, hg.b(context));
        function2.invoke("vast-integration-type", "inapp_sdk");
        function2.invoke(ADJPConstants.KEY_SDK_VERSION, this.f112743a.a("%d.%d%d"));
        function2.invoke("sdk_version_name", this.f112743a.a("%d.%d.%d"));
        function2.invoke("sdk_vendor", "yandex");
        function2.invoke(((ml0) this.f112748f).b(), this.f112745c.a(context));
        kf1 kf1Var = this.f112745c.f115435b;
        kf1Var.getClass();
        Locale locale = context.getResources().getConfiguration().locale;
        kf1Var.f112700a.getClass();
        function2.invoke(CommonUrlParts.LOCALE, if1.a(locale));
        function2.invoke("content_language", this.f112745c.f115435b.a(context));
        List listB = this.f112745c.f115435b.b(context);
        function2.invoke("device_languages", listB != null ? CollectionsKt.joinToString$default(listB, StringUtils.COMMA, null, null, 0, null, null, 62, null) : null);
        String strC = ((ml0) this.f112748f).c();
        this.f112745c.getClass();
        function2.invoke(strC, rf0.a());
        String strD = ((ml0) this.f112748f).d();
        this.f112745c.getClass();
        function2.invoke(strD, Build.MODEL);
        String strE = ((ml0) this.f112748f).e();
        this.f112745c.getClass();
        function2.invoke(strE, "android");
        String strF = ((ml0) this.f112748f).f();
        this.f112745c.getClass();
        function2.invoke(strF, Build.VERSION.RELEASE);
        Boolean boolC = lb2.c(context);
        if (boolC != null) {
            function2.invoke("vpn_enabled", boolC.booleanValue() ? "1" : "0");
        }
        if (!this.f112744b.b(context) && (locationA = this.f112746d.a()) != null) {
            function2.invoke("location_timestamp", String.valueOf(locationA.getTime()));
            function2.invoke(N6.f41419s, String.valueOf(locationA.getLatitude()));
            function2.invoke("lon", String.valueOf(locationA.getLongitude()));
            function2.invoke("precision", String.valueOf(Math.round(locationA.getAccuracy())));
        }
        if (!this.f112744b.b(context)) {
            function2.invoke(((ml0) this.f112748f).a(), this.f112750h.f110760a);
            rd rdVar = this.f112749g.f114621a;
            boolean z10 = false;
            if (rdVar != null) {
                boolean z11 = rdVar.f115404b;
                String str = rdVar.f115403a;
                this.f112747e.getClass();
                boolean z12 = (str == null || str.length() == 0 || Intrinsics.areEqual("00000000-0000-0000-0000-000000000000", str)) ? false : true;
                if (!z11 && z12) {
                    function2.invoke("google_aid", str);
                }
            }
            rd rdVar2 = this.f112749g.f114622b;
            if (rdVar2 != null) {
                boolean z13 = rdVar2.f115404b;
                String str2 = rdVar2.f115403a;
                this.f112747e.getClass();
                if (str2 != null && str2.length() != 0 && !Intrinsics.areEqual("00000000-0000-0000-0000-000000000000", str2)) {
                    z10 = true;
                }
                if (!z13 && z10) {
                    function2.invoke("huawei_oaid", str2);
                }
            }
        }
        function2.invoke(CommonUrlParts.SCREEN_WIDTH, String.valueOf(qi3.d(context)));
        function2.invoke(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(qi3.b(context)));
        function2.invoke(CommonUrlParts.SCALE_FACTOR, String.valueOf(context.getResources().getDisplayMetrics().density));
        function2.invoke(CommonUrlParts.SCREEN_DPI, String.valueOf(qi3.a(context)));
    }

    public kl0(c4 c4Var, du2 du2Var, bv2 bv2Var, rf0 rf0Var, nf1 nf1Var, qd qdVar, ll0 ll0Var) {
        this.f112743a = du2Var;
        this.f112744b = bv2Var;
        this.f112745c = rf0Var;
        this.f112746d = nf1Var;
        this.f112747e = qdVar;
        this.f112748f = ll0Var;
        this.f112749g = c4Var.b();
        this.f112750h = c4Var.c();
    }
}
