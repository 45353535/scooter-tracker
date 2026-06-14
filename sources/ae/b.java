package ae;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f4254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f4255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BluetoothProfile.ServiceListener f4256c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f4257d = false;

    static {
        int[] iArr = {1};
        f4254a = iArr;
        f4255b = new HashMap(iArr.length);
    }

    private static Set b(Context context, Integer num) {
        if (!io.bidmachine.core.h.K(context, "android.permission.BLUETOOTH")) {
            return null;
        }
        try {
            if (BluetoothAdapter.getDefaultAdapter() == null) {
                return null;
            }
            HashSet hashSet = new HashSet();
            try {
                for (Map.Entry entry : f4255b.entrySet()) {
                    if (num == null || ((Integer) entry.getKey()).equals(num)) {
                        BluetoothProfile bluetoothProfile = (BluetoothProfile) entry.getValue();
                        if (bluetoothProfile != null) {
                            Iterator<BluetoothDevice> it = bluetoothProfile.getConnectedDevices().iterator();
                            while (it.hasNext()) {
                                String name = it.next().getName();
                                if (!TextUtils.isEmpty(name)) {
                                    hashSet.add(name);
                                }
                            }
                        }
                    }
                }
                return hashSet;
            } catch (Exception unused) {
                return hashSet;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public static Set c(Context context) {
        return b(context, 1);
    }

    public static Boolean d(Context context) {
        if (!io.bidmachine.core.h.K(context, "android.permission.BLUETOOTH")) {
            return null;
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            boolean z10 = true;
            if ((defaultAdapter != null ? defaultAdapter.getProfileConnectionState(1) : -1) != 2) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void e(Context context) {
        if (context == null || context.getApplicationContext() == null || f4257d || !io.bidmachine.core.h.K(context, "android.permission.BLUETOOTH")) {
            return;
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                return;
            }
            for (int i10 : f4254a) {
                defaultAdapter.getProfileProxy(context.getApplicationContext(), f4256c, i10);
            }
        } catch (Exception unused) {
        }
        f4257d = true;
    }

    class a implements BluetoothProfile.ServiceListener {
        a() {
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i10, BluetoothProfile bluetoothProfile) {
            b.f4255b.put(Integer.valueOf(i10), bluetoothProfile);
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i10) {
        }
    }
}
