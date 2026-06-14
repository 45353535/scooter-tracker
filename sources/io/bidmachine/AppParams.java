package io.bidmachine;

import android.content.Context;
import com.explorestack.protobuf.adcom.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.bidmachine.protobuf.sdk.App;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/bidmachine/AppParams;", "", "Lio/bidmachine/b1;", "appReleaseParams", "<init>", "(Lio/bidmachine/b1;)V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/explorestack/protobuf/adcom/Context$App$Builder;", "contextAppBuilder", "", "build", "(Landroid/content/Context;Lcom/explorestack/protobuf/adcom/Context$App$Builder;)V", "Lio/bidmachine/protobuf/sdk/App$Builder;", "appBuilder", "(Landroid/content/Context;Lio/bidmachine/protobuf/sdk/App$Builder;)V", "Lio/bidmachine/b1;", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AppParams {

    @NotNull
    private final b1 appReleaseParams;

    public AppParams(@NotNull b1 appReleaseParams) {
        Intrinsics.checkNotNullParameter(appReleaseParams, "appReleaseParams");
        this.appReleaseParams = appReleaseParams;
    }

    public final void build(@NotNull Context context, @NotNull Context.App.Builder contextAppBuilder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contextAppBuilder, "contextAppBuilder");
        String packageName = context.getPackageName();
        if (packageName != null && packageName.length() != 0) {
            contextAppBuilder.setBundle(packageName);
        }
        String strT = io.bidmachine.core.h.t(context);
        if (strT != null && strT.length() != 0) {
            contextAppBuilder.setVer(strT);
        }
        String strS = io.bidmachine.core.h.s(context);
        if (strS != null && strS.length() != 0) {
            contextAppBuilder.setName(strS);
        }
        this.appReleaseParams.a(context, contextAppBuilder);
    }

    public final void build(@NotNull android.content.Context context, @NotNull App.Builder appBuilder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appBuilder, "appBuilder");
        j2 j2VarE = j2.e();
        Intrinsics.checkNotNullExpressionValue(j2VarE, "get()");
        String strT = io.bidmachine.core.h.t(context);
        if (strT != null && strT.length() != 0) {
            appBuilder.setAppVer(strT);
        }
        String strS = io.bidmachine.core.h.s(context);
        if (strS != null && strS.length() != 0) {
            appBuilder.setAppName(strS);
        }
        j2VarE.l().fill(appBuilder);
        long jH = j2VarE.H(context);
        if (jH > 0) {
            appBuilder.setFirstLaunchTime(ae.f.p(jH));
        }
        long jQ = j2VarE.q(context);
        if (jQ > 0) {
            appBuilder.setSdkInstallTime(ae.f.p(jQ));
        }
        this.appReleaseParams.b(context, appBuilder);
    }
}
