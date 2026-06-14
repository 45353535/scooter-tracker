package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.os.Parcel;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f75371a;

    @VisibleForTesting
    public q(@NotNull f fVar) {
        this.f75371a = fVar;
    }

    @Override // io.appmetrica.analytics.identifiers.impl.b
    @NotNull
    public final c a(@NotNull Context context) {
        c cVar;
        try {
            try {
                try {
                    try {
                        c cVarB = b(context);
                        try {
                            this.f75371a.b(context);
                            return cVarB;
                        } catch (Throwable unused) {
                            return cVarB;
                        }
                    } catch (l e10) {
                        String message = e10.getMessage();
                        if (message == null) {
                            message = "No yandex adv_id service";
                        }
                        cVar = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message, 2);
                        this.f75371a.b(context);
                        return cVar;
                    } catch (Throwable th2) {
                        return new c(IdentifierStatus.UNKNOWN, null, "exception while fetching yandex adv_id: " + th2.getMessage(), 2);
                    }
                } catch (g e11) {
                    String message2 = e11.getMessage();
                    if (message2 == null) {
                        message2 = "unknown exception while binding yandex adv_id service";
                    }
                    cVar = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message2, 2);
                    this.f75371a.b(context);
                    return cVar;
                }
            } catch (Throwable unused2) {
                return cVar;
            }
        } finally {
            try {
                this.f75371a.b(context);
            } catch (Throwable unused3) {
            }
        }
    }

    public final c b(Context context) {
        s sVar = (s) ((u) this.f75371a.a(context));
        sVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            sVar.f75373a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            String string = parcelObtain2.readString();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            parcelObtain = Parcel.obtain();
            parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
                sVar.f75373a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                boolean z10 = parcelObtain2.readInt() != 0;
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return new c(IdentifierStatus.OK, new a("yandex", string, Boolean.valueOf(z10)), null, 4);
            } finally {
            }
        } finally {
        }
    }

    public q() {
        this(new f(r.f75372a, p.f75370a, "yandex"));
    }
}
