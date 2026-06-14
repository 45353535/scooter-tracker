package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.internal.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v2.i;

/* JADX INFO: loaded from: classes7.dex */
public final class r0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f19728f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f19729g = r0.class.getSimpleName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f19730h = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.facebook.internal.a f19731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f19733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f19734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19735e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public r0(com.facebook.internal.a attributionIdentifiers, String anonymousAppDeviceGUID) {
        Intrinsics.checkNotNullParameter(attributionIdentifiers, "attributionIdentifiers");
        Intrinsics.checkNotNullParameter(anonymousAppDeviceGUID, "anonymousAppDeviceGUID");
        this.f19731a = attributionIdentifiers;
        this.f19732b = anonymousAppDeviceGUID;
        this.f19733c = new ArrayList();
        this.f19734d = new ArrayList();
    }

    private final void f(GraphRequest graphRequest, Context context, int i10, JSONArray jSONArray, JSONArray jSONArray2, boolean z10) {
        JSONObject jSONObject;
        try {
            if (e3.a.d(this)) {
                return;
            }
            try {
                jSONObject = v2.i.a(i.a.CUSTOM_APP_EVENTS, this.f19731a, this.f19732b, z10, context);
                if (this.f19735e > 0) {
                    jSONObject.put("num_skipped_events", i10);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            graphRequest.E(jSONObject);
            Bundle bundleU = graphRequest.u();
            String string = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(string, "events.toString()");
            bundleU.putString("custom_events", string);
            if (com.facebook.internal.e.g(e.b.IapLoggingLib5To7)) {
                bundleU.putString("operational_parameters", jSONArray2.toString());
            }
            graphRequest.H(string);
            graphRequest.G(bundleU);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public final synchronized void a(d event) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (this.f19733c.size() + this.f19734d.size() >= f19730h) {
                this.f19735e++;
            } else {
                this.f19733c.add(event);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public final synchronized void b(boolean z10) {
        if (e3.a.d(this)) {
            return;
        }
        if (!z10) {
            this.f19734d.clear();
            this.f19735e = 0;
            return;
        }
        try {
            this.f19733c.addAll(this.f19734d);
            this.f19734d.clear();
            this.f19735e = 0;
            return;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return;
        }
    }

    public final synchronized int c() {
        if (e3.a.d(this)) {
            return 0;
        }
        try {
            return this.f19733c.size();
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return 0;
        }
    }

    public final synchronized List d() {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            List list = this.f19733c;
            this.f19733c = new ArrayList();
            return list;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public final int e(GraphRequest request, Context applicationContext, boolean z10, boolean z11) {
        Throwable th2;
        Throwable th3;
        if (e3.a.d(this)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            synchronized (this) {
                try {
                    int i10 = this.f19735e;
                    o2.a.d(this.f19733c);
                    this.f19734d.addAll(this.f19733c);
                    this.f19733c.clear();
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = new JSONArray();
                    for (d dVar : this.f19734d) {
                        try {
                            if (z10 || !dVar.m()) {
                                jSONArray.put(dVar.j());
                                jSONArray2.put(dVar.l());
                            }
                        } catch (Throwable th5) {
                            th3 = th5;
                        }
                    }
                    if (jSONArray.length() != 0) {
                        Unit unit = Unit.f93236a;
                        f(request, applicationContext, i10, jSONArray, jSONArray2, z11);
                        return jSONArray.length();
                    }
                    try {
                        return 0;
                    } catch (Throwable th6) {
                        th2 = th6;
                        e3.a.b(th2, this);
                        return 0;
                    }
                } catch (Throwable th7) {
                    th3 = th7;
                }
                throw th3;
            }
        } catch (Throwable th8) {
            th = th8;
            th2 = th;
            e3.a.b(th2, this);
            return 0;
        }
    }
}
