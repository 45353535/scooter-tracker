package n1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f95037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f95038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f95039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f95040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o1.a f95041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IIgniteServiceAPI f95042k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f95046o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f95047p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f95033b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f95034c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f95035d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f95036e = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Bundle f95043l = new Bundle();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f95044m = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f95048q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f95049r = new b(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m1.a f95045n = new m1.a(this);

    public e(Context context) {
        String str = null;
        this.f95037f = context.getApplicationContext();
        Intent intent = new Intent("com.digitalturbine.ignite.cl.IgniteRemoteService");
        Context context2 = this.f95037f;
        if (context2 != null) {
            List<ResolveInfo> listQueryIntentServices = context2.getPackageManager().queryIntentServices(intent, 0);
            if (listQueryIntentServices.size() > 0) {
                str = listQueryIntentServices.get(0).serviceInfo.packageName;
            }
        }
        this.f95040i = str;
        this.f95041j = new o1.a(false, "");
    }

    @Override // n1.a
    public final boolean a() {
        IIgniteServiceAPI iIgniteServiceAPI;
        return this.f95036e && (iIgniteServiceAPI = this.f95042k) != null && iIgniteServiceAPI.asBinder().isBinderAlive();
    }

    @Override // n1.a
    public final void b() {
        if (TextUtils.isEmpty(this.f95040i)) {
            t1.b.b("%s : unable to authenticate - there is no ignite on the device", "IgniteAuthenticationComponent");
            return;
        }
        if (!a()) {
            w1.c.f106930a.execute(this.f95049r);
            return;
        }
        if (!this.f95033b || f()) {
            m();
            return;
        }
        Object[] objArr = {"IgniteAuthenticationComponent"};
        t1.a aVar = t1.b.f104802b.f104803a;
        if (aVar != null) {
            aVar.i("%s : already authenticated", objArr);
        }
    }

    @Override // n1.a
    public final void c(String str) {
        String str2;
        t1.b.a("%s: onAuthenticationSuccess", "IgniteAuthenticationComponent");
        this.f95034c = false;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f95048q = str;
        this.f95043l.putString("clientToken", str);
        this.f95033b = true;
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            try {
                str2 = new String(Base64.decode(str.split("\\.")[1], 8), "UTF-8");
            } catch (Exception e10) {
                t1.b.b("%s : decodeJwtBody : %s", "JwtUtil", e10.toString());
                str2 = "";
            }
        }
        if (!str2.isEmpty()) {
            try {
                long jOptLong = new JSONObject(str2).optLong("exp");
                this.f95035d = jOptLong;
                long millis = TimeUnit.SECONDS.toMillis(jOptLong);
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(millis);
                    str3 = simpleDateFormat.format(calendar.getTime());
                } catch (Exception unused) {
                }
                t1.b.a("%s : Ignite session will exp in: %s", "IgniteAuthenticationComponent", str3);
            } catch (Exception e11) {
                p1.b.a(p1.d.ONE_DT_GENERAL_ERROR, e11);
                t1.b.b("%s: resolveSessionExpiryTime : unable resolve session expiration : %s", "IgniteAuthenticationComponent", e11.toString());
            }
        }
        a aVar = this.f95046o;
        if (aVar != null) {
            aVar.c(str);
        }
    }

    @Override // n1.a
    public final String d() {
        return this.f95040i;
    }

    @Override // n1.a
    public final void destroy() {
        if (this.f95037f != null && a()) {
            this.f95037f.unbindService(this);
            this.f95037f = null;
        }
        this.f95047p = null;
        this.f95046o = null;
        this.f95042k = null;
    }

    @Override // n1.a
    public final String e() {
        return this.f95048q;
    }

    @Override // n1.a
    public final boolean f() {
        return this.f95035d > 0 && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) > this.f95035d;
    }

    @Override // n1.a
    public final Context g() {
        return this.f95037f;
    }

    @Override // n1.a
    public final boolean h() {
        return this.f95033b;
    }

    @Override // n1.a
    public final String i() {
        return this.f95041j.f96314a;
    }

    @Override // n1.a
    public final boolean j() {
        return this.f95041j.f96315b;
    }

    @Override // n1.a
    public final IIgniteServiceAPI k() {
        return this.f95042k;
    }

    @Override // n1.a
    public final void l() {
        b();
    }

    public final void m() {
        if (a()) {
            String str = this.f95038g;
            String str2 = this.f95039h;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || this.f95034c) {
                return;
            }
            if ((f() || !this.f95033b) && this.f95042k != null) {
                try {
                    this.f95034c = true;
                    this.f95043l.putInt("sdkFlowTypeKey", 1);
                    this.f95042k.authenticate(this.f95038g, this.f95039h, this.f95043l, this.f95045n);
                } catch (RemoteException e10) {
                    this.f95034c = false;
                    p1.b.a(p1.d.ONE_DT_AUTHENTICATION_ERROR, e10);
                    t1.b.b("%s: startAuthenticationProcess: unable to start authentication : %s", "IgniteAuthenticationComponent", e10.toString());
                }
            }
        }
    }

    @Override // r1.b
    public final void onCredentialsRequestFailed(String str) {
        t1.b.b("%s: onCredentialsRequestFailed: %s", "IgniteAuthenticationComponent", str);
        b(str);
    }

    @Override // r1.b
    public final void onCredentialsRequestSuccess(String str, String str2) {
        this.f95038g = str;
        this.f95039h = str2;
        m();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        t1.b.a("%s : onIgniteConnected", "IgniteAuthenticationComponent");
        this.f95042k = IIgniteServiceAPI.Stub.asInterface(iBinder);
        this.f95036e = true;
        w1.c.f106930a.execute(new c(this, new d(this, componentName, iBinder)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f95036e = false;
        this.f95035d = 0L;
        b("Service : " + (componentName != null ? componentName.getClassName() : "Ignite") + " disconnected");
    }

    @Override // n1.a
    public final void a(String str) {
        t1.b.b("%s : onAuthenticationFailed : %s", "IgniteAuthenticationComponent", str);
        this.f95034c = false;
        a aVar = this.f95046o;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    @Override // n1.a
    public final void a(ComponentName componentName, IBinder iBinder) {
        a aVar = this.f95047p;
        if (aVar != null) {
            aVar.a(componentName, iBinder);
        }
    }

    @Override // n1.a
    public final void b(a aVar) {
        this.f95046o = aVar;
    }

    @Override // n1.a
    public final void b(String str) {
        t1.b.b("%s : onIgniteFailedToConnect : %s", "IgniteAuthenticationComponent", str);
        a aVar = this.f95047p;
        if (aVar != null) {
            aVar.b(str);
        }
    }

    @Override // n1.a
    public final void c(a aVar) {
        this.f95047p = aVar;
    }

    @Override // n1.a
    public final boolean c() {
        return f() || !a();
    }
}
