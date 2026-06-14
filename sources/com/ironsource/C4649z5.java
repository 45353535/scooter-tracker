package com.ironsource;

import com.ironsource.InterfaceC4496q4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.z5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4649z5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f45962e = "euid";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f45963f = "esat";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f45964g = "esfr";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f45965h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f45967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f45968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f45969d;

    public C4649z5(A5 a52, JSONObject jSONObject) {
        this(a52.b(), jSONObject);
    }

    public String a() {
        return this.f45969d.toString();
    }

    public JSONObject b() {
        return this.f45969d;
    }

    public int c() {
        return this.f45966a;
    }

    public long d() {
        return this.f45967b;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4649z5 c4649z5 = (C4649z5) obj;
        return this.f45966a == c4649z5.f45966a && this.f45967b == c4649z5.f45967b && this.f45968c == c4649z5.f45968c && C4552ta.a(this.f45969d, c4649z5.f45969d);
    }

    public int hashCode() {
        return (((((this.f45966a * 31) + androidx.collection.b.a(this.f45967b)) * 31) + this.f45969d.toString().hashCode()) * 31) + this.f45968c;
    }

    @NotNull
    public String toString() {
        return ("{\"eventId\":" + c() + ",\"timestamp\":" + d() + StringUtils.COMMA + a().substring(1) + "}").replace(StringUtils.COMMA, IOUtils.LINE_SEPARATOR_UNIX);
    }

    public C4649z5(int i10, JSONObject jSONObject) {
        this(i10, new InterfaceC4496q4.a().a(), jSONObject);
    }

    public void a(int i10) {
        this.f45966a = i10;
    }

    public C4649z5(int i10, long j10, String str) throws JSONException {
        this(i10, j10, new JSONObject(str));
    }

    public void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            this.f45969d.put(str, obj);
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public C4649z5(A5 a52, long j10, JSONObject jSONObject) {
        this(a52.b(), j10, jSONObject);
    }

    public C4649z5(int i10, long j10, JSONObject jSONObject) {
        this.f45968c = 1;
        this.f45966a = i10;
        this.f45967b = j10;
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f45969d = jSONObject;
        if (!jSONObject.has(f45962e)) {
            a(f45962e, UUID.randomUUID().toString());
        }
        if (!jSONObject.has(f45963f)) {
            a(f45963f, Integer.valueOf(this.f45968c));
        } else {
            this.f45968c = jSONObject.optInt(f45963f, 1);
        }
    }

    public void a(String str) {
        a(f45964g, str);
        int i10 = this.f45968c + 1;
        this.f45968c = i10;
        a(f45963f, Integer.valueOf(i10));
    }
}
