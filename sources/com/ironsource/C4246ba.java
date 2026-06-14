package com.ironsource;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4246ba {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f42745m = "age";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f42746n = "gen";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f42747o = "lvl";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f42748p = "pay";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f42749q = "iapt";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f42750r = "ucd";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f42751s = "segName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f42752a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f42758g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42753b = 999999;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f42754c = 999999.99d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f42755d = "custom";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f42756e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f42757f = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f42759h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AtomicBoolean f42760i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f42761j = -1.0d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f42762k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ArrayList<Pair<String, String>> f42763l = new ArrayList<>();

    @Deprecated
    public int a() {
        return this.f42757f;
    }

    @Deprecated
    public String b() {
        return this.f42758g;
    }

    public double c() {
        return this.f42761j;
    }

    public AtomicBoolean d() {
        return this.f42760i;
    }

    public int e() {
        return this.f42759h;
    }

    public ArrayList<Pair<String, String>> f() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (this.f42757f != -1) {
            arrayList.add(new Pair<>("age", this.f42757f + ""));
        }
        if (!TextUtils.isEmpty(this.f42758g)) {
            arrayList.add(new Pair<>(f42746n, this.f42758g));
        }
        if (this.f42759h != -1) {
            arrayList.add(new Pair<>("lvl", this.f42759h + ""));
        }
        if (this.f42760i != null) {
            arrayList.add(new Pair<>("pay", this.f42760i + ""));
        }
        if (this.f42761j != -1.0d) {
            arrayList.add(new Pair<>("iapt", this.f42761j + ""));
        }
        if (this.f42762k != 0) {
            arrayList.add(new Pair<>("ucd", this.f42762k + ""));
        }
        if (!TextUtils.isEmpty(this.f42752a)) {
            arrayList.add(new Pair<>("segName", this.f42752a));
        }
        arrayList.addAll(this.f42763l);
        return arrayList;
    }

    public String g() {
        return this.f42752a;
    }

    public long h() {
        return this.f42762k;
    }

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        for (Pair<String, String> pair : f()) {
            try {
                jSONObject.put((String) pair.first, pair.second);
            } catch (JSONException e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error("exception " + e10.getMessage());
            }
        }
        return jSONObject;
    }

    private boolean b(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    public void a(int i10) {
        if (i10 > 0 && i10 < this.f42753b) {
            this.f42759h = i10;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setLevel( " + i10 + " ) level must be between 1-" + this.f42753b, 2);
    }

    public void a(boolean z10) {
        if (this.f42760i == null) {
            this.f42760i = new AtomicBoolean();
        }
        this.f42760i.set(z10);
    }

    public void a(double d10) {
        if (d10 > 0.0d && d10 < this.f42754c) {
            this.f42761j = Math.floor(d10 * 100.0d) / 100.0d;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setIAPTotal( " + d10 + " ) iapt must be between 0-" + this.f42754c, 2);
    }

    public void a(long j10) {
        if (j10 > 0) {
            this.f42762k = j10;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setUserCreationDate( " + j10 + " ) is an invalid timestamp", 2);
    }

    public void a(String str) {
        if (b(str) && a(str, 1, 32)) {
            this.f42752a = str;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length", 2);
    }

    public void a(String str, String str2) {
        try {
            if (b(str) && b(str2) && a(str, 1, 32) && a(str2, 1, 32)) {
                String str3 = "custom_" + str;
                if (this.f42763l.size() >= 5) {
                    this.f42763l.remove(0);
                }
                this.f42763l.add(new Pair<>(str3, str2));
                return;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private boolean a(String str, int i10, int i11) {
        return str != null && str.length() >= i10 && str.length() <= i11;
    }
}
