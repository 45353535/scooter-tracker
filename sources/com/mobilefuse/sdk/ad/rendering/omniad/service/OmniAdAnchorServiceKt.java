package com.mobilefuse.sdk.ad.rendering.omniad.service;

import android.R;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.mobilefuse.sdk.utils.DimConversionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"anchorPosition", "Landroid/graphics/Point;", "Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdAnchorService;", "getAnchorPosition", "(Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdAnchorService;)Landroid/graphics/Point;", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class OmniAdAnchorServiceKt {
    @NotNull
    public static final Point getAnchorPosition(@NotNull OmniAdAnchorService anchorPosition) {
        Intrinsics.checkNotNullParameter(anchorPosition, "$this$anchorPosition");
        Point point = new Point(0, 0);
        Window window = anchorPosition.getPropertyService().getActivity().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "propertyService.activity.window");
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "propertyService.activity.window.decorView");
        View viewFindViewById = decorView.getRootView().findViewById(R.id.content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        Rect rect = new Rect();
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        viewGroup.getGlobalVisibleRect(rect, new Point(iArr[0], iArr[1]));
        int i10 = anchorPosition.getPropertyService().getSizePx().x;
        int i11 = anchorPosition.getPropertyService().getSizePx().y;
        int iDpToPx = DimConversionsKt.dpToPx(anchorPosition.getMarginDp(), (Context) anchorPosition.getPropertyService().getActivity());
        if (anchorPosition.getAnchor() == 0 || anchorPosition.getAnchor() == 2) {
            point.x = rect.left + iDpToPx;
        } else if (anchorPosition.getAnchor() == 1 || anchorPosition.getAnchor() == 3) {
            point.x = ((rect.left + rect.width()) - i10) - iDpToPx;
        }
        if (anchorPosition.getAnchor() == 0 || anchorPosition.getAnchor() == 1) {
            point.y = rect.top + iDpToPx;
            return point;
        }
        if (anchorPosition.getAnchor() != 2 && anchorPosition.getAnchor() != 3) {
            return point;
        }
        point.y = ((rect.top + rect.height()) - i11) - iDpToPx;
        return point;
    }
}
