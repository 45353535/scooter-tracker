package v1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import l1.d;
import n1.h;
import org.json.JSONArray;
import org.json.JSONException;
import s1.b;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f105676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f105677b = false;

    public a(b bVar) {
        this.f105676a = bVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b bVar;
        if ("com.dt.ignite.service.action.PROPERTY_CHANGED".equals(intent.getAction())) {
            t1.b.a("%s : broadcast received", "PropertyChangeReceiver");
            String stringExtra = intent.getStringExtra("PROPERTIES_CHANGED");
            if (stringExtra == null || (bVar = this.f105676a) == null) {
                return;
            }
            d dVar = (d) bVar;
            try {
                JSONArray jSONArray = new JSONArray(stringExtra);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if ("DTID".equalsIgnoreCase(jSONArray.getString(i10))) {
                        t1.b.a("%s : onPropertiesChanged", "OneDTPropertyWatchdog");
                        if (!dVar.f93869c.c()) {
                            h hVar = dVar.f93870d;
                            if (hVar != null) {
                                hVar.m();
                                return;
                            }
                            return;
                        }
                        t1.b.a("%s : onPropertiesChanged: will reconnect", "OneDTPropertyWatchdog");
                        h hVar2 = dVar.f93870d;
                        if (hVar2 != null) {
                            t1.b.a("%s : one dt refresh required", "OneDTAuthenticator");
                            hVar2.f95060l.set(true);
                        }
                        dVar.f93869c.l();
                        return;
                    }
                }
            } catch (JSONException e10) {
                p1.b.a(p1.d.ONE_DT_BROADCAST_ERROR, e10);
            }
        }
    }
}
