package com.yandex.div.storage.templates;

import com.ironsource.D5;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.histogram.HistogramRecorder;
import j$.util.concurrent.ConcurrentHashMap;
import k8.ts;
import kf.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R$\u0010\u0016\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/div/storage/templates/CommonTemplatesPool;", "", "Lcom/yandex/div/storage/DivStorage;", "divStorage", "Lcom/yandex/div/json/ParsingErrorLogger;", "logger", "", "histogramComponent", "Lcom/yandex/div/storage/histogram/HistogramRecorder;", "histogramRecorder", "Lkf/a;", "Lcom/yandex/div/storage/templates/DivParsingHistogramProxy;", "parsingHistogramProxy", "<init>", "(Lcom/yandex/div/storage/DivStorage;Lcom/yandex/div/json/ParsingErrorLogger;Ljava/lang/String;Lcom/yandex/div/storage/histogram/HistogramRecorder;Lkf/a;)V", "Lcom/yandex/div/storage/DivStorage;", "Ljava/lang/String;", "Lcom/yandex/div/storage/histogram/HistogramRecorder;", "Lkf/a;", "j$/util/concurrent/ConcurrentHashMap", "Lcom/yandex/div/storage/templates/TemplateHash;", "Lk8/ts;", "commonTemplates", "Lj$/util/concurrent/ConcurrentHashMap;", "Lcom/yandex/div/data/DivParsingEnvironment;", D5.f40568o, "Lcom/yandex/div/data/DivParsingEnvironment;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class CommonTemplatesPool {

    @NotNull
    private final ConcurrentHashMap<String, ts> commonTemplates = new ConcurrentHashMap<>();

    @NotNull
    private final DivStorage divStorage;

    @NotNull
    private final DivParsingEnvironment env;

    @Nullable
    private final String histogramComponent;

    @NotNull
    private final HistogramRecorder histogramRecorder;

    @NotNull
    private final a parsingHistogramProxy;

    public CommonTemplatesPool(@NotNull DivStorage divStorage, @NotNull ParsingErrorLogger parsingErrorLogger, @Nullable String str, @NotNull HistogramRecorder histogramRecorder, @NotNull a aVar) {
        this.divStorage = divStorage;
        this.histogramComponent = str;
        this.histogramRecorder = histogramRecorder;
        this.parsingHistogramProxy = aVar;
        this.env = TemplatesContainerKt.createEmptyEnv(parsingErrorLogger);
    }
}
