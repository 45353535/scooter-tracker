package io.sentry.android.replay.util;

import android.graphics.Rect;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntSize;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {
    public static final Rect a(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        if (layoutCoordinates2 == null) {
            layoutCoordinates2 = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates);
        }
        float fM4111getWidthimpl = IntSize.m4111getWidthimpl(layoutCoordinates2.mo3015getSizeYbymL2g());
        float fM4110getHeightimpl = IntSize.m4110getHeightimpl(layoutCoordinates2.mo3015getSizeYbymL2g());
        androidx.compose.ui.geometry.Rect rectC = androidx.compose.ui.layout.b.c(layoutCoordinates2, layoutCoordinates, false, 2, null);
        float left = rectC.getLeft();
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > fM4111getWidthimpl) {
            left = fM4111getWidthimpl;
        }
        float top = rectC.getTop();
        if (top < 0.0f) {
            top = 0.0f;
        }
        if (top > fM4110getHeightimpl) {
            top = fM4110getHeightimpl;
        }
        float right = rectC.getRight();
        if (right < 0.0f) {
            right = 0.0f;
        }
        if (right <= fM4111getWidthimpl) {
            fM4111getWidthimpl = right;
        }
        float bottom = rectC.getBottom();
        float f10 = bottom >= 0.0f ? bottom : 0.0f;
        if (f10 <= fM4110getHeightimpl) {
            fM4110getHeightimpl = f10;
        }
        if (left == fM4111getWidthimpl || top == fM4110getHeightimpl) {
            return new Rect();
        }
        long jMo3018localToWindowMKHz9U = layoutCoordinates2.mo3018localToWindowMKHz9U(OffsetKt.Offset(left, top));
        long jMo3018localToWindowMKHz9U2 = layoutCoordinates2.mo3018localToWindowMKHz9U(OffsetKt.Offset(fM4111getWidthimpl, top));
        long jMo3018localToWindowMKHz9U3 = layoutCoordinates2.mo3018localToWindowMKHz9U(OffsetKt.Offset(fM4111getWidthimpl, fM4110getHeightimpl));
        long jMo3018localToWindowMKHz9U4 = layoutCoordinates2.mo3018localToWindowMKHz9U(OffsetKt.Offset(left, fM4110getHeightimpl));
        float fM1371getXimpl = Offset.m1371getXimpl(jMo3018localToWindowMKHz9U);
        float fM1371getXimpl2 = Offset.m1371getXimpl(jMo3018localToWindowMKHz9U2);
        float fM1371getXimpl3 = Offset.m1371getXimpl(jMo3018localToWindowMKHz9U4);
        float fM1371getXimpl4 = Offset.m1371getXimpl(jMo3018localToWindowMKHz9U3);
        float fMin = Math.min(fM1371getXimpl, Math.min(fM1371getXimpl2, Math.min(fM1371getXimpl3, fM1371getXimpl4)));
        float fMax = Math.max(fM1371getXimpl, Math.max(fM1371getXimpl2, Math.max(fM1371getXimpl3, fM1371getXimpl4)));
        float fM1372getYimpl = Offset.m1372getYimpl(jMo3018localToWindowMKHz9U);
        float fM1372getYimpl2 = Offset.m1372getYimpl(jMo3018localToWindowMKHz9U2);
        float fM1372getYimpl3 = Offset.m1372getYimpl(jMo3018localToWindowMKHz9U4);
        float fM1372getYimpl4 = Offset.m1372getYimpl(jMo3018localToWindowMKHz9U3);
        return new Rect((int) fMin, (int) Math.min(fM1372getYimpl, Math.min(fM1372getYimpl2, Math.min(fM1372getYimpl3, fM1372getYimpl4))), (int) fMax, (int) Math.max(fM1372getYimpl, Math.max(fM1372getYimpl2, Math.max(fM1372getYimpl3, fM1372getYimpl4))));
    }

    public static final Painter b(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        List<ModifierInfo> modifierInfo = layoutNode.getModifierInfo();
        int size = modifierInfo.size();
        for (int i10 = 0; i10 < size; i10++) {
            Modifier modifier = modifierInfo.get(i10).getModifier();
            String name = modifier.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.g0(name, "Painter", false, 2, null)) {
                try {
                    Field declaredField = modifier.getClass().getDeclaredField("painter");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(modifier);
                    if (obj instanceof Painter) {
                        return (Painter) obj;
                    }
                } catch (Throwable unused) {
                }
                return null;
            }
        }
        return null;
    }

    public static final q c(LayoutNode layoutNode) {
        ColorProducer colorProducer;
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        List<ModifierInfo> modifierInfo = layoutNode.getModifierInfo();
        int size = modifierInfo.size();
        Color colorM1594boximpl = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            Modifier modifier = modifierInfo.get(i10).getModifier();
            String name = modifier.getClass().getName();
            Intrinsics.checkNotNull(name);
            if (StringsKt.g0(name, "Text", false, 2, null)) {
                try {
                    Field declaredField = modifier.getClass().getDeclaredField("color");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(modifier);
                    colorProducer = obj instanceof ColorProducer ? (ColorProducer) obj : null;
                } catch (Throwable unused) {
                }
                colorM1594boximpl = colorProducer != null ? Color.m1594boximpl(colorProducer.invoke-0d7_KjU()) : null;
            } else if (StringsKt.g0(name, "Fill", false, 2, null)) {
                z10 = true;
            }
        }
        return new q(colorM1594boximpl, z10, null);
    }

    public static final boolean d(Painter painter) {
        Intrinsics.checkNotNullParameter(painter, "<this>");
        String name = painter.getClass().getName();
        Intrinsics.checkNotNull(name);
        return (StringsKt.g0(name, "Vector", false, 2, null) || StringsKt.g0(name, "Color", false, 2, null) || StringsKt.g0(name, "Brush", false, 2, null)) ? false : true;
    }
}
