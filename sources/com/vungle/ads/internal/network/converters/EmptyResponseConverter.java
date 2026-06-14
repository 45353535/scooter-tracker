package com.vungle.ads.internal.network.converters;

import hh.c0;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;
import uf.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/network/converters/EmptyResponseConverter;", "Lcom/vungle/ads/internal/network/converters/Converter;", "Lhh/c0;", "Ljava/lang/Void;", "<init>", "()V", "responseBody", "convert", "(Lhh/c0;)Ljava/lang/Void;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class EmptyResponseConverter implements Converter<c0, Void> {
    @Override // com.vungle.ads.internal.network.converters.Converter
    @Nullable
    public Void convert(@Nullable c0 responseBody) throws IOException {
        if (responseBody != null) {
            try {
                responseBody.close();
                Unit unit = Unit.f93236a;
                c.a(responseBody, null);
            } finally {
            }
        }
        return null;
    }
}
