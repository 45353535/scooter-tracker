package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.mobilefuse.sdk.privacy.IabString;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
class a4 implements z3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f79184b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f79185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f79186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f79187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f79188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f79189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f79190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f79191i;

    class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            a4.this.l(sharedPreferences, str);
        }
    }

    a4() {
    }

    private void h(SharedPreferences sharedPreferences) {
        this.f79187e = pd.y.e(sharedPreferences, "IABConsent_ConsentString", null);
    }

    private void i(SharedPreferences sharedPreferences) {
        String strE = pd.y.e(sharedPreferences, "IABConsent_SubjectToGDPR", null);
        this.f79185c = strE != null ? Boolean.valueOf(strE.equals("1")) : null;
    }

    private void j(SharedPreferences sharedPreferences) {
        String strE = pd.y.e(sharedPreferences, com.taurusx.tax.g.q.f66282l, null);
        if (TextUtils.isEmpty(strE)) {
            this.f79191i = null;
            return;
        }
        try {
            String[] strArrSplit = strE.split("_");
            if (strArrSplit.length == 0) {
                this.f79191i = null;
                return;
            }
            this.f79191i = new ArrayList();
            for (String str : strArrSplit) {
                Integer numB0 = io.bidmachine.core.h.b0(str, null);
                if (numB0 != null) {
                    this.f79191i.add(numB0);
                }
            }
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
            this.f79191i = null;
        }
    }

    private void k(SharedPreferences sharedPreferences) {
        this.f79190h = pd.y.e(sharedPreferences, "IABGPP_HDR_GppString", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(SharedPreferences sharedPreferences, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "IABTCF_gdprApplies":
                m(sharedPreferences);
                break;
            case "IABGPP_GppSID":
                j(sharedPreferences);
                break;
            case "IABUSPrivacy_String":
                o(sharedPreferences);
                break;
            case "IABConsent_ConsentString":
                h(sharedPreferences);
                break;
            case "IABTCF_TCString":
                n(sharedPreferences);
                break;
            case "IABConsent_SubjectToGDPR":
                i(sharedPreferences);
                break;
            case "IABGPP_HDR_GppString":
                k(sharedPreferences);
                break;
        }
    }

    private void m(SharedPreferences sharedPreferences) {
        int iC = pd.y.c(sharedPreferences, "IABTCF_gdprApplies", -1);
        if (iC == 1) {
            this.f79186d = Boolean.TRUE;
        } else if (iC == 0) {
            this.f79186d = Boolean.FALSE;
        } else {
            this.f79186d = null;
        }
    }

    private void n(SharedPreferences sharedPreferences) {
        this.f79188f = pd.y.e(sharedPreferences, "IABTCF_TCString", null);
    }

    private void o(SharedPreferences sharedPreferences) {
        this.f79189g = pd.y.e(sharedPreferences, IabString.IAB_US_PRIVACY_STRING, null);
    }

    @Override // io.bidmachine.z3
    public String a() {
        return this.f79190h;
    }

    @Override // io.bidmachine.z3
    public Boolean b() {
        return this.f79186d;
    }

    @Override // io.bidmachine.z3
    public String c() {
        return this.f79188f;
    }

    @Override // io.bidmachine.z3
    public Boolean d() {
        return this.f79185c;
    }

    @Override // io.bidmachine.z3
    public String e() {
        return this.f79187e;
    }

    @Override // io.bidmachine.z3
    public List f() {
        return this.f79191i;
    }

    @Override // io.bidmachine.z3
    public String getUSPrivacyString() {
        return this.f79189g;
    }

    @Override // io.bidmachine.z3
    public void initialize(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this.f79184b);
        for (String str : z3.f82033a) {
            l(defaultSharedPreferences, str);
        }
    }
}
