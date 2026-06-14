package net.pubnative.lite.sdk.provider;

import android.content.Context;
import android.os.Build;
import android.os.OutcomeReceiver;
import android.os.ext.SdkExtensions;
import androidx.privacysandbox.ads.adservices.topics.a;
import b.a;
import b.b;
import b.d;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import net.pubnative.lite.sdk.provider.TopicProvider;
import net.pubnative.lite.sdk.utils.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class TopicsApiImpl implements TopicProvider {
    private final String TAG = TopicsApiImpl.class.getSimpleName();

    /* JADX INFO: renamed from: net.pubnative.lite.sdk.provider.TopicsApiImpl$1, reason: invalid class name */
    class AnonymousClass1 implements OutcomeReceiver {
        final /* synthetic */ TopicProvider.Callback val$callback;

        AnonymousClass1(TopicProvider.Callback callback) {
            this.val$callback = callback;
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            a.a(obj);
            onResult((b) null);
        }

        public void onError(Exception exc) {
            Logger.e(TopicsApiImpl.this.TAG, exc.getMessage());
            this.val$callback.onResult(null);
            super.onError((Throwable) exc);
        }

        public void onResult(b bVar) {
            new ArrayList();
            throw null;
        }
    }

    @Override // net.pubnative.lite.sdk.provider.TopicProvider
    public void getTopics(Context context, TopicProvider.Callback callback) {
        if (context == null || callback == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || SdkExtensions.getExtensionVersion(1000000) < 4) {
            callback.onResult(null);
            return;
        }
        a.a(context.getSystemService(d.class));
        Executors.newCachedThreadPool();
        a.C0123a c0123a = new a.C0123a();
        c0123a.b(context.getPackageName());
        if (SdkExtensions.getExtensionVersion(1000000) >= 5) {
            c0123a.c(true);
        }
        callback.onResult(null);
    }
}
