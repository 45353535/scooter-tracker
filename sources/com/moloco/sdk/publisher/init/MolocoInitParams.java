package com.moloco.sdk.publisher.init;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.publisher.MediationInfo;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/moloco/sdk/publisher/init/MolocoInitParams;", "", "appContext", "Landroid/content/Context;", "appKey", "", "mediationInfo", "Lcom/moloco/sdk/publisher/MediationInfo;", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/moloco/sdk/publisher/MediationInfo;)V", "getAppContext", "()Landroid/content/Context;", "getAppKey", "()Ljava/lang/String;", "getMediationInfo", "()Lcom/moloco/sdk/publisher/MediationInfo;", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MolocoInitParams {
    public static final int $stable = 8;

    @NotNull
    private final Context appContext;

    @NotNull
    private final String appKey;

    @NotNull
    private final MediationInfo mediationInfo;

    public MolocoInitParams(@NotNull Context appContext, @NotNull String appKey, @NotNull MediationInfo mediationInfo) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(mediationInfo, "mediationInfo");
        this.appContext = appContext;
        this.appKey = appKey;
        this.mediationInfo = mediationInfo;
    }

    public static /* synthetic */ MolocoInitParams copy$default(MolocoInitParams molocoInitParams, Context context, String str, MediationInfo mediationInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = molocoInitParams.appContext;
        }
        if ((i10 & 2) != 0) {
            str = molocoInitParams.appKey;
        }
        if ((i10 & 4) != 0) {
            mediationInfo = molocoInitParams.mediationInfo;
        }
        return molocoInitParams.copy(context, str, mediationInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Context getAppContext() {
        return this.appContext;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppKey() {
        return this.appKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    @NotNull
    public final MolocoInitParams copy(@NotNull Context appContext, @NotNull String appKey, @NotNull MediationInfo mediationInfo) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(mediationInfo, "mediationInfo");
        return new MolocoInitParams(appContext, appKey, mediationInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MolocoInitParams)) {
            return false;
        }
        MolocoInitParams molocoInitParams = (MolocoInitParams) other;
        return Intrinsics.areEqual(this.appContext, molocoInitParams.appContext) && Intrinsics.areEqual(this.appKey, molocoInitParams.appKey) && Intrinsics.areEqual(this.mediationInfo, molocoInitParams.mediationInfo);
    }

    @NotNull
    public final Context getAppContext() {
        return this.appContext;
    }

    @NotNull
    public final String getAppKey() {
        return this.appKey;
    }

    @NotNull
    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    public int hashCode() {
        return (((this.appContext.hashCode() * 31) + this.appKey.hashCode()) * 31) + this.mediationInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "MolocoInitParams(appContext=" + this.appContext + ", appKey=" + this.appKey + ", mediationInfo=" + this.mediationInfo + ')';
    }
}
