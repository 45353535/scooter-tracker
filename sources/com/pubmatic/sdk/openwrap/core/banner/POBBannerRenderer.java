package com.pubmatic.sdk.openwrap.core.banner;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBDataType$POBVideoAdEventType;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBAdRendererListener;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.ui.POBBannerRendering;
import com.pubmatic.sdk.openwrap.core.R$id;
import com.pubmatic.sdk.video.renderer.POBVideoRenderingListener;

/* JADX INFO: loaded from: classes11.dex */
public class POBBannerRenderer implements POBBannerRendering, POBAdRendererListener, POBVideoRenderingListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private POBBannerRendering f62830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private POBAdRendererListener f62831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RendererBuilder f62832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f62833d;

    public interface RendererBuilder {
        @Nullable
        POBBannerRendering build(@NonNull POBAdDescriptor pOBAdDescriptor, int i10);
    }

    public POBBannerRenderer(@NonNull RendererBuilder rendererBuilder) {
        this.f62832c = rendererBuilder;
    }

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    public void destroy() {
        POBBannerRendering pOBBannerRendering = this.f62830a;
        if (pOBBannerRendering != null) {
            pOBBannerRendering.destroy();
        }
    }

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    public void invalidateExpiration() {
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRenderingListener
    public void notifyAdEvent(@NonNull POBDataType$POBVideoAdEventType pOBDataType$POBVideoAdEventType) {
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdExpired() {
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdImpression() {
        POBAdRendererListener pOBAdRendererListener = this.f62831b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdImpression();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdInteractionStarted() {
        POBAdRendererListener pOBAdRendererListener = this.f62831b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdInteractionStarted();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdInteractionStopped() {
        POBAdRendererListener pOBAdRendererListener = this.f62831b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdInteractionStopped();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdReadyToRefresh(int i10) {
        POBAdRendererListener pOBAdRendererListener = this.f62831b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdReadyToRefresh(i10);
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdRender(@NonNull View view, @Nullable POBAdDescriptor pOBAdDescriptor) {
        view.setId(R$id.pob_ow_adview);
        POBAdRendererListener pOBAdRendererListener = this.f62831b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdRender(view, pOBAdDescriptor);
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdRenderingFailed(@NonNull POBError pOBError) {
        POBAdRendererListener pOBAdRendererListener = this.f62831b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdRenderingFailed(pOBError);
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onAdUnload() {
        POBAdRendererListener pOBAdRendererListener = this.f62831b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdUnload();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onLeavingApplication() {
        POBAdRendererListener pOBAdRendererListener = this.f62831b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onLeavingApplication();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onRenderAdClick() {
        POBAdRendererListener pOBAdRendererListener = this.f62831b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onRenderAdClick();
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdRendererListener
    public void onRenderProcessGone() {
        POBAdRendererListener pOBAdRendererListener = this.f62831b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onRenderProcessGone();
        }
    }

    @Override // com.pubmatic.sdk.video.renderer.POBVideoRenderingListener
    public void onSkipOptionUpdate(boolean z10) {
    }

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    public void renderAd(@NonNull POBAdDescriptor pOBAdDescriptor) {
        POBLog.debug("POBBannerRenderer", "Rendering onStart in POBBannerRenderer", new Object[0]);
        if (pOBAdDescriptor.getRenderableContent() != null) {
            POBBannerRendering pOBBannerRenderingBuild = this.f62832c.build(pOBAdDescriptor, hashCode());
            this.f62830a = pOBBannerRenderingBuild;
            if (pOBBannerRenderingBuild != null) {
                pOBBannerRenderingBuild.setWatermark(this.f62833d);
                this.f62830a.setAdRendererListener(this);
                this.f62830a.renderAd(pOBAdDescriptor);
                return;
            }
        }
        POBAdRendererListener pOBAdRendererListener = this.f62831b;
        if (pOBAdRendererListener != null) {
            pOBAdRendererListener.onAdRenderingFailed(new POBError(1009, "Rendering failed for descriptor: " + pOBAdDescriptor));
        }
    }

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    public void setAdRendererListener(@Nullable POBAdRendererListener pOBAdRendererListener) {
        this.f62831b = pOBAdRendererListener;
    }

    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    public void setWatermark(@Nullable String str) {
        this.f62833d = str;
    }
}
