package com.android.billingclient.api;

import androidx.annotation.NonNull;
import j$.util.DesugarCollections;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class InAppMessageParams {
    private final ArrayList zza;

    public static final class Builder {
        private final Set zza = new HashSet();

        @NonNull
        public Builder addAllInAppMessageCategoriesToShow() {
            this.zza.add(2);
            return this;
        }

        @NonNull
        public Builder addInAppMessageCategoryToShow(int i10) {
            this.zza.add(Integer.valueOf(i10));
            return this;
        }

        @NonNull
        public InAppMessageParams build() {
            return new InAppMessageParams(this.zza, null);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface InAppMessageCategoryId {
        public static final int TRANSACTIONAL = 2;
        public static final int UNKNOWN_IN_APP_MESSAGE_CATEGORY_ID = 0;
    }

    /* synthetic */ InAppMessageParams(Set set, zzdq zzdqVar) {
        this.zza = new ArrayList(DesugarCollections.unmodifiableList(new ArrayList(set)));
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    final ArrayList zza() {
        return this.zza;
    }
}
