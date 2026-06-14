package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.h1;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.web.i1;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i1 f21489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.web.c0 f21490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UnitDisplayType f21491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.web.z f21492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21493e;

    public d(Context context, com.fyber.inneractive.sdk.flow.vast.a aVar, com.fyber.inneractive.sdk.model.vast.i iVar, com.fyber.inneractive.sdk.flow.endcard.q qVar) {
        this.f21490b = com.fyber.inneractive.sdk.web.c0.INLINE;
        com.fyber.inneractive.sdk.web.z zVar = com.fyber.inneractive.sdk.web.z.ENABLED;
        this.f21492d = zVar;
        UnitDisplayType unitDisplayType = aVar.f20991a;
        boolean z10 = aVar.f20992b;
        this.f21491c = unitDisplayType;
        this.f21493e = z10;
        int i10 = c.f21487a[unitDisplayType.ordinal()];
        if (i10 == 1 || i10 == 2) {
            this.f21492d = zVar;
            if (z10) {
                this.f21490b = com.fyber.inneractive.sdk.web.c0.INTERSTITIAL;
            }
        } else {
            this.f21492d = zVar;
        }
        try {
            UnitDisplayType unitDisplayType2 = aVar.f20991a;
            boolean z11 = !(unitDisplayType2 == null || unitDisplayType2.isFullscreenUnit()) || IAConfigManager.O.f20315u.f20484b.a(true, "use_fraud_detection_fullscreen");
            i1 bVar = iVar == com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card ? new com.fyber.inneractive.sdk.web.b(qVar, z11) : new IAmraidWebViewController(z11, this.f21490b, this.f21492d, com.fyber.inneractive.sdk.web.d0.AD_CONTROLLED, true, null, null);
            this.f21489a = bVar;
            com.fyber.inneractive.sdk.web.m mVar = bVar.f23971b;
            if (mVar != null) {
                int i11 = c.f21488b[iVar.ordinal()];
                if (i11 == 1) {
                    mVar.setId(R.id.ia_inneractive_vast_endcard_static);
                } else if (i11 == 2 || i11 == 3) {
                    mVar.setId(R.id.ia_inneractive_vast_endcard_html);
                } else if (i11 == 4) {
                    mVar.setId(R.id.ia_inneractive_vast_endcard_iframe);
                }
            }
            i1 i1Var = this.f21489a;
            com.fyber.inneractive.sdk.web.m mVar2 = i1Var.f23971b;
            if (mVar2 != null) {
                l0.f23879a.a(context, mVar2, i1Var);
            }
            i1 i1Var2 = this.f21489a;
            i1Var2.f23971b.setTapListener(i1Var2);
            h1 h1VarA = com.fyber.inneractive.sdk.renderers.l.a(aVar.f20993c, aVar.f20994d, aVar.f20995e);
            this.f21489a.setAdDefaultSize(h1VarA.f23872a, h1VarA.f23873b);
        } catch (Throwable unused) {
            this.f21489a = null;
        }
    }

    public final void a(String str, com.fyber.inneractive.sdk.web.g gVar, boolean z10) {
        String str2;
        com.fyber.inneractive.sdk.flow.x xVar;
        if (this.f21489a == null || TextUtils.isEmpty(str)) {
            gVar.a(null, new InneractiveInfrastructureError(InneractiveErrorCode.UNSPECIFIED, com.fyber.inneractive.sdk.flow.i.NO_WEBVIEW_CONTROLLER_AVAILABLE));
            return;
        }
        i1 i1Var = this.f21489a;
        UnitDisplayType unitDisplayType = this.f21491c;
        boolean z11 = false;
        i1Var.setAutoplayMRAIDVideos(unitDisplayType != null && unitDisplayType.isFullscreenUnit());
        this.f21489a.setCenteringTagsRequired(false);
        i1 i1Var2 = this.f21489a;
        if (i1Var2 != null && (xVar = i1Var2.f23988s) != null && (IAConfigManager.O.f20305k || xVar.f21040f)) {
            z11 = true;
        }
        i1Var2.setMuteMraidVideo(z11);
        i1 i1Var3 = this.f21489a;
        int i10 = com.fyber.inneractive.sdk.config.k.f20410a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        if (TextUtils.isEmpty(property)) {
            str2 = "wv.inner-active.mobi/simpleM2M/";
        } else {
            str2 = property + ".inner-active.mobi/simpleM2M/";
        }
        String str3 = str2;
        UnitDisplayType unitDisplayType2 = this.f21491c;
        boolean z12 = this.f21493e;
        StringBuilder sb2 = new StringBuilder();
        if (unitDisplayType2 != null && unitDisplayType2.isFullscreenUnit() && !z12) {
            sb2.append("<script type=\"text/javascript\">  var IaCloseBtnHelper = (function initIaCloseBtnHelper(){    var styleContent = '.celtra-close-button {display:none !important;} .close-button {display:none !important;}';    function getStyle(doc){      var style = doc.createElement('style');      style.type = 'text/css';      if (style.styleSheet){        style.styleSheet.cssText = styleContent;      } else {        style.appendChild(doc.createTextNode(styleContent));      }      return style;    }    function onDomReady(){      var iframes = window.document.getElementsByTagName('iframe'),          i = 0,          len = iframes && iframes.length || 0;      for(; i < len; ++i){        if(!iframes[i].src){          try {            iframes[i].contentDocument.body.appendChild(getStyle(iframes[i].contentDocument));          }catch(e){          }}}}    function registerWindowEvents(){      window.addEventListener('load', function onWindowLoad(){        window.removeEventListener('load', onWindowLoad);        onDomReady();      });    }    return {      init: function init(){        if(window.document.readyState != 'complete'){          registerWindowEvents();        }else{          onDomReady();        }}}})();  IaCloseBtnHelper.init();</script>");
        }
        String string = sb2.toString();
        UnitDisplayType unitDisplayType3 = this.f21491c;
        StringBuilder sb3 = new StringBuilder();
        if (unitDisplayType3 != null && !unitDisplayType3.isFullscreenUnit()) {
            if (unitDisplayType3 == UnitDisplayType.BANNER) {
                sb3.append(" body {display: flex;} #iawrapper { position:unset !important; display: unset !important; } ");
            } else {
                sb3.append(" #iawrapper { position:unset !important; display: unset !important; }");
            }
        }
        String string2 = sb3.toString();
        i1Var3.f23975f = gVar;
        try {
            i1Var3.h();
            com.fyber.inneractive.sdk.web.e eVar = new com.fyber.inneractive.sdk.web.e(i1Var3, str, z10, string, string2, str3);
            i1Var3.f23984o = eVar;
            eVar.a().post(new com.fyber.inneractive.sdk.util.c(eVar));
        } catch (Throwable th2) {
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_CONFIGURE_WEBVIEW, th2);
            com.fyber.inneractive.sdk.web.g gVar2 = i1Var3.f23975f;
            if (gVar2 != null) {
                gVar2.a(i1Var3, inneractiveInfrastructureError);
            }
            i1Var3.b(true);
        }
    }

    public final void a() {
        com.fyber.inneractive.sdk.web.m mVar;
        i1 i1Var = this.f21489a;
        if (i1Var == null || (mVar = i1Var.f23971b) == null) {
            return;
        }
        WebSettings settings = mVar.getSettings();
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
    }
}
