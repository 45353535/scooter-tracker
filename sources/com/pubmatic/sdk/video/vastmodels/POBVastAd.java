package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.viewability.POBVerificationScriptResource;
import com.pubmatic.sdk.video.vastmodels.POBVastCreative;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;
import com.taurusx.tax.f.n;
import com.taurusx.tax.f.w;
import com.taurusx.tax.f.y;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes11.dex */
public class POBVastAd implements POBXMLNodeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private POBVastAdType f63237a = POBVastAdType.NO_ADS;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f63239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f63240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f63241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f63242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f63243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f63244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f63245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f63246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f63247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f63248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f63249m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f63250n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private POBVastCreative f63251o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f63252p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private POBVastAd f63253q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f63254r;

    public enum POBVastAdParameter {
        IMPRESSIONS,
        ERRORS,
        VIEWABLE_IMPRESSIONS,
        NOT_VIEWABLE_IMPRESSIONS,
        VIEW_UNDETERMINED_IMPRESSIONS,
        CLICKTRACKING,
        PROGRESS_TRACKING_EVENT,
        COMPANIONS,
        CLICK_THROUGH,
        ICON
    }

    public enum POBVastAdType {
        INLINE,
        WRAPPER,
        NO_ADS
    }

    class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBVastCreative.POBEventTypes f63257a;

        a(POBVastCreative.POBEventTypes pOBEventTypes) {
            this.f63257a = pOBEventTypes;
        }

        @Override // com.pubmatic.sdk.video.vastmodels.POBVastAd.g
        public List a(POBVastAd pOBVastAd) {
            if (pOBVastAd.getCreative() != null) {
                return pOBVastAd.getCreative().getTrackingEventUrls(this.f63257a);
            }
            return null;
        }
    }

    class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBVastAdParameter f63259a;

        b(POBVastAdParameter pOBVastAdParameter) {
            this.f63259a = pOBVastAdParameter;
        }

        @Override // com.pubmatic.sdk.video.vastmodels.POBVastAd.g
        public List a(POBVastAd pOBVastAd) {
            return pOBVastAd.a(pOBVastAd, this.f63259a);
        }
    }

    class c implements g {
        c() {
        }

        @Override // com.pubmatic.sdk.video.vastmodels.POBVastAd.g
        public List a(POBVastAd pOBVastAd) {
            return pOBVastAd.getCompanions();
        }
    }

    class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBVastAdParameter f63262a;

        d(POBVastAdParameter pOBVastAdParameter) {
            this.f63262a = pOBVastAdParameter;
        }

        @Override // com.pubmatic.sdk.video.vastmodels.POBVastAd.g
        public List a(POBVastAd pOBVastAd) {
            List listB = pOBVastAd.b(pOBVastAd, this.f63262a);
            if (listB != null) {
                return new ArrayList(listB);
            }
            return null;
        }
    }

    class e implements g {
        e() {
        }

        @Override // com.pubmatic.sdk.video.vastmodels.POBVastAd.g
        public List a(POBVastAd pOBVastAd) {
            if (pOBVastAd.getAdVerification() != null) {
                return new ArrayList(pOBVastAd.getAdVerification());
            }
            return null;
        }
    }

    static /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63265a;

        static {
            int[] iArr = new int[POBVastAdParameter.values().length];
            f63265a = iArr;
            try {
                iArr[POBVastAdParameter.CLICK_THROUGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63265a[POBVastAdParameter.ICON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63265a[POBVastAdParameter.IMPRESSIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63265a[POBVastAdParameter.ERRORS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63265a[POBVastAdParameter.VIEWABLE_IMPRESSIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63265a[POBVastAdParameter.NOT_VIEWABLE_IMPRESSIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f63265a[POBVastAdParameter.VIEW_UNDETERMINED_IMPRESSIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f63265a[POBVastAdParameter.CLICKTRACKING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f63265a[POBVastAdParameter.PROGRESS_TRACKING_EVENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f63265a[POBVastAdParameter.COMPANIONS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private interface g {
        List a(POBVastAd pOBVastAd);
    }

    private Object c(POBVastAd pOBVastAd, POBVastAdParameter pOBVastAdParameter) {
        List<POBIcon> iconList;
        POBVastCreative creative = pOBVastAd.getCreative();
        int i10 = f.f63265a[pOBVastAdParameter.ordinal()];
        if (i10 != 1) {
            if (i10 == 2 && creative != null && creative.getVastCreativeType() == POBVastCreative.CreativeType.LINEAR && (iconList = ((POBLinear) creative).getIconList()) != null && iconList.size() > 0) {
                return iconList.get(0);
            }
        } else if (creative != null) {
            return creative.getClickThroughURL();
        }
        return null;
    }

    @Override // com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        String nodeValue;
        if (pOBNodeBuilder.getNodeName() != null) {
            if (pOBNodeBuilder.getNodeName().equals(w.f66048w)) {
                this.f63237a = POBVastAdType.INLINE;
            } else if (pOBNodeBuilder.getNodeName().equals(w.f66049y)) {
                this.f63237a = POBVastAdType.WRAPPER;
            }
        }
        try {
            Node node = pOBNodeBuilder.getNode("/VAST/Ad");
            if (node != null && (nodeValue = node.getAttributes().getNamedItem(w.f66047c).getNodeValue()) != null) {
                this.f63244h = Integer.parseInt(nodeValue);
            }
        } catch (Exception unused) {
            POBLog.error("POBVastAd", "Unable to find Vast ad sequence due to invalid value", new Object[0]);
        }
        if (this.f63244h < 1) {
            this.f63244h = -1;
        }
        this.f63238b = pOBNodeBuilder.getNodeValue("AdSystem");
        this.f63239c = pOBNodeBuilder.getNodeValue("AdTitle");
        this.f63240d = pOBNodeBuilder.getNodeValue("AdServingId");
        this.f63241e = pOBNodeBuilder.getNodeValue("Description");
        this.f63242f = pOBNodeBuilder.getNodeValue("Pricing");
        this.f63243g = POBUtils.getIntegerValue(pOBNodeBuilder.getNodeValue("Expires"));
        this.f63245i = pOBNodeBuilder.getStringList("Error");
        this.f63246j = pOBNodeBuilder.getNodeValue(n.f66007g);
        this.f63247k = pOBNodeBuilder.getStringList(y.f66057w);
        this.f63248l = pOBNodeBuilder.getStringList("ViewableImpression/Viewable");
        this.f63249m = pOBNodeBuilder.getStringList("ViewableImpression/NotViewable");
        this.f63250n = pOBNodeBuilder.getStringList("ViewableImpression/ViewUndetermined");
        POBVastCreative pOBVastCreative = (POBVastCreative) pOBNodeBuilder.getNodeObject("Creatives/Creative/Linear", POBLinear.class);
        this.f63251o = pOBVastCreative;
        if (pOBVastCreative == null) {
            this.f63251o = (POBVastCreative) pOBNodeBuilder.getNodeObject("Creatives/Creative/NonLinearAds/NonLinear", POBNonLinear.class);
        }
        this.f63252p = pOBNodeBuilder.getObjectList("Creatives/Creative/CompanionAds/Companion", POBCompanion.class);
        List objectList = pOBNodeBuilder.getObjectList("AdVerifications/Verification", POBAdVerification.class);
        this.f63254r = objectList;
        if (objectList == null || objectList.isEmpty()) {
            this.f63254r = pOBNodeBuilder.getObjectList("Extensions/Extension/AdVerifications/Verification", POBAdVerification.class);
        }
    }

    public int getAdSequence() {
        return this.f63244h;
    }

    @Nullable
    public String getAdServingId() {
        return this.f63240d;
    }

    @Nullable
    public String getAdSystem() {
        return this.f63238b;
    }

    @Nullable
    public String getAdTitle() {
        return this.f63239c;
    }

    @Nullable
    public POBVastAdType getAdType() {
        return this.f63237a;
    }

    @Nullable
    public List<POBAdVerification> getAdVerification() {
        return this.f63254r;
    }

    @Nullable
    public String getClosestClickThroughURL() {
        return (String) a(POBVastAdParameter.CLICK_THROUGH);
    }

    @Nullable
    public POBIcon getClosestIcon() {
        return (POBIcon) a(POBVastAdParameter.ICON);
    }

    @Nullable
    public List<POBCompanion> getCombinedCompanions() {
        return a(this, new c());
    }

    @NonNull
    public List<String> getCombinedList(@NonNull POBVastAdParameter pOBVastAdParameter) {
        return a(this, new b(pOBVastAdParameter));
    }

    public List<POBXMLNodeListener> getCombinedObjectList(@NonNull POBVastAdParameter pOBVastAdParameter) {
        return a(this, new d(pOBVastAdParameter));
    }

    @NonNull
    public List<String> getCombinedTrackingEventList(@NonNull POBVastCreative.POBEventTypes pOBEventTypes) {
        return a(this, new a(pOBEventTypes));
    }

    public List<POBVerificationScriptResource> getCombinedVerificationList() {
        return a(this, new e());
    }

    @Nullable
    public List<POBCompanion> getCompanions() {
        return this.f63252p;
    }

    @Nullable
    public POBVastCreative getCreative() {
        return this.f63251o;
    }

    @Nullable
    public String getDescription() {
        return this.f63241e;
    }

    @Nullable
    public List<String> getErrorURLs() {
        return this.f63245i;
    }

    public int getExpires() {
        return this.f63243g;
    }

    @Nullable
    public List<String> getImpressions() {
        return this.f63247k;
    }

    @Nullable
    public List<String> getNotViewableImpressions() {
        return this.f63249m;
    }

    @Nullable
    public String getPricing() {
        return this.f63242f;
    }

    @Nullable
    public String getVASTAdTagURI() {
        return this.f63246j;
    }

    @Nullable
    public List<String> getViewUndeterminedImpressions() {
        return this.f63250n;
    }

    @Nullable
    public List<String> getViewableImpressions() {
        return this.f63248l;
    }

    @Nullable
    public POBVastAd getWrapper() {
        return this.f63253q;
    }

    public void setWrapper(@Nullable POBVastAd pOBVastAd) {
        this.f63253q = pOBVastAd;
    }

    private Object a(POBVastAdParameter pOBVastAdParameter) {
        for (POBVastAd wrapper = this; wrapper != null; wrapper = wrapper.getWrapper()) {
            Object objC = c(wrapper, pOBVastAdParameter);
            if (objC != null) {
                return objC;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List b(POBVastAd pOBVastAd, POBVastAdParameter pOBVastAdParameter) {
        int i10 = f.f63265a[pOBVastAdParameter.ordinal()];
        if (i10 != 9) {
            if (i10 != 10) {
                return null;
            }
            return pOBVastAd.getCompanions();
        }
        if (pOBVastAd.getCreative() != null) {
            return pOBVastAd.getCreative().getTrackingEvents(POBVastCreative.POBEventTypes.PROGRESS);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a(POBVastAd pOBVastAd, POBVastAdParameter pOBVastAdParameter) {
        switch (f.f63265a[pOBVastAdParameter.ordinal()]) {
            case 3:
                return pOBVastAd.getImpressions();
            case 4:
                return pOBVastAd.getErrorURLs();
            case 5:
                return pOBVastAd.getViewableImpressions();
            case 6:
                return pOBVastAd.getNotViewableImpressions();
            case 7:
                return pOBVastAd.getViewUndeterminedImpressions();
            case 8:
                ArrayList arrayList = new ArrayList();
                POBVastCreative creative = pOBVastAd.getCreative();
                if (creative != null && creative.getClickTrackers() != null) {
                    arrayList.addAll(creative.getClickTrackers());
                }
                return arrayList;
            default:
                return null;
        }
    }

    private List a(POBVastAd pOBVastAd, g gVar) {
        ArrayList arrayList = new ArrayList();
        while (pOBVastAd != null) {
            List listA = gVar.a(pOBVastAd);
            if (listA != null) {
                arrayList.addAll(listA);
            }
            pOBVastAd = pOBVastAd.getWrapper();
        }
        return arrayList;
    }
}
