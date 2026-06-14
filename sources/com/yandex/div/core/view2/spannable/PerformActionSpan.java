package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.DivActionBinder;
import java.util.List;
import k8.j1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/core/view2/spannable/PerformActionSpan;", "Landroid/text/style/ClickableSpan;", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "", "Lk8/j1;", "actions", "<init>", "(Lcom/yandex/div/core/view2/BindingContext;Ljava/util/List;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "onClick", "(Landroid/view/View;)V", "Landroid/text/TextPaint;", "paint", "updateDrawState", "(Landroid/text/TextPaint;)V", "Lcom/yandex/div/core/view2/BindingContext;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "getActionBinder", "()Lcom/yandex/div/core/view2/divs/DivActionBinder;", "actionBinder", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PerformActionSpan extends ClickableSpan {

    @NotNull
    private final List<j1> actions;

    @NotNull
    private final BindingContext bindingContext;

    public PerformActionSpan(@NotNull BindingContext bindingContext, @NotNull List<j1> list) {
        this.bindingContext = bindingContext;
        this.actions = list;
    }

    private final DivActionBinder getActionBinder() {
        return this.bindingContext.getDivView().getDiv2Component().getActionBinder();
    }

    @NotNull
    public final List<j1> getActions() {
        return this.actions;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NotNull View view) {
        getActionBinder().handleTapClick$div_release(this.bindingContext, view, this.actions);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint paint) {
    }
}
