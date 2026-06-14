package org.bidon.sdk.adapter;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.bidon.sdk.auction.AdTypeParam;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lorg/bidon/sdk/adapter/Adapter;", "", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "adapterInfo", "Lorg/bidon/sdk/adapter/AdapterInfo;", "getAdapterInfo", "()Lorg/bidon/sdk/adapter/AdapterInfo;", "Bidding", "Network", "Lorg/bidon/sdk/adapter/Adapter$Bidding;", "Lorg/bidon/sdk/adapter/Adapter$Network;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Adapter {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/bidon/sdk/adapter/Adapter$Bidding;", "Lorg/bidon/sdk/adapter/Adapter;", "getToken", "", "adTypeParam", "Lorg/bidon/sdk/auction/AdTypeParam;", "(Lorg/bidon/sdk/auction/AdTypeParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Bidding extends Adapter {
        @Nullable
        Object getToken(@NotNull AdTypeParam adTypeParam, @NotNull Continuation continuation);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/bidon/sdk/adapter/Adapter$Network;", "Lorg/bidon/sdk/adapter/Adapter;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Network extends Adapter {
    }

    @NotNull
    AdapterInfo getAdapterInfo();

    @NotNull
    DemandId getDemandId();
}
