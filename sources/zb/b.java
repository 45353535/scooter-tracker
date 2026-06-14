package zb;

import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.TrackEventType;
import io.bidmachine.core.j;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.rendering.Rendering;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import od.k;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f119334a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f119335b = new EnumMap(TrackEventType.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final od.a f119336c = new od.a();

    public b(Ad ad2) {
        AdExtension adExtensionG = ae.f.g(ad2);
        if (adExtensionG != null) {
            h(adExtensionG);
        }
        i(ad2.getExt().getFieldsMap());
    }

    protected void a(TrackEventType trackEventType, String str) {
        ae.f.a(this.f119335b, trackEventType, str);
    }

    public Map b() {
        return this.f119336c.u();
    }

    public int c() {
        return d().f("height");
    }

    public k d() {
        return this.f119336c;
    }

    public j e() {
        return this.f119334a;
    }

    public abstract boolean f();

    protected void g(List list) {
        ae.f.q(this.f119335b, list);
    }

    protected void h(AdExtension adExtension) {
        this.f119334a.i(io.bidmachine.core.h.z(adExtension.getViewabilityTimeThreshold(), AdExtension.getDefaultInstance().getViewabilityTimeThreshold(), 1L));
        this.f119334a.g(io.bidmachine.core.h.y(adExtension.getViewabilityPixelThreshold(), AdExtension.getDefaultInstance().getViewabilityPixelThreshold(), 1.0f));
        this.f119334a.f(adExtension.getViewabilityIgnoreWindowFocus());
        this.f119334a.e(adExtension.getViewabilityIgnoreOverlap());
        g(adExtension.getEventList());
        b().put("viewability_time_threshold_sec", Integer.valueOf(adExtension.getViewabilityTimeThreshold()));
        b().put("viewability_pixel_threshold", Float.valueOf(adExtension.getViewabilityPixelThreshold()));
        b().put("viewability_ignore_window_focus", Boolean.valueOf(adExtension.getViewabilityIgnoreWindowFocus()));
        b().put("viewability_ignore_overlap", Boolean.valueOf(adExtension.getViewabilityIgnoreOverlap()));
        b().put("useNativeClose", Boolean.valueOf(adExtension.getUseNativeClose()));
        b().put("cacheControl", adExtension.getCreativeLoadingMethod());
        b().put("placeholderTimeoutSec", Float.valueOf(adExtension.getPlaceholderTimeout()));
        b().put("skipOffset", Integer.valueOf(adExtension.getSkipoffset()));
        b().put("companionSkipOffset", Integer.valueOf(adExtension.getCompanionSkipoffset()));
        b().put("r1", Boolean.valueOf(adExtension.getR1()));
        b().put("r2", Boolean.valueOf(adExtension.getR2()));
        b().put("store_url", adExtension.getStoreUrl());
        b().put("progress_duration", Integer.valueOf(adExtension.getProgressDuration()));
        AdExtension.ControlAsset closeButton = adExtension.getCloseButton();
        if (closeButton != null && closeButton != AdExtension.ControlAsset.getDefaultInstance()) {
            b().put("close_button_control_asset", closeButton);
        }
        AdExtension.ControlAsset countdown = adExtension.getCountdown();
        if (countdown != null && countdown != AdExtension.ControlAsset.getDefaultInstance()) {
            b().put("countdown_control_asset", countdown);
        }
        AdExtension.ControlAsset progress = adExtension.getProgress();
        if (progress != null && progress != AdExtension.ControlAsset.getDefaultInstance()) {
            b().put("progress_control_asset", progress);
        }
        Rendering renderingConfiguration = adExtension.getRenderingConfiguration();
        if (renderingConfiguration == null || renderingConfiguration == Rendering.getDefaultInstance()) {
            return;
        }
        b().put("rendering_configuration", renderingConfiguration);
    }

    protected void i(Map map) {
        Value value = (Value) map.get("omsdk_enabled");
        if (value != null) {
            b().put("omsdk_enabled", Boolean.valueOf(value.getBoolValue()));
        }
    }

    public void j(int i10) {
        b().put("height", Integer.valueOf(i10));
    }

    public void k(int i10) {
        b().put("width", Integer.valueOf(i10));
    }
}
