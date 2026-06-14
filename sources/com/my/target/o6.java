package com.my.target;

import com.google.common.base.Ascii;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;

/* JADX INFO: loaded from: classes11.dex */
public class o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f60453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60454b;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public o6(String str, String str2) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1910759310:
                if (str.equals("vpaidInit")) {
                    b10 = 0;
                }
                break;
            case -1886160473:
                if (str.equals("playVideo")) {
                    b10 = 1;
                }
                break;
            case -1289167206:
                if (str.equals("expand")) {
                    b10 = 2;
                }
                break;
            case -934437708:
                if (str.equals("resize")) {
                    b10 = 3;
                }
                break;
            case -733616544:
                if (str.equals("createCalendarEvent")) {
                    b10 = 4;
                }
                break;
            case 3417674:
                if (str.equals("open")) {
                    b10 = 5;
                }
                break;
            case 94756344:
                if (str.equals("close")) {
                    b10 = 6;
                }
                break;
            case 133423073:
                if (str.equals(MRAIDPresenter.SET_ORIENTATION_PROPERTIES)) {
                    b10 = 7;
                }
                break;
            case 459238621:
                if (str.equals(MRAIDNativeFeature.STORE_PICTURE)) {
                    b10 = 8;
                }
                break;
            case 624734601:
                if (str.equals("setResizeProperties")) {
                    b10 = 9;
                }
                break;
            case 892543864:
                if (str.equals("vpaidEvent")) {
                    b10 = 10;
                }
                break;
            case 1797992422:
                if (str.equals("playheadEvent")) {
                    b10 = Ascii.VT;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                this.f60453a = false;
                this.f60454b = str;
                break;
            case 1:
            case 2:
                this.f60453a = "inline".equals(str2);
                this.f60454b = str;
                break;
            case 3:
            case 4:
            case 5:
            case 8:
                this.f60453a = true;
                this.f60454b = str;
                break;
            default:
                this.f60453a = false;
                this.f60454b = "";
                break;
        }
    }

    public String toString() {
        return this.f60454b;
    }
}
