package com.yandex.div.core.tooltip;

import androidx.activity.OnBackPressedCallback;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.util.SafePopupWindow;
import com.yandex.div.core.view2.BindingContext;
import k8.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0002\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/yandex/div/core/tooltip/TooltipData;", "", "", "id", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Lk8/y0;", "div", "Lcom/yandex/div/core/util/SafePopupWindow;", "popupWindow", "Lcom/yandex/div/core/DivPreloader$Ticket;", "ticket", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "", "dismissed", "<init>", "(Ljava/lang/String;Lcom/yandex/div/core/view2/BindingContext;Lk8/y0;Lcom/yandex/div/core/util/SafePopupWindow;Lcom/yandex/div/core/DivPreloader$Ticket;Landroidx/activity/OnBackPressedCallback;Z)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/yandex/div/core/view2/BindingContext;", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "Lk8/y0;", "getDiv", "()Lk8/y0;", "Lcom/yandex/div/core/util/SafePopupWindow;", "getPopupWindow", "()Lcom/yandex/div/core/util/SafePopupWindow;", "Lcom/yandex/div/core/DivPreloader$Ticket;", "getTicket", "()Lcom/yandex/div/core/DivPreloader$Ticket;", "setTicket", "(Lcom/yandex/div/core/DivPreloader$Ticket;)V", "Landroidx/activity/OnBackPressedCallback;", "getOnBackPressedCallback", "()Landroidx/activity/OnBackPressedCallback;", "Z", "getDismissed", "()Z", "setDismissed", "(Z)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TooltipData {

    @NotNull
    private final BindingContext bindingContext;
    private boolean dismissed;

    @NotNull
    private final y0 div;

    @NotNull
    private final String id;

    @Nullable
    private final OnBackPressedCallback onBackPressedCallback;

    @NotNull
    private final SafePopupWindow popupWindow;

    @Nullable
    private DivPreloader.Ticket ticket;

    public TooltipData(@NotNull String str, @NotNull BindingContext bindingContext, @NotNull y0 y0Var, @NotNull SafePopupWindow safePopupWindow, @Nullable DivPreloader.Ticket ticket, @Nullable OnBackPressedCallback onBackPressedCallback, boolean z10) {
        this.id = str;
        this.bindingContext = bindingContext;
        this.div = y0Var;
        this.popupWindow = safePopupWindow;
        this.ticket = ticket;
        this.onBackPressedCallback = onBackPressedCallback;
        this.dismissed = z10;
    }

    @NotNull
    public final BindingContext getBindingContext() {
        return this.bindingContext;
    }

    public final boolean getDismissed() {
        return this.dismissed;
    }

    @NotNull
    public final y0 getDiv() {
        return this.div;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final OnBackPressedCallback getOnBackPressedCallback() {
        return this.onBackPressedCallback;
    }

    @NotNull
    public final SafePopupWindow getPopupWindow() {
        return this.popupWindow;
    }

    @Nullable
    public final DivPreloader.Ticket getTicket() {
        return this.ticket;
    }

    public final void setDismissed(boolean z10) {
        this.dismissed = z10;
    }

    public final void setTicket(@Nullable DivPreloader.Ticket ticket) {
        this.ticket = ticket;
    }

    public /* synthetic */ TooltipData(String str, BindingContext bindingContext, y0 y0Var, SafePopupWindow safePopupWindow, DivPreloader.Ticket ticket, OnBackPressedCallback onBackPressedCallback, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bindingContext, y0Var, safePopupWindow, (i10 & 16) != 0 ? null : ticket, onBackPressedCallback, (i10 & 64) != 0 ? false : z10);
    }
}
