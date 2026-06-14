package f1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class yf {
    public static final NetworkCapabilities a(Context context, Network network) {
        ConnectivityManager connectivityManagerE;
        Object objB;
        if (context == null || (connectivityManagerE = e(context)) == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.f93230c;
            if (network == null) {
                network = connectivityManagerE.getActiveNetwork();
            }
            objB = Result.b(connectivityManagerE.getNetworkCapabilities(network));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            eg.d("Cannot retrieve network capabilities", thG);
        }
        return (NetworkCapabilities) (Result.i(objB) ? null : objB);
    }

    public static /* synthetic */ NetworkCapabilities b(Context context, Network network, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            network = null;
        }
        return a(context, network);
    }

    public static final NetworkInfo c(Context context) {
        ConnectivityManager connectivityManagerE;
        Object objB;
        if (context == null || (connectivityManagerE = e(context)) == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(connectivityManagerE.getActiveNetworkInfo());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            eg.d("Cannot retrieve active network info", thG);
        }
        return (NetworkInfo) (Result.i(objB) ? null : objB);
    }

    public static final fg d(int i10, int i11) {
        if (i10 != 0) {
            return i10 != 1 ? fg.f69867d : fg.f69869f;
        }
        if (i11 == 20) {
            return fg.f69874k;
        }
        switch (i11) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return fg.f69871h;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return fg.f69872i;
            case 13:
                return fg.f69873j;
            default:
                return fg.f69870g;
        }
    }

    public static final ConnectivityManager e(Context context) {
        Object objB;
        if (context == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.f93230c;
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            objB = Result.b((ConnectivityManager) systemService);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            eg.d("Cannot retrieve connectivity manager", thG);
        }
        return (ConnectivityManager) (Result.i(objB) ? null : objB);
    }

    public static final boolean f(Context context) {
        NetworkInfo networkInfoC = c(context);
        return networkInfoC != null && networkInfoC.isConnected() && networkInfoC.getType() == 0;
    }

    public static final boolean g(Context context) {
        NetworkInfo networkInfoC = c(context);
        NetworkCapabilities networkCapabilitiesB = b(context, null, 1, null);
        return networkCapabilitiesB != null ? networkCapabilitiesB.hasCapability(16) : networkInfoC != null && networkInfoC.isConnected();
    }

    public static final boolean h(Context context) {
        NetworkInfo networkInfoC = c(context);
        return networkInfoC != null && networkInfoC.isConnected() && networkInfoC.getType() == 1;
    }

    public static final int i(Context context) {
        NetworkInfo networkInfoC = c(context);
        if (networkInfoC == null || !networkInfoC.isConnected()) {
            return 0;
        }
        return networkInfoC.getSubtype();
    }

    public static final fg j(Context context) {
        NetworkInfo networkInfoC = c(context);
        if (networkInfoC != null) {
            fg fgVarD = networkInfoC.isConnected() ? d(networkInfoC.getType(), networkInfoC.getSubtype()) : fg.f69867d;
            if (fgVarD != null) {
                return fgVarD;
            }
        }
        return fg.f69867d;
    }
}
