package com.taurusx.tax.y.w;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.taurusx.tax.g.b;
import com.taurusx.tax.g.n;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.w.s.s;
import com.taurusx.tax.y.c.c;
import com.taurusx.tax.y.s.o;
import com.taurusx.tax.y.z.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f67688g = "LogReport";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f67689a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.taurusx.tax.y.z.z f67690c;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HandlerThread f67691n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f67692o = com.taurusx.tax.w.o.w.T();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f67693s = com.taurusx.tax.w.o.w.S();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Runnable f67694t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f67695w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public com.taurusx.tax.y.o.z f67696y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Context f67697z;

    public interface c {
        void z(boolean z10);
    }

    public class w implements c {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f67698w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f67700z;

        public w(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
            this.f67700z = atomicBoolean;
            this.f67698w = countDownLatch;
        }

        @Override // com.taurusx.tax.y.w.y.c
        public void z(boolean z10) {
            this.f67700z.set(z10);
            this.f67698w.countDown();
        }
    }

    /* JADX INFO: renamed from: com.taurusx.tax.y.w.y$y, reason: collision with other inner class name */
    public class C0834y implements c.w {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ c f67702z;

        public C0834y(c cVar) {
            this.f67702z = cVar;
        }

        @Override // com.taurusx.tax.y.c.c.w
        public void z(String str) {
            this.f67702z.z(true);
        }

        @Override // com.taurusx.tax.y.c.c.w
        public void z(int i10) {
            if (i10 == 204) {
                this.f67702z.z(true);
                return;
            }
            y.this.w("doTrack data Fail StatusCode: " + i10);
            this.f67702z.z(false);
        }
    }

    public class z implements Runnable {
        public z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                y.this.w("Log report, trying...");
                y yVar = y.this;
                yVar.z(yVar.f67697z);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            y.this.f67689a.postDelayed(this, y.this.f67692o);
        }
    }

    public y(com.taurusx.tax.y.o.z zVar, com.taurusx.tax.y.z.z zVar2) {
        this.f67694t = null;
        this.f67696y = zVar;
        this.f67690c = zVar2;
        HandlerThread handlerThread = new HandlerThread("taurusx-log");
        this.f67691n = handlerThread;
        handlerThread.start();
        this.f67689a = new Handler(this.f67691n.getLooper());
        this.f67694t = new z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(String str) {
        Log.d(f67688g, str);
    }

    public synchronized void w(Context context) {
        if (this.f67695w) {
            Log.d(f67688g, "Has Started");
            return;
        }
        Log.d(f67688g, "Start");
        this.f67695w = true;
        this.f67697z = context.getApplicationContext();
        this.f67689a.post(this.f67694t);
    }

    private JSONObject z(Context context, List<JSONObject> list) {
        JSONObject jSONObject = null;
        try {
            String strY = b.z().y(context, b.f66091m);
            if (TextUtils.isEmpty(strY)) {
                return null;
            }
            JSONObject jSONObject2 = new JSONObject(strY);
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<JSONObject> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("events", jSONArray);
                return jSONObject2;
            } catch (Error e10) {
                e = e10;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            } catch (Exception e11) {
                e = e11;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (Error e12) {
            e = e12;
        } catch (Exception e13) {
            e = e13;
        }
        e.printStackTrace();
        return jSONObject;
    }

    public void z(long j10) {
        this.f67689a.removeCallbacks(this.f67694t);
        this.f67689a.postDelayed(this.f67694t, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(Context context) {
        if (!o.y(context.getApplicationContext())) {
            w("Network Not Connected");
            return;
        }
        String strA = this.f67696y.a();
        if (TextUtils.isEmpty(strA)) {
            w("track data host is empty");
            return;
        }
        if (!com.taurusx.tax.w.o.w.V() || LogUtil.isLogExpired()) {
            return;
        }
        int iW = this.f67690c.w();
        Log.d("taurusx", "log cacheCount: " + iW);
        if (iW > 0) {
            z(strA);
        }
        if (iW > this.f67693s) {
            z(500L);
        }
    }

    private void z(String str) {
        JSONObject jSONObjectZ;
        List<z.s> listW = this.f67690c.w(this.f67693s);
        if (listW.isEmpty()) {
            return;
        }
        w("Need Report, getCache Log Size: " + listW.size());
        String str2 = "";
        for (z.s sVar : listW) {
            str2 = str2 + sVar.f67739y + "  " + sVar.f67738w + ": " + sVar.f67737c + IOUtils.LINE_SEPARATOR_UNIX;
        }
        JSONObject jSONObjectW = s.z().w(str2);
        if (jSONObjectW == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(jSONObjectW);
        if (arrayList.isEmpty() || (jSONObjectZ = z(this.f67697z, arrayList)) == null) {
            return;
        }
        if (this.f67696y.o() != null) {
            this.f67696y.o().z(jSONObjectZ);
        }
        if (z(str, jSONObjectZ)) {
            w("Send Cached Event Success, Remove From Cache");
            this.f67690c.w(listW);
        }
    }

    private boolean z(String str, JSONObject jSONObject) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        z(str, com.taurusx.tax.g.z.z(com.taurusx.tax.y.s.y.z(jSONObject.toString(), "UTF-8"), this.f67696y.w(), this.f67696y.z()), new w(atomicBoolean, countDownLatch));
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            w("Wait event sending result ok " + countDownLatch.await(60L, TimeUnit.SECONDS) + ", " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return atomicBoolean.get();
    }

    private void z(String str, byte[] bArr, c cVar) {
        if (bArr != null && bArr.length != 0) {
            HashMap map = new HashMap();
            map.put("Connection", "keep-Alive");
            String str2 = n.R;
            map.put("Content-Encoding", str2);
            map.put("x-ssp-ce", str2);
            com.taurusx.tax.y.c.c.z(str, map, bArr, 15, new C0834y(cVar));
            return;
        }
        cVar.z(false);
    }
}
