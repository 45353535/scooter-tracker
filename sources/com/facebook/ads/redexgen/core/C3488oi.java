package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3488oi implements C1S {
    public final C3492om A00;

    @Deprecated
    public final C19439r A01;
    public final C3490ok A02;
    public final C2Q A03;

    @Deprecated
    public final C3489oj A04;
    public final C3486og A05;
    public final String A06;
    public static String[] A07 = {"wAM8vtdO0lmHfSdh0aX8JSKdnwpCp9D2", "", "J6SB4ddL0FfEeVIHYuGnUGetWM2QRdUO", "0HTq7SjPEUFdYYph8tikUta3pLjb69Rn", "wGA6vSFg01QHk42FD2L8p637KRkqAXcn", "9eG6h6QaFREs2gWO0", "Z5vutuZNVsi2rK7c87KXUNl8wBJYnGEL", "V2BGt2aUfGoyLxnwwGFsOMeTNor3H3xe"};
    public static final C3488oi A09 = new C2I().A05();
    public static final C1R<C3488oi> A08 = new C1R() { // from class: com.facebook.ads.redexgen.X.oo
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C3488oi.A00(bundle);
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C3488oi A00(Bundle bundle) {
        String str = (String) C3M.A01(bundle.getString(A02(0), ""));
        Bundle bundle2 = bundle.getBundle(A02(1));
        C3490ok c3490ok = bundle2 == null ? C3490ok.A07 : (C3490ok) C3490ok.A06.A6X(bundle2);
        Bundle bundle3 = bundle.getBundle(A02(2));
        C3486og c3486og = bundle3 == null ? C3486og.A0Z : (C3486og) C3486og.A0Y.A6X(bundle3);
        Bundle bundle4 = bundle.getBundle(A02(3));
        return new C3488oi(str, bundle4 == null ? C19439r.A00 : (C19439r) C3492om.A05.A6X(bundle4), null, c3490ok, c3486og);
    }

    public C3488oi(String str, C19439r c19439r, C3489oj c3489oj, C3490ok c3490ok, C3486og c3486og) {
        this.A06 = str;
        this.A03 = c3489oj;
        this.A04 = c3489oj;
        this.A02 = c3490ok;
        this.A05 = c3486og;
        this.A00 = c19439r;
        this.A01 = c19439r;
    }

    public static String A02(int i10) {
        return Integer.toString(i10, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3488oi)) {
            return false;
        }
        C3488oi c3488oi = (C3488oi) obj;
        if (AbstractC18094a.A1E(this.A06, c3488oi.A06)) {
            C3492om c3492om = this.A00;
            C3492om c3492om2 = c3488oi.A00;
            String[] strArr = A07;
            if (strArr[7].charAt(22) != strArr[2].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[7] = "WE1TlvFnuMEFfhCqOSZQGPel0cAOxnij";
            strArr2[2] = "QIjSvgjDyRqWUwkha5pDZVewjWBdao8T";
            if (c3492om.equals(c3492om2) && AbstractC18094a.A1E(this.A03, c3488oi.A03) && AbstractC18094a.A1E(this.A02, c3488oi.A02) && AbstractC18094a.A1E(this.A05, c3488oi.A05)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A06.hashCode();
        int i10 = result * 31;
        int result2 = this.A03 != null ? this.A03.hashCode() : 0;
        int iHashCode = (((i10 + result2) * 31) + this.A02.hashCode()) * 31;
        C3492om c3492om = this.A00;
        String[] strArr = A07;
        String str = strArr[4];
        String str2 = strArr[3];
        int iCharAt = str.charAt(31);
        int result3 = str2.charAt(31);
        if (iCharAt != result3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[7] = "oKnJE1KY80M0C2djBAWfSHeSjkObNKTB";
        strArr2[2] = "bdrBBUaZbF1SVnsIGw0ZL6eMFfyDgZAn";
        int result4 = c3492om.hashCode();
        return ((iHashCode + result4) * 31) + this.A05.hashCode();
    }
}
