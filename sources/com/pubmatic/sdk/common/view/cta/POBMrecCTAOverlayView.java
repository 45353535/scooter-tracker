package com.pubmatic.sdk.common.view.cta;

import android.content.Context;
import com.pubmatic.sdk.common.R$layout;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/pubmatic/sdk/common/view/cta/POBMrecCTAOverlayView;", "Lcom/pubmatic/sdk/common/view/cta/POBCTAOverlayView;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class POBMrecCTAOverlayView extends POBCTAOverlayView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public POBMrecCTAOverlayView(@NotNull Context context) {
        super(context, R$layout.pob_cta_overlay_mrec);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
