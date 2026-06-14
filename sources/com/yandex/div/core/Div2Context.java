package com.yandex.div.core;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.MainThread;
import androidx.annotation.StyleRes;
import androidx.core.view.LayoutInflaterCompat;
import androidx.lifecycle.LifecycleOwner;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.yandex.div.R$style;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.expression.variables.GlobalVariableController;
import com.yandex.div.core.view2.Div2View;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 (2\u00020\u0001:\u0002()B%\b\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB/\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0003\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0012¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR!\u0010%\u001a\u00020\u001e8VX\u0097\u0084\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u000f8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/yandex/div/core/Div2Context;", "Landroid/content/ContextWrapper;", "Landroid/view/ContextThemeWrapper;", "baseContext", "Lcom/yandex/div/core/dagger/Div2Component;", "div2Component", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "<init>", "(Landroid/view/ContextThemeWrapper;Lcom/yandex/div/core/dagger/Div2Component;Landroidx/lifecycle/LifecycleOwner;)V", "Lcom/yandex/div/core/DivConfiguration;", "configuration", "", "themeId", "(Landroid/view/ContextThemeWrapper;Lcom/yandex/div/core/DivConfiguration;ILandroidx/lifecycle/LifecycleOwner;)V", "Landroid/view/LayoutInflater;", "getLayoutInflater", "()Landroid/view/LayoutInflater;", "", "name", "", "getSystemService", "(Ljava/lang/String;)Ljava/lang/Object;", "Landroid/view/ContextThemeWrapper;", "Lcom/yandex/div/core/dagger/Div2Component;", "getDiv2Component$div_release", "()Lcom/yandex/div/core/dagger/Div2Component;", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner$div_release", "()Landroidx/lifecycle/LifecycleOwner;", "Lcom/yandex/div/core/expression/variables/GlobalVariableController;", "globalVariableController$delegate", "Lkotlin/Lazy;", "getGlobalVariableController", "()Lcom/yandex/div/core/expression/variables/GlobalVariableController;", "getGlobalVariableController$annotations", "()V", "globalVariableController", "inflater", "Landroid/view/LayoutInflater;", y.f66058y, "Div2InflaterFactory", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class Div2Context extends ContextWrapper {

    @NotNull
    private final ContextThemeWrapper baseContext;

    @NotNull
    private final Div2Component div2Component;

    /* JADX INFO: renamed from: globalVariableController$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy globalVariableController;

    @Nullable
    private LayoutInflater inflater;

    @Nullable
    private final LifecycleOwner lifecycleOwner;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J,\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\"\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/core/Div2Context$Div2InflaterFactory;", "Landroid/view/LayoutInflater$Factory2;", "div2Context", "Lcom/yandex/div/core/Div2Context;", "(Lcom/yandex/div/core/Div2Context;)V", "isDiv2View", "", "viewClassName", "", "onCreateView", "Landroid/view/View;", "parent", "name", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Div2InflaterFactory implements LayoutInflater.Factory2 {

        @NotNull
        private final Div2Context div2Context;

        public Div2InflaterFactory(@NotNull Div2Context div2Context) {
            this.div2Context = div2Context;
        }

        private final boolean isDiv2View(String viewClassName) {
            return Intrinsics.areEqual("com.yandex.div.core.view2.Div2View", viewClassName) || Intrinsics.areEqual("Div2View", viewClassName);
        }

        @Override // android.view.LayoutInflater.Factory2
        @Nullable
        public View onCreateView(@Nullable View parent, @NotNull String name, @NotNull Context context, @NotNull AttributeSet attrs) {
            return onCreateView(name, context, attrs);
        }

        @Override // android.view.LayoutInflater.Factory
        @Nullable
        public View onCreateView(@NotNull String name, @NotNull Context context, @NotNull AttributeSet attrs) {
            if (!isDiv2View(name)) {
                return null;
            }
            return new Div2View(this.div2Context, attrs, 0, 4, null);
        }
    }

    @MainThread
    private Div2Context(ContextThemeWrapper contextThemeWrapper, Div2Component div2Component, LifecycleOwner lifecycleOwner) {
        super(contextThemeWrapper);
        this.baseContext = contextThemeWrapper;
        this.div2Component = div2Component;
        this.lifecycleOwner = lifecycleOwner;
        this.globalVariableController = i.a(new Function0<GlobalVariableController>() { // from class: com.yandex.div.core.Div2Context$globalVariableController$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GlobalVariableController invoke() {
                return new GlobalVariableController(this.this$0.getDiv2Component().getDivVariableController());
            }
        });
        getDiv2Component().getDivCreationTracker().onContextCreationFinished();
    }

    private LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflaterCloneInContext;
        LayoutInflater layoutInflater = this.inflater;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        synchronized (this) {
            layoutInflaterCloneInContext = this.inflater;
            if (layoutInflaterCloneInContext == null) {
                layoutInflaterCloneInContext = LayoutInflater.from(this.baseContext).cloneInContext(this);
                Intrinsics.checkNotNull(layoutInflaterCloneInContext, "null cannot be cast to non-null type android.view.LayoutInflater");
                LayoutInflaterCompat.setFactory2(layoutInflaterCloneInContext, new Div2InflaterFactory(this));
                this.inflater = layoutInflaterCloneInContext;
            }
        }
        return layoutInflaterCloneInContext;
    }

    @NotNull
    /* JADX INFO: renamed from: getDiv2Component$div_release, reason: from getter */
    public Div2Component getDiv2Component() {
        return this.div2Component;
    }

    @Nullable
    /* JADX INFO: renamed from: getLifecycleOwner$div_release, reason: from getter */
    public LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @Nullable
    public Object getSystemService(@NotNull String name) {
        return Intrinsics.areEqual("layout_inflater", name) ? getLayoutInflater() : this.baseContext.getSystemService(name);
    }

    public /* synthetic */ Div2Context(ContextThemeWrapper contextThemeWrapper, DivConfiguration divConfiguration, int i10, LifecycleOwner lifecycleOwner, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(contextThemeWrapper, divConfiguration, (i11 & 4) != 0 ? R$style.Div_Theme : i10, (i11 & 8) != 0 ? null : lifecycleOwner);
    }

    public Div2Context(@NotNull ContextThemeWrapper contextThemeWrapper, @NotNull DivConfiguration divConfiguration, @StyleRes int i10, @Nullable LifecycleOwner lifecycleOwner) {
        this(contextThemeWrapper, DivKit.INSTANCE.getInstance(contextThemeWrapper).getComponent().div2Component().baseContext(contextThemeWrapper).configuration(divConfiguration).themeId(i10).divCreationTracker(new DivCreationTracker(SystemClock.uptimeMillis())).divVariableController(divConfiguration.getDivVariableController()).build(), lifecycleOwner);
    }
}
