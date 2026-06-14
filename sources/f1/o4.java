package f1;

import android.content.Context;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import f1.vb;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f70699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qb f70700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f70701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function4 f70702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function2 f70703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DefaultHttpDataSource.Factory f70704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function5 f70705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function1 f70706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Function0 f70707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Function1 f70708j;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f70709f = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a8 invoke(Context c10) {
            Intrinsics.checkNotNullParameter(c10, "c");
            return new a8(c10, null, null, null, 14, null);
        }
    }

    public static final class b extends Lambda implements Function4 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f70710f = new b();

        public b() {
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Cache invoke(g7 fc2, qb vcp, DatabaseProvider dp, vb.b c10) {
            Intrinsics.checkNotNullParameter(fc2, "fc");
            Intrinsics.checkNotNullParameter(vcp, "vcp");
            Intrinsics.checkNotNullParameter(dp, "dp");
            Intrinsics.checkNotNullParameter(c10, "c");
            return td.j(fc2, dp, vcp, c10, null, 16, null);
        }
    }

    public /* synthetic */ class c extends kotlin.jvm.internal.y implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f70711b = new c();

        public c() {
            super(2, td.class, "cacheDataSourceFactory", "cacheDataSourceFactory(Lcom/google/android/exoplayer2/upstream/cache/Cache;Lcom/google/android/exoplayer2/upstream/HttpDataSource$Factory;)Lcom/google/android/exoplayer2/upstream/cache/CacheDataSource$Factory;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CacheDataSource.Factory invoke(Cache p02, HttpDataSource.Factory p12) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return td.k(p02, p12);
        }
    }

    public static final class d extends Lambda implements Function5 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f70712f = new d();

        public d() {
            super(5);
        }

        @Override // kotlin.jvm.functions.Function5
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DownloadManager invoke(Context c10, DatabaseProvider dp, Cache ca2, HttpDataSource.Factory hf2, DownloadManager.Listener l10) {
            Intrinsics.checkNotNullParameter(c10, "c");
            Intrinsics.checkNotNullParameter(dp, "dp");
            Intrinsics.checkNotNullParameter(ca2, "ca");
            Intrinsics.checkNotNullParameter(hf2, "hf");
            Intrinsics.checkNotNullParameter(l10, "l");
            return td.e(c10, dp, ca2, hf2, l10, 0, 0, 96, null);
        }
    }

    public /* synthetic */ class e extends kotlin.jvm.internal.y implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f70713b = new e();

        public e() {
            super(1, td.class, "databaseProvider", "databaseProvider(Landroid/content/Context;)Lcom/google/android/exoplayer2/database/DatabaseProvider;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DatabaseProvider invoke(Context p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return td.c(p02);
        }
    }

    public /* synthetic */ class f extends kotlin.jvm.internal.y implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f70714b = new f();

        public f() {
            super(0, td.class, "setCookieHandler", "setCookieHandler()V", 1);
        }

        public final void a() {
            td.l();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class g extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f70715f = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final bg invoke(g7 fc2) {
            Intrinsics.checkNotNullParameter(fc2, "fc");
            return new bg(fc2);
        }
    }

    public o4(Context context, qb videoCachePolicy, Function1 fileCachingFactory, Function4 cacheFactory, Function2 cacheDataSourceFactoryFactory, DefaultHttpDataSource.Factory httpDataSourceFactory, Function5 downloadManagerFactory, Function1 databaseProviderFactory, Function0 setCookieHandler, Function1 fakePrecacheFilesManagerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCachePolicy, "videoCachePolicy");
        Intrinsics.checkNotNullParameter(fileCachingFactory, "fileCachingFactory");
        Intrinsics.checkNotNullParameter(cacheFactory, "cacheFactory");
        Intrinsics.checkNotNullParameter(cacheDataSourceFactoryFactory, "cacheDataSourceFactoryFactory");
        Intrinsics.checkNotNullParameter(httpDataSourceFactory, "httpDataSourceFactory");
        Intrinsics.checkNotNullParameter(downloadManagerFactory, "downloadManagerFactory");
        Intrinsics.checkNotNullParameter(databaseProviderFactory, "databaseProviderFactory");
        Intrinsics.checkNotNullParameter(setCookieHandler, "setCookieHandler");
        Intrinsics.checkNotNullParameter(fakePrecacheFilesManagerFactory, "fakePrecacheFilesManagerFactory");
        this.f70699a = context;
        this.f70700b = videoCachePolicy;
        this.f70701c = fileCachingFactory;
        this.f70702d = cacheFactory;
        this.f70703e = cacheDataSourceFactoryFactory;
        this.f70704f = httpDataSourceFactory;
        this.f70705g = downloadManagerFactory;
        this.f70706h = databaseProviderFactory;
        this.f70707i = setCookieHandler;
        this.f70708j = fakePrecacheFilesManagerFactory;
    }

    public final Function2 a() {
        return this.f70703e;
    }

    public final Function4 b() {
        return this.f70702d;
    }

    public final Context c() {
        return this.f70699a;
    }

    public final Function1 d() {
        return this.f70706h;
    }

    public final Function5 e() {
        return this.f70705g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4)) {
            return false;
        }
        o4 o4Var = (o4) obj;
        return Intrinsics.areEqual(this.f70699a, o4Var.f70699a) && Intrinsics.areEqual(this.f70700b, o4Var.f70700b) && Intrinsics.areEqual(this.f70701c, o4Var.f70701c) && Intrinsics.areEqual(this.f70702d, o4Var.f70702d) && Intrinsics.areEqual(this.f70703e, o4Var.f70703e) && Intrinsics.areEqual(this.f70704f, o4Var.f70704f) && Intrinsics.areEqual(this.f70705g, o4Var.f70705g) && Intrinsics.areEqual(this.f70706h, o4Var.f70706h) && Intrinsics.areEqual(this.f70707i, o4Var.f70707i) && Intrinsics.areEqual(this.f70708j, o4Var.f70708j);
    }

    public final Function1 f() {
        return this.f70708j;
    }

    public final Function1 g() {
        return this.f70701c;
    }

    public final DefaultHttpDataSource.Factory h() {
        return this.f70704f;
    }

    public int hashCode() {
        return (((((((((((((((((this.f70699a.hashCode() * 31) + this.f70700b.hashCode()) * 31) + this.f70701c.hashCode()) * 31) + this.f70702d.hashCode()) * 31) + this.f70703e.hashCode()) * 31) + this.f70704f.hashCode()) * 31) + this.f70705g.hashCode()) * 31) + this.f70706h.hashCode()) * 31) + this.f70707i.hashCode()) * 31) + this.f70708j.hashCode();
    }

    public final Function0 i() {
        return this.f70707i;
    }

    public final qb j() {
        return this.f70700b;
    }

    public String toString() {
        return "ExoPlayerDownloadManagerDependencies(context=" + this.f70699a + ", videoCachePolicy=" + this.f70700b + ", fileCachingFactory=" + this.f70701c + ", cacheFactory=" + this.f70702d + ", cacheDataSourceFactoryFactory=" + this.f70703e + ", httpDataSourceFactory=" + this.f70704f + ", downloadManagerFactory=" + this.f70705g + ", databaseProviderFactory=" + this.f70706h + ", setCookieHandler=" + this.f70707i + ", fakePrecacheFilesManagerFactory=" + this.f70708j + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ o4(Context context, qb qbVar, Function1 function1, Function4 function4, Function2 function2, DefaultHttpDataSource.Factory factory, Function5 function5, Function1 function12, Function0 function0, Function1 function13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            context = rd.f70996b.d().getContext().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        }
        this(context, (i10 & 2) != 0 ? rd.f70996b.a().r() : qbVar, (i10 & 4) != 0 ? a.f70709f : function1, (i10 & 8) != 0 ? b.f70710f : function4, (i10 & 16) != 0 ? c.f70711b : function2, (i10 & 32) != 0 ? new DefaultHttpDataSource.Factory() : factory, (i10 & 64) != 0 ? d.f70712f : function5, (i10 & 128) != 0 ? e.f70713b : function12, (i10 & 256) != 0 ? f.f70714b : function0, (i10 & 512) != 0 ? g.f70715f : function13);
    }
}
