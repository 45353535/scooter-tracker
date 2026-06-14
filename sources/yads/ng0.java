package yads;

import android.view.View;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ng0 implements DivCustomContainerViewAdapter {
    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final View createView(k8.x9 x9Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
        return new tj2(div2View.getContext());
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final boolean isCustomTypeSupported(String str) {
        return Intrinsics.areEqual("rating", str);
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public /* synthetic */ DivPreloader.PreloadReference preload(k8.x9 x9Var, DivPreloader.Callback callback) {
        return y6.e.a(this, x9Var, callback);
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void release(View view, k8.x9 x9Var) {
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void bindView(View view, k8.x9 x9Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
    }
}
