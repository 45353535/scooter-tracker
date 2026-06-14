package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.Partner;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.inmobi.media.core.config.models.AdConfig;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes9.dex */
public abstract class W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Partner f37923a;

    static {
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        String partnerKey = ((AdConfig) Y3.f38021a.a(AdConfig.class)).getViewability().getOmidConfig().getPartnerKey();
        if (partnerKey.length() == 0) {
            partnerKey = "Inmobi";
        }
        Partner partnerCreatePartner = Partner.createPartner(partnerKey, a());
        Intrinsics.checkNotNullExpressionValue(partnerCreatePartner, "createPartner(...)");
        f37923a = partnerCreatePartner;
    }

    public static AdSessionContext a(String omsdkScript, List adVerifications, Map macros, String str, String customReferenceData) {
        VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithoutParameters;
        Intrinsics.checkNotNullParameter(omsdkScript, "omsdkScript");
        Intrinsics.checkNotNullParameter(adVerifications, "omidTrackers");
        Intrinsics.checkNotNullParameter(macros, "macros");
        Intrinsics.checkNotNullParameter(customReferenceData, "customReferenceData");
        Intrinsics.checkNotNullParameter(adVerifications, "adVerifications");
        Intrinsics.checkNotNullParameter(macros, "macros");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(adVerifications, 10));
        Iterator it = adVerifications.iterator();
        while (it.hasNext()) {
            C4208zf c4208zf = (C4208zf) it.next();
            try {
                String str2 = c4208zf.f39774a;
                if (macros != null) {
                    String strW = str2;
                    for (Map.Entry entry : macros.entrySet()) {
                        strW = StringsKt.W(strW, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
                    }
                    str2 = strW;
                }
                URL url = new URL(str2);
                String str3 = c4208zf.f40052c;
                String str4 = c4208zf.f40053d;
                verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = (str3.length() <= 0 || !F3.a(str4)) ? VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url) : VerificationScriptResource.createVerificationScriptResourceWithParameters(str3, url, str4);
            } catch (MalformedURLException unused) {
                verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = null;
            }
            arrayList.add(verificationScriptResourceCreateVerificationScriptResourceWithoutParameters);
        }
        AdSessionContext adSessionContextCreateNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(f37923a, omsdkScript, CollectionsKt.filterNotNull(arrayList), str, customReferenceData);
        Intrinsics.checkNotNullExpressionValue(adSessionContextCreateNativeAdSessionContext, "createNativeAdSessionContext(...)");
        return adSessionContextCreateNativeAdSessionContext;
    }

    public static String a() {
        return "a" + StringsKt.W("11.1.0", ".", "", false, 4, null);
    }
}
