package io.bidmachine;

import android.location.Location;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.adcom.Context;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.protobuf.sdk.App;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class TargetingParams extends zb.g {

    @VisibleForTesting
    static final String DATA_ID_EXTERNAL_USER_ID = "external_user_ids";
    private Integer birthdayYear;
    private BlockedParams blockedParams;
    private String city;
    private String country;
    private Location deviceLocation;
    private List<ExternalUserId> externalUserIdList;
    private String framework;
    private ae.d gender;
    private Boolean isPaid;
    private String[] keywords;
    private String storeCategory;
    private String[] storeSubCategories;
    private String storeUrl;
    private String userId;
    private String zip;

    public static /* synthetic */ void a(App.Builder builder, String[] strArr) {
        for (String str : strArr) {
            builder.addStoresubcat(str);
        }
    }

    private void prepareBlockParams() {
        if (this.blockedParams == null) {
            this.blockedParams = new BlockedParams();
        }
    }

    void build(@NonNull Context.App.Builder builder) {
        String str = this.storeUrl;
        if (str != null) {
            builder.setStoreurl(str);
        }
        Boolean bool = this.isPaid;
        builder.setPaid(bool != null && bool.booleanValue());
    }

    void fillAppExtension(@NonNull final App.Builder builder) {
        String str = this.storeCategory;
        Objects.requireNonNull(builder);
        io.bidmachine.core.h.F(str, new Executable() { // from class: io.bidmachine.z5
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setStorecat((String) obj);
            }
        });
        io.bidmachine.core.h.F(this.storeSubCategories, new Executable() { // from class: io.bidmachine.a6
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                TargetingParams.a(builder, (String[]) obj);
            }
        });
        io.bidmachine.core.h.F(this.framework, new Executable() { // from class: io.bidmachine.b6
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                builder.setFmwname((String) obj);
            }
        });
    }

    @Nullable
    Integer getBirthdayYear() {
        return this.birthdayYear;
    }

    @Nullable
    BlockedParams getBlockedParams() {
        return this.blockedParams;
    }

    @Nullable
    String getCity() {
        return this.city;
    }

    @Nullable
    String getCountry() {
        return this.country;
    }

    @Nullable
    Location getDeviceLocation() {
        return this.deviceLocation;
    }

    @Nullable
    List<ExternalUserId> getExternalUserIdList() {
        return this.externalUserIdList;
    }

    @Nullable
    String getFramework() {
        return this.framework;
    }

    @Nullable
    ae.d getGender() {
        return this.gender;
    }

    @Nullable
    String[] getKeywords() {
        return this.keywords;
    }

    @Nullable
    Boolean getPaid() {
        return this.isPaid;
    }

    @Nullable
    String getStoreCategory() {
        return this.storeCategory;
    }

    @Nullable
    String[] getStoreSubCategories() {
        return this.storeSubCategories;
    }

    @Nullable
    String getStoreUrl() {
        return this.storeUrl;
    }

    @Nullable
    String getUserId() {
        return this.userId;
    }

    @Nullable
    String getZip() {
        return this.zip;
    }

    /* JADX INFO: renamed from: setExternalUserIds, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m7770setExternalUserIds(List list) {
        return setExternalUserIds((List<ExternalUserId>) list);
    }

    /* JADX INFO: renamed from: addBlockedAdvertiserDomain, reason: merged with bridge method [inline-methods] */
    public TargetingParams m7763addBlockedAdvertiserDomain(@NonNull String str) {
        prepareBlockParams();
        this.blockedParams.m7747addBlockedAdvertiserDomain(str);
        return this;
    }

    /* JADX INFO: renamed from: addBlockedAdvertiserIABCategory, reason: merged with bridge method [inline-methods] */
    public TargetingParams m7764addBlockedAdvertiserIABCategory(@NonNull String str) {
        prepareBlockParams();
        this.blockedParams.m7748addBlockedAdvertiserIABCategory(str);
        return this;
    }

    /* JADX INFO: renamed from: addBlockedApplication, reason: merged with bridge method [inline-methods] */
    public TargetingParams m7765addBlockedApplication(@NonNull String str) {
        prepareBlockParams();
        this.blockedParams.m7749addBlockedApplication(str);
        return this;
    }

    @Override // zb.g
    public void merge(@NonNull TargetingParams targetingParams) {
        this.userId = (String) io.bidmachine.core.h.W(this.userId, targetingParams.userId);
        this.gender = (ae.d) io.bidmachine.core.h.W(this.gender, targetingParams.gender);
        this.birthdayYear = (Integer) io.bidmachine.core.h.W(this.birthdayYear, targetingParams.birthdayYear);
        this.keywords = (String[]) io.bidmachine.core.h.W(this.keywords, targetingParams.keywords);
        this.country = (String) io.bidmachine.core.h.W(this.country, targetingParams.country);
        this.city = (String) io.bidmachine.core.h.W(this.city, targetingParams.city);
        this.zip = (String) io.bidmachine.core.h.W(this.zip, targetingParams.zip);
        this.deviceLocation = (Location) io.bidmachine.core.h.W(this.deviceLocation, targetingParams.deviceLocation);
        this.storeUrl = (String) io.bidmachine.core.h.W(this.storeUrl, targetingParams.storeUrl);
        this.storeCategory = (String) io.bidmachine.core.h.W(this.storeCategory, targetingParams.storeCategory);
        this.storeSubCategories = (String[]) io.bidmachine.core.h.W(this.storeSubCategories, targetingParams.storeSubCategories);
        this.framework = (String) io.bidmachine.core.h.W(this.framework, targetingParams.framework);
        this.isPaid = (Boolean) io.bidmachine.core.h.W(this.isPaid, targetingParams.isPaid);
        this.externalUserIdList = (List) io.bidmachine.core.h.W(this.externalUserIdList, targetingParams.externalUserIdList);
        if (targetingParams.blockedParams != null) {
            if (this.blockedParams == null) {
                this.blockedParams = new BlockedParams();
            }
            this.blockedParams.merge(targetingParams.blockedParams);
        }
    }

    /* JADX INFO: renamed from: setBirthdayYear, reason: merged with bridge method [inline-methods] */
    public TargetingParams m7766setBirthdayYear(Integer num) {
        if (num == null || io.bidmachine.core.h.O(num.intValue())) {
            this.birthdayYear = num;
            return this;
        }
        io.bidmachine.core.a.g("Birthday Year should be 4-digit integer, more or equal 1900 and less or equal than current year");
        return this;
    }

    /* JADX INFO: renamed from: setCity, reason: merged with bridge method [inline-methods] */
    public TargetingParams m7767setCity(String str) {
        this.city = str;
        return this;
    }

    /* JADX INFO: renamed from: setCountry, reason: merged with bridge method [inline-methods] */
    public TargetingParams m7768setCountry(String str) {
        this.country = str;
        return this;
    }

    /* JADX INFO: renamed from: setDeviceLocation, reason: merged with bridge method [inline-methods] */
    public TargetingParams m7769setDeviceLocation(Location location) {
        this.deviceLocation = location;
        return this;
    }

    public TargetingParams setExternalUserIds(List<ExternalUserId> list) {
        this.externalUserIdList = list;
        return this;
    }

    /* JADX INFO: renamed from: setFramework, reason: merged with bridge method [inline-methods] */
    public TargetingParams m7771setFramework(String str) {
        this.framework = str;
        return this;
    }

    /* JADX INFO: renamed from: setGender, reason: merged with bridge method [inline-methods] */
    public TargetingParams m7772setGender(ae.d dVar) {
        this.gender = dVar;
        return this;
    }

    /* JADX INFO: renamed from: setKeywords, reason: merged with bridge method [inline-methods] */
    public TargetingParams m7773setKeywords(String... strArr) {
        this.keywords = strArr;
        return this;
    }

    /* JADX INFO: renamed from: setPaid, reason: merged with bridge method [inline-methods] */
    public TargetingParams m7774setPaid(Boolean bool) {
        this.isPaid = bool;
        return this;
    }

    /* JADX INFO: renamed from: setStoreCategory, reason: merged with bridge method [inline-methods] */
    public TargetingParams m7775setStoreCategory(String str) {
        this.storeCategory = str;
        return this;
    }

    /* JADX INFO: renamed from: setStoreSubCategories, reason: merged with bridge method [inline-methods] */
    public TargetingParams m7776setStoreSubCategories(String... strArr) {
        this.storeSubCategories = strArr;
        return this;
    }

    /* JADX INFO: renamed from: setStoreUrl, reason: merged with bridge method [inline-methods] */
    public TargetingParams m7777setStoreUrl(String str) {
        this.storeUrl = str;
        return this;
    }

    /* JADX INFO: renamed from: setUserId, reason: merged with bridge method [inline-methods] */
    public TargetingParams m7778setUserId(String str) {
        this.userId = str;
        return this;
    }

    /* JADX INFO: renamed from: setZip, reason: merged with bridge method [inline-methods] */
    public TargetingParams m7779setZip(String str) {
        this.zip = str;
        return this;
    }

    void build(@NonNull Context.User.Builder builder) {
        String str = this.userId;
        if (str != null) {
            builder.setId(str);
        }
        Integer num = this.birthdayYear;
        if (num != null) {
            builder.setYob(num.intValue());
        }
        ae.d dVar = this.gender;
        if (dVar != null) {
            builder.setGender(dVar.g());
        }
        String[] strArr = this.keywords;
        if (strArr != null && strArr.length > 0) {
            StringBuilder sb2 = new StringBuilder();
            for (String str2 : this.keywords) {
                if (sb2.length() > 0) {
                    sb2.append(StringUtils.COMMA);
                }
                sb2.append(str2);
            }
            builder.setKeywords(sb2.toString());
        }
        Context.Geo.Builder builderNewBuilder = Context.Geo.newBuilder();
        build(builderNewBuilder);
        ae.f.e(builderNewBuilder, null, false);
        builder.setGeo(builderNewBuilder);
        List<ExternalUserId> list = this.externalUserIdList;
        if (list == null || list.size() <= 0) {
            return;
        }
        Context.Data.Builder id2 = Context.Data.newBuilder().setId(DATA_ID_EXTERNAL_USER_ID);
        for (ExternalUserId externalUserId : this.externalUserIdList) {
            String sourceId = externalUserId.getSourceId();
            String value = externalUserId.getValue();
            if (!TextUtils.isEmpty(sourceId) && !TextUtils.isEmpty(value)) {
                id2.addSegment(Context.Data.Segment.newBuilder().setId(sourceId).setValue(value));
            }
        }
        builder.addData(id2);
    }

    void build(@NonNull Context.Geo.Builder builder) {
        String str = this.country;
        if (str != null) {
            builder.setCountry(str);
        }
        String str2 = this.city;
        if (str2 != null) {
            builder.setCity(str2);
        }
        String str3 = this.zip;
        if (str3 != null) {
            builder.setZip(str3);
        }
    }
}
