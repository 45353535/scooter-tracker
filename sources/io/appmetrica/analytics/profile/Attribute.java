package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C4973an;
import io.appmetrica.analytics.impl.C5437t4;
import io.appmetrica.analytics.impl.C5544xb;
import io.appmetrica.analytics.impl.Nb;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes12.dex */
public final class Attribute {
    @NonNull
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    @NonNull
    public static BooleanAttribute customBoolean(@NonNull String str) {
        return new BooleanAttribute(str, new C5544xb(), new Nb(new C5437t4(100)));
    }

    @NonNull
    public static CounterAttribute customCounter(@NonNull String str) {
        return new CounterAttribute(str, new C5544xb(), new Nb(new C5437t4(100)));
    }

    @NonNull
    public static NumberAttribute customNumber(@NonNull String str) {
        return new NumberAttribute(str, new C5544xb(), new Nb(new C5437t4(100)));
    }

    @NonNull
    public static StringAttribute customString(@NonNull String str) {
        return new StringAttribute(str, new C4973an(200, "String attribute \"" + str + "\"", PublicLogger.getAnonymousInstance()), new C5544xb(), new Nb(new C5437t4(100)));
    }

    @NonNull
    public static GenderAttribute gender() {
        return new GenderAttribute();
    }

    @NonNull
    public static NameAttribute name() {
        return new NameAttribute();
    }

    @NonNull
    public static NotificationsEnabledAttribute notificationsEnabled() {
        return new NotificationsEnabledAttribute();
    }
}
