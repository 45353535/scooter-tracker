package yads;

import android.R;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.view.ViewCompat;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.mobile.ads.R$drawable;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class mg0 implements DivCustomContainerViewAdapter {
    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final View createView(k8.x9 x9Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) throws JSONException {
        int color;
        String string = null;
        ProgressBar progressBar = new ProgressBar(div2View.getContext(), null, R.attr.progressBarStyleHorizontal);
        JSONObject jSONObject = x9Var.f92310i;
        if (jSONObject == null || !jSONObject.has("progress_color")) {
            string = POBCTAOverlayData.DEFAULT_CTA_TEXT_COLOR;
        } else {
            JSONObject jSONObject2 = x9Var.f92310i;
            if (jSONObject2 != null) {
                string = jSONObject2.getString("progress_color");
            }
        }
        try {
            color = Color.parseColor(string);
        } catch (Throwable unused) {
            color = ViewCompat.MEASURED_STATE_MASK;
        }
        Drawable drawable = progressBar.getContext().getDrawable(R$drawable.monetization_ads_internal_circular_close_progress);
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        }
        progressBar.setProgressDrawable(drawable);
        return progressBar;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final boolean isCustomTypeSupported(String str) {
        return Intrinsics.areEqual(str, "close_progress_view");
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
