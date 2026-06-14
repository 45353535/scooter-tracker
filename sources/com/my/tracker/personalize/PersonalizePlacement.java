package com.my.tracker.personalize;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public final class PersonalizePlacement {
    public final int groupId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NonNull
    public final String f62005id;

    @NonNull
    public final PersonalizeOffer offer;
    public final int testId;

    PersonalizePlacement(String str, int i10, int i11, PersonalizeOffer personalizeOffer) {
        this.f62005id = str;
        this.groupId = i10;
        this.testId = i11;
        this.offer = personalizeOffer;
    }
}
