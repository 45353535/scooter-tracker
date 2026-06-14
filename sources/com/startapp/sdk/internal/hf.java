package com.startapp.sdk.internal;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import com.startapp.sdk.adsbase.remoteconfig.RscMetadata;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o3 f64635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RscMetadata f64636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f64637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinkedList f64638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakHashMap f64639f = new WeakHashMap();

    public hf(Context context, o3 o3Var) {
        this.f64634a = context;
        this.f64635b = o3Var;
    }

    public static JSONArray a(jf jfVar) {
        a3 a3Var = jfVar.f64761a;
        String[] strArr = a3Var.f64246c;
        Object[] objArr = a3Var.f64248e;
        if (strArr.length == objArr.length) {
            int length = strArr.length;
            if (length == 0) {
                return null;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(strArr[i10], objArr[i10]);
                    jSONArray.put(jSONObject);
                }
                return jSONArray;
            } catch (JSONException e10) {
                if (jfVar.a(32)) {
                    g9.a(e10);
                }
            }
        } else if (jfVar.a(512)) {
            g9 g9Var = new g9(h9.f64610e);
            g9Var.f64553d = "c690e4ef5365d88b";
            g9Var.f64554e = Arrays.toString(strArr) + ", " + Arrays.toString(objArr);
            g9Var.a();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x020d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List a() {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.hf.a():java.util.List");
    }

    public final synchronized List a(RscMetadata rscMetadata, ArrayList arrayList, LinkedList linkedList) {
        try {
            ArrayList arrayList2 = this.f64637d;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    try {
                        ((kf) it.next()).a(this.f64634a);
                    } catch (Throwable th2) {
                        RscMetadata rscMetadata2 = this.f64636c;
                        if (rscMetadata2 != null && (rscMetadata2.a() & 64) != 0) {
                            g9.a(th2);
                        }
                    }
                }
            }
            this.f64636c = rscMetadata;
            this.f64637d = arrayList;
            this.f64638e = linkedList;
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    try {
                        ((kf) it2.next()).a(this.f64634a, this);
                    } catch (Throwable th3) {
                        if (rscMetadata != null && (rscMetadata.a() & 128) != 0) {
                            g9.a(th3);
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return linkedList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0160 A[Catch: JSONException -> 0x0149, TryCatch #3 {JSONException -> 0x0149, blocks: (B:90:0x013a, B:92:0x013f, B:95:0x014b, B:97:0x0151, B:98:0x015a, B:100:0x0160, B:101:0x0165), top: B:148:0x013a }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013f A[Catch: JSONException -> 0x0149, TryCatch #3 {JSONException -> 0x0149, blocks: (B:90:0x013a, B:92:0x013f, B:95:0x014b, B:97:0x0151, B:98:0x015a, B:100:0x0160, B:101:0x0165), top: B:148:0x013a }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0151 A[Catch: JSONException -> 0x0149, TryCatch #3 {JSONException -> 0x0149, blocks: (B:90:0x013a, B:92:0x013f, B:95:0x014b, B:97:0x0151, B:98:0x015a, B:100:0x0160, B:101:0x0165), top: B:148:0x013a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.hf.a(java.lang.Object):java.lang.String");
    }

    public final synchronized void a(a3 a3Var, JSONObject jSONObject) {
        this.f64639f.put(a3Var, new Pair(Long.valueOf(SystemClock.elapsedRealtime()), new SoftReference(jSONObject)));
    }
}
