package x2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.facebook.internal.z;
import com.facebook.s;
import h3.a;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import v2.h;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f108091a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f108092b = e.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f108093c;

    public enum a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f108097b;

        a(String str) {
            this.f108097b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f108097b;
        }
    }

    private static final class b implements ServiceConnection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CountDownLatch f108098b = new CountDownLatch(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private IBinder f108099c;

        public final IBinder m() throws InterruptedException {
            this.f108098b.await(5L, TimeUnit.SECONDS);
            return this.f108099c;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f108098b.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder serviceBinder) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(serviceBinder, "serviceBinder");
            this.f108099c = serviceBinder;
            this.f108098b.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }
    }

    public enum c {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR
    }

    private e() {
    }

    private final Intent a(Context context) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage(FbValidationUtils.FB_PACKAGE);
                if (packageManager.resolveService(intent, 0) != null && com.facebook.internal.d.a(context, FbValidationUtils.FB_PACKAGE)) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage(FbValidationUtils.DEBUG_FB_PACKAGE);
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (com.facebook.internal.d.a(context, FbValidationUtils.DEBUG_FB_PACKAGE)) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public static final boolean b() {
        if (e3.a.d(e.class)) {
            return false;
        }
        try {
            if (f108093c == null) {
                f108093c = Boolean.valueOf(f108091a.a(s.m()) != null);
            }
            Boolean bool = f108093c;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
            return false;
        }
    }

    public static final c c(String applicationId, List appEvents) {
        if (e3.a.d(e.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            return f108091a.d(a.CUSTOM_APP_EVENTS, applicationId, appEvents);
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
            return null;
        }
    }

    private final c d(a aVar, String str, List list) {
        c cVar;
        String str2;
        if (e3.a.d(this)) {
            return null;
        }
        try {
            c cVar2 = c.SERVICE_NOT_AVAILABLE;
            h.b();
            Context contextM = s.m();
            Intent intentA = a(contextM);
            if (intentA == null) {
                return cVar2;
            }
            b bVar = new b();
            try {
                if (!contextM.bindService(intentA, bVar, 1)) {
                    return c.SERVICE_ERROR;
                }
                try {
                    IBinder iBinderM = bVar.m();
                    if (iBinderM != null) {
                        h3.a aVarA = a.AbstractBinderC0891a.a(iBinderM);
                        Bundle bundleA = d.a(aVar, str, list);
                        if (bundleA != null) {
                            aVarA.f(bundleA);
                            z.a0(f108092b, "Successfully sent events to the remote service: " + bundleA);
                        }
                        cVar2 = c.OPERATION_SUCCESS;
                    }
                    contextM.unbindService(bVar);
                    z.a0(f108092b, "Unbound from the remote service");
                    return cVar2;
                } catch (RemoteException e10) {
                    cVar = c.SERVICE_ERROR;
                    str2 = f108092b;
                    z.Z(str2, e10);
                    contextM.unbindService(bVar);
                    z.a0(str2, "Unbound from the remote service");
                    return cVar;
                } catch (InterruptedException e11) {
                    cVar = c.SERVICE_ERROR;
                    str2 = f108092b;
                    z.Z(str2, e11);
                    contextM.unbindService(bVar);
                    z.a0(str2, "Unbound from the remote service");
                    return cVar;
                }
            } catch (Throwable th2) {
                contextM.unbindService(bVar);
                z.a0(f108092b, "Unbound from the remote service");
                throw th2;
            }
        } catch (Throwable th3) {
            e3.a.b(th3, this);
            return null;
        }
    }

    public static final c e(String applicationId) {
        if (e3.a.d(e.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            return f108091a.d(a.MOBILE_APP_INSTALL, applicationId, CollectionsKt.emptyList());
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
            return null;
        }
    }
}
