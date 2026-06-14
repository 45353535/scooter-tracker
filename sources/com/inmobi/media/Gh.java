package com.inmobi.media;

import android.content.Context;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.inmobi.media.Gh;
import com.taurusx.tax.y.z.w.s;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Gh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f36942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f36945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Cb f36946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Gi f36947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f36948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f36949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f36950i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f36951j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f36952k;

    public Gh(Context context, double d10, Ab logLevel, long j10, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.f36942a = context;
        this.f36943b = j10;
        this.f36944c = i10;
        this.f36945d = false;
        this.f36946e = new Cb(logLevel);
        this.f36947f = new Gi(d10);
        this.f36948g = DesugarCollections.synchronizedList(new ArrayList());
        this.f36949h = new ConcurrentHashMap();
        this.f36950i = new AtomicBoolean(false);
        this.f36951j = "";
        this.f36952k = new AtomicInteger(0);
    }

    public final void a(Ab logLevel, String tag, String message) throws JSONException {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.f36950i.get()) {
            return;
        }
        SimpleDateFormat simpleDateFormat = Db.f36722a;
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scope", logLevel.name());
        jSONObject.put("timestamp", Db.f36722a.format(new Date()));
        jSONObject.put(s.z.f67720z, tag);
        jSONObject.put("data", message);
        CoroutineScope coroutineScope = Sb.f37702a;
        Rb.a(new Eh(this, logLevel, jSONObject, null));
    }

    public final void b() {
        Objects.toString(this.f36950i);
        if ((this.f36945d || this.f36947f.a()) && !this.f36950i.getAndSet(true)) {
            CoroutineScope coroutineScope = Sb.f37702a;
            Rb.a(new Dh(this, null));
        }
    }

    public final String c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        synchronized (this.f36949h) {
            try {
                for (Map.Entry entry : this.f36949h.entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        jSONObject.put("vitals", jSONObject2);
        jSONObject.put(s.z.f67719y, d());
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final JSONArray d() {
        JSONArray jSONArray = new JSONArray();
        List logData = this.f36948g;
        Intrinsics.checkNotNullExpressionValue(logData, "logData");
        synchronized (logData) {
            try {
                List logData2 = this.f36948g;
                Intrinsics.checkNotNullExpressionValue(logData2, "logData");
                Iterator it = logData2.iterator();
                while (it.hasNext()) {
                    jSONArray.put((JSONObject) it.next());
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jSONArray;
    }

    public final boolean e() throws JSONException {
        if (this.f36948g.isEmpty() || this.f36949h.isEmpty()) {
            return true;
        }
        String strC = c();
        Intrinsics.checkNotNullParameter(strC, "<this>");
        return Intrinsics.areEqual(strC, JsonUtils.EMPTY_JSON);
    }

    public final void b(boolean z10) {
        Objects.toString(this.f36950i);
        if (this.f36950i.get()) {
            return;
        }
        this.f36945d = z10;
    }

    public final void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Objects.toString(this.f36950i);
        if (this.f36950i.get()) {
            return;
        }
        this.f36949h.put(key, value);
    }

    public final void a() {
        Objects.toString(this.f36950i);
        if ((this.f36945d || this.f36947f.a()) && !this.f36950i.get()) {
            CoroutineScope coroutineScope = Sb.f37702a;
            Rb.a(new Ch(this, null));
        }
    }

    public final void a(final boolean z10) {
        Objects.toString(this.f36950i);
        CoroutineScope coroutineScope = Sb.f37702a;
        if (Result.g(Rb.a(new Function0() { // from class: w3.y0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Gh.a(this.f107387b, z10);
            }
        })) != null) {
            try {
                Result.b(Unit.f93236a);
            } catch (Throwable th2) {
                Result.Companion companion = Result.f93230c;
                Result.b(kotlin.d.a(th2));
            }
        }
    }

    public static final Unit a(Gh gh2, boolean z10) {
        if (gh2.e()) {
            return Unit.f93236a;
        }
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (gh2.f36951j.length() == 0) {
            CoroutineScope coroutineScope = Sb.f37702a;
            gh2.f36951j = Rb.a(gh2.f36942a, timeInMillis);
        }
        if (gh2.a(gh2.f36951j)) {
            eg.h.b(null, new Fh(gh2, timeInMillis, z10, null), 1, null);
        }
        return Unit.f93236a;
    }

    public final boolean a(String str) {
        return Tb.a("RemoteLogger", c(), str);
    }
}
