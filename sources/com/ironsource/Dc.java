package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class Dc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f40604d = "Ironsrc";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f40605e = "7";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f40606f = Omid.getVersion();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f40607g = "omidVersion";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f40608h = "omidPartnerName";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f40609i = "omidPartnerVersion";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f40610j = "omidActiveAdSessions";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f40611k = "Invalid OMID impressionOwner";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f40612l = "Invalid OMID videoEventsOwner";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f40613m = "Missing OMID impressionOwner";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f40614n = "Missing OMID videoEventsOwner";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f40615o = "OMID has not been activated";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f40616p = "Missing OMID creativeType";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f40617q = "Missing adview id in OMID params";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f40618r = "No adview found with the provided adViewId";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f40619s = "OMID Session has already started";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f40620t = "OMID Session has not started";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Partner f40621a = Partner.createPartner(f40604d, "7");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40623c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, AdSession> f40622b = new HashMap<>();

    static class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f40624i = "isolateVerificationScripts";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f40625j = "impressionOwner";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f40626k = "videoEventsOwner";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f40627l = "customReferenceData";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f40628m = "creativeType";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f40629n = "impressionType";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f40630o = "adViewId";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f40631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Owner f40632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Owner f40633c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f40634d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ImpressionType f40635e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CreativeType f40636f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f40637g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Owner f40638h;

        public static a a(JSONObject jSONObject) throws IllegalArgumentException {
            a aVar = new a();
            aVar.f40631a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String strOptString = jSONObject.optString("impressionOwner", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(Dc.f40613m);
            }
            try {
                aVar.f40632b = Owner.valueOf(strOptString.toUpperCase(Locale.getDefault()));
                String strOptString2 = jSONObject.optString("videoEventsOwner", "");
                if (TextUtils.isEmpty(strOptString)) {
                    throw new IllegalArgumentException(Dc.f40614n);
                }
                try {
                    aVar.f40633c = Owner.valueOf(strOptString2.toUpperCase(Locale.getDefault()));
                    aVar.f40634d = jSONObject.optString("customReferenceData", "");
                    aVar.f40636f = b(jSONObject);
                    aVar.f40635e = c(jSONObject);
                    aVar.f40637g = e(jSONObject);
                    aVar.f40638h = d(jSONObject);
                    return aVar;
                } catch (IllegalArgumentException e10) {
                    C4462o4.d().a(e10);
                    throw new IllegalArgumentException("Invalid OMID videoEventsOwner " + strOptString2);
                }
            } catch (IllegalArgumentException e11) {
                C4462o4.d().a(e11);
                throw new IllegalArgumentException("Invalid OMID impressionOwner " + strOptString);
            }
        }

        private static CreativeType b(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("creativeType", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(Dc.f40616p + strOptString);
            }
            for (CreativeType creativeType : CreativeType.values()) {
                if (strOptString.equalsIgnoreCase(creativeType.toString())) {
                    return creativeType;
                }
            }
            throw new IllegalArgumentException(Dc.f40616p + strOptString);
        }

        private static ImpressionType c(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("impressionType", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(Dc.f40616p + strOptString);
            }
            for (ImpressionType impressionType : ImpressionType.values()) {
                if (strOptString.equalsIgnoreCase(impressionType.toString())) {
                    return impressionType;
                }
            }
            throw new IllegalArgumentException(Dc.f40616p + strOptString);
        }

        private static Owner d(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("videoEventsOwner", "");
            Owner owner = Owner.NONE;
            try {
                return Owner.valueOf(strOptString.toUpperCase(Locale.getDefault()));
            } catch (IllegalArgumentException e10) {
                C4462o4.d().a(e10);
                return owner;
            }
        }

        private static String e(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(strOptString)) {
                return strOptString;
            }
            throw new IllegalArgumentException(Dc.f40617q + strOptString);
        }
    }

    public void a(Context context) throws IllegalArgumentException {
        if (this.f40623c) {
            return;
        }
        Omid.activate(context);
        this.f40623c = true;
    }

    public void b(JSONObject jSONObject) throws IllegalStateException {
        a(jSONObject);
        String strOptString = jSONObject.optString("adViewId");
        AdSession adSession = this.f40622b.get(strOptString);
        if (adSession == null) {
            throw new IllegalStateException(f40620t);
        }
        adSession.finish();
        this.f40622b.remove(strOptString);
    }

    public void c(JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        a(jSONObject);
        AdSession adSession = this.f40622b.get(jSONObject.optString("adViewId"));
        if (adSession == null) {
            throw new IllegalStateException(f40620t);
        }
        AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
        if (jSONObject.optBoolean("signalLoaded")) {
            adEventsCreateAdEvents.loaded();
        }
        adEventsCreateAdEvents.impressionOccurred();
    }

    public void d(JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        a(a.a(jSONObject));
    }

    public Yd a() {
        Yd yd2 = new Yd();
        yd2.b(f40607g, SDKUtils.encodeString(f40606f));
        yd2.b("omidPartnerName", SDKUtils.encodeString(f40604d));
        yd2.b("omidPartnerVersion", SDKUtils.encodeString("7"));
        yd2.b(f40610j, SDKUtils.encodeString(Arrays.toString(this.f40622b.keySet().toArray())));
        return yd2;
    }

    public void a(a aVar) throws IllegalStateException, IllegalArgumentException {
        if (this.f40623c) {
            if (!TextUtils.isEmpty(aVar.f40637g)) {
                String str = aVar.f40637g;
                if (!this.f40622b.containsKey(str)) {
                    H8 h8A = C4449n8.a().a(str);
                    if (h8A != null) {
                        AdSession adSessionA = a(aVar, h8A);
                        adSessionA.start();
                        this.f40622b.put(str, adSessionA);
                        return;
                    }
                    throw new IllegalStateException(f40618r);
                }
                throw new IllegalStateException(f40619s);
            }
            throw new IllegalStateException(f40617q);
        }
        throw new IllegalStateException(f40615o);
    }

    private AdSession a(a aVar, H8 h82) throws IllegalArgumentException {
        AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(aVar.f40636f, aVar.f40635e, aVar.f40632b, aVar.f40633c, aVar.f40631a), AdSessionContext.createHtmlAdSessionContext(this.f40621a, h82.getPresentingView(), null, aVar.f40634d));
        adSessionCreateAdSession.registerAdView(h82.getPresentingView());
        return adSessionCreateAdSession;
    }

    private void a(JSONObject jSONObject) throws IllegalStateException {
        if (!this.f40623c) {
            throw new IllegalStateException(f40615o);
        }
        if (jSONObject == null) {
            throw new IllegalStateException(f40620t);
        }
    }
}
