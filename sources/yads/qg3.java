package yads;

import android.content.res.TypedArray;
import com.yandex.mobile.ads.R$styleable;
import kotlin.collections.ArraysKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qg3 {
    public static pg3 a(TypedArray typedArray) {
        return (pg3) ArraysKt.getOrNull(pg3.values(), typedArray.getInt(R$styleable.MonetizationAdsInternalMediaView_monetization_internal_video_scale_type, -1));
    }
}
