package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class B7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5565y7 f75577a;

    public B7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(@NotNull A7 a72) {
        ContentValues contentValues = new ContentValues();
        Long l10 = a72.f75497a;
        if (l10 != null) {
            contentValues.put("id", Long.valueOf(l10.longValue()));
        }
        EnumC4971al enumC4971al = a72.f75498b;
        if (enumC4971al != null) {
            contentValues.put("type", Integer.valueOf(enumC4971al.f76850a));
        }
        String str = a72.f75499c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        C5565y7 c5565y7 = this.f75577a;
        contentValues.put("session_description", MessageNano.toByteArray(c5565y7.f78575a.fromModel(a72.f75500d)));
        return contentValues;
    }

    public B7(@NotNull C5565y7 c5565y7) {
        this.f75577a = c5565y7;
    }

    public /* synthetic */ B7(C5565y7 c5565y7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C5565y7(null, 1, 0 == true ? 1 : 0) : c5565y7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A7 toModel(@NotNull ContentValues contentValues) {
        EnumC4971al enumC4971al;
        Long asLong = contentValues.getAsLong("id");
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            int iIntValue = asInteger.intValue();
            enumC4971al = EnumC4971al.FOREGROUND;
            if (iIntValue != 0 && iIntValue == 1) {
                enumC4971al = EnumC4971al.BACKGROUND;
            }
        } else {
            enumC4971al = null;
        }
        return new A7(asLong, enumC4971al, contentValues.getAsString("report_request_parameters"), this.f75577a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
