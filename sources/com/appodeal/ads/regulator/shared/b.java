package com.appodeal.ads.regulator.shared;

import android.content.SharedPreferences;
import com.mobilefuse.sdk.privacy.IabString;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f14370r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f14371s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f14372t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, g gVar, SharedPreferences sharedPreferences, Continuation continuation) {
        super(2, continuation);
        this.f14370r = str;
        this.f14371s = gVar;
        this.f14372t = sharedPreferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f14370r, this.f14371s, this.f14372t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        String str = this.f14370r;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -955745707) {
                if (iHashCode != 743443760) {
                    if (iHashCode != 969191740) {
                        if (iHashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                            this.f14371s.g(this.f14372t);
                            this.f14371s.j(this.f14372t);
                        }
                    } else if (str.equals("IABConsent_ConsentString")) {
                        this.f14371s.g(this.f14372t);
                        this.f14371s.f(this.f14372t);
                    }
                } else if (str.equals(IabString.IAB_US_PRIVACY_STRING)) {
                    this.f14371s.g(this.f14372t);
                    this.f14371s.k(this.f14372t);
                }
            } else if (str.equals("IABTCF_ApdPrivacyConsent")) {
                this.f14371s.i(this.f14372t);
            }
        }
        return Unit.f93236a;
    }
}
