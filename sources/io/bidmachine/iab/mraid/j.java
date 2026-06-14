package io.bidmachine.iab.mraid;

import android.content.Context;
import java.util.ArrayList;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;

/* JADX INFO: loaded from: classes12.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f80233a = {MRAIDNativeFeature.SMS, MRAIDNativeFeature.TEL, MRAIDNativeFeature.INLINE_VIDEO, MRAIDNativeFeature.CALENDAR, MRAIDNativeFeature.STORE_PICTURE};

    private static ArrayList a(k kVar) {
        ArrayList arrayList = new ArrayList();
        if (kVar.f()) {
            arrayList.add(MRAIDNativeFeature.TEL);
        }
        if (kVar.d()) {
            arrayList.add(MRAIDNativeFeature.SMS);
        }
        if (kVar.c()) {
            arrayList.add(MRAIDNativeFeature.INLINE_VIDEO);
        }
        if (kVar.b()) {
            arrayList.add(MRAIDNativeFeature.CALENDAR);
        }
        if (kVar.e()) {
            arrayList.add(MRAIDNativeFeature.STORE_PICTURE);
        }
        return arrayList;
    }

    public static String[] b(Context context) {
        return (String[]) a(new k(context, f80233a)).toArray(new String[0]);
    }
}
