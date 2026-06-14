package com.taurusx.tax.s;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.iab.omid.library.taurusx.Omid;
import com.iab.omid.library.taurusx.adsession.AdEvents;
import com.iab.omid.library.taurusx.adsession.AdSession;
import com.iab.omid.library.taurusx.adsession.AdSessionConfiguration;
import com.iab.omid.library.taurusx.adsession.AdSessionContext;
import com.iab.omid.library.taurusx.adsession.CreativeType;
import com.iab.omid.library.taurusx.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.taurusx.adsession.ImpressionType;
import com.iab.omid.library.taurusx.adsession.Owner;
import com.iab.omid.library.taurusx.adsession.Partner;
import com.iab.omid.library.taurusx.adsession.VerificationScriptResource;
import com.iab.omid.library.taurusx.adsession.media.InteractionType;
import com.iab.omid.library.taurusx.adsession.media.MediaEvents;
import com.iab.omid.library.taurusx.adsession.media.VastProperties;
import com.taurusx.tax.vast.VastConfig;
import com.taurusx.tax.vast.ViewabilityVendor;
import com.taurusx.tax.w.c.y;
import com.taurusx.tax.w.s.s;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class z {
    public static void a(MediaEvents mediaEvents, AdSession adSession, s sVar) {
        if (mediaEvents == null || adSession == null) {
            return;
        }
        try {
            mediaEvents.thirdQuartile();
        } catch (Exception e10) {
            if (sVar != null) {
                sVar.w(e10.getMessage(), false);
            }
            e10.printStackTrace();
        }
    }

    public static void c(MediaEvents mediaEvents, AdSession adSession, s sVar) {
        if (mediaEvents == null || adSession == null) {
            return;
        }
        try {
            mediaEvents.midpoint();
        } catch (Exception e10) {
            if (sVar != null) {
                sVar.w(e10.getMessage(), false);
            }
            e10.printStackTrace();
        }
    }

    public static void o(MediaEvents mediaEvents, AdSession adSession, s sVar) {
        if (mediaEvents == null || adSession == null) {
            return;
        }
        try {
            mediaEvents.pause();
        } catch (Exception e10) {
            if (sVar != null) {
                sVar.w(e10.getMessage(), false);
            }
            e10.printStackTrace();
        }
    }

    public static void s(MediaEvents mediaEvents, AdSession adSession, s sVar) {
        if (mediaEvents == null || adSession == null) {
            return;
        }
        try {
            mediaEvents.resume();
        } catch (Exception e10) {
            if (sVar != null) {
                sVar.w(e10.getMessage(), false);
            }
            e10.printStackTrace();
        }
    }

    public static void w(MediaEvents mediaEvents, AdSession adSession, s sVar) {
        if (mediaEvents == null || adSession == null) {
            return;
        }
        try {
            mediaEvents.complete();
        } catch (Exception e10) {
            if (sVar != null) {
                sVar.w(e10.getMessage(), false);
            }
            e10.printStackTrace();
        }
    }

    public static void y(MediaEvents mediaEvents, AdSession adSession, s sVar) {
        if (mediaEvents == null || adSession == null) {
            return;
        }
        try {
            mediaEvents.firstQuartile();
        } catch (Exception e10) {
            if (sVar != null) {
                sVar.w(e10.getMessage(), false);
            }
            e10.printStackTrace();
        }
    }

    public static AdSession z(Context context, String str, CreativeType creativeType, y.z zVar, s sVar) {
        if (zVar != null) {
            try {
                if (zVar.l() != null && !zVar.l().isEmpty()) {
                    z(context);
                    ImpressionType impressionType = creativeType == CreativeType.AUDIO ? ImpressionType.AUDIBLE : ImpressionType.VIEWABLE;
                    Owner owner = Owner.NATIVE;
                    AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, (creativeType == CreativeType.HTML_DISPLAY || creativeType == CreativeType.NATIVE_DISPLAY) ? Owner.NONE : owner, false);
                    Partner partnerCreatePartner = Partner.createPartner(com.taurusx.tax.z.f67753n, "1.12.2");
                    String strZ = w.z(context);
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> it = zVar.l().iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObject = new JSONObject(it.next());
                        String strOptString = jSONObject.optString(com.taurusx.tax.w.o.z.f67404g0);
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.taurusx.tax.w.o.z.B);
                        String strOptString2 = jSONObjectOptJSONObject.optString(com.taurusx.tax.w.o.z.f67407h0);
                        String strOptString3 = jSONObjectOptJSONObject.optString(com.taurusx.tax.w.o.z.f67410i0);
                        if (TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3)) {
                            arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(new URL(strOptString)));
                        } else {
                            arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(strOptString2, new URL(strOptString), strOptString3));
                        }
                    }
                    return AdSession.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, AdSessionContext.createNativeAdSessionContext(partnerCreatePartner, strZ, arrayList, null, str));
                }
            } catch (Exception e10) {
                if (sVar != null) {
                    sVar.w(e10.getMessage(), false);
                }
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static void c(AdSession adSession, s sVar) {
        if (adSession != null) {
            try {
                adSession.removeAllFriendlyObstructions();
            } catch (Exception e10) {
                if (sVar != null) {
                    sVar.w(e10.getMessage(), false);
                }
                e10.printStackTrace();
            }
        }
    }

    public static void o(AdSession adSession, s sVar) {
        if (adSession != null) {
            try {
                adSession.start();
            } catch (Exception e10) {
                if (sVar != null) {
                    sVar.w(e10.getMessage(), false);
                }
                e10.printStackTrace();
            }
        }
    }

    public static void w(MediaEvents mediaEvents, s sVar) {
        if (mediaEvents != null) {
            try {
                mediaEvents.bufferStart();
            } catch (Exception e10) {
                if (sVar != null) {
                    sVar.w(e10.getMessage(), false);
                }
                e10.printStackTrace();
            }
        }
    }

    public static void y(MediaEvents mediaEvents, s sVar) {
        if (mediaEvents != null) {
            try {
                mediaEvents.skipped();
            } catch (Exception e10) {
                if (sVar != null) {
                    sVar.w(e10.getMessage(), false);
                }
                e10.printStackTrace();
            }
        }
    }

    public static void w(AdEvents adEvents, s sVar) {
        if (adEvents != null) {
            try {
                adEvents.loaded();
            } catch (Exception e10) {
                if (sVar != null) {
                    sVar.w(e10.getMessage(), false);
                }
                e10.printStackTrace();
            }
        }
    }

    public static void y(AdSession adSession, s sVar) {
        if (adSession != null) {
            try {
                adSession.finish();
            } catch (Exception e10) {
                if (sVar != null) {
                    sVar.w(e10.getMessage(), false);
                }
                e10.printStackTrace();
            }
        }
    }

    public static MediaEvents w(AdSession adSession, s sVar) {
        if (adSession == null) {
            return null;
        }
        try {
            return MediaEvents.createMediaEvents(adSession);
        } catch (Exception e10) {
            if (sVar != null) {
                sVar.w(e10.getMessage(), false);
            }
            e10.printStackTrace();
            return null;
        }
    }

    public static AdSession z(Context context, String str, CreativeType creativeType, VastConfig vastConfig, s sVar) {
        if (vastConfig == null) {
            return null;
        }
        try {
            z(context);
            ImpressionType impressionType = creativeType == CreativeType.AUDIO ? ImpressionType.AUDIBLE : ImpressionType.VIEWABLE;
            Owner owner = Owner.NATIVE;
            AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, (creativeType == CreativeType.HTML_DISPLAY || creativeType == CreativeType.NATIVE_DISPLAY) ? Owner.NONE : owner, false);
            Partner partnerCreatePartner = Partner.createPartner(com.taurusx.tax.z.f67753n, "1.12.2");
            String strZ = w.z(context);
            ArrayList arrayList = new ArrayList();
            for (ViewabilityVendor viewabilityVendor : vastConfig.getViewabilityVendors()) {
                if (!TextUtils.isEmpty(viewabilityVendor.getVendorKey()) && !TextUtils.isEmpty(viewabilityVendor.getVerificationParameters())) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(viewabilityVendor.getVendorKey(), viewabilityVendor.getJavascriptResourceUrl(), viewabilityVendor.getVerificationParameters()));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(viewabilityVendor.getJavascriptResourceUrl()));
                }
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return AdSession.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, AdSessionContext.createNativeAdSessionContext(partnerCreatePartner, strZ, arrayList, null, str));
        } catch (Exception e10) {
            if (sVar != null) {
                sVar.w(e10.getMessage(), false);
            }
            e10.printStackTrace();
            return null;
        }
    }

    public static AdSession z(Context context, WebView webView, String str, CreativeType creativeType, s sVar) {
        try {
            z(context);
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, (creativeType == CreativeType.HTML_DISPLAY || creativeType == CreativeType.DEFINED_BY_JAVASCRIPT) ? Owner.NONE : owner, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner(com.taurusx.tax.z.f67753n, "1.12.2"), webView, null, str));
            adSessionCreateAdSession.registerAdView(webView);
            return adSessionCreateAdSession;
        } catch (Exception e10) {
            if (sVar != null) {
                sVar.w(e10.getMessage(), false);
            }
            e10.printStackTrace();
            return null;
        }
    }

    public static AdSession z(Context context, String str, CreativeType creativeType, VastConfig vastConfig, y.z zVar, s sVar) {
        try {
            ArrayList arrayList = new ArrayList();
            if (zVar != null && zVar.l() != null && zVar.l().size() > 0) {
                Iterator<String> it = zVar.l().iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject(it.next());
                    String strOptString = jSONObject.optString(com.taurusx.tax.w.o.z.f67404g0);
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.taurusx.tax.w.o.z.B);
                    String strOptString2 = jSONObjectOptJSONObject.optString(com.taurusx.tax.w.o.z.f67407h0);
                    String strOptString3 = jSONObjectOptJSONObject.optString(com.taurusx.tax.w.o.z.f67410i0);
                    if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3)) {
                        arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(strOptString2, new URL(strOptString), strOptString3));
                    } else {
                        arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(new URL(strOptString)));
                    }
                }
            }
            if (vastConfig != null) {
                for (ViewabilityVendor viewabilityVendor : vastConfig.getViewabilityVendors()) {
                    if (!TextUtils.isEmpty(viewabilityVendor.getVendorKey()) && !TextUtils.isEmpty(viewabilityVendor.getVerificationParameters())) {
                        arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(viewabilityVendor.getVendorKey(), viewabilityVendor.getJavascriptResourceUrl(), viewabilityVendor.getVerificationParameters()));
                    } else {
                        arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(viewabilityVendor.getJavascriptResourceUrl()));
                    }
                }
            }
            if (arrayList.size() == 0) {
                return null;
            }
            z(context);
            ImpressionType impressionType = creativeType == CreativeType.AUDIO ? ImpressionType.AUDIBLE : ImpressionType.VIEWABLE;
            Owner owner = Owner.NATIVE;
            return AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, (creativeType == CreativeType.HTML_DISPLAY || creativeType == CreativeType.NATIVE_DISPLAY) ? Owner.NONE : owner, false), AdSessionContext.createNativeAdSessionContext(Partner.createPartner(com.taurusx.tax.z.f67753n, "1.12.2"), w.z(context), arrayList, null, str));
        } catch (Exception e10) {
            if (sVar != null) {
                sVar.w(e10.getMessage(), false);
            }
            e10.printStackTrace();
            return null;
        }
    }

    public static void z(Context context) {
        Omid.activate(context.getApplicationContext());
    }

    public static void z(MediaEvents mediaEvents, AdSession adSession, s sVar) {
        if (mediaEvents == null || adSession == null) {
            return;
        }
        try {
            mediaEvents.adUserInteraction(InteractionType.CLICK);
        } catch (Exception e10) {
            if (sVar != null) {
                sVar.w(e10.getMessage(), false);
            }
            e10.printStackTrace();
        }
    }

    public static void z(MediaEvents mediaEvents, AdSession adSession, float f10, int i10, s sVar) {
        if (mediaEvents == null || adSession == null) {
            return;
        }
        try {
            mediaEvents.start(f10, i10);
        } catch (Exception e10) {
            if (sVar != null) {
                sVar.w(e10.getMessage(), false);
            }
            e10.printStackTrace();
        }
    }

    public static void z(MediaEvents mediaEvents, AdSession adSession, float f10, s sVar) {
        if (mediaEvents == null || adSession == null) {
            return;
        }
        try {
            mediaEvents.volumeChange(f10);
        } catch (Exception e10) {
            if (sVar != null) {
                sVar.w(e10.getMessage(), false);
            }
            e10.printStackTrace();
        }
    }

    public static void z(MediaEvents mediaEvents, s sVar) {
        if (mediaEvents != null) {
            try {
                mediaEvents.bufferFinish();
            } catch (Exception e10) {
                if (sVar != null) {
                    sVar.w(e10.getMessage(), false);
                }
                e10.printStackTrace();
            }
        }
    }

    public static void z(AdEvents adEvents, s sVar) {
        if (adEvents != null) {
            try {
                adEvents.impressionOccurred();
            } catch (Exception e10) {
                if (sVar != null) {
                    sVar.w(e10.getMessage(), false);
                }
                e10.printStackTrace();
            }
        }
    }

    public static void z(AdSession adSession, View view, s sVar) {
        if (adSession != null) {
            try {
                adSession.addFriendlyObstruction(view, FriendlyObstructionPurpose.OTHER, null);
            } catch (Exception e10) {
                if (sVar != null) {
                    sVar.w(e10.getMessage(), false);
                }
                e10.printStackTrace();
            }
        }
    }

    public static void z(AdSession adSession, ViewGroup viewGroup, s sVar) {
        if (adSession != null) {
            try {
                adSession.registerAdView(viewGroup);
            } catch (Exception e10) {
                if (sVar != null) {
                    sVar.w(e10.getMessage(), false);
                }
                e10.printStackTrace();
            }
        }
    }

    public static void z(AdEvents adEvents, VastProperties vastProperties, s sVar) {
        if (adEvents != null) {
            try {
                adEvents.loaded(vastProperties);
            } catch (Exception e10) {
                if (sVar != null) {
                    sVar.w(e10.getMessage(), false);
                }
                e10.printStackTrace();
            }
        }
    }

    public static AdEvents z(AdSession adSession, s sVar) {
        if (adSession == null) {
            return null;
        }
        try {
            return AdEvents.createAdEvents(adSession);
        } catch (Exception e10) {
            if (sVar != null) {
                sVar.w(e10.getMessage(), false);
            }
            e10.printStackTrace();
            return null;
        }
    }
}
