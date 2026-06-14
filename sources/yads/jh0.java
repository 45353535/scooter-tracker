package yads;

import android.content.Context;
import android.view.View;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;

/* JADX INFO: loaded from: classes4.dex */
public final class jh0 implements DivExtensionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hh0 f112335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lh0 f112336b;

    public /* synthetic */ jh0(hh0 hh0Var) {
        this(hh0Var, new lh0());
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public /* synthetic */ void beforeBindView(Div2View div2View, ExpressionResolver expressionResolver, View view, k8.f7 f7Var) {
        d7.a.a(this, div2View, expressionResolver, view, f7Var);
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void bindView(Div2View div2View, ExpressionResolver expressionResolver, View view, k8.f7 f7Var) {
        Context context = view.getContext();
        kh0 kh0VarA = this.f112336b.a(f7Var);
        if (kh0VarA != null) {
            fu fuVar = new fu(context, new ih0(this.f112335a, kh0VarA));
            view.setOnTouchListener(fuVar);
            view.setOnClickListener(fuVar);
        }
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final boolean matches(k8.f7 f7Var) {
        return this.f112336b.a(f7Var) != null;
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public /* synthetic */ void preprocess(k8.f7 f7Var, ExpressionResolver expressionResolver) {
        d7.a.b(this, f7Var, expressionResolver);
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void unbindView(Div2View div2View, ExpressionResolver expressionResolver, View view, k8.f7 f7Var) {
        view.setOnTouchListener(null);
        view.setOnClickListener(null);
    }

    public jh0(hh0 hh0Var, lh0 lh0Var) {
        this.f112335a = hh0Var;
        this.f112336b = lh0Var;
    }
}
