package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.ironsource.C4462o4;
import com.ironsource.InterfaceC4532s7;
import com.ironsource.InterfaceC4549t7;
import com.ironsource.Y3;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class BroadcastReceiverStrategy implements InterfaceC4532s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4549t7 f45394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f45395b = new BroadcastReceiver() { // from class: com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String strB = Y3.b(context);
            if (strB.equals("none")) {
                BroadcastReceiverStrategy.this.f45394a.a();
            } else {
                BroadcastReceiverStrategy.this.f45394a.a(strB, new JSONObject());
            }
        }
    };

    public BroadcastReceiverStrategy(InterfaceC4549t7 interfaceC4549t7) {
        this.f45394a = interfaceC4549t7;
    }

    @Override // com.ironsource.InterfaceC4532s7
    public void b(Context context) {
        try {
            context.registerReceiver(this.f45395b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.InterfaceC4532s7
    public JSONObject c(Context context) {
        return new JSONObject();
    }

    @Override // com.ironsource.InterfaceC4532s7
    public void a(Context context) {
        try {
            context.unregisterReceiver(this.f45395b);
        } catch (IllegalArgumentException e10) {
            C4462o4.d().a(e10);
        } catch (Exception e11) {
            C4462o4.d().a(e11);
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e11);
        }
    }

    @Override // com.ironsource.InterfaceC4532s7
    public void a() {
        this.f45395b = null;
    }
}
