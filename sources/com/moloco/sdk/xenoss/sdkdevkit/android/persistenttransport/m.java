package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f58973c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f58974b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public m(o worker) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        this.f58974b = worker;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public void a(String url) {
        Data dataA;
        Intrinsics.checkNotNullParameter(url, "url");
        if (f.d(url) && (dataA = n.a(url)) != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Enqueuing request to " + url, null, false, 12, null);
            this.f58974b.a(new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) UrlGetRequestWorker.class).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).setBackoffCriteria(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS).setInputData(dataA).build());
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public void a(String url, byte[] body, ve.g contentType, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        if (f.d(url)) {
            try {
                Pair[] pairArr = {TuplesKt.to("url", url), TuplesKt.to("body", body), TuplesKt.to("contentType", contentType.toString()), TuplesKt.to("contentEncoding", str)};
                Data.Builder builder = new Data.Builder();
                for (int i10 = 0; i10 < 4; i10++) {
                    Pair pair = pairArr[i10];
                    builder.put((String) pair.getFirst(), pair.getSecond());
                }
                Data dataBuild = builder.build();
                Intrinsics.checkNotNullExpressionValue(dataBuild, "dataBuilder.build()");
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Enqueuing request to " + url, null, false, 12, null);
                this.f58974b.a(new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) UrlPostRequestWorker.class).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).setBackoffCriteria(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS).setInputData(dataBuild).build());
            } catch (Exception e10) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Failed to enqueue persistent request for url: " + url, e10, false, 8, null);
            }
        }
    }
}
