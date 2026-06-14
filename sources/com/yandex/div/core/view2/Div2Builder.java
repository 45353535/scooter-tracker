package com.yandex.div.core.view2;

import android.view.View;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.y0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0011\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/core/view2/Div2Builder;", "", "Lcom/yandex/div/core/view2/DivViewCreator;", "viewCreator", "Lcom/yandex/div/core/view2/DivBinder;", "viewBinder", "Lcom/yandex/div/core/expression/local/DivRuntimeVisitor;", "runtimeVisitor", "<init>", "(Lcom/yandex/div/core/view2/DivViewCreator;Lcom/yandex/div/core/view2/DivBinder;Lcom/yandex/div/core/expression/local/DivRuntimeVisitor;)V", "Lk8/y0;", "data", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/yandex/div/core/state/DivStatePath;", "path", "Landroid/view/View;", "buildView", "(Lk8/y0;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Landroid/view/View;", "createView", "Lcom/yandex/div/core/view2/DivViewCreator;", "Lcom/yandex/div/core/view2/DivBinder;", "Lcom/yandex/div/core/expression/local/DivRuntimeVisitor;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class Div2Builder {

    @NotNull
    private final DivRuntimeVisitor runtimeVisitor;

    @NotNull
    private final DivBinder viewBinder;

    @NotNull
    private final DivViewCreator viewCreator;

    public Div2Builder(@NotNull DivViewCreator divViewCreator, @NotNull DivBinder divBinder, @NotNull DivRuntimeVisitor divRuntimeVisitor) {
        this.viewCreator = divViewCreator;
        this.viewBinder = divBinder;
        this.runtimeVisitor = divRuntimeVisitor;
    }

    @NotNull
    public View buildView(@NotNull y0 data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        View viewCreateView = createView(data, context, path);
        this.viewBinder.bind(context, viewCreateView, data, path);
        return viewCreateView;
    }

    @NotNull
    public View createView(@NotNull y0 data, @NotNull BindingContext context, @NotNull DivStatePath path) {
        ExpressionResolver expressionResolver = context.getExpressionResolver();
        this.runtimeVisitor.createAndAttachRuntimes(data, path, context.getDivView());
        View viewCreate = this.viewCreator.create(data, expressionResolver);
        viewCreate.setLayoutParams(new DivLayoutParams(-1, -2));
        return viewCreate;
    }
}
