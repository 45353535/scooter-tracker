package com.yandex.div.core.downloader;

import androidx.collection.ArrayMap;
import androidx.privacysandbox.ads.adservices.topics.a;
import com.taurusx.tax.y.z.w.s;
import com.yandex.div.DivDataTag;
import java.util.List;
import k8.y0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/core/downloader/DivPatchCache;", "", "<init>", "()V", "Lcom/yandex/div/DivDataTag;", s.z.f67720z, "", "id", "", "Lk8/y0;", "getPatchDivListById", "(Lcom/yandex/div/DivDataTag;Ljava/lang/String;)Ljava/util/List;", "Lcom/yandex/div/core/downloader/DivPatchMap;", "getPatch", "(Lcom/yandex/div/DivDataTag;)Lcom/yandex/div/core/downloader/DivPatchMap;", "Landroidx/collection/ArrayMap;", "patches", "Landroidx/collection/ArrayMap;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivPatchCache {

    @NotNull
    private final ArrayMap<DivDataTag, DivPatchMap> patches = new ArrayMap<>();

    @Nullable
    public DivPatchMap getPatch(@NotNull DivDataTag tag) {
        a.a(this.patches.get(tag));
        return null;
    }

    @Nullable
    public List<y0> getPatchDivListById(@NotNull DivDataTag tag, @NotNull String id2) {
        a.a(this.patches.get(tag));
        return null;
    }
}
