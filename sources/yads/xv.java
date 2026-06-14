package yads;

import android.net.Uri;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xv extends DivActionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wv f117971a;

    public xv(wv wvVar) {
        this.f117971a = wvVar;
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(k8.j1 j1Var, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        Expression expression = j1Var.f88315k;
        boolean z10 = false;
        if (expression != null) {
            String string = ((Uri) expression.evaluate(expressionResolver)).toString();
            if (Intrinsics.areEqual(string, "close_ad")) {
                wv wvVar = this.f117971a;
                vf0.a(wvVar.f117606a);
                wvVar.f117607b.e();
            } else if (Intrinsics.areEqual(string, "close_dialog")) {
                vf0.a(this.f117971a.f117606a);
            }
            z10 = true;
        }
        return z10 ? z10 : super.handleAction(j1Var, divViewFacade, expressionResolver);
    }
}
