package com.yandex.div.core;

import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.view2.Div2View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/div/core/DivIdLoggingImageDownloadCallback;", "Lcom/yandex/div/core/images/DivImageDownloadCallback;", "", "divId", "<init>", "(Ljava/lang/String;)V", "Lcom/yandex/div/core/view2/Div2View;", "divView", "(Lcom/yandex/div/core/view2/Div2View;)V", "Ljava/lang/String;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class DivIdLoggingImageDownloadCallback extends DivImageDownloadCallback {

    @NotNull
    private final String divId;

    public DivIdLoggingImageDownloadCallback(@NotNull String str) {
        this.divId = str;
    }

    public DivIdLoggingImageDownloadCallback(@NotNull Div2View div2View) {
        this(div2View.getLogId());
    }
}
