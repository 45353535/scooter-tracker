package com.my.tracker.personalize;

import android.text.TextUtils;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class PersonalizePlacementsRequest extends PersonalizeRequest<List<PersonalizePlacement>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f62006a = d();

    @Nullable
    public final Map<String, String> customParams;

    @Nullable
    public final List<String> placements;
    public final boolean reset;

    @NonNull
    public final String userId;

    public static abstract class Builder<T extends PersonalizePlacementsRequest> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f62007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List f62008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Map f62009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f62010d = true;

        Builder(String str) {
            this.f62007a = str;
        }

        @NonNull
        @AnyThread
        public abstract T build();

        @NonNull
        @AnyThread
        public Builder<T> withCustomParams(@Nullable Map<String, String> map) {
            if (map != null) {
                this.f62009c = new HashMap(map);
                return this;
            }
            this.f62009c = null;
            return this;
        }

        @NonNull
        @AnyThread
        public Builder<T> withPlacements(@Nullable List<String> list) {
            if (list != null) {
                this.f62008b = new ArrayList(list);
                return this;
            }
            this.f62008b = null;
            return this;
        }

        @NonNull
        @AnyThread
        public Builder<T> withReset(boolean z10) {
            this.f62010d = z10;
            return this;
        }
    }

    PersonalizePlacementsRequest(List list, String str, boolean z10, Map map) {
        this.placements = list;
        this.userId = str;
        this.reset = z10;
        this.customParams = map;
    }

    private Map d() {
        HashMap map = new HashMap();
        Map<String, String> map2 = this.customParams;
        if (map2 != null && !map2.isEmpty()) {
            this.customParams.remove("custom_user_id");
            this.customParams.remove("placement_ids");
            this.customParams.remove("reset");
            this.customParams.remove("flat");
            for (Map.Entry<String, String> entry : this.customParams.entrySet()) {
                map.put(entry.getKey(), Collections.singletonList(entry.getValue()));
            }
        }
        List<String> list = this.placements;
        if (list != null && !list.isEmpty()) {
            map.put("placement_ids", this.placements);
        }
        if (!TextUtils.isEmpty(this.userId)) {
            map.put("custom_user_id", Collections.singletonList(this.userId));
        }
        map.put("reset", Collections.singletonList(this.reset ? "1" : "0"));
        map.put("flat", Collections.singletonList("1"));
        return map;
    }

    @Override // com.my.tracker.personalize.PersonalizeRequest
    final Map b() {
        return this.f62006a;
    }

    @Override // com.my.tracker.personalize.PersonalizeRequest
    final b c() {
        return new d();
    }
}
