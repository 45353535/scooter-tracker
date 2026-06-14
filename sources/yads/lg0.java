package yads;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.widget.ProgressBar;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lg0 implements DivCustomContainerViewAdapter {
    public static Integer a(k8.x9 x9Var, String str) {
        Object objB;
        JSONObject jSONObject = x9Var.f92310i;
        String strOptString = jSONObject != null ? jSONObject.optString(str) : null;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(Integer.valueOf(Color.parseColor(strOptString)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return (Integer) (Result.i(objB) ? null : objB);
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final View createView(k8.x9 x9Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
        ProgressBar progressBar = new ProgressBar(div2View.getContext(), null, R.attr.progressBarStyleHorizontal);
        Integer numA = a(x9Var, "progress_color");
        if (numA != null) {
            progressBar.setProgressTintList(ColorStateList.valueOf(numA.intValue()));
        }
        Integer numA2 = a(x9Var, "background_color");
        if (numA2 != null) {
            progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(numA2.intValue()));
        }
        return progressBar;
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
