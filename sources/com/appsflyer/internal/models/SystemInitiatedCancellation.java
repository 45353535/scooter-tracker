package com.appsflyer.internal.models;

import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/appsflyer/internal/models/SystemInitiatedCancellation;", "", "()V", "equals", "", "other", "hashCode", "", y.f66058y, "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SystemInitiatedCancellation {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/internal/models/SystemInitiatedCancellation$Companion;", "Lcom/appsflyer/internal/models/Deserialize;", "Lcom/appsflyer/internal/models/SystemInitiatedCancellation;", "()V", "fromJson", "json", "Lorg/json/JSONObject;", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements Deserialize<SystemInitiatedCancellation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        @NotNull
        public SystemInitiatedCancellation fromJson(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new SystemInitiatedCancellation();
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return Intrinsics.areEqual(SystemInitiatedCancellation.class, other != null ? other.getClass() : null);
    }

    public int hashCode() {
        return SystemInitiatedCancellation.class.hashCode();
    }
}
