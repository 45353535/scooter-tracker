package com.mbridge.msdk.foundation.db.middle;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.k;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.buffer.a f48370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f48371b;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f48372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.same.buffer.a f48373b;

        a(boolean z10, com.mbridge.msdk.foundation.same.buffer.a aVar) {
            this.f48372a = z10;
            this.f48373b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f48372a || b.this.f48371b == null) {
                return;
            }
            for (String str : this.f48373b.a()) {
                b.this.f48371b.a(str, b.this.f48370a.a(str));
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.middle.b$b, reason: collision with other inner class name */
    private static class C0512b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static b f48375a = new b(null);
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    private b() {
        this.f48370a = new com.mbridge.msdk.foundation.same.buffer.a(1000);
        try {
            k kVarA = k.a(g.a(c.n().d()));
            this.f48371b = kVarA;
            a(kVarA.d(), false);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            com.mbridge.msdk.foundation.same.buffer.a aVar = new com.mbridge.msdk.foundation.same.buffer.a(100);
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                this.f48370a.a(next, jSONObjectOptJSONObject);
                aVar.a(next, jSONObjectOptJSONObject);
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(z10, aVar));
        }
    }

    public JSONArray b() {
        return new JSONArray((Collection) this.f48370a.a());
    }

    public static b a() {
        return C0512b.f48375a;
    }

    public JSONObject a(String str) {
        k kVar;
        JSONObject jSONObjectA = this.f48370a.a(str);
        if (jSONObjectA != null || (kVar = this.f48371b) == null) {
            return jSONObjectA;
        }
        JSONObject jSONObjectB = kVar.b(str);
        if (jSONObjectB != null) {
            this.f48370a.a(str, jSONObjectB);
        }
        return jSONObjectB;
    }
}
