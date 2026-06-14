package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static IThreadPoolCallback f15739r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static ThreadPoolExecutor f15740s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.c f15742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IStatisticMonitor f15743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final INetWork f15744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f15745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f15746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.a f15747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Long f15748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f15749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f15750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f15751k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f15752l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f15753m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final File f15754n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f15755o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f15756p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private JSONObject f15757q;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private INetWork f15758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<String> f15759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<String> f15760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Context f15761d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.c f15762e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private IStatisticMonitor f15763f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f15764g = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.a f15765h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Long f15766i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f15767j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f15768k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f15769l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private File f15770m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f15771n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f15772o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f15773p;

        public a(Context context) {
            this.f15761d = context.getApplicationContext();
        }

        public final a a(String... strArr) {
            this.f15760c = Arrays.asList(strArr);
            return this;
        }

        public final a b(String... strArr) {
            this.f15759b = Arrays.asList(strArr);
            return this;
        }

        public final a c(String str) {
            this.f15769l = str;
            return this;
        }

        public final a a(INetWork iNetWork) {
            this.f15758a = iNetWork;
            return this;
        }

        public final a b() {
            this.f15766i = 38L;
            return this;
        }

        public final a a(long j10) {
            this.f15773p = j10;
            return this;
        }

        public final a b(String str) {
            this.f15768k = str;
            return this;
        }

        public final a a(IStatisticMonitor iStatisticMonitor) {
            this.f15763f = iStatisticMonitor;
            return this;
        }

        public final a a() {
            this.f15764g = false;
            return this;
        }

        public final a a(com.bykv.vk.openvk.preload.geckox.a.a.a aVar) {
            this.f15765h = aVar;
            return this;
        }

        public final a a(String str) {
            this.f15767j = str;
            return this;
        }

        public final a a(File file) {
            this.f15770m = file;
            return this;
        }
    }

    /* synthetic */ b(a aVar, byte b10) {
        this(aVar);
    }

    public static Executor g() {
        return t();
    }

    public static Executor h() {
        return t();
    }

    public static ExecutorService t() {
        IThreadPoolCallback iThreadPoolCallback = f15739r;
        ExecutorService threadPool = iThreadPoolCallback != null ? iThreadPoolCallback.getThreadPool() : null;
        if (threadPool != null) {
            return threadPool;
        }
        if (f15740s == null) {
            synchronized (b.class) {
                try {
                    if (f15740s == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                        f15740s = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f15740s;
    }

    public final Context a() {
        return this.f15741a;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.a b() {
        return this.f15747g;
    }

    public final boolean c() {
        return this.f15755o;
    }

    public final List<String> d() {
        return this.f15746f;
    }

    public final List<String> e() {
        return this.f15745e;
    }

    public final JSONObject f() {
        return this.f15757q;
    }

    public final INetWork i() {
        return this.f15744d;
    }

    public final String j() {
        return this.f15751k;
    }

    public final long k() {
        return this.f15748h.longValue();
    }

    public final String l() {
        return this.f15753m;
    }

    public final String m() {
        return this.f15752l;
    }

    public final File n() {
        return this.f15754n;
    }

    public final String o() {
        return this.f15749i;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.c p() {
        return this.f15742b;
    }

    public final IStatisticMonitor q() {
        return this.f15743c;
    }

    public final String r() {
        return this.f15750j;
    }

    public final long s() {
        return this.f15756p;
    }

    private b(a aVar) {
        Context context = aVar.f15761d;
        this.f15741a = context;
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        List<String> list = aVar.f15759b;
        this.f15745e = list;
        this.f15746f = aVar.f15760c;
        this.f15742b = aVar.f15762e;
        this.f15747g = aVar.f15765h;
        Long l10 = aVar.f15766i;
        this.f15748h = l10;
        if (TextUtils.isEmpty(aVar.f15767j)) {
            this.f15749i = com.bykv.vk.openvk.preload.geckox.utils.a.a(context);
        } else {
            this.f15749i = aVar.f15767j;
        }
        String str = aVar.f15768k;
        this.f15750j = str;
        this.f15752l = aVar.f15771n;
        this.f15753m = aVar.f15772o;
        this.f15756p = aVar.f15773p;
        if (aVar.f15770m == null) {
            this.f15754n = new File(context.getFilesDir(), "gecko_offline_res_x");
        } else {
            this.f15754n = aVar.f15770m;
        }
        String str2 = aVar.f15769l;
        this.f15751k = str2;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("host == null");
        }
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        if (l10 == null) {
            throw new IllegalArgumentException("appId == null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("deviceId key empty");
        }
        this.f15744d = aVar.f15758a;
        this.f15743c = aVar.f15763f;
        this.f15755o = aVar.f15764g;
    }

    public final void a(JSONObject jSONObject) {
        this.f15757q = jSONObject;
    }

    public static void a(IThreadPoolCallback iThreadPoolCallback) {
        f15739r = iThreadPoolCallback;
    }
}
