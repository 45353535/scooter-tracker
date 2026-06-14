package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.g10;
import yads.h10;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/monetization/ads/fullscreen/template/view/RoundImageView;", "Landroid/widget/ImageView;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "Lyads/h10;", "cornerViewRenderingControllerFactory", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILyads/h10;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public final class RoundImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g10 f59022a;

    @SuppressLint({"CustomViewStyleable"})
    public RoundImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        g10 g10Var = this.f59022a;
        if (g10Var.f111024d != null && !g10Var.f111023c.isEmpty()) {
            canvas.clipPath(g10Var.f111023c);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f59022a.a();
    }

    @SuppressLint({"CustomViewStyleable"})
    public RoundImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, @NotNull h10 h10Var) {
        super(context, attributeSet, i10);
        h10Var.getClass();
        this.f59022a = h10.a(context, this, attributeSet, i10);
    }

    public /* synthetic */ RoundImageView(Context context, AttributeSet attributeSet, int i10, h10 h10Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? new h10() : h10Var);
    }
}
