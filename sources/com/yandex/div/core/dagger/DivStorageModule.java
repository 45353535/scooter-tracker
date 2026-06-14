package com.yandex.div.core.dagger;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.DivStorageComponent;
import com.yandex.div.storage.util.LazyProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/dagger/DivStorageModule;", "", "()V", "provideDivStorageComponent", "Lcom/yandex/div/storage/DivStorageComponent;", "externalDivStorageComponent", "Lcom/yandex/div/core/dagger/ExternalOptional;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "histogramReporterDelegate", "Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;", "parsingHistogramReporter", "Lcom/yandex/div/histogram/DivParsingHistogramReporter;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivStorageModule {

    @NotNull
    public static final DivStorageModule INSTANCE = new DivStorageModule();

    private DivStorageModule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivParsingHistogramReporter provideDivStorageComponent$lambda$0(DivParsingHistogramReporter divParsingHistogramReporter) {
        return divParsingHistogramReporter;
    }

    @NotNull
    public final DivStorageComponent provideDivStorageComponent(@NotNull ExternalOptional<DivStorageComponent> externalDivStorageComponent, @NotNull Context context, @NotNull HistogramReporterDelegate histogramReporterDelegate, @NotNull final DivParsingHistogramReporter parsingHistogramReporter) {
        return externalDivStorageComponent.getOptional().c() ? (DivStorageComponent) externalDivStorageComponent.getOptional().b() : DivStorageComponent.INSTANCE.create(context, (92 & 2) != 0 ? HistogramReporterDelegate.NoOp.INSTANCE : histogramReporterDelegate, (92 & 4) != 0 ? null : null, (92 & 8) != 0 ? ParsingErrorLogger.LOG : null, (92 & 16) == 0 ? null : null, (92 & 32) != 0 ? new LazyProvider(new Function0<DivParsingHistogramReporter>() { // from class: com.yandex.div.storage.DivStorageComponent$Companion$create$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DivParsingHistogramReporter invoke() {
                return DivParsingHistogramReporter.INSTANCE.getDEFAULT();
            }
        }) : new kf.a() { // from class: com.yandex.div.core.dagger.d
            @Override // kf.a
            public final Object get() {
                return DivStorageModule.provideDivStorageComponent$lambda$0(parsingHistogramReporter);
            }
        }, (92 & 64) != 0 ? "" : null);
    }
}
