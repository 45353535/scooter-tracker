package com.fyber.inneractive.sdk.topics;

import android.adservices.topics.EncryptedTopic;
import android.content.Context;
import android.util.Base64;
import b.a;
import b.d;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23781b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f23786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b.a f23787h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f23782c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f23783d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f23784e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f23785f = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f23788i = new AtomicBoolean(false);

    public final void a(boolean z10, boolean z11) {
        if (this.f23788i.compareAndSet(false, true)) {
            this.f23780a = z10;
            this.f23781b = z11;
            a.C0123a c0123a = new a.C0123a();
            c0123a.b("com.fyber.inneractive.sdk");
            c0123a.a();
            this.f23786g = new a(this);
        }
    }

    public final JSONArray b() {
        JSONObject jSONObject;
        if (this.f23785f.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f23785f.iterator();
        while (it.hasNext()) {
            androidx.privacysandbox.ads.adservices.topics.a.a(it.next());
            if (this.f23783d.containsKey(null)) {
                jSONObject = (JSONObject) this.f23783d.get(null);
            } else {
                try {
                    new JSONObject();
                    throw null;
                } catch (Exception e10) {
                    IAlog.a("%sException when convertTopicToJSON called", e10, IAlog.a(this));
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONArray.put(jSONObject);
            }
        }
        if (jSONArray.length() > 0) {
            return jSONArray;
        }
        return null;
    }

    public final void c() {
        Context baseContext = o.f23888a.getBaseContext();
        if (baseContext != null) {
            androidx.privacysandbox.ads.adservices.topics.a.a(baseContext.getSystemService(d.class));
        }
    }

    public final JSONArray a() {
        JSONObject jSONObject;
        if (this.f23784e.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f23784e.iterator();
        while (it.hasNext()) {
            EncryptedTopic encryptedTopicA = m3.a.a(it.next());
            if (!IAConfigManager.c()) {
                jSONObject = null;
            } else if (this.f23782c.containsKey(encryptedTopicA)) {
                jSONObject = (JSONObject) this.f23782c.get(encryptedTopicA);
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    byte[] encryptedTopic = encryptedTopicA.getEncryptedTopic();
                    jSONObject2.put(ApsMetricsDataMap.APSMETRICS_FIELD_ENDTIME, encryptedTopic == null ? null : Base64.encodeToString(encryptedTopic, 10));
                    jSONObject2.put("ki", encryptedTopicA.getKeyIdentifier());
                    byte[] encapsulatedKey = encryptedTopicA.getEncapsulatedKey();
                    jSONObject2.put(com.taurusx.tax.g.a.f66077o, encapsulatedKey == null ? null : Base64.encodeToString(encapsulatedKey, 10));
                    this.f23782c.put(encryptedTopicA, jSONObject2);
                    jSONObject = jSONObject2;
                } catch (Exception e10) {
                    IAlog.a("%sException when convertEncryptedTopicToJSON called", e10, IAlog.a(this));
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONArray.put(jSONObject);
            }
        }
        if (jSONArray.length() > 0) {
            return jSONArray;
        }
        return null;
    }
}
