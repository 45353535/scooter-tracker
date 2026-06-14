package com.yandex.div.core.view2.divs;

import android.view.View;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.R$dimen;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.expressions.Expression;
import java.util.List;
import k8.j1;
import k8.l7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0011\u0018\u00002\u00020\u0001:\u0001\u001fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0012¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e*\u0004\u0018\u00010\tH\u0012¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00072\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001e¨\u0006 "}, d2 = {"Lcom/yandex/div/core/view2/divs/DivFocusBinder;", "", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "actionBinder", "<init>", "(Lcom/yandex/div/core/view2/divs/DivActionBinder;)V", "Landroid/view/View;", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Lk8/l7;", OutlinedTextFieldKt.BorderId, "", "applyBorder", "(Landroid/view/View;Lcom/yandex/div/core/view2/BindingContext;Lk8/l7;)V", "", "isConstantlyEmpty", "(Lk8/l7;)Z", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, POBCoreNativeConstants.NATIVE_CONTEXT, "focusedBorder", "defaultBorder", "bindDivBorder", "(Landroid/view/View;Lcom/yandex/div/core/view2/BindingContext;Lk8/l7;Lk8/l7;)V", TypedValues.AttributesType.S_TARGET, "", "Lk8/j1;", "onFocusActions", "onBlurActions", "bindDivFocusActions", "(Landroid/view/View;Lcom/yandex/div/core/view2/BindingContext;Ljava/util/List;Ljava/util/List;)V", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "FocusChangeListener", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivFocusBinder {

    @NotNull
    private final DivActionBinder actionBinder;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001a\u001a\u00020\n2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R(\u0010#\u001a\u0004\u0018\u00010\b2\b\u0010\"\u001a\u0004\u0018\u00010\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R(\u0010'\u001a\u0004\u0018\u00010\b2\b\u0010\"\u001a\u0004\u0018\u00010\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R4\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R4\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,¨\u0006/"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivFocusBinder$FocusChangeListener;", "Landroid/view/View$OnFocusChangeListener;", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "<init>", "(Lcom/yandex/div/core/view2/divs/DivFocusBinder;Lcom/yandex/div/core/view2/BindingContext;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lk8/l7;", OutlinedTextFieldKt.BorderId, "", "applyBorder", "(Landroid/view/View;Lk8/l7;)V", "", "Lk8/j1;", TypedValues.AttributesType.S_TARGET, "", "actionLogType", "handle", "(Ljava/util/List;Landroid/view/View;Ljava/lang/String;)V", "focused", "blurred", "setBorders", "(Lk8/l7;Lk8/l7;)V", "onFocus", "onBlur", "setActions", "(Ljava/util/List;Ljava/util/List;)V", "v", "", "hasFocus", "onFocusChange", "(Landroid/view/View;Z)V", "Lcom/yandex/div/core/view2/BindingContext;", "<set-?>", "focusedBorder", "Lk8/l7;", "getFocusedBorder", "()Lk8/l7;", "blurredBorder", "getBlurredBorder", "focusActions", "Ljava/util/List;", "getFocusActions", "()Ljava/util/List;", "blurActions", "getBlurActions", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class FocusChangeListener implements View.OnFocusChangeListener {

        @Nullable
        private List<j1> blurActions;

        @Nullable
        private l7 blurredBorder;

        @NotNull
        private final BindingContext context;

        @Nullable
        private List<j1> focusActions;

        @Nullable
        private l7 focusedBorder;

        public FocusChangeListener(@NotNull BindingContext bindingContext) {
            this.context = bindingContext;
        }

        private final void applyBorder(View view, l7 border) {
            DivFocusBinder.this.applyBorder(view, this.context, border);
        }

        private final void handle(List<j1> list, View view, String str) {
            DivFocusBinder.this.actionBinder.handleBulkActions$div_release(this.context, view, list, str);
        }

        @Nullable
        public final List<j1> getBlurActions() {
            return this.blurActions;
        }

        @Nullable
        public final l7 getBlurredBorder() {
            return this.blurredBorder;
        }

        @Nullable
        public final List<j1> getFocusActions() {
            return this.focusActions;
        }

        @Nullable
        public final l7 getFocusedBorder() {
            return this.focusedBorder;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(@NotNull View v10, boolean hasFocus) {
            if (hasFocus) {
                applyBorder(v10, this.focusedBorder);
                List<j1> list = this.focusActions;
                if (list != null) {
                    handle(list, v10, "focus");
                    return;
                }
                return;
            }
            if (this.focusedBorder != null) {
                applyBorder(v10, this.blurredBorder);
            }
            List<j1> list2 = this.blurActions;
            if (list2 != null) {
                handle(list2, v10, "blur");
            }
        }

        public final void setActions(@Nullable List<j1> onFocus, @Nullable List<j1> onBlur) {
            this.focusActions = onFocus;
            this.blurActions = onBlur;
        }

        public final void setBorders(@Nullable l7 focused, @Nullable l7 blurred) {
            this.focusedBorder = focused;
            this.blurredBorder = blurred;
        }
    }

    public DivFocusBinder(@NotNull DivActionBinder divActionBinder) {
        this.actionBinder = divActionBinder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void applyBorder(View view, BindingContext bindingContext, l7 l7Var) {
        if (view instanceof DivBorderSupports) {
            ((DivBorderSupports) view).setBorder(bindingContext, l7Var, view);
            return;
        }
        float dimension = 0.0f;
        if (l7Var != null && !isConstantlyEmpty(l7Var) && ((Boolean) l7Var.f88757c.evaluate(bindingContext.getExpressionResolver())).booleanValue() && l7Var.f88758d == null) {
            dimension = view.getResources().getDimension(R$dimen.div_shadow_elevation);
        }
        view.setElevation(dimension);
    }

    private boolean isConstantlyEmpty(l7 l7Var) {
        if (l7Var == null) {
            return true;
        }
        return l7Var.f88755a == null && l7Var.f88756b == null && Intrinsics.areEqual(l7Var.f88757c, Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null)) && l7Var.f88758d == null && l7Var.f88759e == null;
    }

    public void bindDivBorder(@NotNull View view, @NotNull BindingContext context, @Nullable l7 focusedBorder, @Nullable l7 defaultBorder) {
        applyBorder(view, context, (focusedBorder == null || isConstantlyEmpty(focusedBorder) || !view.isFocused()) ? defaultBorder : focusedBorder);
        View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
        FocusChangeListener focusChangeListener = onFocusChangeListener instanceof FocusChangeListener ? (FocusChangeListener) onFocusChangeListener : null;
        if (focusChangeListener == null && isConstantlyEmpty(focusedBorder)) {
            return;
        }
        if (focusChangeListener != null && focusChangeListener.getFocusActions() == null && focusChangeListener.getBlurActions() == null && isConstantlyEmpty(focusedBorder)) {
            view.setOnFocusChangeListener(null);
            return;
        }
        FocusChangeListener focusChangeListener2 = new FocusChangeListener(context);
        focusChangeListener2.setBorders(focusedBorder, defaultBorder);
        if (focusChangeListener != null) {
            focusChangeListener2.setActions(focusChangeListener.getFocusActions(), focusChangeListener.getBlurActions());
        }
        view.setOnFocusChangeListener(focusChangeListener2);
    }

    public void bindDivFocusActions(@NotNull View target, @NotNull BindingContext context, @Nullable List<j1> onFocusActions, @Nullable List<j1> onBlurActions) {
        View.OnFocusChangeListener onFocusChangeListener = target.getOnFocusChangeListener();
        FocusChangeListener focusChangeListener = onFocusChangeListener instanceof FocusChangeListener ? (FocusChangeListener) onFocusChangeListener : null;
        if (focusChangeListener == null && CollectionsKt.allIsNullOrEmpty(onFocusActions, onBlurActions)) {
            return;
        }
        if (focusChangeListener != null && focusChangeListener.getFocusedBorder() == null && CollectionsKt.allIsNullOrEmpty(onFocusActions, onBlurActions)) {
            target.setOnFocusChangeListener(null);
            return;
        }
        FocusChangeListener focusChangeListener2 = new FocusChangeListener(context);
        if (focusChangeListener != null) {
            focusChangeListener2.setBorders(focusChangeListener.getFocusedBorder(), focusChangeListener.getBlurredBorder());
        }
        focusChangeListener2.setActions(onFocusActions, onBlurActions);
        target.setOnFocusChangeListener(focusChangeListener2);
    }
}
