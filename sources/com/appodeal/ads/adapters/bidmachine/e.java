package com.appodeal.ads.adapters.bidmachine;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.networking.LoadingError;
import com.ironsource.D5;
import io.bidmachine.BidMachine;
import io.bidmachine.BidMachineExt;
import io.bidmachine.InitializationCallback;
import io.bidmachine.TargetingParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f12085d = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f12086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12087b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12088c = false;

    public static void c(Context context, JSONObject jSONObject, RestrictedData restrictedData) {
        synchronized (h.f12090a) {
            try {
                TargetingParams targetingParams = BidMachineExt.getTargetingParams();
                targetingParams.m7778setUserId(restrictedData.getUserId());
                Location deviceLocation = restrictedData.getLocation(context).getDeviceLocation();
                if (deviceLocation != null) {
                    targetingParams.m7769setDeviceLocation(deviceLocation);
                }
                targetingParams.m7768setCountry(restrictedData.getCountry());
                targetingParams.m7767setCity(restrictedData.getCity());
                targetingParams.m7779setZip(restrictedData.getZip());
                Object objOpt = jSONObject.opt("sturl");
                String str = objOpt instanceof String ? (String) objOpt : null;
                if (str != null) {
                    targetingParams.m7777setStoreUrl(str);
                }
                Object objOpt2 = jSONObject.opt("paid");
                Boolean boolValueOf = objOpt2 instanceof Boolean ? (Boolean) objOpt2 : objOpt2 instanceof String ? Boolean.valueOf(Boolean.parseBoolean((String) objOpt2)) : null;
                if (boolValueOf != null) {
                    targetingParams.m7774setPaid(boolValueOf);
                }
                Object objOpt3 = jSONObject.opt("keywords");
                String str2 = objOpt3 instanceof String ? (String) objOpt3 : null;
                if (str2 != null) {
                    targetingParams.m7773setKeywords(h.b(str2));
                }
                Object objOpt4 = jSONObject.opt("bcat");
                String str3 = objOpt4 instanceof String ? (String) objOpt4 : null;
                if (str3 != null) {
                    for (String str4 : h.b(str3)) {
                        targetingParams.m7764addBlockedAdvertiserIABCategory(str4);
                    }
                }
                Object objOpt5 = jSONObject.opt("badv");
                String str5 = objOpt5 instanceof String ? (String) objOpt5 : null;
                if (str5 != null) {
                    for (String str6 : h.b(str5)) {
                        targetingParams.m7763addBlockedAdvertiserDomain(str6);
                    }
                }
                Object objOpt6 = jSONObject.opt("bapps");
                String str7 = objOpt6 instanceof String ? (String) objOpt6 : null;
                if (str7 != null) {
                    for (String str8 : h.b(str7)) {
                        targetingParams.m7765addBlockedApplication(str8);
                    }
                }
                BidMachine.setTargetingParams(targetingParams);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void a() {
        d(null);
    }

    public final void b(Context context, JSONObject jSONObject) {
        if (BidMachine.isInitialized()) {
            d(null);
            return;
        }
        String strOptString = jSONObject.optString("seller_id");
        if (TextUtils.isEmpty(strOptString)) {
            d(LoadingError.IncorrectAdunit);
            return;
        }
        String strOptString2 = jSONObject.optString(D5.f40571r);
        if (!TextUtils.isEmpty(strOptString2)) {
            BidMachine.setEndpoint(strOptString2);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("mediation_config");
        if (jSONArrayOptJSONArray != null) {
            BidMachine.registerNetworks(context, jSONArrayOptJSONArray.toString());
        }
        BidMachine.initialize(context, strOptString, new InitializationCallback() { // from class: com.appodeal.ads.adapters.bidmachine.c
            @Override // io.bidmachine.InitializationCallback
            public final void onInitialized() {
                this.f12081a.a();
            }
        });
    }

    public final void d(final LoadingError loadingError) {
        final ArrayList arrayList;
        this.f12088c = loadingError == null;
        this.f12087b = false;
        if (this.f12086a != null) {
            synchronized (e.class) {
                arrayList = new ArrayList(this.f12086a);
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appodeal.ads.adapters.bidmachine.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12082b.e(arrayList, loadingError);
                }
            });
        }
    }

    public final void e(List list, LoadingError loadingError) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (this.f12088c) {
                f fVar = (f) bVar;
                fVar.getClass();
                try {
                    fVar.f12089a.onInitializationFinished();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    fVar.f12089a.onInitializationFailed(LoadingError.InternalError);
                }
            } else {
                ((f) bVar).f12089a.onInitializationFailed(loadingError);
            }
        }
        synchronized (e.class) {
            this.f12086a.removeAll(list);
        }
    }
}
