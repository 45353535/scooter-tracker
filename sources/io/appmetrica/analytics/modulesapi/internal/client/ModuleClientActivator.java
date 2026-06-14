package io.appmetrica.analytics.modulesapi.internal.client;

import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lio/appmetrica/analytics/modulesapi/internal/client/ModuleClientActivator;", "", RemoteConfigComponent.ACTIVATE_FILE_NAME, "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "modules-api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface ModuleClientActivator {
    void activate(@NotNull Context context);
}
