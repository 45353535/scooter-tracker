package coil.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.MBridgeConstans;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR(\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcoil/target/ImageViewTarget;", "Lcoil/target/GenericViewTarget;", "Landroid/widget/ImageView;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Landroid/widget/ImageView;", "h", "()Landroid/widget/ImageView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/graphics/drawable/Drawable;", "value", "d", "()Landroid/graphics/drawable/Drawable;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "(Landroid/graphics/drawable/Drawable;)V", "drawable", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class ImageViewTarget extends GenericViewTarget<ImageView> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ImageView view;

    @Override // coil.target.GenericViewTarget
    public Drawable d() {
        return getView().getDrawable();
    }

    @Override // coil.target.GenericViewTarget
    public void e(Drawable drawable) {
        getView().setImageDrawable(drawable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ImageViewTarget) && Intrinsics.areEqual(getView(), ((ImageViewTarget) other).getView());
    }

    @Override // a0.b
    /* JADX INFO: renamed from: h, reason: from getter */
    public ImageView getView() {
        return this.view;
    }

    public int hashCode() {
        return getView().hashCode();
    }
}
