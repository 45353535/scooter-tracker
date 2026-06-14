package com.moloco.sdk.internal;

import com.moloco.sdk.internal.ortb.model.DECAppIconSerializable;
import com.moloco.sdk.internal.ortb.model.DECAppNameSerializable;
import com.moloco.sdk.internal.ortb.model.DECBorderSerializable;
import com.moloco.sdk.internal.ortb.model.DECCtaSerializable;
import com.moloco.sdk.internal.ortb.model.DECRatingSerializable;
import com.moloco.sdk.internal.ortb.model.GradientColor;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class p {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k0 a(com.moloco.sdk.internal.ortb.model.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        DECAppNameSerializable appName = lVar.getAppName();
        String text = appName != null ? appName.getText() : null;
        String ctaUrl = lVar.getCtaUrl();
        String ctaTrackingUrl = lVar.getCtaTrackingUrl();
        String impressionTrackingUrl = lVar.getImpressionTrackingUrl();
        String skipToDecTrackingUrl = lVar.getSkipToDecTrackingUrl();
        DECAppNameSerializable appName2 = lVar.getAppName();
        Integer fontSize = appName2 != null ? appName2.getFontSize() : null;
        DECCtaSerializable decCta = lVar.getDecCta();
        n0 n0VarD = decCta != null ? d(decCta) : null;
        DECAppIconSerializable decAppIcon = lVar.getDecAppIcon();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l0 l0VarB = decAppIcon != null ? b(decAppIcon) : null;
        DECRatingSerializable decRating = lVar.getDecRating();
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k0(text, ctaUrl, ctaTrackingUrl, impressionTrackingUrl, skipToDecTrackingUrl, fontSize, n0VarD, l0VarB, decRating != null ? e(decRating) : null);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l0 b(DECAppIconSerializable dECAppIconSerializable) {
        Intrinsics.checkNotNullParameter(dECAppIconSerializable, "<this>");
        Integer size = dECAppIconSerializable.getSize();
        String appIconUri = dECAppIconSerializable.getAppIconUri();
        DECBorderSerializable border = dECAppIconSerializable.getBorder();
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l0(size, appIconUri, border != null ? c(border) : null);
    }

    public static final m0 c(DECBorderSerializable dECBorderSerializable) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(dECBorderSerializable, "<this>");
        List gradient = dECBorderSerializable.getGradient();
        if (gradient != null) {
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(gradient, 10));
            Iterator it = gradient.iterator();
            while (it.hasNext()) {
                listEmptyList.add(((GradientColor) it.next()).getColor());
            }
        } else {
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return new m0(dECBorderSerializable.getBorderWidth(), listEmptyList);
    }

    public static final n0 d(DECCtaSerializable dECCtaSerializable) {
        Intrinsics.checkNotNullParameter(dECCtaSerializable, "<this>");
        Integer verticalSpacing = dECCtaSerializable.getVerticalSpacing();
        String ctaText = dECCtaSerializable.getCtaText();
        Integer buttonWidth = dECCtaSerializable.getButtonWidth();
        Integer fontSize = dECCtaSerializable.getFontSize();
        DECBorderSerializable border = dECCtaSerializable.getBorder();
        return new n0(verticalSpacing, ctaText, buttonWidth, fontSize, border != null ? c(border) : null, dECCtaSerializable.getForegroundColor(), dECCtaSerializable.getBackgroundColor());
    }

    public static final r0 e(DECRatingSerializable dECRatingSerializable) {
        Intrinsics.checkNotNullParameter(dECRatingSerializable, "<this>");
        Float ratingValue = dECRatingSerializable.getRatingValue();
        String foregroundColor = dECRatingSerializable.getForegroundColor();
        if (foregroundColor == null) {
            foregroundColor = "#FFFFFF00";
        }
        String str = foregroundColor;
        String backgroundColor = dECRatingSerializable.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = "#FF888888";
        }
        String str2 = backgroundColor;
        Integer size = dECRatingSerializable.getSize();
        int iIntValue = size != null ? size.intValue() : 12;
        Integer fontSize = dECRatingSerializable.getFontSize();
        return new r0(ratingValue, str, str2, iIntValue, fontSize != null ? fontSize.intValue() : 9);
    }
}
