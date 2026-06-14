package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.AdsConstants$AdApiType;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.startappsdk.R;

/* JADX INFO: loaded from: classes11.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f64661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f64662b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f64664d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Boolean f64666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Boolean f64667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f64668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f64669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f64670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f64671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f64672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f64673m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f64663c = "trackdownload";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f64665e = "https://imp.startappservice.com/tracking/adImpression";

    static {
        String str = "get";
        f64661a = str.concat("ads");
        f64662b = str.concat("htmlad");
        f64664d = str.concat("adsmetadata");
        Boolean bool = Boolean.FALSE;
        f64666f = bool;
        f64667g = bool;
        f64668h = R.id.io_start_fullscreen_main;
        f64669i = R.id.io_start_fullscreen_info;
        f64670j = R.id.io_start_list3d_close;
        f64671k = R.id.io_start_video_main;
        f64672l = new String[]{"back_", "back_dark", "browser_icon_dark", "forward_", "forward_dark", "x_dark"};
        f64673m = new String[]{"empty_star", "filled_star", "half_star"};
    }

    public static String a(AdsConstants$AdApiType adsConstants$AdApiType, AdPreferences.Placement placement) {
        String str;
        String strA;
        String str2;
        String str3;
        int iOrdinal = adsConstants$AdApiType.ordinal();
        if (iOrdinal == 0) {
            str = f64662b;
            strA = MetaData.E().a(placement);
        } else {
            if (iOrdinal != 1) {
                str3 = null;
                str2 = null;
                return str3 + str2;
            }
            str = f64661a;
            strA = MetaData.E().a(placement);
        }
        String str4 = strA;
        str2 = str;
        str3 = str4;
        return str3 + str2;
    }
}
