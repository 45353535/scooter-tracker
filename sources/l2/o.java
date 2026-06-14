package l2;

import com.ironsource.D5;

/* JADX INFO: loaded from: classes7.dex */
public enum o {
    URL(D5.f40571r),
    ENABLED("is_enabled"),
    DATASETID("dataset_id"),
    ACCESSKEY("access_key");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f94023b;

    o(String str) {
        this.f94023b = str;
    }

    public final String g() {
        return this.f94023b;
    }
}
