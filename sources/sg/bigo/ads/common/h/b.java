package sg.bigo.ads.common.h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import com.ironsource.C4240b4;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.common.h.b.e;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.p;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<sg.bigo.ads.common.h.a> f102482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<sg.bigo.ads.common.h.a> f102483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList<sg.bigo.ads.common.h.a> f102484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList<sg.bigo.ads.common.h.a> f102485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final a f102486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final sg.bigo.ads.common.h.a.a f102487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f102488g;

    public interface a {
        void a(sg.bigo.ads.common.h.a aVar);

        void a(sg.bigo.ads.common.h.a aVar, int i10, long j10);

        void a(sg.bigo.ads.common.h.a aVar, String str, long j10, long j11);
    }

    public b(@NonNull Context context, sg.bigo.ads.common.h.a.a aVar, boolean z10, @NonNull a aVar2) {
        this.f102488g = context;
        this.f102486e = aVar2;
        sg.bigo.ads.common.h.b.b.a(z10);
        this.f102487f = aVar;
        this.f102482a = new CopyOnWriteArrayList<>();
        this.f102483b = new CopyOnWriteArrayList<>();
        this.f102484c = new CopyOnWriteArrayList<>();
        this.f102485d = new CopyOnWriteArrayList<>();
    }

    public final sg.bigo.ads.common.h.a a(String str, String str2) {
        if (q.a((CharSequence) str) || q.a((CharSequence) str2)) {
            return null;
        }
        sg.bigo.ads.common.h.a aVarA = a(this.f102482a, str, str2);
        if (aVarA == null) {
            aVarA = a(this.f102483b, str, str2);
        }
        if (aVarA == null) {
            aVarA = a(this.f102484c, str, str2);
        }
        return aVarA == null ? a(this.f102485d, str, str2) : aVarA;
    }

    @Override // sg.bigo.ads.common.h.b.e
    public final void b(String str) {
        final sg.bigo.ads.common.h.a aVarA = sg.bigo.ads.common.h.b.b.a(str);
        if (aVarA == null) {
            a("onLoading info is null.", (sg.bigo.ads.common.h.a) null);
            return;
        }
        if (aVarA.f102466j != 1) {
            a("onLoading", aVarA);
            aVarA.f102466j = 1;
        }
        long j10 = aVarA.f102465i;
        if (j10 > 0) {
            long j11 = aVarA.f102463g;
            if ((j11 - aVarA.f102464h) * 100 > j10 * 10) {
                aVarA.f102464h = j11;
                if (aVarA.h()) {
                    int iA = sg.bigo.ads.common.aa.c.a(this.f102488g);
                    if (iA == 3 || iA == 4 || iA == 5) {
                        final long jElapsedRealtime = SystemClock.elapsedRealtime() - aVarA.f102469m;
                        a("partial download callback", aVarA);
                        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.common.h.b.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                b.this.f102486e.a(aVarA, 2, jElapsedRealtime);
                            }
                        });
                    }
                }
            }
        }
    }

    @Override // sg.bigo.ads.common.h.b.e
    public final void c(String str) {
        sg.bigo.ads.common.h.a aVarA = sg.bigo.ads.common.h.b.b.a(str);
        if (aVarA != null) {
            aVarA.f102466j = 2;
        }
    }

    @Override // sg.bigo.ads.common.h.b.e
    public final void d(final String str) {
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.common.h.b.3
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.common.h.a aVarA = sg.bigo.ads.common.h.b.b.a(str);
                if (aVarA == null) {
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                b.a("download succeed", aVarA);
                aVarA.f102466j = 3;
                b.this.f102482a.remove(aVarA);
                b.this.f102483b.add(aVarA);
                b.this.f102486e.a(aVarA, 1, jElapsedRealtime - aVarA.f102469m);
                b.a("downloading to downloaded", aVarA);
                sg.bigo.ads.common.h.b.b.a(aVarA.f102457a);
                b.this.a();
            }
        });
    }

    private static sg.bigo.ads.common.h.a a(List<sg.bigo.ads.common.h.a> list, String str, String str2) {
        if (!q.a((CharSequence) str) && !q.a((CharSequence) str2)) {
            for (sg.bigo.ads.common.h.a aVar : list) {
                if (TextUtils.equals(str, aVar.f102459c) && TextUtils.equals(str2, aVar.f102460d)) {
                    return aVar;
                }
            }
        }
        return null;
    }

    private boolean b() {
        return this.f102482a.size() < this.f102487f.f102478a;
    }

    private static sg.bigo.ads.common.h.a a(List<sg.bigo.ads.common.h.a> list, sg.bigo.ads.common.h.a aVar) {
        int iIndexOf = list.indexOf(aVar);
        if (iIndexOf >= 0) {
            try {
                return list.get(iIndexOf);
            } catch (Exception e10) {
                a("getExistDownloadInfo e=" + e10.getMessage(), (sg.bigo.ads.common.h.a) null);
            }
        }
        return null;
    }

    private static sg.bigo.ads.common.h.a a(List<sg.bigo.ads.common.h.a> list, boolean z10) {
        for (sg.bigo.ads.common.h.a aVar : list) {
            if (!z10) {
                return aVar;
            }
            int i10 = aVar.f102467k >= 3 ? Constants.THIRTY_MINUTES : 300000;
            if (aVar.f102468l > 0 && System.currentTimeMillis() - aVar.f102468l > i10) {
                return aVar;
            }
            a("no download info execute.", aVar);
        }
        return null;
    }

    final void a() {
        if (sg.bigo.ads.common.x.a.q()) {
            return;
        }
        a("continue to execute download task", (sg.bigo.ads.common.h.a) null);
        if (!b()) {
            a("no idle download thread", (sg.bigo.ads.common.h.a) null);
            return;
        }
        sg.bigo.ads.common.h.a aVarA = a((List<sg.bigo.ads.common.h.a>) this.f102484c, false);
        if (aVarA != null) {
            a("waiting to downloading", aVarA);
            this.f102484c.remove(aVarA);
        }
        if (aVarA == null && (aVarA = a((List<sg.bigo.ads.common.h.a>) this.f102485d, true)) != null) {
            a("failed to downloading", aVarA);
            this.f102485d.remove(aVarA);
        }
        if (aVarA == null) {
            a("no download info execute.", (sg.bigo.ads.common.h.a) null);
        } else {
            this.f102482a.add(aVarA);
            a(this.f102488g, aVarA);
        }
    }

    private void a(Context context, sg.bigo.ads.common.h.a aVar) {
        aVar.f102469m = SystemClock.elapsedRealtime();
        a("execute download start", aVar);
        if (f.b(aVar.f102459c, aVar.f102460d)) {
            a("executeDownload use local file", aVar);
            f.c(aVar.f102459c, aVar.f102460d);
            aVar.f102466j = 3;
            aVar.f102465i = f.a(aVar.a(), 1);
            this.f102482a.remove(aVar);
            this.f102483b.add(aVar);
            this.f102486e.a(aVar, 0, 0L);
            a();
            return;
        }
        if (!p.b()) {
            this.f102482a.remove(aVar);
            this.f102486e.a(aVar, "internal storage is not enough", SystemClock.elapsedRealtime() - aVar.f102469m, 0L);
            a();
        } else {
            sg.bigo.ads.common.h.b.b.a(context, aVar);
            sg.bigo.ads.common.h.b.b.a(aVar.f102457a, this);
            a("execute downloader", aVar);
            sg.bigo.ads.common.h.b.b.b(aVar.f102457a);
        }
    }

    @Override // sg.bigo.ads.common.h.b.e
    public final void a(String str) {
        final sg.bigo.ads.common.h.a aVarA = sg.bigo.ads.common.h.b.b.a(str);
        if (aVarA == null) {
            a("onStart info is null.", (sg.bigo.ads.common.h.a) null);
        } else {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.common.h.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.f102486e.a(aVarA);
                }
            });
        }
    }

    @Override // sg.bigo.ads.common.h.b.e
    public final void a(final String str, final String str2, final long j10) {
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.common.h.b.4
            @Override // java.lang.Runnable
            public final void run() {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                sg.bigo.ads.common.h.a aVarA = sg.bigo.ads.common.h.b.b.a(str);
                if (aVarA == null) {
                    return;
                }
                b.a("download failed", aVarA);
                aVarA.f102466j = 4;
                if (!aVarA.f102470n) {
                    aVarA.f102467k++;
                }
                aVarA.f102468l = System.currentTimeMillis();
                b.this.f102486e.a(aVarA, str2, jElapsedRealtime - aVarA.f102469m, j10);
                b.a("download failed update fail count", aVarA);
                b.this.f102482a.remove(aVarA);
                b.this.f102485d.add(aVarA);
                b.a("downloading to failed", aVarA);
                b.this.a();
            }
        });
    }

    public static void a(String str, sg.bigo.ads.common.h.a aVar) {
        sg.bigo.ads.common.t.a.a(0, 3, "DownloadManager", str + ", download info = " + (aVar != null ? aVar.toString() : null));
    }

    @SuppressLint({"ConcurrentModification"})
    public final void a(sg.bigo.ads.common.h.a aVar, boolean z10) {
        a("start the download, force=".concat(String.valueOf(z10)), aVar);
        if (f.b(aVar.a())) {
            a("downloaded and exist local file", aVar);
            f.c(aVar.f102459c, aVar.f102460d);
            this.f102486e.a(aVar, 0, 0L);
            return;
        }
        if (a(this.f102482a, aVar) != null) {
            a("downloading", aVar);
            return;
        }
        if (this.f102487f.b()) {
            this.f102486e.a(aVar, "Unable to download media file.", 0L, 0L);
            return;
        }
        sg.bigo.ads.common.h.a aVarA = a(this.f102484c, aVar);
        if (aVarA != null) {
            a("waiting", aVar);
            aVarA.f102458b = aVar.f102458b;
            if (!z10 && !b()) {
                a("waiting not executing", aVar);
                return;
            }
        }
        sg.bigo.ads.common.h.a aVarA2 = a(this.f102485d, aVar);
        if (aVarA2 != null) {
            a(C4240b4.i.f42652t, aVar);
            this.f102485d.remove(aVarA2);
            aVarA2.f102458b = aVar.f102458b;
            aVarA2.f102466j = 0;
        } else {
            aVarA2 = aVar;
        }
        if (!b() && !z10) {
            a("join download waiting queue", aVarA2);
            this.f102484c.add(aVarA2);
        } else {
            a("execute download", aVarA2);
            aVarA2.f102470n = z10;
            this.f102482a.add(aVarA2);
            a(this.f102488g, aVarA2);
        }
    }

    public static boolean a(List<sg.bigo.ads.common.h.a> list, String str) {
        if (!q.a((CharSequence) str) && !k.a((Collection) list)) {
            Iterator<sg.bigo.ads.common.h.a> it = list.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(str, it.next().f102458b)) {
                    return true;
                }
            }
        }
        return false;
    }
}
