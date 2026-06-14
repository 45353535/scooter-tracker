package com.mobilefuse.sdk.component;

import android.content.Context;
import com.mobilefuse.sdk.AdRendererConfig;
import com.mobilefuse.sdk.AdRendererListener;
import com.mobilefuse.sdk.BaseAdRenderer;
import com.mobilefuse.sdk.telemetry.TelemetryManager;
import com.mobilefuse.sdk.vast.BuildConfig;
import com.mobilefuse.sdk.vast.VastAdRenderer;

/* JADX INFO: loaded from: classes10.dex */
public class VastAdRendererComponent implements AdRendererComponent {
    VastAdRendererComponent() {
    }

    public static VastAdRendererComponent createComponent() throws Throwable {
        return new VastAdRendererComponent();
    }

    public static void register() throws Throwable {
        TelemetryManager.registerModule(BuildConfig.LIBRARY_PACKAGE_NAME, "1.9.3");
        ComponentRegistrar.registerComponent(ComponentType.VAST_AD_RENDERER, createComponent());
    }

    @Override // com.mobilefuse.sdk.component.AdRendererComponent
    public BaseAdRenderer createInstance(Context context, AdRendererConfig adRendererConfig, AdRendererListener adRendererListener) throws Throwable {
        return new VastAdRenderer(context, adRendererConfig, adRendererListener);
    }
}
