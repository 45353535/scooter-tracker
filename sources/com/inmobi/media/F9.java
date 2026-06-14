package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.ironsource.C4240b4;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class F9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f36831a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f36832b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f36833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f36834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static JSONObject f36835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static JSONObject f36836f;

    public static final void a(JSONObject jSONObject) {
        synchronized (f36832b) {
            try {
                Objects.toString(f36836f);
                Objects.toString(jSONObject);
                f36836f = jSONObject;
                f36834d = true;
                Context context = Ji.f37157a;
                if (context != null) {
                    ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                    Ea eaA = Da.a(context, "unified_id_info_store");
                    JSONObject jSONObject2 = f36836f;
                    if (jSONObject2 == null) {
                        eaA.a("publisher_provided_unified_id");
                    } else {
                        eaA.a("publisher_provided_unified_id", String.valueOf(jSONObject2), false);
                        Unit unit = Unit.f93236a;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final JSONObject b() {
        synchronized (f36831a) {
            if (f36833c) {
                return f36835e;
            }
            f36833c = true;
            Context context = Ji.f37157a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Ea eaA = Da.a(context, "unified_id_info_store");
                Intrinsics.checkNotNullParameter("ufids", C4240b4.i.W);
                String string = eaA.f36783a.getString("ufids", null);
                if (string != null) {
                    try {
                        f36835e = new JSONObject(string);
                    } catch (JSONException e10) {
                        e10.getMessage();
                    }
                    return f36835e;
                }
            }
            return null;
        }
    }

    public static final JSONObject a() {
        synchronized (f36832b) {
            if (f36834d) {
                Objects.toString(f36836f);
                return f36836f;
            }
            f36834d = true;
            Context context = Ji.f37157a;
            String string = null;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                Ea eaA = Da.a(context, "unified_id_info_store");
                Intrinsics.checkNotNullParameter("publisher_provided_unified_id", C4240b4.i.W);
                string = eaA.f36783a.getString("publisher_provided_unified_id", null);
            }
            try {
                try {
                    f36836f = new JSONObject(string);
                } catch (NullPointerException e10) {
                    e10.getMessage();
                }
            } catch (JSONException e11) {
                e11.getMessage();
            }
            Objects.toString(f36836f);
            return f36836f;
        }
    }

    public static final void b(JSONObject jSONObject) {
        synchronized (f36831a) {
            try {
                f36835e = jSONObject;
                f36833c = true;
                Context context = Ji.f37157a;
                if (context != null) {
                    ConcurrentHashMap concurrentHashMap = Ea.f36782b;
                    Ea eaA = Da.a(context, "unified_id_info_store");
                    JSONObject jSONObject2 = f36835e;
                    if (jSONObject2 == null) {
                        eaA.a("ufids");
                    } else {
                        eaA.a("ufids", String.valueOf(jSONObject2), false);
                    }
                    SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
                    JSONObject jSONObject3 = f36835e;
                    if (jSONObject3 == null) {
                        editorEdit.remove("InMobi_unifiedId");
                    } else {
                        editorEdit.putString("InMobi_unifiedId", String.valueOf(jSONObject3));
                    }
                    editorEdit.apply();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
