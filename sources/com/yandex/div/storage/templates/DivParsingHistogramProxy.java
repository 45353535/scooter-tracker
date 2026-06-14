package com.yandex.div.storage.templates;

import com.yandex.div.histogram.DivParsingHistogramReporter;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import lf.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\u000b\u001a\u00020\u00038RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/yandex/div/storage/templates/DivParsingHistogramProxy;", "", "Lkotlin/Function0;", "Lcom/yandex/div/histogram/DivParsingHistogramReporter;", "initReporter", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "reporter$delegate", "Lkotlin/Lazy;", "getReporter", "()Lcom/yandex/div/histogram/DivParsingHistogramReporter;", "reporter", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivParsingHistogramProxy {

    /* JADX INFO: renamed from: reporter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy reporter;

    public DivParsingHistogramProxy(@NotNull Function0<? extends DivParsingHistogramReporter> function0) {
        this.reporter = i.a(function0);
    }
}
