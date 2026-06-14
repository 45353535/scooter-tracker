package androidx.compose.ui.window;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.R;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.platform.i2;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.ironsource.C4424m2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zf.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\r\u0010]\u001a\u00020\u0005H\u0017¢\u0006\u0002\u0010^J\u0010\u0010_\u001a\u00020\u00052\u0006\u0010`\u001a\u00020%H\u0002J\b\u0010a\u001a\u000200H\u0002J\u0006\u0010b\u001a\u00020\u0005J\u0010\u0010c\u001a\u00020\u00162\u0006\u0010d\u001a\u00020eH\u0016J5\u0010f\u001a\u00020\u00052\u0006\u0010g\u001a\u00020\u00162\u0006\u0010h\u001a\u00020%2\u0006\u0010i\u001a\u00020%2\u0006\u0010j\u001a\u00020%2\u0006\u0010k\u001a\u00020%H\u0010¢\u0006\u0002\blJ\u001d\u0010m\u001a\u00020\u00052\u0006\u0010n\u001a\u00020%2\u0006\u0010o\u001a\u00020%H\u0010¢\u0006\u0002\bpJ\u0012\u0010q\u001a\u00020\u00162\b\u0010d\u001a\u0004\u0018\u00010rH\u0016J\u0006\u0010s\u001a\u00020\u0005J\u0010\u0010t\u001a\u00020\u00052\u0006\u0010u\u001a\u00020\u0016H\u0002J&\u0010 \u001a\u00020\u00052\u0006\u0010v\u001a\u00020w2\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u001c¢\u0006\u0002\u0010xJ\u0010\u0010y\u001a\u00020\u00052\u0006\u0010z\u001a\u00020\u0016H\u0002J\u0010\u0010{\u001a\u00020\u00052\u0006\u0010|\u001a\u00020%H\u0016J\u0010\u0010}\u001a\u00020\u00052\u0006\u0010~\u001a\u00020\u007fH\u0002J\u0007\u0010\u0080\u0001\u001a\u00020\u0005J\u0011\u0010\u0081\u0001\u001a\u00020\u00052\u0006\u0010|\u001a\u00020?H\u0002J/\u0010\u0082\u0001\u001a\u00020\u00052\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010|\u001a\u00020?J\u000f\u0010\u0083\u0001\u001a\u00020\u0005H\u0001¢\u0006\u0003\b\u0084\u0001J\u000f\u0010\u0085\u0001\u001a\u00020\u00052\u0006\u00108\u001a\u000207J\u0007\u0010\u0086\u0001\u001a\u00020\u0005R\u001b\u0010\u0015\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000RA\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u001c2\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010$\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010,\u001a\u00020-X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010.R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010/\u001a\u0002008\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R/\u00108\u001a\u0004\u0018\u0001072\b\u0010\u001b\u001a\u0004\u0018\u0001078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010#\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010>\u001a\u00020?X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR8\u0010E\u001a\u0004\u0018\u00010D2\b\u0010\u001b\u001a\u0004\u0018\u00010D8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bJ\u0010#\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010K\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u000e\u0010P\u001a\u00020QX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010R\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0016@RX\u0094\u000e¢\u0006\b\n\u0000\u001a\u0004\bS\u0010\u0018R\u0014\u0010T\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u000e\u0010[\u001a\u00020\\X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0087\u0001"}, d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "onDismissRequest", "Lkotlin/Function0;", "", "properties", "Landroidx/compose/ui/window/PopupProperties;", "testTag", "", "composeView", "Landroid/view/View;", "density", "Landroidx/compose/ui/unit/Density;", "initialPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "popupId", "Ljava/util/UUID;", "popupLayoutHelper", "Landroidx/compose/ui/window/PopupLayoutHelper;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Ljava/lang/String;Landroid/view/View;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/window/PopupPositionProvider;Ljava/util/UUID;Landroidx/compose/ui/window/PopupLayoutHelper;)V", "canCalculatePosition", "", "getCanCalculatePosition", "()Z", "canCalculatePosition$delegate", "Landroidx/compose/runtime/State;", "<set-?>", "Landroidx/compose/runtime/Composable;", "content", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "content$delegate", "Landroidx/compose/runtime/MutableState;", "displayHeight", "", "getDisplayHeight", "()I", "displayWidth", "getDisplayWidth", "locationOnScreen", "", "maxSupportedElevation", "Landroidx/compose/ui/unit/Dp;", "F", "params", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release$annotations", "()V", "getParams$ui_release", "()Landroid/view/WindowManager$LayoutParams;", "parentBounds", "Landroidx/compose/ui/unit/IntRect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setParentLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "parentLayoutCoordinates$delegate", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/unit/IntSize;", "popupContentSize", "getPopupContentSize-bOM6tXw", "()Landroidx/compose/ui/unit/IntSize;", "setPopupContentSize-fhxjrPA", "(Landroidx/compose/ui/unit/IntSize;)V", "popupContentSize$delegate", "positionProvider", "getPositionProvider", "()Landroidx/compose/ui/window/PopupPositionProvider;", "setPositionProvider", "(Landroidx/compose/ui/window/PopupPositionProvider;)V", "previousWindowVisibleFrame", "Landroid/graphics/Rect;", "shouldCreateCompositionOnAttachedToWindow", "getShouldCreateCompositionOnAttachedToWindow", "subCompositionView", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "windowManager", "Landroid/view/WindowManager;", "Content", "(Landroidx/compose/runtime/Composer;I)V", "applyNewFlags", "flags", "createLayoutParams", "dismiss", "dispatchKeyEvent", "event", "Landroid/view/KeyEvent;", "internalOnLayout", "changed", "left", "top", "right", "bottom", "internalOnLayout$ui_release", "internalOnMeasure", "widthMeasureSpec", "heightMeasureSpec", "internalOnMeasure$ui_release", "onTouchEvent", "Landroid/view/MotionEvent;", "pollForLocationOnScreenChange", "setClippingEnabled", "clippingEnabled", "parent", "Landroidx/compose/runtime/CompositionContext;", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "setIsFocusable", "isFocusable", "setLayoutDirection", "layoutDirection", "setSecurePolicy", "securePolicy", "Landroidx/compose/ui/window/SecureFlagPolicy;", C4424m2.f43623v, "superSetLayoutDirection", "updateParameters", "updateParentBounds", "updateParentBounds$ui_release", "updateParentLayoutCoordinates", "updatePosition", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector {

    /* JADX INFO: renamed from: canCalculatePosition$delegate, reason: from kotlin metadata */
    @NotNull
    private final State canCalculatePosition;

    @NotNull
    private final View composeView;

    /* JADX INFO: renamed from: content$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState content;

    @NotNull
    private final int[] locationOnScreen;
    private final float maxSupportedElevation;

    @Nullable
    private Function0<Unit> onDismissRequest;

    @NotNull
    private final WindowManager.LayoutParams params;

    @Nullable
    private IntRect parentBounds;

    /* JADX INFO: renamed from: parentLayoutCoordinates$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState parentLayoutCoordinates;

    @NotNull
    private LayoutDirection parentLayoutDirection;

    /* JADX INFO: renamed from: popupContentSize$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState popupContentSize;

    @NotNull
    private final PopupLayoutHelper popupLayoutHelper;

    @NotNull
    private PopupPositionProvider positionProvider;

    @NotNull
    private final Rect previousWindowVisibleFrame;

    @NotNull
    private PopupProperties properties;
    private boolean shouldCreateCompositionOnAttachedToWindow;

    @NotNull
    private String testTag;

    @NotNull
    private final WindowManager windowManager;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PopupLayout(Function0 function0, PopupProperties popupProperties, String str, View view, Density density, PopupPositionProvider popupPositionProvider, UUID uuid, PopupLayoutHelper popupLayoutHelper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        PopupLayoutHelper popupLayoutHelperImpl29;
        if ((i10 & 128) != 0) {
            popupLayoutHelperImpl29 = Build.VERSION.SDK_INT >= 29 ? new PopupLayoutHelperImpl29() : new PopupLayoutHelperImpl();
        } else {
            popupLayoutHelperImpl29 = popupLayoutHelper;
        }
        this(function0, popupProperties, str, view, density, popupPositionProvider, uuid, popupLayoutHelperImpl29);
    }

    private final void applyNewFlags(int flags) {
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.flags = flags;
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, layoutParams);
    }

    private final WindowManager.LayoutParams createLayoutParams() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = (layoutParams.flags & (-8552473)) | 262144;
        layoutParams.type = 1002;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(R.string.default_popup_window_title));
        return layoutParams;
    }

    private final Function2<Composer, Integer, Unit> getContent() {
        return (Function2) this.content.getValue();
    }

    private final int getDisplayHeight() {
        return a.d(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return a.d(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getParentLayoutCoordinates() {
        return (LayoutCoordinates) this.parentLayoutCoordinates.getValue();
    }

    private final void setClippingEnabled(boolean clippingEnabled) {
        applyNewFlags(clippingEnabled ? this.params.flags & (-513) : this.params.flags | 512);
    }

    private final void setContent(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.content.setValue(function2);
    }

    private final void setIsFocusable(boolean isFocusable) {
        applyNewFlags(!isFocusable ? this.params.flags | 8 : this.params.flags & (-9));
    }

    private final void setParentLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.parentLayoutCoordinates.setValue(layoutCoordinates);
    }

    private final void setSecurePolicy(SecureFlagPolicy securePolicy) {
        applyNewFlags(SecureFlagPolicy_androidKt.shouldApplySecureFlag(securePolicy, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView)) ? this.params.flags | 8192 : this.params.flags & (-8193));
    }

    private final void superSetLayoutDirection(LayoutDirection layoutDirection) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new m();
        }
        super.setLayoutDirection(i11);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    @UiComposable
    public void Content(@Nullable Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-857613600);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-857613600, i10, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:463)");
        }
        getContent().invoke(composerStartRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.PopupLayout.Content.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.f93236a;
            }

            public final void invoke(@Nullable Composer composer2, int i11) {
                PopupLayout.this.Content(composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
            }
        });
    }

    public final void dismiss() {
        ViewTreeLifecycleOwner.set(this, null);
        this.windowManager.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        KeyEvent.DispatcherState keyDispatcherState;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getKeyCode() == 4 && this.properties.getDismissOnBackPress()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                }
                return true;
            }
            if (event.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                Function0<Unit> function0 = this.onDismissRequest;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition.getValue()).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: getParams$ui_release, reason: from getter */
    public final WindowManager.LayoutParams getParams() {
        return this.params;
    }

    @NotNull
    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final IntSize m4194getPopupContentSizebOM6tXw() {
        return (IntSize) this.popupContentSize.getValue();
    }

    @NotNull
    public final PopupPositionProvider getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    @NotNull
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @NotNull
    public final String getTestTag() {
        return this.testTag;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public /* synthetic */ View getViewRoot() {
        return i2.b(this);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean changed, int left, int top, int right, int bottom) {
        super.internalOnLayout$ui_release(changed, left, top, right, bottom);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.params.width = childAt.getMeasuredWidth();
        this.params.height = childAt.getMeasuredHeight();
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.properties.getUsePlatformDefaultWidth()) {
            super.internalOnMeasure$ui_release(widthMeasureSpec, heightMeasureSpec);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        if (!this.properties.getDismissOnClickOutside()) {
            return super.onTouchEvent(event);
        }
        if (event != null && event.getAction() == 0 && (event.getX() < 0.0f || event.getX() >= getWidth() || event.getY() < 0.0f || event.getY() >= getHeight())) {
            Function0<Unit> function0 = this.onDismissRequest;
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        }
        if (event == null || event.getAction() != 4) {
            return super.onTouchEvent(event);
        }
        Function0<Unit> function02 = this.onDismissRequest;
        if (function02 != null) {
            function02.invoke();
        }
        return true;
    }

    public final void pollForLocationOnScreenChange() {
        int[] iArr = this.locationOnScreen;
        int i10 = iArr[0];
        int i11 = iArr[1];
        this.composeView.getLocationOnScreen(iArr);
        int[] iArr2 = this.locationOnScreen;
        if (i10 == iArr2[0] && i11 == iArr2[1]) {
            return;
        }
        updateParentBounds$ui_release();
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }

    public final void setParentLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.parentLayoutDirection = layoutDirection;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m4195setPopupContentSizefhxjrPA(@Nullable IntSize intSize) {
        this.popupContentSize.setValue(intSize);
    }

    public final void setPositionProvider(@NotNull PopupPositionProvider popupPositionProvider) {
        Intrinsics.checkNotNullParameter(popupPositionProvider, "<set-?>");
        this.positionProvider = popupPositionProvider;
    }

    public final void setTestTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.testTag = str;
    }

    public final void show() {
        this.windowManager.addView(this, this.params);
    }

    public final void updateParameters(@Nullable Function0<Unit> onDismissRequest, @NotNull PopupProperties properties, @NotNull String testTag, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.onDismissRequest = onDismissRequest;
        this.properties = properties;
        this.testTag = testTag;
        setIsFocusable(properties.getFocusable());
        setSecurePolicy(properties.getSecurePolicy());
        setClippingEnabled(properties.getClippingEnabled());
        superSetLayoutDirection(layoutDirection);
    }

    @VisibleForTesting(otherwise = 2)
    public final void updateParentBounds$ui_release() {
        LayoutCoordinates parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        long jMo3015getSizeYbymL2g = parentLayoutCoordinates.mo3015getSizeYbymL2g();
        long jPositionInWindow = LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
        IntRect intRectM4101IntRectVbeCjmY = IntRectKt.m4101IntRectVbeCjmY(IntOffsetKt.IntOffset(a.d(Offset.m1371getXimpl(jPositionInWindow)), a.d(Offset.m1372getYimpl(jPositionInWindow))), jMo3015getSizeYbymL2g);
        if (Intrinsics.areEqual(intRectM4101IntRectVbeCjmY, this.parentBounds)) {
            return;
        }
        this.parentBounds = intRectM4101IntRectVbeCjmY;
        updatePosition();
    }

    public final void updateParentLayoutCoordinates(@NotNull LayoutCoordinates parentLayoutCoordinates) {
        Intrinsics.checkNotNullParameter(parentLayoutCoordinates, "parentLayoutCoordinates");
        setParentLayoutCoordinates(parentLayoutCoordinates);
        updateParentBounds$ui_release();
    }

    public final void updatePosition() {
        IntSize intSizeM4194getPopupContentSizebOM6tXw;
        IntRect intRect = this.parentBounds;
        if (intRect == null || (intSizeM4194getPopupContentSizebOM6tXw = m4194getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long packedValue = intSizeM4194getPopupContentSizebOM6tXw.getPackedValue();
        Rect rect = this.previousWindowVisibleFrame;
        this.popupLayoutHelper.getWindowVisibleDisplayFrame(this.composeView, rect);
        IntRect intBounds = AndroidPopup_androidKt.toIntBounds(rect);
        long jIntSize = IntSizeKt.IntSize(intBounds.getWidth(), intBounds.getHeight());
        long jMo807calculatePositionllwVHH4 = this.positionProvider.mo807calculatePositionllwVHH4(intRect, jIntSize, this.parentLayoutDirection, packedValue);
        this.params.x = IntOffset.m4069getXimpl(jMo807calculatePositionllwVHH4);
        this.params.y = IntOffset.m4070getYimpl(jMo807calculatePositionllwVHH4);
        if (this.properties.getExcludeFromSystemGesture()) {
            this.popupLayoutHelper.setGestureExclusionRects(this, IntSize.m4111getWidthimpl(jIntSize), IntSize.m4110getHeightimpl(jIntSize));
        }
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
    }

    public final void setContent(@NotNull CompositionContext parent, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(content, "content");
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PopupLayout(@Nullable Function0<Unit> function0, @NotNull PopupProperties properties, @NotNull String testTag, @NotNull View composeView, @NotNull Density density, @NotNull PopupPositionProvider initialPositionProvider, @NotNull UUID popupId, @NotNull PopupLayoutHelper popupLayoutHelper) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(initialPositionProvider, "initialPositionProvider");
        Intrinsics.checkNotNullParameter(popupId, "popupId");
        Intrinsics.checkNotNullParameter(popupLayoutHelper, "popupLayoutHelper");
        Context context = composeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "composeView.context");
        super(context, null, 0, 6, null);
        this.onDismissRequest = function0;
        this.properties = properties;
        this.testTag = testTag;
        this.composeView = composeView;
        this.popupLayoutHelper = popupLayoutHelper;
        Object systemService = composeView.getContext().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        this.params = createLayoutParams();
        this.positionProvider = initialPositionProvider;
        this.parentLayoutDirection = LayoutDirection.Ltr;
        this.popupContentSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.parentLayoutCoordinates = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.canCalculatePosition = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf((this.this$0.getParentLayoutCoordinates() == null || this.this$0.m4194getPopupContentSizebOM6tXw() == null) ? false : true);
            }
        });
        float fM3951constructorimpl = Dp.m3951constructorimpl(8);
        this.maxSupportedElevation = fM3951constructorimpl;
        this.previousWindowVisibleFrame = new Rect();
        setId(android.R.id.content);
        ViewTreeLifecycleOwner.set(this, ViewTreeLifecycleOwner.get(composeView));
        ViewTreeViewModelStoreOwner.set(this, ViewTreeViewModelStoreOwner.get(composeView));
        ViewTreeSavedStateRegistryOwner.set(this, ViewTreeSavedStateRegistryOwner.get(composeView));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + popupId);
        setClipChildren(false);
        setElevation(density.mo308toPx0680j_4(fM3951constructorimpl));
        setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.ui.window.PopupLayout.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(@NotNull View view, @NotNull Outline result) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(result, "result");
                result.setRect(0, 0, view.getWidth(), view.getHeight());
                result.setAlpha(0.0f);
            }
        });
        this.content = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$AndroidPopup_androidKt.INSTANCE.m4193getLambda1$ui_release(), null, 2, null);
        this.locationOnScreen = new int[2];
    }
}
