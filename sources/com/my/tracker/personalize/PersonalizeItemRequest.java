package com.my.tracker.personalize;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import com.my.tracker.personalize.PersonalizePlacementsRequest;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class PersonalizeItemRequest extends PersonalizePlacementsRequest {

    public static final class Builder extends PersonalizePlacementsRequest.Builder<PersonalizeItemRequest> {
        Builder(String str) {
            super(str);
        }

        @Override // com.my.tracker.personalize.PersonalizePlacementsRequest.Builder
        @NonNull
        public PersonalizeItemRequest build() {
            return new PersonalizeItemRequest(this.f62008b, this.f62007a, this.f62010d, this.f62009c);
        }
    }

    PersonalizeItemRequest(List list, String str, boolean z10, Map map) {
        super(list, str, z10, map);
    }

    @NonNull
    @AnyThread
    public static PersonalizePlacementsRequest.Builder<PersonalizeItemRequest> newBuilder(@NonNull String str) {
        return new Builder(str);
    }

    @Override // com.my.tracker.personalize.PersonalizeRequest
    String a() {
        return "/item";
    }
}
