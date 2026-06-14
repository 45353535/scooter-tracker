package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class cw {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bw f109616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ cw[] f109617e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f109619c;

    static {
        cw[] cwVarArr = {new cw(0, "CONSENT_STRING", "IABConsent_ConsentString", "IABTCF_TCString"), new cw(1, "GDPR", "IABConsent_SubjectToGDPR", "IABTCF_gdprApplies"), new cw(2, "CMP_PRESENT", "IABConsent_CMPPresent", "IABTCF_CmpSdkID"), new cw(3, "PURPOSE_CONSENTS", "IABConsent_ParsedPurposeConsents", com.taurusx.tax.g.q.f66283m), new cw(4, "VENDOR_CONSENTS", "IABConsent_ParsedVendorConsents", com.taurusx.tax.g.q.f66284p), new cw(5, "ADDITIONAL_CONSENT", null, com.taurusx.tax.g.q.f66281i)};
        f109617e = cwVarArr;
        qf.a.a(cwVarArr);
        f109616d = new bw();
    }

    public cw(int i10, String str, String str2, String str3) {
        this.f109618b = str2;
        this.f109619c = str3;
    }

    public static cw valueOf(String str) {
        return (cw) Enum.valueOf(cw.class, str);
    }

    public static cw[] values() {
        return (cw[]) f109617e.clone();
    }
}
