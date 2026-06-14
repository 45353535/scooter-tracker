package com.yandex.div.internal.viewpool;

import android.view.View;
import com.taurusx.tax.y.z.w.s;
import com.yandex.div.internal.util.UtilsKt;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/internal/viewpool/PseudoViewPool;", "Lcom/yandex/div/internal/viewpool/ViewPool;", "<init>", "()V", "Landroid/view/View;", "T", "", s.z.f67720z, "Lcom/yandex/div/internal/viewpool/ViewFactory;", "factory", "", "capacity", "", "register", "(Ljava/lang/String;Lcom/yandex/div/internal/viewpool/ViewFactory;I)V", "obtain", "(Ljava/lang/String;)Landroid/view/View;", "j$/util/concurrent/ConcurrentHashMap", "factoryMap", "Lj$/util/concurrent/ConcurrentHashMap;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PseudoViewPool implements ViewPool {

    @NotNull
    private final ConcurrentHashMap<String, ViewFactory<? extends View>> factoryMap = new ConcurrentHashMap<>();

    @Override // com.yandex.div.internal.viewpool.ViewPool
    @NotNull
    public <T extends View> T obtain(@NotNull String tag) {
        T t10 = (T) ((ViewFactory) UtilsKt.getOrThrow$default(this.factoryMap, tag, null, 2, null)).createView();
        Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type T of com.yandex.div.internal.viewpool.PseudoViewPool.obtain");
        return t10;
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    public <T extends View> void register(@NotNull String tag, @NotNull ViewFactory<T> factory, int capacity) {
        this.factoryMap.put(tag, factory);
    }
}
