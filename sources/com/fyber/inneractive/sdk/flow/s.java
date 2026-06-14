package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdSession;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IAmraidWebViewController f20870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q f20871n = new q(this);

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.b
    public final void a() {
        IAmraidWebViewController iAmraidWebViewController;
        AdSession adSession;
        IAlog.a("%s : IAMraidContentLoader : destroyController", IAlog.a(this));
        if (this.f20754c != null && (iAmraidWebViewController = this.f20870m) != null) {
            com.fyber.inneractive.sdk.measurement.tracker.e eVar = iAmraidWebViewController.I;
            if (eVar != null && (adSession = eVar.f21120a) != null) {
                try {
                    adSession.finish();
                } catch (Throwable unused) {
                }
                com.fyber.inneractive.sdk.util.r.f23896b.postDelayed(new com.fyber.inneractive.sdk.measurement.tracker.c(eVar), 1000);
                eVar.f21120a = null;
                eVar.f21121b = null;
            }
            this.f20870m.e();
            this.f20870m = null;
        }
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.c
    public final void cancel() {
        IAmraidWebViewController iAmraidWebViewController;
        AdSession adSession;
        IAlog.a("%s : IAMraidContentLoader : destroyController", IAlog.a(this));
        if (this.f20754c != null && (iAmraidWebViewController = this.f20870m) != null) {
            com.fyber.inneractive.sdk.measurement.tracker.e eVar = iAmraidWebViewController.I;
            if (eVar != null && (adSession = eVar.f21120a) != null) {
                try {
                    adSession.finish();
                } catch (Throwable unused) {
                }
                com.fyber.inneractive.sdk.util.r.f23896b.postDelayed(new com.fyber.inneractive.sdk.measurement.tracker.c(eVar), 1000);
                eVar.f21120a = null;
                eVar.f21121b = null;
            }
            this.f20870m.e();
            this.f20870m = null;
        }
        this.f20762k.a();
        IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(this));
        com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(this.f20763l);
        this.f20752a = null;
        this.f20753b = null;
        this.f20754c = null;
        this.f20755d = null;
        this.f20756e = null;
        this.f20757f = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final InneractiveInfrastructureError d() {
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f20761j;
        if (aVar != null) {
            int i10 = this.f20760i;
            if (aVar.f21395g) {
                i10 = aVar.f21389a - i10;
            }
            i = (i10 == aVar.f21389a ? aVar.f21396h : 0) + (aVar.f21390b * i10) + aVar.f21392d;
        }
        return new InneractiveInfrastructureError(InneractiveErrorCode.LOAD_TIMEOUT, i.WEBVIEW_LOAD_TIMEOUT, new Exception("LoadTimeout after " + i + " ms"));
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final String e() {
        return "send_failed_display_creatives";
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final void h() {
        com.fyber.inneractive.sdk.web.z zVar;
        String str;
        String str2;
        q0 q0Var = new q0(f(), this.f20758g);
        this.f20754c = q0Var;
        com.fyber.inneractive.sdk.response.e eVar = this.f20753b;
        q0Var.f21036b = (com.fyber.inneractive.sdk.response.f) eVar;
        q0Var.f21040f = this.f20759h;
        com.fyber.inneractive.sdk.measurement.e eVar2 = null;
        UnitDisplayType unitDisplayType = eVar != null ? ((com.fyber.inneractive.sdk.response.f) eVar).f23736p : null;
        com.fyber.inneractive.sdk.web.c0 c0Var = com.fyber.inneractive.sdk.web.c0.INLINE;
        if (unitDisplayType == null) {
            this.f20871n.a(null, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.EMPTY_UNIT_DISPLAY_TYPE, new Exception("Unit display type was not found")));
            return;
        }
        int i10 = r.f20869a[unitDisplayType.ordinal()];
        if (i10 == 1 || i10 == 2) {
            zVar = com.fyber.inneractive.sdk.web.z.ENABLED;
            InneractiveAdRequest inneractiveAdRequest = this.f20752a;
            if (inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen()) {
                c0Var = com.fyber.inneractive.sdk.web.c0.INTERSTITIAL;
            }
        } else {
            zVar = com.fyber.inneractive.sdk.web.z.ENABLED;
        }
        com.fyber.inneractive.sdk.web.c0 c0Var2 = c0Var;
        com.fyber.inneractive.sdk.web.z zVar2 = zVar;
        com.fyber.inneractive.sdk.response.e eVar3 = this.f20753b;
        boolean z10 = (eVar3 == null || (str2 = ((com.fyber.inneractive.sdk.response.f) eVar3).N) == null || str2.contains("iaNotifyLoadFinished")) ? false : true;
        IAConfigManager iAConfigManager = IAConfigManager.O;
        boolean z11 = !unitDisplayType.isFullscreenUnit() || iAConfigManager.f20315u.f20484b.a(true, "use_fraud_detection_fullscreen");
        try {
            com.fyber.inneractive.sdk.web.d0 d0Var = com.fyber.inneractive.sdk.web.d0.AD_CONTROLLED;
            com.fyber.inneractive.sdk.config.global.r rVar = this.f20758g;
            if (rVar != null) {
                Boolean boolC = ((com.fyber.inneractive.sdk.config.global.features.l) rVar.a(com.fyber.inneractive.sdk.config.global.features.l.class)).c(com.ironsource.mediationsdk.metadata.a.f44111j);
                boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
                IAlog.a("OMSDK AB %s", String.valueOf(zBooleanValue));
                if (zBooleanValue) {
                    eVar2 = iAConfigManager.K;
                }
            }
            IAmraidWebViewController iAmraidWebViewController = new IAmraidWebViewController(z11, c0Var2, zVar2, d0Var, z10, eVar2, this.f20758g);
            this.f20870m = iAmraidWebViewController;
            iAmraidWebViewController.setAdContent(this.f20754c);
            this.f20870m.setAdRequest(this.f20752a);
            IAmraidWebViewController iAmraidWebViewController2 = this.f20870m;
            q0 q0Var2 = (q0) this.f20754c;
            q0Var2.getClass();
            iAmraidWebViewController2.setMuteMraidVideo(iAConfigManager.f20305k || q0Var2.f21040f);
            ((q0) this.f20754c).f20868i = this.f20870m;
            com.fyber.inneractive.sdk.response.e eVar4 = this.f20753b;
            if (eVar4 != null) {
                UnitDisplayType unitDisplayType2 = ((com.fyber.inneractive.sdk.response.f) eVar4).f23736p;
                InneractiveAdRequest inneractiveAdRequest2 = this.f20752a;
                boolean z12 = inneractiveAdRequest2 == null || inneractiveAdRequest2.getAllowFullscreen();
                StringBuilder sb2 = new StringBuilder();
                if (unitDisplayType2 != null && unitDisplayType2.isFullscreenUnit() && !z12) {
                    sb2.append("<script type=\"text/javascript\">  var IaCloseBtnHelper = (function initIaCloseBtnHelper(){    var styleContent = '.celtra-close-button {display:none !important;} .close-button {display:none !important;}';    function getStyle(doc){      var style = doc.createElement('style');      style.type = 'text/css';      if (style.styleSheet){        style.styleSheet.cssText = styleContent;      } else {        style.appendChild(doc.createTextNode(styleContent));      }      return style;    }    function onDomReady(){      var iframes = window.document.getElementsByTagName('iframe'),          i = 0,          len = iframes && iframes.length || 0;      for(; i < len; ++i){        if(!iframes[i].src){          try {            iframes[i].contentDocument.body.appendChild(getStyle(iframes[i].contentDocument));          }catch(e){          }}}}    function registerWindowEvents(){      window.addEventListener('load', function onWindowLoad(){        window.removeEventListener('load', onWindowLoad);        onDomReady();      });    }    return {      init: function init(){        if(window.document.readyState != 'complete'){          registerWindowEvents();        }else{          onDomReady();        }}}})();  IaCloseBtnHelper.init();</script>");
                }
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                if (unitDisplayType2 != null && !unitDisplayType2.isFullscreenUnit()) {
                    if (unitDisplayType2 == UnitDisplayType.BANNER) {
                        sb3.append(" body {display: flex;} #iawrapper { position:unset !important; display: unset !important; } ");
                    } else {
                        sb3.append(" #iawrapper { position:unset !important; display: unset !important; }");
                    }
                }
                String string2 = sb3.toString();
                this.f20870m.setAutoplayMRAIDVideos(unitDisplayType.isFullscreenUnit() || UnitDisplayType.MRECT.equals(unitDisplayType));
                IAmraidWebViewController iAmraidWebViewController3 = this.f20870m;
                int i11 = com.fyber.inneractive.sdk.config.k.f20410a;
                String property = System.getProperty("ia.testEnvironmentConfiguration.name");
                if (TextUtils.isEmpty(property)) {
                    str = "wv.inner-active.mobi/simpleM2M/";
                } else {
                    str = property + ".inner-active.mobi/simpleM2M/";
                }
                String str3 = str;
                String str4 = "" + ((com.fyber.inneractive.sdk.response.f) this.f20753b).N;
                iAmraidWebViewController3.f23975f = this.f20871n;
                try {
                    iAmraidWebViewController3.h();
                    com.fyber.inneractive.sdk.web.e eVar5 = new com.fyber.inneractive.sdk.web.e(iAmraidWebViewController3, str4, true, string, string2, str3);
                    iAmraidWebViewController3.f23984o = eVar5;
                    eVar5.a().post(new com.fyber.inneractive.sdk.util.c(eVar5));
                } catch (Throwable th2) {
                    InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.COULD_NOT_CONFIGURE_WEBVIEW, th2);
                    com.fyber.inneractive.sdk.web.g gVar = iAmraidWebViewController3.f23975f;
                    if (gVar != null) {
                        gVar.a(iAmraidWebViewController3, inneractiveInfrastructureError);
                    }
                    iAmraidWebViewController3.b(true);
                }
            }
        } catch (Throwable th3) {
            b(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.COULD_NOT_CREATE_WEBVIEW_CONTROLLER, th3));
        }
    }
}
