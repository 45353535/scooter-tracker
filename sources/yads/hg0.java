package yads;

import android.view.View;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;

/* JADX INFO: loaded from: classes4.dex */
public final class hg0 implements DivCustomContainerViewAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivCustomContainerViewAdapter[] f111574a;

    public hg0(DivCustomContainerViewAdapter... divCustomContainerViewAdapterArr) {
        this.f111574a = divCustomContainerViewAdapterArr;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final View createView(k8.x9 x9Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
        DivCustomContainerViewAdapter divCustomContainerViewAdapter;
        View viewCreateView;
        DivCustomContainerViewAdapter[] divCustomContainerViewAdapterArr = this.f111574a;
        int length = divCustomContainerViewAdapterArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                divCustomContainerViewAdapter = null;
                break;
            }
            divCustomContainerViewAdapter = divCustomContainerViewAdapterArr[i10];
            if (divCustomContainerViewAdapter.isCustomTypeSupported(x9Var.f92311j)) {
                break;
            }
            i10++;
        }
        return (divCustomContainerViewAdapter == null || (viewCreateView = divCustomContainerViewAdapter.createView(x9Var, div2View, expressionResolver, divStatePath)) == null) ? new View(div2View.getContext()) : viewCreateView;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final boolean isCustomTypeSupported(String str) {
        for (DivCustomContainerViewAdapter divCustomContainerViewAdapter : this.f111574a) {
            if (divCustomContainerViewAdapter.isCustomTypeSupported(str)) {
                return true;
            }
        }
        return false;
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
