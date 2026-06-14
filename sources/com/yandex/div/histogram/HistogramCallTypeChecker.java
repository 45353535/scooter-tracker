package com.yandex.div.histogram;

import j$.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import lf.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR'\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/histogram/HistogramCallTypeChecker;", "", "<init>", "()V", "", "histogramName", "", "addReported", "(Ljava/lang/String;)Z", "j$/util/concurrent/ConcurrentHashMap", "", "reportedHistograms$delegate", "Lkotlin/Lazy;", "getReportedHistograms", "()Lj$/util/concurrent/ConcurrentHashMap;", "reportedHistograms", "div-histogram_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class HistogramCallTypeChecker {

    /* JADX INFO: renamed from: reportedHistograms$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy reportedHistograms = i.a(new Function0<ConcurrentHashMap<String, Unit>>() { // from class: com.yandex.div.histogram.HistogramCallTypeChecker$reportedHistograms$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ConcurrentHashMap<String, Unit> invoke() {
            return new ConcurrentHashMap<>();
        }
    });

    private final ConcurrentHashMap<String, Unit> getReportedHistograms() {
        return (ConcurrentHashMap) this.reportedHistograms.getValue();
    }

    public final boolean addReported(@NotNull String histogramName) {
        return !getReportedHistograms().containsKey(histogramName) && getReportedHistograms().putIfAbsent(histogramName, Unit.f93236a) == null;
    }
}
