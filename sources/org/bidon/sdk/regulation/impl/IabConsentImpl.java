package org.bidon.sdk.regulation.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.mobilefuse.sdk.privacy.IabString;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import lf.m;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.regulation.Iab;
import org.bidon.sdk.regulation.IabConsent;
import org.bidon.sdk.utils.di.InstanceType;
import org.bidon.sdk.utils.di.SimpleDiStorage;
import org.bidon.sdk.utils.json.JsonObjectBuilder;
import org.bidon.sdk.utils.json.JsonObjectBuilderKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lorg/bidon/sdk/regulation/impl/IabConsentImpl;", "Lorg/bidon/sdk/regulation/IabConsent;", "<init>", "()V", "iab", "Lorg/bidon/sdk/regulation/Iab;", "getIab", "()Lorg/bidon/sdk/regulation/Iab;", "obtainIab", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IabConsentImpl implements IabConsent {
    private final Iab obtainIab() {
        Context context;
        String string;
        try {
            try {
                InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(v0.b(Context.class));
                if (instanceType instanceof InstanceType.Singleton) {
                    Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
                    if (singleton == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
                    }
                    context = (Context) singleton;
                } else {
                    if (!(instanceType instanceof InstanceType.Factory)) {
                        if (instanceType instanceof InstanceType.ParamFactory) {
                            new InstanceType.ParamFactory.Params();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        if (instanceType != null) {
                            throw new m();
                        }
                        throw new IllegalStateException(("No factory provided for class: " + Context.class).toString());
                    }
                    Object objBuild = ((InstanceType.Factory) instanceType).build();
                    if (objBuild == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
                    }
                    context = (Context) objBuild;
                }
            } catch (Exception unused) {
                LogExtKt.logError("Dependency Injection", "BidonSdk is not initialized", BidonError.SdkNotInitialized.INSTANCE);
                context = null;
            }
            SharedPreferences defaultSharedPreferences = context != null ? PreferenceManager.getDefaultSharedPreferences(context) : null;
            final String string2 = defaultSharedPreferences != null ? defaultSharedPreferences.getString("IABConsent_SubjectToGDPR", null) : null;
            String string3 = string2 != null ? JsonObjectBuilderKt.jsonObject(new Function1() { // from class: org.bidon.sdk.regulation.impl.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IabConsentImpl.obtainIab$lambda$2$lambda$1(string2, (JsonObjectBuilder) obj);
                }
            }).toString() : null;
            Integer numValueOf = defaultSharedPreferences != null ? Integer.valueOf(defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1)) : null;
            if (numValueOf != null && numValueOf.intValue() == -1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                final int iIntValue = numValueOf.intValue();
                string = JsonObjectBuilderKt.jsonObject(new Function1() { // from class: org.bidon.sdk.regulation.impl.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return IabConsentImpl.obtainIab$lambda$5$lambda$4(iIntValue, (JsonObjectBuilder) obj);
                    }
                }).toString();
            } else {
                string = null;
            }
            return new Iab(string3, string, defaultSharedPreferences != null ? defaultSharedPreferences.getString(IabString.IAB_US_PRIVACY_STRING, null) : null);
        } catch (Exception unused2) {
            return new Iab(null, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit obtainIab$lambda$2$lambda$1(String str, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasValue("IABConsent_SubjectToGDPR", str);
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit obtainIab$lambda$5$lambda$4(int i10, JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        jsonObject.hasValue("IABTCF_gdprApplies", Integer.valueOf(i10));
        return Unit.f93236a;
    }

    @Override // org.bidon.sdk.regulation.IabConsent
    @NotNull
    public Iab getIab() {
        return obtainIab();
    }
}
