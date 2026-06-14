package l2;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.taurusx.tax.w.s.s;

/* JADX INFO: loaded from: classes7.dex */
public enum i {
    VALUE_TO_SUM("value"),
    EVENT_TIME(s.J),
    EVENT_NAME(s.I),
    CONTENT_IDS("content_ids"),
    CONTENTS("contents"),
    CONTENT_TYPE(FirebaseAnalytics.Param.CONTENT_TYPE),
    DESCRIPTION("description"),
    LEVEL("level"),
    MAX_RATING_VALUE("max_rating_value"),
    NUM_ITEMS("num_items"),
    PAYMENT_INFO_AVAILABLE("payment_info_available"),
    REGISTRATION_METHOD("registration_method"),
    SEARCH_STRING("search_string"),
    SUCCESS("success"),
    ORDER_ID("order_id"),
    AD_TYPE("ad_type"),
    CURRENCY("currency");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f93949b;

    i(String str) {
        this.f93949b = str;
    }

    public final String g() {
        return this.f93949b;
    }
}
