package com.startapp.sdk.internal;

import android.os.Parcelable;
import android.telephony.TelephonyManager;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class vh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TelephonyManager f65405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f65406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yh f65407c;

    public vh(yh yhVar, TelephonyManager telephonyManager, Class cls) {
        this.f65407c = yhVar;
        this.f65405a = telephonyManager;
        this.f65406b = cls;
    }

    public abstract void a();

    public final void a(Class cls, Parcelable parcelable) {
        yh yhVar = this.f65407c;
        yhVar.getClass();
        try {
            TelephonyMetadata telephonyMetadataA = yhVar.a();
            if (telephonyMetadataA != null && parcelable != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String simpleName = cls.getSimpleName();
                if (telephonyMetadataA.a(simpleName).c()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("timestamp", jCurrentTimeMillis);
                    jSONObject.put("type", simpleName);
                    jSONObject.put("data", parcelable.toString());
                    String strB = vi.b(jSONObject.toString());
                    uf ufVarEdit = ((vf) yhVar.f65612c.a()).edit();
                    ufVarEdit.a(simpleName, strB);
                    ufVarEdit.f65346a.putString(simpleName, strB);
                    ufVarEdit.apply();
                }
            }
        } catch (Throwable th2) {
            if (yhVar.a(2)) {
                g9.a(th2);
            }
        }
        if (cls.equals(this.f65406b)) {
            try {
                b();
            } catch (Throwable th3) {
                if (this.f65407c.a(16)) {
                    g9.a(th3);
                }
            }
        }
    }

    public abstract void b();
}
