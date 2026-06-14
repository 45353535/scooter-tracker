package com.appodeal.ads.adapters.meta;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.utils.Log;
import com.facebook.ads.AudienceNetworkAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f12476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12477b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12478c = false;

    public final void b(final Context context, String str, h hVar) {
        synchronized (g.class) {
            if (this.f12478c) {
                try {
                    hVar.f12479a.onInitializationFinished();
                } catch (Exception unused) {
                    hVar.f12479a.onInitializationFailed(LoadingError.InternalError);
                }
            } else {
                if (this.f12476a == null) {
                    this.f12476a = new ArrayList();
                }
                this.f12476a.add(hVar);
            }
        }
        if (this.f12477b) {
            return;
        }
        this.f12477b = true;
        AudienceNetworkAds.InitSettingsBuilder initSettingsBuilderBuildInitSettings = AudienceNetworkAds.buildInitSettings(context);
        if (!TextUtils.isEmpty(str)) {
            initSettingsBuilderBuildInitSettings.withMediationService(str);
        }
        initSettingsBuilderBuildInitSettings.withInitListener(new AudienceNetworkAds.InitListener() { // from class: com.appodeal.ads.adapters.meta.e
            @Override // com.facebook.ads.AudienceNetworkAds.InitListener
            public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
                this.f12471a.a(context, initResult);
            }
        }).initialize();
    }

    public final void c(List list, AudienceNetworkAds.InitResult initResult) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (initResult.isSuccess()) {
                h hVar = (h) dVar;
                hVar.getClass();
                try {
                    hVar.f12479a.onInitializationFinished();
                } catch (Exception unused) {
                    hVar.f12479a.onInitializationFailed(LoadingError.InternalError);
                }
            } else {
                ((h) dVar).f12479a.onInitializationFailed(LoadingError.InternalError);
            }
        }
        synchronized (g.class) {
            this.f12476a.removeAll(list);
        }
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void a(Context context, final AudienceNetworkAds.InitResult initResult) {
        final ArrayList arrayList;
        Log.log("Network", "Log", "Meta " + initResult.getMessage());
        this.f12478c = initResult.isSuccess();
        this.f12477b = false;
        if (this.f12476a != null) {
            synchronized (g.class) {
                arrayList = new ArrayList(this.f12476a);
            }
            new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.appodeal.ads.adapters.meta.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12473b.c(arrayList, initResult);
                }
            });
        }
    }
}
