package w4;

import android.app.ActivityManager;
import android.content.Context;
import com.ktwapps.speedometer.LocationService;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f107464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f107465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f107466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f107467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f107468e;

    public static boolean d(Context context) {
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            if (LocationService.class.getName().equals(it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public long a() {
        return this.f107468e;
    }

    public boolean b() {
        return this.f107464a;
    }

    public boolean c() {
        return this.f107465b;
    }

    public boolean e() {
        return this.f107465b;
    }

    public boolean f() {
        return this.f107467d;
    }

    public void g() {
        k(false);
        h(false);
    }

    public void h(boolean z10) {
        this.f107464a = z10;
    }

    public void i(long j10) {
        this.f107468e = j10;
    }

    public void j(boolean z10) {
        this.f107465b = z10;
    }

    public void k(boolean z10) {
        this.f107466c = z10;
    }

    public void l(boolean z10) {
        this.f107467d = z10;
    }
}
