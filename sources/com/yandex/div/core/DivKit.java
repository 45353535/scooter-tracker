package com.yandex.div.core;

import android.content.Context;
import androidx.annotation.AnyThread;
import com.ironsource.C4424m2;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.unity3d.services.core.fid.Constants;
import com.yandex.div.core.DivKitConfiguration;
import com.yandex.div.core.dagger.DivKitComponent;
import com.yandex.div.core.dagger.Yatagan$DivKitComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/DivKit;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/yandex/div/core/DivKitConfiguration;", "configuration", "<init>", "(Landroid/content/Context;Lcom/yandex/div/core/DivKitConfiguration;)V", "Lcom/yandex/div/core/dagger/DivKitComponent;", "component", "Lcom/yandex/div/core/dagger/DivKitComponent;", "getComponent$div_release", "()Lcom/yandex/div/core/dagger/DivKitComponent;", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivKit {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final DivKitConfiguration DEFAULT_CONFIGURATION = new DivKitConfiguration.Builder().build();

    @Nullable
    private static DivKitConfiguration configuration;

    @Nullable
    private static volatile DivKit instance;

    @NotNull
    private final DivKitComponent component;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/DivKit$Companion;", "", "<init>", "()V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/yandex/div/core/DivKit;", Constants.GET_INSTANCE, "(Landroid/content/Context;)Lcom/yandex/div/core/DivKit;", "", "getVersionName", "()Ljava/lang/String;", "getVersionName$annotations", "versionName", "Lcom/yandex/div/core/DivKitConfiguration;", "DEFAULT_CONFIGURATION", "Lcom/yandex/div/core/DivKitConfiguration;", "configuration", C4424m2.f43617p, "Lcom/yandex/div/core/DivKit;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @AnyThread
        @NotNull
        public final DivKit getInstance(@NotNull Context context) {
            DivKit divKit = DivKit.instance;
            if (divKit != null) {
                return divKit;
            }
            synchronized (this) {
                try {
                    DivKit divKit2 = DivKit.instance;
                    if (divKit2 != null) {
                        return divKit2;
                    }
                    DivKitConfiguration divKitConfiguration = DivKit.configuration;
                    if (divKitConfiguration == null) {
                        divKitConfiguration = DivKit.DEFAULT_CONFIGURATION;
                    }
                    DivKit divKit3 = new DivKit(context, divKitConfiguration, null);
                    DivKit.instance = divKit3;
                    return divKit3;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @NotNull
        public final String getVersionName() {
            return "32.18.1";
        }

        private Companion() {
        }
    }

    public /* synthetic */ DivKit(Context context, DivKitConfiguration divKitConfiguration, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, divKitConfiguration);
    }

    @NotNull
    /* JADX INFO: renamed from: getComponent$div_release, reason: from getter */
    public final DivKitComponent getComponent() {
        return this.component;
    }

    private DivKit(Context context, DivKitConfiguration divKitConfiguration) {
        this.component = Yatagan$DivKitComponent.builder().applicationContext(context.getApplicationContext()).configuration(divKitConfiguration).build();
    }
}
