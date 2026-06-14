package com.appodeal.consent.parameters;

import com.appodeal.consent.ConsentUpdateRequestParameters;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0004\b\r\u0010\u000eR-\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/appodeal/consent/parameters/ConsentUpdateRequestParametersAsync;", "Lcom/appodeal/consent/ConsentUpdateRequestParameters;", "", C4240b4.i.W, "", "tagForUnderAgeOfConsent", "sdk", "sdkVersion", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Landroid/app/Activity;", "", "getActivity", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", InneractiveMediationDefs.GENDER_FEMALE, "Lkotlin/jvm/functions/Function1;", "getGetActivity", "()Lkotlin/jvm/functions/Function1;", "consent_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConsentUpdateRequestParametersAsync extends ConsentUpdateRequestParameters {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final Function1 getActivity;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ConsentUpdateRequestParametersAsync(String str, Boolean bool, String str2, String str3, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Function1 function12;
        String str4;
        bool = (i10 & 2) != 0 ? null : bool;
        str2 = (i10 & 4) != 0 ? null : str2;
        if ((i10 & 8) != 0) {
            function12 = function1;
            str4 = null;
        } else {
            function12 = function1;
            str4 = str3;
        }
        this(str, bool, str2, str4, function12);
    }

    @NotNull
    public final Function1<Continuation, Object> getGetActivity() {
        return this.getActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentUpdateRequestParametersAsync(@NotNull String key, @Nullable Boolean bool, @Nullable String str, @Nullable String str2, @NotNull Function1<? super Continuation, ? extends Object> getActivity) {
        super(key, bool, str, str2);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(getActivity, "getActivity");
        this.getActivity = getActivity;
    }
}
