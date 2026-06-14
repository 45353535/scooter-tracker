package ic;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    public static final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pd.h f74352a;

        a(pd.h hVar) {
            this.f74352a = hVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            context.unregisterReceiver(this);
            jd.h.f(Boolean.TRUE, this.f74352a);
        }
    }

    private final long a(Context context, Uri uri) {
        DownloadManager downloadManagerJ = pd.f0.j(context);
        if (downloadManagerJ != null) {
            return downloadManagerJ.enqueue(new DownloadManager.Request(uri).setNotificationVisibility(1));
        }
        return -1L;
    }

    public final void b(Context context, Uri uri, pd.h hVar) {
        long jA;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Context applicationContext = context.getApplicationContext();
        try {
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            jA = a(applicationContext, uri);
        } catch (Exception e10) {
            v.i(e10);
            jA = -1;
        }
        if (jA == -1) {
            jd.h.f(Boolean.FALSE, hVar);
            return;
        }
        a aVar = new a(hVar);
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        pd.f0.x(aVar, applicationContext, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
    }
}
