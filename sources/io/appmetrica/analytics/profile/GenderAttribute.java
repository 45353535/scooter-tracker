package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C4999bn;
import io.appmetrica.analytics.impl.C5023cl;
import io.appmetrica.analytics.impl.C5087f8;
import io.appmetrica.analytics.impl.C5113g8;
import io.appmetrica.analytics.impl.C5587z4;
import io.appmetrica.analytics.impl.Cl;
import io.appmetrica.analytics.impl.Gi;
import io.appmetrica.analytics.impl.InterfaceC5129go;

/* JADX INFO: loaded from: classes12.dex */
public class GenderAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A6 f78922a = new A6("appmetrica_gender", new C5113g8(), new Cl());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f78924a;

        Gender(String str) {
            this.f78924a = str;
        }

        public String getStringValue() {
            return this.f78924a;
        }
    }

    GenderAttribute() {
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5129go> withValue(@NonNull Gender gender) {
        String str = this.f78922a.f75496c;
        String stringValue = gender.getStringValue();
        C5087f8 c5087f8 = new C5087f8();
        A6 a62 = this.f78922a;
        return new UserProfileUpdate<>(new C4999bn(str, stringValue, c5087f8, a62.f75494a, new C5587z4(a62.f75495b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5129go> withValueIfUndefined(@NonNull Gender gender) {
        String str = this.f78922a.f75496c;
        String stringValue = gender.getStringValue();
        C5087f8 c5087f8 = new C5087f8();
        A6 a62 = this.f78922a;
        return new UserProfileUpdate<>(new C4999bn(str, stringValue, c5087f8, a62.f75494a, new C5023cl(a62.f75495b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5129go> withValueReset() {
        A6 a62 = this.f78922a;
        return new UserProfileUpdate<>(new Gi(0, a62.f75496c, a62.f75494a, a62.f75495b));
    }
}
