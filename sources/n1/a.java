package n1;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;

/* JADX INFO: loaded from: classes6.dex */
public interface a extends ServiceConnection, r1.b {
    void a(ComponentName componentName, IBinder iBinder);

    void a(String str);

    boolean a();

    void b();

    void b(String str);

    void b(a aVar);

    void c(String str);

    void c(a aVar);

    boolean c();

    String d();

    void destroy();

    String e();

    boolean f();

    Context g();

    boolean h();

    String i();

    boolean j();

    IIgniteServiceAPI k();

    void l();
}
