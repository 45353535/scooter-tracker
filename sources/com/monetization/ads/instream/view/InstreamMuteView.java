package com.monetization.ads.instream.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.AttrRes;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.mobile.ads.R$dimen;
import com.yandex.mobile.ads.R$drawable;
import com.yandex.mobile.ads.R$string;
import com.yandex.mobile.ads.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.jw1;
import yads.yj3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/monetization/ads/instream/view/InstreamMuteView;", "Landroid/widget/ImageView;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "muted", "", "setMuted", "(Z)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public final class InstreamMuteView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yj3 f59023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f59024b;

    public InstreamMuteView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private static yj3 a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalInstreamMuteView);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MonetizationAdsInternalInstreamMuteView_monetization_internal_sound_on, R$drawable.monetization_ads_internal_ic_sound_on_default);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MonetizationAdsInternalInstreamMuteView_monetization_internal_sound_off, R$drawable.monetization_ads_internal_ic_sound_off_default);
        int i10 = R$string.monetization_ads_internal_instream_muted;
        int i11 = R$string.monetization_ads_internal_instream_unmuted;
        typedArrayObtainStyledAttributes.recycle();
        return new yj3(new jw1(resourceId2, resourceId, i10, i11));
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i10, int i11) {
        Resources resources = getResources();
        setMeasuredDimension(resources.getDimensionPixelSize(R$dimen.monetization_instream_internal_mute_width_v2), resources.getDimensionPixelSize(R$dimen.monetization_instream_internal_mute_height_v2));
    }

    public void setMuted(boolean muted) {
        this.f59024b = muted;
        this.f59023a.a(this, muted);
    }

    public /* synthetic */ InstreamMuteView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public InstreamMuteView(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        super(context, attributeSet, i10);
        this.f59023a = a(context, attributeSet);
        a();
    }

    private final void a() {
        setMuted(this.f59024b);
    }
}
