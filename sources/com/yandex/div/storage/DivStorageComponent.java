package com.yandex.div.storage;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.DivStorageComponent;
import com.yandex.div.storage.analytics.CardErrorLoggerFactory;
import com.yandex.div.storage.database.AndroidDatabaseOpenHelper;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.database.DatabaseOpenHelperProvider;
import com.yandex.div.storage.histogram.HistogramNameProvider;
import com.yandex.div.storage.histogram.HistogramRecorder;
import com.yandex.div.storage.templates.DivParsingHistogramProxy;
import com.yandex.div.storage.templates.TemplatesContainer;
import com.yandex.div.storage.util.LazyProvider;
import kf.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/DivStorageComponent;", "", "Lcom/yandex/div/storage/RawJsonRepository;", "getRawJsonRepository", "()Lcom/yandex/div/storage/RawJsonRepository;", "rawJsonRepository", y.f66058y, "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DivStorageComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\b\u0002\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015Je\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\b\u0002\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/storage/DivStorageComponent$Companion;", "", "<init>", "()V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;", "histogramReporter", "Lcom/yandex/div/storage/histogram/HistogramNameProvider;", "histogramNameProvider", "Lcom/yandex/div/json/ParsingErrorLogger;", "errorLogger", "Lkf/a;", "Lcom/yandex/div/storage/util/CardErrorTransformer;", "cardErrorTransformer", "Lcom/yandex/div/histogram/DivParsingHistogramReporter;", "parsingHistogramReporter", "", "databaseNamePrefix", "Lcom/yandex/div/storage/DivStorageComponent;", "create", "(Landroid/content/Context;Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;Lcom/yandex/div/storage/histogram/HistogramNameProvider;Lcom/yandex/div/json/ParsingErrorLogger;Lkf/a;Lkf/a;Ljava/lang/String;)Lcom/yandex/div/storage/DivStorageComponent;", "Lcom/yandex/div/storage/InternalStorageComponent;", "createInternal$div_storage_release", "(Landroid/content/Context;Lcom/yandex/div/histogram/reporter/HistogramReporterDelegate;Lcom/yandex/div/storage/histogram/HistogramNameProvider;Lcom/yandex/div/json/ParsingErrorLogger;Lkf/a;Lkf/a;Ljava/lang/String;)Lcom/yandex/div/storage/InternalStorageComponent;", "createInternal", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DatabaseOpenHelper createInternal$lambda$0(Context context, String str, int i10, DatabaseOpenHelper.CreateCallback createCallback, DatabaseOpenHelper.UpgradeCallback upgradeCallback) {
            return new AndroidDatabaseOpenHelper(context, str, i10, createCallback, upgradeCallback);
        }

        @NotNull
        public final DivStorageComponent create(@NotNull Context context, @NotNull HistogramReporterDelegate histogramReporter, @Nullable HistogramNameProvider histogramNameProvider, @NotNull ParsingErrorLogger errorLogger, @Nullable a cardErrorTransformer, @NotNull a parsingHistogramReporter, @NotNull String databaseNamePrefix) {
            return createInternal$div_storage_release(context, histogramReporter, histogramNameProvider, errorLogger, cardErrorTransformer, parsingHistogramReporter, databaseNamePrefix);
        }

        @NotNull
        public final InternalStorageComponent createInternal$div_storage_release(@NotNull Context context, @NotNull HistogramReporterDelegate histogramReporter, @Nullable HistogramNameProvider histogramNameProvider, @NotNull ParsingErrorLogger errorLogger, @Nullable a cardErrorTransformer, @NotNull final a parsingHistogramReporter, @NotNull String databaseNamePrefix) {
            DivStorageImpl divStorageImpl = new DivStorageImpl(context, new DatabaseOpenHelperProvider() { // from class: i8.a
                @Override // com.yandex.div.storage.database.DatabaseOpenHelperProvider
                public final DatabaseOpenHelper provide(Context context2, String str, int i10, DatabaseOpenHelper.CreateCallback createCallback, DatabaseOpenHelper.UpgradeCallback upgradeCallback) {
                    return DivStorageComponent.Companion.createInternal$lambda$0(context2, str, i10, createCallback, upgradeCallback);
                }
            }, databaseNamePrefix);
            LazyProvider lazyProvider = new LazyProvider(new Function0<DivParsingHistogramProxy>() { // from class: com.yandex.div.storage.DivStorageComponent$Companion$createInternal$parsingHistogramProxy$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final DivParsingHistogramProxy invoke() {
                    final a aVar = parsingHistogramReporter;
                    return new DivParsingHistogramProxy(new Function0<DivParsingHistogramReporter>() { // from class: com.yandex.div.storage.DivStorageComponent$Companion$createInternal$parsingHistogramProxy$1.1
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final DivParsingHistogramReporter invoke() {
                            return (DivParsingHistogramReporter) aVar.get();
                        }
                    });
                }
            });
            HistogramRecorder histogramRecorder = new HistogramRecorder(histogramReporter, histogramNameProvider);
            TemplatesContainer templatesContainer = new TemplatesContainer(divStorageImpl, errorLogger, histogramRecorder, lazyProvider, histogramNameProvider);
            return new InternalStorageComponent(new DivDataRepositoryImpl(divStorageImpl, templatesContainer, histogramRecorder, histogramNameProvider, lazyProvider, new CardErrorLoggerFactory(cardErrorTransformer, templatesContainer, errorLogger)), new RawJsonRepositoryImpl(divStorageImpl), divStorageImpl);
        }
    }

    @NotNull
    RawJsonRepository getRawJsonRepository();
}
