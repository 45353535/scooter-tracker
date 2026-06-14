package com.taurusx.tax.y.w;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.ironsource.N6;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.g.b;
import com.taurusx.tax.g.d0;
import com.taurusx.tax.g.e0;
import com.taurusx.tax.g.n;
import com.taurusx.tax.g.t;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.y.c.w;
import com.taurusx.tax.y.s.a;
import com.taurusx.tax.y.s.s;
import com.taurusx.tax.y.z.z;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f67670f = "EventReport";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.taurusx.tax.y.z.z f67672c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f67673g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Handler f67674n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f67675o;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public HandlerThread f67677t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f67678w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public com.taurusx.tax.y.o.z f67679y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Context f67680z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f67676s = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67671a = 20;

    public class c implements w.InterfaceC0830w {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ o f67682z;

        public c(o oVar) {
            this.f67682z = oVar;
        }

        @Override // com.taurusx.tax.y.c.w.InterfaceC0830w
        public void z(String str) {
            this.f67682z.z(true);
        }

        @Override // com.taurusx.tax.y.c.w.InterfaceC0830w
        public void z(int i10) {
            if (i10 == 204) {
                this.f67682z.z(true);
                return;
            }
            w.this.w("doTrack data Fail StatusCode: " + i10);
            this.f67682z.z(false);
        }
    }

    public interface o {
        void z(boolean z10);
    }

    /* JADX INFO: renamed from: com.taurusx.tax.y.w.w$w, reason: collision with other inner class name */
    public class RunnableC0833w implements Runnable {
        public RunnableC0833w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(w.f67670f, "Timer report, trying...");
                w wVar = w.this;
                wVar.z(wVar.f67680z);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            w.this.f67674n.postDelayed(this, w.this.f67676s);
        }
    }

    public class y implements o {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f67684w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f67686z;

        public y(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            this.f67686z = atomicBoolean;
            this.f67684w = countDownLatch;
        }

        @Override // com.taurusx.tax.y.w.w.o
        public void z(boolean z10) {
            this.f67686z.set(z10);
            this.f67684w.countDown();
        }
    }

    public class z implements Runnable {
        public z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.w();
        }
    }

    public w(com.taurusx.tax.y.o.z zVar, com.taurusx.tax.y.z.z zVar2) {
        this.f67673g = null;
        this.f67679y = zVar;
        this.f67672c = zVar2;
        HandlerThread handlerThread = new HandlerThread("taurusx-event");
        this.f67677t = handlerThread;
        handlerThread.start();
        this.f67674n = new Handler(this.f67677t.getLooper());
        this.f67673g = new RunnableC0833w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(String str) {
        LogUtil.d(f67670f, str);
    }

    public void y(String str) {
        z(str, false);
    }

    public JSONObject w(Context context) {
        JSONObject jSONObject = new JSONObject();
        z(context, jSONObject);
        return jSONObject;
    }

    public synchronized void y(Context context) {
        if (this.f67678w) {
            Log.d(f67670f, "Has Started");
            return;
        }
        Log.d(f67670f, "Start");
        this.f67678w = true;
        this.f67680z = context.getApplicationContext();
        this.f67674n.post(this.f67673g);
    }

    public void w() {
        this.f67674n.removeCallbacks(this.f67673g);
        this.f67674n.post(this.f67673g);
    }

    public void z(String str, boolean z10) {
        this.f67672c.z(str, z10 ? new z() : null);
    }

    private JSONObject z(Context context, List<JSONObject> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<JSONObject> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("events", jSONArray);
            z(context, jSONObject);
            return jSONObject;
        } catch (Error e10) {
            e = e10;
            e.printStackTrace();
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            e.printStackTrace();
            return jSONObject;
        }
    }

    public void z(long j10) {
        this.f67674n.removeCallbacks(this.f67673g);
        this.f67674n.postDelayed(this.f67673g, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(Context context) {
        if (!com.taurusx.tax.y.s.o.y(context.getApplicationContext())) {
            w("Network Not Connected");
            return;
        }
        String strA = this.f67679y.a();
        if (TextUtils.isEmpty(strA)) {
            w("track data host is empty");
            return;
        }
        int iZ = this.f67672c.z();
        if (iZ > 0) {
            z(strA);
        }
        if (iZ > this.f67671a) {
            z(500L);
        }
    }

    private void z(String str) {
        JSONObject jSONObject;
        List<z.o> listZ = this.f67672c.z(this.f67671a);
        if (listZ.isEmpty()) {
            return;
        }
        w("Need Report, getCache Event Size: " + listZ.size());
        ArrayList arrayList = new ArrayList();
        Iterator<z.o> it = listZ.iterator();
        while (it.hasNext()) {
            try {
                jSONObject = new JSONObject(it.next().f67735w);
            } catch (Error | Exception e10) {
                e10.printStackTrace();
                jSONObject = null;
            }
            if (jSONObject != null) {
                arrayList.add(jSONObject);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        JSONObject jSONObjectZ = z(this.f67680z, arrayList);
        if (this.f67679y.o() != null) {
            this.f67679y.o().z(jSONObjectZ);
        }
        if (z(str, jSONObjectZ)) {
            w("Send Cached Event Success, Remove From Cache");
            this.f67672c.z(listZ);
            this.f67675o = System.currentTimeMillis();
        }
    }

    private boolean z(String str, JSONObject jSONObject) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        z(str, com.taurusx.tax.g.z.z(com.taurusx.tax.y.s.y.z(jSONObject.toString(), "UTF-8"), this.f67679y.w(), this.f67679y.z()), new y(atomicBoolean, countDownLatch));
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            w("Wait event sending result ok " + countDownLatch.await(60L, TimeUnit.SECONDS) + ", " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return atomicBoolean.get();
    }

    private void z(String str, byte[] bArr, o oVar) {
        if (bArr != null && bArr.length != 0) {
            HashMap map = new HashMap();
            map.put("Connection", "keep-Alive");
            String str2 = n.R;
            map.put("Content-Encoding", str2);
            map.put("x-ssp-ce", str2);
            com.taurusx.tax.y.c.w.z(str, map, bArr, 15, new c(oVar));
            return;
        }
        oVar.z(false);
    }

    private void z(Context context, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("zo", (TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000) / 60);
            long jW = com.taurusx.tax.y.s.w.w(context);
            if (jW > 0) {
                jSONObject.put("fit", jW);
            }
            jSONObject.put("flt", a.w().y(com.taurusx.tax.y.w.z.f67704w));
            jSONObject.put("lbt", com.taurusx.tax.y.s.w.o(context));
            jSONObject.put("lit", com.taurusx.tax.y.s.w.s(context));
            jSONObject.put(e0.f66120c, e0.y(TaurusXAds.getContext()));
            jSONObject.put("aid", this.f67679y.t().s(context));
            jSONObject.put(N6.V0, this.f67679y.t().y(context));
            jSONObject.put(CommonUrlParts.HUAWEI_OAID, this.f67679y.t().c(context));
            jSONObject.put(N6.f41413q, Locale.getDefault().getLanguage() + TokenBuilder.TOKEN_DELIMITER + Locale.getDefault().getCountry());
            jSONObject.put("bundle", context.getPackageName());
            jSONObject.put("appid", this.f67679y.y());
            jSONObject.put(N6.f41422t, Build.MANUFACTURER);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("os", 2);
            jSONObject.put(N6.G, Build.VERSION.RELEASE);
            jSONObject.put("build", Build.DISPLAY);
            jSONObject.put("app_ver", com.taurusx.tax.y.s.z.y(context));
            jSONObject.put("app_ver_code", String.valueOf(com.taurusx.tax.y.s.z.w(context)));
            jSONObject.put("sdk_ver", this.f67679y.g());
            jSONObject.put("sdk_ver_name", this.f67679y.f());
            jSONObject.put("width", s.w(context));
            jSONObject.put("height", s.z(context));
            jSONObject.put("contype", com.taurusx.tax.y.s.o.w(context));
            jSONObject.put("cpu", com.taurusx.tax.y.s.w.z());
            jSONObject.put(N6.Q0, com.taurusx.tax.y.s.w.a(context));
            jSONObject.put("vc", com.taurusx.tax.y.s.w.w() ? 1 : 2);
            jSONObject.put("ls", com.taurusx.tax.y.s.w.n(context) ? 1 : 2);
            jSONObject.put("kss", com.taurusx.tax.y.s.w.c(context));
            jSONObject.put("signature_sha1", com.taurusx.tax.g.w.c(TaurusXAds.getContext()));
            jSONObject.put("devtype", t.y(context));
            jSONObject.put(N6.f41375d0, d0.w(context));
            jSONObject.put(EidRequestBuilder.REQUEST_FIELD_LMT, this.f67679y.t().z(context) ? "1" : "0");
            jSONObject.put("lmt_oaid", this.f67679y.t().w(context) ? "1" : "0");
            jSONObject.put("hwv", Build.HARDWARE);
            jSONObject.put("pxratio", t.s(context));
            jSONObject.put("ccpa_do_not_sell", com.taurusx.tax.w.z.t().y());
            jSONObject.put("coppa_is_age_restricted_user", com.taurusx.tax.w.z.t().s());
            jSONObject.put("gdpr_data_collection", com.taurusx.tax.w.z.t().n());
            jSONObject.put("lgpd_consent", com.taurusx.tax.w.z.t().g());
            jSONObject.put("country", com.taurusx.tax.g.p0.w.z());
            if (!TextUtils.isEmpty(com.taurusx.tax.w.z.t().c())) {
                jSONObject.put(AppsFlyerProperties.CHANNEL, com.taurusx.tax.w.z.t().c());
            }
            if (TextUtils.isEmpty(b.z().y(context, b.f66091m))) {
                b.z().y(context, b.f66091m, jSONObject.toString());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
