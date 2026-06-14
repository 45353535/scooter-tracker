package com.ktwapps.speedometer;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.widget.Toast;
import com.google.android.gms.maps.model.LatLng;
import com.ktwapps.speedometer.Database.AppDatabaseObject;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import w4.e;
import x4.a0;
import x4.n;
import x4.o;
import x4.u;
import x4.w;
import x4.x;

/* JADX INFO: loaded from: classes10.dex */
public class LocationService extends Service implements o.a, u.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f46032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    u f46033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    n f46034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    w f46035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    o f46036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f46037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private w4.c f46038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private IBinder f46039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    BroadcastReceiver f46040j = new a();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (LocationService.this.f46033c.h()) {
                return;
            }
            LocationService.this.p();
        }
    }

    class b extends Binder {
        b() {
        }

        LocationService a() {
            return LocationService.this;
        }
    }

    public interface c {
        void k(Location location);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.f46037g.h(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        x.H(this);
        Toast.makeText(getApplicationContext(), R.string.toast_history_saved, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        AppDatabaseObject appDatabaseObjectF = AppDatabaseObject.f(getApplicationContext());
        int iJ = (int) appDatabaseObjectF.g().j(new v4.b(getResources().getString(R.string.untitled), this.f46038h.h(), this.f46038h.g(), this.f46038h.v(), this.f46038h.e(), this.f46038h.C(), this.f46038h.E() != null ? this.f46038h.E() : getResources().getString(R.string.address_not_found), this.f46038h.f() != null ? this.f46038h.f() : getResources().getString(R.string.address_not_found), this.f46038h.F(), new Date().getTime()));
        for (int i10 = 0; i10 < this.f46038h.x().size(); i10++) {
            List list = (List) this.f46038h.x().get(i10);
            List list2 = (List) this.f46038h.D().get(i10);
            int i11 = 0;
            while (i11 < list.size()) {
                LatLng latLng = (LatLng) list.get(i11);
                int i12 = i11;
                v4.a aVar = new v4.a(System.currentTimeMillis(), 0, i10, latLng.longitude, latLng.latitude, ((Float) list2.get(i11)).floatValue());
                aVar.j(iJ);
                appDatabaseObjectF.g().h(aVar);
                i11 = i12 + 1;
            }
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: s4.s0
            @Override // java.lang.Runnable
            public final void run() {
                this.f99710b.h();
            }
        });
    }

    public w4.c d() {
        return this.f46038h;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    @Override // x4.u.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(android.location.Location r14) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ktwapps.speedometer.LocationService.e(android.location.Location):void");
    }

    public boolean f() {
        return this.f46037g.c();
    }

    @Override // x4.u.d
    public void i(int i10, int i11) {
        this.f46038h.U(i10);
        this.f46038h.T(i11);
    }

    public void k() {
        this.f46038h.M();
        this.f46033c.j(this, 1000L);
        this.f46036f.sendEmptyMessage(2);
    }

    public void l() {
        if (this.f46038h.g() <= 0.0f || !x.F(this)) {
            x.H(this);
        } else {
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: s4.q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f99698b.j();
                }
            });
        }
    }

    @Override // x4.o.a
    public void m() {
        if (!this.f46037g.c()) {
            if (this.f46038h.I()) {
                this.f46038h.V(0.0f);
                if (!this.f46037g.f()) {
                    this.f46037g.l(true);
                    this.f46035e.c(this, this.f46038h.q(this), this.f46038h.l(this), this.f46037g.c());
                }
            }
            this.f46038h.G(x.D(this));
            this.f46038h.Z();
            if (this.f46038h.K(this)) {
                this.f46037g.i(System.currentTimeMillis());
                if (!this.f46037g.e()) {
                    this.f46037g.k(true);
                    this.f46038h.b0();
                }
                if (!this.f46037g.b()) {
                    this.f46037g.h(true);
                    int iP = x.p(this);
                    if (iP != 0) {
                        a0.a(this).b(iP - 1);
                    }
                    if (x.G(this)) {
                        a0.a(this).c(this);
                    }
                    if (x.C(this)) {
                        new Handler().postDelayed(new Runnable() { // from class: s4.r0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f99704b.g();
                            }
                        }, 2000L);
                    }
                }
            } else if (System.currentTimeMillis() - this.f46037g.a() > 2000) {
                this.f46037g.g();
            }
            this.f46034d.d(this.f46038h);
        }
        this.f46036f.sendEmptyMessageDelayed(2, 70L);
    }

    public void n(c cVar) {
        this.f46032b = cVar;
    }

    public void o(boolean z10) {
        this.f46038h.M();
        if (z10) {
            this.f46037g.j(true);
        } else {
            this.f46038h.H();
            this.f46037g.j(false);
        }
        this.f46035e.c(this, this.f46038h.q(this), this.f46038h.l(this), this.f46037g.c());
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f46039i;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f46034d = new n(this);
        this.f46033c = new u(this);
        this.f46035e = new w(this);
        this.f46036f = new o(getMainLooper());
        this.f46039i = new b();
        this.f46038h = new w4.c();
        this.f46037g = new e();
        this.f46033c.m(this);
        this.f46036f.a(this);
        k();
        registerReceiver(this.f46040j, new IntentFilter("android.location.PROVIDERS_CHANGED"));
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f46034d.b();
        q();
        unregisterReceiver(this.f46040j);
        stopForeground(true);
        l();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        this.f46034d.b();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (intent != null && intent.getAction() != null && intent.getAction().equals("com.ktwapps.speedometer.ACTION_STOP")) {
            intent = new Intent("STOP_SERVICE_BROADCAST_RECEIVER");
            intent.setPackage(getPackageName());
            sendBroadcast(intent);
            p();
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                startForeground(20191031, this.f46035e.b(this, this.f46038h.q(this), this.f46038h.l(this), this.f46037g.c()), 8);
            } else {
                startForeground(20191031, this.f46035e.b(this, this.f46038h.q(this), this.f46038h.l(this), this.f46037g.c()));
            }
        } catch (Exception unused) {
        }
        if (intent != null && intent.hasExtra("location")) {
            Location location = (Location) intent.getParcelableExtra("location");
            int intExtra = intent.getIntExtra("numberOfSatellites", 0);
            int intExtra2 = intent.getIntExtra("numberOfFixedSatellites", 0);
            long longExtra = intent.getLongExtra("lastSatellitesUpdate", 0L);
            long longExtra2 = intent.getLongExtra("lastLocationUpdate", 0L);
            this.f46038h.U(intExtra);
            this.f46038h.T(intExtra2);
            this.f46038h.Q(longExtra);
            if (location != null) {
                this.f46038h.P(location);
                if (location.getAccuracy() <= 20.0f && System.currentTimeMillis() - location.getTime() <= 5000 && !Float.isNaN(location.getSpeed()) && location.getSpeed() != Float.POSITIVE_INFINITY && location.getSpeed() != Float.NEGATIVE_INFINITY) {
                    this.f46038h.R(longExtra2);
                    this.f46038h.S(location);
                    if (!this.f46038h.I()) {
                        this.f46038h.V(location.getSpeed());
                        w4.c cVar = this.f46038h;
                        cVar.b(cVar.A());
                        this.f46038h.c(location);
                        this.f46038h.Y(this, location, false, false);
                    }
                    this.f46038h.d(this, location.getLatitude(), location.getLongitude());
                    this.f46035e.c(this, this.f46038h.q(this), this.f46038h.l(this), this.f46037g.c());
                    c cVar2 = this.f46032b;
                    if (cVar2 == null) {
                        return 2;
                    }
                    cVar2.k(location);
                    return 2;
                }
            }
        }
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return true;
    }

    public void p() {
        stopSelf();
    }

    public void q() {
        this.f46033c.n();
        this.f46036f.removeMessages(2);
    }
}
