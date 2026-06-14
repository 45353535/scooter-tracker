package com.apm.insight.b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.apm.insight.runtime.p;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f7662r = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f7663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f7665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f f7668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f7669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f7670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f7671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f7672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f7673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f7674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.apm.insight.b.e f7675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f7676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f7677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p f7678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f7679q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Runnable f7680s;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f7689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f7690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f7691c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f7692d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7693e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        StackTraceElement[] f7694f;

        private a() {
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f7695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7696b;

        final void a(a aVar) {
            throw null;
        }
    }

    public interface c {
    }

    public static class d {
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f7697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f7698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f7699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f7700d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7701e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f7702f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f7703g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f7704h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f7705i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f7706j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private d f7707k;

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, g.a(this.f7704h));
                jSONObject.put("cpuDuration", this.f7703g);
                jSONObject.put("duration", this.f7702f);
                jSONObject.put("type", this.f7700d);
                jSONObject.put("count", this.f7701e);
                jSONObject.put("messageCount", this.f7701e);
                jSONObject.put("lastDuration", this.f7698b - this.f7699c);
                jSONObject.put("start", this.f7697a);
                jSONObject.put("end", this.f7698b);
                jSONObject.put("block_uuid", (Object) null);
                jSONObject.put("sblock_uuid", (Object) null);
                jSONObject.put("belong_frame", false);
                return jSONObject;
            } catch (JSONException e10) {
                e10.printStackTrace();
                return jSONObject;
            }
        }

        final void b() {
            this.f7700d = -1;
            this.f7701e = -1;
            this.f7702f = -1L;
            this.f7704h = null;
            this.f7706j = null;
            this.f7707k = null;
            this.f7705i = null;
        }
    }

    public g() {
        this((byte) 0);
    }

    static /* synthetic */ b c() {
        return null;
    }

    static /* synthetic */ p e() {
        return null;
    }

    private g(byte b10) {
        this.f7664b = 0;
        this.f7665c = 0;
        this.f7666d = 100;
        this.f7667e = 200;
        this.f7669g = -1L;
        this.f7670h = -1L;
        this.f7671i = -1;
        this.f7672j = -1L;
        this.f7676n = false;
        this.f7677o = false;
        this.f7679q = false;
        this.f7680s = new Runnable() { // from class: com.apm.insight.b.g.2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f7683b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f7682a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f7684c = -1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f7685d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f7686e = 0;

            @Override // java.lang.Runnable
            public final void run() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (g.c().f7695a != null) {
                    throw null;
                }
                a aVar = new a((byte) 0);
                if (this.f7684c == g.this.f7665c) {
                    this.f7685d++;
                } else {
                    this.f7685d = 0;
                    this.f7686e = 0;
                    this.f7683b = jUptimeMillis;
                }
                this.f7684c = g.this.f7665c;
                int i10 = this.f7685d;
                if (i10 > 0 && i10 - this.f7686e >= g.f7662r && this.f7682a != 0 && jUptimeMillis - this.f7683b > 700 && g.this.f7679q) {
                    aVar.f7694f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f7686e = this.f7685d;
                }
                aVar.f7692d = g.this.f7679q;
                aVar.f7691c = (jUptimeMillis - this.f7682a) - 300;
                aVar.f7689a = jUptimeMillis;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                this.f7682a = jUptimeMillis2;
                aVar.f7690b = jUptimeMillis2 - jUptimeMillis;
                aVar.f7693e = g.this.f7665c;
                g.e().a(g.this.f7680s, 300L);
                g.c().a(aVar);
            }
        };
        this.f7663a = new c() { // from class: com.apm.insight.b.g.1
        };
        this.f7678p = null;
    }

    static /* synthetic */ int d(g gVar) {
        int i10 = gVar.f7664b;
        gVar.f7664b = i10 + 1;
        return i10;
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        try {
            int i10 = 0;
            for (e eVar : this.f7668f.a()) {
                if (eVar != null) {
                    i10++;
                    jSONArray.put(eVar.a().put("id", i10));
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    public final void a() {
        if (this.f7676n) {
            return;
        }
        this.f7676n = true;
        this.f7666d = 100;
        this.f7667e = 300;
        this.f7668f = new f(100);
        this.f7675m = new com.apm.insight.b.e() { // from class: com.apm.insight.b.g.3
            @Override // com.apm.insight.b.e
            public final boolean a() {
                return true;
            }

            @Override // com.apm.insight.b.e
            public final void b(String str) {
                super.b(str);
                g.d(g.this);
                g.a(g.this, false, com.apm.insight.b.e.f7656a);
                g gVar = g.this;
                gVar.f7673k = gVar.f7674l;
                g.this.f7674l = "no message running";
                g.this.f7679q = false;
            }

            @Override // com.apm.insight.b.e
            public final void a(String str) {
                g.this.f7679q = true;
                g.this.f7674l = str;
                super.a(str);
                g.a(g.this, true, com.apm.insight.b.e.f7656a);
            }
        };
        h.a();
        h.a(this.f7675m);
        j.a(j.a());
    }

    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f7708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e f7710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<e> f7711d = new ArrayList();

        f(int i10) {
            this.f7708a = i10;
        }

        final e a(int i10) {
            e eVar = this.f7710c;
            if (eVar != null) {
                eVar.f7700d = i10;
                this.f7710c = null;
                return eVar;
            }
            e eVar2 = new e();
            eVar2.f7700d = i10;
            return eVar2;
        }

        final void a(e eVar) {
            int size = this.f7711d.size();
            int i10 = this.f7708a;
            if (size < i10) {
                this.f7711d.add(eVar);
                this.f7709b = this.f7711d.size();
                return;
            }
            int i11 = this.f7709b % i10;
            this.f7709b = i11;
            e eVar2 = this.f7711d.set(i11, eVar);
            eVar2.b();
            this.f7710c = eVar2;
            this.f7709b++;
        }

        final List<e> a() {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            if (this.f7711d.size() == this.f7708a) {
                for (int i11 = this.f7709b; i11 < this.f7711d.size(); i11++) {
                    arrayList.add(this.f7711d.get(i11));
                }
                while (i10 < this.f7709b - 1) {
                    arrayList.add(this.f7711d.get(i10));
                    i10++;
                }
            } else {
                while (i10 < this.f7711d.size()) {
                    arrayList.add(this.f7711d.get(i10));
                    i10++;
                }
            }
            return arrayList;
        }
    }

    private void a(int i10, long j10, String str) {
        a(i10, j10, str, true);
    }

    private void a(int i10, long j10, String str, boolean z10) {
        this.f7677o = true;
        e eVarA = this.f7668f.a(i10);
        eVarA.f7702f = j10 - this.f7669g;
        if (z10) {
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            eVarA.f7703g = jCurrentThreadTimeMillis - this.f7672j;
            this.f7672j = jCurrentThreadTimeMillis;
        } else {
            eVarA.f7703g = -1L;
        }
        eVarA.f7701e = this.f7664b;
        eVarA.f7704h = str;
        eVarA.f7705i = this.f7673k;
        eVarA.f7697a = this.f7669g;
        eVarA.f7698b = j10;
        eVarA.f7699c = this.f7670h;
        this.f7668f.a(eVarA);
        this.f7664b = 0;
        this.f7669g = j10;
    }

    public final e a(long j10) {
        e eVar = new e();
        eVar.f7704h = this.f7674l;
        eVar.f7705i = this.f7673k;
        eVar.f7702f = j10 - this.f7670h;
        eVar.f7703g = 0 - this.f7672j;
        eVar.f7701e = this.f7664b;
        return eVar;
    }

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
            String str3 = strArrSplit.length == 2 ? strArrSplit[1] : "";
            if (str.contains("{") && str.contains("}")) {
                str2 = str.split("\\{")[0];
                try {
                    str = str2 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str2;
                }
            } else {
                str2 = str;
            }
            if (str.contains("@")) {
                String[] strArrSplit2 = str.split("@");
                if (strArrSplit2.length > 1) {
                    str = strArrSplit2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] strArrSplit3 = str.split("\\(");
                if (strArrSplit3.length > 1) {
                    str = strArrSplit3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str3;
        } catch (Throwable unused2) {
            return str;
        }
    }

    static /* synthetic */ void a(g gVar, boolean z10, long j10) {
        int i10 = gVar.f7665c + 1;
        gVar.f7665c = i10;
        gVar.f7665c = i10 & 65535;
        gVar.f7677o = false;
        if (gVar.f7669g < 0) {
            gVar.f7669g = j10;
        }
        if (gVar.f7670h < 0) {
            gVar.f7670h = j10;
        }
        if (gVar.f7671i < 0) {
            gVar.f7671i = Process.myTid();
            gVar.f7672j = SystemClock.currentThreadTimeMillis();
        }
        long j11 = j10 - gVar.f7669g;
        int i11 = gVar.f7667e;
        if (j11 > i11) {
            long j12 = gVar.f7670h;
            if (j10 - j12 <= i11) {
                gVar.a(9, j10, gVar.f7674l);
            } else if (z10) {
                if (gVar.f7664b == 0) {
                    gVar.a(1, j10, "no message running");
                } else {
                    gVar.a(9, j12, gVar.f7673k);
                    gVar.a(1, j10, "no message running", false);
                }
            } else if (gVar.f7664b == 0) {
                gVar.a(8, j10, gVar.f7674l, true);
            } else {
                gVar.a(9, j12, gVar.f7673k, false);
                gVar.a(8, j10, gVar.f7674l, true);
            }
        }
        gVar.f7670h = j10;
    }
}
