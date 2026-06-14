package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C4246ba;
import com.ironsource.C4424m2;
import com.ironsource.C4427m5;
import com.ironsource.C4460o2;
import com.ironsource.C4462o4;
import com.ironsource.K9;
import com.ironsource.R1;
import com.ironsource.X1;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43993a = "1";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43994b = "102";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f43995c = "102";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f43996d = "GenericNotifications";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f43997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IronSource.a f43998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C4460o2 f43999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private R1 f44000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ISBannerSize f44001i;

    public e(f fVar) {
        this.f43997e = fVar;
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i10, C4246ba c4246ba, ISBannerSize iSBannerSize) {
        this.f44001i = iSBannerSize;
        a(context, map, list, hVar, i10, c4246ba);
    }

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected R1 f44002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected d.a f44003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected int f44004c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected String f44005d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected long f44006e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected int f44007f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f44009h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final URL f44012k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final JSONObject f44013l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f44014m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f44015n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final long f44016o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f44017p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final boolean f44018q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f44019r;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        protected String f44010i = "";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        protected int f44011j = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected String f44008g = a((Integer) null);

        public a(R1 r12, URL url, JSONObject jSONObject, boolean z10, C4460o2 c4460o2) {
            this.f44002a = r12;
            this.f44012k = url;
            this.f44013l = jSONObject;
            this.f44014m = z10;
            this.f44015n = c4460o2.g();
            this.f44016o = c4460o2.m();
            this.f44017p = c4460o2.o();
            this.f44018q = c4460o2.p();
            this.f44009h = c4460o2.d();
            this.f44019r = c4460o2.n();
        }

        private void a(long j10, long j11) {
            long time = j10 - (new Date().getTime() - j11);
            if (time > 0) {
                SystemClock.sleep(time);
            }
        }

        protected boolean b() {
            long time;
            IronLog ironLog;
            int responseCode;
            this.f44006e = new Date().getTime();
            try {
                this.f44009h = this.f44011j == 1015 ? 1 : this.f44009h;
                this.f44007f = 0;
                HttpURLConnection httpURLConnectionA = null;
                while (true) {
                    int i10 = this.f44007f;
                    int i11 = this.f44015n;
                    if (i10 >= i11) {
                        this.f44007f = i11 - 1;
                        this.f44008g = a(Integer.valueOf(this.f44004c));
                        return false;
                    }
                    try {
                        time = new Date().getTime();
                        String str = "Auction Handler: auction trial " + (this.f44007f + 1) + " out of " + this.f44015n + " max trials";
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, str, 0);
                        IronSourceUtils.i(str);
                        httpURLConnectionA = a(this.f44012k, this.f44016o);
                        ironLog = IronLog.INTERNAL;
                        ironLog.verbose("parameters for auction url: " + this.f44012k.getQuery());
                        ironLog.verbose("parameters for auction POST data: " + this.f44013l);
                        a(httpURLConnectionA, this.f44013l, this.f44017p);
                        responseCode = httpURLConnectionA.getResponseCode();
                    } catch (SocketTimeoutException e10) {
                        C4462o4.d().a(e10);
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        this.f44004c = 1006;
                        this.f44005d = "Connection timed out";
                        IronLog.INTERNAL.error("Auction socket timeout exception " + e10.getMessage());
                    } catch (Throwable th2) {
                        C4462o4.d().a(th2);
                        IronLog.INTERNAL.error("getting exception " + th2);
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        this.f44004c = 1000;
                        this.f44005d = th2.getMessage();
                        this.f44008g = a(Integer.valueOf(this.f44004c));
                        return false;
                    }
                    if (responseCode == 200 || responseCode == 204) {
                        try {
                            a(a(httpURLConnectionA), this.f44014m, this.f44018q);
                            httpURLConnectionA.disconnect();
                            return true;
                        } catch (JSONException e11) {
                            C4462o4.d().a(e11);
                            if (e11.getMessage() != null && e11.getMessage().equalsIgnoreCase("decryption error")) {
                                this.f44004c = 1003;
                                this.f44005d = "Auction decryption error";
                            } else if (e11.getMessage() == null || !e11.getMessage().equalsIgnoreCase("decompression error")) {
                                this.f44004c = 1002;
                                this.f44005d = "Auction parsing error";
                            } else {
                                this.f44004c = 1008;
                                this.f44005d = "Auction decompression error";
                            }
                            this.f44008g = a(Integer.valueOf(this.f44004c));
                            IronLog.INTERNAL.error("Auction handle response exception " + e11.getMessage());
                            httpURLConnectionA.disconnect();
                            return false;
                        }
                    }
                    this.f44004c = 1001;
                    String str2 = "Auction response code not valid, error code response from server - " + responseCode;
                    this.f44005d = str2;
                    ironLog.error(str2);
                    httpURLConnectionA.disconnect();
                    if (this.f44007f < this.f44015n - 1) {
                        a(this.f44016o, time);
                    }
                    this.f44007f++;
                }
            } catch (Exception e12) {
                C4462o4.d().a(e12);
                this.f44004c = 1007;
                this.f44005d = e12.getMessage();
                this.f44007f = 0;
                this.f44008g = a(Integer.valueOf(this.f44004c));
                IronLog.INTERNAL.error("Auction request exception " + e12.getMessage());
                return false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zB = b();
            R1 r12 = this.f44002a;
            if (r12 == null) {
                return;
            }
            a(zB, r12, new Date().getTime() - this.f44006e);
        }

        private String a() {
            if (this.f44009h == 2) {
                return C4427m5.b().d();
            }
            return C4427m5.b().c();
        }

        private void a(HttpURLConnection httpURLConnection, JSONObject jSONObject, boolean z10) throws Exception {
            String strA;
            String strE;
            String str;
            OutputStream outputStream = httpURLConnection.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            if (this.f44009h == 2) {
                try {
                    strA = C4427m5.b().a();
                } catch (JSONException e10) {
                    C4462o4.d().a(e10);
                    this.f44010i = e10.getLocalizedMessage();
                    this.f44011j = 1015;
                    this.f44009h = 1;
                    IronLog.INTERNAL.error("get encrypted session key exception " + e10.getMessage());
                    strA = "";
                }
            } else {
                strA = "";
            }
            String string = jSONObject.toString();
            String strA2 = a();
            if (z10) {
                IronLog.INTERNAL.verbose("compressing and encrypting auction request");
                strE = K9.a(strA2, string);
            } else {
                strE = K9.e(strA2, string);
            }
            if (this.f44009h == 2) {
                str = String.format("{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}", strA, strE);
            } else {
                str = String.format("{\"request\" : \"%1$s\"}", strE);
            }
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            outputStream.close();
        }

        private HttpURLConnection a(URL url, long j10) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setReadTimeout((int) j10);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            return httpURLConnection;
        }

        protected JSONObject a(JSONObject jSONObject, boolean z10) throws JSONException {
            String str;
            String strA = a();
            if (this.f44009h == 2) {
                str = ApsMetricsDataMap.APSMETRICS_FIELD_CONNECTIONTYPE;
            } else {
                str = "response";
            }
            String string = jSONObject.getString(str);
            if (z10) {
                return b(strA, string);
            }
            return a(strA, string);
        }

        protected void a(String str, boolean z10, boolean z11) throws JSONException {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (z10) {
                    jSONObject = a(jSONObject, z11);
                }
                d.a aVarA = d.b().a(jSONObject);
                this.f44003b = aVarA;
                this.f44004c = aVarA.c();
                this.f44005d = this.f44003b.d();
                return;
            }
            throw new JSONException("empty response");
        }

        private JSONObject a(String str, String str2) throws JSONException {
            String strB = K9.b(str, str2);
            if (!TextUtils.isEmpty(strB)) {
                return new JSONObject(strB);
            }
            throw new JSONException("decryption error");
        }

        private String a(HttpURLConnection httpURLConnection) throws IOException {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb2.toString();
                }
            }
        }

        private JSONObject b(String str, String str2) throws JSONException {
            IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
            String strD = K9.d(str, str2);
            if (strD != null) {
                return new JSONObject(strD);
            }
            throw new JSONException("decompression error");
        }

        protected void a(boolean z10, R1 r12, long j10) {
            if (z10) {
                r12.a(this.f44003b.h(), this.f44003b.a(), this.f44003b.e(), this.f44003b.f(), this.f44003b.b(), this.f44007f + 1, j10, this.f44011j, this.f44010i);
            } else {
                r12.a(this.f44004c, this.f44005d, this.f44007f + 1, this.f44008g, j10);
            }
        }

        private String a(Integer num) {
            return X1.f42009a.a(this.f44019r, num);
        }
    }

    public void a(Context context, i iVar, R1 r12) {
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f43997e.a(context, iVar, r12));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error("execute auction exception " + e10.getMessage());
            if (r12 != null) {
                r12.a(1000, e10.getMessage(), 0, X1.f42009a.a(this.f43997e.a(), 1000), 0L);
            }
        }
    }

    @Deprecated
    public e(IronSource.a aVar, C4460o2 c4460o2, R1 r12) {
        this.f43998f = aVar;
        this.f43999g = c4460o2;
        this.f44000h = r12;
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i10, C4246ba c4246ba) {
        e eVar;
        try {
            boolean zG = IronSourceUtils.g();
            eVar = this;
            try {
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(eVar.f44000h, new URL(eVar.f43999g.a(false)), eVar.a(map, list, hVar, i10, zG, c4246ba), zG, eVar.f43999g));
            } catch (Exception e10) {
                e = e10;
                Exception exc = e;
                C4462o4.d().a(exc);
                IronLog.INTERNAL.error("execute auction exception " + exc.getMessage());
                eVar.f44000h.a(1000, exc.getMessage(), 0, X1.f42009a.a(eVar.f43999g.n(), 1000), 0L);
            }
        } catch (Exception e11) {
            e = e11;
            eVar = this;
        }
    }

    public void a(C4424m2 c4424m2, int i10, C4424m2 c4424m22, String str) {
        Iterator<String> it = c4424m2.b().iterator();
        while (it.hasNext()) {
            C4424m2 c4424m23 = c4424m2;
            int i11 = i10;
            String str2 = str;
            d.b().a("reportImpression", c4424m23.c(), d.b().a(it.next(), i11, c4424m23, "", "", str2));
            i10 = i11;
            c4424m2 = c4424m23;
            str = str2;
        }
        C4424m2 c4424m24 = c4424m2;
        int i12 = i10;
        String str3 = str;
        if (c4424m22 != null) {
            Iterator<String> it2 = c4424m22.b().iterator();
            while (it2.hasNext()) {
                d.b().a("reportImpression", "GenericNotifications", d.b().a(it2.next(), i12, c4424m24, "", "102", str3));
            }
        }
    }

    public void a(C4424m2 c4424m2, int i10, C4424m2 c4424m22) {
        Iterator<String> it = c4424m2.h().iterator();
        while (it.hasNext()) {
            C4424m2 c4424m23 = c4424m2;
            int i11 = i10;
            d.b().a("reportLoadSuccess", c4424m23.c(), d.b().a(it.next(), i11, c4424m23, "", "", ""));
            i10 = i11;
            c4424m2 = c4424m23;
        }
        C4424m2 c4424m24 = c4424m2;
        int i12 = i10;
        if (c4424m22 != null) {
            Iterator<String> it2 = c4424m22.h().iterator();
            while (it2.hasNext()) {
                d.b().a("reportLoadSuccess", "GenericNotifications", d.b().a(it2.next(), i12, c4424m24, "", "102", ""));
            }
        }
    }

    public void a(CopyOnWriteArrayList<A> copyOnWriteArrayList, ConcurrentHashMap<String, C4424m2> concurrentHashMap, int i10, C4424m2 c4424m2, C4424m2 c4424m22) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<A> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        a(arrayList, concurrentHashMap, i10, c4424m2, c4424m22);
    }

    public void a(ArrayList<String> arrayList, ConcurrentHashMap<String, C4424m2> concurrentHashMap, int i10, C4424m2 c4424m2, C4424m2 c4424m22) {
        int iJ = c4424m22.j();
        for (String str : arrayList) {
            if (!str.equals(c4424m22.c())) {
                C4424m2 c4424m23 = concurrentHashMap.get(str);
                int iJ2 = c4424m23.j();
                String strI = c4424m23.i();
                String str2 = iJ2 < iJ ? "1" : "102";
                IronLog.INTERNAL.verbose("instance=" + c4424m23.c() + ", instancePriceOrder= " + iJ2 + ", loseReasonCode=" + str2 + ", winnerInstance=" + c4424m22.c() + ", winnerInstancePriceOrder=" + iJ);
                Iterator<String> it = c4424m23.g().iterator();
                while (it.hasNext()) {
                    d.b().a("reportAuctionLose", c4424m23.c(), d.b().a(it.next(), i10, c4424m22, strI, str2, ""));
                }
            }
        }
        if (c4424m2 != null) {
            Iterator<String> it2 = c4424m2.g().iterator();
            while (it2.hasNext()) {
                d.b().a("reportAuctionLose", "GenericNotifications", d.b().a(it2.next(), i10, c4424m22, "", "102", ""));
            }
        }
    }

    private JSONObject a(Map<String, Object> map, List<String> list, h hVar, int i10, boolean z10, C4246ba c4246ba) throws JSONException {
        i iVar = new i(this.f43998f);
        iVar.a(map);
        iVar.a(list);
        iVar.a(hVar);
        iVar.a(i10);
        iVar.a(this.f44001i);
        iVar.a(c4246ba);
        iVar.b(z10);
        return d.b().a(iVar);
    }

    public boolean a() {
        return this.f43997e.b();
    }
}
