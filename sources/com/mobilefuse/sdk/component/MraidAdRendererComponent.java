package com.mobilefuse.sdk.component;

import android.content.Context;
import com.mobilefuse.sdk.AdRendererConfig;
import com.mobilefuse.sdk.AdRendererListener;
import com.mobilefuse.sdk.BaseAdRenderer;
import com.mobilefuse.sdk.mraid.BuildConfig;
import com.mobilefuse.sdk.mraid.MraidAdRenderer;
import com.mobilefuse.sdk.telemetry.TelemetryManager;

/* JADX INFO: loaded from: classes10.dex */
public class MraidAdRendererComponent implements AdRendererComponent {
    MraidAdRendererComponent() {
    }

    public static MraidAdRendererComponent createComponent() throws Throwable {
        return new MraidAdRendererComponent();
    }

    public static void register() throws Throwable {
        TelemetryManager.registerModule(BuildConfig.LIBRARY_PACKAGE_NAME, "1.9.3");
        ComponentRegistrar.registerComponent(ComponentType.MRAID_AD_RENDERER, createComponent());
    }

    @Override // com.mobilefuse.sdk.component.AdRendererComponent
    public BaseAdRenderer createInstance(Context context, AdRendererConfig adRendererConfig, AdRendererListener adRendererListener) throws Throwable {
        return new MraidAdRenderer(context, adRendererConfig, adRendererListener);
    }
}
