package sg.bigo.ads.a;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import sg.bigo.ads.a.a.a;
import sg.bigo.ads.a.a.b;
import sg.bigo.ads.common.n.d;

/* JADX INFO: loaded from: classes4.dex */
final class b implements a.InterfaceC1202a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f100088c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final sg.bigo.ads.a.a.a f100089a = new sg.bigo.ads.a.a.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f100091d = 300000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f100092e = 200;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set<String> f100090b = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<String, Long> f100093f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f100094g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f100095h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f100096i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f100097j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f100098k = false;

    b() {
    }

    static /* synthetic */ String a(int i10) {
        switch (i10) {
            case 1:
                return "Navigation Started";
            case 2:
                return "Navigation Finished";
            case 3:
                return "Navigation Failed";
            case 4:
                return "Navigation Aborted";
            case 5:
                return "Tab Shown";
            case 6:
                return "Tab Hidden";
            default:
                return "Unknown Event";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void e() {
        final String next;
        Iterator<String> it;
        if (!this.f100096i) {
            this.f100098k = false;
            return;
        }
        if (!this.f100098k) {
            sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "The task of preload start.");
        }
        try {
            it = this.f100090b.iterator();
        } catch (Exception unused) {
            next = null;
        }
        if (!it.hasNext()) {
            sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "The task of preload stop.");
            this.f100098k = false;
            return;
        }
        this.f100098k = true;
        next = it.next();
        try {
            this.f100090b.remove(next);
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(next)) {
            return;
        }
        d.a(1, new Runnable() { // from class: sg.bigo.ads.a.b.3
            @Override // java.lang.Runnable
            public final void run() {
                CustomTabsSession customTabsSessionA;
                Long l10 = (Long) b.this.f100093f.get(next);
                if (l10 == null || SystemClock.elapsedRealtime() - l10.longValue() > 300000) {
                    Uri uri = Uri.parse(next);
                    sg.bigo.ads.a.a.a aVar = b.this.f100089a;
                    boolean zMayLaunchUrl = (aVar.f100074a == null || (customTabsSessionA = aVar.a()) == null) ? false : customTabsSessionA.mayLaunchUrl(uri, null, null);
                    sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Preload url state: " + zMayLaunchUrl + ", url: " + next);
                    if (!zMayLaunchUrl) {
                        sg.bigo.ads.core.d.b.a(3002, 10115, String.valueOf(next));
                    }
                    b.this.f100093f.put(next, Long.valueOf(SystemClock.elapsedRealtime()));
                } else {
                    sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "The url that wait for preload has been preloaded before: " + next);
                }
                d.a(2, new Runnable() { // from class: sg.bigo.ads.a.b.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.e();
                    }
                }, 200L);
            }
        });
    }

    @Override // sg.bigo.ads.a.a.a.InterfaceC1202a
    public final void c() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Chrome tabs service connected.");
        this.f100096i = true;
        this.f100095h = false;
        b();
    }

    @Override // sg.bigo.ads.a.a.a.InterfaceC1202a
    public final void d() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Chrome tabs service disconnected.");
        this.f100096i = false;
        this.f100095h = false;
    }

    @MainThread
    final void b() {
        if (this.f100098k) {
            return;
        }
        e();
    }

    public static b a() {
        return f100088c;
    }

    final boolean a(Context context) {
        String str;
        if (!this.f100097j) {
            sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", "Chrome service is unavailable.");
            return false;
        }
        boolean zBindCustomTabsService = true;
        if (this.f100096i) {
            str = "Chrome service connected";
        } else {
            if (!this.f100095h) {
                this.f100095h = true;
                sg.bigo.ads.a.a.a aVar = this.f100089a;
                aVar.f100076c = this;
                if (aVar.f100074a == null) {
                    b.a aVarA = sg.bigo.ads.a.a.b.a(context);
                    if (aVarA == null || !aVarA.f100082a) {
                        zBindCustomTabsService = false;
                    } else {
                        sg.bigo.ads.a.a.c cVar = new sg.bigo.ads.a.a.c(aVar);
                        aVar.f100075b = cVar;
                        zBindCustomTabsService = CustomTabsClient.bindCustomTabsService(context, aVarA.f100086e, cVar);
                    }
                }
                if (!zBindCustomTabsService) {
                    this.f100095h = false;
                    int i10 = this.f100094g;
                    this.f100094g = i10 + 1;
                    if (i10 < 3) {
                        this.f100097j = false;
                    }
                }
                return zBindCustomTabsService;
            }
            str = "Chrome service connect trying.";
        }
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabsStatic", str);
        return true;
    }
}
