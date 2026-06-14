package com.yandex.div.core.view2.errors;

import android.view.ViewGroup;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.view2.Binding;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.ViewBindingProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0019J\b\u0010\u001d\u001a\u00020\u001bH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/core/view2/errors/ErrorVisualMonitor;", "", "errorCollectors", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "divView", "Lcom/yandex/div/core/view2/Div2View;", "visualErrorsEnabled", "", "showPermanently", "bindingProvider", "Lcom/yandex/div/core/view2/ViewBindingProvider;", "typefaceProvider", "Lcom/yandex/div/core/font/DivTypefaceProvider;", "(Lcom/yandex/div/core/view2/errors/ErrorCollectors;Lcom/yandex/div/core/view2/Div2View;ZZLcom/yandex/div/core/view2/ViewBindingProvider;Lcom/yandex/div/core/font/DivTypefaceProvider;)V", "value", "enabled", "getEnabled$div_release", "()Z", "setEnabled$div_release", "(Z)V", "errorModel", "Lcom/yandex/div/core/view2/errors/ErrorModel;", "errorView", "Lcom/yandex/div/core/view2/errors/ErrorView;", "lastConnectionView", "Landroid/view/ViewGroup;", "connect", "", "root", "connectOrDisconnect", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ErrorVisualMonitor {

    @NotNull
    private final ViewBindingProvider bindingProvider;
    private boolean enabled;

    @NotNull
    private final ErrorModel errorModel;

    @Nullable
    private ErrorView errorView;

    @Nullable
    private ViewGroup lastConnectionView;
    private final boolean showPermanently;

    @NotNull
    private final DivTypefaceProvider typefaceProvider;
    private final boolean visualErrorsEnabled;

    public ErrorVisualMonitor(@NotNull ErrorCollectors errorCollectors, @NotNull Div2View div2View, boolean z10, boolean z11, @NotNull ViewBindingProvider viewBindingProvider, @NotNull DivTypefaceProvider divTypefaceProvider) {
        this.visualErrorsEnabled = z10;
        this.showPermanently = z11;
        this.bindingProvider = viewBindingProvider;
        this.typefaceProvider = divTypefaceProvider;
        this.enabled = z10 || z11;
        this.errorModel = new ErrorModel(errorCollectors, div2View, z10);
        connectOrDisconnect();
    }

    private final void connectOrDisconnect() {
        if (!this.enabled) {
            ErrorView errorView = this.errorView;
            if (errorView != null) {
                errorView.close();
            }
            this.errorView = null;
            return;
        }
        this.bindingProvider.observeAndGet(new Function1<Binding, Unit>() { // from class: com.yandex.div.core.view2.errors.ErrorVisualMonitor.connectOrDisconnect.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Binding binding) {
                invoke2(binding);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Binding binding) {
                ErrorVisualMonitor.this.errorModel.bind(binding);
            }
        });
        ViewGroup viewGroup = this.lastConnectionView;
        if (viewGroup != null) {
            connect(viewGroup);
        }
    }

    public final void connect(@NotNull ViewGroup root) {
        this.lastConnectionView = root;
        if (this.enabled) {
            ErrorView errorView = this.errorView;
            if (errorView != null) {
                errorView.close();
            }
            this.errorView = new ErrorView(root, this.errorModel, this.typefaceProvider, this.showPermanently);
        }
    }

    /* JADX INFO: renamed from: getEnabled$div_release, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled$div_release(boolean z10) {
        this.enabled = z10;
        connectOrDisconnect();
    }
}
