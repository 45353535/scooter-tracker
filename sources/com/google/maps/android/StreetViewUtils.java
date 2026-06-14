package com.google.maps.android;

import com.amazon.device.ads.DTBMetricsConfiguration;
import com.google.android.gms.maps.model.LatLng;
import com.taurusx.tax.f.y;
import eg.g;
import eg.o0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/maps/android/StreetViewUtils;", "", "()V", y.f66058y, "library_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StreetViewUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/google/maps/android/StreetViewUtils$Companion;", "", "<init>", "()V", "", "responseString", "Lcom/google/maps/android/ResponseStreetView;", "a", "(Ljava/lang/String;)Lcom/google/maps/android/ResponseStreetView;", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", DTBMetricsConfiguration.APSMETRICS_APIKEY, "Lcom/google/maps/android/Source;", "source", "Lcom/google/maps/android/Status;", "fetchStreetViewData", "(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;Lcom/google/maps/android/Source;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "library_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ResponseStreetView a(String responseString) {
            String statusString = new JSONObject(responseString).optString("status");
            Intrinsics.checkNotNullExpressionValue(statusString, "statusString");
            return new ResponseStreetView(Status.valueOf(statusString));
        }

        public static /* synthetic */ Object fetchStreetViewData$default(Companion companion, LatLng latLng, String str, Source source, Continuation continuation, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                source = Source.DEFAULT;
            }
            return companion.fetchStreetViewData(latLng, str, source, continuation);
        }

        @Nullable
        public final Object fetchStreetViewData(@NotNull LatLng latLng, @NotNull String str, @NotNull Source source, @NotNull Continuation continuation) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("https://maps.googleapis.com/maps/api/streetview/metadata");
            sb2.append("?location=" + latLng.latitude + ',' + latLng.longitude);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("&key=");
            sb3.append(str);
            sb2.append(sb3.toString());
            sb2.append("&source=" + source.getValue());
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return g.g(o0.b(), new StreetViewUtils$Companion$fetchStreetViewData$2(string, null), continuation);
        }

        private Companion() {
        }
    }
}
