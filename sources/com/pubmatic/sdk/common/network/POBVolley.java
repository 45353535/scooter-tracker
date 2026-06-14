package com.pubmatic.sdk.common.network;

import android.content.Context;
import androidx.annotation.NonNull;
import com.android.volley.f;
import com.android.volley.h;
import com.android.volley.toolbox.b;
import com.android.volley.toolbox.d;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class POBVolley {
    public static POBRequestQueue newRequestQueue(@NonNull Context context, @NonNull h hVar) {
        POBRequestQueue pOBRequestQueue = new POBRequestQueue(new d(new File(context.getCacheDir(), "pob_volley")), hVar);
        pOBRequestQueue.start();
        return pOBRequestQueue;
    }

    public static POBRequestQueue newRequestQueueWithBackgroundThreadDelivery(@NonNull Context context) {
        File file = new File(context.getCacheDir(), "pob_volley");
        POBRequestQueue pOBRequestQueue = new POBRequestQueue(new d(file), new b(new com.android.volley.toolbox.h()), 4, new f(POBTaskHandler.getInstance().getBackgroundThreadExecutor()));
        pOBRequestQueue.start();
        return pOBRequestQueue;
    }
}
