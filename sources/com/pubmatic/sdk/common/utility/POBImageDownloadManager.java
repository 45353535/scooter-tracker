package com.pubmatic.sdk.common.utility;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBImageRequest;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class POBImageDownloadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f62554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f62555b = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f62556c = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private POBImageDownloadListener f62557d;

    public interface POBImageDownloadListener {
        void onComplete(@NonNull Map<String, Bitmap> map);
    }

    class a implements POBNetworkHandler.POBImageNetworkListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBImageRequest f62558a;

        a(POBImageRequest pOBImageRequest) {
            this.f62558a = pOBImageRequest;
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBImageNetworkListener
        public void onFailure(POBError pOBError) {
            POBLog.error("POBImageDownloadManager", "Unable to download image for url - %s", pOBError);
            POBImageDownloadManager.this.f62556c.put(this.f62558a.getUrl(), null);
            POBImageDownloadManager.this.a();
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBImageNetworkListener
        public void onSuccess(Bitmap bitmap) {
            POBImageDownloadManager.this.f62556c.put(this.f62558a.getUrl(), bitmap);
            POBImageDownloadManager.this.a();
        }
    }

    public POBImageDownloadManager(@NonNull Context context, @NonNull Set<String> set) {
        this.f62554a = context;
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public void cancel() {
        Iterator it = this.f62555b.entrySet().iterator();
        while (it.hasNext()) {
            ((POBNetworkHandler) ((Map.Entry) it.next()).getKey()).cancelRequest("POBImageDownloadManager");
        }
    }

    public boolean isEmpty() {
        return this.f62555b.isEmpty();
    }

    public void setListener(@NonNull POBImageDownloadListener pOBImageDownloadListener) {
        this.f62557d = pOBImageDownloadListener;
    }

    public void start() {
        if (this.f62555b.isEmpty() && this.f62557d != null) {
            a();
            return;
        }
        for (Map.Entry entry : this.f62555b.entrySet()) {
            POBImageRequest pOBImageRequest = (POBImageRequest) entry.getValue();
            if (pOBImageRequest != null) {
                ((POBNetworkHandler) entry.getKey()).sendImageRequest(pOBImageRequest, new a(pOBImageRequest));
            }
        }
    }

    private void a(String str) {
        POBImageRequest pOBImageRequest = new POBImageRequest();
        pOBImageRequest.setRequestTag("POBImageDownloadManager");
        pOBImageRequest.setUrl(str);
        pOBImageRequest.setTimeout(5000);
        this.f62555b.put(new POBNetworkHandler(this.f62554a), pOBImageRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        POBImageDownloadListener pOBImageDownloadListener;
        if (this.f62555b.size() != this.f62556c.size() || (pOBImageDownloadListener = this.f62557d) == null) {
            return;
        }
        pOBImageDownloadListener.onComplete(this.f62556c);
    }
}
