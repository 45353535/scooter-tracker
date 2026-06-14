package com.yandex.div.core.view2.divs.widgets;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.core.content.ContextCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.android.billingclient.api.BillingClient;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.yandex.div.R$attr;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.widget.SuperLineHeightEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k8.l7;
import k8.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0010\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0013J \u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001d\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u0013J*\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b(\u0010'J\u0019\u0010+\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u00020\u000f2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J/\u00105\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\tH\u0014¢\u0006\u0004\b5\u00106J)\u0010<\u001a\u00020\u000f2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\t2\b\u0010;\u001a\u0004\u0018\u00010:H\u0014¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u0019\u0010D\u001a\u00020\u000f2\b\u0010C\u001a\u0004\u0018\u00010BH\u0016¢\u0006\u0004\bD\u0010EJ%\u0010I\u001a\u00020\u000f2\u0014\u0010H\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010G\u0012\u0004\u0012\u00020\u000f0FH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u000fH\u0016¢\u0006\u0004\bK\u0010\u0013J!\u0010O\u001a\u0002072\u0006\u0010L\u001a\u00020\t2\b\u0010N\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bO\u0010PJ\u0019\u0010T\u001a\u0004\u0018\u00010S2\u0006\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\tH\u0016¢\u0006\u0004\bW\u0010XJ\u0019\u0010[\u001a\u00020\u000f2\b\u0010Z\u001a\u0004\u0018\u00010YH\u0016¢\u0006\u0004\b[\u0010\\R\u001c\u0010^\u001a\u0004\u0018\u00010]8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR$\u0010c\u001a\u0004\u0018\u00010b8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR(\u0010j\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010G\u0012\u0004\u0012\u00020\u000f0F0i8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010m\u001a\u0004\u0018\u00010l8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010o\u001a\u0004\u0018\u00010)8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010q\u001a\u0004\u0018\u00010B8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bq\u0010rR*\u0010t\u001a\u0002072\u0006\u0010s\u001a\u0002078\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR*\u0010z\u001a\u0002072\u0006\u0010s\u001a\u0002078\u0010@PX\u0090\u000e¢\u0006\u0012\n\u0004\bz\u0010u\u001a\u0004\b{\u0010w\"\u0004\b|\u0010yR\u001f\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016@\u0016X\u0096\u000f¢\u0006\r\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R#\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000f¢\u0006\u0010\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\u0086\u0001\u001a\u0002078\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010wR\u001f\u0010\u0089\u0001\u001a\u0002078\u0016@\u0016X\u0096\u000f¢\u0006\u000e\u001a\u0005\b\u0087\u0001\u0010w\"\u0005\b\u0088\u0001\u0010yR\u001d\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\r0i8\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010\u008f\u0001\u001a\u00020\t8SX\u0092\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001¨\u0006\u0090\u0001"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivInputView;", "Lcom/yandex/div/internal/widget/SuperLineHeightEditText;", "Lcom/yandex/div/core/view2/divs/widgets/DivHolderView;", "Lk8/y0$j;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/yandex/div/core/Disposable;", "subscription", "", "addSubscription", "(Lcom/yandex/div/core/Disposable;)V", "closeAllSubscription", "()V", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "invalidateBorder", "width", "height", "onBoundsChanged", "(II)V", "release", "releaseBorderDrawer", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "Lk8/l7;", OutlinedTextFieldKt.BorderId, "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "setBorder", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/l7;Landroid/view/View;)V", "transitionFinished", "(Landroid/view/View;)V", "transitionStarted", "", "hint", "setInputHint", "(Ljava/lang/String;)V", "", "contentDescription", "setContentDescription", "(Ljava/lang/CharSequence;)V", POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "", "focused", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/widget/TextView$OnEditorActionListener;", CmcdData.Factory.STREAM_TYPE_LIVE, "setOnEditorActionListener", "(Landroid/widget/TextView$OnEditorActionListener;)V", "Lkotlin/Function1;", "Landroid/text/Editable;", "action", "addAfterTextChangeAction", "(Lkotlin/jvm/functions/Function1;)V", "removeAfterTextChangeListener", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "type", "setInputType", "(I)V", "Landroid/text/method/KeyListener;", "keyListener", "setKeyListener", "(Landroid/text/method/KeyListener;)V", "Landroid/graphics/drawable/Drawable;", "nativeBackground", "Landroid/graphics/drawable/Drawable;", "getNativeBackground$div_release", "()Landroid/graphics/drawable/Drawable;", "Lcom/yandex/div/core/view2/reuse/InputFocusTracker;", "focusTracker", "Lcom/yandex/div/core/view2/reuse/InputFocusTracker;", "getFocusTracker$div_release", "()Lcom/yandex/div/core/view2/reuse/InputFocusTracker;", "setFocusTracker$div_release", "(Lcom/yandex/div/core/view2/reuse/InputFocusTracker;)V", "", "onTextChangedActions", "Ljava/util/List;", "Landroid/text/TextWatcher;", "textChangeWatcher", "Landroid/text/TextWatcher;", "_hint", "Ljava/lang/String;", "editorActionListener", "Landroid/widget/TextView$OnEditorActionListener;", "value", "enabled", "Z", "getEnabled", "()Z", "setEnabled$div_release", "(Z)V", "accessibilityEnabled", "getAccessibilityEnabled$div_release", "setAccessibilityEnabled$div_release", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext", "(Lcom/yandex/div/core/view2/BindingContext;)V", "getDiv", "()Lk8/y0$j;", "setDiv", "(Lk8/y0$j;)V", "div", "isTransient", "getNeedClipping", "setNeedClipping", "needClipping", "getSubscriptions", "()Ljava/util/List;", BillingClient.FeatureType.SUBSCRIPTIONS, "getNativeBackgroundResId", "()I", "nativeBackgroundResId", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivInputView extends SuperLineHeightEditText implements DivHolderView<y0.j> {
    private final /* synthetic */ DivHolderViewMixin<y0.j> $$delegate_0;

    @Nullable
    private String _hint;
    private boolean accessibilityEnabled;

    @Nullable
    private TextView.OnEditorActionListener editorActionListener;
    private boolean enabled;

    @Nullable
    private InputFocusTracker focusTracker;

    @Nullable
    private final Drawable nativeBackground;

    @NotNull
    private final List<Function1<Editable, Unit>> onTextChangedActions;

    @Nullable
    private TextWatcher textChangeWatcher;

    public /* synthetic */ DivInputView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R$attr.divInputStyle : i10);
    }

    @DrawableRes
    private int getNativeBackgroundResId() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.editTextBackground, typedValue, true);
        return typedValue.resourceId;
    }

    public void addAfterTextChangeAction(@NotNull Function1<? super Editable, Unit> action) {
        if (this.textChangeWatcher == null) {
            TextWatcher textWatcher = new TextWatcher() { // from class: com.yandex.div.core.view2.divs.widgets.DivInputView$addAfterTextChangeAction$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(@Nullable Editable s10) {
                    Iterator it = this.this$0.onTextChangedActions.iterator();
                    while (it.hasNext()) {
                        ((Function1) it.next()).invoke(s10);
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
                }
            };
            addTextChangedListener(textWatcher);
            this.textChangeWatcher = textWatcher;
        }
        this.onTextChangedActions.add(action);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(@Nullable Disposable subscription) {
        this.$$delegate_0.addSubscription(subscription);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        int iSave;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        DivBorderDrawer divBorderDrawer = getBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        if (scrollX == 0 && scrollY == 0) {
            iSave = canvas.save();
            try {
                divBorderDrawer.clipCorners(canvas);
                super.draw(canvas);
                divBorderDrawer.drawBorder(canvas);
                return;
            } finally {
            }
        }
        float f10 = scrollX;
        float f11 = scrollY;
        iSave = canvas.save();
        try {
            canvas.translate(f10, f11);
            divBorderDrawer.clipCorners(canvas);
            canvas.translate(-f10, -f11);
            super.draw(canvas);
            canvas.translate(f10, f11);
            divBorderDrawer.drawBorder(canvas);
        } finally {
        }
    }

    /* JADX INFO: renamed from: getAccessibilityEnabled$div_release, reason: from getter */
    public boolean getAccessibilityEnabled() {
        return this.accessibilityEnabled;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public y0.j getDiv() {
        return (y0.j) this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    /* JADX INFO: renamed from: getDivBorderDrawer */
    public DivBorderDrawer getBorderDrawer() {
        return this.$$delegate_0.getBorderDrawer();
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    /* JADX INFO: renamed from: getFocusTracker$div_release, reason: from getter */
    public InputFocusTracker getFocusTracker() {
        return this.focusTracker;
    }

    @Nullable
    /* JADX INFO: renamed from: getNativeBackground$div_release, reason: from getter */
    public Drawable getNativeBackground() {
        return this.nativeBackground;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.$$delegate_0.getSubscriptions();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    public void onBoundsChanged(int width, int height) {
        this.$$delegate_0.onBoundsChanged(width, height);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NotNull EditorInfo outAttrs) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        return (getInputType() & 131072) == 0 ? inputConnectionOnCreateInputConnection : new InputConnectionWrapper(inputConnectionOnCreateInputConnection) { // from class: com.yandex.div.core.view2.divs.widgets.DivInputView.onCreateInputConnection.1
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean commitText(@Nullable CharSequence text, int newCursorPosition) {
                if (Intrinsics.areEqual(text, IOUtils.LINE_SEPARATOR_UNIX)) {
                    int imeOptions = this.getImeOptions() & 255;
                    TextView.OnEditorActionListener onEditorActionListener = this.editorActionListener;
                    if (onEditorActionListener != null) {
                        return onEditorActionListener.onEditorAction(this, imeOptions, null);
                    }
                }
                return super.commitText(text, newCursorPosition);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean sendKeyEvent(@NotNull KeyEvent event) {
                if ((event.getKeyCode() == 66 || event.getKeyCode() == 160) && event.getAction() == 0) {
                    int imeOptions = this.getImeOptions() & 255;
                    TextView.OnEditorActionListener onEditorActionListener = this.editorActionListener;
                    if (onEditorActionListener != null) {
                        return onEditorActionListener.onEditorAction(this, imeOptions, event);
                    }
                }
                return super.sendKeyEvent(event);
            }
        };
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean focused, int direction, @Nullable Rect previouslyFocusedRect) {
        InputFocusTracker focusTracker = getFocusTracker();
        if (focusTracker != null) {
            focusTracker.inputFocusChanged(getTag(), this, focused);
        }
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @Nullable KeyEvent event) {
        if ((getInputType() & 131072) != 0 && (keyCode == 66 || keyCode == 160)) {
            int imeOptions = getImeOptions() & 255;
            TextView.OnEditorActionListener onEditorActionListener = this.editorActionListener;
            if (onEditorActionListener != null) {
                return onEditorActionListener.onEditorAction(this, imeOptions, event);
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // com.yandex.div.internal.widget.SuperLineHeightEditText, android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        onBoundsChanged(w10, h10);
    }

    @Override // com.yandex.div.core.view2.Releasable
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    public void removeAfterTextChangeListener() {
        removeTextChangedListener(this.textChangeWatcher);
        this.onTextChangedActions.clear();
        this.textChangeWatcher = null;
    }

    public void setAccessibilityEnabled$div_release(boolean z10) {
        this.accessibilityEnabled = z10;
        setInputHint(this._hint);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(@Nullable BindingContext bindingContext) {
        this.$$delegate_0.setBindingContext(bindingContext);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(@NotNull BindingContext bindingContext, @Nullable l7 border, @NotNull View view) {
        this.$$delegate_0.setBorder(bindingContext, border, view);
    }

    @Override // android.view.View
    public void setContentDescription(@Nullable CharSequence contentDescription) {
        super.setContentDescription(contentDescription);
        setInputHint(this._hint);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(@Nullable y0.j jVar) {
        this.$$delegate_0.setDiv(jVar);
    }

    public void setEnabled$div_release(boolean z10) {
        this.enabled = z10;
        setFocusable(z10);
        setFocusableInTouchMode(z10);
    }

    public void setFocusTracker$div_release(@Nullable InputFocusTracker inputFocusTracker) {
        this.focusTracker = inputFocusTracker;
    }

    public void setInputHint(@Nullable String hint) {
        CharSequence contentDescription;
        this._hint = hint;
        CharSequence contentDescription2 = hint;
        if (getAccessibilityEnabled()) {
            if ((hint == null || hint.length() == 0) && ((contentDescription = getContentDescription()) == null || contentDescription.length() == 0)) {
                contentDescription2 = null;
            } else if (hint == null || hint.length() == 0) {
                contentDescription2 = getContentDescription();
            } else {
                CharSequence contentDescription3 = getContentDescription();
                contentDescription2 = hint;
                if (contentDescription3 != null) {
                    contentDescription2 = hint;
                    if (contentDescription3.length() != 0) {
                        contentDescription2 = StringsKt.y1(hint, '.') + ". " + ((Object) getContentDescription());
                    }
                }
            }
        }
        setHint(contentDescription2);
    }

    @Override // android.widget.TextView
    public void setInputType(int type) {
        if (getInputType() == type) {
            return;
        }
        super.setInputType(type);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        if (Intrinsics.areEqual(getKeyListener(), keyListener)) {
            return;
        }
        super.setKeyListener(keyListener);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z10) {
        this.$$delegate_0.setNeedClipping(z10);
    }

    @Override // android.widget.TextView
    public void setOnEditorActionListener(@Nullable TextView.OnEditorActionListener l10) {
        super.setOnEditorActionListener(l10);
        this.editorActionListener = l10;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    public DivInputView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.$$delegate_0 = new DivHolderViewMixin<>();
        this.nativeBackground = ContextCompat.getDrawable(context, getNativeBackgroundResId());
        this.onTextChangedActions = new ArrayList();
        this.enabled = true;
    }
}
