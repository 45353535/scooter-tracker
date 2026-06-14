package com.applovin.impl;

/* JADX INFO: loaded from: classes6.dex */
public class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10078d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10081c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f10082d;

        a() {
        }

        public p2 a() {
            return new p2(this.f10079a, this.f10080b, this.f10081c, this.f10082d);
        }

        public a b(int i10) {
            this.f10081c = i10;
            return this;
        }

        public String toString() {
            return "LicenseVerificationObject.LicenseVerificationObjectBuilder(signedData=" + this.f10079a + ", signature=" + this.f10080b + ", responseCode=" + this.f10081c + ", nonce=" + this.f10082d + ")";
        }

        public a a(int i10) {
            this.f10082d = i10;
            return this;
        }

        public a b(String str) {
            this.f10079a = str;
            return this;
        }

        public a a(String str) {
            this.f10080b = str;
            return this;
        }
    }

    p2(String str, String str2, int i10, int i11) {
        this.f10075a = str;
        this.f10076b = str2;
        this.f10077c = i10;
        this.f10078d = i11;
    }

    protected boolean a(Object obj) {
        return obj instanceof p2;
    }

    public int b() {
        return this.f10078d;
    }

    public int c() {
        return this.f10077c;
    }

    public String d() {
        return this.f10076b;
    }

    public String e() {
        return this.f10075a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        if (!p2Var.a(this) || c() != p2Var.c() || b() != p2Var.b()) {
            return false;
        }
        String strE = e();
        String strE2 = p2Var.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        String strD = d();
        String strD2 = p2Var.d();
        return strD != null ? strD.equals(strD2) : strD2 == null;
    }

    public int hashCode() {
        int iC = ((c() + 59) * 59) + b();
        String strE = e();
        int iHashCode = (iC * 59) + (strE == null ? 43 : strE.hashCode());
        String strD = d();
        return (iHashCode * 59) + (strD != null ? strD.hashCode() : 43);
    }

    public String toString() {
        return "LicenseVerificationObject(signedData=" + e() + ", signature=" + d() + ", responseCode=" + c() + ", nonce=" + b() + ")";
    }

    public static a a() {
        return new a();
    }
}
