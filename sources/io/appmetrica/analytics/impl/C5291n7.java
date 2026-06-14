package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5291n7 implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5215k7 f77810a;

    public C5291n7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(@NotNull C5266m7 c5266m7) {
        ContentValues contentValues = new ContentValues();
        Long l10 = c5266m7.f77738a;
        if (l10 != null) {
            contentValues.put("session_id", Long.valueOf(l10.longValue()));
        }
        EnumC4971al enumC4971al = c5266m7.f77739b;
        if (enumC4971al != null) {
            contentValues.put("session_type", Integer.valueOf(enumC4971al.f76850a));
        }
        Long l11 = c5266m7.f77740c;
        if (l11 != null) {
            contentValues.put("number_in_session", Long.valueOf(l11.longValue()));
        }
        EnumC5168ib enumC5168ib = c5266m7.f77741d;
        if (enumC5168ib != null) {
            contentValues.put("type", Integer.valueOf(enumC5168ib.f77427a));
        }
        Long l12 = c5266m7.f77742e;
        if (l12 != null) {
            contentValues.put("global_number", Long.valueOf(l12.longValue()));
        }
        Long l13 = c5266m7.f77743f;
        if (l13 != null) {
            contentValues.put("time", Long.valueOf(l13.longValue()));
        }
        C5215k7 c5215k7 = this.f77810a;
        contentValues.put("event_description", MessageNano.toByteArray(c5215k7.f77590a.fromModel(c5266m7.f77744g)));
        return contentValues;
    }

    public C5291n7(@NotNull C5215k7 c5215k7) {
        this.f77810a = c5215k7;
    }

    public /* synthetic */ C5291n7(C5215k7 c5215k7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C5215k7(null, 1, 0 == true ? 1 : 0) : c5215k7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5266m7 toModel(@NotNull ContentValues contentValues) {
        EnumC4971al enumC4971al;
        Long asLong = contentValues.getAsLong("session_id");
        Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            int iIntValue = asInteger.intValue();
            enumC4971al = EnumC4971al.FOREGROUND;
            if (iIntValue != 0 && iIntValue == 1) {
                enumC4971al = EnumC4971al.BACKGROUND;
            }
        } else {
            enumC4971al = null;
        }
        Long asLong2 = contentValues.getAsLong("number_in_session");
        Integer asInteger2 = contentValues.getAsInteger("type");
        return new C5266m7(asLong, enumC4971al, asLong2, asInteger2 != null ? EnumC5168ib.a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong("time"), this.f77810a.toModel(contentValues.getAsByteArray("event_description")));
    }
}
