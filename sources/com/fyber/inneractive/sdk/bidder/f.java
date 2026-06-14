package com.fyber.inneractive.sdk.bidder;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f20207a;

    public f(e eVar) {
        this.f20207a = eVar;
    }

    public final void a() {
        com.fyber.inneractive.sdk.util.o.f23888a.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        com.fyber.inneractive.sdk.util.o.f23888a.registerReceiver(this, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        com.fyber.inneractive.sdk.util.o.f23888a.registerReceiver(this, new IntentFilter("android.app.action.INTERRUPTION_FILTER_CHANGED"));
        com.fyber.inneractive.sdk.util.o.f23888a.registerReceiver(this, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
        com.fyber.inneractive.sdk.util.o.f23888a.registerReceiver(this, new IntentFilter("android.intent.action.AIRPLANE_MODE"));
        if (com.fyber.inneractive.sdk.util.o.a("android.permission.BLUETOOTH")) {
            com.fyber.inneractive.sdk.util.o.f23888a.registerReceiver(this, new IntentFilter("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"));
            com.fyber.inneractive.sdk.util.o.f23888a.registerReceiver(this, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z10 = true;
        if (intent == null || intent.getAction() == null) {
            return;
        }
        String action = intent.getAction();
        action.getClass();
        switch (action) {
            case "android.intent.action.BATTERY_CHANGED":
                b bVar = (b) this.f20207a;
                bVar.f20174b.getClass();
                int intExtra = intent.getIntExtra("plugged", -1);
                if (intExtra != 1 && intExtra != 2 && intExtra != 4) {
                    z10 = false;
                }
                Boolean bool = bVar.f20175c.B;
                if (bool == null || bool.booleanValue() != z10) {
                    bVar.f20175c.B = Boolean.valueOf(z10);
                    bVar.d();
                }
                bVar.f20174b.getClass();
                if (!TextUtils.equals(bVar.f20175c.C, com.fyber.inneractive.sdk.serverapi.b.a((intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", -1)))) {
                    d dVar = bVar.f20175c;
                    bVar.f20174b.getClass();
                    dVar.C = com.fyber.inneractive.sdk.serverapi.b.a((intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", -1));
                    bVar.d();
                    break;
                }
                break;
            case "android.bluetooth.adapter.action.STATE_CHANGED":
            case "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED":
                b bVar2 = (b) this.f20207a;
                bVar2.getClass();
                Boolean bool2 = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", Integer.MIN_VALUE) == 2 ? Boolean.TRUE : null;
                d dVar2 = bVar2.f20175c;
                if (dVar2.f20200t != bool2) {
                    dVar2.f20200t = bool2;
                    bVar2.d();
                    break;
                }
                break;
            case "android.intent.action.AIRPLANE_MODE":
                b bVar3 = (b) this.f20207a;
                bVar3.f20175c.f20203w = Boolean.valueOf(intent.getBooleanExtra("state", false));
                bVar3.d();
                break;
            case "android.os.action.POWER_SAVE_MODE_CHANGED":
                b bVar4 = (b) this.f20207a;
                bVar4.f20175c.f20201u = com.fyber.inneractive.sdk.serverapi.b.n();
                bVar4.d();
                break;
            case "android.media.RINGER_MODE_CHANGED":
                b bVar5 = (b) this.f20207a;
                bVar5.getClass();
                int intExtra2 = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", -1);
                if (intExtra2 != 0 && intExtra2 != 1) {
                    z10 = false;
                }
                Boolean bool3 = bVar5.f20175c.f20205y;
                if (bool3 == null || bool3.booleanValue() != z10) {
                    bVar5.f20175c.f20205y = Boolean.valueOf(z10);
                    bVar5.d();
                    break;
                }
                break;
            case "android.app.action.INTERRUPTION_FILTER_CHANGED":
                ((b) this.f20207a).c();
                break;
        }
    }
}
