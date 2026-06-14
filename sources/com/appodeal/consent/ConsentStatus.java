package com.appodeal.consent;

import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/appodeal/consent/ConsentStatus;", "", "", "a", "Ljava/lang/String;", "getStatusName", "()Ljava/lang/String;", "statusName", y.f66058y, "com/appodeal/consent/g", "Unknown", "Required", "NotRequired", "Obtained", "consent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConsentStatus {

    @NotNull
    public static final k Companion;
    public static final ConsentStatus NotRequired;
    public static final ConsentStatus Obtained;
    public static final ConsentStatus Required;
    public static final ConsentStatus Unknown;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ConsentStatus[] f15365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f15366c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String statusName;

    static {
        ConsentStatus consentStatus = new ConsentStatus("Unknown", 0, "UNKNOWN");
        Unknown = consentStatus;
        ConsentStatus consentStatus2 = new ConsentStatus("Required", 1, "REQUIRED");
        Required = consentStatus2;
        ConsentStatus consentStatus3 = new ConsentStatus("NotRequired", 2, "NOT_REQUIRED");
        NotRequired = consentStatus3;
        ConsentStatus consentStatus4 = new ConsentStatus("Obtained", 3, "OBTAINED");
        Obtained = consentStatus4;
        ConsentStatus[] consentStatusArr = {consentStatus, consentStatus2, consentStatus3, consentStatus4};
        f15365b = consentStatusArr;
        f15366c = qf.a.a(consentStatusArr);
        Companion = new k();
    }

    public ConsentStatus(String str, int i10, String str2) {
        this.statusName = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f15366c;
    }

    public static ConsentStatus valueOf(String str) {
        return (ConsentStatus) Enum.valueOf(ConsentStatus.class, str);
    }

    public static ConsentStatus[] values() {
        return (ConsentStatus[]) f15365b.clone();
    }

    @NotNull
    public final String getStatusName() {
        return this.statusName;
    }
}
