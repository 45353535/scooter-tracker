package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.annotation.RequiresApi;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(21)
public final class AFi1qSDK extends AFi1pSDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1qSDK(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static boolean w_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    @NotNull
    protected final String getCurrencyIso4217Code() {
        Network[] allNetworks;
        Sequence sequenceAsSequence;
        Sequence sequenceR;
        Object next;
        ConnectivityManager connectivityManager = this.AFAdRevenueData;
        if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null && (sequenceAsSequence = ArraysKt.asSequence(allNetworks)) != null && (sequenceR = kotlin.sequences.k.R(sequenceAsSequence, new Function1<Network, NetworkInfo>() { // from class: com.appsflyer.internal.AFi1qSDK.4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: x_, reason: merged with bridge method [inline-methods] */
            public final NetworkInfo invoke(Network network) {
                ConnectivityManager connectivityManager2 = AFi1qSDK.this.AFAdRevenueData;
                Intrinsics.checkNotNull(connectivityManager2);
                return connectivityManager2.getNetworkInfo(network);
            }
        })) != null) {
            Iterator it = sequenceR.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AFi1pSDK.v_((NetworkInfo) next)) {
                    break;
                }
            }
            NetworkInfo networkInfo = (NetworkInfo) next;
            if (networkInfo != null) {
                int type = networkInfo.getType();
                return type != 0 ? type != 1 ? "unknown" : "WIFI" : "MOBILE";
            }
        }
        return "unknown";
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final boolean getRevenue() {
        Network[] allNetworks;
        try {
            ConnectivityManager connectivityManager = this.AFAdRevenueData;
            if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (Network network : allNetworks) {
                ConnectivityManager connectivityManager2 = this.AFAdRevenueData;
                Intrinsics.checkNotNull(connectivityManager2);
                NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
                if (networkCapabilities != null) {
                    arrayList.add(networkCapabilities);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (w_((NetworkCapabilities) it.next())) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            AFLogger.afErrorLog("Failed collecting ivc data", e10);
            return false;
        }
    }
}
