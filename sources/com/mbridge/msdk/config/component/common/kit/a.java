package com.mbridge.msdk.config.component.common.kit;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.omsdk.b;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AdSession f46761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AdEvents f46762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaEvents f46763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a f46764d;

    private void b() {
        if (this.f46763c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSDKResume");
            this.f46763c.resume();
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void c() {
        if (this.f46763c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkBuffEnd");
            this.f46763c.bufferFinish();
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void d() {
        if (this.f46763c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkBuffStart");
            this.f46763c.bufferStart();
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void e() {
    }

    private void f() {
        if (this.f46763c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkClick");
            this.f46763c.adUserInteraction(InteractionType.CLICK);
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void g() {
        if (this.f46761a != null) {
            try {
                q0.b("OMSDK_TAG", "onOMSdkDestory");
                this.f46761a.removeAllFriendlyObstructions();
                this.f46761a.finish();
                this.f46761a = null;
            } catch (Exception e10) {
                q0.b("OmSdkKit", e10.getMessage(), e10);
            }
        }
    }

    private void h() {
        if (this.f46763c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkPause");
            this.f46763c.pause();
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void i() {
    }

    private void j() {
        if (this.f46763c == null) {
            return;
        }
        try {
            q0.b("OMSDK_TAG", "onOMSdkSkipped");
            this.f46763c.skipped();
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }

    private void k() {
        if (this.f46761a != null) {
            try {
                q0.b("OMSDK_TAG", "onOMSdkStart");
                this.f46761a.start();
                if (this.f46762b != null) {
                    this.f46762b.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
                    this.f46762b.impressionOccurred();
                }
                com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f46764d;
                if (aVar != null && !aVar.d()) {
                    Object objB = this.f46764d.b("viewTag");
                    Object objB2 = this.f46764d.b("rootView");
                    if ((objB instanceof String) && (objB2 instanceof ViewGroup)) {
                        String strValueOf = String.valueOf(objB);
                        ViewGroup viewGroup = (ViewGroup) objB2;
                        this.f46761a.registerAdView(viewGroup.findViewWithTag(strValueOf));
                        Iterator<View> it = c.a(viewGroup, strValueOf).iterator();
                        while (it.hasNext()) {
                            this.f46761a.addFriendlyObstruction(it.next(), FriendlyObstructionPurpose.OTHER, null);
                        }
                    }
                }
            } catch (Exception e10) {
                q0.b("OmSdkKit", e10.getMessage(), e10);
            }
        }
    }

    public void a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        this.f46764d = aVar;
        a(str);
    }

    private void a(String str) {
        if (this.f46764d == null) {
            return;
        }
        str.getClass();
        switch (str) {
            case "onDestroy":
                g();
                break;
            case "PlayerPlayPlaying":
                b();
                break;
            case "PlayerPlayPause":
                h();
                break;
            case "PlayerPlayStart":
                k();
                break;
            case "onAdClick":
                f();
                break;
            case "onBufferingEnd":
                c();
                break;
            case "onCreate":
                a();
                break;
            case "PlayerPlayMuteChanged":
                e();
                break;
            case "PlayerProgressChanged":
                i();
                break;
            case "onBufferingStart":
                d();
                break;
            case "skipped":
                j();
                break;
        }
    }

    private void a() {
        try {
            if (this.f46764d.a((Object) "global")) {
                Object objB = this.f46764d.b("global");
                if (objB instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objB;
                    AdSession adSessionA = b.a(com.mbridge.msdk.foundation.controller.c.n().d(), false, String.valueOf(aVar.b("omid")), String.valueOf(aVar.b("requestId")), String.valueOf(aVar.b("id")), String.valueOf(aVar.b("campaignUnitId")), String.valueOf(aVar.b("videoURL")), String.valueOf(aVar.b("requestNoticeId")));
                    this.f46761a = adSessionA;
                    if (adSessionA != null) {
                        this.f46762b = AdEvents.createAdEvents(adSessionA);
                        this.f46763c = MediaEvents.createMediaEvents(this.f46761a);
                    }
                }
            }
        } catch (Exception e10) {
            q0.b("OmSdkKit", e10.getMessage(), e10);
        }
    }
}
