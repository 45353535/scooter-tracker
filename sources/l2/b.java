package l2;

import com.adjust.sdk.Constants;
import com.applovin.sdk.AppLovinEventParameters;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public enum b {
    ANON_ID("anon_id"),
    APP_USER_ID("app_user_id"),
    ADVERTISER_ID("advertiser_id"),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    USER_DATA("ud"),
    ADV_TE("advertiser_tracking_enabled"),
    APP_TE("application_tracking_enabled"),
    CONSIDER_VIEWS("consider_views"),
    DEVICE_TOKEN("device_token"),
    EXT_INFO("extInfo"),
    INCLUDE_DWELL_DATA("include_dwell_data"),
    INCLUDE_VIDEO_DATA("include_video_data"),
    INSTALL_REFERRER(Constants.INSTALL_REFERRER),
    INSTALLER_PACKAGE("installer_package"),
    RECEIPT_DATA(AppLovinEventParameters.IN_APP_PURCHASE_DATA),
    URL_SCHEMES("url_schemes");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f93876c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f93895b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(String rawValue) {
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            for (b bVar : b.values()) {
                if (Intrinsics.areEqual(bVar.g(), rawValue)) {
                    return bVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    b(String str) {
        this.f93895b = str;
    }

    public final String g() {
        return this.f93895b;
    }
}
