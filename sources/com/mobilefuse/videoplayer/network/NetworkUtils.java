package com.mobilefuse.videoplayer.network;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.network.client.HttpClientKt;
import com.mobilefuse.sdk.network.client.HttpError;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import com.mobilefuse.videoplayer.model.VastError;
import com.mobilefuse.videoplayer.model.VastMediaFile;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0013\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u001c\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/mobilefuse/videoplayer/network/NetworkUtils;", "", "<init>", "()V", "Lcom/mobilefuse/sdk/exception/BaseError;", "Lcom/mobilefuse/videoplayer/model/VastError;", "toVastError", "(Lcom/mobilefuse/sdk/exception/BaseError;)Lcom/mobilefuse/videoplayer/model/VastError;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/mobilefuse/videoplayer/network/NetworkType;", "getNetworkType", "(Landroid/content/Context;)Lcom/mobilefuse/videoplayer/network/NetworkType;", "", "Lcom/mobilefuse/videoplayer/model/VastMediaFile;", "mediaFiles", "Lkotlin/Function2;", "", "completeCallback", "probeMediaFiles", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final class NetworkUtils {

    @NotNull
    public static final NetworkUtils INSTANCE = new NetworkUtils();
    private static final Handler handler = new Handler(Looper.getMainLooper());

    private NetworkUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VastError toVastError(BaseError baseError) {
        if (!(baseError instanceof HttpError.ConnectionError)) {
            return VastError.UNIDENTIFIED;
        }
        int statusCode = ((HttpError.ConnectionError) baseError).getStatusCode();
        return statusCode != 404 ? statusCode != 408 ? VastError.UNIDENTIFIED : VastError.MEDIAFILE_TIMEOUT : VastError.MEDIAFILE_NOT_FOUND;
    }

    @SuppressLint({"MissingPermission"})
    @Nullable
    public final NetworkType getNetworkType(@NotNull Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(activeNetworkInfo, "cm.activeNetworkInfo ?: return null");
        if (!activeNetworkInfo.isConnected()) {
            return null;
        }
        if (activeNetworkInfo.getType() == 1) {
            return NetworkType.WIFI;
        }
        if (activeNetworkInfo.getType() == 0) {
            switch (activeNetworkInfo.getSubtype()) {
            }
            return null;
        }
        return NetworkType.UNKNOWN;
    }

    public final void probeMediaFiles(@NotNull List<VastMediaFile> mediaFiles, @NotNull final Function2<? super VastMediaFile, ? super VastError, Unit> completeCallback) {
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(completeCallback, "completeCallback");
        ProbeMediaFilesFlowKt.probeMediaFiles(FlowKt.flowSingle(mediaFiles), HttpClientKt.getDefaultHttpClient()).collect(new FlowCollector() { // from class: com.mobilefuse.videoplayer.network.NetworkUtils$probeMediaFiles$$inlined$collectResult$1
            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof SuccessResult) {
                    Either either = (Either) ((SuccessResult) result).getValue();
                    NetworkUtils networkUtils = NetworkUtils.INSTANCE;
                    DebuggingKt.logDebug$default(networkUtils, "Probe media files result -> " + either, null, 2, null);
                    if (either instanceof SuccessResult) {
                        completeCallback.invoke(((SuccessResult) either).getValue(), null);
                    } else if (either instanceof ErrorResult) {
                        completeCallback.invoke(null, networkUtils.toVastError((BaseError) ((ErrorResult) either).getValue()));
                    }
                }
            }

            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public void emitError(@NotNull Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                FlowCollector.DefaultImpls.emitError(this, error);
            }

            @Override // com.mobilefuse.sdk.rx.FlowCollector
            public void emitSuccess(T t10) {
                FlowCollector.DefaultImpls.emitSuccess(this, t10);
            }
        });
    }
}
