package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.platform.i2;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004BI\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011B=\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0012\u001a\u00028\u0000\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0013J\b\u0010,\u001a\u00020\u0017H\u0002J\b\u0010-\u001a\u00020\u0017H\u0002R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R<\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR<\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0016\u001a\u0004\u0018\u00010 @BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\"\u0010#R\u0013\u0010\u0012\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R<\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010\u001cR\u0014\u0010*\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010%¨\u0006."}, d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "T", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/platform/ViewRootForInspector;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "factory", "Lkotlin/Function1;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "saveStateRegistry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "saveStateKey", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroidx/compose/runtime/saveable/SaveableStateRegistry;Ljava/lang/String;)V", "typedView", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;Landroid/view/View;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroidx/compose/runtime/saveable/SaveableStateRegistry;Ljava/lang/String;)V", "getDispatcher", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "value", "", "releaseBlock", "getReleaseBlock", "()Lkotlin/jvm/functions/Function1;", "setReleaseBlock", "(Lkotlin/jvm/functions/Function1;)V", "resetBlock", "getResetBlock", "setResetBlock", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "saveableRegistryEntry", "setSaveableRegistryEntry", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;)V", "getTypedView", "()Landroid/view/View;", "Landroid/view/View;", "updateBlock", "getUpdateBlock", "setUpdateBlock", "viewRoot", "getViewRoot", "registerSaveStateProvider", "unregisterSaveStateProvider", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements ViewRootForInspector {

    @NotNull
    private final NestedScrollDispatcher dispatcher;

    @NotNull
    private Function1<? super T, Unit> releaseBlock;

    @NotNull
    private Function1<? super T, Unit> resetBlock;

    @NotNull
    private final String saveStateKey;

    @Nullable
    private final SaveableStateRegistry saveStateRegistry;

    @Nullable
    private SaveableStateRegistry.Entry saveableRegistryEntry;

    @NotNull
    private final T typedView;

    @NotNull
    private Function1<? super T, Unit> updateBlock;

    /* synthetic */ ViewFactoryHolder(Context context, CompositionContext compositionContext, View view, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : compositionContext, view, nestedScrollDispatcher, saveableStateRegistry, str);
    }

    private final void registerSaveStateProvider() {
        SaveableStateRegistry saveableStateRegistry = this.saveStateRegistry;
        if (saveableStateRegistry != null) {
            setSaveableRegistryEntry(saveableStateRegistry.registerProvider(this.saveStateKey, new Function0<Object>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder.registerSaveStateProvider.1
                final /* synthetic */ ViewFactoryHolder<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final Object invoke() {
                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                    this.this$0.getTypedView().saveHierarchyState(sparseArray);
                    return sparseArray;
                }
            }));
        }
    }

    private final void setSaveableRegistryEntry(SaveableStateRegistry.Entry entry) {
        SaveableStateRegistry.Entry entry2 = this.saveableRegistryEntry;
        if (entry2 != null) {
            entry2.unregister();
        }
        this.saveableRegistryEntry = entry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterSaveStateProvider() {
        setSaveableRegistryEntry(null);
    }

    @NotNull
    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    @NotNull
    public final Function1<T, Unit> getReleaseBlock() {
        return this.releaseBlock;
    }

    @NotNull
    public final Function1<T, Unit> getResetBlock() {
        return this.resetBlock;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public /* synthetic */ AbstractComposeView getSubCompositionView() {
        return i2.a(this);
    }

    @NotNull
    public final T getTypedView() {
        return this.typedView;
    }

    @NotNull
    public final Function1<T, Unit> getUpdateBlock() {
        return this.updateBlock;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    @NotNull
    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(@NotNull Function1<? super T, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.releaseBlock = value;
        setRelease(new Function0<Unit>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$releaseBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.getReleaseBlock().invoke(this.this$0.getTypedView());
                this.this$0.unregisterSaveStateProvider();
            }
        });
    }

    public final void setResetBlock(@NotNull Function1<? super T, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.resetBlock = value;
        setReset(new Function0<Unit>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$resetBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.getResetBlock().invoke(this.this$0.getTypedView());
            }
        });
    }

    public final void setUpdateBlock(@NotNull Function1<? super T, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.updateBlock = value;
        setUpdate(new Function0<Unit>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.getUpdateBlock().invoke(this.this$0.getTypedView());
            }
        });
    }

    private ViewFactoryHolder(Context context, CompositionContext compositionContext, T t10, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, String str) {
        super(context, compositionContext, nestedScrollDispatcher);
        this.typedView = t10;
        this.dispatcher = nestedScrollDispatcher;
        this.saveStateRegistry = saveableStateRegistry;
        this.saveStateKey = str;
        setClipChildren(false);
        setView$ui_release(t10);
        Object objConsumeRestored = saveableStateRegistry != null ? saveableStateRegistry.consumeRestored(str) : null;
        SparseArray<Parcelable> sparseArray = objConsumeRestored instanceof SparseArray ? (SparseArray) objConsumeRestored : null;
        if (sparseArray != null) {
            t10.restoreHierarchyState(sparseArray);
        }
        registerSaveStateProvider();
        this.updateBlock = AndroidView_androidKt.getNoOpUpdate();
        this.resetBlock = AndroidView_androidKt.getNoOpUpdate();
        this.releaseBlock = AndroidView_androidKt.getNoOpUpdate();
    }

    public /* synthetic */ ViewFactoryHolder(Context context, Function1 function1, CompositionContext compositionContext, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, function1, (i10 & 4) != 0 ? null : compositionContext, nestedScrollDispatcher, saveableStateRegistry, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder(@NotNull Context context, @NotNull Function1<? super Context, ? extends T> factory, @Nullable CompositionContext compositionContext, @NotNull NestedScrollDispatcher dispatcher, @Nullable SaveableStateRegistry saveableStateRegistry, @NotNull String saveStateKey) {
        this(context, compositionContext, factory.invoke(context), dispatcher, saveableStateRegistry, saveStateKey);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(saveStateKey, "saveStateKey");
    }
}
