package org.bidon.sdk.adapter;

import com.ironsource.N6;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lorg/bidon/sdk/adapter/AdaptersSource;", "", "adapters", "", "Lorg/bidon/sdk/adapter/Adapter;", "getAdapters", "()Ljava/util/Set;", "add", "", N6.G1, "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AdaptersSource {
    void add(@NotNull Adapter adapter);

    @NotNull
    Set<Adapter> getAdapters();
}
