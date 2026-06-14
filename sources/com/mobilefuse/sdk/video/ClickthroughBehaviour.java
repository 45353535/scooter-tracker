package com.mobilefuse.sdk.video;

import com.taurusx.tax.f.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;", "", "value", "", "acceptableSources", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;)V", "getAcceptableSources$mobilefuse_sdk_common_release", "()Ljava/util/List;", "getValue", "()Ljava/lang/String;", "CTA_AND_VIDEO", "CTA_ONLY", y.f66058y, "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public enum ClickthroughBehaviour {
    CTA_AND_VIDEO("both", CollectionsKt.listOf((Object[]) new String[]{"ctaBtn", "video"})),
    CTA_ONLY("cta", CollectionsKt.listOf("ctaBtn"));


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<String> acceptableSources;

    @NotNull
    private final String value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/mobilefuse/sdk/video/ClickthroughBehaviour$Companion;", "", "()V", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    ClickthroughBehaviour(String str, List list) {
        this.value = str;
        this.acceptableSources = list;
    }

    @NotNull
    public final List<String> getAcceptableSources$mobilefuse_sdk_common_release() {
        return this.acceptableSources;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
