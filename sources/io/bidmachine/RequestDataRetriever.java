package io.bidmachine;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.bidmachine.protobuf.sdk.App;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/bidmachine/RequestDataRetriever;", "", "<init>", "()V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lio/bidmachine/j2;", "bidMachineImpl", "Lio/bidmachine/d6;", "userRestrictionParams", "Lio/bidmachine/TargetingParams;", "targetingParams", "Lcom/explorestack/protobuf/adcom/ConnectionType;", "connectionType", "Lio/bidmachine/AdsType;", "adsType", "Lcom/explorestack/protobuf/adcom/Context;", "collectContext", "(Landroid/content/Context;Lio/bidmachine/j2;Lio/bidmachine/d6;Lio/bidmachine/TargetingParams;Lcom/explorestack/protobuf/adcom/ConnectionType;Lio/bidmachine/AdsType;)Lcom/explorestack/protobuf/adcom/Context;", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RequestDataRetriever {

    @NotNull
    public static final RequestDataRetriever INSTANCE = new RequestDataRetriever();

    private RequestDataRetriever() {
    }

    @NotNull
    public static final Context collectContext(@NotNull android.content.Context context, @NotNull j2 bidMachineImpl, @NotNull d6 userRestrictionParams, @NotNull TargetingParams targetingParams, @Nullable ConnectionType connectionType, @Nullable AdsType adsType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bidMachineImpl, "bidMachineImpl");
        Intrinsics.checkNotNullParameter(userRestrictionParams, "userRestrictionParams");
        Intrinsics.checkNotNullParameter(targetingParams, "targetingParams");
        Context.Builder builderNewBuilder = Context.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        Context.App.Builder builderNewBuilder2 = Context.App.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
        Publisher publisherO = bidMachineImpl.o();
        if (publisherO != null) {
            publisherO.build(builderNewBuilder2);
        }
        bidMachineImpl.h().build(context, builderNewBuilder2);
        targetingParams.build(builderNewBuilder2);
        App.Builder builderNewBuilder3 = App.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder3, "newBuilder()");
        targetingParams.fillAppExtension(builderNewBuilder3);
        bidMachineImpl.l().fill(builderNewBuilder3);
        long jH = bidMachineImpl.H(context);
        if (jH > 0) {
            builderNewBuilder3.setFirstLaunchTime(ae.f.p(jH));
        }
        long jQ = bidMachineImpl.q(context);
        if (jQ > 0) {
            builderNewBuilder3.setSdkInstallTime(ae.f.p(jQ));
        }
        builderNewBuilder2.addExtProto(Any.pack(builderNewBuilder3.build()));
        builderNewBuilder.setApp(builderNewBuilder2);
        BlockedParams blockedParams = targetingParams.getBlockedParams();
        if (blockedParams != null) {
            Context.Restrictions.Builder builderNewBuilder4 = Context.Restrictions.newBuilder();
            blockedParams.build(builderNewBuilder4);
            builderNewBuilder.setRestrictions(builderNewBuilder4);
        }
        Context.User.Builder builderNewBuilder5 = Context.User.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder5, "newBuilder()");
        userRestrictionParams.h(builderNewBuilder5);
        if (userRestrictionParams.d()) {
            targetingParams.build(builderNewBuilder5);
        }
        bidMachineImpl.s().g(context, builderNewBuilder5, adsType);
        builderNewBuilder.setUser(builderNewBuilder5);
        Context.Regs.Builder builderNewBuilder6 = Context.Regs.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder6, "newBuilder()");
        userRestrictionParams.g(builderNewBuilder6);
        builderNewBuilder.setRegs(builderNewBuilder6);
        bidMachineImpl.i().a(context, builderNewBuilder, targetingParams, bidMachineImpl.u(), userRestrictionParams, connectionType);
        Context contextBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(contextBuild, "contextBuilder.build()");
        return contextBuild;
    }
}
