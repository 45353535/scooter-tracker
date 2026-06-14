package com.appodeal.consent;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\f\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/appodeal/consent/ConsentInformation;", "", "Lcom/appodeal/consent/CmpType;", "a", "Lcom/appodeal/consent/CmpType;", "getType", "()Lcom/appodeal/consent/CmpType;", "type", "Lcom/appodeal/consent/ConsentStatus;", "getStatus", "()Lcom/appodeal/consent/ConsentStatus;", "status", "com/appodeal/consent/c", "com/appodeal/consent/b", "Lcom/appodeal/consent/f;", "Lcom/appodeal/consent/g;", "consent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ConsentInformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final CmpType type;

    public ConsentInformation(CmpType cmpType, DefaultConstructorMarker defaultConstructorMarker) {
        this.type = cmpType;
    }

    @NotNull
    public abstract ConsentStatus getStatus();

    @NotNull
    public final CmpType getType() {
        return this.type;
    }
}
