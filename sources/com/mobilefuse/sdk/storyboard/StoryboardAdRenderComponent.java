package com.mobilefuse.sdk.storyboard;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mobilefuse.sdk.AdRendererConfig;
import com.mobilefuse.sdk.AdRendererListener;
import com.mobilefuse.sdk.BaseAdRenderer;
import com.mobilefuse.sdk.component.AdRendererComponent;
import com.mobilefuse.sdk.component.ComponentRegistrar;
import com.mobilefuse.sdk.component.ComponentType;
import com.mobilefuse.sdk.mraid.BuildConfig;
import com.mobilefuse.sdk.telemetry.TelemetryManager;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\f"}, d2 = {"Lcom/mobilefuse/sdk/storyboard/StoryboardAdRenderComponent;", "Lcom/mobilefuse/sdk/component/AdRendererComponent;", "()V", "createInstance", "Lcom/mobilefuse/sdk/BaseAdRenderer;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "config", "Lcom/mobilefuse/sdk/AdRendererConfig;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mobilefuse/sdk/AdRendererListener;", y.f66058y, "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public class StoryboardAdRenderComponent implements AdRendererComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/mobilefuse/sdk/storyboard/StoryboardAdRenderComponent$Companion;", "", "()V", "createComponent", "Lcom/mobilefuse/sdk/storyboard/StoryboardAdRenderComponent;", "register", "", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final StoryboardAdRenderComponent createComponent() throws Throwable {
            return new StoryboardAdRenderComponent();
        }

        public final void register() throws Throwable {
            TelemetryManager.INSTANCE.registerModule(BuildConfig.LIBRARY_PACKAGE_NAME, "1.9.3");
            ComponentRegistrar.registerComponent(ComponentType.STORYBOARD_AD_RENDERER, createComponent());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @NotNull
    public static final StoryboardAdRenderComponent createComponent() throws Throwable {
        return INSTANCE.createComponent();
    }

    public static final void register() throws Throwable {
        INSTANCE.register();
    }

    @Override // com.mobilefuse.sdk.component.AdRendererComponent
    @NotNull
    public BaseAdRenderer<?> createInstance(@Nullable Context context, @Nullable AdRendererConfig config, @Nullable AdRendererListener listener) {
        return new StoryboardAdRenderer(context, config, listener);
    }
}
