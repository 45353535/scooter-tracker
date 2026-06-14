package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.adcom.Context;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class BlockedParams extends zb.g {
    private Set<String> blockedApplications;
    private Set<String> blockedCategories;
    private Set<String> blockedDomains;

    @Nullable
    private <T> Set<T> updateList(@Nullable Set<T> set, @Nullable Set<T> set2) {
        if (set != null) {
            if (set2 == null) {
                return new HashSet(set);
            }
            set2.addAll(set);
        }
        return set2;
    }

    void build(@NonNull Context.Restrictions.Builder builder) {
        Set<String> set = this.blockedDomains;
        if (set != null) {
            builder.addAllBadv(set);
        }
        Set<String> set2 = this.blockedCategories;
        if (set2 != null) {
            builder.addAllBcat(set2);
        }
        Set<String> set3 = this.blockedApplications;
        if (set3 != null) {
            builder.addAllBapp(set3);
        }
    }

    /* JADX INFO: renamed from: addBlockedAdvertiserDomain, reason: merged with bridge method [inline-methods] */
    public BlockedParams m7747addBlockedAdvertiserDomain(@NonNull String str) {
        if (this.blockedDomains == null) {
            this.blockedDomains = new HashSet();
        }
        this.blockedDomains.add(str);
        return this;
    }

    /* JADX INFO: renamed from: addBlockedAdvertiserIABCategory, reason: merged with bridge method [inline-methods] */
    public BlockedParams m7748addBlockedAdvertiserIABCategory(@NonNull String str) {
        if (this.blockedCategories == null) {
            this.blockedCategories = new HashSet();
        }
        this.blockedCategories.add(str);
        return this;
    }

    /* JADX INFO: renamed from: addBlockedApplication, reason: merged with bridge method [inline-methods] */
    public BlockedParams m7749addBlockedApplication(@NonNull String str) {
        if (this.blockedApplications == null) {
            this.blockedApplications = new HashSet();
        }
        this.blockedApplications.add(str);
        return this;
    }

    @Override // zb.g
    public void merge(@NonNull BlockedParams blockedParams) {
        this.blockedDomains = updateList(blockedParams.blockedDomains, this.blockedDomains);
        this.blockedCategories = updateList(blockedParams.blockedCategories, this.blockedCategories);
        this.blockedApplications = updateList(blockedParams.blockedApplications, this.blockedApplications);
    }
}
