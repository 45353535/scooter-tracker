package com.my.tracker.personalize;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import com.my.tracker.personalize.PersonalizePlacementsRequest;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class PersonalizeSetRequest extends PersonalizePlacementsRequest {

    public static final class Builder extends PersonalizePlacementsRequest.Builder<PersonalizeSetRequest> {
        Builder(String str) {
            super(str);
        }

        @Override // com.my.tracker.personalize.PersonalizePlacementsRequest.Builder
        @NonNull
        public PersonalizeSetRequest build() {
            return new PersonalizeSetRequest(this.f62008b, this.f62007a, this.f62010d, this.f62009c);
        }
    }

    PersonalizeSetRequest(List list, String str, boolean z10, Map map) {
        super(list, str, z10, map);
    }

    @NonNull
    @AnyThread
    public static PersonalizePlacementsRequest.Builder<PersonalizeSetRequest> newBuilder(@NonNull String str) {
        return new Builder(str);
    }

    @Override // com.my.tracker.personalize.PersonalizeRequest
    String a() {
        return "/set";
    }
}
