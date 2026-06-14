package com.my.target;

import android.content.Context;
import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f59811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f59812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f59813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f59814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f59815e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f59816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f59817b = false;

        public a(int i10) {
            this.f59816a = i10;
        }

        public void a(boolean z10) {
            this.f59817b = z10;
        }

        public h6 b() {
            h6 h6Var = new h6(this.f59816a, "myTarget", 4);
            h6Var.a(this.f59817b);
            return h6Var;
        }

        public h6 a() {
            h6 h6Var = new h6(this.f59816a, "myTarget", 0);
            h6Var.a(this.f59817b);
            return h6Var;
        }

        public h6 a(String str, float f10) {
            h6 h6Var = new h6(this.f59816a, str, 5);
            h6Var.a(this.f59817b);
            h6Var.f59811a.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Float.valueOf(f10));
            return h6Var;
        }
    }

    public h6(int i10, String str, int i11) {
        HashMap map = new HashMap();
        this.f59811a = map;
        this.f59812b = new HashMap();
        this.f59814d = i11;
        this.f59813c = System.currentTimeMillis();
        map.put("slot", Integer.valueOf(i10));
        map.put("network", str);
    }

    public static a a(int i10) {
        return new a(i10);
    }

    public void b() {
        b(this.f59814d, System.currentTimeMillis() - this.f59813c);
    }

    public void a(boolean z10) {
        this.f59815e = z10;
    }

    public void b(int i10, long j10) {
        this.f59812b.put(Integer.valueOf(i10), Long.valueOf(j10));
    }

    public void a(int i10, long j10) {
        Long l10 = (Long) this.f59812b.get(Integer.valueOf(i10));
        if (l10 != null) {
            j10 += l10.longValue();
        }
        b(i10, j10);
    }

    public void b(final Context context) {
        if (!this.f59815e) {
            gb.a("MetricMessage: Metrics sending disabled");
            return;
        }
        if (this.f59812b.isEmpty()) {
            gb.a("MetricMessage: Metrics not send: empty");
            return;
        }
        t1 t1VarA = d2.b().a();
        if (t1VarA == null) {
            gb.a("MetricMessage: Metrics not send: basic info not collected");
            return;
        }
        this.f59811a.put("instanceId", t1VarA.f60826a);
        this.f59811a.put("os", t1VarA.f60827b);
        this.f59811a.put("osver", t1VarA.f60828c);
        this.f59811a.put("app", t1VarA.f60829d);
        this.f59811a.put("appver", t1VarA.f60830e);
        this.f59811a.put("sdkver", t1VarA.f60831f);
        f0.e(new Runnable() { // from class: k5.r0
            @Override // java.lang.Runnable
            public final void run() {
                this.f86123b.a(context);
            }
        });
    }

    public final /* synthetic */ void a(Context context) {
        String strA = a();
        gb.a("MetricMessage: Send metrics message - \n " + strA);
        m2.a().a("https://ad.mail.ru/sdk/ms/", Base64.encodeToString(strA.getBytes(StandardCharsets.UTF_8), 0), context);
    }

    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : this.f59811a.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("events", jSONArray);
            for (Map.Entry entry2 : this.f59812b.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", entry2.getKey());
                jSONObject2.put("value", entry2.getValue());
                jSONArray.put(jSONObject2);
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }
}
