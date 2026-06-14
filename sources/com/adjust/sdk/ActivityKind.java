package com.adjust.sdk;

import com.ironsource.C4257c4;

/* JADX INFO: loaded from: classes5.dex */
public enum ActivityKind {
    UNKNOWN,
    SESSION,
    EVENT,
    CLICK,
    ATTRIBUTION,
    REVENUE,
    REATTRIBUTION,
    INFO,
    GDPR,
    AD_REVENUE,
    DISABLE_THIRD_PARTY_SHARING,
    SUBSCRIPTION,
    THIRD_PARTY_SHARING,
    MEASUREMENT_CONSENT,
    PURCHASE_VERIFICATION;

    /* JADX INFO: renamed from: com.adjust.sdk.ActivityKind$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7036a;

        static {
            int[] iArr = new int[ActivityKind.values().length];
            f7036a = iArr;
            try {
                iArr[ActivityKind.SESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7036a[ActivityKind.EVENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7036a[ActivityKind.CLICK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7036a[ActivityKind.ATTRIBUTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7036a[ActivityKind.INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7036a[ActivityKind.GDPR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7036a[ActivityKind.AD_REVENUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7036a[ActivityKind.SUBSCRIPTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7036a[ActivityKind.THIRD_PARTY_SHARING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7036a[ActivityKind.MEASUREMENT_CONSENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7036a[ActivityKind.PURCHASE_VERIFICATION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static ActivityKind fromString(String str) {
        return com.taurusx.tax.g.b.f66095s.equals(str) ? SESSION : "event".equals(str) ? EVENT : "click".equals(str) ? CLICK : C4257c4.f42799c.equals(str) ? ATTRIBUTION : "info".equals(str) ? INFO : "gdpr".equals(str) ? GDPR : "ad_revenue".equals(str) ? AD_REVENUE : "subscription".equals(str) ? SUBSCRIPTION : "third_party_sharing".equals(str) ? THIRD_PARTY_SHARING : "measurement_consent".equals(str) ? MEASUREMENT_CONSENT : "purchase_verification".equals(str) ? PURCHASE_VERIFICATION : UNKNOWN;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.f7036a[ordinal()]) {
            case 1:
                return com.taurusx.tax.g.b.f66095s;
            case 2:
                return "event";
            case 3:
                return "click";
            case 4:
                return C4257c4.f42799c;
            case 5:
                return "info";
            case 6:
                return "gdpr";
            case 7:
                return "ad_revenue";
            case 8:
                return "subscription";
            case 9:
                return "third_party_sharing";
            case 10:
                return "measurement_consent";
            case 11:
                return "purchase_verification";
            default:
                return "unknown";
        }
    }
}
