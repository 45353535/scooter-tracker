package com.mobilefuse.sdk;

import android.content.Context;
import com.mobilefuse.sdk.component.AdRendererComponent;
import com.mobilefuse.sdk.component.ComponentRegistrar;
import com.mobilefuse.sdk.component.ComponentType;
import com.mobilefuse.sdk.network.model.AdmMediaType;
import com.mobilefuse.sdk.omid.OmidService;

/* JADX INFO: loaded from: classes10.dex */
class AdRendererFactory {
    AdRendererFactory() {
    }

    static BaseAdRenderer getAdRenderer(Context context, AdmMediaType admMediaType, AdRendererConfig adRendererConfig, AdRendererListener adRendererListener) throws Throwable {
        AdRendererType adRendererType;
        AdRendererComponent registeredComponent;
        BaseAdRenderer baseAdRendererCreateInstance;
        try {
            if (admMediaType == AdmMediaType.STORYBOARD) {
                adRendererType = AdRendererType.STORYBOARD;
                registeredComponent = ComponentRegistrar.getRegisteredComponent(ComponentType.STORYBOARD_AD_RENDERER);
            } else {
                adRendererType = null;
                registeredComponent = null;
            }
            if (admMediaType == AdmMediaType.VIDEO) {
                adRendererType = AdRendererType.VAST;
                registeredComponent = ComponentRegistrar.getRegisteredComponent(ComponentType.VAST_AD_RENDERER);
            } else if (admMediaType == AdmMediaType.BANNER) {
                adRendererType = AdRendererType.MRAID;
                registeredComponent = ComponentRegistrar.getRegisteredComponent(ComponentType.MRAID_AD_RENDERER);
            }
            if (registeredComponent == null || (baseAdRendererCreateInstance = registeredComponent.createInstance(context, adRendererConfig, adRendererListener)) == null) {
                return null;
            }
            baseAdRendererCreateInstance.setOmidBridge(OmidService.createOmidBridge(adRendererType));
            return baseAdRendererCreateInstance;
        } catch (Throwable th2) {
            StabilityHelper.logException((Class<?>) AdRendererFactory.class, th2);
            return null;
        }
    }
}
