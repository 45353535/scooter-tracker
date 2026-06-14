package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class Y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f42116a = "NETWORK_TYPE_WIFI";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f42117b = "NETWORK_TYPE_VPN";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f42118c = "NETWORK_TYPE_ETHERNET";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f42119d = "NETWORK_TYPE_UNKNOWN";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f42120e = "notReachable";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f42121f = "PHONE_TYPE_NONE";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f42122g = "NETWORK_TYPE_GPRS";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f42123h = "NETWORK_TYPE_EDGE";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f42124i = "NETWORK_TYPE_UMTS";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f42125j = "NETWORK_TYPE_CDMA";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f42126k = "NETWORK_TYPE_EVDO_0";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f42127l = "NETWORK_TYPE_EVDO_A";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f42128m = "NETWORK_TYPE_1xRTT";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f42129n = "NETWORK_TYPE_HSDPA";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f42130o = "NETWORK_TYPE_HSUPA";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f42131p = "NETWORK_TYPE_HSPA";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f42132q = "NETWORK_TYPE_IDEN";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f42133r = "NETWORK_TYPE_EVDO_B";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f42134s = "NETWORK_TYPE_LTE";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f42135t = "NETWORK_TYPE_EHRPD";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f42136u = "NETWORK_TYPE_HSPAP";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f42137v = "NETWORK_TYPE_GSM";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f42138w = "NETWORK_TYPE_TD_SCDMA";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f42139x = "NETWORK_TYPE_IWLAN";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f42140y = "NETWORK_TYPE_LTE_CA";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f42141z = "NETWORK_TYPE_NR";

    @SuppressLint({"MissingPermission"})
    public static String a(Network network, Context context) {
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network != null && connectivityManager != null) {
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                return networkCapabilities == null ? c(context) : networkCapabilities.hasTransport(1) ? X3.f42018b : networkCapabilities.hasTransport(0) ? X3.f42017a : c(context);
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
        return "none";
    }

    public static String b(Context context) {
        return a(a(context), context);
    }

    private static String c(Context context) {
        String strA = X3.a(context);
        return TextUtils.isEmpty(strA) ? "none" : strA;
    }

    public static String d(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            Network networkA = a(connectivityManager);
            if (networkA == null) {
                return f42120e;
            }
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(networkA);
                if (networkCapabilities == null) {
                    return f42119d;
                }
                if (networkCapabilities.hasTransport(1)) {
                    return f42116a;
                }
                if (networkCapabilities.hasTransport(0) && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    return a(activeNetworkInfo.getSubtype());
                }
            } catch (Throwable th2) {
                C4462o4.d().a(th2);
                IronLog.INTERNAL.error("Error getting network capabilities: " + th2);
            }
        }
        return f42119d;
    }

    public static boolean e(Context context) {
        return b(context, a(context)).equals("vpn");
    }

    @SuppressLint({"MissingPermission"})
    private static String b(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (network == null || context == null) {
            return "";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                return networkCapabilities.hasTransport(1) ? X3.f42018b : networkCapabilities.hasTransport(0) ? X3.f42023g : networkCapabilities.hasTransport(4) ? "vpn" : networkCapabilities.hasTransport(3) ? X3.f42021e : networkCapabilities.hasTransport(5) ? X3.f42024h : networkCapabilities.hasTransport(6) ? X3.f42025i : networkCapabilities.hasTransport(2) ? X3.f42020d : "";
            }
            return "";
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }

    @SuppressLint({"MissingPermission"})
    public static Network a(Context context) {
        if (context == null) {
            return null;
        }
        return a((ConnectivityManager) context.getSystemService("connectivity"));
    }

    @SuppressLint({"MissingPermission"})
    public static JSONObject a(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put(C4240b4.j.f42706v, e(context));
                    return jSONObject;
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
        return jSONObject;
    }

    private static String a(int i10) {
        switch (i10) {
            case 0:
                return f42121f;
            case 1:
                return f42122g;
            case 2:
                return f42123h;
            case 3:
                return f42124i;
            case 4:
                return f42125j;
            case 5:
                return f42126k;
            case 6:
                return f42127l;
            case 7:
                return f42128m;
            case 8:
                return f42129n;
            case 9:
                return f42130o;
            case 10:
                return f42131p;
            case 11:
                return f42132q;
            case 12:
                return f42133r;
            case 13:
                return f42134s;
            case 14:
                return f42135t;
            case 15:
                return f42136u;
            case 16:
                return f42137v;
            case 17:
                return f42138w;
            case 18:
                return f42139x;
            case 19:
                return f42140y;
            case 20:
                return f42141z;
            default:
                return f42119d;
        }
    }

    @Nullable
    private static Network a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetwork();
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            return null;
        }
    }
}
