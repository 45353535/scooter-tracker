package org.bidon.sdk.adapter.impl;

import com.ironsource.N6;
import hg.l0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.adapter.AdaptersSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lorg/bidon/sdk/adapter/impl/AdaptersSourceImpl;", "Lorg/bidon/sdk/adapter/AdaptersSource;", "<init>", "()V", "adaptersFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lorg/bidon/sdk/adapter/Adapter;", "adapters", "getAdapters", "()Ljava/util/Set;", "add", "", N6.G1, "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdaptersSourceImpl implements AdaptersSource {

    @NotNull
    private final MutableStateFlow adaptersFlow = l0.a(SetsKt.emptySet());

    @Override // org.bidon.sdk.adapter.AdaptersSource
    public void add(@NotNull Adapter adapter) {
        Object value;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        MutableStateFlow mutableStateFlow = this.adaptersFlow;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value, SetsKt.plus((Set<? extends Adapter>) value, adapter)));
    }

    @Override // org.bidon.sdk.adapter.AdaptersSource
    @NotNull
    public Set<Adapter> getAdapters() {
        return (Set) this.adaptersFlow.getValue();
    }
}
