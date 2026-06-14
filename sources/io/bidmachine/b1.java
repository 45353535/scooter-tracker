package io.bidmachine;

import android.text.TextUtils;
import com.explorestack.protobuf.adcom.Context;
import io.bidmachine.protobuf.sdk.App;

/* JADX INFO: loaded from: classes12.dex */
final class b1 {
    b1() {
    }

    private Context.App.Release c(android.content.Context context) {
        BuildInfo buildInfoObtain = BuildInfo.obtain(context);
        Context.App.Release.Builder builderNewBuilder = Context.App.Release.newBuilder();
        builderNewBuilder.setType(d(buildInfoObtain));
        String sha1Signature = buildInfoObtain.getSha1Signature(context);
        if (!TextUtils.isEmpty(sha1Signature)) {
            builderNewBuilder.setSignatureSHA1(sha1Signature);
        }
        String sha256Signature = buildInfoObtain.getSha256Signature(context);
        if (!TextUtils.isEmpty(sha256Signature)) {
            builderNewBuilder.setSignatureSHA256(sha256Signature);
        }
        return builderNewBuilder.build();
    }

    private String d(BuildInfo buildInfo) {
        return buildInfo.isDebuggable() ? "debug" : "release";
    }

    void a(android.content.Context context, Context.App.Builder builder) {
        builder.setRelease(c(context));
    }

    void b(android.content.Context context, App.Builder builder) {
        builder.setRelease(c(context));
    }
}
