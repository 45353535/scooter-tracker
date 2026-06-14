package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes12.dex */
public final class Gf implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentValues f75824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResultReceiver f75825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f75823c = UUID.randomUUID().toString();
    public static final Parcelable.Creator<Gf> CREATOR = new Ff();

    public Gf(Context context, ResultReceiver resultReceiver) {
        ContentValues contentValues = new ContentValues();
        this.f75824a = contentValues;
        contentValues.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf(Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", f75823c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", Integer.valueOf(AppMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.f75825b = resultReceiver;
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            HashMap mapB = Jm.b(map);
            synchronized (this) {
                this.f75824a.put("PROCESS_CFG_CLIDS", AbstractC5295nb.b(mapB));
            }
        }
    }

    public final void b(AppMetricaConfig appMetricaConfig) {
        List<String> list = appMetricaConfig.customHosts;
        if (list != null) {
            synchronized (this) {
                this.f75824a.put("PROCESS_CFG_CUSTOM_HOSTS", no.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
            }
        }
    }

    public final void c(AppMetricaConfig appMetricaConfig) {
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        if (str != null) {
            synchronized (this) {
                this.f75824a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
            }
            i();
        }
    }

    public final void d(AppMetricaConfig appMetricaConfig) {
        if (appMetricaConfig != null) {
            synchronized (this) {
                b(appMetricaConfig);
                a(appMetricaConfig);
                c(appMetricaConfig);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f75824a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    public final Integer f() {
        return this.f75824a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    public final String g() {
        return this.f75824a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    public final boolean h() {
        return this.f75824a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    public final synchronized void i() {
        this.f75824a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
    }

    public final String toString() {
        return "ProcessConfiguration{mParamsMapping=" + this.f75824a + ", mDataResultReceiver=" + this.f75825b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", this.f75824a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", this.f75825b);
        parcel.writeBundle(bundle);
    }

    public final HashMap a() {
        return AbstractC5295nb.c(this.f75824a.getAsString("PROCESS_CFG_CLIDS"));
    }

    public final String c() {
        return this.f75824a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    public final String d() {
        return this.f75824a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    public Gf(Gf gf2) {
        synchronized (gf2) {
            this.f75824a = new ContentValues(gf2.f75824a);
            this.f75825b = gf2.f75825b;
        }
    }

    public final ArrayList b() {
        String asString = this.f75824a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        return AbstractC5295nb.b(asString);
    }

    public Gf(ContentValues contentValues, ResultReceiver resultReceiver) {
        this.f75824a = contentValues == null ? new ContentValues() : contentValues;
        this.f75825b = resultReceiver;
    }
}
