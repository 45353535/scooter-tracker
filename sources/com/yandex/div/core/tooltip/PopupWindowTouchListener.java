package com.yandex.div.core.tooltip;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k8.j1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/core/tooltip/PopupWindowTouchListener;", "Landroid/view/View$OnTouchListener;", "Landroid/widget/PopupWindow;", "popupWindow", "Landroid/view/View;", "tooltipView", "", "isModal", "shouldDismissByOutsideTouch", "", "Lk8/j1;", "tapOutsideActions", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "<init>", "(Landroid/widget/PopupWindow;Landroid/view/View;ZZLjava/util/List;Lcom/yandex/div/core/view2/BindingContext;)V", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/MotionEvent;", "event", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Landroid/widget/PopupWindow;", "Landroid/view/View;", "Z", "Ljava/util/List;", "Lcom/yandex/div/core/view2/BindingContext;", "Landroid/graphics/Rect;", "hitRect", "Landroid/graphics/Rect;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PopupWindowTouchListener implements View.OnTouchListener {

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private final Rect hitRect = new Rect();
    private final boolean isModal;

    @NotNull
    private final PopupWindow popupWindow;
    private final boolean shouldDismissByOutsideTouch;

    @Nullable
    private final List<j1> tapOutsideActions;

    @NotNull
    private final View tooltipView;

    public PopupWindowTouchListener(@NotNull PopupWindow popupWindow, @NotNull View view, boolean z10, boolean z11, @Nullable List<j1> list, @NotNull BindingContext bindingContext) {
        this.popupWindow = popupWindow;
        this.tooltipView = view;
        this.isModal = z10;
        this.shouldDismissByOutsideTouch = z11;
        this.tapOutsideActions = list;
        this.bindingContext = bindingContext;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NotNull View view, @NotNull MotionEvent event) {
        this.tooltipView.getHitRect(this.hitRect);
        if (this.hitRect.contains((int) event.getX(), (int) event.getY())) {
            return false;
        }
        if (event.getAction() == 1) {
            List<j1> list = this.tapOutsideActions;
            if (list != null) {
                ExpressionResolver expressionResolver = this.bindingContext.getExpressionResolver();
                Div2View divView = this.bindingContext.getDivView();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((Boolean) ((j1) obj).f88306b.evaluate(expressionResolver)).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    divView.getDiv2Component().getActionHandler().handleActionWithReason((j1) it.next(), divView, expressionResolver, "click");
                }
            }
            if (this.shouldDismissByOutsideTouch) {
                this.popupWindow.dismiss();
            }
        }
        return this.isModal;
    }
}
