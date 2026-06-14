package f1;

import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.AdSessionConfiguration;
import com.iab.omid.library.chartboost.adsession.AdSessionContext;
import com.iab.omid.library.chartboost.adsession.CreativeType;
import com.iab.omid.library.chartboost.adsession.ImpressionType;
import com.iab.omid.library.chartboost.adsession.Owner;
import com.iab.omid.library.chartboost.adsession.Partner;
import com.iab.omid.library.chartboost.adsession.VerificationScriptResource;
import com.iab.omid.library.chartboost.adsession.media.MediaEvents;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b6 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AdSession f69434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AdEvents f69435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public MediaEvents f69436c;

        public a(AdSession adSession, AdEvents adEvents, MediaEvents mediaEvents) {
            this.f69434a = adSession;
            this.f69435b = adEvents;
            this.f69436c = mediaEvents;
        }

        public final MediaEvents a() {
            return this.f69436c;
        }

        public final void b(AdEvents adEvents) {
            this.f69435b = adEvents;
        }

        public final void c(AdSession adSession) {
            this.f69434a = adSession;
        }

        public final AdEvents d() {
            return this.f69435b;
        }

        public final AdSession e() {
            return this.f69434a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f69434a, aVar.f69434a) && Intrinsics.areEqual(this.f69435b, aVar.f69435b) && Intrinsics.areEqual(this.f69436c, aVar.f69436c);
        }

        public int hashCode() {
            AdSession adSession = this.f69434a;
            int iHashCode = (adSession == null ? 0 : adSession.hashCode()) * 31;
            AdEvents adEvents = this.f69435b;
            int iHashCode2 = (iHashCode + (adEvents == null ? 0 : adEvents.hashCode())) * 31;
            MediaEvents mediaEvents = this.f69436c;
            return iHashCode2 + (mediaEvents != null ? mediaEvents.hashCode() : 0);
        }

        public String toString() {
            return "OMSessionHolder(omSession=" + this.f69434a + ", omAdEvents=" + this.f69435b + ", mediaEvents=" + this.f69436c + ")";
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69437a;

        static {
            int[] iArr = new int[a6.values().length];
            try {
                iArr[a6.f69372c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a6.f69373d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a6.f69374e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a6.f69375f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a6.f69376g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f69437a = iArr;
        }
    }

    public final AdSessionConfiguration a(a6 a6Var) {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(j(a6Var), ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, k(a6Var), false);
        } catch (IllegalArgumentException e10) {
            eg.d("buildAdSessionVideoConfig error", e10);
            return null;
        }
    }

    public final AdSessionContext b(Partner partner, l4 l4Var) {
        try {
            return AdSessionContext.createHtmlAdSessionContext(partner, l4Var, null, null);
        } catch (IllegalArgumentException e10) {
            eg.d("buildHtmlContext error", e10);
            return null;
        }
    }

    public final AdSessionContext c(Partner partner, String str, List list, boolean z10, List list2) {
        try {
            return AdSessionContext.createNativeAdSessionContext(partner, str, i(list, list2, z10), null, null);
        } catch (IllegalArgumentException e10) {
            eg.d("buildNativeContext error", e10);
            return null;
        }
    }

    public final AdSessionContext d(Partner partner, String str, List list, boolean z10, List list2, a6 a6Var, l4 l4Var) {
        return a6Var == a6.f69373d ? b(partner, l4Var) : c(partner, str, list, z10, list2);
    }

    public final MediaEvents e(a6 a6Var, AdSession adSession) {
        if (a6Var == a6.f69373d) {
            return null;
        }
        return MediaEvents.createMediaEvents(adSession);
    }

    public final a f(l4 webView, a6 mtype, Partner partner, String str, List verificationScriptResourcesList, boolean z10, List verificationListConfig) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(verificationScriptResourcesList, "verificationScriptResourcesList");
        Intrinsics.checkNotNullParameter(verificationListConfig, "verificationListConfig");
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(a(mtype), d(partner, str, verificationScriptResourcesList, z10, verificationListConfig, mtype, webView));
            adSessionCreateAdSession.registerAdView(webView);
            AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSessionCreateAdSession);
            Intrinsics.checkNotNull(adSessionCreateAdSession);
            return new a(adSessionCreateAdSession, adEventsCreateAdEvents, e(mtype, adSessionCreateAdSession));
        } catch (Exception e10) {
            eg.i("OMSDK create session exception", e10);
            return null;
        }
    }

    public final URL g(String str) {
        try {
            return new URL(str);
        } catch (Exception e10) {
            eg.d("buildVerificationResources invalid url", e10);
            return null;
        }
    }

    public final List h(List list) {
        try {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j8 j8Var = (j8) it.next();
                arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(j8Var.c(), g(j8Var.b()), j8Var.a()));
            }
            return arrayList;
        } catch (Exception e10) {
            eg.d("buildVerificationResources error", e10);
            return CollectionsKt.emptyList();
        }
    }

    public final List i(List list, List list2, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (z10) {
            arrayList.addAll(h(list2));
        }
        arrayList.addAll(list);
        return arrayList;
    }

    public final CreativeType j(a6 a6Var) {
        int i10 = b.f69437a[a6Var.ordinal()];
        if (i10 == 1) {
            return CreativeType.NATIVE_DISPLAY;
        }
        if (i10 == 2) {
            return CreativeType.HTML_DISPLAY;
        }
        if (i10 == 3) {
            return CreativeType.VIDEO;
        }
        if (i10 == 4) {
            return CreativeType.AUDIO;
        }
        if (i10 == 5) {
            return CreativeType.NATIVE_DISPLAY;
        }
        throw new lf.m();
    }

    public final Owner k(a6 a6Var) {
        int i10 = b.f69437a[a6Var.ordinal()];
        if (i10 == 1) {
            return Owner.NATIVE;
        }
        if (i10 == 2) {
            return Owner.NONE;
        }
        if (i10 == 3) {
            return Owner.NATIVE;
        }
        if (i10 == 4) {
            return Owner.NATIVE;
        }
        if (i10 == 5) {
            return Owner.NATIVE;
        }
        throw new lf.m();
    }
}
