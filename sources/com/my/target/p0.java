package com.my.target;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.my.target.common.MyTargetConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class p0 extends c2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f60497b = e0.a(260, 272, 268, 276, 516, IronSourceError.ERROR_NO_INTERNET_CONNECTION, 532, 528, IronSourceError.ERROR_PLACEMENT_CAPPED, 512, 264, 256, 280);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Method f60498a;

    public p0() {
        try {
            this.f60498a = BluetoothDevice.class.getMethod("isConnected", null);
        } catch (Throwable unused) {
        }
    }

    public static List a(BluetoothAdapter bluetoothAdapter, Method method) {
        ArrayList arrayList = new ArrayList();
        try {
            for (BluetoothDevice bluetoothDevice : bluetoothAdapter.getBondedDevices()) {
                if (Arrays.binarySearch(f60497b, bluetoothDevice.getBluetoothClass().getDeviceClass()) < 0 && ((Boolean) method.invoke(bluetoothDevice, null)).booleanValue()) {
                    String name = bluetoothDevice.getName();
                    if (!TextUtils.isEmpty(name)) {
                        arrayList.add(new String(Base64.encode(name.getBytes(), 2), "UTF-8"));
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    public Map a(MyTargetConfig myTargetConfig, Context context) {
        BluetoothAdapter defaultAdapter;
        HashMap map = new HashMap();
        if (this.f60498a != null && c2.a("android.permission.BLUETOOTH", context) && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null && defaultAdapter.isEnabled()) {
            List listA = a(defaultAdapter, this.f60498a);
            if (!listA.isEmpty()) {
                map.put("bdn", e0.a(listA));
            }
        }
        return map;
    }
}
