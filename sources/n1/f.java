package n1;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f95050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r1.a f95051c;

    public f(a aVar, r1.a aVar2) {
        this.f95050b = aVar;
        this.f95051c = aVar2;
        aVar.c(this);
        aVar.b(this);
    }

    @Override // n1.a
    public boolean a() {
        return this.f95050b.a();
    }

    @Override // n1.a
    public void b() {
        this.f95050b.b();
    }

    @Override // n1.a
    public boolean c() {
        return this.f95050b.c();
    }

    @Override // n1.a
    public String d() {
        return null;
    }

    @Override // n1.a
    public void destroy() {
        this.f95051c = null;
        this.f95050b.destroy();
    }

    @Override // n1.a
    public final String e() {
        return this.f95050b.e();
    }

    @Override // n1.a
    public boolean f() {
        return this.f95050b.f();
    }

    @Override // n1.a
    public Context g() {
        return this.f95050b.g();
    }

    @Override // n1.a
    public boolean h() {
        return this.f95050b.h();
    }

    @Override // n1.a
    public String i() {
        return null;
    }

    @Override // n1.a
    public boolean j() {
        return false;
    }

    @Override // n1.a
    public IIgniteServiceAPI k() {
        return this.f95050b.k();
    }

    @Override // n1.a
    public void l() {
        this.f95050b.l();
    }

    @Override // r1.b
    public void onCredentialsRequestFailed(String str) {
        this.f95050b.onCredentialsRequestFailed(str);
    }

    @Override // r1.b
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.f95050b.onCredentialsRequestSuccess(str, str2);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f95050b.onServiceConnected(componentName, iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f95050b.onServiceDisconnected(componentName);
    }

    @Override // n1.a
    public void a(String str) {
        r1.a aVar = this.f95051c;
        if (aVar != null) {
            aVar.onIgniteServiceAuthenticationFailed(str);
        }
    }

    @Override // n1.a
    public void b(String str) {
        r1.a aVar = this.f95051c;
        if (aVar != null) {
            aVar.onIgniteServiceConnectionFailed(str);
        }
    }

    @Override // n1.a
    public void c(String str) {
        r1.a aVar = this.f95051c;
        if (aVar != null) {
            aVar.onIgniteServiceAuthenticated(str);
        }
    }

    @Override // n1.a
    public void a(ComponentName componentName, IBinder iBinder) {
        r1.a aVar = this.f95051c;
        if (aVar != null) {
            aVar.onIgniteServiceConnected(componentName, iBinder);
        }
    }

    @Override // n1.a
    public final void b(a aVar) {
        this.f95050b.b(aVar);
    }

    @Override // n1.a
    public final void c(a aVar) {
        this.f95050b.c(aVar);
    }
}
