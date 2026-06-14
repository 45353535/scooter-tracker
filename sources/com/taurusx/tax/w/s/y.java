package com.taurusx.tax.w.s;

import android.content.Context;
import android.text.TextUtils;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.c.z;
import com.taurusx.tax.g.f;
import com.taurusx.tax.g.u;
import com.taurusx.tax.log.LogUtil;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static y f67542g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f67543a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ExecutorService f67544c;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f67545n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ScheduledExecutorService f67548t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Context f67549w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public File f67550y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f67551z = "EventTrackCache";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f67546o = "taurusx_track_cache";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f67547s = "taurusx_track_";

    public class c implements Runnable {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public WeakReference<Context> f67553z;

        public class w implements z.w {

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Context f67554w;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public final /* synthetic */ o f67556z;

            public w(o oVar, Context context) {
                this.f67556z = oVar;
                this.f67554w = context;
            }

            @Override // com.taurusx.tax.c.z.w
            public void z(int i10, String str, String str2) {
                LogUtil.v("taurusx", "send cache result code : [" + i10 + "], msg : " + str + " , url : " + this.f67556z.f67563w);
                if (i10 < 200 || i10 >= 400) {
                    return;
                }
                y.z(this.f67554w).z(this.f67556z);
            }
        }

        public class z implements z.w {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f67557c;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ String f67558o;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Context f67560w;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public final /* synthetic */ String f67561y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public final /* synthetic */ o f67562z;

            public z(o oVar, Context context, String str, long j10, String str2) {
                this.f67562z = oVar;
                this.f67560w = context;
                this.f67561y = str;
                this.f67557c = j10;
                this.f67558o = str2;
            }

            @Override // com.taurusx.tax.c.z.w
            public void z(int i10, String str, String str2) {
                LogUtil.v("taurusx", "send cache result code : [" + i10 + "], msg : " + str + " , url : " + this.f67562z.f67563w);
                if (i10 >= 200 && i10 < 400) {
                    y.z(this.f67560w).z(this.f67562z);
                }
                s.z().z(this.f67561y, i10, str, str2, this.f67557c, this.f67558o);
            }
        }

        public c(Context context) {
            this.f67553z = new WeakReference<>(context);
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            boolean z10;
            Context context;
            y yVar = y.this;
            if (yVar.f67543a) {
                return;
            }
            yVar.f67545n = System.currentTimeMillis();
            try {
                try {
                    WeakReference<Context> weakReference = this.f67553z;
                    if (weakReference != null && (context = weakReference.get()) != null) {
                        y.this.f67543a = true;
                        if (!u.w(context)) {
                            try {
                                LogUtil.v("taurusx", "Network Is Not Connected");
                                y yVar2 = y.this;
                                yVar2.f67543a = false;
                                yVar2.f67548t.shutdown();
                                y.this.f67548t = null;
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                z10 = false;
                                y yVar3 = y.this;
                                yVar3.f67543a = z10;
                                yVar3.f67548t.shutdown();
                                y.this.f67548t = null;
                                throw th;
                            }
                        }
                        List<o> listY = y.z(context).y();
                        if (listY != null && !listY.isEmpty()) {
                            for (o oVar : listY) {
                                if (oVar != null && !TextUtils.isEmpty(oVar.f67563w) && !TextUtils.isEmpty(oVar.f67564z)) {
                                    LogUtil.v("taurusx", oVar.f67563w + " track cache file name " + oVar.f67564z);
                                    JSONObject jSONObject = new JSONObject(oVar.f67563w);
                                    String strOptString = jSONObject.optString("url");
                                    String strOptString2 = jSONObject.optString("request");
                                    long jOptLong = jSONObject.optLong(s.J);
                                    String strOptString3 = jSONObject.optString("trackName");
                                    jSONObject.remove("url");
                                    jSONObject.remove("request");
                                    if ("get".equals(strOptString2)) {
                                        com.taurusx.tax.c.z.z(strOptString, 2, null, new z(oVar, context, strOptString, jOptLong, strOptString3));
                                    } else if ("post".equals(strOptString2)) {
                                        com.taurusx.tax.c.z.z(strOptString, 2, (Map<String, String>) null, jSONObject.toString(), new w(oVar, context));
                                    }
                                }
                            }
                        }
                        LogUtil.v("taurusx", "No Cached Track");
                        y yVar4 = y.this;
                        yVar4.f67543a = false;
                        yVar4.f67548t.shutdown();
                        y.this.f67548t = null;
                        return;
                    }
                } catch (Error | Exception e10) {
                    e10.printStackTrace();
                }
                y yVar5 = y.this;
                yVar5.f67543a = false;
                yVar5.f67548t.shutdown();
                y.this.f67548t = null;
            } catch (Throwable th3) {
                th = th3;
                z10 = false;
            }
        }
    }

    public static class o {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public String f67563w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f67564z;
    }

    public class w implements Runnable {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f67566z;

        public w(String str) {
            this.f67566z = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strW = y.this.w(this.f67566z);
                LogUtil.v("taurusx", "the filename is " + strW);
                f.z(this.f67566z, y.this.f67550y, strW, false);
            } catch (Error | Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.taurusx.tax.w.s.y$y, reason: collision with other inner class name */
    public class RunnableC0828y implements Runnable {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ o f67568z;

        public RunnableC0828y(o oVar) {
            this.f67568z = oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                File file = new File(y.this.f67550y, this.f67568z.f67564z);
                if (file.exists()) {
                    file.delete();
                }
            } catch (Error | Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public class z implements FilenameFilter {
        public z() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith("taurusx_track_");
        }
    }

    public y(Context context) {
        this.f67549w = context;
        File file = new File(w());
        this.f67550y = file;
        if (!file.exists()) {
            this.f67550y.mkdirs();
        }
        this.f67544c = com.taurusx.tax.g.r0.c.w();
    }

    public List<o> y() throws Throwable {
        File[] fileArrListFiles = this.f67550y.listFiles(new z());
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            String strY = f.y(file);
            if (!TextUtils.isEmpty(strY)) {
                o oVar = new o();
                oVar.f67564z = file.getName();
                oVar.f67563w = strY;
                arrayList.add(oVar);
            }
        }
        return arrayList;
    }

    private String w() {
        return this.f67549w.getFilesDir().getAbsolutePath().concat(File.separator).concat("taurusx_track_cache");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String w(String str) {
        return "taurusx_track_".concat(String.valueOf(str.hashCode())).concat("_").concat(String.valueOf(System.currentTimeMillis()));
    }

    public static y z(Context context) {
        if (f67542g == null) {
            synchronized (y.class) {
                try {
                    if (f67542g == null) {
                        f67542g = new y(context != null ? context.getApplicationContext() : TaurusXAds.getContext());
                    }
                } finally {
                }
            }
        }
        return f67542g;
    }

    public void z(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f67544c.execute(new w(str));
    }

    public void z(o oVar) {
        this.f67544c.execute(new RunnableC0828y(oVar));
    }

    public void z() {
        if (this.f67543a || System.currentTimeMillis() - this.f67545n < 15000 || this.f67548t != null) {
            return;
        }
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f67548t = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new c(this.f67549w), 1L, TimeUnit.SECONDS);
    }
}
