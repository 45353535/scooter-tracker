package com.startapp.sdk.adsbase.periodic;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.startapp.sdk.internal.b8;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.m2;
import com.startapp.sdk.internal.q0;
import com.startapp.sdk.internal.uf;
import com.startapp.sdk.internal.vf;
import com.startapp.sdk.internal.y1;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends y1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f64120i = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f64121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lb f64122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f64123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f64124h;

    static {
        Intrinsics.checkNotNullExpressionValue(a.class.getSimpleName(), "getSimpleName(...)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, m2 callback, lb prefs, long j10, long j11) {
        super(context, callback);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.f64121e = context;
        this.f64122f = prefs;
        this.f64123g = j10;
        this.f64124h = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #0 {all -> 0x002e, blocks: (B:3:0x000b, B:5:0x0017, B:7:0x001f, B:9:0x0025, B:14:0x0033, B:19:0x003d), top: B:27:0x000b }] */
    @Override // com.startapp.sdk.internal.y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r5 = this;
            com.startapp.sdk.internal.b8 r0 = new com.startapp.sdk.internal.b8
            r0.<init>()
            java.lang.String r1 = "dataBuilder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            android.content.Context r2 = r5.f64121e     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "bluetooth"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch: java.lang.Throwable -> L2e
            boolean r3 = r2 instanceof android.bluetooth.BluetoothManager     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L3a
            android.bluetooth.BluetoothManager r2 = (android.bluetooth.BluetoothManager) r2     // Catch: java.lang.Throwable -> L2e
            android.bluetooth.BluetoothAdapter r2 = r2.getAdapter()     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L3a
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2e
            r4 = 31
            if (r3 >= r4) goto L30
            android.content.Context r3 = r5.f64121e     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "android.permission.BLUETOOTH"
            boolean r3 = com.startapp.sdk.internal.q0.a(r3, r4)     // Catch: java.lang.Throwable -> L2e
            goto L31
        L2e:
            r2 = move-exception
            goto L42
        L30:
            r3 = 1
        L31:
            if (r3 == 0) goto L3a
            boolean r3 = r2.isEnabled()     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L3a
            goto L3b
        L3a:
            r2 = 0
        L3b:
            if (r2 == 0) goto L45
            boolean r1 = r5.a(r2, r0)     // Catch: java.lang.Throwable -> L2e
            goto L45
        L42:
            com.startapp.sdk.internal.g9.a(r2)
        L45:
            if (r1 == 0) goto L4a
            long r1 = r5.f64123g
            goto L4c
        L4a:
            r1 = 0
        L4c:
            com.startapp.sdk.adsbase.periodic.b r3 = new com.startapp.sdk.adsbase.periodic.b
            r3.<init>()
            android.os.Handler r0 = r5.f65591c
            r0.postDelayed(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.periodic.a.a():void");
    }

    public static final void a(a this$0, b8 dataBuilder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dataBuilder, "$dataBuilder");
        this$0.a(dataBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.BroadcastReceiver, com.startapp.sdk.adsbase.periodic.GetBluetoothAsync$startUnsafe$1] */
    public final boolean a(BluetoothAdapter bluetoothAdapter, final b8 b8Var) {
        boolean zA;
        boolean zA2;
        Set<BluetoothDevice> bondedDevices;
        try {
            if (Build.VERSION.SDK_INT < 31) {
                zA2 = q0.a(this.f64121e, "android.permission.BLUETOOTH");
            } else {
                zA2 = q0.a(this.f64121e, "android.permission.BLUETOOTH_CONNECT");
            }
            if (zA2 && (bondedDevices = bluetoothAdapter.getBondedDevices()) != null) {
                for (BluetoothDevice bluetoothDevice : bondedDevices) {
                    Intrinsics.checkNotNull(bluetoothDevice);
                    synchronized (b8Var) {
                        Intrinsics.checkNotNullParameter(bluetoothDevice, "bluetoothDevice");
                        b8Var.f64309a.add(bluetoothDevice);
                    }
                }
            }
        } catch (Throwable th2) {
            g9.a(th2);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z10 = jCurrentTimeMillis - ((vf) this.f64122f.a()).getLong("lastBtDiscoveringTime", 0L) >= this.f64124h;
        if (z10) {
            uf ufVarEdit = ((vf) this.f64122f.a()).edit();
            ufVarEdit.a("lastBtDiscoveringTime", Long.valueOf(jCurrentTimeMillis));
            ufVarEdit.f65346a.putLong("lastBtDiscoveringTime", jCurrentTimeMillis);
            ufVarEdit.apply();
        }
        if (!z10) {
            return false;
        }
        ?? r12 = new BroadcastReceiver() { // from class: com.startapp.sdk.adsbase.periodic.GetBluetoothAsync$startUnsafe$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                if (!Intrinsics.areEqual("android.bluetooth.device.action.FOUND", intent.getAction())) {
                    if (Intrinsics.areEqual("android.bluetooth.adapter.action.DISCOVERY_FINISHED", intent.getAction())) {
                        this.f64118a.a(b8Var);
                        return;
                    }
                    return;
                }
                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice2 != null) {
                    b8 b8Var2 = b8Var;
                    synchronized (b8Var2) {
                        Intrinsics.checkNotNullParameter(bluetoothDevice2, "bluetoothDevice");
                        b8Var2.f64310b.add(bluetoothDevice2);
                    }
                }
            }
        };
        b8Var.f64311c = r12;
        this.f64121e.registerReceiver(r12, new IntentFilter("android.bluetooth.device.action.FOUND"));
        if (Build.VERSION.SDK_INT < 31) {
            zA = q0.a(this.f64121e, "android.permission.BLUETOOTH_ADMIN");
        } else {
            zA = q0.a(this.f64121e, "android.permission.BLUETOOTH_SCAN");
        }
        if (zA) {
            return bluetoothAdapter.startDiscovery();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.startapp.sdk.internal.b8 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "android.permission.BLUETOOTH"
            r1 = 0
            r2 = 31
            com.startapp.sdk.internal.x1 r3 = r6.f65590b     // Catch: java.lang.Throwable -> L14
            if (r7 == 0) goto L25
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L14
            if (r4 >= r2) goto L16
            android.content.Context r4 = r6.f64121e     // Catch: java.lang.Throwable -> L14
            boolean r4 = com.startapp.sdk.internal.q0.a(r4, r0)     // Catch: java.lang.Throwable -> L14
            goto L1e
        L14:
            r3 = move-exception
            goto L2a
        L16:
            android.content.Context r4 = r6.f64121e     // Catch: java.lang.Throwable -> L14
            java.lang.String r5 = "android.permission.BLUETOOTH_CONNECT"
            boolean r4 = com.startapp.sdk.internal.q0.a(r4, r5)     // Catch: java.lang.Throwable -> L14
        L1e:
            if (r4 == 0) goto L25
            org.json.JSONObject r4 = r7.a()     // Catch: java.lang.Throwable -> L14
            goto L26
        L25:
            r4 = r1
        L26:
            r3.a(r4)     // Catch: java.lang.Throwable -> L14
            goto L2d
        L2a:
            com.startapp.sdk.internal.g9.a(r3)
        L2d:
            if (r7 == 0) goto L3f
            com.startapp.sdk.adsbase.periodic.GetBluetoothAsync$startUnsafe$1 r3 = r7.f64311c     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L3f
            r7.f64311c = r1     // Catch: java.lang.Throwable -> L3b
            android.content.Context r7 = r6.f64121e     // Catch: java.lang.Throwable -> L3b
            r7.unregisterReceiver(r3)     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r7 = move-exception
            com.startapp.sdk.internal.g9.a(r7)
        L3f:
            android.content.Context r7 = r6.f64121e     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = "bluetooth"
            java.lang.Object r7 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> L5e
            boolean r3 = r7 instanceof android.bluetooth.BluetoothManager     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L6a
            android.bluetooth.BluetoothManager r7 = (android.bluetooth.BluetoothManager) r7     // Catch: java.lang.Throwable -> L5e
            android.bluetooth.BluetoothAdapter r7 = r7.getAdapter()     // Catch: java.lang.Throwable -> L5e
            if (r7 == 0) goto L6a
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L5e
            if (r3 >= r2) goto L60
            android.content.Context r3 = r6.f64121e     // Catch: java.lang.Throwable -> L5e
            boolean r0 = com.startapp.sdk.internal.q0.a(r3, r0)     // Catch: java.lang.Throwable -> L5e
            goto L61
        L5e:
            r7 = move-exception
            goto L87
        L60:
            r0 = 1
        L61:
            if (r0 == 0) goto L6a
            boolean r0 = r7.isEnabled()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L6a
            r1 = r7
        L6a:
            if (r1 == 0) goto L8a
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L5e
            if (r7 >= r2) goto L79
            android.content.Context r7 = r6.f64121e     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "android.permission.BLUETOOTH_ADMIN"
            boolean r7 = com.startapp.sdk.internal.q0.a(r7, r0)     // Catch: java.lang.Throwable -> L5e
            goto L81
        L79:
            android.content.Context r7 = r6.f64121e     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "android.permission.BLUETOOTH_SCAN"
            boolean r7 = com.startapp.sdk.internal.q0.a(r7, r0)     // Catch: java.lang.Throwable -> L5e
        L81:
            if (r7 == 0) goto L8a
            r1.cancelDiscovery()     // Catch: java.lang.Throwable -> L5e
            goto L8a
        L87:
            com.startapp.sdk.internal.g9.a(r7)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.periodic.a.a(com.startapp.sdk.internal.b8):void");
    }
}
