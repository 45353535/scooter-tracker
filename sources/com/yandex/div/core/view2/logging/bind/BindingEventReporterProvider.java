package com.yandex.div.core.view2.logging.bind;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Log;
import k8.ea;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/view2/logging/bind/BindingEventReporterProvider;", "", "Lcom/yandex/div/core/view2/Div2View;", "div2View", "<init>", "(Lcom/yandex/div/core/view2/Div2View;)V", "Lk8/ea;", "oldData", "newData", "Lcom/yandex/div/core/view2/logging/bind/BindingEventReporter;", "get", "(Lk8/ea;Lk8/ea;)Lcom/yandex/div/core/view2/logging/bind/BindingEventReporter;", "Lcom/yandex/div/core/view2/Div2View;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BindingEventReporterProvider {

    @NotNull
    private final Div2View div2View;

    public BindingEventReporterProvider(@NotNull Div2View div2View) {
        this.div2View = div2View;
    }

    @NotNull
    public final BindingEventReporter get(@Nullable ea oldData, @Nullable ea newData) {
        return Log.isEnabled() ? new BindingEventReporterImpl(this.div2View, oldData, newData) : BindingEventReporter.INSTANCE.getSTUB();
    }
}
