package com.vungle.ads.internal.network.converters;

import androidx.exifinterface.media.ExifInterface;
import com.taurusx.tax.f.y;
import hh.c0;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.e;
import kotlinx.serialization.json.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uf.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \f*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/vungle/ads/internal/network/converters/JsonConverter;", ExifInterface.LONGITUDE_EAST, "Lcom/vungle/ads/internal/network/converters/Converter;", "Lhh/c0;", "Lkotlin/reflect/KType;", "kType", "<init>", "(Lkotlin/reflect/KType;)V", "responseBody", "convert", "(Lhh/c0;)Ljava/lang/Object;", "Lkotlin/reflect/KType;", y.f66058y, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class JsonConverter<E> implements Converter<c0, E> {

    @NotNull
    private static final b json = v.b(null, new Function1<e, Unit>() { // from class: com.vungle.ads.internal.network.converters.JsonConverter$Companion$json$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e eVar) {
            invoke2(eVar);
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull e Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.f(true);
            Json.d(true);
            Json.e(false);
            Json.c(true);
        }
    }, 1, null);

    @NotNull
    private final KType kType;

    public JsonConverter(@NotNull KType kType) {
        Intrinsics.checkNotNullParameter(kType, "kType");
        this.kType = kType;
    }

    @Override // com.vungle.ads.internal.network.converters.Converter
    @Nullable
    public E convert(@Nullable c0 responseBody) throws IOException {
        if (responseBody != null) {
            try {
                String strString = responseBody.string();
                if (strString != null) {
                    E e10 = (E) json.c(ug.v.b(b.f93658d.a(), this.kType), strString);
                    c.a(responseBody, null);
                    return e10;
                }
            } finally {
            }
        }
        c.a(responseBody, null);
        return null;
    }
}
