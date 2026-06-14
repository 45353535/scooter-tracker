package com.yandex.varioqub.analyticadapter;

import com.ironsource.C4455ne;
import com.yandex.varioqub.analyticadapter.data.ConfigData;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&¨\u0006\r"}, d2 = {"Lcom/yandex/varioqub/analyticadapter/VarioqubConfigReporter;", "", "reportConfigChanged", "", "configData", "Lcom/yandex/varioqub/analyticadapter/data/ConfigData;", "setExperiments", C4455ne.f44465d, "", "setTriggeredTestIds", "triggeredTestIds", "", "", "analytic-adapter_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface VarioqubConfigReporter {
    void reportConfigChanged(@NotNull ConfigData configData);

    void setExperiments(@NotNull String experiments);

    void setTriggeredTestIds(@NotNull Set<Long> triggeredTestIds);
}
