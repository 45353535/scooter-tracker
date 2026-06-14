package com.taurusx.tax.w;

/* JADX INFO: loaded from: classes11.dex */
public final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f67581c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f67582o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f67583s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f67584w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f67585y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f67586z;

    public static final class w {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f67588o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public String f67589s;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f67592z = 0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f67590w = 0;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f67591y = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f67587c = 0;

        public w w(String str) {
            this.f67588o = str;
            return this;
        }

        public w z(int i10, int i11) {
            this.f67592z = i10;
            this.f67590w = i11;
            return this;
        }

        public w z(boolean z10) {
            this.f67591y = z10;
            return this;
        }

        public w z(int i10) {
            this.f67587c = i10;
            return this;
        }

        public w z(String str) {
            this.f67589s = str;
            return this;
        }

        public y z() {
            return new y(this);
        }
    }

    public String c() {
        return this.f67582o;
    }

    public int o() {
        return this.f67581c;
    }

    public boolean s() {
        return this.f67585y;
    }

    public String w() {
        return this.f67583s;
    }

    public int y() {
        return this.f67586z;
    }

    public int z() {
        return this.f67584w;
    }

    public y(w wVar) {
        this.f67586z = wVar.f67592z;
        this.f67584w = wVar.f67590w;
        this.f67585y = wVar.f67591y;
        this.f67581c = wVar.f67587c;
        this.f67582o = wVar.f67588o;
        this.f67583s = wVar.f67589s;
    }
}
