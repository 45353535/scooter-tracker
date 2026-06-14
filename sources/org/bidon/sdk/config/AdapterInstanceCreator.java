package org.bidon.sdk.config;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.bidon.sdk.adapter.Adapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\b`\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\n"}, d2 = {"Lorg/bidon/sdk/config/AdapterInstanceCreator;", "", "createAvailableAdapters", "", "Lorg/bidon/sdk/adapter/Adapter;", "useDefaultAdapters", "", "adapterClasses", "", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AdapterInstanceCreator {
    @NotNull
    List<Adapter> createAvailableAdapters(boolean useDefaultAdapters, @NotNull Set<String> adapterClasses);
}
