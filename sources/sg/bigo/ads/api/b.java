package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import java.util.UUID;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.b;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b<T extends b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f102120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f102121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f102122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f102123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final a f102124h = new a(0);

    public static class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f102125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f102126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        String f102127c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        String f102128d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        String f102129e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f102130f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f102131g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f102132h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f102133i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        long f102134j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f102135k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f102136l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f102137m;

        private a() {
            this.f102126b = UUID.randomUUID().toString();
            this.f102125a = "";
            this.f102127c = "";
            this.f102128d = "";
            this.f102129e = "";
            this.f102131g = 0;
            this.f102133i = 0;
            this.f102132h = "";
            this.f102134j = 0L;
            this.f102135k = 0L;
            this.f102136l = 0L;
            this.f102137m = 0L;
        }

        public final void a() {
            if (this.f102136l == 0) {
                this.f102136l = System.currentTimeMillis();
            }
        }

        public final void b() {
            if (this.f102137m == 0) {
                this.f102137m = System.currentTimeMillis();
            }
        }

        @Override // sg.bigo.ads.api.core.g
        @Nullable
        public final String c() {
            return this.f102126b;
        }

        @Override // sg.bigo.ads.api.core.g
        @Nullable
        public final String d() {
            return this.f102127c;
        }

        @Override // sg.bigo.ads.api.core.g
        @Nullable
        public final String e() {
            return this.f102128d;
        }

        @Override // sg.bigo.ads.api.core.g
        @Nullable
        public final String f() {
            return this.f102129e;
        }

        @Override // sg.bigo.ads.api.core.g
        public final String g() {
            return this.f102125a;
        }

        @Override // sg.bigo.ads.api.core.g
        public final int h() {
            return this.f102131g;
        }

        @Override // sg.bigo.ads.api.core.g
        public final String i() {
            return this.f102132h;
        }

        @Override // sg.bigo.ads.api.core.g
        public final int j() {
            return this.f102133i;
        }

        @Override // sg.bigo.ads.api.core.g
        public final long k() {
            return this.f102130f;
        }

        @Override // sg.bigo.ads.api.core.g
        public final long l() {
            return this.f102134j;
        }

        @Override // sg.bigo.ads.api.core.g
        public final long m() {
            return this.f102135k;
        }

        @Override // sg.bigo.ads.api.core.g
        public final long n() {
            return this.f102136l;
        }

        @Override // sg.bigo.ads.api.core.g
        public final long o() {
            return this.f102137m;
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }

    public b(String str, @Nullable String str2) {
        this.f102117a = str;
        this.f102118b = str2;
    }

    @Nullable
    public T a() {
        return null;
    }

    @Nullable
    public sg.bigo.ads.api.core.c b() {
        if (q.a((CharSequence) this.f102117a)) {
            return new sg.bigo.ads.api.core.c(1019, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "Please pass slot id when constructing an ad request");
        }
        return null;
    }

    public abstract int c();

    public final void c(int i10) {
        this.f102124h.f102131g = i10;
    }

    @Nullable
    public Map<String, Object> d() {
        return null;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public l h() {
        return null;
    }

    public final void a(String str) {
        this.f102124h.f102125a = str;
    }

    public final void b(int i10) {
        a aVar = this.f102124h;
        if (aVar.f102134j == 0) {
            aVar.f102133i = i10;
            aVar.f102134j = System.currentTimeMillis();
        }
    }

    public final void a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        a aVar = this.f102124h;
        aVar.f102127c = str;
        aVar.f102128d = str2;
        aVar.f102129e = str3;
    }

    public final void b(String str) {
        a aVar = this.f102124h;
        if (aVar != null) {
            aVar.f102132h = str;
        }
    }

    public boolean a(int i10) {
        return i10 != c();
    }
}
