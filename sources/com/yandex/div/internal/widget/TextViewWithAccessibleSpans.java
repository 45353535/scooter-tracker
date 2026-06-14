package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.view2.spannable.ImageSpan;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001-B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0000¢\u0006\u0002\b\u0014J\r\u0010\u0015\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0014J\"\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0012\u0010&\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001c\u0010)\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010(2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0018\u00010\u0010R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/yandex/div/internal/widget/TextViewWithAccessibleSpans;", "Lcom/yandex/div/internal/widget/EllipsizedTextView;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "_contentDescription", "", "accessibleImageSpans", "", "Lcom/yandex/div/core/view2/spannable/ImageSpan;", "imageSpans", "spanHelper", "Lcom/yandex/div/internal/widget/TextViewWithAccessibleSpans$SpanHelper;", "addImageSpan", "", "span", "addImageSpan$div_release", "clearImageSpans", "clearImageSpans$div_release", "dispatchHoverEvent", "", "event", "Landroid/view/MotionEvent;", "dispatchKeyEvent", "Landroid/view/KeyEvent;", "evaluateAndSetContentDescription", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onFocusChanged", "gainFocus", "direction", "previouslyFocusedRect", "Landroid/graphics/Rect;", "setContentDescription", "contentDescription", "", "setText", "text", "type", "Landroid/widget/TextView$BufferType;", "SpanHelper", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class TextViewWithAccessibleSpans extends EllipsizedTextView {

    @Nullable
    private String _contentDescription;

    @NotNull
    private final List<ImageSpan> accessibleImageSpans;

    @NotNull
    private final List<ImageSpan> imageSpans;

    @Nullable
    private final SpanHelper spanHelper;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0014J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0014J\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0014¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/internal/widget/TextViewWithAccessibleSpans$SpanHelper;", "Landroidx/customview/widget/ExploreByTouchHelper;", "(Lcom/yandex/div/internal/widget/TextViewWithAccessibleSpans;)V", "getSpanForId", "Lcom/yandex/div/core/view2/spannable/ImageSpan;", "id", "", "getVirtualViewAt", "x", "", "y", "getVisibleVirtualViews", "", "virtualViewIds", "", "onPerformActionForVirtualView", "", "virtualViewId", "action", "arguments", "Landroid/os/Bundle;", "onPopulateNodeForVirtualView", "node", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class SpanHelper extends ExploreByTouchHelper {
        public SpanHelper() {
            super(TextViewWithAccessibleSpans.this);
        }

        private final ImageSpan getSpanForId(int id2) {
            if (id2 != -1 && TextViewWithAccessibleSpans.this.accessibleImageSpans.size() != 0 && id2 < TextViewWithAccessibleSpans.this.accessibleImageSpans.size() && id2 >= 0) {
                return (ImageSpan) TextViewWithAccessibleSpans.this.accessibleImageSpans.get(id2);
            }
            return null;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected int getVirtualViewAt(float x10, float y10) {
            RectF rectF = new RectF();
            List list = TextViewWithAccessibleSpans.this.accessibleImageSpans;
            TextViewWithAccessibleSpans textViewWithAccessibleSpans = TextViewWithAccessibleSpans.this;
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ((ImageSpan) obj).getBoundsInText(rectF).offset(textViewWithAccessibleSpans.getPaddingLeft(), textViewWithAccessibleSpans.getPaddingTop());
                if (rectF.contains(x10, y10)) {
                    return i10;
                }
                i10 = i11;
            }
            return -1;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void getVisibleVirtualViews(@NotNull List<Integer> virtualViewIds) {
            int i10 = 0;
            for (Object obj : TextViewWithAccessibleSpans.this.accessibleImageSpans) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                virtualViewIds.add(Integer.valueOf(i10));
                i10 = i11;
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected boolean onPerformActionForVirtualView(int virtualViewId, int action, @Nullable Bundle arguments) {
            ImageSpan.Accessibility accessibility;
            ImageSpan.OnAccessibilityClickAction onClickAction;
            ImageSpan spanForId = getSpanForId(virtualViewId);
            if (spanForId == null || (accessibility = spanForId.getAccessibility()) == null || (onClickAction = accessibility.getOnClickAction()) == null || action != 16) {
                return false;
            }
            onClickAction.perform();
            return true;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void onPopulateNodeForVirtualView(int virtualViewId, @NotNull AccessibilityNodeInfoCompat node) {
            String accessibilityType;
            ImageSpan spanForId = getSpanForId(virtualViewId);
            if (spanForId == null) {
                return;
            }
            ImageSpan.Accessibility accessibility = spanForId.getAccessibility();
            if (accessibility == null || (accessibilityType = accessibility.getAccessibilityType()) == null) {
                accessibilityType = "";
            }
            node.setClassName(accessibilityType);
            node.setPackageName(TextViewWithAccessibleSpans.this.getContext().getPackageName());
            Rect boundsInText = spanForId.getBoundsInText(new Rect());
            TextViewWithAccessibleSpans textViewWithAccessibleSpans = TextViewWithAccessibleSpans.this;
            boundsInText.offset(textViewWithAccessibleSpans.getPaddingLeft(), textViewWithAccessibleSpans.getPaddingTop());
            ImageSpan.Accessibility accessibility2 = spanForId.getAccessibility();
            node.setContentDescription(accessibility2 != null ? accessibility2.getContentDescription() : null);
            ImageSpan.Accessibility accessibility3 = spanForId.getAccessibility();
            if ((accessibility3 != null ? accessibility3.getOnClickAction() : null) == null) {
                node.setClickable(false);
            } else {
                node.setClickable(true);
                node.addAction(16);
            }
            node.setBoundsInParent(boundsInText);
        }
    }

    public TextViewWithAccessibleSpans(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.accessibleImageSpans = new ArrayList();
        this.imageSpans = new ArrayList();
        AccessibilityStateProvider.Companion companion = AccessibilityStateProvider.INSTANCE;
        companion.evaluateTouchModeEnabled(context);
        if (!Intrinsics.areEqual(companion.getTouchExplorationEnabled(), Boolean.TRUE)) {
            this.spanHelper = null;
            return;
        }
        SpanHelper spanHelper = new SpanHelper();
        this.spanHelper = spanHelper;
        ViewCompat.setAccessibilityDelegate(this, spanHelper);
        setAccessibilityLiveRegion(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void evaluateAndSetContentDescription() {
        /*
            r5 = this;
            com.yandex.div.core.util.AccessibilityStateProvider$Companion r0 = com.yandex.div.core.util.AccessibilityStateProvider.INSTANCE
            java.lang.Boolean r0 = r0.getTouchExplorationEnabled()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L14
            java.lang.String r0 = r5._contentDescription
            super.setContentDescription(r0)
            return
        L14:
            java.util.List<com.yandex.div.core.view2.spannable.ImageSpan> r0 = r5.imageSpans
            if (r0 == 0) goto Lc0
            java.lang.String r1 = r5._contentDescription
            if (r1 == 0) goto L1e
            goto Lc0
        L1e:
            int r0 = r0.size()
            r1 = 0
            if (r0 != 0) goto L27
            goto Lc2
        L27:
            java.lang.CharSequence r0 = r5.getText()
            int r0 = r0.length()
            if (r0 != 0) goto L33
            goto Lc2
        L33:
            java.lang.CharSequence r0 = r5.getText()
            boolean r2 = r0 instanceof android.text.SpannableString
            if (r2 == 0) goto L3e
            r1 = r0
            android.text.SpannableString r1 = (android.text.SpannableString) r1
        L3e:
            if (r1 == 0) goto Lb7
            java.util.List<com.yandex.div.core.view2.spannable.ImageSpan> r0 = r5.imageSpans
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L53:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r0.next()
            com.yandex.div.core.view2.spannable.ImageSpan r3 = (com.yandex.div.core.view2.spannable.ImageSpan) r3
            int r3 = r1.getSpanStart(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L53
        L6b:
            com.yandex.div.internal.widget.TextViewWithAccessibleSpans$evaluateAndSetContentDescription$lambda$3$$inlined$sortedByDescending$1 r0 = new com.yandex.div.internal.widget.TextViewWithAccessibleSpans$evaluateAndSetContentDescription$lambda$3$$inlined$sortedByDescending$1
            r0.<init>()
            java.util.List r0 = kotlin.collections.CollectionsKt.sortedWith(r2, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L80:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r0.next()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.CharSequence r4 = r5.getText()
            java.lang.CharSequence r2 = r4.subSequence(r2, r3)
            r1.append(r2)
            int r2 = r3 + 1
            goto L80
        L9e:
            java.lang.CharSequence r0 = r5.getText()
            java.lang.CharSequence r3 = r5.getText()
            int r3 = r3.length()
            java.lang.CharSequence r0 = r0.subSequence(r2, r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto Lc2
        Lb7:
            java.lang.CharSequence r0 = r5.getText()
            java.lang.String r1 = r0.toString()
            goto Lc2
        Lc0:
            java.lang.String r1 = r5._contentDescription
        Lc2:
            super.setContentDescription(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.widget.TextViewWithAccessibleSpans.evaluateAndSetContentDescription():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void addImageSpan$div_release(@org.jetbrains.annotations.NotNull com.yandex.div.core.view2.spannable.ImageSpan r3) {
        /*
            r2 = this;
            com.yandex.div.core.util.AccessibilityStateProvider$Companion r0 = com.yandex.div.core.util.AccessibilityStateProvider.INSTANCE
            java.lang.Boolean r0 = r0.getTouchExplorationEnabled()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L42
            java.util.List<com.yandex.div.core.view2.spannable.ImageSpan> r0 = r2.imageSpans
            r0.add(r3)
            com.yandex.div.core.view2.spannable.ImageSpan$Accessibility r0 = r3.getAccessibility()
            r1 = 0
            if (r0 == 0) goto L1f
            java.lang.String r0 = r0.getContentDescription()
            goto L20
        L1f:
            r0 = r1
        L20:
            if (r0 != 0) goto L2e
            com.yandex.div.core.view2.spannable.ImageSpan$Accessibility r0 = r3.getAccessibility()
            if (r0 == 0) goto L2c
            com.yandex.div.core.view2.spannable.ImageSpan$OnAccessibilityClickAction r1 = r0.getOnClickAction()
        L2c:
            if (r1 == 0) goto L33
        L2e:
            java.util.List<com.yandex.div.core.view2.spannable.ImageSpan> r0 = r2.accessibleImageSpans
            r0.add(r3)
        L33:
            com.yandex.div.internal.widget.TextViewWithAccessibleSpans$SpanHelper r3 = r2.spanHelper
            if (r3 == 0) goto L42
            java.util.List<com.yandex.div.core.view2.spannable.ImageSpan> r0 = r2.accessibleImageSpans
            int r0 = r0.size()
            int r0 = r0 + (-1)
            r3.invalidateVirtualView(r0)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.widget.TextViewWithAccessibleSpans.addImageSpan$div_release(com.yandex.div.core.view2.spannable.ImageSpan):void");
    }

    public final void clearImageSpans$div_release() {
        this.accessibleImageSpans.clear();
        this.imageSpans.clear();
        SpanHelper spanHelper = this.spanHelper;
        if (spanHelper != null) {
            spanHelper.invalidateRoot();
        }
        evaluateAndSetContentDescription();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(@NotNull MotionEvent event) {
        SpanHelper spanHelper = this.spanHelper;
        return (spanHelper != null && spanHelper.dispatchHoverEvent(event)) || super.dispatchHoverEvent(event);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        SpanHelper spanHelper = this.spanHelper;
        return (spanHelper != null && spanHelper.dispatchKeyEvent(event)) || super.dispatchKeyEvent(event);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        int i10 = 0;
        for (Object obj : this.accessibleImageSpans) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            SpanHelper spanHelper = this.spanHelper;
            if (spanHelper != null) {
                spanHelper.invalidateVirtualView(i10);
            }
            i10 = i11;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean gainFocus, int direction, @Nullable Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        SpanHelper spanHelper = this.spanHelper;
        if (spanHelper != null) {
            spanHelper.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        }
    }

    @Override // android.view.View
    public void setContentDescription(@Nullable CharSequence contentDescription) {
        this._contentDescription = contentDescription != null ? contentDescription.toString() : null;
        super.setContentDescription(contentDescription);
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, android.widget.TextView
    public void setText(@Nullable CharSequence text, @Nullable TextView.BufferType type) {
        super.setText(text, type);
        evaluateAndSetContentDescription();
    }
}
