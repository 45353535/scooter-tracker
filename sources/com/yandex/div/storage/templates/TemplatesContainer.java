package com.yandex.div.storage.templates;

import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.histogram.HistogramNameProvider;
import com.yandex.div.storage.histogram.HistogramRecorder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Map;
import kf.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import lf.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u0012\u0012\b\u0012\u00060\u0013j\u0002`\u001a\u0012\u0004\u0012\u00020\u00010\u00198\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0012\u0012\b\u0012\u00060\u0013j\u0002`\u001a\u0012\u0004\u0012\u00020\u001d0\u00198\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001d\u0010$\u001a\u0004\u0018\u00010\u001f8RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/yandex/div/storage/templates/TemplatesContainer;", "", "Lcom/yandex/div/storage/DivStorage;", "divStorage", "Lcom/yandex/div/json/ParsingErrorLogger;", "errorLogger", "Lcom/yandex/div/storage/histogram/HistogramRecorder;", "histogramRecorder", "Lkf/a;", "Lcom/yandex/div/storage/templates/DivParsingHistogramProxy;", "parsingHistogramProxy", "Lcom/yandex/div/storage/histogram/HistogramNameProvider;", "histogramNameProvider", "<init>", "(Lcom/yandex/div/storage/DivStorage;Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/storage/histogram/HistogramRecorder;Lkf/a;Lcom/yandex/div/storage/histogram/HistogramNameProvider;)V", "Lcom/yandex/div/storage/DivStorage;", "Lcom/yandex/div/json/ParsingErrorLogger;", "Lcom/yandex/div/storage/histogram/HistogramRecorder;", "Lkf/a;", "", "histogramComponentName", "Ljava/lang/String;", "Lcom/yandex/div/storage/templates/CommonTemplatesPool;", "templatesPool", "Lcom/yandex/div/storage/templates/CommonTemplatesPool;", "", "Lcom/yandex/div/storage/templates/GroupId;", "groupTemplateReferences", "Ljava/util/Map;", "Lcom/yandex/div/data/DivParsingEnvironment;", "templateEnvironments", "Ljava/security/MessageDigest;", "messageDigest$delegate", "Lkotlin/Lazy;", "getMessageDigest", "()Ljava/security/MessageDigest;", "messageDigest", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class TemplatesContainer {

    @NotNull
    private final DivStorage divStorage;

    @NotNull
    private final ParsingErrorLogger errorLogger;

    @NotNull
    private final HistogramRecorder histogramRecorder;

    @NotNull
    private final a parsingHistogramProxy;

    @NotNull
    private final CommonTemplatesPool templatesPool;

    @Nullable
    private final String histogramComponentName = null;

    @NotNull
    private final Map<String, Object> groupTemplateReferences = new LinkedHashMap();

    @NotNull
    private final Map<String, DivParsingEnvironment> templateEnvironments = new LinkedHashMap();

    /* JADX INFO: renamed from: messageDigest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy messageDigest = i.a(new Function0<MessageDigest>() { // from class: com.yandex.div.storage.templates.TemplatesContainer$messageDigest$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final MessageDigest invoke() {
            try {
                return MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e10) {
                this.this$0.errorLogger.logError(new IllegalStateException("Storage cannot work with templates!", e10));
                return null;
            }
        }
    });

    public TemplatesContainer(@NotNull DivStorage divStorage, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull HistogramRecorder histogramRecorder, @NotNull a aVar, @Nullable HistogramNameProvider histogramNameProvider) {
        this.divStorage = divStorage;
        this.errorLogger = parsingErrorLogger;
        this.histogramRecorder = histogramRecorder;
        this.parsingHistogramProxy = aVar;
        this.templatesPool = new CommonTemplatesPool(divStorage, parsingErrorLogger, null, histogramRecorder, aVar);
    }
}
