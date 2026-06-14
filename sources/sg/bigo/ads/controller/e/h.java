package sg.bigo.ads.controller.e;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.n;
import sg.bigo.ads.common.f.a;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements a.InterfaceC1258a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h f103659f = new h();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f103666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f103667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f103668j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f103660a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f103661b = 5000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f103665g = 21600000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f103662c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f103663d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final a f103664e = new a();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f103669a = System.currentTimeMillis();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f103670b = System.currentTimeMillis();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f103671c = System.currentTimeMillis();

        public a() {
        }

        public final String a(String str) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("start_ts", Long.valueOf(this.f103671c));
                h hVar = h.this;
                jSONObject.putOpt("total_duration", Long.valueOf(hVar.f103662c + hVar.b()));
                h hVar2 = h.this;
                long jB = hVar2.b();
                if (jB > hVar2.f103661b) {
                    hVar2.f103663d = jB;
                } else {
                    jB = hVar2.f103663d;
                }
                jSONObject.putOpt("close_duration", Long.valueOf(jB));
                jSONObject.putOpt("front_total_req_times", Long.valueOf(g.this.f103654c ? r2.f103655a.getAndAdd(1) : r2.f103655a.get()));
                jSONObject.putOpt("back_total_req_times", Long.valueOf(!g.this.f103654c ? r2.f103656b.getAndAdd(1) : r2.f103656b.get()));
                jSONObject.putOpt("close_front_req_times", Long.valueOf(g.this.f103654c ? r8.f103657c.getAndAdd(1) : r8.f103657c.get()));
                jSONObject.putOpt("req_status", Long.valueOf(h.a(h.this)));
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }
    }

    private h() {
        sg.bigo.ads.common.f.a.a().f102318d = this;
    }

    static /* synthetic */ int a(h hVar) {
        return hVar.f103666h ? 1 : 2;
    }

    final long b() {
        long j10 = this.f103667i;
        if (j10 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
            if (jElapsedRealtime > 0 && jElapsedRealtime > this.f103661b) {
                return jElapsedRealtime;
            }
        }
        return 0L;
    }

    public static h a() {
        return f103659f;
    }

    @Override // sg.bigo.ads.common.f.a.InterfaceC1258a
    public final void a(long j10, long j11) {
        this.f103666h = true;
        this.f103667i = j10;
        a aVar = this.f103664e;
        aVar.f103670b = j11;
        long j12 = this.f103665g;
        if (j12 > 0) {
            long j13 = this.f103668j;
            if (j13 > 0 && j10 - j13 >= j12) {
                this.f103662c = 0L;
                this.f103663d = 0L;
                aVar.f103671c = System.currentTimeMillis();
                g.a().f103653a.clear();
            }
        }
        a aVar2 = this.f103664e;
        if (aVar2.f103671c == 0) {
            aVar2.f103671c = System.currentTimeMillis();
        }
        g.a().a(true);
    }

    public final void a(n nVar) {
        this.f103660a = nVar.a();
        this.f103661b = nVar.b();
        this.f103665g = nVar.c();
    }

    @Override // sg.bigo.ads.common.f.a.InterfaceC1258a
    public final void a(boolean z10, long j10, long j11, long j12) {
        this.f103666h = false;
        this.f103668j = j11;
        this.f103667i = 0L;
        long j13 = j11 - j10;
        if (j13 > 0 && j13 > this.f103661b) {
            this.f103662c += j13;
            this.f103663d = j13;
            if (this.f103660a) {
                sg.bigo.ads.core.d.b.a(z10 ? 1 : 2, j12, j13);
            }
        }
        g.a().a(false);
    }
}
