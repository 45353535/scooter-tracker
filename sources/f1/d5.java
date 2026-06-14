package f1;

import android.net.Uri;
import com.chartboost.sdk.internal.video.repository.exoplayer.VideoRepositoryDownloadService;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import f1.q3;
import f1.vb;
import g1.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class d5 implements y3, DownloadManager.Listener, vb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4 f69580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DownloadManager f69581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DataSource.Factory f69582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g7 f69583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public bg f69584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile List f69585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Map f69586g;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ n4 f69587f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n4 n4Var) {
            super(1);
            this.f69587f = n4Var;
        }

        public final void a(q3.a forEachListener) {
            Intrinsics.checkNotNullParameter(forEachListener, "$this$forEachListener");
            forEachListener.a(this.f69587f.f(), this.f69587f.b());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((q3.a) obj);
            return Unit.f93236a;
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ n4 f69588f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ g1.a f69589g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n4 n4Var, g1.a aVar) {
            super(1);
            this.f69588f = n4Var;
            this.f69589g = aVar;
        }

        public final void a(q3.a forEachListener) {
            Intrinsics.checkNotNullParameter(forEachListener, "$this$forEachListener");
            forEachListener.c(this.f69588f.f(), this.f69588f.b(), this.f69589g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((q3.a) obj);
            return Unit.f93236a;
        }
    }

    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ n4 f69590f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n4 n4Var) {
            super(1);
            this.f69590f = n4Var;
        }

        public final void a(q3.a forEachListener) {
            Intrinsics.checkNotNullParameter(forEachListener, "$this$forEachListener");
            forEachListener.b(this.f69590f.f(), this.f69590f.b(), 0L, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((q3.a) obj);
            return Unit.f93236a;
        }
    }

    public d5(o4 dependencies) {
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        this.f69580a = dependencies;
        this.f69585f = CollectionsKt.emptyList();
        this.f69586g = MapsKt.emptyMap();
    }

    public static /* synthetic */ void j(d5 d5Var, c9 c9Var, x3 x3Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            x3Var = x3.f71490d;
        }
        d5Var.n(c9Var, x3Var);
    }

    @Override // f1.y3
    public synchronized void a() {
        eg.e("initialize()", null, 2, null);
        this.f69580a.i().invoke();
        d();
    }

    @Override // f1.y3
    public void b() {
        f(ee.c(d()));
    }

    @Override // f1.y3
    public void c(q3.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f69585f = CollectionsKt.plus((Collection<? extends q3.a>) this.f69585f, listener);
    }

    @Override // f1.y3
    public void d(c9 asset, x3 stopReason) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(stopReason, "stopReason");
        eg.e("addDownload() - asset: " + asset + ", stopReason " + stopReason, null, 2, null);
        n(asset, stopReason);
    }

    public final g1.a e(Exception exc) {
        return exc instanceof IOException ? new g1.a(a.c.f72143f, s0.a(exc)) : new g1.a(a.c.f72139b, s0.a(exc));
    }

    public final List f(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (k((n4) obj)) {
                arrayList.add(obj);
            }
        }
        o(arrayList);
        return list;
    }

    public final void g(int i10, String str, Function1 function1) {
        for (q3.a aVar : this.f69585f) {
            Integer num = (Integer) this.f69586g.get(str);
            if (num == null || num.intValue() != i10) {
                this.f69586g = MapsKt.plus(this.f69586g, TuplesKt.to(str, Integer.valueOf(i10)));
                function1.invoke(aVar);
            }
        }
    }

    public final void h(n4 n4Var, x3 x3Var) {
        eg.e("Download.sendStopReason() - download " + n4Var + ", stopReason " + x3Var, null, 2, null);
        try {
            DownloadService.sendSetStopReason(this.f69580a.c(), VideoRepositoryDownloadService.class, n4Var.b(), x3Var.g(), false);
        } catch (Exception e10) {
            eg.i("Error sending stop reason", e10);
        }
    }

    public final void i(n4 n4Var, Exception exc) {
        g1.a aVarE = e(exc);
        h8.b("Video downloaded failed " + n4Var.f() + " with error " + aVarE.d());
        g(4, n4Var.f(), new b(n4Var, aVarE));
    }

    public final boolean k(n4 n4Var) {
        return this.f69580a.j().c(n4Var.e());
    }

    public final void l(n4 n4Var) {
        eg.e("notifyDownloadCompleted() - download " + n4Var + ", listeners: " + this.f69585f, null, 2, null);
        String strF = n4Var.f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Video downloaded success ");
        sb2.append(strF);
        h8.b(sb2.toString());
        g(3, n4Var.f(), new a(n4Var));
    }

    public final void m(c9 c9Var) {
        this.f69586g = MapsKt.minus((Map<? extends String, ? extends V>) this.f69586g, c9Var.h());
    }

    public final void n(c9 c9Var, x3 x3Var) {
        eg.e("VideoAsset.addDownload() - videoAsset " + c9Var + ", stopReason " + x3Var, null, 2, null);
        if (StringsKt.y0(c9Var.h())) {
            return;
        }
        try {
            DownloadService.sendAddDownload(this.f69580a.c(), VideoRepositoryDownloadService.class, new DownloadRequest.Builder(c9Var.e(), Uri.parse(c9Var.h())).build(), x3Var.g(), false);
        } catch (Exception e10) {
            eg.i("Error sending add download", e10);
        }
    }

    public final void o(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s((n4) it.next());
        }
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public void onDownloadChanged(DownloadManager downloadManager, Download download, Exception exc) throws IOException {
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(download, "download");
        bg bgVar = null;
        eg.e("onDownloadChanged() - state " + c5.c(download.state) + ", finalException " + exc, null, 2, null);
        int i10 = download.state;
        if (i10 == 0 || i10 == 1) {
            bg bgVar2 = this.f69584e;
            if (bgVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fakePrecacheFilesManager");
            } else {
                bgVar = bgVar2;
            }
            bgVar.c(c5.a(download));
            return;
        }
        if (i10 == 2) {
            p(c5.a(download));
            return;
        }
        if (i10 == 3) {
            l(c5.a(download));
        } else if (i10 == 4) {
            i(c5.a(download), exc);
        } else {
            if (i10 != 5) {
                return;
            }
            r(c5.a(download));
        }
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public /* synthetic */ void onDownloadRemoved(DownloadManager downloadManager, Download download) {
        com.google.android.exoplayer2.offline.m.b(this, downloadManager, download);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public /* synthetic */ void onDownloadsPausedChanged(DownloadManager downloadManager, boolean z10) {
        com.google.android.exoplayer2.offline.m.c(this, downloadManager, z10);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public /* synthetic */ void onIdle(DownloadManager downloadManager) {
        com.google.android.exoplayer2.offline.m.d(this, downloadManager);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public /* synthetic */ void onInitialized(DownloadManager downloadManager) {
        com.google.android.exoplayer2.offline.m.e(this, downloadManager);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public /* synthetic */ void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int i10) {
        com.google.android.exoplayer2.offline.m.f(this, downloadManager, requirements, i10);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public /* synthetic */ void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean z10) {
        com.google.android.exoplayer2.offline.m.g(this, downloadManager, z10);
    }

    public final void p(n4 n4Var) throws IOException {
        bg bgVar = null;
        eg.e("notifyTempFileIsReady() - download " + n4Var + ", listeners: " + this.f69585f, null, 2, null);
        h8.b("Start downloading " + n4Var.f());
        bg bgVar2 = this.f69584e;
        if (bgVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fakePrecacheFilesManager");
        } else {
            bgVar = bgVar2;
        }
        bgVar.e(n4Var);
        g(2, n4Var.f(), new c(n4Var));
    }

    public final void q(c9 c9Var) {
        for (n4 n4Var : ee.c(d())) {
            if (!Intrinsics.areEqual(n4Var.b(), c9Var.e())) {
                h(n4Var, x3.f71493g);
            }
        }
    }

    public final void r(n4 n4Var) {
        bg bgVar = null;
        eg.e("downloadRemoved() - download " + n4Var + ", listeners: " + this.f69585f, null, 2, null);
        bg bgVar2 = this.f69584e;
        if (bgVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fakePrecacheFilesManager");
        } else {
            bgVar = bgVar2;
        }
        bgVar.d(n4Var);
        this.f69586g = MapsKt.minus((Map<? extends String, ? extends V>) this.f69586g, n4Var.f());
    }

    public final void s(n4 n4Var) {
        try {
            DownloadService.sendRemoveDownload(this.f69580a.c(), VideoRepositoryDownloadService.class, n4Var.b(), false);
            bg bgVar = this.f69584e;
            if (bgVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fakePrecacheFilesManager");
                bgVar = null;
            }
            bgVar.d(n4Var);
        } catch (Exception e10) {
            eg.i("Error sending remove download", e10);
        }
    }

    @Override // f1.y3
    public DataSource.Factory c() {
        DataSource.Factory factory = this.f69582c;
        if (factory != null) {
            return factory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cacheDataSourceFactory");
        return null;
    }

    @Override // f1.y3
    public boolean a(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        n4 n4VarB = b(id2);
        if (n4VarB != null) {
            return n4VarB.d() == 3 || n4VarB.d() == 2;
        }
        return false;
    }

    @Override // f1.y3
    public n4 b(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return ee.a(d(), id2);
    }

    @Override // f1.vb.b
    public void c(String url) {
        Object next;
        Intrinsics.checkNotNullParameter(url, "url");
        Iterator it = ee.c(d()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual(((n4) next).f(), url)) {
                    break;
                }
            }
        }
        n4 n4Var = (n4) next;
        if (n4Var != null) {
            s(n4Var);
        }
    }

    @Override // f1.y3
    public float d(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        n4 n4VarB = b(id2);
        return (n4VarB != null ? n4VarB.c() : 0.0f) / 100.0f;
    }

    public /* synthetic */ d5(o4 o4Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new o4(null, null, null, null, null, null, null, null, null, null, 1023, null) : o4Var);
    }

    @Override // f1.y3
    public void b(x3 currentDownloadStopReason) {
        n4 n4VarA;
        Intrinsics.checkNotNullParameter(currentDownloadStopReason, "currentDownloadStopReason");
        List<Download> currentDownloads = d().getCurrentDownloads();
        Intrinsics.checkNotNullExpressionValue(currentDownloads, "getCurrentDownloads(...)");
        Download download = (Download) CollectionsKt.firstOrNull((List) currentDownloads);
        if (download == null || (n4VarA = c5.a(download)) == null) {
            return;
        }
        h(n4VarA, currentDownloadStopReason);
    }

    @Override // f1.y3
    public DownloadManager d() {
        d5 d5Var;
        if (this.f69581b == null) {
            DatabaseProvider databaseProvider = (DatabaseProvider) this.f69580a.d().invoke(this.f69580a.c());
            this.f69583d = (g7) this.f69580a.g().invoke(this.f69580a.c());
            Function4 function4B = this.f69580a.b();
            g7 g7Var = this.f69583d;
            if (g7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fileCaching");
                g7Var = null;
            }
            Cache cache = (Cache) function4B.invoke(g7Var, this.f69580a.j(), databaseProvider, this);
            this.f69582c = (DataSource.Factory) this.f69580a.a().invoke(cache, this.f69580a.h());
            Function1 function1F = this.f69580a.f();
            g7 g7Var2 = this.f69583d;
            if (g7Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fileCaching");
                g7Var2 = null;
            }
            this.f69584e = (bg) function1F.invoke(g7Var2);
            d5Var = this;
            d5Var.f69581b = (DownloadManager) this.f69580a.e().invoke(this.f69580a.c(), databaseProvider, cache, this.f69580a.h(), d5Var);
        } else {
            d5Var = this;
        }
        DownloadManager downloadManager = d5Var.f69581b;
        if (downloadManager != null) {
            return downloadManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("downloadManager");
        return null;
    }

    @Override // f1.y3
    public void a(c9 asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        eg.e("startDownload() - asset: " + asset, null, 2, null);
        m(asset);
        q(asset);
        j(this, asset, null, 1, null);
    }
}
