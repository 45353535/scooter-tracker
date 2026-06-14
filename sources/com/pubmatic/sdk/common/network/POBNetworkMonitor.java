package com.pubmatic.sdk.common.network;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"MissingPermission"})
public class POBNetworkMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f62474a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConnectivityManager f62476c;

    @Nullable
    protected List<POBConnectivityListener> connectivityListeners;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConnectionType f62475b = ConnectionType.UNKNOWN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f62477d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f62478e = false;

    public enum ConnectionType {
        UNKNOWN(0),
        ETHERNET(1),
        WIFI(2),
        CELLULAR_NETWORK_UN(3),
        CELLULAR_NETWORK_2G(4),
        CELLULAR_NETWORK_3G(5),
        CELLULAR_NETWORK_4G(6),
        CELLULAR_NETWORK_5G(7);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f62480a;

        ConnectionType(int i10) {
            this.f62480a = i10;
        }

        public int getValue() {
            return this.f62480a;
        }
    }

    public static class POBConnectivityListener {
        @MainThread
        public void onNetworkConnectionChanged(boolean z10) {
        }

        public void onNetworkPropertiesChanged() {
        }

        public void onNetworkRegistrationFailed() {
        }
    }

    class a implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TelephonyManager f62481a;

        a(TelephonyManager telephonyManager) {
            this.f62481a = telephonyManager;
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkMonitor.f.a
        public void a(TelephonyDisplayInfo telephonyDisplayInfo) {
            POBNetworkMonitor pOBNetworkMonitor = POBNetworkMonitor.this;
            pOBNetworkMonitor.f62475b = pOBNetworkMonitor.a(telephonyDisplayInfo);
            if (POBNetworkMonitor.this.f62477d != null) {
                this.f62481a.unregisterTelephonyCallback(POBNetworkMonitor.this.f62477d);
            }
        }
    }

    class b extends PhoneStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TelephonyManager f62483a;

        b(TelephonyManager telephonyManager) {
            this.f62483a = telephonyManager;
        }

        @Override // android.telephony.PhoneStateListener
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            super.onDisplayInfoChanged(telephonyDisplayInfo);
            POBNetworkMonitor pOBNetworkMonitor = POBNetworkMonitor.this;
            pOBNetworkMonitor.f62475b = pOBNetworkMonitor.a(telephonyDisplayInfo);
            this.f62483a.listen(this, 0);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBNetworkMonitor.this.c();
        }
    }

    private class d extends ConnectivityManager.NetworkCallback {
        private d() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            POBNetworkMonitor.this.b();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            POBNetworkMonitor.this.a();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            POBNetworkMonitor.this.b();
        }

        /* synthetic */ d(POBNetworkMonitor pOBNetworkMonitor, a aVar) {
            this();
        }
    }

    private class e extends ConnectivityManager.NetworkCallback {
        private e() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (POBNetworkMonitor.this.f62476c != null) {
                POBNetworkMonitor pOBNetworkMonitor = POBNetworkMonitor.this;
                if (pOBNetworkMonitor.a(pOBNetworkMonitor.f62476c, network)) {
                    POBNetworkMonitor.this.b();
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (POBNetworkMonitor.this.f62476c != null) {
                POBNetworkMonitor pOBNetworkMonitor = POBNetworkMonitor.this;
                if (pOBNetworkMonitor.a(pOBNetworkMonitor.f62476c, network)) {
                    POBNetworkMonitor.this.a();
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (POBNetworkMonitor.this.f62476c != null) {
                POBNetworkMonitor pOBNetworkMonitor = POBNetworkMonitor.this;
                if (pOBNetworkMonitor.a(pOBNetworkMonitor.f62476c, network)) {
                    POBNetworkMonitor.this.b();
                }
            }
        }

        /* synthetic */ e(POBNetworkMonitor pOBNetworkMonitor, a aVar) {
            this();
        }
    }

    private static class f extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f62488a;

        interface a {
            void a(TelephonyDisplayInfo telephonyDisplayInfo);
        }

        public f(a aVar) {
            this.f62488a = aVar;
        }

        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            this.f62488a.a(telephonyDisplayInfo);
        }
    }

    public POBNetworkMonitor(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f62474a = applicationContext;
        this.f62476c = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        d();
        updateConnectionType();
    }

    @NonNull
    public ConnectionType getConnectionType() {
        if (Build.VERSION.SDK_INT <= 23) {
            updateConnectionType();
        }
        return this.f62475b;
    }

    public boolean isNetworkAvailable() {
        return isNetworkAvailable(this.f62474a);
    }

    public boolean isWiFiConnected() {
        if (Build.VERSION.SDK_INT <= 23) {
            updateConnectionType();
        }
        return this.f62475b == ConnectionType.WIFI;
    }

    @MainThread
    public void registerConnectivityListener(POBConnectivityListener pOBConnectivityListener) {
        if (this.f62478e) {
            pOBConnectivityListener.onNetworkRegistrationFailed();
            return;
        }
        if (this.connectivityListeners == null) {
            this.connectivityListeners = new ArrayList(1);
        }
        this.connectivityListeners.add(pOBConnectivityListener);
    }

    @MainThread
    public void unregisterConnectivityListener(@Nullable POBConnectivityListener pOBConnectivityListener) {
        List<POBConnectivityListener> list;
        if (pOBConnectivityListener == null || (list = this.connectivityListeners) == null || !list.contains(pOBConnectivityListener)) {
            return;
        }
        this.connectivityListeners.remove(pOBConnectivityListener);
        if (this.connectivityListeners.isEmpty()) {
            this.connectivityListeners = null;
        }
    }

    public void updateConnectionType() {
        NetworkInfo activeNetworkInfo;
        if (this.f62476c == null || !POBUtils.hasPermission(this.f62474a, "android.permission.ACCESS_NETWORK_STATE")) {
            this.f62475b = ConnectionType.UNKNOWN;
            return;
        }
        try {
            activeNetworkInfo = this.f62476c.getActiveNetworkInfo();
        } catch (Exception e10) {
            POBLog.warn("POBNetworkMonitor", "Failed to get active network info :" + e10.getMessage(), new Object[0]);
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo == null) {
            this.f62475b = ConnectionType.UNKNOWN;
            return;
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            e();
        } else if (type == 1) {
            this.f62475b = ConnectionType.WIFI;
        } else {
            if (type != 9) {
                return;
            }
            this.f62475b = ConnectionType.ETHERNET;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        POBTaskHandler.getInstance().runOnMainThread(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        updateConnectionType();
        if (this.connectivityListeners != null) {
            for (int i10 = 0; i10 < this.connectivityListeners.size(); i10++) {
                POBConnectivityListener pOBConnectivityListener = this.connectivityListeners.get(i10);
                if (pOBConnectivityListener != null) {
                    pOBConnectivityListener.onNetworkConnectionChanged(isNetworkAvailable(this.f62474a));
                }
            }
        }
    }

    private void d() {
        ConnectivityManager connectivityManager = this.f62476c;
        if (connectivityManager != null) {
            a aVar = null;
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    connectivityManager.registerDefaultNetworkCallback(new d(this, aVar));
                    this.f62478e = false;
                    return;
                } catch (RuntimeException e10) {
                    this.f62478e = true;
                    POBLog.warn("POBNetworkMonitor", "Failed to register network callback :" + e10.getMessage(), new Object[0]);
                    return;
                }
            }
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12);
            builder.addCapability(16);
            builder.removeCapability(15);
            try {
                this.f62476c.registerNetworkCallback(builder.build(), new e(this, aVar));
                this.f62478e = false;
            } catch (RuntimeException e11) {
                this.f62478e = true;
                POBLog.warn("POBNetworkMonitor", "Failed to register network callback :" + e11.getMessage(), new Object[0]);
            }
        }
    }

    private void e() {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) this.f62474a.getSystemService("phone");
        if (telephonyManager == null) {
            this.f62475b = ConnectionType.CELLULAR_NETWORK_UN;
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            a(telephonyManager);
            return;
        }
        try {
            networkType = telephonyManager.getNetworkType();
        } catch (Exception e10) {
            POBLog.error("POBNetworkMonitor", "Failed to get telephony manager :" + e10.getMessage(), new Object[0]);
            networkType = 0;
        }
        this.f62475b = a(networkType);
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && POBUtils.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                if (activeNetworkInfo.isConnectedOrConnecting()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            POBLog.warn("POBNetworkMonitor", "Failed to check network availability :" + e10.getMessage(), new Object[0]);
        }
        return false;
    }

    private void a(TelephonyManager telephonyManager) {
        if (POBUtils.hasPermission(this.f62474a, "android.permission.READ_PHONE_STATE")) {
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    f fVar = new f(new a(telephonyManager));
                    this.f62477d = fVar;
                    telephonyManager.registerTelephonyCallback(executorServiceNewSingleThreadExecutor, fVar);
                    return;
                }
                telephonyManager.listen(new b(telephonyManager), 1048576);
                return;
            } catch (Exception e10) {
                this.f62475b = ConnectionType.CELLULAR_NETWORK_UN;
                POBLog.warn("POBNetworkMonitor", "Not able fetch connection type due to " + e10.getMessage(), new Object[0]);
                return;
            }
        }
        this.f62475b = ConnectionType.CELLULAR_NETWORK_UN;
        POBLog.warn("POBNetworkMonitor", "Not able fetch connection type due to android.permission.READ_PHONE_STATE permission is not available for the app!", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ConnectionType a(TelephonyDisplayInfo telephonyDisplayInfo) {
        if (telephonyDisplayInfo.getOverrideNetworkType() != 2 && telephonyDisplayInfo.getOverrideNetworkType() != 3 && telephonyDisplayInfo.getOverrideNetworkType() != 5) {
            return a(telephonyDisplayInfo.getNetworkType());
        }
        return ConnectionType.CELLULAR_NETWORK_5G;
    }

    private ConnectionType a(int i10) {
        if (i10 != 20) {
            switch (i10) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return ConnectionType.CELLULAR_NETWORK_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return ConnectionType.CELLULAR_NETWORK_3G;
                case 13:
                    return ConnectionType.CELLULAR_NETWORK_4G;
                default:
                    return ConnectionType.CELLULAR_NETWORK_UN;
            }
        }
        return ConnectionType.CELLULAR_NETWORK_5G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(ConnectivityManager connectivityManager, Network network) {
        return network.equals(connectivityManager.getActiveNetwork());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.connectivityListeners != null) {
            for (int i10 = 0; i10 < this.connectivityListeners.size(); i10++) {
                POBConnectivityListener pOBConnectivityListener = this.connectivityListeners.get(i10);
                if (pOBConnectivityListener != null) {
                    pOBConnectivityListener.onNetworkPropertiesChanged();
                }
            }
        }
    }
}
