package com.pubmatic.sdk.common.view.cta;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.common.R$dimen;
import com.pubmatic.sdk.common.R$id;
import com.pubmatic.sdk.common.R$layout;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/pubmatic/sdk/common/view/cta/POBFullscreenCTAOverlayView;", "Lcom/pubmatic/sdk/common/view/cta/POBCTAOverlayView;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "<init>", "(Landroid/content/Context;)V", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/widget/TextView;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Landroid/widget/TextView;", "getHeader", "()Landroid/widget/TextView;", POBCTAOverlayData.KEY_CTA_HEADER, InneractiveMediationDefs.GENDER_FEMALE, "getDescription", "description", "g", "I", "maxWidth", "common_release"}, k = 1, mv = {1, 7, 1})
public final class POBFullscreenCTAOverlayView extends POBCTAOverlayView {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final TextView header;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final TextView description;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int maxWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public POBFullscreenCTAOverlayView(@NotNull Context context) {
        super(context, R$layout.pob_cta_overlay_fullscreen);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewFindViewById = findViewById(R$id.pob_cta_header);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.pob_cta_header)");
        this.header = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.pob_cta_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.pob_cta_description)");
        this.description = (TextView) viewFindViewById2;
        this.maxWidth = context.getResources().getDimensionPixelSize(R$dimen.pob_cta_overlay_max_width);
    }

    @NotNull
    public final TextView getDescription() {
        return this.description;
    }

    @NotNull
    public final TextView getHeader() {
        return this.header;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int i10 = this.maxWidth;
        if (size > i10 && mode != 0) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, mode);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
