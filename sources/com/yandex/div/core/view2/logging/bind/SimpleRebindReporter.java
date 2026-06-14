package com.yandex.div.core.view2.logging.bind;

import com.mobilefuse.sdk.identity.EidRequestBuilder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/view2/logging/bind/SimpleRebindReporter;", "Lcom/yandex/div/core/view2/logging/bind/ForceRebindReporter;", "onSimpleRebindException", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSimpleRebindFatalNoState", "onSimpleRebindNoChild", "onSimpleRebindSuccess", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SimpleRebindReporter extends ForceRebindReporter {
    void onSimpleRebindException(@NotNull Exception e10);

    void onSimpleRebindFatalNoState();

    void onSimpleRebindNoChild();

    void onSimpleRebindSuccess();
}
