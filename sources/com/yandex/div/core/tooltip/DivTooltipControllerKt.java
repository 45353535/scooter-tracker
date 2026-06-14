package com.yandex.div.core.tooltip;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.activity.OnBackPressedCallback;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewGroupKt;
import com.mbridge.msdk.MBridgeConstans;
import com.yandex.div.R$id;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import k8.dv;
import k8.gv;
import k8.oa;
import k8.zl;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0016\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001b\u001a\u00020\u0018*\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a)\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b#\u0010$*<\b\u0000\u0010'\"\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020&0%2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020&0%¨\u0006("}, d2 = {"", "tooltipId", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lkotlin/Pair;", "Lk8/dv;", "findChildWithTooltip", "(Ljava/lang/String;Landroid/view/View;)Lkotlin/Pair;", "popupView", "anchor", "divTooltip", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Landroid/graphics/Point;", "calcPopupLocation", "(Landroid/view/View;Landroid/view/View;Lk8/dv;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/graphics/Point;", "Landroid/widget/PopupWindow;", "Lcom/yandex/div/core/tooltip/TooltipData;", "data", "Lcom/yandex/div/core/util/AccessibilityStateProvider;", "accessibilityStateProvider", "", "removeBackPressedCallback", "(Landroid/widget/PopupWindow;Lcom/yandex/div/core/tooltip/TooltipData;Lcom/yandex/div/core/util/AccessibilityStateProvider;)V", "", "isModal", "(Lk8/dv;)Z", "shouldDismissByOutsideTouch", "(Lk8/dv;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Lcom/yandex/div/core/view2/Div2View;", "Landroid/graphics/Rect;", "getWindowFrame", "(Lcom/yandex/div/core/view2/Div2View;)Landroid/graphics/Rect;", "", "event", "sendAccessibilityEventUnchecked", "(ILandroid/view/View;Lcom/yandex/div/core/util/AccessibilityStateProvider;)V", "Lkotlin/Function3;", "Lcom/yandex/div/core/util/SafePopupWindow;", "CreatePopupCall", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DivTooltipControllerKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[dv.c.values().length];
            try {
                iArr[dv.c.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dv.c.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[dv.c.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[dv.c.TOP_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[dv.c.RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[dv.c.BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[dv.c.TOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[dv.c.BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[dv.c.CENTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @VisibleForTesting
    @NotNull
    public static final Point calcPopupLocation(@NotNull View view, @NotNull View view2, @NotNull dv dvVar, @NotNull ExpressionResolver expressionResolver) {
        int width;
        int height;
        oa oaVar;
        oa oaVar2;
        int[] iArr = new int[2];
        view2.getLocationInWindow(iArr);
        int px = 0;
        Point point = new Point(iArr[0], iArr[1]);
        dv.c cVar = (dv.c) dvVar.f87092j.evaluate(expressionResolver);
        int i10 = point.x;
        int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
        switch (iArr2[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                width = -view.getWidth();
                break;
            case 4:
            case 5:
            case 6:
                width = view2.getWidth();
                break;
            case 7:
            case 8:
            case 9:
                width = (view2.getWidth() - view.getWidth()) / 2;
                break;
            default:
                throw new m();
        }
        point.x = i10 + width;
        int i11 = point.y;
        switch (iArr2[cVar.ordinal()]) {
            case 1:
            case 5:
            case 9:
                height = (view2.getHeight() - view.getHeight()) / 2;
                break;
            case 2:
            case 4:
            case 7:
                height = -view.getHeight();
                break;
            case 3:
            case 6:
            case 8:
                height = view2.getHeight();
                break;
            default:
                throw new m();
        }
        point.y = i11 + height;
        DisplayMetrics displayMetrics = view2.getResources().getDisplayMetrics();
        int i12 = point.x;
        zl zlVar = dvVar.f87091i;
        point.x = i12 + ((zlVar == null || (oaVar2 = zlVar.f92958a) == null) ? 0 : BaseDivViewExtensionsKt.toPx(oaVar2, displayMetrics, expressionResolver));
        int i13 = point.y;
        zl zlVar2 = dvVar.f87091i;
        if (zlVar2 != null && (oaVar = zlVar2.f92959b) != null) {
            px = BaseDivViewExtensionsKt.toPx(oaVar, displayMetrics, expressionResolver);
        }
        point.y = i13 + px;
        return point;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<dv, View> findChildWithTooltip(String str, View view) {
        Object tag = view.getTag(R$id.div_tooltips_tag);
        List<dv> list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            for (dv dvVar : list) {
                if (Intrinsics.areEqual(dvVar.f87089g, str)) {
                    return TuplesKt.to(dvVar, view);
                }
            }
        }
        if (view instanceof ViewGroup) {
            Iterator it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it.hasNext()) {
                Pair<dv, View> pairFindChildWithTooltip = findChildWithTooltip(str, (View) it.next());
                if (pairFindChildWithTooltip != null) {
                    return pairFindChildWithTooltip;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getWindowFrame(Div2View div2View) {
        Rect rect = new Rect();
        div2View.getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isModal(dv dvVar) {
        return dvVar.f87090h instanceof gv.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeBackPressedCallback(PopupWindow popupWindow, TooltipData tooltipData, AccessibilityStateProvider accessibilityStateProvider) {
        sendAccessibilityEventUnchecked(32, popupWindow.getContentView(), accessibilityStateProvider);
        OnBackPressedCallback onBackPressedCallback = tooltipData.getOnBackPressedCallback();
        if (onBackPressedCallback == null) {
            return;
        }
        onBackPressedCallback.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendAccessibilityEventUnchecked(int i10, View view, AccessibilityStateProvider accessibilityStateProvider) {
        if (view != null && accessibilityStateProvider.isAccessibilityEnabled(view.getContext())) {
            view.sendAccessibilityEventUnchecked(Build.VERSION.SDK_INT >= 30 ? j7.b.a(i10) : AccessibilityEvent.obtain(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldDismissByOutsideTouch(dv dvVar, ExpressionResolver expressionResolver) {
        return ((Boolean) dvVar.f87086d.evaluate(expressionResolver)).booleanValue();
    }
}
