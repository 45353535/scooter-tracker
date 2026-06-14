package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.mobile.ads.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.o33;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/monetization/ads/fullscreen/template/view/CallToActionView;", "Landroid/widget/Button;", "", "text", "Landroid/widget/TextView$BufferType;", "type", "", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public final class CallToActionView extends Button {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f59014a;

    @SuppressLint({"CustomViewStyleable"})
    public CallToActionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private static Drawable a(Context context, int i10) {
        return ContextCompat.getDrawable(context, i10);
    }

    @Override // android.widget.TextView
    public final CharSequence getText() {
        return this.f59014a;
    }

    @Override // android.widget.TextView
    public void setText(@NotNull CharSequence text, @NotNull TextView.BufferType type) {
        if (text instanceof String) {
            this.f59014a = text;
        }
        super.setText(this.f59014a, TextView.BufferType.SPANNABLE);
    }

    public /* synthetic */ CallToActionView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void a() {
        setSpannableFactory(Spannable.Factory.getInstance());
        setText(this.f59014a);
    }

    @SuppressLint({"CustomViewStyleable"})
    public CallToActionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11;
        super(context, attributeSet, i10);
        int i12 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalIconButton, i10, 0);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MonetizationAdsInternalIconButton_monetization_internal_icon, 0);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalIconButton_monetization_internal_icon_size, 0);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalIconButton_monetization_internal_icon_offset, 0);
            typedArrayObtainStyledAttributes.recycle();
            drawableA = resourceId != 0 ? a(context, resourceId) : null;
            i11 = dimensionPixelSize2;
            i12 = dimensionPixelSize;
        } else {
            i11 = 0;
        }
        setSpannableFactory(new o33(drawableA, i12, i11));
    }
}
