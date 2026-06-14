package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.InterfaceC5129go;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class UserProfile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f78928a;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LinkedList f78929a;

        /* synthetic */ Builder(int i10) {
            this();
        }

        public Builder apply(@NonNull UserProfileUpdate<? extends InterfaceC5129go> userProfileUpdate) {
            this.f78929a.add(userProfileUpdate);
            return this;
        }

        @NonNull
        public UserProfile build() {
            return new UserProfile(this.f78929a, 0);
        }

        private Builder() {
            this.f78929a = new LinkedList();
        }
    }

    /* synthetic */ UserProfile(LinkedList linkedList, int i10) {
        this(linkedList);
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(0);
    }

    @NonNull
    public List<UserProfileUpdate<? extends InterfaceC5129go>> getUserProfileUpdates() {
        return this.f78928a;
    }

    private UserProfile(LinkedList linkedList) {
        this.f78928a = CollectionUtils.unmodifiableListCopy(linkedList);
    }
}
