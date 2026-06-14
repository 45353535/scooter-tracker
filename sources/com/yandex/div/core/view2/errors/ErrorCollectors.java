package com.yandex.div.core.view2.errors;

import com.taurusx.tax.y.z.w.s;
import com.yandex.div.DivDataTag;
import java.util.LinkedHashMap;
import java.util.Map;
import k8.ea;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "", "<init>", "()V", "Lcom/yandex/div/DivDataTag;", s.z.f67720z, "Lk8/ea;", "divData", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "getOrCreate", "(Lcom/yandex/div/DivDataTag;Lk8/ea;)Lcom/yandex/div/core/view2/errors/ErrorCollector;", "getOrNull", "", "", "collectors", "Ljava/util/Map;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ErrorCollectors {

    @NotNull
    private final Map<String, ErrorCollector> collectors = new LinkedHashMap();

    @NotNull
    public ErrorCollector getOrCreate(@NotNull DivDataTag tag, @Nullable ea divData) {
        ErrorCollector errorCollector;
        synchronized (this.collectors) {
            try {
                Map<String, ErrorCollector> map = this.collectors;
                String id2 = tag.getId();
                ErrorCollector errorCollector2 = map.get(id2);
                if (errorCollector2 == null) {
                    errorCollector2 = new ErrorCollector();
                    map.put(id2, errorCollector2);
                }
                errorCollector2.attachParsingErrors(divData);
                errorCollector = errorCollector2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return errorCollector;
    }

    @Nullable
    public ErrorCollector getOrNull(@NotNull DivDataTag tag, @Nullable ea divData) {
        ErrorCollector errorCollector;
        synchronized (this.collectors) {
            errorCollector = this.collectors.get(tag.getId());
            if (errorCollector != null) {
                errorCollector.attachParsingErrors(divData);
            } else {
                errorCollector = null;
            }
        }
        return errorCollector;
    }
}
