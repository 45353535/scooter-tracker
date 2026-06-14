package com.yandex.div.core.util.text;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import androidx.compose.material.OutlinedTextFieldKt;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import io.appmetrica.analytics.impl.H2;
import k8.st;
import k8.xt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/core/util/text/DivBackgroundSpan;", "Landroid/text/style/UnderlineSpan;", "Lk8/xt;", OutlinedTextFieldKt.BorderId, "Lk8/st;", H2.f75840g, "<init>", "(Lk8/xt;Lk8/st;)V", "Landroid/text/TextPaint;", ApsMetricsDataMap.APSMETRICS_FIELD_SCREENSIZE, "", "updateDrawState", "(Landroid/text/TextPaint;)V", "Lk8/xt;", "getBorder", "()Lk8/xt;", "Lk8/st;", "getBackground", "()Lk8/st;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivBackgroundSpan extends UnderlineSpan {

    @Nullable
    private final st background;

    @Nullable
    private final xt border;

    public DivBackgroundSpan(@Nullable xt xtVar, @Nullable st stVar) {
        this.border = xtVar;
        this.background = stVar;
    }

    @Nullable
    public final st getBackground() {
        return this.background;
    }

    @Nullable
    public final xt getBorder() {
        return this.border;
    }

    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds) {
        ds.setUnderlineText(false);
    }
}
