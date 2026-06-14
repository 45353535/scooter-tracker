package com.yandex.div.internal.viewpool;

import android.view.View;
import com.taurusx.tax.y.z.w.s;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J7\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/internal/viewpool/ViewPool;", "", "Landroid/view/View;", "T", "", s.z.f67720z, "Lcom/yandex/div/internal/viewpool/ViewFactory;", "factory", "", "capacity", "", "register", "(Ljava/lang/String;Lcom/yandex/div/internal/viewpool/ViewFactory;I)V", "obtain", "(Ljava/lang/String;)Landroid/view/View;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ViewPool {
    @NotNull
    <T extends View> T obtain(@NotNull String tag);

    <T extends View> void register(@NotNull String tag, @NotNull ViewFactory<T> factory, int capacity);
}
