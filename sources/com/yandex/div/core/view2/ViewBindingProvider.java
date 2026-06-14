package com.yandex.div.core.view2;

import com.taurusx.tax.y.z.w.s;
import com.yandex.div.DivDataTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k8.ea;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/core/view2/ViewBindingProvider;", "", "<init>", "()V", "Lcom/yandex/div/DivDataTag;", s.z.f67720z, "Lk8/ea;", "data", "", "update", "(Lcom/yandex/div/DivDataTag;Lk8/ea;)V", "Lkotlin/Function1;", "Lcom/yandex/div/core/view2/Binding;", "observer", "observeAndGet", "(Lkotlin/jvm/functions/Function1;)V", "current", "Lcom/yandex/div/core/view2/Binding;", "", "observers", "Ljava/util/List;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ViewBindingProvider {

    @NotNull
    private Binding current = new Binding(DivDataTag.INVALID, null);

    @NotNull
    private final List<Function1<Binding, Unit>> observers = new ArrayList();

    public final void observeAndGet(@NotNull Function1<? super Binding, Unit> observer) {
        observer.invoke(this.current);
        this.observers.add(observer);
    }

    public final void update(@NotNull DivDataTag tag, @Nullable ea data) {
        if (Intrinsics.areEqual(tag, this.current.getTag()) && this.current.getData() == data) {
            return;
        }
        this.current = new Binding(tag, data);
        Iterator<T> it = this.observers.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(this.current);
        }
    }
}
