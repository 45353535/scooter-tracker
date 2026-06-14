package yads;

import android.content.Context;
import android.net.Uri;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;

/* JADX INFO: loaded from: classes4.dex */
public final class wg0 extends DivActionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wy f117449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xg0 f117450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hh0 f117451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yh0 f117452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xh0 f117453e;

    public /* synthetic */ wg0(Context context, c4 c4Var, es2 es2Var, t9 t9Var, wy wyVar, xg0 xg0Var, hh0 hh0Var) {
        this(wyVar, xg0Var, hh0Var, new yh0(new qb2(context, c4Var, es2Var, x53.f117714d)), new xh0(t9Var, ((pr3) es2Var).a()));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(org.json.JSONObject r5, android.net.Uri r6, com.yandex.div.core.DivViewFacade r7) {
        /*
            r4 = this;
            java.lang.String r0 = r6.getScheme()
            java.lang.String r1 = "mobileads"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto Lbd
            java.lang.String r0 = r6.getHost()
            if (r0 == 0) goto Lb6
            int r1 = r0.hashCode()
            r2 = 94750088(0x5a5c588, float:1.5589087E-35)
            r3 = 1
            if (r1 == r2) goto La3
            r7 = 866535483(0x33a6483b, float:7.743116E-8)
            if (r1 == r7) goto L94
            r7 = 986975867(0x3ad40e7b, float:0.0016178632)
            if (r1 == r7) goto L50
            r5 = 1270469668(0x4bb9d424, float:2.4356936E7)
            if (r1 == r5) goto L2d
            goto Lb6
        L2d:
            java.lang.String r5 = "trackUrl"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L37
            goto Lb6
        L37:
            yads.yh0 r5 = r4.f117452d
            r5.getClass()
            java.lang.String r7 = "trackingUrl"
            java.lang.String r6 = r6.getQueryParameter(r7)
            if (r6 == 0) goto La2
            int r7 = r6.length()
            if (r7 <= 0) goto La2
            yads.k83 r5 = r5.f118182a
            r5.a(r6)
            goto La2
        L50:
            java.lang.String r7 = "trackAnalytics"
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L59
            goto Lb6
        L59:
            yads.xh0 r7 = r4.f117453e
            r7.getClass()
            java.lang.String r0 = "eventName"
            java.lang.String r6 = r6.getQueryParameter(r0)
            if (r6 == 0) goto La2
            int r0 = r6.length()
            if (r0 != 0) goto L6d
            r6 = 0
        L6d:
            if (r6 == 0) goto La2
            if (r5 == 0) goto L80
            yads.pc1 r0 = r7.f117815c
            r0.getClass()
            java.util.HashMap r5 = yads.pc1.a(r5)
            java.util.Map r5 = kotlin.collections.MapsKt.toMutableMap(r5)
            if (r5 != 0) goto L85
        L80:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L85:
            yads.zl2 r0 = new yads.zl2
            yads.t9 r1 = r7.f117813a
            yads.c r1 = r1.f116116i
            r0.<init>(r6, r5, r1)
            yads.dm2 r5 = r7.f117814b
            r5.a(r0)
            goto La2
        L94:
            java.lang.String r5 = "closeAd"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L9d
            goto Lb6
        L9d:
            yads.wy r5 = r4.f117449a
            r5.e()
        La2:
            return r3
        La3:
            java.lang.String r5 = "click"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto Lac
            goto Lb6
        Lac:
            yads.hh0 r5 = r4.f117451c
            android.view.View r7 = r7.getView()
            r5.a(r6, r7)
            return r3
        Lb6:
            yads.xg0 r5 = r4.f117450b
            boolean r5 = r5.a(r6)
            return r5
        Lbd:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.wg0.a(org.json.JSONObject, android.net.Uri, com.yandex.div.core.DivViewFacade):boolean");
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(k8.j1 j1Var, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        Expression expression;
        return super.handleAction(j1Var, divViewFacade, expressionResolver) || ((expression = j1Var.f88315k) != null && a(j1Var.f88310f, (Uri) expression.evaluate(expressionResolver), divViewFacade));
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(k8.dp dpVar, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        Expression url;
        return super.handleAction(dpVar, divViewFacade, expressionResolver) || ((url = dpVar.getUrl()) != null && a(dpVar.getPayload(), (Uri) url.evaluate(expressionResolver), divViewFacade));
    }

    public wg0(wy wyVar, xg0 xg0Var, hh0 hh0Var, yh0 yh0Var, xh0 xh0Var) {
        this.f117449a = wyVar;
        this.f117450b = xg0Var;
        this.f117451c = hh0Var;
        this.f117452d = yh0Var;
        this.f117453e = xh0Var;
    }
}
