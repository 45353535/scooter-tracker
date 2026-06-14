package com.yandex.div.core.dagger;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.DivKitConfiguration;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0001\tJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/dagger/DivKitComponent;", "", "Lcom/yandex/div/core/dagger/Div2Component$Builder;", "div2Component", "()Lcom/yandex/div/core/dagger/Div2Component$Builder;", "Lcom/yandex/div/histogram/HistogramRecordConfiguration;", "getHistogramRecordConfiguration", "()Lcom/yandex/div/histogram/HistogramRecordConfiguration;", "histogramRecordConfiguration", "Builder", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DivKitComponent {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0004H'J\b\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/dagger/DivKitComponent$Builder;", "", "applicationContext", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "build", "Lcom/yandex/div/core/dagger/DivKitComponent;", "configuration", "Lcom/yandex/div/core/DivKitConfiguration;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Builder {
        @NotNull
        Builder applicationContext(@NotNull Context context);

        @NotNull
        DivKitComponent build();

        @NotNull
        Builder configuration(@NotNull DivKitConfiguration configuration);
    }

    @NotNull
    Div2Component.Builder div2Component();

    @NotNull
    HistogramRecordConfiguration getHistogramRecordConfiguration();
}
