package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.DisplayMetrics;
import androidx.core.app.NotificationCompat;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.ironsource.N6;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class z1 {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Collection f65630i0;
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public final String K;
    public int L;
    public int M;
    public float N;
    public Boolean O;
    public final int P;
    public String Q;
    public String R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public String X;
    public String Y;
    public final int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f65631a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Long f65632a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f65633b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Integer f65634b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f65635c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Boolean f65636c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TreeMap f65637d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Boolean f65638d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f65639e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Boolean f65640e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f65641f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Boolean f65642f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l0 f65643g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public v0 f65644g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f65645h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f65646h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f65647i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f65648j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f65649k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f65650l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f65651m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f65652n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public cc f65653o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public fa f65654p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Boolean f65655q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Boolean f65656r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f65657s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f65658t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f65659u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f65660v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f65661w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f65662x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f65663y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f65664z;

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            arrayList.add(23);
        }
        if (i10 >= 26) {
            arrayList.add(22);
        }
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(8);
        f65630i0 = DesugarCollections.unmodifiableCollection(arrayList);
    }

    public z1(int i10) {
        new HashMap();
        this.f65635c = "5.2.4";
        this.f65637d = new TreeMap();
        this.K = "android";
        this.P = 3;
        this.Z = i10;
    }

    public Set a() {
        return Collections.EMPTY_SET;
    }

    public boolean b() {
        return false;
    }

    public final void c(Context context) {
        if (this.f65633b == null) {
            r0 r0Var = (r0) com.startapp.sdk.components.a.a(context).f64186m.a();
            String string = r0Var.f65178c;
            if (string == null) {
                synchronized (r0Var.f65176a) {
                    try {
                        string = r0Var.f65178c;
                        if (string == null) {
                            string = r0Var.f65177b.getString("c88d4eab540fab77", null);
                        }
                    } finally {
                    }
                }
            }
            this.f65631a = string;
            this.f65633b = r0Var.a();
        }
        this.f65645h = context.getPackageName();
    }

    public final void d(Context context) {
        f6 f6Var;
        this.f65657s = ud.a(context);
        String str = ((yh) com.startapp.sdk.components.a.a(context).f64180g.a()).f65617h;
        this.H = str;
        this.f65660v = str;
        try {
            f6Var = ((g6) com.startapp.sdk.components.a.a(context).f64193t.a()).f64549e;
        } catch (Throwable th2) {
            if (!vi.a(th2, RemoteException.class)) {
                g9.a(th2);
            }
        }
        int iA = f6Var != null ? f6Var.a() : -1;
        this.f65659u = iA;
    }

    public final void e(Context context) {
        mh mhVar = (mh) ((ph) com.startapp.sdk.components.a.a(context).f64179f.a()).b();
        Object objOpt = mhVar.f64941a.opt(String.valueOf(7));
        if ((objOpt instanceof Number ? ((Number) objOpt).intValue() : 0) == 5) {
            this.f65661w = mhVar.a(8);
            this.f65662x = mhVar.a(9);
            this.f65663y = mhVar.a(15);
            this.f65664z = mhVar.a(16);
        }
        Object objOpt2 = mhVar.f64941a.opt(String.valueOf(10));
        int iIntValue = objOpt2 instanceof Number ? ((Number) objOpt2).intValue() : 0;
        if (iIntValue != 0 && iIntValue != 2) {
            this.A = mhVar.a(11);
            this.B = mhVar.a(12);
        }
        this.C = mhVar.a(4);
        this.D = mhVar.a(3);
        this.E = mhVar.a(5);
        this.F = mhVar.a(1);
        this.G = mhVar.a(2);
        this.I = mhVar.a(13);
        Object objOpt3 = mhVar.f64941a.opt(String.valueOf(14));
        this.f65658t = (objOpt3 instanceof Number ? ((Number) objOpt3).intValue() : 0) == 1;
    }

    public final void a(Context context) {
        if (MetaData.E().s()) {
            return;
        }
        this.f65643g = ((com.startapp.sdk.common.advertisingid.b) com.startapp.sdk.components.a.a(context).f64181h.a()).a();
        try {
            this.f65648j = ((ia) com.startapp.sdk.components.a.a(context).f64184k.a()).a();
        } catch (Throwable th2) {
            g9.a(th2);
        }
        try {
            this.f65639e = ((vf) com.startapp.sdk.components.a.a(context).I.a()).getAll();
        } catch (Throwable th3) {
            g9.a(th3);
        }
    }

    public void b(Context context, AdPreferences adPreferences) {
        String str;
        boolean zA;
        DisplayMetrics displayMetrics;
        NetworkInfo activeNetworkInfo;
        this.Q = pg.f65112d.f65113a;
        this.f65651m = Build.MANUFACTURER;
        this.f65650l = Build.MODEL;
        this.f65652n = Integer.toString(Build.VERSION.SDK_INT);
        if (adPreferences != null) {
            this.f65641f = adPreferences.getAge(context);
        }
        this.f65647i = ((ah) ((bh) com.startapp.sdk.components.a.a(context).f64188o.a()).b()).f64285a;
        int i10 = q0.f65128a;
        boolean zA2 = false;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        this.R = str;
        this.S = q0.a(context);
        boolean z10 = Settings.Secure.getInt(context.getContentResolver(), "install_non_market_apps") == 1;
        this.f65655q = Boolean.valueOf(z10);
        this.T = q0.b(context);
        try {
            zA = ze.a(context);
        } catch (Throwable unused2) {
            zA = false;
        }
        this.U = zA;
        try {
            zA2 = v6.a(context);
        } catch (Throwable unused3) {
        }
        this.V = zA2;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f65656r = (connectivityManager == null || !q0.a(context, "android.permission.ACCESS_NETWORK_STATE") || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? null : Boolean.valueOf(activeNetworkInfo.isRoaming());
        this.W = vi.d(context);
        this.f65646h0 = vi.e(context);
        Resources resources = context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            this.L = displayMetrics.widthPixels;
            this.M = displayMetrics.heightPixels;
            this.N = displayMetrics.density;
        }
        com.startapp.sdk.components.a aVarA = com.startapp.sdk.components.a.a(context);
        this.f65653o = (cc) ((dc) aVarA.f64177d.a()).b();
        this.f65654p = (fa) ((ha) aVarA.f64178e.a()).b();
        vf vfVar = (vf) aVarA.G.a();
        this.X = vfVar.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", null);
        TreeMap treeMap = this.f65637d;
        String string = vfVar.getString("sharedPrefsWrappers", null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    treeMap.put(next, (String) jSONObject.get(next));
                }
            } catch (JSONException unused4) {
            }
        }
        this.O = Boolean.valueOf(vi.c(context));
    }

    public final void a(Context context, AdPreferences adPreferences) {
        try {
            this.f65644g0 = (v0) com.startapp.sdk.components.a.a(context).Q.a();
        } catch (Throwable th2) {
            g9.a(th2);
        }
        c(context);
        try {
            b(context, adPreferences);
        } catch (Throwable unused) {
        }
        try {
            d(context);
        } catch (Throwable th3) {
            g9.a(th3);
        }
        try {
            e(context);
        } catch (Throwable th4) {
            g9.a(th4);
        }
        try {
            this.f65649k = qg.a(context);
        } catch (Throwable th5) {
            g9.a(th5);
        }
        try {
            this.J = ((hf) com.startapp.sdk.components.a.a(context).f64182i.a()).a(this);
        } catch (Throwable th6) {
            g9.a(th6);
        }
        try {
            a(context);
        } catch (Throwable th7) {
            g9.a(th7);
        }
        try {
            b(context);
        } catch (Throwable th8) {
            g9.a(th8);
        }
    }

    public final s8 a(boolean z10) {
        hb hbVar = new hb(a());
        a(hbVar);
        byte[] bytes = hbVar.f64624b.toString().getBytes();
        String str = null;
        if (z10) {
            try {
                WeakHashMap weakHashMap = vi.f65408a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                bytes = byteArrayOutputStream.toByteArray();
                str = "gzip";
            } catch (IOException e10) {
                g9.a(e10);
            }
        }
        return new s8(bytes, D5.L, str);
    }

    public final String a(String str) {
        pd pdVar = new pd(a());
        a(pdVar);
        String string = pdVar.toString();
        if (str.contains("?") && string.startsWith("?")) {
            return str + C4240b4.j.f42670c + string.substring(1);
        }
        return str + string;
    }

    public void a(ve veVar) {
        Map map = this.f65639e;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                veVar.a((String) entry.getKey(), entry.getValue(), false, true);
            }
        }
        veVar.a("publisherId", this.f65631a, false, true);
        veVar.a(InAppPurchaseMetaData.KEY_PRODUCT_ID, this.f65633b, b(), true);
        veVar.a("os", this.K, true, true);
        veVar.a("sdkVersion", this.f65635c, false, true);
        veVar.a("flavor", 1023, false, true);
        TreeMap treeMap = this.f65637d;
        if (treeMap != null && !treeMap.isEmpty()) {
            String str = "";
            for (String str2 : this.f65637d.keySet()) {
                str = str + str2 + StringUtils.PROCESS_POSTFIX_DELIMITER + ((String) this.f65637d.get(str2)) + ";";
            }
            veVar.a("frameworksData", str.substring(0, str.length() - 1), false, false);
        }
        veVar.a("packageId", this.f65645h, false, true);
        veVar.a("installerPkg", this.f65647i, false, true);
        veVar.a("age", this.f65641f, false, true);
        l0 l0Var = this.f65643g;
        if (l0Var != null) {
            veVar.a("userAdvertisingId", l0Var.f64842a, false, true);
            boolean z10 = this.f65643g.f64844c;
            if (z10) {
                veVar.a("limat", Boolean.valueOf(z10), false, true);
            }
            veVar.a("advertisingIdSource", this.f65643g.f64843b, false, true);
        }
        String str3 = this.f65648j;
        if (str3 != null) {
            veVar.a("duid", str3, false, true);
        }
        String str4 = this.f65649k;
        if (str4 != null) {
            veVar.a("vendorId", str4, false, true);
        }
        veVar.a("model", this.f65650l, false, true);
        veVar.a(CommonUrlParts.MANUFACTURER, this.f65651m, false, true);
        veVar.a("deviceVersion", this.f65652n, false, true);
        cc ccVar = this.f65653o;
        if (ccVar != null) {
            veVar.a(CommonUrlParts.LOCALE, ccVar.f64365a, false, true);
            int i10 = this.Z;
            if (i10 == 4 || i10 == 2) {
                veVar.a("localeList", this.f65653o.f64366b, false, true);
            }
        }
        int i11 = this.Z;
        if (i11 == 4 || i11 == 2) {
            veVar.a("inputLangs", this.f65654p, false, true);
        }
        veVar.a("isp", this.f65661w, false, true);
        veVar.a("ispName", this.f65662x, false, true);
        veVar.a("ispCarrId", this.f65663y, false, true);
        veVar.a("ispCarrIdName", this.f65664z, false, true);
        veVar.a("netOper", this.A, false, true);
        veVar.a("networkOperName", this.B, false, true);
        veVar.a("cid", this.C, false, true);
        veVar.a("lac", this.D, false, true);
        veVar.a("tac", this.E, false, true);
        veVar.a("blat", this.F, false, true);
        veVar.a("blon", this.G, false, true);
        veVar.a("subPublisherId", null, false, true);
        veVar.a("subProductId", null, false, true);
        veVar.a("retryCount", null, false, true);
        veVar.a("roaming", this.f65656r, false, true);
        veVar.a("grid", this.f65657s, false, true);
        if (this.f65658t) {
            veVar.a("c5g", "1", false, false);
        }
        int i12 = this.f65659u;
        if (i12 >= 0) {
            veVar.a(NotificationCompat.CATEGORY_TRANSPORT, String.valueOf(i12), false, false);
        }
        if (this.f65646h0) {
            veVar.a("tv", Boolean.TRUE, false, false);
        }
        veVar.a("silev", this.f65660v, false, true);
        veVar.a("cellSignalLevel", this.H, false, true);
        veVar.a("cellTimingAdv", this.I, false, true);
        veVar.a("outsource", this.f65655q, false, true);
        veVar.a("width", String.valueOf(this.L), false, true);
        veVar.a("height", String.valueOf(this.M), false, true);
        veVar.a("density", String.valueOf(this.N), false, true);
        veVar.a("fgApp", this.O, false, true);
        veVar.a("sdkId", String.valueOf(this.P), true, true);
        veVar.a("clientSessionId", this.Q, false, true);
        veVar.a("appVersion", this.R, false, true);
        veVar.a("appCode", Integer.valueOf(this.S), false, true);
        veVar.a("timeSinceBoot", Long.valueOf(SystemClock.elapsedRealtime()), false, true);
        veVar.a("udbg", Boolean.valueOf(this.T), false, true);
        veVar.a("root", Boolean.valueOf(this.U), false, true);
        veVar.a("smltr", Boolean.valueOf(this.V), false, true);
        veVar.a("isddbg", Boolean.valueOf(this.W), false, true);
        veVar.a("pas", this.X, false, true);
        veVar.a("prm", this.Y, false, false);
        veVar.a("free", this.f65632a0, false, false);
        veVar.a("chr", this.f65636c0, false, false);
        veVar.a("blp", this.f65634b0, false, false);
        veVar.a("hs", this.f65638d0, false, false);
        veVar.a(N6.Z0, this.f65640e0, false, false);
        veVar.a(ApsMetricsDataMap.APSMETRICS_FIELD_MANUFACTURER, this.f65642f0, false, false);
        v0 v0Var = this.f65644g0;
        if (v0Var != null) {
            long jElapsedRealtime = 0;
            if (v0Var.f65366d > 0) {
                v0Var.f65363a.getClass();
                jElapsedRealtime = SystemClock.elapsedRealtime() - v0Var.f65366d;
            }
            veVar.a("appSessionDuration", Long.valueOf(jElapsedRealtime / 1000), false, false);
        }
        veVar.a("rsc", this.J, false, true);
    }

    public final void b(Context context) {
        try {
            this.f65632a0 = Long.valueOf(new StatFs(Environment.getRootDirectory().getAbsolutePath()).getFreeBytes());
        } catch (Throwable th2) {
            g9.a(th2);
        }
        boolean z10 = true;
        try {
            this.f65636c0 = null;
            this.f65634b0 = null;
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                if (intentRegisterReceiver.hasExtra("status")) {
                    int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                    this.f65636c0 = Boolean.valueOf(intExtra == 2 || intExtra == 5);
                }
                if (intentRegisterReceiver.hasExtra("level") && intentRegisterReceiver.hasExtra("scale")) {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    if (intExtra2 >= 0 && intExtra3 > 0) {
                        this.f65634b0 = Integer.valueOf((intExtra2 * 100) / intExtra3);
                    }
                }
            }
        } catch (Throwable th3) {
            g9.a(th3);
        }
        try {
            this.f65638d0 = null;
            Object systemService = context.getSystemService("audio");
            if (systemService instanceof AudioManager) {
                AudioDeviceInfo[] devices = ((AudioManager) systemService).getDevices(2);
                if (devices != null) {
                    for (AudioDeviceInfo audioDeviceInfo : devices) {
                        if (audioDeviceInfo != null && f65630i0.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                            break;
                        }
                    }
                    z10 = false;
                    this.f65638d0 = Boolean.valueOf(z10);
                } else {
                    z10 = false;
                    this.f65638d0 = Boolean.valueOf(z10);
                }
            }
        } catch (Throwable th4) {
            g9.a(th4);
        }
        try {
            this.f65640e0 = null;
            Object systemService2 = context.getSystemService("power");
            if (systemService2 instanceof PowerManager) {
                this.f65640e0 = Boolean.valueOf(((PowerManager) systemService2).isPowerSaveMode());
            }
        } catch (Throwable th5) {
            g9.a(th5);
        }
        try {
            this.f65642f0 = null;
            int i10 = context.getResources().getConfiguration().uiMode & 48;
            if (i10 == 32) {
                this.f65642f0 = Boolean.TRUE;
            } else if (i10 == 16) {
                this.f65642f0 = Boolean.FALSE;
            }
        } catch (Throwable th6) {
            g9.a(th6);
        }
    }
}
