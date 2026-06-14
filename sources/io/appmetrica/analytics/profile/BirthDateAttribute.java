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
import io.appmetrica.analytics.impl.R2;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class BirthDateAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A6 f78919a = new A6("appmetrica_birth_date", new C5113g8(), new Cl());

    BirthDateAttribute() {
    }

    final UserProfileUpdate a(Calendar calendar, String str, R2 r22) {
        return new UserProfileUpdate(new C4999bn(this.f78919a.f75496c, new SimpleDateFormat(str).format(calendar.getTime()), new C5087f8(), new C5113g8(), r22));
    }

    public UserProfileUpdate<? extends InterfaceC5129go> withAge(int i10) {
        int i11 = Calendar.getInstance(Locale.US).get(1) - i10;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i11);
        return a(gregorianCalendar, "yyyy", new C5587z4(this.f78919a.f75495b));
    }

    public UserProfileUpdate<? extends InterfaceC5129go> withAgeIfUndefined(int i10) {
        int i11 = Calendar.getInstance(Locale.US).get(1) - i10;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i11);
        return a(gregorianCalendar, "yyyy", new C5023cl(this.f78919a.f75495b));
    }

    public UserProfileUpdate<? extends InterfaceC5129go> withBirthDate(@NonNull Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new C5587z4(this.f78919a.f75495b));
    }

    public UserProfileUpdate<? extends InterfaceC5129go> withBirthDateIfUndefined(@NonNull Calendar calendar) {
        return a(calendar, "yyyy-MM-dd", new C5023cl(this.f78919a.f75495b));
    }

    public UserProfileUpdate<? extends InterfaceC5129go> withValueReset() {
        return new UserProfileUpdate<>(new Gi(0, this.f78919a.f75496c, new C5113g8(), new Cl()));
    }

    public UserProfileUpdate<? extends InterfaceC5129go> withBirthDate(int i10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        return a(gregorianCalendar, "yyyy", new C5587z4(this.f78919a.f75495b));
    }

    public UserProfileUpdate<? extends InterfaceC5129go> withBirthDateIfUndefined(int i10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        return a(gregorianCalendar, "yyyy", new C5023cl(this.f78919a.f75495b));
    }

    public UserProfileUpdate<? extends InterfaceC5129go> withBirthDate(int i10, int i11) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, i11 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new C5587z4(this.f78919a.f75495b));
    }

    public UserProfileUpdate<? extends InterfaceC5129go> withBirthDateIfUndefined(int i10, int i11) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, i11 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new C5023cl(this.f78919a.f75495b));
    }

    public UserProfileUpdate<? extends InterfaceC5129go> withBirthDate(int i10, int i11, int i12) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, i11 - 1);
        gregorianCalendar.set(5, i12);
        return a(gregorianCalendar, "yyyy-MM-dd", new C5587z4(this.f78919a.f75495b));
    }

    public UserProfileUpdate<? extends InterfaceC5129go> withBirthDateIfUndefined(int i10, int i11, int i12) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, i11 - 1);
        gregorianCalendar.set(5, i12);
        return a(gregorianCalendar, "yyyy-MM-dd", new C5023cl(this.f78919a.f75495b));
    }
}
