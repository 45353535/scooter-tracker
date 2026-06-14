package com.yandex.div.core.view2.backbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.view2.backbutton.BackKeyPressedHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/yandex/div/core/view2/backbutton/BackHandlingRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyPreIme", "(ILandroid/view/KeyEvent;)Z", "hasWindowFocus", "", "onWindowFocusChanged", "(Z)V", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "Lcom/yandex/div/core/view2/backbutton/BackKeyPressedHelper$OnBackClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnBackClickListener", "(Lcom/yandex/div/core/view2/backbutton/BackKeyPressedHelper$OnBackClickListener;)V", "Lcom/yandex/div/core/view2/backbutton/BackKeyPressedHelper;", "backKeyPressedHelper", "Lcom/yandex/div/core/view2/backbutton/BackKeyPressedHelper;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BackHandlingRecyclerView extends RecyclerView {

    @NotNull
    private final BackKeyPressedHelper backKeyPressedHelper;

    public BackHandlingRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.backKeyPressedHelper = new BackKeyPressedHelper(this);
    }

    @Override // android.view.View
    @CallSuper
    public boolean onKeyPreIme(int keyCode, @NotNull KeyEvent event) {
        return this.backKeyPressedHelper.onKeyAction(keyCode, event) || super.onKeyPreIme(keyCode, event);
    }

    @Override // android.view.View
    @CallSuper
    protected void onVisibilityChanged(@NotNull View changedView, int visibility) {
        this.backKeyPressedHelper.onVisibilityChanged();
    }

    @Override // android.view.View
    @CallSuper
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        this.backKeyPressedHelper.onWindowFocusChanged(hasWindowFocus);
    }

    public void setOnBackClickListener(@Nullable BackKeyPressedHelper.OnBackClickListener listener) {
        setDescendantFocusability(listener != null ? 131072 : 262144);
        this.backKeyPressedHelper.setOnBackClickListener(listener);
    }
}
