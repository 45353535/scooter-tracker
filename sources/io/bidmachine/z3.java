package io.bidmachine;

import android.content.Context;
import com.mobilefuse.sdk.privacy.IabString;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
interface z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f82033a = {"IABConsent_SubjectToGDPR", "IABTCF_gdprApplies", "IABConsent_ConsentString", "IABTCF_TCString", IabString.IAB_US_PRIVACY_STRING, "IABGPP_HDR_GppString", com.taurusx.tax.g.q.f66282l};

    String a();

    Boolean b();

    String c();

    Boolean d();

    String e();

    List f();

    String getUSPrivacyString();

    void initialize(Context context);
}
