package yads;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class kg0 implements DivCustomContainerViewAdapter {
    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final View createView(k8.x9 x9Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
        Context context = div2View.getContext();
        c83 c83Var = j72.f112253c.a(context).f112256b;
        JSONObject jSONObject = x9Var.f92310i;
        Object obj = jSONObject != null ? jSONObject.get("on_image_url") : null;
        String str = obj instanceof String ? (String) obj : null;
        JSONObject jSONObject2 = x9Var.f92310i;
        Object obj2 = jSONObject2 != null ? jSONObject2.get("off_image_url") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        m43 m43Var = new m43(context);
        if (str != null) {
            m43Var.setCheckedIcon(new BitmapDrawable(context.getResources(), c83Var.a(str)));
        }
        if (str2 != null) {
            m43Var.setUncheckedIcon(new BitmapDrawable(context.getResources(), c83Var.a(str2)));
        }
        return m43Var;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final boolean isCustomTypeSupported(String str) {
        return Intrinsics.areEqual("mute_button", str);
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
