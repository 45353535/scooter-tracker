package com.yandex.div.storage;

import com.yandex.div.storage.analytics.CardErrorLoggerFactory;
import com.yandex.div.storage.histogram.HistogramNameProvider;
import com.yandex.div.storage.histogram.HistogramRecorder;
import com.yandex.div.storage.templates.TemplatesContainer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kf.a;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR(\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001c0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/storage/DivDataRepositoryImpl;", "Lcom/yandex/div/storage/DivDataRepository;", "Lcom/yandex/div/storage/DivStorage;", "divStorage", "Lcom/yandex/div/storage/templates/TemplatesContainer;", "templateContainer", "Lcom/yandex/div/storage/histogram/HistogramRecorder;", "histogramRecorder", "Lcom/yandex/div/storage/histogram/HistogramNameProvider;", "histogramNameProvider", "Lkf/a;", "Lcom/yandex/div/storage/templates/DivParsingHistogramProxy;", "divParsingHistogramProxy", "Lcom/yandex/div/storage/analytics/CardErrorLoggerFactory;", "cardErrorFactory", "<init>", "(Lcom/yandex/div/storage/DivStorage;Lcom/yandex/div/storage/templates/TemplatesContainer;Lcom/yandex/div/storage/histogram/HistogramRecorder;Lcom/yandex/div/storage/histogram/HistogramNameProvider;Lkf/a;Lcom/yandex/div/storage/analytics/CardErrorLoggerFactory;)V", "Lcom/yandex/div/storage/DivStorage;", "Lcom/yandex/div/storage/templates/TemplatesContainer;", "Lcom/yandex/div/storage/histogram/HistogramRecorder;", "Lkf/a;", "Lcom/yandex/div/storage/analytics/CardErrorLoggerFactory;", "", "", "", "inMemoryData", "Ljava/util/Map;", "", "", "cardsWithErrors", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivDataRepositoryImpl implements DivDataRepository {

    @NotNull
    private final CardErrorLoggerFactory cardErrorFactory;

    @NotNull
    private final a divParsingHistogramProxy;

    @NotNull
    private final DivStorage divStorage;

    @NotNull
    private final HistogramRecorder histogramRecorder;

    @NotNull
    private final TemplatesContainer templateContainer;

    @NotNull
    private final Map<String, Object> inMemoryData = new LinkedHashMap();

    @NotNull
    private Map<String, ? extends List<Object>> cardsWithErrors = MapsKt.emptyMap();

    public DivDataRepositoryImpl(@NotNull DivStorage divStorage, @NotNull TemplatesContainer templatesContainer, @NotNull HistogramRecorder histogramRecorder, @Nullable HistogramNameProvider histogramNameProvider, @NotNull a aVar, @NotNull CardErrorLoggerFactory cardErrorLoggerFactory) {
        this.divStorage = divStorage;
        this.templateContainer = templatesContainer;
        this.histogramRecorder = histogramRecorder;
        this.divParsingHistogramProxy = aVar;
        this.cardErrorFactory = cardErrorLoggerFactory;
    }
}
