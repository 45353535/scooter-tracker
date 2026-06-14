package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4300ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f43005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f43006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f43007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EnumC4368id f43008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f43009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f43010f;

    /* JADX INFO: renamed from: com.ironsource.ed$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f43011a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f43012b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f43013c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private EnumC4368id f43014d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f43015e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f43016f = 0;

        public a a(boolean z10) {
            this.f43011a = z10;
            return this;
        }

        public a a(boolean z10, EnumC4368id enumC4368id, int i10) {
            this.f43012b = z10;
            if (enumC4368id == null) {
                enumC4368id = EnumC4368id.PER_DAY;
            }
            this.f43014d = enumC4368id;
            this.f43015e = i10;
            return this;
        }

        public a a(boolean z10, int i10) {
            this.f43013c = z10;
            this.f43016f = i10;
            return this;
        }

        public C4300ed a() {
            return new C4300ed(this.f43011a, this.f43012b, this.f43013c, this.f43014d, this.f43015e, this.f43016f);
        }
    }

    public EnumC4368id a() {
        return this.f43008d;
    }

    public int b() {
        return this.f43009e;
    }

    public int c() {
        return this.f43010f;
    }

    public boolean d() {
        return this.f43006b;
    }

    public boolean e() {
        return this.f43005a;
    }

    public boolean f() {
        return this.f43007c;
    }

    private C4300ed(boolean z10, boolean z11, boolean z12, EnumC4368id enumC4368id, int i10, int i11) {
        this.f43005a = z10;
        this.f43006b = z11;
        this.f43007c = z12;
        this.f43008d = enumC4368id;
        this.f43009e = i10;
        this.f43010f = i11;
    }
}
