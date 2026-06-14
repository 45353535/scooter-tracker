package l2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public enum m {
    EVENT_TIME("_logTime"),
    EVENT_NAME("_eventName"),
    VALUE_TO_SUM("_valueToSum"),
    CONTENT_IDS("fb_content_id"),
    CONTENTS("fb_content"),
    CONTENT_TYPE("fb_content_type"),
    DESCRIPTION("fb_description"),
    LEVEL("fb_level"),
    MAX_RATING_VALUE("fb_max_rating_value"),
    NUM_ITEMS("fb_num_items"),
    PAYMENT_INFO_AVAILABLE("fb_payment_info_available"),
    REGISTRATION_METHOD("fb_registration_method"),
    SEARCH_STRING("fb_search_string"),
    SUCCESS("fb_success"),
    ORDER_ID("fb_order_id"),
    AD_TYPE("ad_type"),
    CURRENCY("fb_currency");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f93991c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f94010b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a(String rawValue) {
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            for (m mVar : m.values()) {
                if (Intrinsics.areEqual(mVar.g(), rawValue)) {
                    return mVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    m(String str) {
        this.f94010b = str;
    }

    public final String g() {
        return this.f94010b;
    }
}
