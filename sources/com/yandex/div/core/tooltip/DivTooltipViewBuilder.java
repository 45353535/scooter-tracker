package com.yandex.div.core.tooltip;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.f7;
import k8.y0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0012¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/core/tooltip/DivTooltipViewBuilder;", "", "Lkf/a;", "Lcom/yandex/div/core/view2/Div2Builder;", "div2Builder", "<init>", "(Lkf/a;)V", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lk8/y0;", "div", "Landroid/view/View;", "prepareTooltipView", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/y0;)Landroid/view/View;", "", "width", "height", "Lcom/yandex/div/core/tooltip/DivTooltipContainer;", "buildTooltipView", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/y0;II)Lcom/yandex/div/core/tooltip/DivTooltipContainer;", "Lkf/a;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivTooltipViewBuilder {

    @NotNull
    private final kf.a div2Builder;

    public DivTooltipViewBuilder(@NotNull kf.a aVar) {
        this.div2Builder = aVar;
    }

    private View prepareTooltipView(BindingContext context, y0 div) {
        f7 f7VarC = div.c();
        View viewBuildView = ((Div2Builder) this.div2Builder.get()).buildView(div, context, DivStatePath.INSTANCE.fromRootDiv$div_release(0L, div));
        ExpressionResolver expressionResolver = context.getExpressionResolver();
        DisplayMetrics displayMetrics = viewBuildView.getContext().getResources().getDisplayMetrics();
        viewBuildView.setLayoutParams(new RelativeLayout.LayoutParams(DivUtilKt.toLayoutParamsSize$default(f7VarC.getWidth(), displayMetrics, expressionResolver, null, 4, null), DivUtilKt.toLayoutParamsSize$default(f7VarC.getHeight(), displayMetrics, expressionResolver, null, 4, null)));
        viewBuildView.setFocusable(true);
        return viewBuildView;
    }

    @NotNull
    public DivTooltipContainer buildTooltipView(@NotNull BindingContext context, @NotNull y0 div, int width, int height) {
        View viewPrepareTooltipView = prepareTooltipView(context, div);
        DivTooltipContainer divTooltipContainer = new DivTooltipContainer(context.getDivView().getContext(), null, 0, 6, null);
        divTooltipContainer.addView(viewPrepareTooltipView);
        divTooltipContainer.setLayoutParams(new ViewGroup.LayoutParams(width, height));
        return divTooltipContainer;
    }
}
